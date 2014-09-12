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
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;

import java.util.HashMap;
import java.util.List;

/**
 * This class stores the information which is necessary to execute a query
 * @author jlcanovas
 *
 */
public class QueryContext {
	/**
	 * The tree node where the query is executed
	 */
	private Element tree;	
	/**
	 * The query filter
	 */
	private FilterUnit filter;
	/**
	 * The query that is being executed
	 */
	private QueryUnit query;
	/**
	 * Rule asociated to the query
	 */
	private Rule rule;
	/**
	 * History of executed rules
	 */
	private HashMap<String, List<Element>> queryHistory;
	/**
	 * History of variables
	 */
	private HashMap<String, Object> variablesHistory;
	
	/**
	 * @deprecated
	 */
	public QueryContext(Element tree, FilterUnit filter, Rule rule) {
		this.tree = tree;
		this.query = null;
		this.filter = filter;
		this.rule = rule;
		this.queryHistory = null;
		this.variablesHistory = null;
	}
	
	public QueryContext(Element tree, QueryUnit query, Rule rule, HashMap<String, List<Element>> history) {
		this.tree = tree;
		this.query = query;
		this.rule = rule;
		this.queryHistory = history;
		this.variablesHistory = new HashMap<String, Object>();
	}

	public Element getTree() {
		return tree;
	}

	public void setTree(Element tree) {
		this.tree = tree;
	}

	public String getCasting() {
		if(this.query == null) return null;
		else return query.getCast();
	}

	public void setCasting(String casting) {
		if(this.query != null) this.query.setCast(casting);
	}

	public FilterUnit getFilter() {
		if(this.query == null) return this.filter;
		else return query.getFilter();
	}

	public void setFilter(FilterUnit filter) {
		if(this.query == null) this.filter = filter;
		this.query.setFilter(filter);
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public HashMap<String, List<Element>> getQueryHistory() {
		return queryHistory;
	}

	public void setQueryHistory(HashMap<String, List<Element>> queryHistory) {
		this.queryHistory = queryHistory;
	}

	public QueryUnit getQuery() {
		return query;
	}

	public void setQuery(QueryUnit query) {
		this.query = query;
	}

	public HashMap<String, Object> getVariablesHistory() {
		return variablesHistory;
	}

	public void setVariablesHistory(HashMap<String, Object> variablesHistory) {
		this.variablesHistory = variablesHistory;
	}	
}
