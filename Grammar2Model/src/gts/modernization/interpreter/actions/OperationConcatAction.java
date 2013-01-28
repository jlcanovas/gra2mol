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
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.ValueParameter;
import gts.modernization.model.Gra2MoL.Core.ValueParameterType;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class OperationConcatAction extends Gra2MoLInterpreterAction {

	public OperationConcatAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
	}
	
	@Override
	public void execute() {
		Gra2MoLLogger.getInstance().print("- OPERATION_CONCAT: ");
		String sol = "";

		Iterator it = initValueElement.getParams().iterator();
		while (it.hasNext()) {
			Parameter vp = (Parameter) it.next();
			if(vp.getType() == ParameterType.STRING_VALUE) {
				sol += vp.getValue();
			} else if(vp.getType() == ParameterType.QUERY_ACCESS) { 
				Element node = null;
				if((extractFrom() != null) && vp.getValue().equals(extractFrom().getAlias())) {
					node = actualNode;
				} else {
					List<Element> result = queries.get(vp.getValue());
					node = result.get(0);
				}

				if (node instanceof Node) {
					Node firstNode = (Node) node;
					Leaf l = firstNode.getLeaf(vp.getExtension(), Integer.parseInt(vp.getExtensionPosition()));
					sol += l.getValue();
				}
			}
		}
		Gra2MoLLogger.getInstance().print(initElement + " (property) - " + sol +" (value)");							
		modelElement.set(initElement, sol);	
	}
}
