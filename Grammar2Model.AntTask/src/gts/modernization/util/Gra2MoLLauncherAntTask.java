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
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;
import gts.modernization.model.CST.CSTFactory;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.impl.CSTPackageImpl;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Gra2MoLLauncherAntTask extends MatchingTask  {
	/**
	 * Path to view definition
	 */
	private String pathSourceView = "";
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
	private String result = "";
	/**
	 * Sets the name of the Java parser
	 */
	private String className = "";
	/**
	 * File to parse
	 */
	private String pathFiles = "";
	/**
	 * Set of files to parse
	 */
	private Vector filesets = new Vector();
	/**
	 * Global CST
	 */
	private Element globalCST;

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

		Gra2MoLInterpreterLauncher launcher = new Gra2MoLInterpreterLauncher(
				new File(this.pathSourceView),
				new File(this.pathMetamodel),
				this.targetMetamodel,
				new File(this.result),
				this.grammar,
				this.mainRule,
				sourceFilePaths);
		launcher.setCaseSensitive(this.caseSensitive);
		launcher.launch();
	}
	
	// Getters and setters
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

	public void addFileset(FileSet fileset) {
		filesets.add(fileset);
	}

	public String getPathSourceView() {
		return pathSourceView;
	}

	public void setPathSourceView(String pathSourceView) {
		this.pathSourceView = pathSourceView;
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPathFiles() {
		return pathFiles;
	}
	public void setPathFiles(String pathFiles) {
		this.pathFiles = pathFiles;
	}
	
	public void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	public boolean getCaseSensitive() {
		return caseSensitive;
	}
}
