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


package gts.modernization.launcher;

import gts.modernization.parser.antlr.ANTLRv3Lexer;
import gts.modernization.parser.antlr.ANTLRv3Parser;
import gts.modernization.parser.antlr.G2Ge;

import java.io.File;
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

/**
 * This class is in charge of performing the first phase of a gra2mol process. It
 * enrichs the source grammar to obtain a target grammar which includes the 
 * actions which are needed to create a CST in memory.
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class Gra2MoLEnricher {
	public static String DEFAULT_PATH_TEMPLATES = "./lib/templates/G2Ge.stg";
	/** 
	 * The name of the grammar
	 */
	private String grammarName;
	/**
	 * The path to the grammar to be enriched
	 */
	private File sourceGrammar;
	
	/**
	 * Path where the templates are stored
	 */
	private File templates;
	
	/**
	 * The path where the result grammar will be stored
	 */
	private File resultGrammar;

	/**
	 * Default constructor
	 * @param pathGrammar
	 * @param pathTemplates
	 */
	public Gra2MoLEnricher(String grammarName, File sourceGrammar, File result, File pathTemplates) {
		super();
		this.grammarName = grammarName;
		this.sourceGrammar = sourceGrammar;
		this.resultGrammar = result;
		this.templates = pathTemplates;
	}

	/**
	 * This constructor uses the DEFAULT_PATH_TEMPLATES variable
	 * @param pathGrammar
	 * @param templates
	 */
	public Gra2MoLEnricher(String grammarName, File sourceGrammar, File result) {
		super();
		this.grammarName = grammarName;
		this.sourceGrammar = sourceGrammar;
		this.resultGrammar = result;
		this.templates = new File(DEFAULT_PATH_TEMPLATES);
	}

	/**
	 * Executes the grammar enricher.
	 * @return The enriched grammar
	 */
	public String execute() {
		String result = null;
		
		// First, we build the tokenizer
		TokenRewriteStream tokens = null;
		try {
			// Input file
			CharStream input = new ANTLRFileStream(sourceGrammar.getAbsolutePath()); 
			// Lexer
			ANTLRv3Lexer lex = new ANTLRv3Lexer(input);
			// We need a rewrite token stream
			tokens = new TokenRewriteStream(lex);
		} catch (IOException e) {
			System.err.println("Error reading the grammar definition");
			e.printStackTrace();
			return null;
		}

		// Then, we build the parser
		ANTLRv3Parser.grammarDef_return r = null;
		try {
			// Parser
			ANTLRv3Parser parser = new ANTLRv3Parser(tokens);
			r = parser.grammarDef();
		} catch (RecognitionException e) {
			System.err.println("Error parsing the grammar definition");
			e.printStackTrace();
			return null;
		}

		// Obtain the tree
		CommonTree t = (CommonTree) r.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);

		StringTemplateGroup stg = null;
		try {
			// Templates
			FileReader fr = new FileReader(templates);
			stg = new StringTemplateGroup(fr);
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("Templates file not found");
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			System.err.println("Problem reading templates file");
			e.printStackTrace();
			return null;
		}

		try {
			// Tree walker
			G2Ge walker = new G2Ge(nodes, templates.getAbsolutePath());
			walker.setTemplateLib(stg);
			walker.grammarDef();
			result = tokens.toString();
			saveGrammar(result, resultGrammar.getAbsolutePath());
		} catch (RecognitionException e) {
			System.err.println("Error walking the grammar");
			e.printStackTrace();
			return null;
		}
		return result;
	}
	
	protected static void saveGrammar(String contain, String path) {
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(contain);
			fw.close();
		} catch (Exception e) {
			System.out.println("Error saving the enriched grammar");
			e.printStackTrace();
		}
	}

	// Getters and setters
	public File getPathGrammar() {
		return sourceGrammar;
	}

	public File getPathTemplates() {
		return templates;
	}
	
	public File getPathResult() {
		return resultGrammar;
	}

	public File getSourceGrammar() {
		return sourceGrammar;
	}
	
	public String getGrammarName() {
		return grammarName;
	}
	
}
