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

public class QueryOperationCheck extends QueryOperationExtensionPoint {

	public QueryOperationCheck(Node node, FilterExpressionUnit filter, QueryContext context) {
		super(node, filter, context);
	}
	
	@Override
	public boolean perform() {
		ExpressionElement element = filter.getElement(); 
		
		Element e1 = null;
		Element e2 = null;

		// First Element to compare
		if(element.getName().equals("this")) e1 = node;
		else {
			List<Element> var = context.getQueryHistory().get(element.getName());
			if(var != null) {
				if(var.size() > 1) {
					Gra2MoLLogger.getInstance().append(" MORE THAN 1 RESULT IN CHECK EXPRESION!!");
				} else {
					e1 = var.get(0);
				}
			}
		}

		// Second Element to compare
		Parameter p = (Parameter) filter.getParameters().get(0);
		List<Element> var = context.getQueryHistory().get(p.getValue());
		if(var != null) {
			if(var.size() > 1) {
				Gra2MoLLogger.getInstance().append(" MORE THAN 1 RESULT IN PARAMETER OF CHECK EXPRESSION!!");
			} else {
				e2 = var.get(0);					
			}
		}

		if(e1 != null && e2 != null && e1 == e2) {
			return true;
		} else {
			return false;
		}	
	}

	/**
	 * This methods specifies the keywords which identifies to the operation in the
	 * gra2mol transformation definition (e.g., new String[] { "eq", "equals" })
	 * @return An array containing the keywords
	 */
	public static String[] keywords() {
		return new String[] { "check" };
	}

	
}
