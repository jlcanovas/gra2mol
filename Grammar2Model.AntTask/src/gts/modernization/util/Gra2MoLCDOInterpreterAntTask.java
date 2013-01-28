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
import java.util.Iterator;
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
 * This class is deprecated. It uses the core Gra2MoL interpreter and relies on the existence of a parser. The
 * new Gra2MoLCDOLauncheAntTask is able to execute the Gra2MoL process whole in memory
 * 
 * @deprecated
 * @author jlcanovas
 *
 */
public class Gra2MoLCDOInterpreterAntTask extends MatchingTask {
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

	public void execute() {
		// Load the Gra2MoL transformation definition
		Transformation transformation = loadTransformation(pathTransformation);
		String asFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.GRA2MOL_AS_KEYWORD);
		if(asFile == null) {
			Gra2MoLLogger.getInstance().print("Path to save the Abstract Syntax model not found. Using Default value [" + Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE + "]");
			asFile = Gra2MoLConfiguration.GRA2MOL_AS_DEFAULT_FILE;
		}		
		saveTransformation(asFile, transformation);

		try {

			initializeCDO();

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
							addCST(e, file, files[i]);
						} catch (Exception e) {
							log("  ERROR in file: " + file);							
							e.printStackTrace();
						}
					}
				}
			}
			
			long endTime = System.currentTimeMillis() - startTime;
			log(" (" + endTime + " milisecs)");
			
			// Obtaining the global CST
		    OMPlatform.INSTANCE.setDebugging(false);
		    OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
		    OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
		    
		    // Prepare container
		    IManagedContainer container = ContainerUtil.createContainer();
		    Net4jUtil.prepareContainer(container); // Register Net4j factories
		    TCPUtil.prepareContainer(container); // Register TCP factories
		    CDONet4jUtil.prepareContainer(container); // Register CDO factories
		    container.activate(); 

		    // Create connector
		    IConnector connector = TCPUtil.getConnector(container, CDOServer); //$NON-NLS-1$

		    // Create configuration
		    CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
		    configuration.setConnector(connector);
		    configuration.setRepositoryName(CDORepository); //$NON-NLS-1$

		    // Open session
		    CDOSession session = configuration.openSession();
		    session.getPackageRegistry().putEPackage(CSTPackage.eINSTANCE);

		    // Open transaction
		    CDOTransaction transaction = session.openTransaction();
		    
		    // Get or create resource
		    CDOResource resource = transaction.getResource(CDOResource); //$NON-NLS-1$
		    
		    // Work with the resource and commit the transaction
		    Element globalCST = (Element) resource.getContents().get(0);

		    log("Executing transformation..."); 			
			startTime = System.currentTimeMillis();
			// Execute the interpreter
			Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(globalCST, transformation, pathMetamodel, targetMetamodel, pathResult);
			interpreter.execute();
			endTime = System.currentTimeMillis() - startTime;
			log(" (" + endTime + " milisecs)");
		    
		    transaction.commit(); 
		    
		    // Cleanup
		    session.close();
		    connector.close();
		    container.deactivate();
		} catch (Exception ex) {			
			ex.printStackTrace();
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
	
	public void saveCST(String path, Node n) {
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
	
	/**
	 * Includes a new CST node which contains the CST for a particular file
	 * @param specific
	 * @param path
	 * @param filename
	 */
	public void addCST(Element specific, String path, String filename) {
	    OMPlatform.INSTANCE.setDebugging(false);
	    OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
	    OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
	    
	    // Prepare container
	    IManagedContainer container = ContainerUtil.createContainer();
	    Net4jUtil.prepareContainer(container); // Register Net4j factories
	    TCPUtil.prepareContainer(container); // Register TCP factories
	    CDONet4jUtil.prepareContainer(container); // Register CDO factories
	    container.activate(); 

	    // Create connector
	    IConnector connector = TCPUtil.getConnector(container, CDOServer); //$NON-NLS-1$

	    // Create configuration
	    CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
	    configuration.setConnector(connector);
	    configuration.setRepositoryName(CDORepository); //$NON-NLS-1$

	    // Open session
	    CDOSession session = configuration.openSession();
	    session.getPackageRegistry().putEPackage(CSTPackage.eINSTANCE);

	    // Open transaction
	    CDOTransaction transaction = session.openTransaction();
	    
	    // Get or create resource
	    CDOResource resource = transaction.getResource(CDOResource); //$NON-NLS-1$
	    
	    // Work with the resource and commit the transaction
	    Element globalCST = (Element) resource.getContents().get(0);
	    
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

			globalNode.getChildren().add(file);
		}
	    transaction.commit(); 
	    
	    // Cleanup
	    session.close();
	    connector.close();
	    container.deactivate();
	}
	
	
	public void initializeCDO() {
	    OMPlatform.INSTANCE.setDebugging(false);
	    OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
	    OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
	    
	    // Prepare container
	    IManagedContainer container = ContainerUtil.createContainer();
	    Net4jUtil.prepareContainer(container); // Register Net4j factories
	    TCPUtil.prepareContainer(container); // Register TCP factories
	    CDONet4jUtil.prepareContainer(container); // Register CDO factories
	    container.activate(); 

	    // Create connector
	    IConnector connector = TCPUtil.getConnector(container, CDOServer); //$NON-NLS-1$

	    // Create configuration
	    CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
	    configuration.setConnector(connector);
	    configuration.setRepositoryName(CDORepository); //$NON-NLS-1$

	    // Open session
	    CDOSession session = configuration.openSession();
	    session.getPackageRegistry().putEPackage(CSTPackage.eINSTANCE);

	    // Open transaction
	    CDOTransaction transaction = session.openTransaction();
	    
	    // Get or create resource
	    CDOResource resource = transaction.getOrCreateResource(CDOResource); //$NON-NLS-1$
	    
	    // Work with the resource and commit the transaction
	    Node node = CSTPackage.eINSTANCE.getCSTFactory().createNode();
	    node.setKind("CST");
	    resource.getContents().add(node);
	    transaction.commit(); 
	    
	    // Cleanup
	    session.close();
	    connector.close();
	    container.deactivate();
	}
	
	public static void main(String[] args) {
		Gra2MoLCDOInterpreterAntTask task = new Gra2MoLCDOInterpreterAntTask();
		task.setPathTransformation("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/src/delphi2astm.g2m");
		task.setTargetMetamodel("astm");
		task.setPathMetamodel("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/metamodels/astm.ecore");
		task.setPathResult("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/resultModelD.ecore.xmi");
		task.setGrammar("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/src/delphi.g");
		task.setMainRule("mainRule");
		task.setCDOServer("localhost:2036");
		task.setCDOResource("/td3");
		task.setCDORepository("repo1");
		task.setCaseSensitive(false);
		
		
		FileSet myfileset = new FileSet();
		FilenameSelector myselector = new FilenameSelector();
		myselector.setName("*.pas");
		myfileset.addFilename(myselector);
		myfileset.setDir(new File("../Grammar2Model.examples.Delphi2Model/DelphiSrc"));
		
		task.addFileset(myfileset);
		
		task.execute();
	}
	
	/* 
	 * This method must only exist when the class is being executed separately
	 * @see org.apache.tools.ant.Task#log(java.lang.String)
	 */
	@Override
	public void log(String msg) {
		System.out.println(msg);
	}
}
