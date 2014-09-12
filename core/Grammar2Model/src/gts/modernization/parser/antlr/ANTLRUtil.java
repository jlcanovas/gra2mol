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


package gts.modernization.parser.antlr;

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.modelbuilder.CSTTemplateModelBuilder;
import gts.modernization.modelbuilder.TemplateModelBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * This class is used by the Gra2MoL grammar enricher tool. 
 * @author jlcanovas
 *
 */
public class ANTLRUtil {
	private static TemplateModelBuilder template;
	private static String grammarName;
	private static HashMap<String, String> ids;
	private static int tokenIds;

	static public void initialize(String grammar, String pathTemplates) {
		template = new CSTTemplateModelBuilder(pathTemplates);
		grammarName = grammar;
		Gra2MoLLogger.getInstance().print("Grammar Name: " + grammarName);
	}

	/**
	 * Test if the rule is a parser rule 
	 * @param ruleName Name of the rule
	 * @return Boolean that indicates if the rule is a parser rule
	 */
	static public boolean isParserRule(String ruleName) {
		return ruleName.charAt(0) != ruleName.toUpperCase().charAt(0);
//		return !ruleName.equals(ruleName.toUpperCase());
	}

	/**
	 * Transform '=' assignments in '+=' assignments in RULE type rules
	 * @param type Type of the rule (TERMINAL or RULE)
	 * @param rule Text of the rule
	 * @return Rule transformed
	 */
	static public String correctAssign(String type,String rule) {
		String sol = rule;

		if(type == null || type.equals(GrammarElement.TERMINAL)) return rule;

		int index = rule.indexOf("+=");
		if(index < 0) {
			index = rule.indexOf("=");
			String before = rule.substring(0, index);
			String after = rule.substring(index, rule.length());
			sol = before + "+" + after;
		}
		return sol;
	}

	/**
	 * Create the rewrite rule
	 * @param ruleName Name of the rule 
	 * @param elements List of grammar elements
	 * @return String with the rewrite rule
	 */
	static public String createRewriteRule(String ruleName, List<G2Ge.element_return> elements, boolean mainRule) {
		// Filter Lexer vs Grammar Rules
		if(!isParserRule(ruleName)) return null;

//		System.out.println("RULE : " + ruleName + " Productions:" + elements.size());
		List<GrammarElement> productionRule = cleanProductionRule(ruleName, elements);
//		printProductionRule(productionRule, 0);
		String action = inferAction(ruleName, productionRule, mainRule);		
		
		return action;
	}

	static public void initIds() {
		ids = new HashMap<String, String>();
		tokenIds = 0;
	}

	static public String createTokenId() {				
		return "TK_" + String.valueOf(tokenIds++);
	}

	static public String createId(String ruleName) {
		String sol = "";

		if(ruleName.charAt(0) == '\'') return GrammarElement.TOKEN;

		String exists = ids.get(ruleName);
		if(exists != null) {
			// The id exists
			// We have to check if the ruleName is a parser rule or not
//			if(!isParserRule(ruleName)) {
			// The ruleName is not a parser rule
			sol = nextId(exists);
			ids.put(ruleName, sol);
//			} else {
			// The ruleName is a parser rule
//			sol = exists;
//			}
		} else {
			// The id dont exists. We create one
			sol = ruleName + "Gen";
			ids.put(ruleName, sol);
		}

		return sol;
	}

	static private boolean isNumber(String id) {
		Pattern p = Pattern.compile("([0-9])*");
		Matcher m = p.matcher(id);
		boolean b = m.matches();
		return b;
	}
	
	static private String nextId(String id) {
		String sol = id;

		int index = id.lastIndexOf("_");
		String subs = id.substring(index+1, id.length());
		
		if(index < 0 || !isNumber(subs)) {
			sol = id + "_1";
		} else {
			int a = Integer.valueOf(id.substring(index+1, id.length())).intValue();
			String coreId = id.substring(0, index);
			sol = coreId + "_" + ++a;
		}

		return sol;
	}


