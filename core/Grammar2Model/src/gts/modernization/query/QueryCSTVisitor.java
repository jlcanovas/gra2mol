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

/**
 * This class is used to executed GVQ queries. It uses the visitor pattern to
 * execute the query.
 * 
 * @author Javier Canovas
 *
 */
public class QueryCSTVisitor implements CSTVisitor {
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
	private Element lastElement;
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
	
	private Node father;
	private Node unique;
	private Node lastNode;
	private int deep;

	private List<Node> cache;
	private boolean continueSeeking;
	private HashMap<String, HashMap<String, Node>> specificVisitedNodes;
	private HashMap<FilterUnit, Node> generalVisitedNodes;
	
	/**
	 * A query has associated a filter unit that filters the tree
	 * 
	 * @param filter
	 */
	public QueryCSTVisitor(FilterUnit filter) {
		this.filter = filter;
		this.actual = filter;
		this.previous = null;
		this.father = null;
		this.unique = null;
		this.lastNode = null;
		this.deep = 0;

		this.result = new ArrayList<Element>();
		this.cache = new ArrayList<Node>();
		this.continueSeeking = true;
		this.choosedElement = new HashMap<FilterUnit, Boolean>();
		this.specificVisitedNodes = new HashMap<String, HashMap<String,Node>>();
		this.generalVisitedNodes = new HashMap<FilterUnit, Node>();
	}

	/**
	 * Move on the filter pivot
	 */
	private void nextFilter(Element node) {
		if(this.actual != null) {
			this.previous = this.actual;
			FilterUnit next = this.actual.getNext();
			this.actual = next;

			if(this.actual == null) {
				this.lastElement = node;
			}
		} 

		if(this.actual == null) {
			boolean choosed = true;
			Iterator<FilterUnit> keys = choosedElement.keySet().iterator();
			while(keys.hasNext()) {
				FilterUnit key = keys.next();
				Boolean b = choosedElement.get(key);
				if(!(b.booleanValue())) choosed = false;
			}
			if(choosed) result.add(this.candidateElement);
			choosedElement = new HashMap<FilterUnit, Boolean>();
		}
	}

	/**
	 * Move back the filter pivot
	 */
	private void previousFilter(Element node) {
		if((this.actual != null) || (this.actual == null && lastElement == node)) {
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
			} 
		}
	}

	private boolean isSpecificMarkNode(Node node) {
		boolean result = false;
		HashMap<String, Node> vns = specificVisitedNodes.get(String.valueOf(deep));
		if(vns != null) {
			Node n = (Node) vns.get(node.getKind());
			if(n != null) result = true;
		}
		return result;
	}

	private void specificMarkNode(Node node) {
		HashMap<String, Node> vns = specificVisitedNodes.get(String.valueOf(deep));
		if(vns == null) {
			vns = new HashMap<String, Node>();
		}					
		vns.put(node.getKind(), node);
		specificVisitedNodes.put(String.valueOf(deep), vns);
	}

	private boolean isGeneralMarkNode(FilterUnit filter, Node actual) {
		boolean sol = false;
		Node node = generalVisitedNodes.get(filter);
		if(node != null) {
			if(node.getKind().equals(actual.getKind())) sol = true;
		}
		return sol;
	}

	private void generalMarkNode(FilterUnit filter, Node actual) {
		generalVisitedNodes.put(filter, actual);
	}
	
	private boolean testUniqueNode(Node node) {
		if(unique != null && unique.getKind().equals(node.getKind())) {
			return unique.deepEquals(node);
		} else {
			return false;
		}
	}

	public void startVisit(Node node) {

		
		System.out.println("StartVisit Node:" + node.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");
			
		
		boolean mark = isGeneralMarkNode(actual, node);
		boolean uniqueValue = testUniqueNode(node);
		
		if(continueSeeking && !mark && !uniqueValue && actual != null) {
//			System.out.println("Comparamos:" + node.getKind() + " con " + actual.getElement().getName());
			if(node.getKind().equals(actual.getElement().getName())) {
				if(actual.getElement().isMark()) {
					this.candidateElement = node;
				} 
				if(actual.getExpression() != null) {
					Expression exp = new Expression(node, actual.getExpression());
					boolean choosed = exp.evaluate();
					if(choosedElement.get(actual) == null)
						choosedElement.put(actual, choosed);
				}		
				if(actual.getOperation().compareTo(FilterOperationType.POSITION) == 0 && actual.getPosition() == 1) {
					generalMarkNode(actual, node);
				}
				
				if (actual.getElement().isMark() && actual.getOperation().compareTo(FilterOperationType.UNIQUE) == 0){
					this.unique = node;
				}
				cache.add(node);
				nextFilter(node);
			} else if (actual.getType() == FilterType.DIRECT) {
				this.continueSeeking = false;
				this.lastNode = node;
			} else if (actual.getType() == FilterType.INDIRECT) {
				this.continueSeeking = true;
			}
			this.father = node;
		}
		deep++;		


	}

	public void endVisit(Node node) {
//		System.out.println("EndVisit Node:" + node.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");
		if(continueSeeking) {
//			if(this.candidateElement == node) {
//			boolean choosed = true;
//			Iterator<FilterUnit> keys = choosedElement.keySet().iterator();
//			while(keys.hasNext()) {
//			FilterUnit key = keys.next();
//			Boolean b = choosedElement.get(key);
//			if(!(b.booleanValue())) choosed = false;
//			}
//			if(choosed) result.add(node);
//			choosedElement = new HashMap<FilterUnit, Boolean>();
//			}
			if(previous != null && node.getKind().equals(previous.getElement().getName())) {
				previousFilter(node);
			}
		}
		
		if(lastNode == node) {
			this.continueSeeking = true;
			this.lastNode = null;
		}
		deep--;
	}

	public void startVisit(Leaf leaf) {
		if(continueSeeking) {
//			System.out.println("StartVisit Leaf:" + leaf.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");

		}
	}

	public void endVisit(Leaf leaf) {
		if(continueSeeking) {
//			System.out.println("EndVisit Leaf:" + leaf.getKind() + " [" + ((previous == null) ? "null" : previous.getElement().getName()) + " - " + ((actual == null) ? "null" : actual.getElement().getName()) + "]");

		}
	}

	public List<Element> getResult(){
		return result;
	}


	public void startVisit(Element element) {
		if(continueSeeking) {

		}
	}

	public void endVisit(Element element) {
		if(continueSeeking) {

		}
	}

	public void startVisit(Tree tree) {
		if(continueSeeking) {

		}
	}

	public void endVisit(Tree tree) {
		if(continueSeeking) {

		}
	}
}
