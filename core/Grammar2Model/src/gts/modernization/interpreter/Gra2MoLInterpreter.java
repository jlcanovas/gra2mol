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


package gts.modernization.interpreter;

import gts.modernization.interpreter.actions.Gra2MoLInterpreterAction;
import gts.modernization.interpreter.actions.HashAction;
import gts.modernization.interpreter.actions.OperationCallAction;
import gts.modernization.interpreter.actions.OperationConcatAction;
import gts.modernization.interpreter.actions.OperationConvertHexToStringAction;
import gts.modernization.interpreter.actions.OperationCountAction;
import gts.modernization.interpreter.actions.OperationCreationAction;
import gts.modernization.interpreter.actions.OperationExtensionAction;
import gts.modernization.interpreter.actions.OperationExtractAction;
import gts.modernization.interpreter.actions.OperationExtractIDAction;
import gts.modernization.interpreter.actions.OperationRemoveQuotesAction;
import gts.modernization.interpreter.actions.QueryAccessAction;
import gts.modernization.interpreter.actions.QueryResultAction;
import gts.modernization.interpreter.actions.RuleSolver;
import gts.modernization.interpreter.actions.ValueAction;
import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.Hash;
import gts.modernization.model.Gra2MoL.Core.HashValue;
import gts.modernization.model.Gra2MoL.Core.InitUnit;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.InitUnitElementValue;
import gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroup;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroupType;
import gts.modernization.model.Gra2MoL.Core.MixinRule;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.RuleType;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.model.Gra2MoL.Query.FilterExpression;
import gts.modernization.model.Gra2MoL.Query.FilterType;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.modelbuilder.ModelBuilder;
import gts.modernization.query.QueryEngine;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;


/**
 * Core class which interpretes a Gra2MoL transformation
 * 
 * @author jlcanovas
 *
 */
public class Gra2MoLInterpreter {
	public static final String VERSION = "0.6";
	/**
	 * The CST of the source code
	 */
	private Element cst;

	/**
	 * The Gra2MoL transformation definition
	 */
	private Transformation transformation;

	/**
	 * The path where the result model whill be saved
	 */
	private String targetPath;	
	
	/**
	 * The query engine that will be used to traverse the CST
	 */
	private QueryEngine queryEngine;
	
	/**
	 * The modelbuilder used to manage the models
	 */
	private ModelBuilder mb = null;

	/**
	 * Main model where the metalements are created
	 */
	private Model m = null;

	/**
	 * Auxiliary model in order to query the metaelements
	 */
	private Model mAux = null;

	/**
	 * This variable is a hasmap used to index the rules.
	 * The key of the hashmap is the from element and the content is a list with all rules.
	 */
	private HashMap<String, List<StandardRule>> indexRules;

	/**
	 * Stores the mixin rules defined in the transformation
	 * The key of the hashmap is the name of each rule 
	 */
	private HashMap<String, MixinRule> mixinRules;

	/**
	 * Store the executed rules in order to control the return value of the rules. 
	 * Each Rule has a hashmap entry. The hashmap is indexed by the node and contains
	 * the created model elements.
	 */
	private HashMap<Rule, HashMap<Element, List<ModelElement>>> executedRules;

	/**
	 * Stores the hashes defined in the transformation
	 */
	private HashMap<String, HashMap<String, HashValue>> hashes;

	/**
	 * @param cst Concrete syntax tree 
	 * @param view Gra2MoL definition
	 * @param pathMetamodel Path to metamodel file
	 * @param metamodelPrefix Prefix of the main package of the metamodel
	 * @param targetPath Path to target model file
	 */
	public Gra2MoLInterpreter(Element cst, Transformation transformation, String pathMetamodel, String metamodelPrefix, String targetPath) {
		this.cst = cst;
		this.transformation = transformation;
		this.mb = new ModelBuilder(pathMetamodel, metamodelPrefix);
		this.targetPath = targetPath;
		this.queryEngine = new QueryEngine(cst);
	}

	/**
	 * @param cst Concrete syntax tree 
	 * @param view Gra2MoL definition
	 * @param pathMetamodel Path to metamodel file
	 * @param metamodelPrefix Prefix of the main package of the metamodel
	 * @param targetPath Path to target model file
	 */
	public Gra2MoLInterpreter(Element cst, Transformation transformation, String pathMetamodel, String metamodelPrefix) {
		this.cst = cst;
		this.transformation = transformation;
		this.mb = new ModelBuilder(pathMetamodel, metamodelPrefix);
		this.targetPath = null;
		this.queryEngine = new QueryEngine(cst);
	}

