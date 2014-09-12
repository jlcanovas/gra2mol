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

import gts.modernization.interpreter.Gra2MoLConfiguration;
import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.interpreter.Gra2MoLLogger;
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
import java.util.Iterator;
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

/**
 * This class is deprecated. It uses the core Gra2MoL interpreter and relies on the existence of a parser. The
 * new Gra2MoLLauncheAntTask is able to execute the Gra2MoL process whole in memory
 * 
 * @deprecated 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class Gra2MoLDinamicInterpreterAntTask extends MatchingTask  {
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

	public void execute() {
		// Load the view definition
		Transformation transformation = loadTransformation(pathSourceView);
		String asFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.GRA2MOL_AS_KEYWORD);
		if(asFile == null) {
			Gra2MoLLogger.getInstance().print("Path to save the Abstract Syntax model not found. Using Default value [" + Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE + "]");
			asFile = Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE;
		}	
		saveTransformation(asFile, transformation);

		try {

			// Initialize the global CST
			globalCST = initializeGlobalCST();

			long startTime = System.currentTimeMillis();
			// Extract the CST for each source file
			Iterator it = filesets.iterator();
			while(it.hasNext()) {
				FileSet fset = (FileSet) it.next();
				if(fset != null) {
					log("Parsing fileset...");					
					DirectoryScanner ds = fset.getDirectoryScanner(getProject());
					File dirFile = ds.getBasedir();
					String dir = dirFile.getAbsolutePath();
					String[] files = ds.getIncludedFiles();
					for (int i = 0; i < files.length; i++) {
						String file = dir + File.separator + files[i];
						try {
							Element e = parser(file);
							// Add the CST to the global CST
							addCST(e, file, files[i]);
//							log("  file: " + file);
						} catch (Exception e) {
							log("  ERROR in file: " + file);							
							e.printStackTrace();
						}
					}
				}
			}
			
			long endTime = System.currentTimeMillis() - startTime;
			log(" (" + endTime + " milisecs)");

			log("Saving CST...");
			// Saving globalCST
			String cstFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.CST_FILE_KEYWORD);
			if(cstFile == null) {
				Gra2MoLLogger.getInstance().print("Path to save the CST model not found. Using Default value [" + Gra2MoLConfiguration.CST_DEFAULT_FILE + "]");
				cstFile = Gra2MoLConfiguration.CST_DEFAULT_FILE;
			}		
			saveCST(cstFile, (Node) globalCST);

			// Build the main root CST
//			Element e = executeParser(pathFiles);	

			log("Executing transformation..."); 			
			startTime = System.currentTimeMillis();
			// Execute the interpreter
			Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(globalCST, transformation, pathMetamodel, targetMetamodel, result);
			interpreter.execute();
			endTime = System.currentTimeMillis() - startTime;
			log(" (" + endTime + " milisecs)");
		} catch (Exception ex) {			
			ex.printStackTrace();
		}
	}

	/**
	 * Creates a new CST which will be used to represent the source code
	 * @return
	 */
	public Element initializeGlobalCST() {
		Node sol = CSTFactory.eINSTANCE.createNode();
		sol.setKind("CST");
//		log("globalCST inicializado");
		return sol;
	}

	/**
	 * Includes a new CST node which contains the CST for a particular file
	 * @param specific
	 * @param path
	 * @param filename
	 */
	public void addCST(Element specific, String path, String filename) {
		if (globalCST instanceof Node && specific instanceof Node) {
			Node globalNode = (Node) globalCST;
			Node specficidNode = (Node) specific;

			Node file = CSTFactory.eINSTANCE.createNode();
			file.setKind("file");

			Leaf pathLeaf = CSTFactory.eINSTANCE.createLeaf();
			pathLeaf.setKind("path");
			pathLeaf.setValue(path);

			Leaf pathFileName = CSTFactory.eINSTANCE.createLeaf();
			pathFileName.setKind("filename");
			pathFileName.setValue(filename);

			file.getChildren().add(pathLeaf);
			file.getChildren().add(pathFileName);
			file.getChildren().add(specficidNode);

//			log("Añadido el cst del path " + path);
			globalNode.getChildren().add(file);
		}
	}
	
	
	/**
	 * This class ignores the capital terminal elements of the grammar.
	 * Take care, the terminal elements must be written in capital letters in the grammar definition
	 * @author jlcanovas
	 *
	 */
	class ANTLRNoCaseFileStream  extends ANTLRFileStream {
	    public ANTLRNoCaseFileStream(String fileName) throws IOException {
	        super(fileName, null);
	    }

	    public ANTLRNoCaseFileStream(String fileName, String encoding)
	    throws IOException {
	        super(fileName, encoding);
	    }

	    public int LA(int i) {
	        if ( i==0 ) {
	            return 0; // undefined
	        }
	        if ( i<0 ) {
	            i++; // e.g., translate LA(-1) to use offset 0
	        }
	        if ( (p+i-1) >= n ) {
	            return CharStream.EOF;
	        }
	        return Character.toUpperCase(data[p+i-1]);
	    }
	}
	
	/**
	 * Calls the parser created form the enriched grammar. It uses the Java meta level for
	 * invoking the right method. 
	 * @param source
	 * @return
	 * @throws Exception
	 */
	public Node parser(String source) throws Exception {
		// Create the filestream
		ANTLRFileStream afs;
		if(!caseSensitive) {
			System.out.println("Creating non case sensitive parser for " + source);
			afs = new ANTLRNoCaseFileStream(source);
		} else {
			System.out.println("Creating case sensitive parser for " + source);
			afs = new ANTLRFileStream(source);
		}
		
		// Create the lexer class
		Class lexer = Class.forName(grammar+"Lexer");
		// Locate the lexer constructor
		Constructor lexerConstructor = lexer.getConstructor(org.antlr.runtime.CharStream.class);		
		// Create the lexer instance
		Lexer lexerInstance = (Lexer) lexerConstructor.newInstance((CharStream) afs);
	
		// Create the token stream
		CommonTokenStream cts = new CommonTokenStream(lexerInstance);

		// Create the parser class
		Class parser = Class.forName(grammar+"Parser");
		// Locate the parser constructor
		Constructor parserConstructor = parser.getConstructor(org.antlr.runtime.TokenStream.class);
		// Create the parser instance
		Object parserInstance = parserConstructor.newInstance(cts); 	
		
		// Locate the method
		Method method = parser.getMethod(mainRule, null);	
		// Invoke the method
		Object returnedValue = method.invoke(parserInstance, null);
		// Extracts the returnNode field
		Class returned = returnedValue.getClass();
		Field field = returned.getField("returnNode");
		Object o = field.get(returnedValue);
		
		if (o instanceof Node) {
			Node n = (Node) o;
			return n;
		} else {
			return null;
		}
	}

	private static void printMembers(Member[] mbrs, String s) {
		System.out.format("%s:%n", s);
		for (Member mbr : mbrs) {
			if (mbr instanceof Field)
				System.out.format("  %s%n", ((Field)mbr).toGenericString());
			else if (mbr instanceof Constructor)
				System.out.format("  %s%n", ((Constructor)mbr).toGenericString());
			else if (mbr instanceof Method)
				System.out.format("  %s%n", ((Method)mbr).toGenericString());
		}
		if (mbrs.length == 0)
			System.out.format("  -- No %s --%n", s);
		System.out.format("%n");
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

	public static void saveCST(String path, Node n) {
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
