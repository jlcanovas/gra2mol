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

/**
 * Factory of extensions
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class MappingExtensionFactory extends ExtensionFactory {
	/**
	 * Singleton instance
	 */
	private static MappingExtensionFactory instance;
	
	/**
	 * Manages the singleton 
	 * @return
	 */
	public static MappingExtensionFactory getInstance() {
		if(instance == null) instance = new MappingExtensionFactory();
		return instance;
	} 

	private MappingExtensionFactory() {
		initialize();
	}
	
	/**
	 * Obtains the instance of the query control extension from the keyword
	 * @param keyword
	 * @return
	 */
	public MappingExtensionPoint getMappingExtension(String keyword) {
		Class mappingExtensionClass = extensions.get(keyword);
		MappingExtensionPoint mappingExtensionInstance = null;
		try {
			mappingExtensionInstance = (MappingExtensionPoint) mappingExtensionClass.newInstance();
		} catch (Exception e) {
			Gra2MoLLogger.getInstance().print("Error instantiating the mapping extension statement " + mappingExtensionClass.getName());
		}
		return mappingExtensionInstance;
	}

	@Override
	public String getPropertyKeyword() {
		return Gra2MoLConfiguration.MAPPING_PROPERTY_KEYWORD;
	}

	@Override
	public Class getConformsToClass() {
		return MappingExtensionPoint.class;
	}

	@Override
	public String getDebugKeywordMessage() {
		return "mapping extension";
	}

}
