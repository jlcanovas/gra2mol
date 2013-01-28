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


package gts.modernization.extension;

import gts.modernization.interpreter.Gra2MoLConfiguration;
import gts.modernization.interpreter.Gra2MoLLogger;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/**
 * This abstract class includes the basic functionalities which are needed to implement a extension factory. 
 * There are currently (7-dec-2010) three factories for managing control statements, query operators and mappings.
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class ExtensionFactory {
	public static final String KEYWORDS_METHOD_NAME = "keywords";

	/**
	 * Stores the extensions related to the factory
	 */
	HashMap<String, Class> extensions = new HashMap<String, Class>();
		
	/**
	 * Template method which initilices the factory 
	 */
	void initialize() {
		// Obtains the operations defined (separated by commas)
		String property = Gra2MoLConfiguration.getInstance().getProperty(getPropertyKeyword());

		Gra2MoLLogger.getInstance().print("\nInitializing " + getDebugKeywordMessage());
		if(property != null) {
			String[] operationsString = property.split(",");
			for(String operationString : operationsString) {
				// For each operation...
				Gra2MoLLogger.getInstance().print(operationString + " " + getDebugKeywordMessage() + " found");

				// Check if the class is accessible
				Class operationClass = null;
				try {
					operationClass = Class.forName(operationString);
				} catch (ClassNotFoundException e) {
					Gra2MoLLogger.getInstance().print("  [ERROR] The " + getDebugKeywordMessage() + " could not be instantiated, check the classpath");
				}

				if(operationClass != null) {
					if(!(operationClass.getSuperclass() == getConformsToClass())) {
						Gra2MoLLogger.getInstance().print("  [ERROR] The " + getDebugKeywordMessage() + " must be instance of " + getConformsToClass().getName());
					} else {
						// Looking for the keywords
						// First, checks if there is a keywords method to know them
						String[] keywords = null;
						Method[] methods = operationClass.getMethods();
						Method keywordsMethod =null;
						for(Method method : methods) {
							if(method.getName().equals(KEYWORDS_METHOD_NAME)) 
								keywordsMethod = method;	
						}
						if(keywordsMethod != null) {
							try {
								keywordsMethod = operationClass.getMethod(KEYWORDS_METHOD_NAME, null);
								keywords = (String[]) keywordsMethod.invoke(operationClass, null);
							} catch (Exception e) {
								Gra2MoLLogger.getInstance().print("  [ERROR] The keywords could not be stablished");
								return;
							}
						}
						// If not, the configuration file is queried
						else if (Gra2MoLConfiguration.getInstance().hasProperty(operationString + Gra2MoLConfiguration.SUFFIX_KEYWORDS)){
							String keywordsProperty = Gra2MoLConfiguration.getInstance().getProperty(operationString + Gra2MoLConfiguration.SUFFIX_KEYWORDS);
							keywords = keywordsProperty.split(",");
						} 
						// If nothing, error
						else {
							Gra2MoLLogger.getInstance().print("  [ERROR] The keywords could not be stablished");
							return;
						}
						Gra2MoLLogger.getInstance().append(" with keywords: " + Arrays.toString(keywords));
						for(String keyword : keywords) {
							extensions.put(keyword, operationClass);
						}
					}
				}

			}
		} else {
			Gra2MoLLogger.getInstance().print("[WARNING] No " + getDebugKeywordMessage() + " were found!");
		}
	}
	
	// Methods to be implemented
	/**
	 * Obtains the keyword to be used to retrieve the class names from the property file
	 * @return The string keyword
	 */
	public abstract String getPropertyKeyword();
	/**
	 * Gets the class to which the class must conform
	 * @return
	 */
	public abstract Class getConformsToClass();
	/**
	 * Gets the specific message to print in the debug
	 * @return
	 */
	public abstract String getDebugKeywordMessage();
}
