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


package gts.modernization.modelbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import gts.modernization.parser.antlr.GrammarElement;

import org.antlr.stringtemplate.StringTemplate;

public class CSTTemplateModelBuilder extends TemplateModelBuilder {
	private HashMap<String, List<String>> createdElements;

	public CSTTemplateModelBuilder(String pathTemplates) {
		super("G2Ge", pathTemplates);
		this.createdElements = new HashMap<String, List<String>>();
	}

	/**
	 * Create the action for the elements production rule
	 * @param elements Clean list of grammar elements
	 * @return String with the action
	 */
	public String inferElementAction(String grammar, String ruleName, List<GrammarElement> elements) {
		return inferElementActionUnit(new ArrayList<String>(), grammar, ruleName, elements, false);
	}

	
	/**
	 * Creates the actions for each element of the production rule
	 * @param ruleCreatedElements
	 * @param grammar
	 * @param ruleName
	 * @param elements
	 * @param inClosure
	 * @return
	 */
	private String inferElementActionUnit(List<String> ruleCreatedElements, String grammar, String ruleName, List<GrammarElement> elements, boolean inClosure) {
		String sol ="";

		Iterator<GrammarElement> it = elements.iterator();
		while(it.hasNext()) {
			GrammarElement ge = (GrammarElement) it.next();

			if(ge.checkType(GrammarElement.TERMINAL) && !ge.checkId(GrammarElement.TOKEN)) {
				// If it is a terminal and has been annotated 
				// TODO: Actually all nodes has annotations so the second condition is not necessary
				
				// First, we extract the kind of the element
				String kind = ge.getContent();
				// If it has not been automatically established (it has been set by the user)
				// we take the Id manually set.
				if(!ge.isAutoId()) kind = ge.getId();
				
				if(!ge.isAggregation() && !ge.checkIdContains("TK_")) {
					// The element is not contained in a Aggregation and it is not a TOKEN
					sol += newNormalLeaf(ruleName, ge.getId(), kind, ge.getPos(), ge.getLine());
				} else if(ge.checkIdContains("TK_")) {
					// The element is not contained in a Aggregation and it is a TOKEN
					// TODO: Can kind parameter be assigned to "TOKEN" and newTokenLeaf and newNormalLeaf 
					//       share the implementation?
					sol += newTokenLeaf(ruleName, ge.getId(), kind, ge.getPos(), ge.getLine());					
				} else if (inClosure && ge.isAggregation()) {
					// The element is contained in a aggregation
					// TODO: Why am I checking as inClosure as isAggregation? (it is not checked in line 83)
					sol += newTerminalExtractor(grammar, ruleName, ge.getId(), kind);
				}
			} else if (ge.checkType(GrammarElement.RULE) && !ge.checkId(GrammarElement.TOKEN)) {
				// If it is a rule 
				// TODO: Why am I checking that the ID is not TOKEN?
				
				// TODO: Factorize the following code!!!
				// First, we extract the kind of the element
				String kind = ge.getContent();
				// If it has not been automatically established (it has been set by the user)
				// we take the Id manually set.
				if(!ge.isAutoId()) kind = ge.getId();
				
				if(!inClosure) {
					// The element is not contained in a Aggregation so we creates the code for nodes
					sol += newNode(grammar, ruleName, ge.getId(), kind, ge.getContent());
					ruleCreatedElements.add(ge.getContent());
				} else {
					// The element is contained in a aggregation
					sol += newNoTerminalExtractor(grammar, ruleName, ge.getId(), kind, ge.getContent());
					ruleCreatedElements.add(ge.getContent());					
				}
			} else if (ge.getComplex() != null && (ge.checkType(GrammarElement.EBNF) || ge.checkType(GrammarElement.ALTERNATIVE) || ge.checkType(GrammarElement.PREFIX))) {
				// It is an aggregation
				
				if(ge.getContent() != null && ge.checkContentContains("CLOSURE") && ge.getComplex().size() > 1) {
					sol += newClosure(ruleCreatedElements, grammar, ruleName, ge);
				} else if (ge.checkType(GrammarElement.PREFIX)) {
					sol += newPrefix(ruleCreatedElements, grammar, ruleName, ge);					
				} else {
					sol += inferElementActionUnit(ruleCreatedElements, grammar, ruleName, ge.getComplex(), inClosure);
				}
			}
		}

		return sol;
	}

