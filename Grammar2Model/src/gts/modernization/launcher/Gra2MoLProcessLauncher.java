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

import gts.modernization.interpreter.Gra2MoLLogger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import org.antlr.Tool;
import org.eclipse.gmt.modisco.core.modeling.Model;


/**
 * Launch a Gra2MoL transformation process
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class Gra2MoLProcessLauncher {
	/**
	 * The enricher for the source grammar (phase 1)
	 */
	private Gra2MoLEnricher enricher;
	/**
	 * The interpreter for executing the transformation (phase 2)
	 */
	private Gra2MoLAbstractInterpreterLauncher interpreterLauncher;
	/**
	 * Indicates if the phase 1 must be execute
	 */
	private boolean activePhase1 = true;
	/**
	 * Indicates if the phse 2 must be executed
	 */
	private boolean activePhase2 = true;;

	public Gra2MoLProcessLauncher(Gra2MoLEnricher enricher, Gra2MoLAbstractInterpreterLauncher inpterpreterLauncher) {
		this.enricher = enricher;
		this.interpreterLauncher = inpterpreterLauncher;
	}

	// Getter and setter for the phase flags
	public boolean isActivePhase1() {
		return activePhase1;
	}

	public void setActivePhase1(boolean activePhase1) {
		this.activePhase1 = activePhase1;
	}

	public boolean isActivePhase2() {
		return activePhase2;
	}

	public void setActivePhase2(boolean activePhase2) {
		this.activePhase2 = activePhase2;
	}

	// The process

	/**
	 * Launch the process
	 * 
	 * @return The model created by the process
	 */
	public Model launch() {
		Model result = null;
		File directory = enricher.getPathResult().getParentFile();// TODO Change the pathresult to refer to a directory, not a file
		if(activePhase1) {
			// Enriching the grammar
			enricher.execute();

			// Generating the parser
			Gra2MoLLogger.getInstance().print("Enriching " + enricher.getGrammarName() + "...");
			File enrichedGrammar = enricher.getPathResult(); 
			Tool tool = new Tool(new String[] { enrichedGrammar.getAbsolutePath() });
			tool.process();

			// Path to files generated (lexer and parser)
			ArrayList<File> files = new ArrayList<File>();
			directory = enrichedGrammar.getParentFile();			
			File f1 = new File(directory + File.separator + enricher.getGrammarName() + "Lexer.java");
			File f2 = new File(directory + File.separator + enricher.getGrammarName() + "Parser.java");

			// Fixing the parser
			fixParser(f2);

			// Compiling lexer and parser
			files.add(f1);
			files.add(f2);
			Gra2MoLLogger.getInstance().print("Compiling: " + f1.getAbsolutePath());
			Gra2MoLLogger.getInstance().print("Compiling: " + f2.getAbsolutePath());
			JavaUtil.compile(files);
		}

		if(activePhase2) {
			// Modifying classpath dynamically
			try {
				Gra2MoLLogger.getInstance().print("Adding to classpath: " + directory.getAbsolutePath());
				JavaUtil.addFileToClassPath(directory.getAbsolutePath());
			} catch (IOException e) {
				System.err.println("Problems adding the " + directory.getName() +  " class to the classpath");
				e.printStackTrace();
			}

			result = interpreterLauncher.launch();
		}
		return result;
	}

	/**
	 * The java parser must be modified to remove the calls to "getTemplate()"
	 * @param file
	 */
	private void fixParser(File file) {
		try	{
			//			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			//			String line = "";
			//			while((line = raf.readLine()) != null) {
			//				if(line.contains(".getTemplate()")) {
			//					int index = line.indexOf(".getTemplate()");
			//					String newLine = line.substring(0, index) + line.substring(index+14, line.length()) + "              " + "\n";
			//					raf.seek(raf.getFilePointer()-line.length());
			//					raf.writeChars(newLine); 
			//					//					raf.skipBytes(line.length()-newLine.length()+1); 
			//				}
			//			}
			//			raf.close();

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String oldtext = "";
			while((line = reader.readLine()) != null) {
				oldtext += line + "\r\n";
			}
			reader.close();

			// Replacing...
			String newtext = oldtext.replaceAll("\\.getTemplate\\(\\)", "");

			FileWriter writer = new FileWriter(file);
			writer.write(newtext);
			writer.close();
		}
		catch (Exception ioe)	{
			ioe.printStackTrace();
		}
	}



	// Test main
	public static void main(String[] args) {
//		Gra2MoLLogger.createInstance("../Grammar2Model.examples.Delphi2Model/debug.txt");
		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
				new File("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/src/delphi2astm.g2m"), 
				new File("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/metamodels/astm.ecore"), 
				"astm", 
				new File("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/resultModel.ecore.xmi"), 
				"delphi", 
				"mainRule", 
				new File("../Grammar2Model.examples.Delphi2Model/delphiSrc/untClArchivo.pas"));
		interpreter.setCaseSensitive(true);
		Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(
				new Gra2MoLEnricher(
						"delphi",
						new File("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/src/delphi.g"), 
						new File("../Grammar2Model.examples.Delphi2Model/ASTMExtraction/files/gen/delphi.g")), 
						interpreter);

		//		Gra2MoLLogger.createInstance("../Grammar2Model.Gra2MoL/bootstrap/debug.txt");
		//		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
		//				new File("../Grammar2Model.Gra2MoL/bootstrap/files/src/bootstrap.g2m"), 
		//				new File("../Grammar2Model.Gra2MoL/model/Gra2MoL.ecore"), 
		//				"Gra2MoL", 
		//				new File("../Grammar2Model.Gra2MoL/bootstrap/resultModel.ecore.xmi"), 
		//				"Gra2MoL", 
		//				"transformation", 
		//				new File("../Grammar2Model.Gra2MoL/bootstrap/files/examples/delphi2astm.g2m"));
		//		interpreter.setCaseSensitive(true);
		//		Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(
		//				new Gra2MoLEnricher(
		//						"Gra2MoL",
		//						new File("../Grammar2Model.Gra2MoL/bootstrap/files/src/Gra2MoL.g"), 
		//						new File("../Grammar2Model.Gra2MoL/bootstrap/files/gen/Gra2MoL.g")), 
		//						interpreter);
		processLauncher.setActivePhase1(false);
		processLauncher.launch();
	}
}
