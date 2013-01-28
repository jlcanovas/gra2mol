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

import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.Parameter;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.antlr.tool.Rule;

/**
 * The new mapping extension must inherits from this class
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class MappingExtensionPoint extends ExtensionPoint {	
		
	// Constructors for return values
	public ExtensionValueReturn returnString(String value) {
		return new ExtensionValueReturn(ExtensionValueReturn.STRING_VALUE, value);		
	}
	
	public ExtensionValueReturn returnRule(Rule rule, Element element) {
		return new ExtensionValueReturn(ExtensionValueReturn.RULE_VALUE, rule, element);		
	}
	
	public ExtensionValueReturn returnNode(Element element) {
		return new ExtensionValueReturn(ExtensionValueReturn.NODE_VALUE, element);		
	} 
	
	public ExtensionValueReturn returnNodeList(Collection<Element> elementList) {
		return new ExtensionValueReturn(ExtensionValueReturn.NODELIST_VALUE, elementList);		
	}
	
	public ExtensionValueReturn returnObject(Object element) {
		return new ExtensionValueReturn(ExtensionValueReturn.OBJECT_VALUE, element);		
	}

	/**
	 * This method implements the extension functionality
	 * @return 
	 */
	public abstract ExtensionValueReturn execute();
}
