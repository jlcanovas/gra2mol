/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


package gts.modernization.query;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.Tree;
import gts.modernization.model.CST.util.CSTVisitor;
import gts.modernization.model.Gra2MoL.Query.FilterOperationType;
import gts.modernization.model.Gra2MoL.Query.FilterType;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * This class is used to executed GVQ queries. It uses the visitor pattern to
 * execute the query.
 * 
 * @author Javier Canovas
 *
 */
public class QueryCSTVisitorThread implements CSTVisitor {
	/**
	 * Context of the Query
	 */
	private QueryContext context;
	/**
	 * Main filter of the query
	 */
	private FilterUnit filter;
	/**
	 * Previous FilterUnit
	 */
	private FilterUnit previous;
	/**
	 * Actual FilterUnit to analize
	 */
	private FilterUnit actual;
	/**
	 * Last Element analized once the actual pivot is null
	 */
	private Stack<Element> lastFilteredElements;
	/**
	 * Contains the boolean results of FilterUnit 
	 */
	private HashMap<FilterUnit, Boolean> choosedElement;
	/**
	 * Choosed elements in this query state 
	 */
	private List<Element> result;
	/**
	 * Candidate element located while the query is executed
	 */
	private Element candidateElement;
	/**
	 * Father of the node
	 */
	private Node father;
	/**
	 * Unique node
	 */
	private Node unique;
	/**
	 * Last visited node in specficic operator
	 */
	private Node lastVisitedNode;
	/**
	 * Deep in query
	 */
	private int deep;
	/**
	 * Indicate if the query continues
	 */
	private boolean continueSeeking;
	/**
	 * Use to count the node ocurrences in deep
	 */
	private HashMap<String, HashMap<String, Integer>> deepOcurrenceNodes;
	/**
	 * Use to count the node ocurrences in deep
	 */
	private HashMap<String, Integer> recursiveOcurrenceNodes;
	/**
	 * Multithread controller
	 */
	private QueryCSTVisitorMulti controller;
	/**
	 * Node that starts the query (Used in intermediate threads)
	 */
	private Node startNode;

	/**
	 * A query has associated a filter unit that filters the tree
	 * 
	 * @param controller Multithread controller
	 * @param filter Main filter of the query
	 */
	public QueryCSTVisitorThread(QueryCSTVisitorMulti controller, QueryContext context) {
		this.context = context;
		this.controller = controller;
		this.filter = context.getFilter();
		this.actual = context.getFilter();
		this.previous = null;
		this.father = null;
		this.unique = null;
		this.lastVisitedNode = null;
		this.startNode = null;
		this.deep = 0;
		this.lastFilteredElements = new Stack<Element>();

		this.result = new ArrayList<Element>();
		this.continueSeeking = true;
		this.choosedElement = new HashMap<FilterUnit, Boolean>();
		this.deepOcurrenceNodes = new HashMap<String, HashMap<String, Integer>>();
		this.recursiveOcurrenceNodes = new HashMap<String, Integer>();
	}

	public QueryCSTVisitorThread(QueryCSTVisitorMulti controller, QueryContext context, QueryCSTVisitorState state) {
		this.controller = controller;
		this.context = context;
		restoreState(state);
	}

	/**
	 * Move on the filter pivot
	 */
	private void nextFilter(Element node) {
		// First, check if the actual filter is the last
		if(this.actual != null) {
			this.previous = this.actual;
			FilterUnit next = this.actual.getNext();
			this.actual = next;
			this.lastFilteredElements.push(node);
		} 
		// If actual is null, we have reached the final of the filter and the node is a solution 
		// (if the candidate exists)
		if(this.actual == null && this.candidateElement != null) {
			boolean choosed = true;
			Iterator<FilterUnit> keys = choosedElement.keySet().iterator();
			while(keys.hasNext()) {
				FilterUnit key = keys.next();
				Boolean b = choosedElement.get(key);
				if(!(b.booleanValue())) choosed = false;
			}
			if(choosed) {
				result.add(this.candidateElement);
				this.candidateElement = null;
			}
			//choosedElement = new HashMap<FilterUnit, Boolean>();
		}
	}

