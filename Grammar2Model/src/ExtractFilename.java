import gts.modernization.model.CST.*;
import gts.modernization.extension.*;

import java.util.List;

public class ExtractFilename extends MappingExtensionPoint {

	public ExtensionValueReturn execute() {				
		List<Element> resultQuery = (List<Element>) getParam(0);
		if(resultQuery.size() > 0) {
			Element e = resultQuery.get(0);
			if (e instanceof Node) {
				Node node = (Node) e;
				Leaf fileNameLeaf = node.getLeaf("filename", 0);
				if(fileNameLeaf != null) {
					String value = fileNameLeaf.getValue();
					int index = value.lastIndexOf(".");
					if(index > 0) {
						return returnString(value.substring(0, index));
					} 
				}			
			} 
		}
		return returnString(null);

	}
}
