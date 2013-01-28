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

import gts.modernization.extension.QueryExtensionPoint;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.QueryContext;

/**
 * The objective of this class is ease the definition of new query operators.
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class QueryOperationExtensionPoint extends QueryExtensionPoint {
	/**
	 * The node to which the expression will be executed
	 */
	Node node;
	/**
	 * The filter to be applied
	 */
	FilterExpressionUnit filter;
	
	public QueryOperationExtensionPoint(Node node, FilterExpressionUnit filter, QueryContext context) {
		this.node = node;
		this.filter = filter;
		setContext(context);
		setParams(filter.getParameters());
		setQueries(context.getQueryHistory());
	}
	
	// Utility methods
	/**
	 * Given as string position, digest the integer position (it takes into account the "last" keyword)
	 * @param position The string indicating the position
	 * @return The digested integer position
	 */
	int evaluatePosition(String position) {
		int result=0;
		
		Object hvar = context.getVariablesHistory().get(position);
		if(position.equals("last")){
			result = -1;			
		} else if(hvar != null) {
			if (hvar instanceof Integer) {
				Integer value = (Integer) hvar;
				result = value.intValue();
			}
		} else {
			result = Integer.parseInt(position);
		}
		
		return result;
	}
	
	// Abstract methods
	/**
	 * This method executes the operation.
	 * @return A boolean value indicating if the node is selected
	 */
	public abstract boolean perform();
	
}