	/**
	 * Initialize the indexRules variable. This variable is a hashmap used to index the rules.
	 * The key of the hashmap is the from metaelement and the content is a list with all standard rules.
	 */
	private void initIndexRules() {
		this.indexRules = new HashMap<String, List<StandardRule>>();
		Iterator<Rule> ruleIt = transformation.getRules().iterator();
		while(ruleIt.hasNext()) {
			Rule r = ruleIt.next();
			r.prepareQueryUnits();
			if (r instanceof StandardRule) {
				// Checks if the rule is standard (we leave skip rules out)
				StandardRule sr = (StandardRule) r;				
				String index = sr.getFrom().getName();
				List<StandardRule> content = indexRules.get(index);
				if(content == null) content = new ArrayList<StandardRule>();
				content.add(sr);
				indexRules.put(index, content);

			}
		}
	}

	/**
	 * Initialize the mixinRules variable. This variable is a hashmap used to index the mixin rules.
	 * The key of the hashmap is the name of the rule and the content is the mixin rule.
	 */
	private void initMixinRules() {
		this.mixinRules = new HashMap<String, MixinRule>();
		Iterator<Rule> ruleIt = transformation.getRules().iterator();
		while(ruleIt.hasNext()) {
			Rule r = ruleIt.next();
			r.prepareQueryUnits();
			if (r instanceof MixinRule) {
				MixinRule mr = (MixinRule) r;	
				String index = mr.getName();
				if(index != null) {
					mixinRules.put(mr.getName(), mr);
				}

			}
		}
	}

	/**
	 * Initialize the hashes variable. This variable stores the mappings structures
	 */
	private void initHashes() {
		hashes = new HashMap<String, HashMap<String,HashValue>>();

		Iterator<Hash> mappingIt = transformation.getHashes().iterator();
		while(mappingIt.hasNext()) {
			Hash map = mappingIt.next();
			HashMap<String, HashValue> hash = new HashMap<String, HashValue>();

			Iterator<HashValue> mvIt = map.getContent().iterator();
			while(mvIt.hasNext()) {
				HashValue mv = mvIt.next();
				hash.put(mv.getFromElement(), mv);
			}

			hashes.put(map.getName(), hash);
		}
	}

	/**
	 * Executes the view definition
	 * @return The target model
	 */
	public Model execute() {
		Gra2MoLLogger.getInstance().print("Executing interpreter..."); 

		Gra2MoLLogger.getInstance().print("Reading configuration file..."); 
		Gra2MoLConfiguration.createInstance(new File(Gra2MoLConfiguration.CONFIGURATION_FILE_PATH));
		
		// Main model
		this.m = mb.newModel("prueba");
		// Auxiliary model
		this.mAux = mb.newModel("pruebaAux");

		Gra2MoLLogger.getInstance().print("Models created.");

		this.executedRules = new HashMap<Rule, HashMap<Element, List<ModelElement>>>();

		// Initialize rules
		Gra2MoLLogger.getInstance().print("Initializing indexRules...");
		initIndexRules();

		// Initialize rules
		Gra2MoLLogger.getInstance().print("Initializing mixinRules...");
		initMixinRules();

		// Initialize metamodel packages
		Gra2MoLLogger.getInstance().print("Initializing packages...");
		mb.initPackages();

		// Initialize mappings structure
		Gra2MoLLogger.getInstance().print("Initializing hashes...");
		initHashes();

		// Executes the first rule
		if(transformation.getRules().size() > 0) {
			Rule r = getFirstExecutableRule();
			if (r instanceof StandardRule) {
				StandardRule sr = (StandardRule) r;
				try {
					Gra2MoLLogger.getInstance().print("\nExecuting rules...");
					
					// Retrieving the elements of from part
					sr.getFrom().getFilter().getFilter().setType(FilterType.RECURSIVE);
					List<Element> initialElements = queryEngine.executeQuery(sr, cst, sr.getFrom().getFilter());
					sr.getFrom().getFilter().getFilter().setType(FilterType.DIRECT);
					
					for(Element e : initialElements)
						interpretRule(e, r);

					if(this.targetPath != null) {
						Gra2MoLLogger.getInstance().print("\nSaving...");
						mb.save(this.m, targetPath);
					}
				} finally {
//					Gra2MoLLogger.getInstance().finalizeDebug();			
				}
			} else {
				Gra2MoLLogger.getInstance().print("\nThe first rule is not standard!!");
			}
		} else {
			Gra2MoLLogger.getInstance().print("\nThere are no rules!!");
			System.out.println("There are no rules!!");
		}
//		Gra2MoLLogger.getInstance().finalizeDebug();		

		return this.m;

	}

