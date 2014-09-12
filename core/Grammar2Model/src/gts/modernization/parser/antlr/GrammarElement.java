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

import java.util.List;

/**
 * This class is used for representing grammar elements. It allows grammar enricher to model the 
 * grammar rule alterntives
 * @author jlcanovas
 *
 */
public class GrammarElement {
	public static final String RULE = "RULE";
	public static final String TERMINAL = "TERMINAL";
	public static final String TOKEN = "TOKEN";
	public static final String EBNF = "EBNF";
	public static final String ACTION = "ACTION";
	public static final String PREFIX = "PREFIX";

	public static final String CLOSURE = "CLOSURE";
	public static final String PCLOSURE = "PCLOSURE";
	public static final String OPTIONAL = "OPTIONAL";
	public static final String ALTERNATIVE = "ALTERNATIVE";

	private String id;
	private String type;
	private String content;
	private String rule;
	private int pos;
	private int line;
	private boolean aggregation;
	private boolean autoId;
	private List<GrammarElement> complex;

	public GrammarElement() {
		super();
		this.rule = "";
		this.id = "";
		this.type = "";
		this.content = "";
		this.complex = null;
		this.aggregation = false;
		this.autoId = false;
	}

	public GrammarElement(String rule, String id, String type, String content, List<GrammarElement> complex) {
		super();
		this.rule = rule;
		this.id = id;
		this.type = type;
		this.content = processContent(content);
		this.complex = complex;
		this.aggregation = false;
		this.autoId = false;
	}

	public GrammarElement(String rule, String id, String type, String content) {
		super();
		this.rule = rule;
		this.id = id;
		this.type = type;
		this.content = processContent(content);
		this.aggregation = false;
		this.autoId = false;
	}

	public GrammarElement(String rule, String id, String type, String content, int pos, int line) {
		super();
		this.rule = rule;
		this.id = id;
		this.type = type;
		this.content = processContent(content);
		this.pos = pos;
		this.line = line;
		this.aggregation = false;
		this.autoId = false;
	}
	
	public GrammarElement(String rule, String id, String type, String content, int pos, int line, boolean aggregation, boolean autoId) {
		super();
		this.rule = rule;
		this.id = id;
		this.type = type;
		this.content = processContent(content);
		this.pos = pos;
		this.line = line;
		this.aggregation = aggregation;
		this.autoId = autoId;
	}
	
	public boolean isAggregation() {
		return aggregation;
	}

	public void setAggregation(boolean aggregation) {
		this.aggregation = aggregation;
	}

	public boolean isAutoId() {
		return autoId;
	}

	public void setAutoId(boolean autoId) {
		this.autoId = autoId;
	}

	/**
	 * Checks if the type (String) is equals to the type
	 * @param type
	 * @return
	 */
	public boolean checkType(String type) {
		if(this.type != null) return this.type.equals(type);
		else return false;
	}

	/**
	 * checks if the ID (String) is equals to the type
	 * @param id
	 * @return
	 */
	public boolean checkId(String id) {
		if(this.type != null) return this.id.equals(id);
		else return false;		
	}
	
	public boolean checkIdContains(String chain) {
		int index = this.id.indexOf(chain);
		if(index >= 0) return true;
		else return false;
	}

	public String processContent(String content) {
		String sol = content;

		// Delete the ' characters
		if(content != null) {
			int index = sol.indexOf("'");
			if(index >= 0) {
				sol = content.substring(index+1, content.lastIndexOf("'"));		
			}
		}

		// Insert the escape character for %
		if(content != null) {
			int index = sol.indexOf("%");
			if(index >= 0) {
				if(index == 0) sol = "\\" + sol;
				index = sol.indexOf("%", index);
				while(index > 2) {
					sol = sol.substring(0, index) + "\\" + sol.substring(index+2, sol.length());		
				}
//				System.out.println("PROCESADO: " + content + " " + sol);
			}
		}



		return sol;
	}

	public boolean checkContent(String content) {
		return this.content.equals(content);
	}

	public boolean checkContentContains(String chain) {
		int index = this.content.indexOf(chain);
		if(index >= 0) return true;
		else return false;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = processContent(content);
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public void addComplex(GrammarElement ge) {
		complex.add(ge);
	}

	public void setComplex(List<GrammarElement> complex) {
		this.complex = complex;
	}

	public List<GrammarElement> getComplex() {
		return complex;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public GrammarElement clone() {
		GrammarElement ge = new GrammarElement(this.rule, this.id, this.type, this.content, this.complex);
		return ge;
	}

	public String toString() {
		return "Type: " + this.getType() + " Iden: " + this.getId() + " Content: " + this.getContent() + " (" + this.getLine() + "," + this.getPos() + ") Aggregation: "  + ((this.isAggregation()) ? "true" : "false") + " AutoID: " + ((this.isAutoId()) ? "true" : "false");
	}
	
	public boolean checkAllTypeComplex(String type) {
		boolean sol = true;
		for(int i = 0; i < this.getComplex().size(); i++) {
			GrammarElement meItem = this.getComplex().get(i);
			if(!meItem.getType().equals(type)) sol = false;
		}
		return sol;
	}
}
