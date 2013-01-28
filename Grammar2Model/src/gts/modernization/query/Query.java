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

import gts.modernization.extension.QueryControlExtensionFactory;
import gts.modernization.extension.QueryControlExtensionPoint;
import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.QueryControl;
import gts.modernization.model.Gra2MoL.Query.QueryControlExtension;
import gts.modernization.model.Gra2MoL.Query.QueryControlFor;
import gts.modernization.model.Gra2MoL.Query.QueryControlGreater;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.query.QueryCSTFactory.QueryCSTType;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class represents a query. 
 * @author Javier Canovas
 *
 */
public class Query {
	private Element tree;
	private String cast;
	private FilterUnit filter;
	private QueryContext context;

	/**
	 * @deprecated
	 */
	public Query(Element tree, String cast, FilterUnit filter) {
		this.tree = tree;
		this.cast = cast;
		this.filter = filter;
	}

	/**
	 * @deprecated
	 */
	public Query(Element tree, FilterUnit filter) {
		this.tree = tree;
		this.cast = null;
		this.filter = filter;
	}

	/**
	 * @deprecated
	 */
	public Query(HashMap<String, Object> context) {
		this.tree = tree;
		this.cast = null;
		this.filter = filter;
	}

	public Query(QueryContext context) {
		this.tree = context.getTree();
		this.cast = context.getCasting();
		this.filter = context.getFilter();		
		this.context = context;
	}

	/**
	 * Executes the query and returns the list of found nodes
	 * @return
	 */
	public List<Element> execute() {
		if(tree != null) {	
			if(this.context.getQuery() == null) return executeNormal();
			else return executeRegion();
		} else {
			return new ArrayList<Element>();
		}
	}

	/**
	 * Executes the query region element and returns the list of found nodes
	 * @return
	 */
	private List<Element> executeRegion() {			
		QueryUnit qu = this.context.getQuery();
		QueryControl qc = qu.getControl();
		if (qc instanceof QueryControlFor) {
			return executeFor();				
		} else if (qc instanceof QueryControlGreater){  
			return executeGreater();
		} else if (qc instanceof QueryControlExtension) {
			return executeExtension();
		} else {
			return executeNormal();
		}			
	}

	private List<Element> executeExtension() {
		List<Element> result = new ArrayList<Element>();
		QueryUnit qu = this.context.getQuery();
		QueryControlExtension qce = (QueryControlExtension) qu.getControl();

		String extensionString = qce.getOperation();
		Method preprocess = null;
		Method postprocess = null;	
		Object extensionClassInstance = null;
		try {
			// Creates the class dinamycally
			extensionClassInstance = QueryControlExtensionFactory.getInstance().getQueryControlExtension(extensionString);

			// Sets the params
			Method methodSetParams = extensionClassInstance.getClass().getMethod("setParams", java.util.List.class);				
			methodSetParams.invoke(extensionClassInstance, (List<Parameter>) qce.getParams());

			// Sets the query context
			Method methodSetContext = extensionClassInstance.getClass().getMethod("setContext", QueryContext.class);				
			methodSetContext.invoke(extensionClassInstance, (QueryContext) context);

			// Extracts the execute method
			preprocess = extensionClassInstance.getClass().getMethod("preprocess", null);	
			postprocess = extensionClassInstance.getClass().getMethod("postprocess", java.util.List.class);				
		} catch (Exception e) {
			Gra2MoLLogger.getInstance().print("Error obtaining the extension query control " + extensionString);
		}

		if(preprocess != null && postprocess != null && extensionClassInstance != null) {
			// Execution the control query extension
			try {
				preprocess.invoke(extensionClassInstance, null);
				List<Element> partialResult = executeNormal();
				result = (List<Element>) postprocess.invoke(extensionClassInstance, partialResult);
			} catch (Exception e) {
				Gra2MoLLogger.getInstance().print("Error executing the extension query control " + extensionString);
			}
		} 
		
		return result;
	}

	private List<Element> executeFor() {
		QueryUnit qu = this.context.getQuery();
		QueryControlFor qcf = (QueryControlFor) qu.getControl();

		List<Element> result = new ArrayList<Element>();
		List<Element> nodeSet = context.getQueryHistory().get(qcf.getQueryVariable());
		if(nodeSet != null) {
			for(int i = 0; i < nodeSet.size(); i++) {
				context.getVariablesHistory().put(qcf.getVariable(), new Integer(i));
				List<Element> partialResult = executeNormal();
				result.addAll(partialResult);				
			}
		}

		return result;
	}

	private List<Element> executeGreater() {
		QueryUnit qu = this.context.getQuery();
		QueryControlGreater qcf = (QueryControlGreater) qu.getControl();

		List<Element> partialResult = executeNormal();
		Iterator<Element> partialIt = partialResult.iterator();

		long max = 0;
		long longValue = 0;
		List<Element> result = new ArrayList<Element>();

		while(partialIt.hasNext()) {
			Element e = partialIt.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				Node selectedNode = n.getNode(qcf.getNodeId(), qcf.getNodePosition());
				if(selectedNode != null) {
					Leaf leaf = selectedNode.getLeaf(qcf.getVariable(), 0);
					longValue = Long.valueOf(convertHexToString(leaf.getValue()));
					if(longValue > max) {
						max = longValue;
						result = new ArrayList<Element>();
						result.add(n);
					}
				}
			}
		}

		return result;
	}

	private String convertHexToString(String data) {
		int index = data.indexOf("x");
		if(index > 0) {
			data = data.substring(index+1, data.length());
		}

		index = data.indexOf("X");
		if(index > 0) {
			data = data.substring(index+1, data.length());
		}

		byte[] bytes = new byte[data.length() / 2];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Integer.parseInt(data.substring(2 * i, 2 * i + 2), 16);
		}

		return new String(bytes);
	}


	private List<Element> executeNormal() {
		// Create the visitor
		QueryCST visitor = QueryCSTFactory.createQueryCST(context, QueryCSTType.ADHOC);
		visitor.execute();

		// If there is a casting
		if(cast != null && !cast.equals("")) {
			List<Element> newResult = new ArrayList<Element>();
			Iterator<Element> it = visitor.getResult().iterator();
			while(it.hasNext()) {
				Element e = it.next();
				if (e instanceof Node) {
					Node n = (Node) e;
					n.setKind(cast);					
					newResult.add(n);
				}
			}
			return newResult;				
		} else {
			return visitor.getResult();
		}
	}

	private String printFilter() {
		String sol = "";
		FilterUnit actual = filter;

		while(actual != null) {
			if(actual.getType() == filter.getType().DIRECT) {
				sol += "/";
			} else if (actual.getType() == filter.getType().INDIRECT) {
				sol += "//";
			}
			if(actual.getElement().isMark()) sol += "#";
			sol += actual.getElement().getName();
			actual = actual.getNext();
		}


		return sol;
	}
}