	static private String inferAction(String ruleName, List<GrammarElement> elements, boolean mainRule) {
		// Checking if it is an island call
		GrammarElement gei = elements.get(0);
		String content = gei.getContent();
		
		if(content.indexOf("Island") > 1) {
			return inferIslandAction(ruleName, elements, mainRule);
		} else {
			return inferNormalAction(ruleName, elements, mainRule);
		}
	}
	
	static private String inferIslandAction(String ruleName, List<GrammarElement> elements, boolean mainRule)  {
		GrammarElement gei = elements.get(0);
		String content = gei.getContent(); 
		
		String islandGrammarName = content.substring(content.indexOf("Island")+6, content.length());
		System.out.println("Located Island Grammar: " + islandGrammarName);
		
		String sol ="";
		
		if(mainRule) sol += template.newMainRuleHeader(ruleName);
		else sol += template.newRuleHeader(ruleName);
		sol += template.insertIslandNode(ruleName, islandGrammarName, content);
		if(mainRule) sol += template.newMainRuleFooter(ruleName);
		else sol += template.newRuleFooter(ruleName);

		return sol;
		
	}
	
	/**
	 * Create the action for a normal production rule. Adds the header, the elements to build the CST and footer.
	 * @param elements Clean list of grammar elements
	 * @return String with the action
	 */
	static private String inferNormalAction(String ruleName, List<GrammarElement> elements, boolean mainRule) {	
		String sol ="";

		String templateSol = template.inferElementAction(grammarName, ruleName, elements);

//		if(!templateSol.equals("")) {
		if(mainRule) sol += template.newMainRuleHeader(ruleName);
		else sol += template.newRuleHeader(ruleName);
		sol += templateSol;
		if(mainRule) sol += template.newMainRuleFooter(ruleName);
		else sol += template.newRuleFooter(ruleName);
//		}

		return sol;
	}

	/**
	 * Print the Production Rule
	 * @param elements List with GrammarElement
	 * @param deep Tabulation
	 */
	static private void printProductionRule(List<GrammarElement> elements, int deep) {
		Iterator<GrammarElement> it = elements.iterator();
		while(it.hasNext()) {
			GrammarElement ge = (GrammarElement) it.next();
			for(int i = 0; i < (2*deep); i++) { System.out.print(" "); }
			System.out.print(ge.toString() + "\n");
			if(ge.getComplex() != null) {
				printProductionRule(ge.getComplex(), deep+1);
			}
		}
	}

	/**
	 * This method cleans the production rule. It works with the grammar elements List and filters the elements
	 * of the grammar (e.g. G2Ge.element_return, etc)
	 * @param elements List of grammar elements 
	 * @return List with only GrammarElement
	 */
	static private List<GrammarElement> cleanProductionRule(String rule, List<G2Ge.element_return> elements) {
		List<GrammarElement> sol = new ArrayList<GrammarElement>();

		if(elements != null) {
			Iterator<G2Ge.element_return> it = elements.iterator();
			while(it.hasNext()) {
				G2Ge.element_return ret = (G2Ge.element_return) it.next();
				GrammarElement geSol = new GrammarElement(rule, ret.id, ret.type, ret.content, ret.pos, ret.line, ret.aggregation, ret.autoId);
//				System.out.println(geSol.toString());
				if(ret.complex != null) {
					geSol.setComplex(cleanComplex(rule, ret.complex));
				}
				sol.add(geSol);
			}
		}
		return sol;
	}

	/**
	 * This method is an auxiliar function to clean the production rules. It works with an especial type of ANTLR 
	 * grammar (G2Ge.alternative_return)
	 * @param elements List of grammar elements
	 * @return List with only GrammarElement
	 */
	static private List<GrammarElement> cleanComplex(String rule, List<G2Ge.alternative_return> elements) {
		List<GrammarElement> sol;

		if(elements.size() == 1) {
			G2Ge.alternative_return o = (G2Ge.alternative_return) elements.get(0);
			sol = cleanProductionRule(rule, o.units);
		} else {
			sol = new ArrayList<GrammarElement>();
			Iterator<G2Ge.alternative_return> it = elements.iterator();
			while(it.hasNext()) {	
				G2Ge.alternative_return o = (G2Ge.alternative_return) it.next();
				GrammarElement geSol = new GrammarElement(rule, GrammarElement.ALTERNATIVE, GrammarElement.ALTERNATIVE, GrammarElement.ALTERNATIVE);
				geSol.setComplex(cleanProductionRule(rule, o.units));
				sol.add(geSol);
			}
		}
		return sol;
	}

