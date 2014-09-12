/*******************************************************************************
 * Copyright (c) 2008, 2013
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
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;

import java.util.List;

public class GetPos extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {
		String result = null;

		List<Element> resultQuery = (List<Element>) getParam(0);
		Element e = resultQuery.get(0);
		if (e instanceof Node) {
			Node node = (Node) e;
			Leaf l = node.getLeaf("ID", 0);
			if (l != null)
				result = String.valueOf(l.getPos());
		}

		return returnString(result);
	}


	public static String[] keywords() {
		return new String[] { "getPos" };
	}

}
