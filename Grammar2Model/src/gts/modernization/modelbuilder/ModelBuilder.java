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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.core.modelhandler.ModelHandler;
import org.eclipse.gmt.modisco.core.modelhandler.ModelHandlerManager;
import org.eclipse.gmt.modisco.core.modeling.Model;
import org.eclipse.gmt.modisco.core.modeling.ModelElement;
import org.eclipse.gmt.modisco.core.modeling.ReferenceModel;
import org.eclipse.gmt.modisco.core.modeling.ReferenceModelElement;
import org.eclipse.gmt.modisco.core.projectors.Extractor;
import org.eclipse.gmt.modisco.core.projectors.Injector;
import org.eclipse.gmt.modisco.core.projectors.ProjectorActualParameter;
import org.eclipse.gmt.modisco.modelhandler.emf.EMFModelHandler;
import org.eclipse.gmt.modisco.modelhandler.emf.modeling.EMFReferenceModel;
import org.eclipse.gmt.modisco.modelhandler.emf.projectors.EMFExtractor;
import org.eclipse.gmt.modisco.modelhandler.emf.projectors.EMFInjector;

/**
 * This class allows Gra2MoL to create models. At this moment, it uses the MoDisco model handler but it should
 * be changed in the future.
 * @author jlcanovas
 *
 */
public class ModelBuilder {

	private ModelHandler modelhandler;
	private ReferenceModel metamodel;
	private String metamodelPrefix;
	/**
	 * Packages founded in target metamodel
	 */
	private List<String> packages;

	public ModelBuilder(String injector, String metamodelPrefix) {
		// Set ModelHandler
		ModelHandlerManager mhm = ModelHandlerManager.getInstance(); 
		ModelHandler mh = new EMFModelHandler(); 
		mhm.putModelHandler("EMF", mh);

		// Set metametamodel
		ReferenceModel metametamodel = EMFReferenceModel.getMetametamodel();

		// Set injector
		Injector metamodelInjector = EMFInjector.getInstance();

		// Set params injector
		Map<String, ProjectorActualParameter<?>> params = new HashMap<String, ProjectorActualParameter<?>>();
		params.put("URI", new ProjectorActualParameter<URI>(URI.createFileURI(injector)));

		this.modelhandler = mh;
		this.metamodel = (ReferenceModel) this.modelhandler.loadModel(metametamodel, metamodelInjector, params);
		this.metamodelPrefix = metamodelPrefix;
	}

	public ReferenceModel getMetamodel() {
		return this.metamodel;
	}

	public ModelHandler getModelHandler() {
		return this.modelhandler;
	}

	public List<ReferenceModelElement> getPackages() {
		ArrayList<ReferenceModelElement> sol = new ArrayList<ReferenceModelElement>();
		Iterator it = this.metamodel.getContents().iterator();
		while(it.hasNext()) {
			ReferenceModelElement rme = (ReferenceModelElement) it.next();
			sol.add(rme);
		}
		return sol;
	}

	public ReferenceModelElement getPackage(String identifier) {
		ReferenceModelElement sol = null;
		Iterator it = this.metamodel.getContents().iterator();
		while(it.hasNext()) {
			ReferenceModelElement rme = (ReferenceModelElement) it.next();
			String name = (String) rme.get("name");
			if(name.equals(identifier)) sol = rme;
		}
		return sol;
	}

	public List<ReferenceModelElement> getSubPackages(ReferenceModelElement pack) {
		ArrayList<ReferenceModelElement> sol = new ArrayList<ReferenceModelElement>();

		Iterator itme = pack.getContents().iterator();
		while(itme.hasNext()) {
			ReferenceModelElement rme = (ReferenceModelElement) itme.next();
			ReferenceModelElement type = rme.getReferenceModelElement();
			String typeSubPackage = (String) type.get("name");
			if(typeSubPackage.equals("EPackage")) {
				sol.add(rme);
			}
		}
		return sol;
	}

	public ReferenceModelElement getSubPackage(String subpackage, ReferenceModelElement pack) {
		List<ReferenceModelElement> subPackages = getSubPackages(pack);
		Iterator<ReferenceModelElement> itrme = subPackages.iterator();
		while(itrme.hasNext()){ 
			ReferenceModelElement rme = itrme.next();
			String name = (String) rme.get("name");
			if(name.equals(subpackage)) return rme;
		}

		return null;
	}

	public static void main(String[] args) {
		ModelBuilder mb = new ModelBuilder("../Grammar2Model.examples.extractJava2KDM/files/metamodels/kdm.ecore", "kdm");
		mb.getSubPackages(mb.getPackages().get(0));
	}

