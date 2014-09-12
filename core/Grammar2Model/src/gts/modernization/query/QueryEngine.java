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

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.MixinRule;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.model.Gra2MoL.Query.FilterOperationType;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class executes rule queries. The main purpose is to work with the full query region. But
 * it can work only with one rule if you want. This query engine encapsulate the access to gra2mol query 
 * infrastructure.
 * 
 * @author Javier Canovas
 *
 */
public class QueryEngine {	
	private Element cst; 
	private QueryCache cache;

	private class QueryCache {
		private HashMap<Rule, HashMap<String, List<Element>>> cache;		

		QueryCache() {
			cache = new HashMap<Rule, HashMap<String,List<Element>>>();
		}

		void put(Rule rule, String variable, List<Element> queryResult) {
			// Checks the existence of an entry for such a rule
			HashMap<String,List<Element>> entry = cache.get(rule);
			if(entry == null) 
				entry = new HashMap<String,List<Element>>();
			// Store the result (overwrite)
			entry.put(variable, queryResult);			
			cache.put(rule, entry);
		}

		HashMap<String,List<Element>> get(Rule rule) {
			return cache.get(rule);
		}

		List<Element> getQueryResult(Rule rule, String variable) {
			// Checks the existence of an entry for such a rule
			HashMap<String,List<Element>> entry = cache.get(rule);
			if(entry == null) return null;
			// Extracts the restul for such a queryUnit
			List<Element> queryResult = entry.get(variable);
			return queryResult;
		}
	}


	/**
	 * @param cst Concrete Syntax Tree model
	 */
	public QueryEngine(Element cst) {
		this.cst = cst;
		this.cache = new QueryCache();
	}

	/**
	 * Executes all the queries contained in query region
	 * @param rule The rule which contains the query region
	 * @return Hashmap with the variable name query as key and the result list as content.
	 */
	public HashMap<String, List<Element>> executeQueryRegion(Rule rule, Element ruleNode) {
		// Initialize the history with the node asociated to the rule
		HashMap<String, List<Element>> queries = initializeHistory(rule, ruleNode);

		Iterator<QueryUnit> queryIt = rule.getQueries().iterator();
		while(queryIt.hasNext()) {
			QueryUnit query = queryIt.next();
			List<Element> rquery = prepareQueryExecution(rule, query, queries);
			queries.put(query.getVariable(), rquery);
		}
		return queries;
	}

	/**
	 * Initialize the history with the node asociated to the rule
	 * @param rule
	 * @param ruleNode
	 * @return
	 */
	private HashMap<String, List<Element>> initializeHistory(Rule rule, Element ruleNode) {
		HashMap<String, List<Element>> history = new HashMap<String, List<Element>>();

		// If the rule has from, we store the node of the from part in the history
		if (rule instanceof StandardRule ) {
			StandardRule srule = (StandardRule) rule;
			List<Element> fromNodes = new ArrayList<Element>();
			fromNodes.add(ruleNode);
			history.put(srule.getFrom().getAlias(), fromNodes);			
		} else if (rule instanceof MixinRule ) {
			List<Element> fromNodes = new ArrayList<Element>();
			fromNodes.add(ruleNode);
			history.put("fromNode", fromNodes);			
		} 

		return history;
	}


	/**
	 * Executes one of the rule queries considering the query history;
	 * @param query
	 * @param history
	 * @return
	 */
	private List<Element> prepareQueryExecution(Rule rule, QueryUnit query, HashMap<String, List<Element>> history) {
		FilterUnit filter = query.getFilter();
		String firstName = filter.getElement().getName();

		String replacePre = null;
		String replacePost = null;
		Element pivotNode = null;

		List<Element> rquery = null;

		if ((history != null) && (history.get(firstName) != null)) {
			// A previous query or alias is used
			List<Element> hquery = history.get(firstName);
			if(hquery.size() > 0) {
				List<Element> historyAccess = new ArrayList<Element>();

				// The previous query is not empty 
				if (filter.getOperation() != null && filter.getOperation() == FilterOperationType.POSITION) {
					// The query has a position
					if(filter.getPosition() == -1) {
						// The last position
						historyAccess.add(hquery.get(hquery.size()-1));
					} else {
						// The position specified
						historyAccess.add(hquery.get(filter.getPosition()));
					}
				} else {
					// The query no have a position
					historyAccess = hquery;					
				}

				// Executes each history node
				for(int i = 0; i < hquery.size(); i++) {
					Element e = hquery.get(i);
					if (e instanceof Node) {
						Node foundNode = (Node) e;
						replacePre = foundNode.getKind();
						replacePost = firstName;
						pivotNode = foundNode;
						List<Element> parcialSol = executeQuery(rule, query, replacePre, replacePost, pivotNode, true, history);
						if(parcialSol != null) {
							if(rquery == null) rquery = new ArrayList<Element>();
							rquery.addAll(parcialSol);
						}
					}			
				}

			} else {
				// The previous query is empty
				replacePre = null;
				replacePost = null;
				pivotNode = null;		

				rquery = executeQuery(rule, query, replacePre, replacePost, pivotNode, false, history);
			}
		} else {
			// Normal query. No alias. No history.
			replacePre = null;
			replacePost = null;
			pivotNode = cst;

			rquery = executeQuery(rule, query, replacePre, replacePost, pivotNode, false, history);
		}

		return rquery;				
	}

