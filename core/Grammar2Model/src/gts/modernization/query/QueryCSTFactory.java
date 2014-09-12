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

/**
 * This class is charge of creating the QueryCST visitors. 
 * @author Javier Canovas
 *
 */
public class QueryCSTFactory {
	public static enum QueryCSTType { ADHOC, VISITOR};	
	
	public static QueryCST createQueryCST(QueryContext context, QueryCSTType type) {
		switch (type) {
		case ADHOC:
			return new QueryCSTAdhoc(context);
		case VISITOR:
			return new QueryCSTVisitorMulti(context);
		default:
			return null;	
		}
	}
}
