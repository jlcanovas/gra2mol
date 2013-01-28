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

import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.HashValue;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.InitUnitElementValue;
import gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;


public class Gra2MoLInterpreterActionFactory {
	/**
	 * ModelBuilder used
	 */
	ModelBuilder modelBuilder;
	
	/**
	 * Model used
	 */
	Model model;
		

	private HashMap<String, HashMap<String, HashValue>> hashes;
	
	public Gra2MoLInterpreterActionFactory(ModelBuilder modelBuilder, Model model, HashMap<String, HashMap<String, HashValue>> hashes) {
		this.modelBuilder = modelBuilder;
		this.model = model;
		this.hashes = hashes;
	}

	/**
	 * Creates a new Interpreter Action to execute the mapping operation
	 * @param queries Stores the queries executed. Key: query name. Value: Result list
	 * @param modelElement Model element to modify 
	 * @param iu Init element 
	 * @param actualNode Actual CST element
	 * @param rule Rule sets the scope
	 * @return
	 */
	public Gra2MoLInterpreterAction createAction(ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		Gra2MoLInterpreterAction result = null;
		InitUnitElementValue initUnitElementValue = iu.getValue();
		
		if(initUnitElementValue.getType() == InitUnitElementValueType.QUERY_ACCESS) {
			result = new QueryAccessAction(modelBuilder, model, modelElement, queries, actualNode, rule, iu);	
		} else if (initUnitElementValue.getType() == InitUnitElementValueType.OPERATION_CONCAT) {
			result = new OperationConcatAction(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
		} else if (initUnitElementValue.getType() == InitUnitElementValueType.OPERATION_CREATION) {
			result = new OperationCreationAction(modelBuilder, model, modelElement, queries, actualNode, rule, iu);			
		} else if (initUnitElementValue.getType() == InitUnitElementValueType.HASH) {
			result = new HashAction(modelBuilder, model, modelElement, queries, actualNode, rule, iu, hashes);
		} 
		
		return result;
	}
}