	/**
	 * Looks for the first executable rule in the transformation definition, that is, 
	 * the first standard rule
	 * @return
	 */
	private StandardRule getFirstExecutableRule() {
		StandardRule result = null;

		for(Rule r : transformation.getRules()) {
			if (r instanceof StandardRule) {
				StandardRule sr = (StandardRule) r;
				result = sr;
				break;				
			}
		}

		return result;
	}

	/**
	 * Entry point for interpreting a Gra2MoL rule.  
	 * @param actual The actual node 
	 * @param r The rule to execute
	 * @return
	 */
	public List<ModelElement> interpretRule(Element actual, Rule r) {
		return interpretRule(null, actual, r);
	}

	/**
	 * Entry point including context for interpreting a Gra2MoL rule.  
	 * @param actual The actual node 
	 * @param r The rule to execute
	 * @return
	 */
	public List<ModelElement> interpretRule(ModelElement context, Element actual, Rule r) {
		if (r instanceof StandardRule) {
			StandardRule sr = (StandardRule) r;

			Gra2MoLLogger.getInstance().print("RULE: " + r.getName());
			return interpretStandardRule(context, actual, sr);
		} else {
			Gra2MoLLogger.getInstance().print("RULE: " + r.getName() + " COULD NOT BE EXECUTED");
			return null;
		}
	}

	/**
	 * Interpret a Gra2MoL rule. It checks if the rule was previously executed. 
	 * @param context Previous ModelElement context
	 * @param actual The actual node 
	 * @param r The rule to execute
	 * @return
	 */
	public List<ModelElement> interpretStandardRule(ModelElement context, Element actual, StandardRule sr) {
		List<ModelElement> result = null;
		
		// If it is a copy rule, it is not necessary to check a preivous result
		if(sr.getType() == RuleType.COPY) {
			Gra2MoLLogger.getInstance().print("COPY_RULE: " + sr.getName());
		} else {
			Gra2MoLLogger.getInstance().print("RULE: " + sr.getName());
			// Checking if the rule has been executed previously
			result = checkRuleExecution(sr, actual);
		}

		// The rule was not executed previously
		if(result == null) {
			Gra2MoLLogger.getInstance().append("... executing!");
			result = interpretNewStandardRule(context, actual, sr);			
		} else {
			Gra2MoLLogger.getInstance().append("... cached!!");
		}
		return result;
	}

	/**
	 * Register the execution of a new rule
	 * @param r The rule
	 * @param node The parameter node
	 * @param me The created metaelement
	 */
	private void registerRuleExecution(Rule r, Element node, List<ModelElement> me) {
		HashMap<Element, List<ModelElement>> hm = (HashMap<Element, List<ModelElement>>) executedRules.get(r);
		if(hm == null) hm = new HashMap<Element, List<ModelElement>>();
		hm.put(node, me);
		executedRules.put(r, hm);			
	}

	/**
	 * Checks if the rule has been executed previously
	 * @param r The rule
	 * @param node The parameter node
	 * @return The created metaelement previously
	 */
	private List<ModelElement> checkRuleExecution(Rule r, Element node) {
		HashMap<Element, List<ModelElement>> hm = (HashMap<Element, List<ModelElement>>) executedRules.get(r);
		if(hm == null) return null;			
		List<ModelElement> me = hm.get(node);
		if(me != null) return me;
		return null;
	}	

	/**
	 * Interpret a new Gra2MoL standard rule
	 * @param context Previous ModelElement context
	 * @param actual The actual node
	 * @param r The rule to execute
	 * @return
	 */
	private List<ModelElement> interpretNewStandardRule(ModelElement context, Element actual, StandardRule sr) {
		if(sr.getType() == RuleType.SKIP) {
			return interpretNewSkipRule(context, actual, sr);
		} else {
			return interpretNewNormalRule(actual, sr);
		}
	}