	/**
	 * Initilize the packages variable. This variables stores the main packages of the metamodel
	 */
	public void initPackages() {
		packages = new ArrayList<String>();
		Iterator<ReferenceModelElement> it = this.getPackages().iterator();
		while(it.hasNext()) {
			ReferenceModelElement rme = (ReferenceModelElement) it.next();
			packages.add(rme.getName());
		}
	}

	public Model newModel(String modelName) {
		//		System.out.println("Initialization of the \""+modelName+"\" new model");
		return this.modelhandler.createModel(this.metamodel);
	}

	public void save(Model model, String path) {
		// Sets extractor
		Extractor modelExtractor = EMFExtractor.getInstance();
		// Set params extractor
		Map<String, ProjectorActualParameter<?>> params = new HashMap<String, ProjectorActualParameter<?>>();
		params.put("URI", new ProjectorActualParameter<URI>(URI.createFileURI(path)));	

		if(model != null) {
			//System.out.println("Saving of the current model");
			this.modelhandler.saveModel(model, modelExtractor, params);
		}
	}

	public Model load(String modelPath) {
		Injector modelInjector = EMFInjector.getInstance();
		Map<String, ProjectorActualParameter<?>> modelParams = new HashMap<String, ProjectorActualParameter<?>>();
		modelParams.put("URI", new ProjectorActualParameter<URI>(URI.createFileURI(modelPath)));

		Model m = modelhandler.loadModel(metamodel, modelInjector, modelParams);
		return m;
	}

	/**
	 * Creates the metamodel element. It analyzes the URI in order to discover the real root of the 
	 * metalement (considering the main package of the metamodel).
	 * @param m Model where the metaelement is created
	 * @param element URI
	 * @return created Modelelement
	 */
	public ModelElement createModelElement(Model m, String element) {
		ModelElement sol;
		String metaId = null;

		int index = element.indexOf("::");
		if(index > 0) {
			String pack = element.substring(0, element.indexOf(":"));
			if(packages.contains(pack)) {
				metaId = element;
			} else {
				metaId = this.metamodelPrefix + "::" + element;	
			}			
		} else {
			metaId = this.metamodelPrefix + "::" + element;			
		}
		//System.out.println("Create: " + metaId);
		sol = m.createModelElement(this.getMetamodel().getReferenceModelElementByName(metaId));
		return sol;
	}

	/**
	 * Finds out the metaclass with the name specified as identifier. It does not create a new metaelement and it
	 * is usefull for using with abstract metaclasses.
	 * @param identifier
	 * @return
	 */
	public ModelElement getMetaclass(String identifier) {
		String prefix = packagePrefix(identifier);

		// Checks if the identifier has a prefix but it does not exists 
		// In this case, the metamodel prefix must be attached to the beginning of the identifier
		if(prefix != null && getPackage(prefix) == null){
			identifier = this.metamodelPrefix + "::" + identifier;
			prefix = packagePrefix(identifier);
		} 

		// Move forward the identifier string
		if(prefix != null) identifier = identifier.substring(identifier.indexOf("::")+2, identifier.length());
		// If the identifier has not prefix, we use the metamodel prefix
		if(prefix == null) prefix = this.metamodelPrefix;

		// Extract the first package and move forward the prefix and identifier
		ReferenceModelElement rme = getPackage(prefix);
		prefix = packagePrefix(identifier);
		if(prefix != null) identifier = identifier.substring(identifier.indexOf("::")+2, identifier.length());

		// Traverse the subpackage structure
		while(prefix != null) {
			rme = getSubPackage(prefix, rme);		
			prefix = packagePrefix(identifier);
			if(prefix != null)
				identifier = identifier.substring(identifier.indexOf("::")+2, identifier.length());

		}

		// Locate the metaelement
		if(rme != null) {
			Iterator itme = rme.getContents().iterator();
			while(itme.hasNext()) {
				ModelElement me = (ModelElement) itme.next();
				ReferenceModelElement metaclass = me.getReferenceModelElement();
				if(!((String) metaclass.get("name")).equals("EAnnotation")) {
					String name = (String) me.get("name");
					if(name.equals(identifier)) return me;
				}
			}
		} else {
			Gra2MoLLogger.getInstance().print("Problem finding metaclass...");
		}

		return null;		
	}

	private String packagePrefix(String identifier) {
		String sol = null;

		int index = identifier.indexOf(":");
		if(index > 0) {
			sol = identifier.substring(0, index);
		} 

		return sol;
	}


}
