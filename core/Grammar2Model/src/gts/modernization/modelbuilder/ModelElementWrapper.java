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


package gts.modernization.modelbuilder;

import gts.modernization.interpreter.Gra2MoLLogger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.core.modeling.Feature;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;
import org.eclipse.gmt.modisco.core.modeling.ReferenceModelElement;
import org.eclipse.gmt.modisco.modelhandler.emf.modeling.EMFModel;
import org.eclipse.gmt.modisco.modelhandler.emf.modeling.EMFModelElement;
import org.eclipse.gmt.modisco.modelhandler.emf.modeling.EMFReferenceModelElement;

/**
 * This class is a wrapper for ModelElement. It adds new functionality to infer inheritance between 
 * elements and other characteristics
 * @author Javier Canovas
 *
 */
public class ModelElementWrapper implements ModelElement {
	private EMFModelElement modelElement;
	
	public ModelElementWrapper(ModelElement modelElement) {
		this.modelElement = (EMFModelElement) modelElement;
	}
	
	public EMFModelElement getModelElement() {
		return modelElement;
	}

	public void setModelElement(EMFModelElement modelElement) {
		this.modelElement = modelElement;
	}



	/**
	 * Checks if this modelElement is subtype of superme
	 * @param superme The possible supertype
	 * @return 
	 */
	public boolean isSubtype(ModelElement superme) {
//		return isSubtype(superme, modelElement.getReferenceModelElement());
		return isSubtype(superme, modelElement);
	}

	/**
	 * Checks if rme is subtype of superme. It compares all supertypes of rme.
	 * @param superme
	 * @param rme
	 * @return
	 */
	private boolean isSubtype(ModelElement superme, ModelElement rme) {
		List l = (List) rme.get("eSuperTypes");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			ReferenceModelElement rme2 = (ReferenceModelElement) it.next();
			String rme2Name = rme2.getName();
			String supermeName = (String) superme.get("name");
			if(((String) superme.get("name")).equals(rme2.getName())) return true;
		}

		boolean sol = false;
		it = l.iterator();
		while((sol == false) && it.hasNext()) {
			ReferenceModelElement rme2 = (ReferenceModelElement) it.next();
			sol = isSubtype(superme, rme2);		
		}

		return sol;
	}
	
	/**
	 * Checks if rme is subtype of superme. It compares all supertypes of rme.
	 * @param superme
	 * @param rme
	 * @return
	 */
	private boolean isSubtype(ModelElement superme, ReferenceModelElement rme) {
		List l = (List) rme.get("eSuperTypes");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			ReferenceModelElement rme2 = (ReferenceModelElement) it.next();
			String rme2Name = rme2.getName();
			String supermeName = (String) superme.get("name");
			if(((String) superme.get("name")).equals(rme2.getName())) return true;
		}

		boolean sol = false;
		it = l.iterator();
		while((sol == false) && it.hasNext()) {
			ReferenceModelElement rme2 = (ReferenceModelElement) it.next();
			sol = isSubtype(superme, rme2);		
		}

		return sol;
	}

	/**
	 * Checks if 'property' is multivaluated
	 * @param property
	 * @return
	 */
	public boolean isMultiValuedProperty(String property) {
		ReferenceModelElement rme = modelElement.getReferenceModelElement();
		//System.out.println("checking multivalue property of " + property + " property");
		Feature f = null;
		try {
			f = rme.getFeature(property);
		} catch (Exception e) {
			throw new IllegalArgumentException("The property '" + property + "' does not exist!");
		}
		return (f == null) ? false : f.isMultiValued();
	}

	/**
	 * Extracts the modelelement of 'name' feature
	 * @param feature
	 * @return
	 */
	public ModelElement extractTypeOfFeatureName(String feature) {
		ReferenceModelElement rme = modelElement.getReferenceModelElement(); 
		Feature f = null;
		ModelElement me2 = null;
		try {
			f = rme.getFeature(feature);
			me2 = f.getType();
		} catch (Exception e) {
			throw new IllegalArgumentException("The feature '" + feature + "' does not exist!");
		}
		return (f == null) ? null : me2;
	}



	public void add(String propertyName, Object value) {
		modelElement.add(propertyName, value);
	}



	public boolean equals(Object obj) {
		return modelElement.equals(obj);
	}



	public Object get(String propertyName) {
		return modelElement.get(propertyName);
	}



	public EMFModelElement getContainer() {
		return modelElement.getContainer();
	}



	public Collection<? extends EMFModelElement> getContents() {
		return modelElement.getContents();
	}



	public EMFModel getModel() {
		return modelElement.getModel();
	}



	public EMFReferenceModelElement getReferenceModelElement() {
		return modelElement.getReferenceModelElement();
	}



	public int hashCode() {
		return modelElement.hashCode();
	}



	public boolean isKindOf(ReferenceModelElement referenceModelElement) {
		return modelElement.isKindOf(referenceModelElement);
	}



	public boolean isTypeOf(ReferenceModelElement referenceModelElement) {
		return modelElement.isTypeOf(referenceModelElement);
	}



	public void remove(String propertyName, Object value) {
		modelElement.remove(propertyName, value);
	}



	public void set(String propertyName, Object value) {
		modelElement.set(propertyName, value);
	}



	public String toString() {
		return modelElement.toString();
	}



	public void unset(String propertyName) {
		modelElement.unset(propertyName);
	}

}
