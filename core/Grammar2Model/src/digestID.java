

import gts.modernization.model.CST.*;
import gts.modernization.extension.*;

import java.util.Iterator;
import java.util.List;

public class digestID extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {
		String sol = "noDigestedValue";
		
		List<Element> resultQuery = (List<Element>) getParam(0);
		Iterator<Element> itResultQuery = resultQuery.iterator();
		while(itResultQuery.hasNext()) {
			Element e = itResultQuery.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				Leaf leaf = n.getLeaf("DQVAL", 0);
				if(leaf != null) {
					String leafValue = leaf.getValue();
					sol = leafValue.substring(1, leafValue.length()-1).toUpperCase();		
				} 
			}
		}		
		
		return returnString(sol);
	}

}
