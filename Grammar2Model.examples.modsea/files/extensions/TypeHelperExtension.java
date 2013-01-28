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


import java.util.List;


import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;

import gts.modernization.extension.*;
import org.eclipse.emf.ecore.EcorePackage;

public class TypeHelperExtension extends MappingExtensionPoint {

	public ExtensionValueReturn execute() {				
		List<Node> nodes = (List<Node>) getParam(0);
		Leaf leaf = nodes.get(0).getLeaf("DQVALUE", 0);

		if(leaf != null) {
			if(leaf.getValue().equals("\"string\"") || leaf.getValue().equals("\"text\"") || leaf.getValue().equals("\"uri\"")) {
				return returnObject(EcorePackage.Literals.ESTRING);
			} else if(leaf.getValue().equals("\"boolean\"")) {
				return returnObject(EcorePackage.Literals.EBOOLEAN);
			} else if(leaf.getValue().equals("\"int\"") || leaf.getValue().equals("\"integer\"")) {
				return returnObject(EcorePackage.Literals.EINT);
			}		
		}
		return null;
	}

	public static String[] keywords() {
		return new String[] { "typeHelper" };
	}
}
