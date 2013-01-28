package org.softlang.tests;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.Test;

import company.CompanyFactory;
import company.CompanyPackage;

public class Transformation {

	@Test
	public void test() {
		compareModels();
		fail("Not yet implemented");
	}

	public static void compareModels() {
			// Creates the resourceSet where we'll load the models
			final ResourceSet resourceSet = new ResourceSetImpl();
			
//			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", CompanyFactory.eINSTANCE);
//			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", CompanyFactory.eINSTANCE);
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("company", new EcoreResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(CompanyPackage.eNS_URI, CompanyPackage.eINSTANCE);
 
			try {
				System.out.println("Loading resources.\n"); //$NON-NLS-1$
				// Loads the two models 
				final EObject model1 = ModelUtils.load(new File("./test/example1.company"), resourceSet);
				final EObject model2 = ModelUtils.load(new File("resultModel.company"), resourceSet);

				// Creates the match then the diff model for those two models
				System.out.println("Matching models.\n"); //$NON-NLS-1$
				final MatchModel match = MatchService.doMatch(model1, model2, Collections.<String, Object> emptyMap());
				System.out.println("Differencing models.\n"); //$NON-NLS-1$
				final DiffModel diff = DiffService.doDiff(match, false);
				
				System.out.println("Merging difference.\n"); //$NON-NLS-1$
				final List<DiffElement> differences = new ArrayList<DiffElement>(diff.getOwnedElements());
				// This will merge all references to the right model (second argument).
				MergeService.merge(differences, true);

				// Prints the results
				try {
					System.out.println("MatchModel :\n"); //$NON-NLS-1$
					System.out.println(ModelUtils.serialize(match));
					System.out.println("DiffModel :\n"); //$NON-NLS-1$
					System.out.println(ModelUtils.serialize(diff));
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Serializes the result as "result.emfdiff" in the directory this class has been called from.
				System.out.println("saving emfdiff as \"result.emfdiff\""); //$NON-NLS-1$
				final ComparisonResourceSnapshot snapshot = DiffFactory.eINSTANCE.createComparisonResourceSnapshot(); 
				snapshot.setDate(Calendar.getInstance().getTime());
				snapshot.setMatch(match);
				snapshot.setDiff(diff);
				ModelUtils.save(snapshot, "result.emfdiff"); //$NON-NLS-1$
			} catch (IOException e) {
				// shouldn't be thrown
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		compareModels();
	}
	
}