	/**
	 * Interprets a mixin rule for a particular rule.
	 * @param mixinRuleName
	 * @param target
	 * @param source
	 * @param rule
	 */
	private void interpretMixin(String mixinRuleName, ModelElement target, Element source, StandardRule rule) {
		// Locating the mixin rule
		MixinRule mixinRule = mixinRules.get(mixinRuleName);
	
		if(mixinRule == null) {
			Gra2MoLLogger.getInstance().print("Reference to mixin rule called " + mixinRuleName + " not resolved");
		} else {
			Gra2MoLLogger.getInstance().print("MIXIN_RULE: " + mixinRuleName);
			Gra2MoLLogger.getInstance().incDeep();
			if(rule.getType() == RuleType.NORMAL) {
				interpretNormalMixin(mixinRule, target, source, rule);
			} else if (rule.getType() == RuleType.SKIP){
				interpretSkipMixin(mixinRule, target, source, rule);
			}
			Gra2MoLLogger.getInstance().decDeep();
		}
	}
	
	/**
	 * Interprets a mixin rule for a normal gra2mol rule
	 * @param mixinRule
	 * @param target
	 * @param source
	 * @param rule
	 */
	private void interpretNormalMixin(MixinRule mixinRule, ModelElement target, Element source, StandardRule rule) {
		// Execute queries region
		Gra2MoLLogger.getInstance().print("Executing queries...");
		HashMap<String, List<Element>> queries = executeQueries(source, mixinRule);

		// Debug
		Gra2MoLLogger.getInstance().printQuerySection(queries);

		// Initialize metaelement
		Gra2MoLLogger.getInstance().print("Executing mappings...");
		Gra2MoLLogger.getInstance().incDeep();

		// Executes the mapping actions
		executeMappingGroup(mixinRule.getInits(), target, queries, source, rule);

		Gra2MoLLogger.getInstance().append("\n");
		Gra2MoLLogger.getInstance().decDeep();
	}

	/**
	 * Interprets a mixin rule for a skip gra2mol rule
	 * @param mixinRule
	 * @param target
	 * @param source
	 * @param rule
	 */
	private void interpretSkipMixin(MixinRule mixinRule, ModelElement target, Element source, StandardRule rule) {
		
	}
	
	/**
	 * Interpret a new normal Gra2MoL rule
	 * @param actual The actual node
	 * @param r The rule to execute
	 * @return
	 */
	private List<ModelElement> interpretNewNormalRule(Element actual, StandardRule sr) {
		Gra2MoLLogger.getInstance().incDeep();

		// Create metaelement
		ModelElement meRule = mb.createModelElement(m, sr.getTo().getName());
		
		// Support for multiple results
		List<ModelElement> meRuleList = new ArrayList<ModelElement>();
		meRuleList.add(meRule);

		// Register the execution
		registerRuleExecution(sr, actual, meRuleList);

		Gra2MoLLogger.getInstance().print("Model Element " + sr.getTo().getName() + " created");

		// Checking the exixtence of mixin references
		if(sr.getMixins() != null && sr.getMixins().size() > 0) {
			for(String mixinRule : sr.getMixins()) {
				interpretMixin(mixinRule, meRule, actual, sr);
			}
		}
		
		// Execute queries region
		Gra2MoLLogger.getInstance().print("Executing queries...");
		HashMap<String, List<Element>> queries = executeQueries(actual, sr);

		// Debug
		Gra2MoLLogger.getInstance().printQuerySection(queries);

		// Initialize metaelement
		Gra2MoLLogger.getInstance().print("Executing mappings...");
		Gra2MoLLogger.getInstance().incDeep();

		// Executes the mapping actions
		executeMappingGroup(sr.getInits(), meRule, queries, actual, sr);

		Gra2MoLLogger.getInstance().append("\n");
		Gra2MoLLogger.getInstance().decDeep();

		Gra2MoLLogger.getInstance().decDeep();

		return meRuleList;
	}

	/**
	 * Interpret a new skip Gra2MoL rule
	 * @param context Previous ModelElement context
	 * @param actual The actual node
	 * @param r The rule to execute
	 * @return
	 */
	private List<ModelElement> interpretNewSkipRule(ModelElement context, Element actual, StandardRule sr) {
		// Gra2MoLDebugger.getInstance().incDeep();
		Gra2MoLLogger.getInstance().print("SKIP_RULE: " + sr.getName() + "... executing!");

		// Register the execution (commented: skip rule execution is not traced)
		// registerRuleExecution(r, actual, meRule);

		// Execute queries region
		Gra2MoLLogger.getInstance().print("Executing skip query...");
		HashMap<String, List<Element>> queries = executeQueries(actual, sr);

		// Debug
		Gra2MoLLogger.getInstance().printQuerySection(queries);

		// Executes the mapping actions
		return executeSkipMappingGroup(context, sr.getInits(), queries, sr);
	}

