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

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class OperationCreationAction extends Gra2MoLInterpreterAction {

	public OperationCreationAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
	}

	@Override
	public void execute() {
		Gra2MoLLogger.getInstance().print("- OPERATION_CREATION: ");
		ModelElement cme = null;
		try {
			cme = modelBuilder.createModelElement(model, initValueElement.getValue());
		} catch (Exception e) {
			throw new IllegalArgumentException("Class " + initValueElement.getValue() + " could not be created in " + this.rule.getName() + " rule");
		}
		Gra2MoLLogger.getInstance().append(initValueElement.getValue() + " created");


		if(modelElement.isMultiValuedProperty(initElement)) {
			modelElement.add(initElement, cme);							
		} else {
			modelElement.set(initElement, cme);
		}
	}

}
