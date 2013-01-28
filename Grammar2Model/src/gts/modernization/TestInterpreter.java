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

import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.impl.CSTPackageImpl;
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
 * This class tests the interpreter
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestInterpreter {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		ViewDefinition view = loadView("files/modsekdm.view");
//		Element e = loadCST("files/oki.java.ecore");			
//		saveView("files/modsekdm.view.ecore", view);
//		GVQInterpreter interpreter = new GVQInterpreter(e, view, "metamodel/kdmmodse.ecore", "KDM_MetaModel", "files/modsekdm.ecore");
//		interpreter.execute();   

//		ViewDefinition view = loadView("files/modsejava.view");
//		Element e = loadCST("files/modsejava.java.ecore");			
//		saveView("files/modsejava.view.ecore", view);
//		GVQInterpreter interpreter = new GVQInterpreter(e, view, "metamodel/javamodse.ecore", "JavaSimplified", "files/modsejava.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("files/okivista2.view");
//		Element e = loadCST("files/oki.java4.ecore");			
//		saveView("files/oki.view.ecore", view);
//		GVQInterpreter interpreter = new GVQInterpreter(e, view, "metamodel/struts2.ecore", "StrutsMM", "files/oki.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.extractANTLRModel/files/src/extractANTLRModel.g2m");
//		Element e = loadCST("../Grammar2Model.examples.extractANTLRModel/files/gen/modelcst.java.ecore");			
//		saveView("../Grammar2Model.examples.extractANTLRModel/vistaJava.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.extractANTLRModel/files/metamodels/Grammar.ecore", "Grammar", "../Grammar2Model.examples.extractANTLRModel/resultado.ecore");
//		interpreter.execute();
				
//		ViewDefinition view = loadView("files/prueba.view");
//		Element e = loadCST("files/modelcst.struct.ecore");	
//		GVQInterpreter interpreter = new GVQInterpreter(e, view, "metamodel/Service.ecore", "Service", "debug/interpretado.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../PruebaPLSQLRubyTL/G2MFiles/src/extractPLSQLModel.g2m");
//		Element e = loadCST("../PruebaPLSQLRubyTL/modelcst.java.ecore");	
//		saveView("../PruebaPLSQLRubyTL/vistaJava.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../PruebaPLSQLRubyTL/metamodels/plsql.ecore", "plsql", "../PruebaPLSQLRubyTL/models/resultPLSQL.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.Java2KDMModel/files/src/extractKDM.g2m");
//		Element e = loadCST("../Grammar2Model.examples.Java2KDMModel/modelcst.java.ecore");	
//		saveView("../Grammar2Model.examples.Java2KDMModel/vistaJava.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.Java2KDMModel/files/metamodels/kdm.ecore", "kdm", "../Grammar2Model.examples.Java2KDMModel/resultado.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.wikiDB2Model/files/src/extractWiki.g2m");
//		Element e = loadCST("../Grammar2Model.examples.wikiDB2Model/CSTModel.ecore");	
//		saveView("../Grammar2Model.examples.wikiDB2Model/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.wikiDB2Model/files/metamodels/wikiGraph.ecore", "wiki", "../Grammar2Model.examples.wikiDB2Model/resultado.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.ABNF2MModel/files/src/extractABNF.g2m");
//		Element e = loadCST("../Grammar2Model.examples.ABNF2MModel/CSTModel.ecore");	
//		saveView("../Grammar2Model.examples.ABNF2MModel/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.ABNF2MModel/files/metamodels/Ecore.ecore", "ecore", "../Grammar2Model.examples.ABNF2MModel/resultado.ecore");
//		interpreter.execute();
			

//		ViewDefinition view = loadView("../Grammar2Model.examples.Java2ASTMModel/files/src/extractASTM.g2m");
//		Element e = loadCST("../Grammar2Model.examples.Java2ASTMModel/CSTModel.ecore");	
//		saveView("../Grammar2Model.examples.Java2ASTMModel/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.Java2ASTMModel/files/metamodels/astm.ecore", "astm", "../Grammar2Model.examples.Java2ASTMModel/resultado.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../formol.injector.plsql/gra2mol-src/extractPLSQLModel-opt.g2m");
//		Element e = loadCST("../formol.injector.plsql/cst.ecore");	
//		saveView("../formol.injector.plsql/gra2mol.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../formol.injector.plsql/metamodels/plsql.ecore", "plsql", "../formol.injector.plsql/models/resultPLSQL-otri_fmb.ecore");
//		interpreter.execute();
				
//		ViewDefinition view = loadView("../Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/src/extractASTMFromTriggers.g2m");
//		Element e = loadCST("../Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/CSTTrigger.ecore");	
//		saveView("../Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.PLSQL2ASTMModel/metamodels/astm.ecore", "astm", "../Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/resultado.ecore");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../PFC/gra2mol-files/src/extractSMM.g2m");
//		Element e = loadCST("../PFC/CSTModel.ecore");	
//		saveView("../PFC/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../PFC/gra2mol-files/metamodels/smm.ecore", "SoftwareMetricsMetamodel", "../PFC/result.ecore.xmi");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.Maude2Model/files/src/test.g2m");
//		Element e = loadCST("../Grammar2Model.examples.Maude2Model/files/metamodels/CSTModel.ecore");	
//		saveView("../Grammar2Model.examples.Maude2Model/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.Maude2Model/files/metamodels/Maude.ecore", "Maude", "../Grammar2Model.examples.Maude2Model/result.ecore.xmi");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Grammar2Model.examples.IDL2Model/files/src/test.g2m");
//		Element e = loadCST("../Grammar2Model.examples.IDL2Model/CSTModel.ecore");	
//		saveView("../Grammar2Model.examples.IDL2Model/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.examples.IDL2Model/files/metamodels/IDLMM.ecore", "idlmm", "../Grammar2Model.examples.IDL2Model/result.ecore.xmi");
//		interpreter.execute();
		
		
//		Transformation trasnformation = loadtransformation("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/src/delphi2astm.g2m");
//		Element e = loadCST("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/CSTModel.ecore");	
//		saveTransformation("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/gra2molModel.ecore", trasnformation);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, trasnformation, "../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/metamodels/astm.ecore", "astm", "../Grammar2Model.examples.Delphi2Model/ASTMExtraction/resultModel.ecore.xmi");
//		interpreter.execute();
		

		Transformation trasnformation = loadtransformation("../../runtime-EclipseApplication/extensionExample/transformations/simpleTransformation.g2m");
		Element e = loadCST("../../runtime-EclipseApplication/extensionExample/CSTmodel.ecore");	
//		saveTransformation("../../runtime-EclipseApplication/mixinRulesExample/gra2molModel.ecore.xmi", trasnformation);
		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, trasnformation, "../../runtime-EclipseApplication/extensionExample/metamodels/simpleMetamodel.ecore", "simpleLanguage", "../../runtime-EclipseApplication/mixinRulesExample/resultModel.ecore.xmi");
		interpreter.execute();
		
		