	private List<ModelElement> executeSkipElement(InitUnitElement iue, ModelElement context, Rule r, HashMap<String, List<Element>> queries) {
		if(iue.getValue().getType() != InitUnitElementValueType.SKIP) {
			Gra2MoLLogger.getInstance().print("skip statement not located! ");
			return null;
		}

		// Locate skip query
		Gra2MoLLogger.getInstance().print("Locating skip query... ");

		// Extracts the value of the skip command
		InitUnitElementValue iuev = iue.getValue();
		String var = "";
		if(iuev != null) var = iuev.getValue();

		// Extracts the result of the skip query
		List<Element> skipList = queries.get(var);
		if(skipList != null) {
			Gra2MoLLogger.getInstance().print("Skip statement located! ");

			// Variable which will store the result
			List<ModelElement> finalResult = new ArrayList<ModelElement>();

			Iterator<Element> skipListIt = skipList.iterator();
			while(skipListIt.hasNext()) {
				Element newActual = skipListIt.next();

				// Searching for the rule to execute
				RuleSolver ruleSolver = new RuleSolver(this, mb, r);
				Rule resolvedRule = ruleSolver.resolveRule(context, newActual);

				if(resolvedRule == null) {
					Gra2MoLLogger.getInstance().append("RULE TO SKIP NOT LOCATED!");
					return null;
				} else {
					// Skipping
					Gra2MoLLogger.getInstance().print("Skipping to rule...");
					List<ModelElement> resultElements = interpretRule(context, newActual, resolvedRule);

					// Adding the result elements to the final result list
					if(resultElements != null) {
						for(ModelElement rElem : resultElements) {
							finalResult.add(rElem);
						}
					}
				}
			}
			// Checking size of the final result list
			return (finalResult.size() == 0) ? null : finalResult;

		} else {
			Gra2MoLLogger.getInstance().append("SKIP VARIABLE DOESNT EXIST");
			return null;
		}
	}

	/**
	 * Executes the content of the skip initUnit group. It discriminates the type of the initUnit group
	 * @param iug InitUnit group to execute
	 * @param queries Result of the queries contained in queries section
	 * @param actual Element of CST asociated to the rule
	 * @param r Rule that contains the initUnit element
	 */
	private List<ModelElement> executeSkipMappingGroup(ModelElement context, InitUnitGroup iug, HashMap<String, List<Element>> queries, Rule r){
		if(iug.getType() == InitUnitGroupType.NORMAL || iug.getType() == InitUnitGroupType.ELSE) {
			// Execute the mappings
			Iterator<InitUnit> iuIt = iug.getInits().iterator();
			while(iuIt.hasNext()) {
				InitUnit iu = iuIt.next();
				if (iu instanceof InitUnitElement) {
					// The initUnit is a simple element
					InitUnitElement iue = (InitUnitElement) iu;
					return executeSkipElement(iue, context, r, queries);				
				} else if (iu instanceof InitUnitGroup) {
					// The initUnit is a group with more initUnit elements
					InitUnitGroup iug2 = (InitUnitGroup) iu;
					return executeSkipMappingGroup(context, iug2, queries, r);
				}
			}
		} else if(iug.getType() == InitUnitGroupType.IF) {
			Gra2MoLLogger.getInstance().print("- IF detected...");
			boolean expressionResult = false;
			// Checks the expression
			if(iug.getExpression() != null) {
				FilterExpression fe = iug.getExpression();
				CheckConditionalExpression cExp = new CheckConditionalExpression(fe, queries);
				expressionResult = cExp.evaluate();
			}
			if(expressionResult) {
				Gra2MoLLogger.getInstance().append("true!");
				// Execute the mappings assigned in IF group
				Iterator<InitUnit> iuIt = iug.getInits().iterator();
				while(iuIt.hasNext()) {
					InitUnit iu = iuIt.next();
					if (iu instanceof InitUnitElement) {
						// The initUnit is a simple element
						InitUnitElement iue = (InitUnitElement) iu;
						return executeSkipElement(iue, context, r, queries);		
					} else if (iu instanceof InitUnitGroup) {
						// The initUnit is a group with more initUnit elements
						InitUnitGroup iug2 = (InitUnitGroup) iu;
						// If the initUnitGroup is a ELSE element, it won't be executed!
						if(iug2.getType() != InitUnitGroupType.ELSE) {
							return executeSkipMappingGroup(context, iug2, queries, r);
						}
					}
				}
			} else {
				Gra2MoLLogger.getInstance().append("false! ");
				// Search the ELSE element, it must be at the end
				InitUnit iu = iug.getInits().get(iug.getInits().size()-1);
				if (iu instanceof InitUnitGroup) {
					Gra2MoLLogger.getInstance().append("executing ELSE part ");
					InitUnitGroup iug2 = (InitUnitGroup) iu;
					// Executes the ELSE group
					return executeSkipMappingGroup(context, iug2, queries, r);
				} else { 
					Gra2MoLLogger.getInstance().append("it doesn't have ELSE part ");
				}
			}
		}

		return null;
	}


