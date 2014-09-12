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

import gts.modernization.extension.MappingExtensionFactory;
import gts.modernization.extension.QueryControlExtensionFactory;
import gts.modernization.extension.QueryOperationFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * This class stores the configuration for the gra2mol tool
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class Gra2MoLConfiguration {
	public static final String CONFIGURATION_FILE_PATH = "gra2mol.properties";


	public static final String MAPPING_PROPERTY_KEYWORD = "mappingStatement";
	public static final String QUERYCONTROL_PROPERTY_KEYWORD = "queryControl";
	public static final String QUERYOPERATIONS_PROPERTY_KEYWORD = "queryOperations";
	public static final String SUFFIX_KEYWORDS = ".keywords";
	
	public static final String DEBUG_KEYWORD="debug";
	public static final String DEBUG_FILE_KEYWORD="debug.file";
	public static final String DEBUG_SCREEN="screen";

	public static final String CST_FILE_KEYWORD = "cst.file";
	public static final String CST_DEFAULT_FILE = "CSTModel.ecore.xmi";
	
	public static final String GRA2MOL_AS_KEYWORD = "as.file";
	public static final String GRA2MOL_AS_DEFAULT_FILE = "gra2molModel.ecore.xmi";
	
	
	/**
	 * The properties files which specify the configuration 
	 */
	private Properties configuration;
	/**
	 * Singleton instance
	 */
	private static Gra2MoLConfiguration instance;

	private Gra2MoLConfiguration(File filePath) {
		initialize(filePath);

	}

	/**
	 * Singleton method which uses the default configuration file path
	 * @return The singleton instance
	 */
	public static Gra2MoLConfiguration getInstance() {
		if(instance == null) {
			instance = new Gra2MoLConfiguration(new File(CONFIGURATION_FILE_PATH));
			initializeFactories();
		}
		return instance;
	}

	/**
	 * Creates a new singleton instance by using hte filePath specified
	 * @param configurationFile The configuration file File
	 */
	public static void createInstance(File configurationFile) {
		instance = new Gra2MoLConfiguration(configurationFile);
		initializeFactories();
	}

	/**
	 * Initializing other factories which depends on this class
	 */
	private static void initializeFactories() {
		QueryOperationFactory.getInstance();
		QueryControlExtensionFactory.getInstance();
		MappingExtensionFactory.getInstance();
	}

	/**
	 * Loads the configuration file
	 */
	private void initialize(File filePath) {
		configuration = new Properties();

		try {
			configuration.load(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			Gra2MoLLogger.getInstance().print("The configuration does not exist");
		} catch (IOException e) {
			Gra2MoLLogger.getInstance().print("There was a problem with the configuration file");
			e.printStackTrace(); 
		}

	}

	/**
	 * Queries a property
	 * @param key The key to be queried
	 * @return The string property
	 */
	public String getProperty(String key) {
		if(configuration != null) 
			return configuration.getProperty(key);
		else
			return null;
	}

	/**
	 * Checks if the properties contains a specific key
	 * @param key
	 * @return
	 */
	public boolean hasProperty(String key) {
		if(configuration != null) 
			return configuration.keySet().contains(key);
		else
			return false;
	}
}
