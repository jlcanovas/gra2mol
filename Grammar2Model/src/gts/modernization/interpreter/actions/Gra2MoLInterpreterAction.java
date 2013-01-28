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
import gts.modernization.model.Gra2MoL.Core.FromElement;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.InitUnitElementValue;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.modelbuilder.ModelBuilder;
import gts.modernization.modelbuilder.ModelElementWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Feature;
import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;
import org.eclipse.gmt.modisco.core.modeling.ReferenceModelElement;

/**
 * Auxiliar class from which all Gra2MoL action inherit
 * This class provides common funciontionalities to Gra2MoL actions
 * @author jlcanovas
 *
 */
public abstract class Gra2MoLInterpreterAction {
	/**
	 * Stores the queries executed. Key: query name. Value: Result list
	 */
	HashMap<String, List<Element>> queries; 

	/**
	 * Init element value (left-hand side) 
	 */
	InitUnitElementValue initValueElement;

	/**
	 * Init element (right-hand side)
	 */
	String initElement;

	/**
	 * actual CST element
	 */
	Element actualNode;

	/**
	 * Rule sets the scope
	 */
	Rule rule;

	/**
	 * Model element to modify 
	 */
	ModelElementWrapper modelElement;

	/**
	 * ModelBuilder used
	 */
	ModelBuilder modelBuilder;

	/**
	 * Model used
	 */
	Model model;

	/**
	 * Constructor 
	 * @param queries Stores the queries executed. Key: query name. Value: Result list
	 * @param modelElement Model element to modify 
	 * @param iu Init element 
	 * @param actualNode Actual CST element
	 * @param rule Rule sets the scope
	 */
	public Gra2MoLInterpreterAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu) {
		this.modelBuilder = modelBuilder;
		this.model = model;
		this.modelElement = new ModelElementWrapper(modelElement);
		this.queries = queries;
		this.actualNode = actualNode;
		this.rule = rule;
		this.initValueElement = iu.getValue();
		parseInitElement(iu);
	}

	/**
	 * Parse the init value sentence to detect the navigation over the attributes. For example in the 
	 * sentence "name.id", the "id" attribute is choosed.
	 * @param iu
	 */
	private void parseInitElement(InitUnitElement iu) {
		this.initElement = iu.getElement(); 

		List extension = iu.getExtension();
		if(extension != null && !extension.isEmpty()) {
			modelElement = new ModelElementWrapper((ModelElement) modelElement.get(this.initElement));				
			for(int i = 0; i < extension.size() - 1; i++) {
				modelElement = new ModelElementWrapper((ModelElement) modelElement.get((String) extension.get(i)));					
			}
			this.initElement = (String) extension.get(extension.size() - 1);
		}
	}

	/**
	 * Extracts the node results of the variable query. 
	 * It checks if the variable matches with the from alias.
	 * @param variable Query result variable
	 * @return List with results
	 */
	List<Element> extractResult(String variable) { 
		List<Element> result = null;

		result = queries.get(variable);
		if((result == null) && (extractFrom() != null) && (extractFrom().getAlias() != null) && (extractFrom().getAlias().equals(variable))) {
			// If there is no result and the init value is the from alias
			result = new ArrayList<Element>();
			result.add(actualNode);
			Gra2MoLLogger.getInstance().append("(from alias used) ");
		}

		return result;
	}

	/**
	 * Extract the casting of the query asociated to the variable. 
	 * @param variable Query result variable
	 * @return String
	 */
	String extractCasting(String variable) {
		String sol = null;

		Iterator<QueryUnit> quIt = rule.getQueries().iterator();
		while(quIt.hasNext()) {
			QueryUnit qu = quIt.next();
			if(qu.getVariable().equals(variable)) {
				sol = qu.getCast();
				break;
			}
		}
		return sol;
	}

	/**
	 * Extracts the position of the first param
	 * @return
	 */
	int extractPosition() {
		int position = 0;
		if (initValueElement.getParams().size() == 1) {
			Parameter vp = (Parameter) initValueElement.getParams().get(0);
			if(vp.getType() == ParameterType.NUMBER_VALUE) {
				position = Integer.parseInt(vp.getValue());
			} else if (vp.getType() == ParameterType.MULTIPLE) {
				position = -1;			
			} else {
				Gra2MoLLogger.getInstance().append("NO NUMBER PARAMETER! ");
			}
		}
		return position;
	}

	/**
	 * Extracts the from part (name) of the rule.
	 * This method is used to make abstract the work with the Rule hierarchy since some rules
	 * only works with Standard Rules.
	 * TODO: This method must discover the from part of a mixim rule, mustn't it?
	 * @return
	 */
	FromElement extractFrom() {
		FromElement result = null;
		
		if (this.rule instanceof StandardRule) {
			StandardRule sr = (StandardRule) this.rule;
			result = sr.getFrom();
		}
		
		return result;
	}
	/**
	 * Sets the value to the initelement. The type of the metaelement property is analized and 
	 * the value is adapted to
	 * conforms to it
	 * @param value
	 */
	void setValueModelElement(String value) {
		Object finalValue = null;

		// Analyzes the type of the feature
		ReferenceModelElement rme = modelElement.getReferenceModelElement();
		try {
			Feature f = rme.getFeature(this.initElement);
			ModelElement mtype = f.getType();
			String o = (String) mtype.get("name");

			if(o.equals("EBoolean")) {
				if(value.toLowerCase().equals("true")) {
					finalValue = true;
				} else if (value.toLowerCase().equals("false")) {
					finalValue = false;
				}
			} else if (o.equals("EInt")) {
				finalValue = Integer.valueOf(value);		
			} else if (o.equals("EString")) {
				finalValue = value;	
			} else if (o.equals("EDouble")) {
				finalValue = Double.valueOf(value);		
			} else {
				finalValue = value;
			}	

			setObjectModelElement(finalValue);
		} catch (Exception e) {
			throw new IllegalArgumentException("The property '" + this.initElement + "' does not exist!");
		}
	}

	/**
	 * Sets the value to the initelement. This takes into account the multiplicity of the metaelement 
	 * property. It receives a list with elements
	 * @param valueList
	 */
	void setObjectModelElement(List<ModelElement> valueList) {
		if(valueList != null) {
			Iterator<ModelElement> meIt = valueList.iterator();
			while(meIt.hasNext()) {
				ModelElement value = meIt.next();
				setObjectModelElement(value);			
			}
		}
	}

	/**
	 * Sets the value to the initelement. This takes into account the multiplicity of the metaelement 
	 * property. 
	 * @param value
	 */
	void setObjectModelElement(Object value) {
		if(value != null) {
			try {
				if(modelElement.isMultiValuedProperty(initElement)) {
					modelElement.add(initElement, value);							
				} else {
					modelElement.set(initElement, value);	
				}
			} catch (Exception e) {
				System.out.println("In '" + rule.getName() + "' rule (while setting value): " + e.getMessage());
			}
		}
	}

	public abstract void execute();

}
