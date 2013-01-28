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
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class OperationRemoveQuotesAction extends Gra2MoLInterpreterAction {

	public OperationRemoveQuotesAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
	}

	public void execute() {
		Gra2MoLLogger.getInstance().print("- QUERY_ACCESS: variable: " + initValueElement.getValue() + " - ");
		List<Element> result = extractResult(initValueElement.getValue());

		// Control sentences
		if(result == null) Gra2MoLLogger.getInstance().append(" VARIABLE NOT FOUND! ");		
		if(result.size() == 0) Gra2MoLLogger.getInstance().append(" VARIABLE HAS NOT RESULTS! "); 

		if(result != null && result.size() > 0) {
			Gra2MoLLogger.getInstance().incDeep();
			for(int i = 0; i < result.size(); i++) {
				Element elem = result.get(i);
				if (elem instanceof Node) {
					Node elemNode = (Node) elem;
					Gra2MoLLogger.getInstance().print("node: " + elemNode.getKind() + " (kind) - ");
					
					// Extract the position of the leaf
					int position = extractPosition();
					// Extract the leaf
					Leaf l = elemNode.getLeaf(initValueElement.getExtension(), position);
					
					if(l != null) {					
						Gra2MoLLogger.getInstance().append("leaf: " + l.getKind() + " (kind) - " + l.getValue() + " (value) ");
						// Work with the value
						String value = l.getValue().substring(1, l.getValue().length() - 1);						
						// Set the value to modelElement
						setValueModelElement(value);
					} else {
						Gra2MoLLogger.getInstance().append("LEAF NOT FOUND");		
//						System.out.println("There is no leaf named '" + initValueElement.getExtension() + "' with index " + (position+1) + " in '" + elemNode.getKind() + "' node in '" + initValueElement.getValue() + "' variable rule of '" + rule.getName() + "' rule");
					}
				}
			}
			Gra2MoLLogger.getInstance().decDeep();
		} 
	}
}
