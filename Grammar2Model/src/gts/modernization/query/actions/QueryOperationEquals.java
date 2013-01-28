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


package gts.modernization.query.actions;

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Query.ExpressionElement;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.QueryContext;

import java.util.List;

/**
 * Performs a equals operation in a query
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class QueryOperationEquals extends QueryOperationExtensionPoint {

	public QueryOperationEquals(Node node, FilterExpressionUnit filter, QueryContext context) {
		super(node, filter, context);
	}
	
	@Override
	public boolean perform() {
		boolean result = false;
		
		ExpressionElement element = filter.getElement(); 
		
		Leaf l1 = node.getLeaf(element.getName(), element.getPosition());
		if(l1 != null) {
			// If the parameter has an extension, it is an access to a previous result query
			if(((Parameter) filter.getParameters().get(0)).getExtension() != null) {
				// Extract the parameter from history
				Parameter p = (Parameter) filter.getParameters().get(0);
				List<Element> var = context.getQueryHistory().get(p.getValue());

				if(var != null) {						
					// Extract the position to extract
					int paramPosition = evaluatePosition(p.getValuePosition());
					if(var.size() == 0) {
						Gra2MoLLogger.getInstance().append(" NO RESULT IN PARAMETER OF EQ EXPRESSION!!");
					} else if(paramPosition > var.size()) {							
						Gra2MoLLogger.getInstance().append(" ERROR IN PARAMETER OF EQ EXPRESSION!!");
					} else {
						Node n = (Node) var.get(paramPosition); 
						Leaf l2 = n.getLeaf(p.getExtension(), evaluatePosition(p.getExtensionPosition()));
						if(l2 != null) {
							if(l1.getValue().toLowerCase().equals(l2.getValue().toLowerCase())){
								result = true;
							} else {
								result = false;
							}
						}
					} 
				}
			} else {
				Parameter p = (Parameter) filter.getParameters().get(0);
				if(p != null && l1.getValue().toLowerCase().equals(p.getValue().toLowerCase())) {
					result = true;
				} else {
					result = false;
				}
			}
		}			
		return result;
	}

	/**
	 * This methods specifies the keywords which identifies to the operation in the
	 * gra2mol transformation definition (e.g., new String[] { "eq", "equals" })
	 * @return An array containing the keywords
	 */
	public static String[] keywords() {
		return new String[] { "eq", "equals" };
	}
}
