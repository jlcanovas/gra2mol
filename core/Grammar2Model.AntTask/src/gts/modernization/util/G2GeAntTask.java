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

import gts.modernization.parser.antlr.ANTLRv3Lexer;
import gts.modernization.parser.antlr.ANTLRv3Parser;
import gts.modernization.parser.antlr.G2Ge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class G2GeAntTask extends Task {
	private String pathGrammar;
	private String pathResult;
	private String pathTemplates = "templates/G2Ge.stg";

	public String getPathTemplates() {
		return pathTemplates;
	}

	public void setPathTemplates(String pathTemplates) {
		this.pathTemplates = pathTemplates;
	}

	public String getPathGrammar() {
		return pathGrammar;
	}

	public void setPathGrammar(String pathGrammar) {
		this.pathGrammar = pathGrammar;
	}

	public String getPathResult() {
		return pathResult;
	}

	public void setPathResult(String pathResult) {
		this.pathResult = pathResult;
	}

	public void execute() throws BuildException {
		TokenRewriteStream tokens = null;
		try {
			// Input file
			CharStream input = new ANTLRFileStream(pathGrammar); 
			// Lexer
			ANTLRv3Lexer lex = new ANTLRv3Lexer(input);
			// We need a rewrite token stream
			tokens = new TokenRewriteStream(lex);
		} catch (IOException e) {
			System.err.println("Error reading the grammar definition");
			e.printStackTrace();
			return;
		}

		ANTLRv3Parser.grammarDef_return r = null;
		try {
			// Parser
			ANTLRv3Parser parser = new ANTLRv3Parser(tokens);
			r = parser.grammarDef();
		} catch (RecognitionException e) {
			System.err.println("Error parsing the grammar definition");
			e.printStackTrace();
			return;
		}

		// Obtain the tree
		CommonTree t = (CommonTree) r.getTree();
		
		// Debug 
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);

		StringTemplateGroup stg = null;
		try {
			// Templates
			FileReader fr = new FileReader(pathTemplates);
			stg = new StringTemplateGroup(fr);
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("Templates file not found");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.err.println("Problem reading templates file");
			e.printStackTrace();
			return;
		}

		try {
			// Tree walker
			G2Ge walker = new G2Ge(nodes, pathTemplates);
			walker.setTemplateLib(stg);
			walker.grammarDef();
			String tokens2 = tokens.toString();
			write2Disk(tokens2, pathResult);
		} catch (RecognitionException e) {
			System.err.println("Error walking the grammar");
			e.printStackTrace();
			return;
		}
	}

	public static void write2Disk(String contain, String path) {
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(contain);
			fw.close();
		} catch (Exception e) {
			System.out.println("Error al guardar");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		G2GeAntTask task = new G2GeAntTask();
		task.setPathGrammar(args[0]);
		task.setPathResult(args[1]);
//		task.setPathGrammar("../formol.discoverer.plsql/gra2mol-files/src/PLSQL3v2.g3");
//		task.setPathResult("../formol.discoverer.plsql/gra2mol-files/gen/PLSQL3v2.ge3");
		task.execute();
	}

}
