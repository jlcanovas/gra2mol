/*******************************************************************************
 * Copyright (c) 2008, 2012
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;

import gts.modernization.extension.*;

import java.util.List;

public class DigestFileNameExtension extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {
		List<Node> nodes = (List<Node>) getParam(0);
		Leaf leaf = nodes.get(0).getLeaf("filename", 0);
		
		String result = "";
		if(leaf != null && leaf.getValue() != null) {
			if(leaf.getValue().startsWith("/")) {
				result = leaf.getValue().substring(1, leaf.getValue().indexOf("_"));
			} else {
				result = leaf.getValue().substring(0, leaf.getValue().indexOf("_"));
			}
		}
		
		return returnString(result);
	}
	

	public static String[] keywords() {
		return new String[] { "digestFilename" };
	}

}