	/**
	 * Move back the filter pivot
	 */
	private void previousFilter(Element node) {

		if(lastFilteredElements.peek() == node) {			
			// Or actual is not null and we can go on the filter
			// Or actual is null (final reached) and the node is the last node filtered 
			if((this.actual != null) || (this.actual == null && lastFilteredElements.peek() == node)) {
				if(this.previous != null) {
					if(filter == previous) {
						this.previous = null;
						this.actual = filter;
					}
					else {
						FilterUnit seek = filter;
						while(seek != null) {
							if(seek.getNext() == previous) {
								this.previous = seek;
								this.actual = seek.getNext();
								break;
							} else {
								seek = seek.getNext();
							}
						}
					}
					choosedElement.remove(actual);
				} 
				lastFilteredElements.pop();
			} 
		}
	}

	/**
	 * Checks if the node is equals (deep equal) to the unique Node
	 * 
	 * @param node Node to compare
	 * @return boolean
	 */
	private boolean testUniqueNode(Node node) {
		if(unique != null && unique.getKind().equals(node.getKind())) {
			return unique.deepEquals(node);
		} else {
			return false;
		}
	}

	/**
	 * Count the new ocurrence of the node. The ocurrences are stored indexed by deep
	 * 
	 * @param node Node to count the ocurrence
	 */
	private void newOcurrence(Node node) {
		HashMap<String, Integer> deepOcurrencesaux = deepOcurrenceNodes.get(String.valueOf(deep));
		if(deepOcurrencesaux == null) deepOcurrencesaux = new HashMap<String, Integer>();

		Integer nodeOcurrences = deepOcurrencesaux.get(node.getKind());
		if(nodeOcurrences == null) nodeOcurrences = new Integer(0);

		Integer newNodeOcurrences = new Integer(nodeOcurrences.intValue() + 1);

		deepOcurrencesaux.put(node.getKind(), newNodeOcurrences);
		deepOcurrenceNodes.put(String.valueOf(deep), deepOcurrencesaux);
	}

	/**
	 * Count the new ocurrence of the node in a recursive point of view.
	 * @param node
	 * @return
	 */
	private void newRecursiveOcurrence(Node node) {
		Integer ocurrences = recursiveOcurrenceNodes.get(node.getKind());
		if(ocurrences == null) ocurrences = new Integer(0);

		ocurrences = new Integer(ocurrences.intValue() + 1);
		recursiveOcurrenceNodes.put(node.getKind(), ocurrences);
	}

	/**
	 * Get the ocurrences of a node.
	 * @param node
	 * @return
	 */
	private int getOcurrences(Node node) {
		// If the filter is DIRECT or INDIRECT the ocurrences are based on the deep
		if(actual.getType() == FilterType.DIRECT || actual.getType() == FilterType.INDIRECT) {
			HashMap<String, Integer> deepOcurrences = deepOcurrenceNodes.get(String.valueOf(deep));
			if(deepOcurrences == null) return -1;

			Integer nodeOcurrences = deepOcurrences.get(node.getKind());
			if(nodeOcurrences == null) return -1;

			return nodeOcurrences.intValue();
		}
		// If the filter is RECURSIVE the ocurrences are based on the recursive
		else {
			Integer ocurrences = recursiveOcurrenceNodes.get(node.getKind());
			if(ocurrences == null) return -1;
			else return ocurrences.intValue();
		}
	}

	/**
	 * Clean the ocurrences at the deep
	 * @param deep Deep to clean
	 */
	private void cleanOcurrences(int deep) {
		deepOcurrenceNodes.put(String.valueOf(deep), new HashMap<String, Integer>());
	}

