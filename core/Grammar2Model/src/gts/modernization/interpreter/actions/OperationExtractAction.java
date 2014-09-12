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


package gts.modernization.interpreter.actions;

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class OperationExtractAction extends Gra2MoLInterpreterAction {

	public OperationExtractAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
	}

	@Override
	public void execute() {
		Gra2MoLLogger.getInstance().print("- CODE: ");
		List<Element> result = extractResult(initValueElement.getValue());
		
		if(result != null) {
			Iterator<Element> it = result.iterator();
			while(it.hasNext()) {
				Element elem = it.next();
				if (elem instanceof Node) {
					Node firstNode = (Node) elem;
					Gra2MoLLogger.getInstance().append(" - node: " + firstNode.getKind() + " (kind) - ");

					String sol = extractString(firstNode);
					Gra2MoLLogger.getInstance().append("Result: " + sol);		
					try {
						if(modelElement.isMultiValuedProperty(initElement)) {
							modelElement.add(initElement, sol);							
						} else {
							modelElement.set(initElement, sol);
						}
					} catch (Exception e) {
						System.out.println("In '" + rule.getName() + "' rule (while extracting): " + e.getMessage());
					}
				}
			}
		}
	}
	
	String extractString(Node firstNode) {
		String result = firstNode.extractContent(true);
		
		if(result.length() > 0 && result.lastIndexOf(" ") == result.length()-1) {			
			result = result.substring(0, result.length()-1);
		}
		
		return result;
	}

//	private String traverseNode(Node firstNode) {
//		String result = "";
//
//		Iterator<Element> children = firstNode.getChildren().iterator();
//		while(children.hasNext()) {
//			Element e = children.next();
//			if (e instanceof Leaf) {
//				Leaf leaf = (Leaf) e;
//				result = result + leaf.getValue() + " ";
////				if(!isSpecialCharacter(leaf.getValue())) result = result + " ";
//			} else if (e instanceof Node) {
//				Node node = (Node) e;
//				result = result + traverseNode(node);
//			} 			
//		}
//		return result;
//	}
//
//	private String parseSol(String msg) {
//		String sol = "";
//		Pattern patron = Pattern.compile(" \\. ");
//		Matcher matcher = patron.matcher(msg);
//		sol = matcher.replaceAll("\\.");
//		return sol;
//	}

	private static String[] specialChars = {".", ",", ";"};

	private boolean isSpecialCharacter(String msg) {
		boolean sol = false;

		for(int i = 0; i < specialChars.length; i++) {
			String c = specialChars[i];
			if(msg.equals(c)) sol = true;
		}

		return sol;
	}

}
