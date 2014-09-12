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

import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.FilterExpression;


public class Expression {
	private Node node;
	private Node father;
	private FilterExpression expression;
	private QueryContext context;
	
	public Expression(Node node, FilterExpression expression, QueryContext context) {
		this.father = null;
		this.node = node;
		this.expression = expression;
		this.context = context;
	}
	
	/**
	 * @deprecated
	 */
	public Expression(Node node, FilterExpression expression) {
		this.father = null;
		this.node = node;
		this.expression = expression;
		this.context = null;
	}
	
	/**
	 * @deprecated
	 */
	public Expression(Node father, Node node, FilterExpression expression) {
		this.father = father;
		this.node = node;
		this.expression = expression;
	}
	
	public boolean evaluate() {
		if(father == null) {
			CheckExpression exp = new CheckExpression(this.node, this.expression, context);
			return exp.evaluate();
		} else {
//			CheckExpressionVisitor visitor = new CheckExpressionVisitor(this.father, this.node, this.expression);
//			father.accept(visitor);
//			return visitor.getResult();
			return false;
		}
	}
	

}