	/**
	 * Executes one of the rule queries.
	 * @param query
	 * @return
	 */
	public List<Element> executeQuery(Rule rule, Element ruleNode, QueryUnit query) {
		HashMap<String, List<Element>> queries = initializeHistory(rule, ruleNode);
		return prepareQueryExecution(rule, query, queries);
	}

	private List<Element> executeQuery(Rule rule, QueryUnit query, String replacePre, String replacePost, Element pivotNode, boolean initPosition, HashMap<String, List<Element>> history) {
		FilterUnit filter = query.getFilter();
		List<Element> rquery = null;
		int previousPosition = filter.getPosition();

		// Execute the query 
		if(replacePre != null) filter.getElement().setName(replacePre);
		if(initPosition) filter.setPosition(0);

		QueryContext context = new QueryContext(pivotNode, query, rule, history);
		Query q = new Query(context);
		rquery = q.execute();

		if(replacePost != null) filter.getElement().setName(replacePost);
		if(initPosition) filter.setPosition(previousPosition);

		return rquery;
	}

	/**
	 * Executes the constraint (from filter) of the rule
	 * This method only can be called with Standard rules
	 * @param rule
	 * @param ruleNode
	 * @return
	 */
	public boolean executeRuleConstraint(Rule rule, Element ruleNode) {
		if (rule instanceof StandardRule) {
			StandardRule sRule = (StandardRule) rule;

			List<Element> rquery = null;
			if(sRule.getFrom().getFilter().isAbsoluteQuery()) {
				// Checking cache
				HashMap<String, List<Element>> cacheElems = cache.get(sRule);
				if(cacheElems != null)
					rquery = cacheElems.get(sRule.getFrom().getAlias());
				if(rquery == null) {
					// It has not been cached previously
					// Preparing a list for knowing the rule variables
					List<String> variables = new ArrayList<String>();
					for(QueryUnit qUnit : sRule.getQueries())
						variables.add(qUnit.getVariable());
					// Initializing the history
					HashMap<String, List<Element>> history = new HashMap<String, List<Element>>();
					// Executing the query recusively
					executeRecursiveQuery(sRule, sRule.getFrom().getFilter(), variables, history);
					// Obtaining the result
					rquery = history.get(sRule.getFrom().getAlias());
					// Updateing cache
					cache.put(sRule, sRule.getFrom().getAlias(), rquery);
				}
			} else {
				// Executing the from filter
				QueryContext context = new QueryContext(ruleNode, sRule.getFrom().getFilter(), sRule, null);
				Query q = new Query(context);			
				// From filter execution
				rquery = q.execute();
			}

			// Checking the results...	
			if(rquery.size() > 0)  {
				if(sRule.getFrom().getFilter().isAbsoluteQuery()) {
					return rquery.contains(ruleNode);
				} else
					return true;
			}
			return false;			
		} else {
			Gra2MoLLogger.getInstance().print("Trying to execute the from filter in a no standard rule!");
			return false;
		}
	}

	/**
	 * Executes a query and checks if the first filterUnit uses a variable. If so, it executes
	 * the referenced rule (recursive call). 
	 * @param rule The rule which contains the rules
	 * @param queryUnit The query to be executed
	 * @param variables variables defined in the queries part (it is done in this way for optimization purposes)
	 * @param history
	 */
	public void executeRecursiveQuery(Rule rule, QueryUnit queryUnit, List<String> variables, HashMap<String, List<Element>> history) {
		String firstFilter = queryUnit.getFilter().getElement().getName();
		if(variables.contains(firstFilter)) {
			executeRecursiveQuery(rule, rule.getQuery(firstFilter), variables, history);
			List<Element> rquery = prepareQueryExecution(rule, queryUnit, history);
			history.put(queryUnit.getVariable(), rquery);
		} else {
			QueryContext context = new QueryContext(cst, queryUnit, rule, history);
			Query q = new Query(context);	
			List<Element> rquery = q.execute();
			history.put(queryUnit.getVariable(), rquery);
		}
	}
}
