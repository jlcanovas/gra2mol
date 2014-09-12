package gra2mol.examples.PLSQL2ASTMModel;

import java.util.HashMap;
import java.util.Map;

import kdm.action.impl.ActionPackageImpl;
import kdm.build.impl.BuildPackageImpl;
import kdm.code.impl.CodePackageImpl;
import kdm.conceptual.impl.ConceptualPackageImpl;
import kdm.core.impl.CorePackageImpl;
import kdm.data.impl.DataPackageImpl;
import kdm.event.impl.EventPackageImpl;
import kdm.kdm.Segment;
import kdm.kdm.impl.KdmPackageImpl;
import kdm.platform.impl.PlatformPackageImpl;
import kdm.source.impl.SourcePackageImpl;
import kdm.structure.impl.StructurePackageImpl;
import kdm.ui.impl.UiPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import gra2mol.examples.PLSQL2ASTMModel.measure.CheckPrimaryKeys;
import gra2mol.examples.PLSQL2ASTMModel.measure.DatabaseIUAccess;
import gra2mol.examples.PLSQL2ASTMModel.measure.DatabaseSimpleAccess;
import gra2mol.examples.PLSQL2ASTMModel.measure.GlobalVariables;
import gra2mol.examples.PLSQL2ASTMModel.measure.LocateGlobalVariables;
import gra2mol.examples.PLSQL2ASTMModel.measure.Measure; 

public class MetricEngine {
	String modelPath;
	
	public static void main(String[] args) {
		MetricEngine engine = new MetricEngine("KDMextraction/models/resultadoKDM.xmi");
		engine.executeTest1();
	}
	
	public MetricEngine(String modelPath) {
		super();
		this.modelPath = modelPath;
	}

	public void executeTest1() {
		Segment kdmSegment = loadKdmModel(modelPath);
		
		Measure m1 = new CheckPrimaryKeys(kdmSegment);
		m1.execute();
		
		Measure m2 = new DatabaseSimpleAccess(kdmSegment);
		m2.execute();
		
		Measure m3 = new DatabaseIUAccess(kdmSegment);
		m3.execute();

		Measure m4 = new GlobalVariables(kdmSegment);
		m4.execute();
	
		Measure m5 = new LocateGlobalVariables(kdmSegment);
		m5.execute();
	} 
	
	private static Segment loadKdmModel(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/kdm", KdmPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/action", ActionPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/build", BuildPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/code", CodePackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/conceptual", ConceptualPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/core", CorePackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/platform", PlatformPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/data", DataPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/event", EventPackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/source", SourcePackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/structure", StructurePackageImpl.eINSTANCE);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/kdm/ui", UiPackageImpl.eINSTANCE);

		Map options = new HashMap();
		options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
		options.put(XMLResource.OPTION_DISABLE_NOTIFY, Boolean.TRUE);
		
		Resource r = rs.getResource(URI.createFileURI(path), true);
		Segment def = null;
		try {
			r.load(options);
			def = (Segment) r.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return def;
	}

}
