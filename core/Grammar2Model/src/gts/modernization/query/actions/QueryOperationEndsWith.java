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
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;
import gts.modernization.model.Gra2MoL.Query.ExpressionElement;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.QueryContext;

/**
 * This class checks if the node ends with a specific string
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class QueryOperationEndsWith extends QueryOperationExtensionPoint {

	public QueryOperationEndsWith(Node node, FilterExpressionUnit filter, QueryContext context) {
		super(node, filter, context);
	}
	
	@Override
	public boolean perform() {
		boolean result = false;

		ExpressionElement element = filter.getElement(); 
		Leaf l1 = node.getLeaf(element.getName(), element.getPosition());		
		Parameter p = (Parameter) filter.getParameters().get(0);
		if(p != null && p.getType() == ParameterType.STRING_VALUE) {
			if(l1.getValue().toLowerCase().endsWith(p.getValue().toLowerCase())) {
				result = true;
			} else {
				result = false;
			}
		} else {
			Gra2MoLLogger.getInstance().append(" ENDS_WITH OP MUST BE USED WITH STRING VALUES");				
		}
		
		return result;
	}

	/**
	 * This methods specifies the keywords which identifies to the operation in the
	 * gra2mol transformation definition (e.g., new String[] { "eq", "equals" })
	 * @return An array containing the keywords
	 */
	public static  String[] keywords() {
		return new String[] { "endsWith" };
	}
}
