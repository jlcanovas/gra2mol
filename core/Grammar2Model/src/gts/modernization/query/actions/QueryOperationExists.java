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

import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.ExpressionElement;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.QueryContext;

public class QueryOperationExists extends QueryOperationExtensionPoint {

	public QueryOperationExists(Node node, FilterExpressionUnit filter, QueryContext context) {
		super(node, filter, context);
	}
	
	@Override
	public boolean perform() {
		boolean result = false;
		
		ExpressionElement element = filter.getElement(); 
		
		Leaf l2 = node.getLeaf(element.getName(), element.getPosition());
		if(l2 != null) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}


	/**
	 * This methods specifies the keywords which identifies to the operation in the
	 * gra2mol transformation definition (e.g., new String[] { "eq", "equals" })
	 * @return An array containing the keywords
	 */
	public static String[] keywords() {
		return new String[] { "exists" };
	}
}