	/**
	 * Executes the query region of a rule
	 * @param ruleNode The actual node of the CST
	 * @param rule Rule with the query region
	 * @return
	 */
	public HashMap<String, List<Element>> executeQueries(Element ruleNode, Rule rule) {
		return queryEngine.executeQueryRegion(rule, ruleNode);
	}

	/**
	 * Executes the content of the initUnit group. It discriminates the type of the initUnit group
	 * @param iug InitUnit group to execute
	 * @param meRule ModelElement created by the rule
	 * @param queries Result of the queries contained in queries section
	 * @param actual Element of CST asociated to the rule
	 * @param r Rule that contains the initUnit element
	 */
	private void executeMappingGroup(InitUnitGroup iug, ModelElement meRule, HashMap<String, List<Element>> queries, Element actual, Rule r){

		if(iug.getType() == InitUnitGroupType.NORMAL || iug.getType() == InitUnitGroupType.ELSE) {
			// Execute the mappings
			Iterator<InitUnit> iuIt = iug.getInits().iterator();
			while(iuIt.hasNext()) {
				InitUnit iu = iuIt.next();
				if (iu instanceof InitUnitElement) {
					// The initUnit is a simple element
					InitUnitElement iue = (InitUnitElement) iu;
					executeMappingElement(iue, meRule, queries, actual, r);				
				} else if (iu instanceof InitUnitGroup) {
					// The initUnit is a group with more initUnit elements
					InitUnitGroup iug2 = (InitUnitGroup) iu;
					Gra2MoLLogger.getInstance().incDeep();
					executeMappingGroup(iug2, meRule, queries, actual, r);
					Gra2MoLLogger.getInstance().decDeep();
				}
			}
		} else if(iug.getType() == InitUnitGroupType.IF) {
			Gra2MoLLogger.getInstance().print("- IF detected...");
			boolean expressionResult = false;
			// Checks the expression
			if(iug.getExpression() != null) {
				FilterExpression fe = iug.getExpression();
				CheckConditionalExpression cExp = new CheckConditionalExpression(fe, queries);
				expressionResult = cExp.evaluate();
			}
			if(expressionResult) {
				Gra2MoLLogger.getInstance().append("true!");
				// Execute the mappings assigned in IF group
				Iterator<InitUnit> iuIt = iug.getInits().iterator();
				while(iuIt.hasNext()) {
					InitUnit iu = iuIt.next();
					if (iu instanceof InitUnitElement) {
						// The initUnit is a simple element
						InitUnitElement iue = (InitUnitElement) iu;
						executeMappingElement(iue, meRule, queries, actual, r);		
					} else if (iu instanceof InitUnitGroup) {
						// The initUnit is a group with more initUnit elements
						InitUnitGroup iug2 = (InitUnitGroup) iu;
						// If the initUnitGroup is a ELSE element, it won't be executed!
						if(iug2.getType() != InitUnitGroupType.ELSE) {
							Gra2MoLLogger.getInstance().incDeep();
							executeMappingGroup(iug2, meRule, queries, actual, r);
							Gra2MoLLogger.getInstance().decDeep();
						}
					}
				}
			} else {
				Gra2MoLLogger.getInstance().append("false! ");
				// Search the ELSE element, it must be at the end
				if(iug.getInits().size() > 0) {
					InitUnit iu = iug.getInits().get(iug.getInits().size()-1);
					if (iu instanceof InitUnitGroup) {
						Gra2MoLLogger.getInstance().append("executing ELSE part ");
						InitUnitGroup iug2 = (InitUnitGroup) iu;
						// Executes the ELSE group
						Gra2MoLLogger.getInstance().incDeep();
						executeMappingGroup(iug2, meRule, queries, actual, r);
						Gra2MoLLogger.getInstance().decDeep();
					} else { 
						Gra2MoLLogger.getInstance().append("it doesn't have ELSE part ");
					}
				}
			}
		}
	}

