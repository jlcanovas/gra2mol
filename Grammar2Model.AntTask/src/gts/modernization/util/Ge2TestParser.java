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


package gts.modernization.util;

import java.io.FileWriter;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * @author Javier Canovas
 *
 * Use in ANT:
 * 		<taskdef name="Ge2TestParser" classname="gts.modernization.util.Ge2TestParser" classpathref="path.taskdef"/>
		<Ge2TestParser 
			pathLanguage="${pathLanguage}"
			grammar="${grammarName}" 
			mainRule="${grammarMainRule}" 
			resultParser="${resultParser}" 
			result="${resultGen}" 
			pathTemplate="${templateParser}"
		/>
 *
 * Execution en ANT:
 * 		<java classname="${grammarName}Test">
			<classpath>
				<path refid="path.taskdef" />
			</classpath>
		</java>
 *		
 */
public class Ge2TestParser extends Task {
	private String grammar = null;
	private String mainRule = null;
	private String result;
	private String resultParser = "noDefined";
	private String pathLanguage = "noDefined";
	private String pathTemplate = "./templates";

	public String getPathLanguage() {
		return pathLanguage;
	}

	public void setPathLanguage(String pathLanguage) {
		this.pathLanguage = pathLanguage;
	}

	public String getPathTemplate() {
		return pathTemplate;
	}

	public void setPathTemplate(String pathTemplate) {
		this.pathTemplate = pathTemplate;
	}

	public String getGrammar() {
		return grammar;
	}

	public void setGrammar(String grammar) {
		this.grammar = grammar;
	}

	public String getMainRule() {
		return mainRule;
	}

	public void setMainRule(String mainRule) {
		this.mainRule = mainRule;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getResultParser() {
		return resultParser;
	}

	public void setResultParser(String resultParser) {
		this.resultParser = resultParser;
	}

	public void execute() throws BuildException {
		try {
			StringTemplateGroup group = new StringTemplateGroup("myGroup", pathTemplate, DefaultTemplateLexer.class);
			StringTemplate parser = group.getInstanceOf("parser");

			parser.setAttribute("pathLanguage", pathLanguage);
			parser.setAttribute("grammar", grammar);
			parser.setAttribute("mainRule", mainRule);
			parser.setAttribute("path", resultParser);

			FileWriter fw = new FileWriter(result + "/" + grammar + "Test.java");
			fw.write(parser.toString());
			fw.close();
			System.out.println("Test Parser created in: " + result + "/" + grammar + "Test.java ("+resultParser+")");
		} catch (Exception e) {
			throw new BuildException(e.getCause());
		}
	}

	public static void main(String[] args) {
		Ge2TestParser task = new Ge2TestParser();
		task.setGrammar("Java");
		task.setMainRule("compilation_unit");
		task.setResult("files");
		task.setPathLanguage("../Grammar2Model.Test/files/prueba.java");
		task.execute();
	}
}
