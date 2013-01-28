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

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;

import java.util.HashMap;
import java.util.List;

/**
 * This class is the root of the extension point mechanism. It offers some common functionality
 * for the extension point hierarchy elements.
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public abstract class ExtensionPoint {
	/**
	 * The parameters received after the extension call
	 */
	protected List<Parameter> params;
	/**
	 * The queries of the cointainer rule
	 */
	protected HashMap<String, List<Element>> queries;
		
	// Working with params. This methods digest the parameters
	/**
	 * Obtains the param of a specific position
	 * @param position
	 * @return
	 */
	public Object getParam(int position) {
		if(position > params.size()) return null;
		
		Parameter parameter = params.get(position);
		if(parameter.getType() == ParameterType.STRING_VALUE) {
			return parameter.getValue();			 
		} else if (parameter.getType() == ParameterType.QUERY_ACCESS) {
			// TODO
		} else if (parameter.getType() == ParameterType.VARIABLE) {
			List<Element> result = queries.get(parameter.getValue());
			return result;
		} else if (parameter.getType() == ParameterType.NUMBER_VALUE) {
			return parameter.getValue();			
		}
			
		return null;
	}

	/**
	 * Offers a method to the subclasses to print in the logger
	 * @param msg
	 */
	public void printError(String msg) {
		Gra2MoLLogger.getInstance().print("<Extension Error: " + msg + ">");
	}

	// Getter and setters 
	public void setQueries(HashMap<String, List<Element>> queries) {
		this.queries = queries;
	}
	
	public HashMap<String, List<Element>> getQueries() {
		return queries;
	}
	
	public void setParams(List<Parameter> params) {
		this.params = params;
	}
	
	public List<Parameter> getParams() {
		return params;
	}
}
