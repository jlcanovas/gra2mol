package gts.modernization.ui.editors.gra2mol.util;

import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.CSTFactory;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.ViewDefinition;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;
import gts.modernization.ui.editors.gra2mol.Gra2MoLEditor;
import gts.modernization.ui.i18n.Gra2molMessages;

import java.awt.Dialog;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;

public class ModelGrammarExtractor {
	public static String CSTPATH = "/" + Gra2MoLEditor.getAbsoluteInstallPath() + "resources/cst.ecore";
	public static String GRA2MOLPATH = "/" + Gra2MoLEditor.getAbsoluteInstallPath() + "resources/gra2molview.ecore";
	public static String GRA2MOLVIEW = "/" + Gra2MoLEditor.getAbsoluteInstallPath() + "resources/extractANTLRModel.g2m";
	public static String GRAMMARMETAMODELPATH = "/" + Gra2MoLEditor.getAbsoluteInstallPath() + "resources/Grammar.ecore";
//	
	// Para pruebas con Main
//	public static String CSTPATH = "./resources/cst.ecore";
//	public static String GRA2MOLPATH = "./resources/gra2molview.ecore";
//	public static String GRA2MOLVIEW = "./resources/extractANTLRModel.g2m";
//	public static String GRAMMARMETAMODELPATH = "./resources/Grammar.ecore";
	
	public static String GRA2MOLMETAMODELPACKAGE = "Grammar";

	public static void main(String[] args) {
		System.out.println("Mis pruebas");
		ModelGrammarExtractor mge = new ModelGrammarExtractor();
		mge.discover("/Users/jlcanovas/Desktop/eclipse-3.5-64b/runtime-EclipseApplication/newProject/grammars/simpleGrammar.g");
	}
	
	/**
	 * Apply a Gra2MoL transformation to the grammar in order to extract a model
	 * @param grammarPath Path to the grammar
	 * @return The extracted model
	 */
	public Model discover(String grammarPath) {	
//		System.out.println("Busco en " + grammarPath);
		// Extract the CST 
		Node globalCST = extractCSTGrammar(grammarPath);

		// Save the CST
		saveCST(CSTPATH, globalCST);

		// Load the Gra2MoL definition
		ViewDefinition view = loadView(GRA2MOLVIEW);

		// Save the Gra2MoL definition
		saveView(GRA2MOLPATH, view);

		// Executes the Gra2MoL engine
		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(globalCST, view, 
				GRAMMARMETAMODELPATH, 
				GRA2MOLMETAMODELPACKAGE);
		interpreter.setDebug(false);
		Model grammarModel = interpreter.execute();
		return grammarModel;
	}	

	private static Node extractCSTGrammar(String grammarPath) {
		Node result = null;

		try {
			ANTLRFileStream afs = new ANTLRFileStream(grammarPath);
			ModelGrammarExtractorLexer lexer = new ModelGrammarExtractorLexer(afs);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			ModelGrammarExtractorParser parser = new ModelGrammarExtractorParser(cts);
			ModelGrammarExtractorParser.grammarDef_return r = parser.grammarDef();
			result = r.returnNode;	
		} catch (FileNotFoundException fnfe) {
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Gra2MoL Editor Error", 
					"Error saving",
					new Status(IStatus.ERROR, "Gra2MoL plugin", 
							Gra2molMessages.getString("ModelGrammarExtractor.errorOnGrammarPath")));
			result = CSTFactory.eINSTANCE.createNode();
			result.setKind("CST");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return result;
	}


	private void saveCST(String path, Element n) {
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

	private ViewDefinition loadView(String path) {
		try {
			CharStream input = new ANTLRFileStream(path);
			Gra2MoLLexer lex = new Gra2MoLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			Gra2MoLParser parser = new Gra2MoLParser(tokens);
			Gra2MoLParser.viewDefinition_return r = parser.viewDefinition();	
			return r.viewReturn;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	private void saveView(String path, ViewDefinition n) {
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
