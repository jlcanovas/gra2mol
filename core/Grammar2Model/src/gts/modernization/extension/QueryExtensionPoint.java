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

import gts.modernization.query.QueryContext;

/**
 * Main class to provide an extension point for queries.
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class QueryExtensionPoint extends ExtensionPoint {
	/**
	 * The context of the query 
	 */
	protected QueryContext context;
	
	// Getters and setters
	public QueryContext getContext() {
		return context;
	}

	public void setContext(QueryContext context) {
		this.context = context;
	}
}
