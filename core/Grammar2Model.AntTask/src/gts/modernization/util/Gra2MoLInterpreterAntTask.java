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
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.impl.CSTPackageImpl;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * @author Javier Canovas
 *
 * Use int ANT:
 * 		<taskdef name="GVQInterpreter" classname="gts.modernization.util.GVQInterpreterAntTask" classpathref="path.taskdef"/>
		<GVQInterpreter 
			pathSourceView="${sourceView}" 
			pathSourceCST="${sourceCST}" 
			pathMetamodel="${pathMetamodel}"
			targetMetamodel="${targetMetamodel}"
			result="${resultInterpreter}"
		/>
 */
public class Gra2MoLInterpreterAntTask extends Task {
	private String pathSourceView = "";
	private String pathSourceCST = "";
	private String pathMetamodel = "";
	private String targetMetamodel = "";
	private String result = "";
	
	public String getPathSourceView() {
		return pathSourceView;
	}

	public void setPathSourceView(String pathSourceView) {
		this.pathSourceView = pathSourceView;
	}

	public String getPathSourceCST() {
		return pathSourceCST;
	}

	public void setPathSourceCST(String pathSourceCST) {
		this.pathSourceCST = pathSourceCST;
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

	public void execute() {
		
		Transformation transformation = loadTransformation(pathSourceView);
		saveTransformation("gra2molModel.ecore", transformation);
		
		Element e = loadCST(pathSourceCST);	
		
		try {
			long startTime = System.currentTimeMillis();
			log("Executing transformation..."); 	
			Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, transformation, pathMetamodel, targetMetamodel, result);
			interpreter.execute();
			long endTime = System.currentTimeMillis() - startTime;
			log(" (" + endTime + " milisecs)");
		} catch (Exception ex) {			
			ex.printStackTrace();
		}
		

		
	}

	public static void main(String[] args) {
		Gra2MoLInterpreterAntTask task = new Gra2MoLInterpreterAntTask();
		task.setPathSourceView("../Grammar2Model/files/okivista.view");
		task.setPathSourceCST("../Grammar2Model/files/oki.java.ecore");
		task.setPathMetamodel("../Grammar2Model/metamodel/struts.ecore");
		task.setTargetMetamodel("StrutsMM");
		task.setResult("../Grammar2Model/debug/oki.ecore");
		task.execute();
	}
	
	public Transformation loadTransformation(String path) {
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
	
	public Element loadCST(String path) {
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
	
	public void saveTransformation(String path, Transformation n) {
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