//		ViewDefinition view = loadView("../Grammar2Model.Gra2MoL/bootstrap/files/src/bootstrap.g2m");
//		Element e = loadCST("../Grammar2Model.Gra2MoL/bootstrap/CSTModel.ecore");	
//		saveView("../Grammar2Model.Gra2MoL/bootstrap/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.Gra2MoL/model/Gra2MoL.ecore", "Gra2MoL", "../Grammar2Model.Gra2MoL/bootstrap/resultModel.ecore.xmi");
//		interpreter.execute();
		
//		Transformation view = loadtransformation("../Grammar2Model.Mancoosi/files/src/extractScript.g2m");
//		Element e = loadCST("../Grammar2Model.Mancoosi/CSTModel.ecore");	
//		saveTransformation("../Grammar2Model.Mancoosi/gra2molModel.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, "../Grammar2Model.Mancoosi/files/metamodels/mancoosi.ecore", "mancoosi", "../Grammar2Model.Mancoosi/resultModel.ecore.xmi");
//		interpreter.execute();
		
//		ViewDefinition view = loadView("../Forms2ADF/gra2mol-src/ddl.g2m");
//		Element e = loadCST("../Forms2ADF/gra2mol-tools/modelcst.java.ecore");	
//		saveView("../Forms2ADF/gra2mol-tools/vistaJava.ecore", view);
//		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, view, 
//				"../Forms2ADF/metamodels/relational.ecore", 
//				"relational", 
//				"../Forms2ADF/gra2mol-src/NEW_NOTGESTI_CONVO.ecore");
//		interpreter.execute();
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println(" (" + endTime + " milisecs)");
	}
	
	public static Transformation loadtransformation(String path) {
		try {
			CharStream input = new ANTLRFileStream(path);
			Gra2MoLLexer lex = new Gra2MoLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			Gra2MoLParser parser = new Gra2MoLParser(tokens);
			Gra2MoLParser.transformationDefinition_return r = parser.transformationDefinition();	
			return r.transformationReturn;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static Element loadCST(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs.getPackageRegistry().put("http://gts.inf.um.es/modernization/cst", CSTPackageImpl.eINSTANCE);

		Resource r = rs.getResource(URI.createFileURI(path), true);
		Element t = null;
		try {
			r.load(null);
			t = (Element) r.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;

	}
	
	public static void saveTransformation(String path, Transformation n) {
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
