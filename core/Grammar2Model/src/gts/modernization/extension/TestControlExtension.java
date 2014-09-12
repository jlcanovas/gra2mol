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
import gts.modernization.model.CST.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Example de query control extension
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestControlExtension extends QueryControlExtensionPoint {

	@Override
	public void preprocess() { }

	@Override
	public List<Element> postprocess(List<Element> nodes) {
		List<Element> resultList = new ArrayList<Element>();
		for(Element elementA : nodes) {
			if (elementA instanceof Node) {
				Node nodeA = (Node) elementA;
				boolean choosen = true;
				for(Element elementB : resultList) {
					if (elementB instanceof Node) {
						Node nodeB = (Node) elementB;
						if(nodeA.getLeaf("VALUE", 0).equals(nodeB.getLeaf("VALUE", 0)));
					}
				}
				if(choosen) 
					resultList.add(nodeA);
			}
		}
		return resultList;
	}

	/**
	 * This methods specifies the keywords which identifies to the operation in the
	 * gra2mol transformation definition (e.g., new String[] { "eq", "equals" })
	 * @return An array containing the keywords
	 */
	public static String[] keywords() {
		return new String[] { "test" };
	}
}