	private GrammarElement locateAggregation(GrammarElement ge) {
		GrammarElement choosed = null;

		Iterator<GrammarElement> it = ge.getComplex().iterator();
		while(it.hasNext() && choosed == null) {
			GrammarElement e = it.next();
			if(e.isAggregation()) {
				choosed = e;
			} else if(e.checkType(GrammarElement.ALTERNATIVE)) {
				choosed = locateAggregation(e);
			}
		}


		return choosed;
	}

	private String newClosure(List<String> ruleCreatedElements, String grammar, String ruleName, GrammarElement ge) {
		String sol = "";


		if(ge.checkAllTypeComplex("ALTERNATIVE")) {
			for(int i = 0; i < ge.getComplex().size(); i++) {
				GrammarElement geItem = ge.getComplex().get(i);

				GrammarElement choosed = locateAggregation(geItem);		
				if(choosed != null) {
					StringTemplate pre = groupTemplate.getInstanceOf("createPreClosure");
					pre.setAttribute("control", choosed.getId());
					sol += pre.toString();

					sol += inferElementActionUnit(ruleCreatedElements, grammar, ruleName, geItem.getComplex(), true);

					StringTemplate  post = groupTemplate.getInstanceOf("createPostClosure");
					sol += post.toString();
				} else {
					sol += inferElementActionUnit(ruleCreatedElements, grammar, ruleName, geItem.getComplex(), true);
				}
			}
		} else {
			GrammarElement choosed = locateAggregation(ge);
			if (choosed != null) {
				StringTemplate pre = groupTemplate.getInstanceOf("createPreClosure");
				pre.setAttribute("control", choosed.getId());
				sol += pre.toString();

				sol += inferElementActionUnit(ruleCreatedElements, grammar, ruleName, ge.getComplex(), true);

				StringTemplate  post = groupTemplate.getInstanceOf("createPostClosure");
				sol += post.toString();
			} else {
				sol += inferElementActionUnit(ruleCreatedElements, grammar, ruleName, ge.getComplex(), true);
			}
		}
		return sol;
	}

	private String newPrefix(List<String> ruleCreatedElements, String grammar, String ruleName, GrammarElement ge) {
		String sol = "";

		StringTemplate pre = groupTemplate.getInstanceOf("createPrePrefix");
		pre.setAttribute("control", ge.getId());
		sol += pre.toString();

		sol += inferElementActionUnit(ruleCreatedElements, grammar, ge.getId(), ge.getComplex(), false);

		StringTemplate post = groupTemplate.getInstanceOf("createPostPrefix");
		post.setAttribute("ruleName", ruleName);
		post.setAttribute("control", ge.getId());
		sol += post.toString();

		return sol;
	}

	private String newTerminalExtractor(String grammar, String ruleName, String id, String kind) {
		StringTemplate temp = groupTemplate.getInstanceOf("createTerminalExtractor");
		temp.setAttribute("grammar", grammar);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("kind", kind);

		return temp.toString();
	}

	private String newNoTerminalExtractor(String grammar, String ruleName, String id, String kind, String realKind) {
		StringTemplate temp = groupTemplate.getInstanceOf("createNoTerminalExtractor");
		temp.setAttribute("grammar", grammar);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("kind", kind);
		temp.setAttribute("realKind", realKind);

		return temp.toString();
	}

	private String newNormalLeaf(String ruleName, String id, String kind, int pos, int line) {
		return newLeaf("createNormalLeaf", ruleName, id, kind, pos, line);
	}

	private String newTokenLeaf(String ruleName, String id, String kind, int pos, int line) {		
		return newLeaf("createTokenLeaf", ruleName, id, kind, pos, line);
	}

