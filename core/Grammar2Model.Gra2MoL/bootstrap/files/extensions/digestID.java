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


import gts.modernization.model.CST.*;
import gts.modernization.extension.*;
import java.util.Iterator;
import java.util.List;

public class digestID extends MappingExtensionPoint {

	public ExtensionValueReturn execute() {
		String sol = "noDigestedValue";
		
		List<Element> resultQuery = (List<Element>) getParam(0);
		Iterator<Element> itResultQuery = resultQuery.iterator();
		while(itResultQuery.hasNext()) {
			Element e = itResultQuery.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				Leaf idEscLeaf = n.getLeaf("IDESC", 0);
				Leaf idLeaf = n.getLeaf("ID", 0);
				if(idEscLeaf != null) {
					sol = idEscLeaf.getValue().substring(1, idEscLeaf.getValue().length());				
				} else {
					sol = idLeaf.getValue();
				}
			}
		}		
		
		return returnString(sol);
	}

}
