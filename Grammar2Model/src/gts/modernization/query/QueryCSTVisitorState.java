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
import gts.modernization.model.Gra2MoL.Query.FilterUnit;

import java.util.HashMap;
import java.util.Stack;

public class QueryCSTVisitorState {
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
	 * Candidate element located while the query is executed
	 */
	private Element candidateElement;
	/**
	 * Last visited node in specficic operator
	 */
	private Node lastVisitedNode;
	/**
	 * Node that starts the query (Used in intermediate threads)
	 */
	private Node startNode; 
	/**
	 * Father of the node
	 */
	private Node father; 
	/**
	 * Unique node
	 */
	private Node unique;
	/**
	 * Deep in query
	 */
	private int deep;	/**
	 * Use to count the node ocurrences in deep
	 */
	private HashMap<String, Integer> recursiveOcurrenceNodes;
		
	public QueryCSTVisitorState(FilterUnit filter,
			FilterUnit previous, FilterUnit actual, Stack<Element> lastFilteredElements,
			Element candidateElement, Node lastVisitedNode, Node startNode,
			Node father, Node unique, int deep, HashMap<String, Integer> recursiveOcurrenceNodes) {
		super();
		this.filter = filter;
		this.previous = previous;
		this.actual = actual;
		this.lastFilteredElements = new Stack<Element>();
		this.lastFilteredElements.addAll(lastFilteredElements);
		this.candidateElement = candidateElement;
		this.lastVisitedNode = lastVisitedNode;
		this.startNode = startNode;
		this.father = father;
		this.unique = unique;
		this.deep = deep;
		this.recursiveOcurrenceNodes = recursiveOcurrenceNodes;
	}

	public FilterUnit getFilter() {
		return filter;
	}
	public void setFilter(FilterUnit filter) {
		this.filter = filter;
	}
	public FilterUnit getPrevious() {
		return previous;
	}
	public void setPrevious(FilterUnit previous) {
		this.previous = previous;
	}
	public FilterUnit getActual() {
		return actual;
	}
	public void setActual(FilterUnit actual) {
		this.actual = actual;
	}
	public Stack<Element> getLastFilteredElements() {
		return this.lastFilteredElements;
	}
	public void setLastElement(Stack<Element> lastFilteredElements) {
		this.lastFilteredElements = lastFilteredElements;
	}
	public Element getCandidateElement() {
		return candidateElement;
	}
	public void setCandidateElement(Element candidateElement) {
		this.candidateElement = candidateElement;
	}
	public Node getLastVisitedNode() {
		return lastVisitedNode;
	}
	public void setLastVisitedNode(Node lastVisitedNode) {
		this.lastVisitedNode = lastVisitedNode;
	}
	public Node getStartNode() {
		return startNode;
	}
	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}
	public Node getFather() {
		return father;
	}
	public void setFather(Node father) {
		this.father = father;
	}
	public Node getUnique() {
		return unique;
	}
	public void setUnique(Node unique) {
		this.unique = unique;
	}
	public int getDeep() {
		return deep;
	}
	public void setDeep(int deep) {
		this.deep = deep;
	}

	public HashMap<String, Integer> getRecursiveOcurrenceNodes() {
		return recursiveOcurrenceNodes;
	}

	public void setRecursiveOcurrenceNodes(
			HashMap<String, Integer> recursiveOcurrenceNodes) {
		this.recursiveOcurrenceNodes = recursiveOcurrenceNodes;
	}
	
	
	
	
	
}
