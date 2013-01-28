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


package gts.modernization.interpreter.actions;

import gts.modernization.extension.ExtensionValueReturn;
import gts.modernization.extension.MappingExtensionFactory;
import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

public class OperationExtensionAction extends RuleExecutorAction {
	
	public OperationExtensionAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu, Gra2MoLInterpreter interpreter) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu, interpreter);
	}

	@Override
	public void execute() {
		Gra2MoLLogger.getInstance().print("- OPERATION_EXTENSION: ");
		
		String extensionName = initValueElement.getValue();
		Object o = null;
		try {
			Object mappingExtensionInstance = MappingExtensionFactory.getInstance().getMappingExtension(extensionName);
			
			// Sets the params
			Method methodSetParams = mappingExtensionInstance.getClass().getMethod("setParams", java.util.List.class);				
			methodSetParams.invoke(mappingExtensionInstance, (List<Parameter>) initValueElement.getParams());
			
			// Sets the queries

			Method methodSetQueries = mappingExtensionInstance.getClass().getMethod("setQueries", java.util.HashMap.class);				
			methodSetQueries.invoke(mappingExtensionInstance, (HashMap<String, List<Element>>) queries);
			
			// Extracts the execute method
			Method method = mappingExtensionInstance.getClass().getMethod("execute", null);				
			o = method.invoke(mappingExtensionInstance);
			
			if (o != null && o instanceof ExtensionValueReturn) {
				ExtensionValueReturn evr = (ExtensionValueReturn) o;
				
				if(evr.getType() == ExtensionValueReturn.STRING_VALUE) {
					String value = (String) evr.getParameter();
					
					Gra2MoLLogger.getInstance().append(" " + value + " (string value)");
					setValueModelElement(value);					
				} else if (evr.getType() == ExtensionValueReturn.NODE_VALUE) {
					Node node = (Node) evr.getParameter();
					Gra2MoLLogger.getInstance().append(" " + node.getKind() + " (node value)");
					
					// Seeking the rule to execute
					Rule resolvedRule = resolveRule(node);		
					// Executing the rule
					List<ModelElement> returnModelElement = executeRule(resolvedRule, node);								
					// Assigning model element to inielement
					setObjectModelElement(returnModelElement);
					
				} else if (evr.getType() == ExtensionValueReturn.NODELIST_VALUE) {
					Collection<Element> elementList = (Collection<Element>) evr.getParameter();
					Gra2MoLLogger.getInstance().append(" (node list. Size " + elementList.size() + ") ");
					
					for(Element e : elementList) {
						if (e instanceof Node) {
							Node n = (Node) e;

							// Seeking the rule to execute
							Rule resolvedRule = resolveRule(n);		
							// Executing the rule
							List<ModelElement> returnModelElement = executeRule(resolvedRule, n);								
							// Assigning model element to inielement
							setObjectModelElement(returnModelElement);
						}
					}
					
				} else if (evr.getType() == ExtensionValueReturn.RULE_VALUE) {
					Rule r = (Rule) evr.getParameter();
					Element node = (Element) evr.getExtension();
					
					Gra2MoLLogger.getInstance().append(" " + r.getName() + " (rule value)");
					
					// Seeking the rule to execute
					Rule resolvedRule = resolveRule(node);				
					// Executing the rule
					List<ModelElement> returnModelElement = executeRule(resolvedRule, node);								
					// Assigning model element to inielement
					setObjectModelElement(returnModelElement);
				} else if (evr.getType() == ExtensionValueReturn.OBJECT_VALUE) {
					Object obj = evr.getParameter();					
					Gra2MoLLogger.getInstance().append(" (object value)");									
					// Assigning model element to inielement
					setObjectModelElement(obj);
				}
				
			} else {
				Gra2MoLLogger.getInstance().append(" Error in returned value ");
			}
		} catch (Exception e) {
			Gra2MoLLogger.getInstance().print("Error in dynamic instanciation");
		}


	}



}
