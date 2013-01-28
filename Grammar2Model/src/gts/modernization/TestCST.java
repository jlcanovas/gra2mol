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


package gts.modernization;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.impl.CSTPackageImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * This class tests the obtention of CSTs
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestCST {

	public static void main(String[] args) {
		Element e = loadCST("files/oki.java.ecore");	
		List<Node> ret = testCompleteTree(e);
		
		List<String> rets = cleanList(ret);
		Iterator<String> it = rets.iterator();
		System.out.println("(" + rets.size() + ") Tipos de nodos sin hojas:");
		while(it.hasNext()) {
			System.out.println("-> " + it.next());
		}
	}
	
	public static List<String> cleanList(List<Node> list) {
		ArrayList<String> sol = new ArrayList<String>();
		
		Iterator<Node> it = list.iterator();
		while(it.hasNext()) {
			Node n = it.next();
			if(!sol.contains(n.getKind())){
				sol.add(n.getKind());
			}
		}
		
		return sol;
	}
	
	public static List<Node> testCompleteTree(Element subtree) {
		ArrayList<Node> sol = new ArrayList<Node>();
		
		if (subtree instanceof Node) {
			Node node = (Node) subtree;
			
			Iterator<Element> children = node.getChildren().iterator();
			
			if(node.getChildren().size() == 0) sol.add(node);

			boolean hasLeaf = false;
			while(children.hasNext()) {
				Element e = children.next();
				if (e instanceof Leaf) {
					Leaf l = (Leaf) e;
					hasLeaf = true;
				} else if (e instanceof Node) {
					Node n = (Node) e;
					sol.addAll(testCompleteTree(n)); 
				}
				
			}
		}
		
		return sol;
	}
	
	public static Element loadCST(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs.getPackageRegistry().put("http://gts.inf.um.es/modernization/cst", CSTPackageImpl.eINSTANCE);

		Resource r = rs.getResource(URI.createFileURI(path), true);
		Element t = null;
		try {
			r.load(null);
			t = (Element) r.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;

	}
}
