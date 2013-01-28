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

import gts.modernization.interpreter.Gra2MoLConfiguration;
import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.gmt.modisco.core.modeling.Model;


/**
 * This class offers the basic functionality for launching gra2mol transformations
 * 
 * @author jlcanovas
 *
 */
public abstract class Gra2MoLAbstractInterpreterLauncher {
	/**
	 * Path to gra2mol transformation definition
	 */
	protected File pathTransformation;
	/**
	 * Path to target metamodel
	 */
	protected File pathMetamodel;
	/**
	 * Path to the source grammar
	 */
	protected File pathGrammar;
	/**
	 * Main package of the target metamodel
	 */
	protected String targetMetamodel;
	/**
	 * Path where the result model file will be saved
	 */
	protected File resultModelPath;
	/**
	 * The name of the grammar (It is used to create/locate the parser)
	 */
	protected String grammarName;
	/**
	 * Main rule of the grammar
	 */
	protected String grammarMainRule;
	/**
	 * List of files to be parsed
	 */
	protected List<File> sourceFilePaths;

	
	// The following methods must be implemented by subclasses
	/**
	 * Computations that can be made before the main process implemented by the launch method
	 */
	protected abstract void preprocess();
	/**
	 * Computations that can be made after the main process implemented by the launch method
	 */
	protected abstract void postprocess();	
	/**
	 * Computations that can be made before interpreter process 
	 */
	protected abstract void preInterpreter();
	/**
	 * Computations that can be made after interpreter process 
	 */
	protected abstract void postInterpreter();	
	/**
	 * Initialices the CST that will be used to store the particular CST of each file
	 */
	protected abstract void initializeCST();
	/**
	 * This method is called just before launching the parser method. It is call as many times as
	 * files are going to be parsed
	 */
	protected abstract void preParserFile();
	/**
	 * Parses the file and return a CST Element element
	 * @param path Path to the file to be parsed
	 * @return The root of the particular CST of the file
	 */
	protected abstract Element parser(File path);
	/**
	 * Adds a particular CST of a parsed file to the global CST
	 * @param child The particular CST of a parsed file
	 * @param sourceFilePath The source file path of which the CST has been extracted
	 */
	protected abstract void addCST(Element child, String sourceFilePath);
	/**
	 * Obtains the CST which contains the particular CST of each parsed file
	 * @return
	 */
	protected abstract Element getCST();
	/**
	 * This methos is called just after launching the parser method. It is call as many time as
	 * files are going to be parsed
	 */
	protected abstract void postParserFile();

	/**
	 * Main constructor
	 * @param pathTransformation
	 * @param pathMetamodel
	 * @param targetMetamodel
	 * @param resultPath
	 * @param grammarName
	 * @param grammarMainRule
	 * @param sourceFilePaths
	 */
	public Gra2MoLAbstractInterpreterLauncher(File pathTransformation,
			File pathMetamodel, String targetMetamodel, File resultModelPath,
			String grammarName, String grammarMainRule,
			List<File> sourceFilePaths) {
		super();
		this.pathTransformation = pathTransformation;
		this.pathMetamodel = pathMetamodel;
		this.targetMetamodel = targetMetamodel;
		this.resultModelPath = resultModelPath;
		this.grammarName = grammarName;
		this.grammarMainRule = grammarMainRule;
		this.sourceFilePaths = sourceFilePaths;
	}

	/**
	 * Auxiliar constructor (this variant does not receives the list of files to be parsed)
	 * @param pathTransformation
	 * @param pathMetamodel
	 * @param targetMetamodel
	 * @param resultPath
	 * @param grammarName
	 * @param grammarMainRule
	 */
	public Gra2MoLAbstractInterpreterLauncher(File pathTransformation,
			File pathMetamodel, String targetMetamodel, File resultModelPath,
			String grammarName, String grammarMainRule) {
		super();
		this.pathTransformation = pathTransformation;
		this.pathMetamodel = pathMetamodel;
		this.targetMetamodel = targetMetamodel;
		this.resultModelPath = resultModelPath;
		this.grammarName = grammarName;
		this.grammarMainRule = grammarMainRule;
		this.sourceFilePaths = new ArrayList<File>();
	}
	
