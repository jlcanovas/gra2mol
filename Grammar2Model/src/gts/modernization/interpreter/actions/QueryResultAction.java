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

import gts.modernization.interpreter.Gra2MoLLogger;
import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class QueryResultAction extends RuleExecutorAction {

	public QueryResultAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu, Gra2MoLInterpreter interpreter) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu, interpreter);
	}

	public void execute() {
		Gra2MoLLogger.getInstance().print("- QUERY_RESULT: ");
		// Extract the result of the query
		List<Element> result = extractResult(initValueElement.getValue());

		int counter = 0; 
		if(result != null && result.size() > 0) {
			Gra2MoLLogger.getInstance().append(result.size() + " bindings:");
			Iterator<Element> it = result.iterator();
			Gra2MoLLogger.getInstance().incDeep();
			while(it.hasNext()) {
				Element node = it.next();

				Gra2MoLLogger.getInstance().print("(" + ++counter + "/" + result.size() + ") result node: " + node.getKind() + " (kind). Rule... ");

				// Searching for the rule to execute
				Rule resolvedRule = resolveRule(node);
				
				// Executing the rule
				List<ModelElement> returnModelElement = executeRule(resolvedRule, node);
								
				// Assigning model element to inielement
				setObjectModelElement(returnModelElement);
			}	
			Gra2MoLLogger.getInstance().decDeep();
		} else {
			Gra2MoLLogger.getInstance().append("THE VARIABLE DOESNT EXIST");
		}
	}
}
