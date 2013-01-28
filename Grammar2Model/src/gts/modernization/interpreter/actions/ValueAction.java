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
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Feature;
import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;
import org.eclipse.gmt.modisco.core.modeling.ReferenceModelElement;

public class ValueAction extends Gra2MoLInterpreterAction {

	public ValueAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
	}

	public void execute() {

		Gra2MoLLogger.getInstance().print("- VALUE: " + initElement + " (property) - " + initValueElement.getValue() +" (value)");
		setValueModelElement(initValueElement.getValue());

//		ReferenceModelElement rme = modelElement.getReferenceModelElement();
//		Feature f = rme.getFeature(this.initElement);
//		ModelElement mtype = f.getType();
//		String o = (String) mtype.get("name");
//		if(o.equals("EBoolean")) {
//			if(initValueElement.getValue().toLowerCase().equals("true")) {
//				modelElement.set(initElement, true);
//			} else if (initValueElement.getValue().toLowerCase().equals("false")) {
//				modelElement.set(initElement, false);
//			}
//		} else if (o.equals("EInt")) {
//			Integer integerValue = Integer.valueOf(initValueElement.getValue());
//			modelElement.set(initElement, integerValue);		
//		} else {
//			modelElement.set(initElement, initValueElement.getValue());
//		}
	}



}
