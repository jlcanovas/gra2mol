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
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.FilterOperationType;
import gts.modernization.model.Gra2MoL.Query.FilterType;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class traverses the CST to execute queries. It do not use the visitor pattern as a test to improve
 * the performance.
 * 
 * @author Javier Canovas
 *
 */
public class QueryCSTAdhoc implements QueryCST {
	/**
	 * The context of the query
	 */
	private QueryContext context;

	/**
	 * The query result
	 */
	List<Element> result;
	
	/**
	 * This list controls if a node has been found while searching by means of an indirect operator
	 */
	private List<Object> indirectControlPosition;

	/**
	 * This hashmap controls the ocurrences of recursive operator
	 */
	private HashMap<FilterUnit, Integer> recursiveOcurrences;

	private int debugDeep = 0;

	/**
	 * Query CST constructor. 
	 * 
	 * @param context The context of the query
	 */
	public QueryCSTAdhoc(QueryContext context) {
		this.result = new ArrayList<Element>();
		this.context = context;
		this.indirectControlPosition = new ArrayList<Object>();
		this.recursiveOcurrences = new HashMap<FilterUnit, Integer>();
	}

	/**
	 * Executes the query 
	 * 
	 * @param tree
	 */
	public void execute() {
		FilterUnit actualFilter = context.getFilter();
		Node actualNode = (Node) context.getTree();

		traverseNode(actualNode, actualFilter, null);
	}

	/**
	 * Traverses a node and its children.
	 * 
	 * @param entryNode Working node
	 * @param filter Actual Filter
	 * @param candidateElement Possible candidate node
	 */
	private void traverseNode(Node entryNode, FilterUnit filter, Node candidateElement) {
		debugDeep++;
		//message("Node: " + entryNode.getKind() + " filtro: " + printFilter(filter));

		// Kind of the entry node
		String nodeKind = entryNode.getKind();
		// Kind of node sets by the filter
		String nodeFilter = filter.getElement().getName();
		// The next filter, by now, it is the actual filter
		FilterUnit newFilter = filter;

		// The kind of the node is the same as the kind sets by the filter
		if(nodeKind.equals(nodeFilter)) {
			// The node is marked, it is stored in candidateElement variable 
			// (it will be used when the filter reaches the limit)
			if(filter.getElement().isMark()) {				
				candidateElement = entryNode;
			}			

			// Check if the filter has any boolean expression
			if(filter.getExpression() != null) {
				// Creates a new expression...
				Expression exp = new Expression(entryNode, filter.getExpression(), context);
				// ... and evaluates it
				boolean choosed = exp.evaluate();
				// If the expression is not satisfied, the candidateElement is removed
				// and the search is stopped
				if(!choosed) {
					candidateElement = null;
					return;
				}
			}	

			// Move on the filter
			if(filter.getOperation() == FilterOperationType.POSITION && filter.getType() == FilterType.RECURSIVE) {
				Integer ocurrences = recursiveOcurrences.get(filter);
				if(ocurrences == null) ocurrences = new Integer(0);

				if(filter.getPosition() == ocurrences) {
					newFilter = filter.getNext();
				} else {
					return;
				}

			} else {
				newFilter = filter.getNext();
			}
		}

		// The filter has reached the limit
		if(newFilter == null) {
			// If there is any candidate
			if(candidateElement != null) {
				// Checks if the candidate has been stored previously
				if(!result.contains(candidateElement)) {
					result.add(candidateElement);
				}
			}
		} 

		// Cases by depending on the operator type
		// DIRECT: nodekind == nodeFilter and newFilter != null
		// INDIRECT: newFilter != null
		// RECURSIVE: The same as INDIRECT
		if((nodeKind.equals(nodeFilter) && newFilter != null && filter.getType() == FilterType.DIRECT) 
				|| (newFilter != null && (filter.getType() == FilterType.INDIRECT || filter.getType() == FilterType.RECURSIVE))) {

			if(newFilter.getType() == FilterType.DIRECT && newFilter.getOperation() == FilterOperationType.POSITION) {
				// The filter sets a position and the filter is DIRECT, we only traverse such a node
				Node positionNode = entryNode.getNode(newFilter.getElement().getName(), newFilter.getPosition());
				if(positionNode != null) traverseNode(positionNode, newFilter, candidateElement);	
			} else if(newFilter.getType() == FilterType.INDIRECT 
					&& newFilter.getOperation() == FilterOperationType.POSITION 
					&& entryNode.getNode(newFilter.getElement().getName(), 0) != null) {
				// The filter sets a position and the filter is INDIRECT, we only traverse such a node
				// BUT only when there is not a previous node choosed by this filter (we use the indirectControlPosition variable)
				if(newFilter.getPosition() < entryNode.getChildren().size() && !indirectControlPosition.contains(newFilter)) {
					// Stores the filter to avoid chossing another node in this filter
					indirectControlPosition.add(newFilter);
					Node positionNode = entryNode.getNode(newFilter.getElement().getName(), newFilter.getPosition());
					if(positionNode != null) traverseNode(positionNode, newFilter, candidateElement);	
				}
			} else {
				// We traverse all the children of the entryNode...
				Iterator<Element> childs = entryNode.getChildren().iterator();
				while(childs.hasNext()) {
					Element elementNode = childs.next();
					if (elementNode instanceof Node) {
						Node childNode = (Node) elementNode;
						// ...and traverse them with the newFilter
						traverseNode(childNode, newFilter, candidateElement);					
					}
				}
			}
		}

		// Special Case: The recursive operator
		// If the kind of the entryNode is the same as the filter AND
		// the filterType is RECURSIVE, the traversal is executed again with the
		// actual filter (and not newFilter).
		if(nodeKind.equals(nodeFilter) && filter.getType() == FilterType.RECURSIVE) {
			Iterator<Element> childs = entryNode.getChildren().iterator();
			while(childs.hasNext()) {
				Element elementNode = childs.next();
				if (elementNode instanceof Node) {
					Node childNode = (Node) elementNode;
					// Traverse them with the actual Filter
					traverseNode(childNode, filter, candidateElement);				
				}
			}
		}

		debugDeep--;

	}	



	private String printFilter(FilterUnit filter) {
		String sol = "";
		FilterUnit actual = filter;

		while(actual != null) {
			if(actual.getType() == filter.getType().DIRECT) {
				sol += "/";
			} else if (actual.getType() == filter.getType().INDIRECT) {
				sol += "//";
			} else if (actual.getType() == filter.getType().RECURSIVE) {
				sol += "///";
			}
			if(actual.getElement().isMark()) sol += "#";
			sol += actual.getElement().getName();
			if(actual.getOperation() == FilterOperationType.POSITION) {
				sol += "[" + actual.getPosition() + "]";
			}

			actual = actual.getNext();
		}


		return sol;
	}

	private void message(String msg) {
		String result = "";		
		for(int i = 0; i < debugDeep; i++) result += "  ";
		result += msg;
		System.out.println(result);
	}
	
	public List<Element> getResult(){
		return result;
	}

}
