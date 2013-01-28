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

import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.launcher.Gra2MoLInterpreterCDOLauncher;
import gts.modernization.model.CST.CSTFactory;
import gts.modernization.model.CST.CSTPackage;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.MatchingTask;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.selectors.FilenameSelector;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;

/**
 * This class uses the CDO framework to store the CST models. The CST models are stores in as steps as
 * source files exists, that is, each source file is a CST transaction which include the CST extracted to the 
 * global CST. Once the CST has been stored, a new transaction (or should it be a CST view?) is charge of
 * retrieve the tree and give it to the Gra2MoL interpreter. This way of working allows Gra2MoL interpreter to load
 * dynamically the CST in memory.
 * 
 * @author jlcanovas
 *
 */
public class Gra2MoLCDOLauncherAntTask extends MatchingTask {
	/**
	 * Path to the transformation definition
	 */
	private String pathTransformation;

	/**
	 * Set of files to parse
	 */
	private Vector filesets = new Vector();

	/**
	 * The name of the grammar
	 */
	private String grammar;
	/**
	 * The name of the main rule of the grammar
	 */
	private String mainRule;
	/**
	 * It sets the case sensitive option 
	 */
	private boolean caseSensitive = true;
	/**
	 * Path to target metamodel
	 */
	private String pathMetamodel = "";
	/**
	 * Main package og the target metamodel
	 */
	private String targetMetamodel = "";
	/**
	 * Path where the target model will be saved
	 */
	private String pathResult = "";

	private String CDORepository;
	private String CDOServer;
	private String CDOResource;
	
	
	public void execute() {
		List<File> sourceFilePaths = new ArrayList<File>();

		Iterator<FileSet> fsetIt = filesets.iterator();
		while(fsetIt.hasNext()) {
			FileSet fset = (FileSet) fsetIt.next();
			DirectoryScanner ds = fset.getDirectoryScanner(getProject());
			File dirFile = ds.getBasedir();
			String dir = dirFile.getAbsolutePath();
			for(String file : ds.getIncludedFiles()) {
				String completeFile = dir + File.separator + file;
				sourceFilePaths.add(new File(completeFile));
			}
		}
		
		Gra2MoLInterpreterCDOLauncher launcher = new Gra2MoLInterpreterCDOLauncher(
				new File(pathTransformation), 
				new File(pathMetamodel), 
				targetMetamodel, 
				new File(pathResult), 
				grammar, 
				mainRule, 
				sourceFilePaths, 
				CDOServer, 
				CDORepository, 
				CDOResource);
		launcher.setCaseSensitive(this.caseSensitive);
		launcher.launch();
	}
	
	/* 
	 * This method must only exist when the class is being executed separately
	 * @see org.apache.tools.ant.Task#log(java.lang.String)
	 */
	@Override
	public void log(String msg) {
		System.out.println(msg);
	}
	
	// Setters and getters
	public void addFileset(FileSet fileset) {
		filesets.add(fileset);
	}
	
	public String getPathTransformation() {
		return pathTransformation;
	}

	public void setPathTransformation(String pathTransformation) {
		this.pathTransformation = pathTransformation;
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

	public boolean isCaseSensitive() {
		return caseSensitive;
	}

	public void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}

	public String getPathMetamodel() {
		return pathMetamodel;
	}

	public void setPathMetamodel(String pathMetamodel) {
		this.pathMetamodel = pathMetamodel;
	}

	public String getTargetMetamodel() {
		return targetMetamodel;
	}

	public void setTargetMetamodel(String targetMetamodel) {
		this.targetMetamodel = targetMetamodel;
	}

	public String getPathResult() {
		return pathResult;
	}

	public void setPathResult(String pathResult) {
		this.pathResult = pathResult;
	}

	public String getCDORepository() {
		return CDORepository;
	}

	public void setCDORepository(String cDORepository) {
		CDORepository = cDORepository;
	}

	public String getCDOServer() {
		return CDOServer;
	}

	public void setCDOServer(String cDOServer) {
		CDOServer = cDOServer;
	}

	public String getCDOResource() {
		return CDOResource;
	}

	public void setCDOResource(String cDOResource) {
		CDOResource = cDOResource;
	}
}
