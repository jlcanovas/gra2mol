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


package gts.modernization.interpreter;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class is used to dealt with every information/error message provided
 * by the tool
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class Gra2MoLLogger {
	/**
	 * The number of spaces to print for each tabulator
	 */
	private static String TAB_SPACE = "  ";
	/**
	 * The stream where the messages will be written
	 */
	private PrintStream printStream;
	/**
	 * This variable controls the deep to print the right number of tabulators
	 */
	private int deep = 0;
	/**
	 * The current instance (singleton)
	 */
	private static Gra2MoLLogger instance = null;
	/**
	 * Deactivate the printing of messages.
	 */
	private static boolean quiet = false;
	
	/**
	 * Default constructor, it uses screen as default printstream
	 */
	private Gra2MoLLogger() {		
		this(System.out);
	}
	
	/**
	 * Constructs a new Gra2MoLLogger using the stream as target stream where 
	 * the debug messages will be printed
	 * @param pathFile The stream for debugging
	 */
	private Gra2MoLLogger(PrintStream stream) {

		String debugMode = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.DEBUG_KEYWORD);
		if(debugMode != null && !debugMode.equals("true")) quiet = true;
		
		String debugFile = Gra2MoLConfiguration.getInstance().getProperty(Gra2MoLConfiguration.DEBUG_FILE_KEYWORD);
		if(debugFile != null && !debugFile.equals(Gra2MoLConfiguration.DEBUG_SCREEN)) {
			try {
				stream = new PrintStream(new File(debugFile));
			} catch (FileNotFoundException e) {
				System.err.println("The path for the log file does not exist, using default");
				stream = System.out;
			}
		}
		
		if(!quiet) {
			try { 
				printStream = stream;
				printStream.print("Gra2MoL version " +  Gra2MoLInterpreter.VERSION + "\n");
			} catch (Exception e) {
				System.err.println("Debug class error (Initializing)");
				e.printStackTrace();
			}
		}
	}
	
	private static void setQuiet(boolean quiet) {
		Gra2MoLLogger.quiet = quiet;
	}

	/**
	 * The method used to obtain the singleton instance of this class
	 * @return The singleton instance
	 */
	public static Gra2MoLLogger getInstance() {
		if(instance == null) instance = new Gra2MoLLogger();
		return instance;
	}

	/**
	 * This method is used to creates a new singleton instace of Gra2MoLLogger byy specifying
	 * the target debug file
	 * @param pathFile The path to the target file where the debug messages will be stored
	 * @return The singleton instance
	 */
	private static Gra2MoLLogger createInstance(String pathFile) {
		PrintStream newStream = null;
		try {
			newStream = new PrintStream(new File(pathFile));
			instance = new Gra2MoLLogger(newStream);
		} catch (FileNotFoundException e) {
			System.err.println("The file to which the debug messages must be printed does not exist");
			e.printStackTrace();
		}
		return instance;
	}

	/**
	 * Prints the messages along with a carriage return (new line)
	 * @param msg Message to be printed
	 */
	public void print(String msg) {
		if(!quiet) {
			try {
				printStream.print("\n" + buildTab() + msg);
				printStream.flush();
			} catch (Exception e) {
				System.err.println("Debug class error (Writing)");
				e.printStackTrace();
			}		
		}
	}

	/**
	 * Appends a messages without a carriage return
	 * @param msg Message to be appended
	 */
	public void append(String msg) {
		if(!quiet) {
			try {
				printStream.print(msg);
				printStream.flush();
			} catch (Exception e) {
				System.err.println("Debug class error (Writing)");
				e.printStackTrace();
			}	
		}
	}

	/**
	 * Builds the tabulator for a deep. The tabulator is equals to TAB_SPACE * deep
	 * @return A String composed of a number of spaces
	 */
	private String buildTab() {
		String sol = "";
		for(int i = 0; i < deep; i++) {
			sol = sol + TAB_SPACE;
		}
		return sol;
	}

	/**
	 * Ends the debug 
	 */
	public void finalizeDebug() {
		if(!quiet) {
			try {
				printStream.close();
			} catch (Exception e) {
				System.err.println("Debug class error (Closing)");
				e.printStackTrace();
			}
		}

	}

	/**
	 * Increases the deep of the messages. It causes adding a new tabulator
	 * for the following messages
	 */
	public void incDeep() {
		this.deep++;
	}

	/**
	 * Decreases the deep of the messages. It causes removing a tabulator
	 * for the following messages
	 */
	public void decDeep() {
		this.deep--;
	}

	/**
	 * Specific method to print query sections
	 * @param queries
	 */
	public void printQuerySection(HashMap<String, List<Element>> queries) {
		if(queries != null) {
			Gra2MoLLogger.getInstance().incDeep();
			Iterator<String> itd = queries.keySet().iterator();
			while(itd.hasNext()) {
				String key = itd.next();
				List<Element> list = queries.get(key);
				Gra2MoLLogger.getInstance().print("Query " + key + " with " + list.size() + " result nodes");
				if(list.size() == 1) {
					Node res = ((Node) list.get(0));
					String line = "";
					if(res.getLeaves().size() > 0) {
						Leaf firstLeaf = res.getLeaves().get(0);
						line = "in line " + firstLeaf.getLine(); 
					}
					Gra2MoLLogger.getInstance().append(" - CONTENT " + line + ": [" + res.extractContent(true) + "]");
				}
			}
			Gra2MoLLogger.getInstance().decDeep();
		}
	}
}
