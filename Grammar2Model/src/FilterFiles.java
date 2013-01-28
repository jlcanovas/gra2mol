

import gts.modernization.model.CST.*;
import gts.modernization.extension.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FilterFiles extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {		
		HashMap<String, Element> log = new HashMap<String, Element>();
		
		List<Element> resultQuery = (List<Element>) getParam(0);
		Iterator<Element> itResultQuery = resultQuery.iterator();
		while(itResultQuery.hasNext()) {
			Element e = itResultQuery.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				
				// Extracts the filename leaf and gets the name (not the extension)
				Leaf fileName = n.getLeaf("filename", 0);				
				String justName = extractName(fileName.getValue());
				
				if(!log.containsKey(justName)) {
					// If has not been included, we do it
					
					// But before, we enrich the CST tree 
					// We add a leaf with the filename (just the name)
					Leaf justNameLeaf = CSTFactory.eINSTANCE.createLeaf();
					justNameLeaf.setKind("justname");
					justNameLeaf.setValue(justName);
					n.getChildren().add(justNameLeaf);
					
					log.put(justName, n);
				}
				
			}
		}				
		
		return returnNodeList(log.values());
	}

	/**
	 * Extracts the name section of a file name
	 * @param value
	 * @return
	 */
	private String extractName(String value) {
		String result = value;
		if (value.indexOf(".") > 0) {
			result = value.substring(0, value.indexOf("."));
		}
		return result;
	}
}
