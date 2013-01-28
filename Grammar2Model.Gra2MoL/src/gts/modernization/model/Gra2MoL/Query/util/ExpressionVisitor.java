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


package gts.modernization.model.Gra2MoL.Query.util;

import gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;

public interface ExpressionVisitor {
	public void visit(FilterExpressionUnit filter);
	public void visit(FilterExpressionComplex filter);
}
