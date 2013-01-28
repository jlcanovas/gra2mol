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

import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;


/**
 * One of the first implementations for obtaining the model from the Gra2MoL definition. 
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestG2MV {

	public static void main(String[] args) throws Exception {
		// Input file
		CharStream input = new ANTLRFileStream("../Grammar2Model.examples.Java2ASTMModel/files/src/extractASTM.g2m"); 
		// Lexer
		Gra2MoLLexer lex = new Gra2MoLLexer(input);
		// We dont use a common token stream
		CommonTokenStream tokens = new CommonTokenStream(lex);
		
		// Parser
		Gra2MoLParser parser = new Gra2MoLParser(tokens);
		Gra2MoLParser.transformationDefinition_return r = parser.transformationDefinition();	
		
		saveTree("debug/salida.ecore", r.transformationReturn);
	}
	
	public static void saveTree(String path, Transformation n) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(URI.createFileURI(path));
		try {
			r.getContents().add(n);
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	

	
}