	public void startVisit(Node node) {
//		System.out.println("  Deep: " + deep + " StartVisit Node:" + node.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");

		int a = 0; a = a + 1;
		// Checks the unique node
		boolean uniqueValue = testUniqueNode(node);

		if(continueSeeking && !uniqueValue && actual != null) {
			//			System.out.println("Comparamos:" + node.getKind() + " con " + actual.getElement().getName());
			// The node fits with the node of the actual filter
			if(node.getKind().equals(actual.getElement().getName())) {

				// Count the ocurrente
				newOcurrence(node);
				if(actual.getType() == FilterType.RECURSIVE) newRecursiveOcurrence(node);

				// If the node has a POSITION operation, check it
				if(actual.getOperation().compareTo(FilterOperationType.POSITION) == 0 && getOcurrences(node) != (actual.getPosition() + 1)) {
					// The POSITION is not equals to ocurrences. Mark the node and block the search
					this.continueSeeking = false;
					this.lastVisitedNode = node;
				} else {
					// The node has not a POSITION operation or the POSITION is equals to ocurrences

					// If the node is marked, store it as candidate node
					if(actual.getElement().isMark()) {
						this.candidateElement = node;
					} 

					// If the actual filter unit has a boolean expression, execute it
					if(actual.getExpression() != null) {
						Expression exp = new Expression(node, actual.getExpression(), context);
						boolean choosed = exp.evaluate();
						if(choosedElement.get(actual) == null)
							choosedElement.put(actual, choosed);
					}		

					// The node is marked and it has the UNIQUE operation.
					// The node is store in unique variable
					if (actual.getElement().isMark() && actual.getOperation().compareTo(FilterOperationType.UNIQUE) == 0){
						this.unique = node;
					}

					// The query is RECURSIVE. Call to the controller to create other thread.
					// The thread is a copy of this thread, but it sets the startNode.
					// It is important to note that the thread is created BEFORE changing the filter pointers
					if(actual.getType() == FilterType.RECURSIVE || (actual.getType() == FilterType.RECURSIVE && actual.getOperation().compareTo(FilterOperationType.POSITION) == 0 && getOcurrences(node) != (actual.getPosition() + 1))) {
						//						System.out.println(" " + getOcurrences(node) + " - " + (actual.getPosition() + 1) + " Creado hilo en " + controller.getContext().getRule().getName());
						controller.createQueryCSTVisitor(createState(node));
					}

					// Move on the filter
					nextFilter(node);
				}
			} else if (actual.getType() == FilterType.DIRECT) {
				// The node is not equal to the node of the actual filter and the filter type is DIRECT
				// The search is stopped until the endVisit of the lastVisitedNode
				this.continueSeeking = false;
				this.lastVisitedNode = node;
			} else if (actual.getType() == FilterType.INDIRECT || actual.getType() == FilterType.RECURSIVE) {
				// The node is not equal to the node of the actual filter and the filter type is INDIRECT or RECURSIVE
				// The search continues
				this.continueSeeking = true;
			}
			this.father = node;
		}
		deep++;		
	}

	public void endVisit(Node node) {
//		System.out.println("  EndVisit Node:" + node.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");

		// The startNode is initialized (this is a thread query) 
		// and it is equal to the parametrized node.
		// The search have to be stopped
		if(startNode != null && startNode == node) {
			continueSeeking = false;
		}

		if(continueSeeking) {
			// If the continueSeeking is activated and the kind of the actual node is equals
			// to the previous element, we can invoke previousFilter.
			if(previous != null && node.getKind().equals(previous.getElement().getName())) {
				previousFilter(node);
			}
		}

		// If the lastVisitedNode is equals to actual node, we can reactivate the search 
		// This case is caused by the DIRECT operator in startVisit
		if(lastVisitedNode == node) {
			this.continueSeeking = true;
			this.lastVisitedNode = null;
		}

		// Clean ocurrences of this deep and decrease it
		cleanOcurrences(deep);
		deep--;
	}

	/**
	 * Return the found elements
	 * @return List of elements
	 */
	public List<Element> getResult(){
		return result;
	}

	/**
	 * Creates a new state object from the data of the visitor
	 * @param node Actual node
	 * @return
	 */
	public QueryCSTVisitorState createState(Node node) {
		return new QueryCSTVisitorState(filter, previous, actual, lastFilteredElements, candidateElement, lastVisitedNode, node, father, unique, deep, recursiveOcurrenceNodes);
	}

	/**
	 * Restores the state of the visitor
	 * @param state
	 */
	public void restoreState(QueryCSTVisitorState state) {
		this.filter = state.getFilter();
		this.actual = state.getActual();
		this.previous = state.getPrevious();
		this.lastFilteredElements = state.getLastFilteredElements();
		this.candidateElement = state.getCandidateElement();

		this.father = state.getFather();
		this.unique = state.getUnique();
		this.lastVisitedNode = state.getLastVisitedNode();
		this.startNode = state.getStartNode();
		this.deep = state.getDeep();

		this.result = new ArrayList<Element>();
		this.continueSeeking = true;
		this.choosedElement = new HashMap<FilterUnit, Boolean>();
		this.deepOcurrenceNodes = new HashMap<String, HashMap<String, Integer>>();
		this.recursiveOcurrenceNodes = state.getRecursiveOcurrenceNodes();
	}

	public void startVisit(Leaf leaf) { }
	public void endVisit(Leaf leaf) { }
	public void startVisit(Element element) { }
	public void endVisit(Element element) { }
	public void startVisit(Tree tree) { }
	public void endVisit(Tree tree) { }
}
