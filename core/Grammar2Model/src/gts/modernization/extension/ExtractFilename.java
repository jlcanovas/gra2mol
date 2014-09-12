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
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;

import java.util.List;

/**
 * An example of hardcoded extension. This extension was required for the Mancoosi project
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class ExtractFilename extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {				
		List<Element> resultQuery = (List<Element>) getParam(0);
		Element e = resultQuery.get(0);
		if (e instanceof Node) {
			Node node = (Node) e;
			Leaf fileNameLeaf = node.getLeaf("filename", 0);
			if(fileNameLeaf != null) {
				String value = fileNameLeaf.getValue();
				int index = value.indexOf(".");
				if(index > 0) {
					return returnString(value.substring(0, index));
				} 
			}			
		} 
		return returnString(null);
		
	}
}
