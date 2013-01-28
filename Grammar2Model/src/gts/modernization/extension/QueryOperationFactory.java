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


package gts.modernization.extension;

import gts.modernization.interpreter.Gra2MoLConfiguration;
import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.query.QueryContext;
import gts.modernization.query.actions.QueryOperationExtensionPoint;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * This class is in charge of creating new query operation classes. I have used the singleton pattern because
 * the other alterntaive would have been to scatter the code in different classes. Anyway, I don't like it too much :(
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class QueryOperationFactory extends ExtensionFactory {
	/**
	 * Singleton instance
	 */
	private static QueryOperationFactory instance;

	public static QueryOperationFactory getInstance() {
		if(instance == null) instance = new QueryOperationFactory();
		return instance;
	}  

	private QueryOperationFactory() {
		initialize();
	}

	public QueryOperationExtensionPoint getQueryOperation(Node node, FilterExpressionUnit filter, QueryContext context) {
		QueryOperationExtensionPoint result = null;

		String keyword = filter.getOperation();
		Class operationClass = extensions.get(keyword);
		if(operationClass != null) {
			try {
				Constructor constructor = operationClass.getConstructor(Node.class, FilterExpressionUnit.class, QueryContext.class);
				result = (QueryOperationExtensionPoint) constructor.newInstance(node, filter, context);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	@Override
	public String getPropertyKeyword() {
		return Gra2MoLConfiguration.QUERYOPERATIONS_PROPERTY_KEYWORD;
	}

	@Override
	public Class getConformsToClass() {
		return QueryOperationExtensionPoint.class;
	}

	@Override
	public String getDebugKeywordMessage() {
		return "query operation";
	}
}