	private String newLeaf(String template, String ruleName, String id, String kind, int pos, int line) {
		StringTemplate temp = groupTemplate.getInstanceOf(template);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("kind", kind);
		temp.setAttribute("pos", String.valueOf(pos));
		temp.setAttribute("line", String.valueOf(line));

		return temp.toString();
	}

	private String newNode(String grammar, String ruleName, String id, String kind, String realKind) {
		StringTemplate temp = groupTemplate.getInstanceOf("createNode");
		temp.setAttribute("grammar", grammar);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("kind", kind);
		temp.setAttribute("realKind", realKind);

		return temp.toString();
	}


	private String newNode4LeafAggregation(String grammar, String ruleName, String id, int pos, int line) {
		StringTemplate temp = groupTemplate.getInstanceOf("createNode4LeafAggregation");
		temp.setAttribute("grammar", grammar);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("pos", String.valueOf(pos));
		temp.setAttribute("line", String.valueOf(line));

		return temp.toString();
	}


	private String reuseNode(String grammar, String ruleName, String id, String kind) {
		StringTemplate temp = groupTemplate.getInstanceOf("reuseNode");
		temp.setAttribute("grammar", grammar);
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("kind", kind);

		return temp.toString();
	}

	public String newMainRuleHeader(String ruleName) {
		StringTemplate temp = groupTemplate.getInstanceOf("createMainRuleHeader");
		temp.setAttribute("ruleName", ruleName);

		return temp.toString();
	}

	public String newRuleHeader(String ruleName) {
		StringTemplate temp = groupTemplate.getInstanceOf("createRuleHeader");
		temp.setAttribute("ruleName", ruleName);

		return temp.toString();
	}

	public String newMainRuleFooter(String ruleName) {
		StringTemplate temp = groupTemplate.getInstanceOf("createMainRuleFooter");
		temp.setAttribute("ruleName", ruleName);

		return temp.toString();
	}

	public String newRuleFooter(String ruleName) {
		StringTemplate temp = groupTemplate.getInstanceOf("createRuleFooter");
		temp.setAttribute("ruleName", ruleName);

		return temp.toString();
	}

	public String insertGrammarImport(String rule) {		
		StringTemplate temp = groupTemplate.getInstanceOf("insertGrammarImport");
		temp.setAttribute("rule", rule);

		return temp.toString();
	}

	public String insertImportIntoHeader(String before, String after) {		
		StringTemplate temp = groupTemplate.getInstanceOf("insertImportIntoHeader");
		temp.setAttribute("before", before);
		temp.setAttribute("after", after);

		return temp.toString();
	}

	public String insertRuleReturn(String before, String after) {
		StringTemplate temp = groupTemplate.getInstanceOf("insertRuleReturn");
		temp.setAttribute("before", before);
		temp.setAttribute("after", after);

		return temp.toString();
	}


	public String insertReturnIntoRuleReturn(String actualReturn) {
		StringTemplate temp = groupTemplate.getInstanceOf("insertReturnIntoGrammarRuleReturn");
		temp.setAttribute("assign", actualReturn);

		return temp.toString();
	}


	public String insertGrammarOutput(String before, String after) {
		StringTemplate temp = groupTemplate.getInstanceOf("insertGrammarOutput");
		temp.setAttribute("before", before);
		temp.setAttribute("after", after);
		return temp.toString();
	}

	public String insertOutputIntoOptions(String before, String after) {
		StringTemplate temp = groupTemplate.getInstanceOf("insertOutputIntoOptions");
		temp.setAttribute("before", before);
		temp.setAttribute("after", after);
		return temp.toString();
	}

	@Override
	public String insertIslandNode(String ruleName, String islandGrammaName, String id) {
		StringTemplate temp = groupTemplate.getInstanceOf("createIslandNode");
		temp.setAttribute("ruleName", ruleName);
		temp.setAttribute("id", id);
		temp.setAttribute("islandGrammarName", islandGrammaName);
		return temp.toString();
	}

}
