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


package gts.modernization.interpreter;

import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Query.ExpressionElement;
import gts.modernization.model.Gra2MoL.Query.FilterExpression;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionType;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.model.Gra2MoL.Query.OperationType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CheckConditionalExpression {
	private FilterExpression expression;
	private HashMap<String, List<Element>> queries;

	/**
	 * Creates a new CheckConditionalExpression
	 * @param expression FilterExpression element
	 * @param queries Queries of the rule
	 */
	public CheckConditionalExpression(FilterExpression expression, HashMap<String, List<Element>> queries) {
		this.expression = expression;
		this.queries = queries;
	}

	/**
	 * Evaluates the expression 
	 * @return
	 */
	public boolean evaluate() {
		return checkConditionalExpression(this.expression);
	}

	/**
	 * Checks the expression. It discriminates the type of the FilterExpression
	 * @param expression FilterExpression
	 * @return
	 */
	private boolean checkConditionalExpression(FilterExpression expression) {
		if (expression instanceof FilterExpressionUnit) {
			return checkConditionalExpressionUnit((FilterExpressionUnit) expression);
		} else if (expression instanceof FilterExpressionComplex) {
			return checkConditionalExpressionComplex((FilterExpressionComplex) expression);
		}
		return false;
	}

	/**
	 * Checks a FilterExpression complex
	 * @param node Node asociated to the FilterExpression
	 * @param filter FilterExpression complex
	 * @return
	 */
	private boolean checkConditionalExpressionComplex(FilterExpressionComplex filter) {
		boolean result = true;

		if(filter.getType() == FilterExpressionType.AND) {
			// AND Operator
			Iterator<FilterExpression> it = filter.getExpressions().iterator();
			while(it.hasNext()) {
				FilterExpression fe = (FilterExpression) it.next();
				result = result && checkConditionalExpression(fe);
			} 
		} else if(filter.getType() == FilterExpressionType.OR) {
			// OR operator
			result = false;
			Iterator<FilterExpression> it = filter.getExpressions().iterator();
			while(it.hasNext()) {
				FilterExpression fe = (FilterExpression) it.next();
				result = result || checkConditionalExpression(fe);
			}
		} else if(filter.getType() == FilterExpressionType.NOT) {
			// NOT operator
			FilterExpression fe = filter.getExpressions().get(0);
			result = !checkConditionalExpression(fe);
		}
		return result;
	}

	/**
	 * Checks a FilterExpression element
	 * @param filter FilterExpression element
	 * @return
	 */
	private boolean checkConditionalExpressionUnit(FilterExpressionUnit filter) {
		boolean result = false;

		ExpressionElement element = filter.getElement(); 
		if(filter.getOperation().equals("hasResults")) { // TODO CHANGE THIS, RIGHT NOW
			List<Element> rQuery = queries.get(element.getName());
			if(rQuery == null) {
				Gra2MoLLogger.getInstance().print("hasResult operator is being applied to a non existent variable!");
			}
			if(rQuery != null && rQuery.size() > 0) result = true;
			else result = false;
		} 

		return result;
	}
}
