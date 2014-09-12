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

import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.RuleType;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.modelbuilder.ModelBuilder;
import gts.modernization.modelbuilder.ModelElementWrapper;
import gts.modernization.query.QueryEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.ModelElement;

/**
 * Engine for resolving rules to be executed
 * @author jlcanovas
 *
 */
public class RuleSolver {

	/**
	 * Interpreter of Gra2MoL (used to traverse the rules)
	 */
	private Gra2MoLInterpreter interpreter;

	/**
	 * Modelbuilder of the target model (used to build auxiliar metaclasses in hierarchy comparation)
	 */
	private ModelBuilder modelBuilder;

	/**
	 * Actual Rule (used to check the context section)
	 */
	private Rule actualRule;
	
	/**
	 * The query engine that will be used to traverse the CST
	 * (obtained from interpreter attribute)
	 */
	private QueryEngine queryEngine;


	/**
	 * @param interpreter Interpreter of Gra2MoL (used to traverse the rules)
	 * @param modelBuilder Modelbuilder of the target model (used to build auxiliar metaclasses in hierarchy comparation)
	 * @param actualRule Actual Rule (used to check the context section)
	 */
	public RuleSolver(Gra2MoLInterpreter interpreter, ModelBuilder modelBuilder, Rule actualRule) {	
		this.interpreter = interpreter;
		this.modelBuilder = modelBuilder;
		this.actualRule = actualRule;
		this.queryEngine = this.interpreter.getQueryEngine();
	}
	
	/**
	 * Resolve the rule that has to be executed
	 * @param me the metalement
	 * @param left Left-hand element (the property of the metaelement)
	 * @param right Right-hand element (the node of the CST)
	 * @return
	 */
	public Rule resolveRule(ModelElement me, String left, Element right) {
		ModelElementWrapper mew = new ModelElementWrapper(me);
		ModelElement typeOfFeature = mew.extractTypeOfFeatureName(left);

		return resolveRule(typeOfFeature, right);
	}

	/**
	 * Resolve the rule that has to be executed
	 * @param typeOfFeature Metatype of the feature (left-hand side)
	 * @param right Kind of the node (right-hand side)
	 * @return
	 */
	public Rule resolveRule(ModelElement typeOfFeature, Element right) {
		// Check if a casting exists
		String casting = null;
		
		// Gets the kind of the node
		String nodeKind = null;
		if(casting != null) nodeKind = casting;
		else nodeKind = right.getKind();
		
		// Phase 1: Retrieving the rules whose from conforms to the node kind
		List<StandardRule> rules = interpreter.getIndexRules().get(nodeKind);
		if(rules == null) return null;

		// Phase 2: Checking the context (we iterate over the rules list)
		List<StandardRule> contextRules = new ArrayList<StandardRule>();
		for(StandardRule r : rules) {
			if(r.getContext().isEmpty()) {
				// The rule has not context, it is stored
				contextRules.add(r);
			} else {
				// The rules has context, it is checked
				for(String ctx: r.getContext()) {
					if(ctx.equals(actualRule.getName())) {
						contextRules.add(r);
					}
				}
			}
		}

		// Phase 3: Checking the constraint (we iterator over the contextRule list)
		List<StandardRule> constraintRules = new ArrayList<StandardRule>();
		for(StandardRule r : contextRules) {
			if(r.getFrom().getFilter() != null) {
				// If from filter exists, the constraint is checked
				boolean choosedRule = queryEngine.executeRuleConstraint(r, right);
				if(choosedRule) constraintRules.add(r);
			} else {
				// If from filter does not exists, it is stored
				constraintRules.add(r);
			}
		}
		
		// Phase 4: Comparing TO part of the rule with the left-hand side type
		Rule rSol = null;
		Iterator<StandardRule> typeIt = constraintRules.iterator();
		while(typeIt.hasNext() && rSol == null) {
			StandardRule r = typeIt.next();

			if(typeOfFeature == null) {
				System.out.println("Yeah!");
			}
			
			// Extracting the name of type of the the left-hand side part (attribute type) 
			String nameOfTypeFeature = (String) typeOfFeature.get("name");
			
			// Extracting the name of type of the the TO part
			String nameOfTo = extractToName(typeOfFeature, right, r);
			
			if(nameOfTo != null) {
				
				// We create an auxiliar Model Element from the TO information
				ModelElement auxModelElement = null;
				try {
					auxModelElement = modelBuilder.getMetaclass(nameOfTo); 
				} catch (Exception e) {
					throw new IllegalArgumentException("There is no metaclass called " + nameOfTo + " (rule " + r.getName() + ")");
				}

				// If we have achieved to create the auxiliar Model Element
				if(auxModelElement != null) {
					// Extracting the name of the auxiliar Model Element created
					// TODO: What is the difference between nameOfTo and nameMetaId??
					String nameMetaId = (String) auxModelElement.get("name");

					if(nameMetaId.equals(nameOfTypeFeature)) { 
						// The TO type (name) and left-hand side type (attribute type name) match 
						rSol = r; 
					}
					else {
						// Comparing with the supertypes
						Iterator<StandardRule> supertypesIt = constraintRules.iterator();
						while(supertypesIt.hasNext()) {
							StandardRule rSuper = supertypesIt.next();
							String newNameOfTo = extractToName(typeOfFeature, right, rSuper);
							if(newNameOfTo != null) {
								ModelElementWrapper mew2 = new ModelElementWrapper(modelBuilder.getMetaclass(newNameOfTo));
								boolean subType = mew2.isSubtype(typeOfFeature);
								if(subType) {
									rSol = rSuper;
									break;
								}
							}
						}
					}
				} else {
					throw new IllegalArgumentException(" There is no metaclass called '" + nameOfTo + "' in the metamodel!!");
				}
			}
		}

		return rSol;
	}

	/**
	 * Extracts the name of the TO part
	 * @param typeOfFeature
	 * @param right
	 * @param r
	 * @return
	 */
	private String extractToName(ModelElement typeOfFeature, Element right, Rule r) {
		String nameOfTo = null;

		if (r instanceof StandardRule) {
			StandardRule sr = (StandardRule) r;
			if(sr.getType() == RuleType.SKIP) {
				nameOfTo = sr.getTo().getName();
			} else {
				nameOfTo = sr.getTo().getName();
			}			
		}

		return nameOfTo;
	}

	/**
	 * Extracts the name of the TO part in a bridge rule
	 * @param typeOfFeature
	 * @param right
	 * @param r
	 * @return
	 * @deprecated
	 */
	private String extractNameFromBridgeRule(ModelElement typeOfFeature, Element right, Rule r) {
		String sol = null;

		HashMap<String, List<Element>> result = interpreter.executeQueries(right, r);
		List<Element> bridgeResult = result.get("bridge");
		if(bridgeResult != null && bridgeResult.size() > 0) {
			Element bridgeNode = bridgeResult.get(0);
			
			// The bridge_rule must seem as the father rule
			String oldName = actualRule.getName();
			actualRule.setName(r.getName());
			
			RuleSolver ruleSolver = new RuleSolver(interpreter, modelBuilder, actualRule);
			Rule resolvedRule = ruleSolver.resolveRule(typeOfFeature, bridgeNode);
			
			// Set the name of the father rule to the correct one
			actualRule.setName(oldName);
			if(resolvedRule != null && !r.getName().equals(resolvedRule.getName())) {
//				sol = resolvedRule.getTo().getName(); // This doesn't take in account the recursive calls between bridge_rules
				sol = extractToName(typeOfFeature, bridgeNode, resolvedRule);
			}
		}

		return sol;
	}
}
