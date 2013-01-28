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

import gts.modernization.model.CST.Element;
import gts.modernization.query.QueryContext;

import java.util.List;

/**
 * Main class to provide nes control operators to queries 
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class QueryControlExtensionPoint extends QueryExtensionPoint {
	
	public void setContext(QueryContext context) {
		super.setContext(context);
		if(context != null && context.getQueryHistory() != null)
			setQueries(context.getQueryHistory());
	}
	
	/**
	 * Computations to be performed before the control operator is executed
	 */
	public abstract void preprocess();
	
	/**
	 * Computations to be performed after the control operator is executed. 
	 * @param node The list of nodes which are result of the query
	 * @return The set of elements which are result of this control operator
	 */
	public abstract List<Element> postprocess(List<Element> node);
}
