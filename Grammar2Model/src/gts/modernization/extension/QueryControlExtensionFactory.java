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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import gts.modernization.interpreter.Gra2MoLConfiguration;
import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Query.QueryControlExtension;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.query.QueryContext;

/**
 * This class is in charge of managing the new query control statements
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class QueryControlExtensionFactory extends ExtensionFactory {	
	/**
	 * Singleton instance
	 */
	private static QueryControlExtensionFactory instance;
	
	/**
	 * Manages the singleton 
	 * @return
	 */
	public static QueryControlExtensionFactory getInstance() {
		if(instance == null) instance = new QueryControlExtensionFactory();
		return instance;
	} 

	private QueryControlExtensionFactory() {
		initialize();
	}
	
	/**
	 * Obtains the instance of the query control extension from the keyword
	 * @param keyword
	 * @return
	 */
	public QueryControlExtensionPoint getQueryControlExtension(String keyword) {
		Class queryControlExtensionClass = extensions.get(keyword);
		QueryControlExtensionPoint queryControlExtensionInstance = null;
		try {
			queryControlExtensionInstance= (QueryControlExtensionPoint) queryControlExtensionClass.newInstance();
		} catch (Exception e) {
			Gra2MoLLogger.getInstance().print("Error instantiating the query control statement " + queryControlExtensionClass.getName());
		}
		return queryControlExtensionInstance;
	}

	@Override
	public String getPropertyKeyword() {
		return Gra2MoLConfiguration.QUERYCONTROL_PROPERTY_KEYWORD;
	}

	@Override
	public Class getConformsToClass() {
		return QueryControlExtensionPoint.class;
	}

	@Override
	public String getDebugKeywordMessage() {
		return "query control statement";
	}
}
