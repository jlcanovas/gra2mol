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
import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.model.Gra2MoL.Query.FilterOperationType;
import gts.modernization.modelbuilder.ModelBuilder;
import gts.modernization.modelbuilder.ModelElementWrapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public abstract class RuleExecutorAction extends Gra2MoLInterpreterAction {
	Gra2MoLInterpreter interpreter = null;

	public RuleExecutorAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu, Gra2MoLInterpreter interpreter) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
		this.interpreter = interpreter;
	}
	
	Rule resolveRule(Element node) {
		// Seeking the rule to execute
		RuleSolver ruleSolver = new RuleSolver(interpreter, modelBuilder, rule);
		Rule resolvedRule = ruleSolver.resolveRule(modelElement.getModelElement(), initElement, node);
		return resolvedRule;
	}
	
	List<ModelElement> executeRule(Rule rule, Element node) {
		if(rule == null) {
			Gra2MoLLogger.getInstance().append("RULE NOT FOUND!  FROM: " + node.getKind() + " TO: " + initElement);
			return null;
		}
		
		Node realNode = null;
		if(isUnique(rule)) {
			if (node instanceof Node) {
				Node n = (Node) node;
				realNode = uniqueRule(rule, n);		
				if(realNode != null)
					Gra2MoLLogger.getInstance().append(" (unique detected - " + realNode + ")");
			}

		} 				

		Gra2MoLLogger.getInstance().append("calling " + rule.getName() + " rule\n");
		if(realNode != null) node = realNode;

		ModelElementWrapper mew = new ModelElementWrapper(modelElement.getModelElement());
		ModelElement typeOfFeature = mew.extractTypeOfFeatureName(initElement);								

		List<ModelElement> returnModelElement = interpreter.interpretRule(typeOfFeature, node, rule);	
		return returnModelElement;
	}
	
	boolean isUnique(Rule resolvedRule) {
		boolean sol = false;
		if (resolvedRule instanceof StandardRule) {
			StandardRule sRule = (StandardRule) resolvedRule;
			if(resolvedRule != null && sRule.getFrom().getFilter() != null) {
				sol = sRule.getFrom().getFilter().getMarkedFilterUnit().getOperation() == FilterOperationType.UNIQUE;
			}			
		}
		return sol;
	}

	Node uniqueRule(Rule resolvedRule, Node node) {
		Node sol = null;

		HashMap<Rule, HashMap<Element, List<ModelElement>>> executedRules = interpreter.getExecutedRules();
		Iterator<Rule> itkeys = executedRules.keySet().iterator();
		while(itkeys.hasNext()) {
			Rule r = itkeys.next();
			if(r.getName().equals(resolvedRule.getName())) {
				HashMap<Element, List<ModelElement>> instances = executedRules.get(r);
				Iterator<Element> itElements = instances.keySet().iterator();
				while(itElements.hasNext()) {
					Element e = itElements.next();
					if (e instanceof Node) {
						Node n = (Node) e;
						if(node.deepEquals(n)) {
							sol = n;
							break;
						}
					}
				}
			}
			if(sol != null) break;
		}		

		return sol;
	}

	/**
	 * Locates a rule by name in the transformation definition
	 * @param name
	 * @return
	 */
	Rule locateRule(String name) {
		Rule locatedRule = null;
		
		Iterator<Rule> itRules = interpreter.getRules().iterator();
		while(itRules.hasNext()) {
			Rule rule = itRules.next();
			if(rule.getName().equals(name)) {
				locatedRule = rule;
				break;
			}
		}
		
		return locatedRule;
	}
}