	/**
	 * Execute the initUnit element. It creates a new Action in order to accomplish it  
	 * @param iue InitUnitElement to exectue
	 * @param meRule ModelElement created by the rule
	 * @param queries Result of the queries contained in queries section
	 * @param actual Element of CST asociated to the rule
	 * @param r Rule that contains the initUnit element
	 */
	private void executeMappingElement(InitUnitElement iue, ModelElement meRule, HashMap<String, List<Element>> queries, Element actual, Rule r){
		// Discriminate the type of the InitUnit Element and create the Action
		Gra2MoLInterpreterAction action = null;
		if(iue.getValue().getType() == InitUnitElementValueType.QUERY_ACCESS) {
			// The mapping is a query acces. For instance: property = node.leaf
			action = new QueryAccessAction(mb, m, meRule, queries, actual, r, iue);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_CONCAT) {
			// The mapping is a concat operation. For instance: property = "hello" + "oki"
			action = new OperationConcatAction(mb, m, meRule, queries, actual, r, iue);				
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_CREATION) {
			// The mapping is a creation operation. For instance: property = new MM::MetaClass
			action = new OperationCreationAction(mb, m, meRule, queries, actual, r, iue);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.HASH) {
			// The mapping is a hash. For instance: property = map okie("hello")
			action = new HashAction(mb, m, meRule, queries, actual, r, iue, hashes);				
		} else if (iue.getValue().getType() == InitUnitElementValueType.QUERY_RESULT) {
			// The mapping is a query result. For instance: property = resultQuery
			action = new QueryResultAction(mb, m, meRule, queries, actual, r, iue, this);				
		} else if (iue.getValue().getType() == InitUnitElementValueType.VALUE) {
			// The mapping is a value. For instance: property = "value"
			action = new ValueAction(mb, m, meRule, queries, actual, r, iue);
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_EXTRACT) {
			// The mapping is a code operation. For instance: property = code node
			action = new OperationExtractAction(mb, m, meRule, queries, actual, r, iue);			
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_EXTRACTID) {
			// The mapping is a code operation. For instance: property = code node
			action = new OperationExtractIDAction(mb, m, meRule, queries, actual, r, iue);							
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_CALL) {
			// The mapping is a imperative call. For instance: property = execute rule resultQuery
			action = new OperationCallAction(mb, m, meRule, queries, actual, r, iue, this);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_REMOVE_QUOTES) {
			// The mapping is a remove quotes call. For instance: property = removeQuotes node.leaf
			action = new OperationRemoveQuotesAction(mb, m, meRule, queries, actual, r, iue);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_COUNT) {
			// The mapping is a remove quotes call. For instance: property = removeQuotes node.leaf
			action = new OperationCountAction(mb, m, meRule, queries, actual, r, iue);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_CONVERTH2S) {
			// The mapping is a remove quotes call. For instance: property = removeQuotes node.leaf
			action = new OperationConvertHexToStringAction(mb, m, meRule, queries, actual, r, iue);					
		} else if (iue.getValue().getType() == InitUnitElementValueType.OPERATION_EXTENSION) {
			// The mapping is a remove quotes call. For instance: property = removeQuotes node.leaf
			action = new OperationExtensionAction(mb, m, meRule, queries, actual, r, iue, this);					
		}
		// Executes the rule
		if(action != null) action.execute();
		else Gra2MoLLogger.getInstance().print("NO ACTION FOUND!");
	}

	public Model getMAux() {
		return mAux;
	}
	public HashMap<String, List<StandardRule>> getIndexRules() {
		return indexRules;
	}

	public List<Rule> getRules() {
		return transformation.getRules();
	}

	public Element getCst() {
		return cst;
	}

	public HashMap<Rule, HashMap<Element, List<ModelElement>>> getExecutedRules() {
		return executedRules;
	}

	public QueryEngine getQueryEngine() {
		return queryEngine;
	}



}
