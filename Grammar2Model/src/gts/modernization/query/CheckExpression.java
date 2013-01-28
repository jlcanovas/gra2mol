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

import gts.modernization.extension.QueryOperationFactory;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.FilterExpression;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionType;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.actions.QueryOperationEquals;
import gts.modernization.query.actions.QueryOperationExtensionPoint;

import java.util.Iterator;

/**
 * This class evaluates the filter expression asociated to the nodes of a query. Also it
 * evaluates the expression of the conditional sentences.
 * 
 * @author Javier Canovas
 *
 */
public class CheckExpression {
	private Node node;
	private FilterExpression expression;
	private boolean lastChoosed;
	private QueryContext context;

	/**
	 * Creates a new CheckExpression
	 * @param node Node asociated to the FilterExpression
	 * @param expression FilterExpression element
	 * @param context Context of the node
	 */
	public CheckExpression(Node node, FilterExpression expression, QueryContext context) {
		this.node = node;
		this.expression = expression;
		this.lastChoosed = false;
		this.context = context;
	}

	/**
	 * @deprecated
	 */
	public CheckExpression(Node node, FilterExpression expression, boolean lastChoosed) {
		this.node = node;
		this.expression = expression;
		this.lastChoosed = lastChoosed;
	}

	/**
	 * Evaluates the expression asociated to the node
	 * @return
	 */
	public boolean evaluate() {
		return checkExpression(this.node, this.expression);
	}

	/**
	 * Checks the expression asociated to a node. It discriminates the type of the 
	 * FilterExpression
	 * @param node Node asociated to the FilterExpression
	 * @param expression FilterExpression
	 * @return
	 */
	private boolean checkExpression(Node node, FilterExpression expression) {
		if (expression instanceof FilterExpressionUnit) {
			return checkExpressionUnit(node, (FilterExpressionUnit) expression);
		} else if (expression instanceof FilterExpressionComplex) {
			return checkExpressionComplex(node, (FilterExpressionComplex) expression);
		}
		return false;
	}

	/**
	 * Checks a FilterExpression complex
	 * @param node Node asociated to the FilterExpression
	 * @param filter FilterExpression complex
	 * @return
	 */
	private boolean checkExpressionComplex(Node node, FilterExpressionComplex filter) {
		boolean result = true;

		if(filter.getType() == FilterExpressionType.AND) {
			// AND Operator
			Iterator<FilterExpression> it = filter.getExpressions().iterator();
			while(it.hasNext()) {
				FilterExpression fe = (FilterExpression) it.next();
				result = result && checkExpression(node, fe);
			} 
		} else if(filter.getType() == FilterExpressionType.OR) {
			// OR operator
			result = false;
			Iterator<FilterExpression> it = filter.getExpressions().iterator();
			while(it.hasNext()) {
				FilterExpression fe = (FilterExpression) it.next();
				result = result || checkExpression(node, fe);
			}
		} else if(filter.getType() == FilterExpressionType.NOT) {
			// NOT operator
			FilterExpression fe = filter.getExpressions().get(0);
			result = !checkExpression(node, fe);
		}
		return result;
	}

	/**
	 * Checks a FilterExpression element
	 * @param node Node asociated to the FilterExpression
	 * @param filter FilterExpression element
	 * @return
	 */
	private boolean checkExpressionUnit(Node node, FilterExpressionUnit filter) {
		boolean result = false;


		QueryOperationExtensionPoint operation = QueryOperationFactory.getInstance().getQueryOperation(node, filter, context); 
		if(operation != null) {
			result = operation.perform();
		}

		return result;
	}


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
	
	/**
	 * @deprecated
	 */
	private Leaf findLeaf(Node node, String kind) {
		Leaf result = null;

		Iterator<Leaf> it = node.getLeaves().iterator();
		while(it.hasNext()) {
			Leaf l = it.next();
			if(l.getKind().equals(kind)) {
				return l;
			}
		}

		return result;
	}
}
