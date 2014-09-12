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

/**
 * This class encapsultates the elements returned by a extension and offers some common functionality
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class ExtensionValueReturn {

	public static String STRING_VALUE = "__STRING_VALUE";
	public static String NODE_VALUE = "__NODE_VALUE";
	public static String NODELIST_VALUE = "__NODELIST_VALUE";
	public static String RULE_VALUE = "__RULE_VALUE";
	public static String OBJECT_VALUE = "__OBJECT_VALUE";
	
	private String type;
	private Object parameter;
	private Object extension;
	
	public ExtensionValueReturn(String type) {
		this.type = type;
	}
	
	public ExtensionValueReturn(String type, Object parameter) {
		this.type = type;
		this.parameter = parameter;
	}
	
	public ExtensionValueReturn(String type, Object parameter, Object extension) {
		this.type = type;
		this.parameter = parameter;
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public Object getParameter() {
		return parameter;
	}

	public Object getExtension() {
		return extension;
	}	
	
	
	
}
