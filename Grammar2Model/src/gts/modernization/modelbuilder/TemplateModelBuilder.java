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

import gts.modernization.parser.antlr.GrammarElement;

import java.io.FileReader;
import java.util.List;

import org.antlr.stringtemplate.StringTemplateGroup;

/**
 * This class uses an ANTLR StringTemplate template in order to generate the text to be included in the 
 * enriched grammar. 
 * @author jlcanovas
 *
 */
abstract public class TemplateModelBuilder {
	protected StringTemplateGroup groupTemplate;

	public TemplateModelBuilder(String id, String path) {
		try {
			FileReader fr = new FileReader(path);
			groupTemplate= new StringTemplateGroup(fr);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the action for the elements production rule
	 * @param elements Clean list of grammar elements
	 * @return String with the action
	 */
	abstract public String inferElementAction(String grammar, String ruleName, List<GrammarElement> elements);
	
	/**
	 * Create the fixed header of the main rule
	 * @param ruleName
	 * @return
	 */
	abstract public String newMainRuleHeader(String ruleName);
	
	/**
	 * Create the fixed header of all rules (non main rules)
	 * @param ruleName
	 * @return
	 */
	abstract public String newRuleHeader(String ruleName);
	
	/**
	 * Create the fixed footer of the main rule
	 * @param ruleName
	 * @return
	 */
	abstract public String newMainRuleFooter(String ruleName);
	
	/**
	 * Create the fixed footer of all rules (non main rules)
	 * @param ruleName
	 * @return
	 */
	abstract public String newRuleFooter(String ruleName);

	/**
	 * Create a new output region
	 * @return
	 */
	abstract public String insertGrammarOutput(String before, String after);
	
	/**
	 * Insert the necessary output options in the actual options region of the grammar
	 * @param before The text before the insertion
	 * @param after The text after the insertion
	 * @return 
	 */
	abstract public String insertOutputIntoOptions(String before, String after);
	
	/**
	 * Create a new import region
	 * @return
	 */
	abstract public String insertGrammarImport(String rule);
	
	/**
	 * Insert the necessary imports in the actual imports region of the grammar
	 * @param before The text before the insertion
	 * @param after The text after the insertion
	 * @return 
	 */
	abstract public String insertImportIntoHeader(String before, String after);
	
	/**
	 * Insert a new return in a rule
	 * @param before String before the insertion
	 * @param after String after the insertion
	 * @return String builds from before + return + after
	 */
	abstract public String insertRuleReturn(String before, String after);
	
	/**
	 * Insert a return in a list of return parameters
	 * @param actualReturn Actual list of return parameters
	 * @return String with the actualReturn plus the new return
	 */
	abstract public String insertReturnIntoRuleReturn(String actualReturn);
	
	/**
	 * Insert the statements needed to call a parser for the island grammar
	 * @param ruleName
	 * @param islandGrammaName
	 * @param id
	 * @return
	 */
	abstract public String insertIslandNode(String ruleName, String islandGrammaName, String id);
}
