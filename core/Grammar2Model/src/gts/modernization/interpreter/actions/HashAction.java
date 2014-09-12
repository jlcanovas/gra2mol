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
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.Gra2MoL.Core.HashValue;
import gts.modernization.model.Gra2MoL.Core.InitUnitElement;
import gts.modernization.model.Gra2MoL.Core.Parameter;
import gts.modernization.model.Gra2MoL.Core.ParameterType;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.modelbuilder.ModelBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;

public class HashAction extends Gra2MoLInterpreterAction {
	private HashMap<String, HashMap<String, HashValue>> hashes;

	public HashAction(ModelBuilder modelBuilder, Model model, ModelElement modelElement, HashMap<String, List<Element>> queries, Element actualNode, Rule rule, InitUnitElement iu, HashMap<String, HashMap<String, HashValue>> hashes) {
		super(modelBuilder, model, modelElement, queries, actualNode, rule, iu);
		this.hashes = hashes;
	}

	@Override
	public void execute() {
		Gra2MoLLogger.getInstance().print("- HASH: ");

		String hash = initValueElement.getValue();
		Gra2MoLLogger.getInstance().append(hash + " (hash)" );

		// First, we extract the key of the hashmap
		String key = null;
		Parameter param = initValueElement.getParams().get(0);
		if(param.getType() == ParameterType.STRING_VALUE) {
			key = param.getValue();
		} else if (param.getType() == ParameterType.QUERY_ACCESS) {
			Element node = null;
			if((extractFrom() != null) && param.getValue().equals(extractFrom().getAlias())) {
				node = actualNode;
			} else {
				List<Element> result = queries.get(param.getValue());
				if(result.size() > 0) {
					node = result.get(0);
				}
			}

			if (node instanceof Node) {
				Node firstNode = (Node) node;
				Leaf l = firstNode.findLeaf(param.getExtension());
				key = l.getValue();
			}
		}				

		// Second, we locate the hash and extract de value
		if(key != null) {
			Gra2MoLLogger.getInstance().append(" - " + key + " (key)");	
			HashMap<String, HashValue> map = hashes.get(hash);
			if(map != null) {
				HashValue mv = map.get(key);
				if(mv != null) {
					modelElement.set(initElement, mv.getToElement());
					Gra2MoLLogger.getInstance().append(" - " + mv.getToElement() + " (value)");
				} else {
					mv = defaultValue(map);
					if(mv != null) {
						System.out.println("There is no hash value in '" + hash + "' hash for the key '" + key + "' using default value");
						Gra2MoLLogger.getInstance().append(" - " + mv.getToElement() + " (Default value)");
						modelElement.set(initElement, mv.getToElement());
					} else {
						System.out.println("There is no hash value in '" + hash + "' hash for the key '" + key + "'");
						Gra2MoLLogger.getInstance().append(" NO HASH VALUE!");
					}
				}
			} else {
				System.out.println("There is no hash for the name: " + hash);
				Gra2MoLLogger.getInstance().append(" NO HASH!");					
			}
		} else {
			System.out.println("There is no key for the hash: " + hash);
			Gra2MoLLogger.getInstance().append(" NO KEY!");					
		}
	}
	
	public HashValue defaultValue(HashMap<String, HashValue> map) {
		HashValue sol = null;
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(key.equals("DEFAULT")) sol = map.get(key);
		}
		
		return sol;
	}

}
