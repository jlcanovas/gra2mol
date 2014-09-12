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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An example of harcoded mapping extension point
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class ExtractGreaterMappingExtension extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {		
		long max = 0;
		long longValue = 0;
		Element result = null;
		
		List<Element> resultQuery = (List<Element>) getParam(0);
		Iterator<Element> itResultQuery = resultQuery.iterator();
		while(itResultQuery.hasNext()) {
			Element e = itResultQuery.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				Node insertData = n.getNode("insert_data", 6);
				if(insertData != null) {
					Leaf date = insertData.getLeaf("HEXNUMBER", 0);
					longValue = Long.valueOf(convertHexToString(date.getValue()));					
					if(longValue > max) {
						max = longValue;
						result = n;
					}
				}
				
			}
		}
		
		return returnNode(result);
	}
	
	private String convertHexToString(String data) {
		int index = data.indexOf("x");
		if(index > 0) {
			data = data.substring(index+1, data.length());
		}

		index = data.indexOf("X");
		if(index > 0) {
			data = data.substring(index+1, data.length());
		}

		byte[] bytes = new byte[data.length() / 2];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Integer.parseInt(data.substring(2 * i, 2 * i + 2), 16);
		}

		return new String(bytes);
	}
}