	/**
	 * Template method which executes the gra2mol tranformation process. The steps are the 
	 * following:
	 * 1. Loads the transformation and saves it in ABSTRACT_SYNTAX_SAVE_PATH
	 * 2. Calls to initializeCST()
	 * 3. Traverse the source files to be parsed and
	 *   3.1. Calls to preParserFile()
	 *   3.2. Calls to parser() in order to obtain the particular CST for the file
	 *   3.3. Calls to addCST() to adds the just extracted CST to the global CST
	 *   3.4. Calls to postParserFile()
	 * 4. Once it obtains the CST, calls to getCST and pass the obtained CST to the Gra2MoL interpreter
	 * 5. Saves the CST
	 * @return
	 */
	public Model launch() {
		// Some computations can be made before the process
		preprocess();

		// Load the view definition
		Transformation transformation = loadTransformation(pathTransformation);
		
		String asFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.GRA2MOL_AS_KEYWORD);
		if(asFile == null) {
			Gra2MoLLogger.getInstance().print("Path to save the Abstract Syntax model not found. Using Default value [" + Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE + "]");
			asFile = Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE;
		}		
		saveTransformation(new File(asFile), transformation);

		// Initialize the global CST
		initializeCST();

		long startTime = System.currentTimeMillis();
		// Extract the CST for each source file
		Gra2MoLLogger.getInstance().print("Parsing fileset...");	
		for(File sourceFilePath : sourceFilePaths) {
			preParserFile();
			Element e = parser(sourceFilePath);
			addCST(e, sourceFilePath.getAbsolutePath());
			postParserFile();
		}
		long endTime = System.currentTimeMillis() - startTime;
		Gra2MoLLogger.getInstance().print(" (" + endTime + " milisecs)");

		Gra2MoLLogger.getInstance().print("Executing transformation..."); 		
		Element globalCST = getCST();
		startTime = System.currentTimeMillis();

		// Execute the interpreter
		preInterpreter();
		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(globalCST, transformation, pathMetamodel.getAbsolutePath(), targetMetamodel, resultModelPath.getAbsolutePath());
		Model result = interpreter.execute();
		postInterpreter();
		endTime = System.currentTimeMillis() - startTime;
		Gra2MoLLogger.getInstance().print(" (" + endTime + " milisecs)");
 
		startTime = System.currentTimeMillis();
		Gra2MoLLogger.getInstance().print("Saving CST...");
		
		// Saving globalCST
		String cstFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.CST_FILE_KEYWORD);
		if(cstFile == null) {
			Gra2MoLLogger.getInstance().print("Path to save the CST model not found. Using Default value [" + Gra2MoLConfiguration.CST_DEFAULT_FILE + "]");
			cstFile = Gra2MoLConfiguration.CST_DEFAULT_FILE;
		}		
		saveCST(cstFile, (Node) globalCST);
		endTime = System.currentTimeMillis() - startTime;
		Gra2MoLLogger.getInstance().print(" (" + endTime + " milisecs)");

		// Last computations
		postprocess();

		return result;
	}

	/**
	 * Loads a Gra2MoL transformation definition.
	 * Obtains the abstract syntax of such definition.
	 * @param path
	 * @return
	 */
	public Transformation loadTransformation(File path) {
		try {
			CharStream input = new ANTLRFileStream(path.getAbsolutePath());
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

	/**
	 * Saves a Gra2MoL transforamtion into a path
	 * @param path
	 * @param n
	 */
	public void saveTransformation(File path, Transformation n) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(URI.createFileURI(path.getAbsolutePath()));
		try {
			r.getContents().add(n);
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	

	/**
	 * Saves a CST model
	 * @param path
	 * @param n
	 */
	public abstract void saveCST(String path, Node n);

	// Getters and setters
	public File getPathTransformation() {
		return pathTransformation;
	}
	public void setPathTransformation(File pathTransformation) {
		this.pathTransformation = pathTransformation;
	}
	public File getPathMetamodel() {
		return pathMetamodel;
	}
	public void setPathMetamodel(File pathMetamodel) {
		this.pathMetamodel = pathMetamodel;
	}
	public String getTargetMetamodel() {
		return targetMetamodel;
	}
	public void setTargetMetamodel(String targetMetamodel) {
		this.targetMetamodel = targetMetamodel;
	}
	public File getResultPath() {
		return resultModelPath;
	}
	public void setResultPath(File resultModelPath) {
		this.resultModelPath = resultModelPath;
	}
	public List<File> getSourceFilePaths() {
		return sourceFilePaths;
	}
	public void setSourceFilePaths(List<File> sourceFilePaths) {
		this.sourceFilePaths = sourceFilePaths;
	}
	public String getGrammarName() {
		return grammarName;
	}
	public void setGrammarName(String grammarName) {
		this.grammarName = grammarName;
	}
	public String getGrammarMainRule() {
		return grammarMainRule;
	}
	public void setGrammarMainRule(String grammarMainRule) {
		this.grammarMainRule = grammarMainRule;
	}


}