	/**
	 * @param rule
	 * @return
	 * @deprecated
	 */
	static public String insertReturnOld(String rule) {		
		int index = 0;

		int indexOp = rule.indexOf("options");
		int indexP = rule.indexOf(":");

		if(indexOp > 0 && indexOp < indexP) index = indexOp;
		else index = indexP;
		
		int indexAt = rule.indexOf("@");
		if(indexAt > 0 && indexAt < indexOp && indexAt < indexP) index = indexAt;
		else index = indexP;
		
		String before = rule.substring(0, index);
		String after = rule.substring(index, rule.length());
		
		return template.insertRuleReturn(before, after);
	}
	

	static public String insertReturnIntoReturn(String actualReturn) {		
		return template.insertReturnIntoRuleReturn(actualReturn);
	}

	static public String addHeader(String rule) {		
		return template.insertGrammarImport(rule);
	}

	static public String insertHeader(String header) {		
		int index = header.indexOf('}');
		String before = header.substring(0, index);
		String after = header.substring(index, header.length());

		return template.insertImportIntoHeader(before, after);
	}

	static public String addOutput(String grammar) {
		int indexGrammar = grammar.indexOf("*/");
		int index = (indexGrammar < 0) ? grammar.indexOf(';', indexGrammar) : grammar.indexOf(';', indexGrammar);
		String before = grammar.substring(0, index+1);
		String after = grammar.substring(index+1, grammar.length());

		return template.insertGrammarOutput(before, after);
	}

	static public String insertOutput(String grammar) {		
		int index = grammar.indexOf('}');
		
		String before = grammar.substring(0, index);		
		String after = grammar.substring(index, grammar.length());

		before = removeASTtemplateOption(before);
		after = removeASTtemplateOption(after);
		
		return template.insertOutputIntoOptions(before, after);
	}
	
	static private String removeASTtemplateOption(String options) {
		int index = options.indexOf("output=AST;");

		String sol = options;
		if(index > 0) {
			String before = options.substring(0, index);		
			String after = options.substring(index+"output=AST;".length(), options.length());
			sol = before + after;
		}
		
		return sol;
	}
	
	static public String insertReturn(String rule){
		int pivot = 0, index = 0;
		char c;
		do {
			c = rule.charAt(pivot++);
			index++;
		} while (c != ':' && c != ' ' && c != '\t' && c != '\n' && c != 13);
		
		String before = rule.substring(0, index-1);
		String after = rule.substring(index-1, rule.length());
		
		index = 0; pivot = 0;
		do {
			c = after.charAt(pivot++);
			index++;
		} while (c == ' ' || c == '\t' || c == '\n' || c == 13);
		after = after.substring(index-1, after.length());
		
		return template.insertRuleReturn(before, after);
		
	}
	
	/**
	 * Analizes the recived text and removes the last character if it is ^ or ! (AST special characters)
	 * @param text
	 * @return
	 */
	static public String removeASTCharacters(String text) {
		String sol = text;
		
		char lastChar = text.charAt(text.length()-1);
		if(lastChar == '^' || lastChar == '!') {
			sol = text.substring(0, text.length()-1);
		}
		
		return sol;
	}
	
	public static void main(String[] args) {
		ANTLRUtil.initialize("PLSQL3", "templates/G2Ge.stg");
//		System.out.println(insertReturn("schema_name\n	:	sql_identifier\n	;"));
//		System.out.println(insertReturn("plsql_condition\n		@init { is_sql = false; }\n	:	expr_bool"));
		System.out.println(insertReturn("procedure_spec:\n@init{}\n			'PROCEDURE' procedure_name\n			( LPAREN arguments RPAREN )? SEMI\n		;"));
		
		
	}
}
