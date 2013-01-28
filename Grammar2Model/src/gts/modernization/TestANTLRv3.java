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

package gts.modernization;

import java.io.FileReader;
import java.io.FileWriter;

import gts.modernization.parser.antlr.ANTLRv3Lexer;
import gts.modernization.parser.antlr.ANTLRv3Parser;
import gts.modernization.parser.antlr.G2Ge;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 * This is a class for testing the grammar enricher
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestANTLRv3 {
	public static void main(String args[]) throws Exception {
		// Input file
		CharStream input = new ANTLRFileStream("../../runtime-EclipseApplication/islandGrammarExample/grammars/simpleGrammar.g"); 
//		CharStream input = new ANTLRFileStream("./src/ANTLRv3.g3"); 
				// Lexer
		ANTLRv3Lexer lex = new ANTLRv3Lexer(input);
		// We dont use a common token stream
//		CommonTokenStream tokens = new CommonTokenStream(lex);
		// We need a rewrite token stream
		TokenRewriteStream tokens = new TokenRewriteStream(lex);

		// Parser
		ANTLRv3Parser parser = new ANTLRv3Parser(tokens);
		ANTLRv3Parser.grammarDef_return r = parser.grammarDef();

		// Debug 
		String tokens1 = tokens.toString();
		write2Disk(tokens1, "debug/antes.txt");

		// Obtain the tree
		CommonTree t = (CommonTree)r.getTree();
		// Debug 
		System.out.println(t.toStringTree());
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		
		// Templates
		FileReader fr = new FileReader("templates/G2Ge.stg");
		StringTemplateGroup stg = new StringTemplateGroup(fr);
		fr.close();
		
		// Tree walker
		G2Ge walker = new G2Ge(nodes, "templates/G2Ge.stg");
		walker.setTemplateLib(stg);
		walker.grammarDef();

		// Debug 
		String tokens2 = tokens.toString();
//		if(tokens1.compareTo(tokens2) == 0) {
//			System.out.println("SON IGUALES");
//		} else  {
//			System.out.println("SON DIFERENTES");
//		}
		write2Disk(tokens2, "debug/despues.txt");
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
}
