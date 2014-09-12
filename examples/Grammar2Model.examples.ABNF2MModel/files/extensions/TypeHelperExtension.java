import gts.modernization.extension.*;
import org.eclipse.emf.ecore.EcorePackage;

public class TypeHelperExtension extends MappingExtensionPoint {

	public ExtensionValueReturn execute() {		

		String paramType = (String) getParam(0);
		
		if(paramType.toLowerCase().equals("string")) {
			return returnObject(EcorePackage.Literals.ESTRING);
		} else if(paramType.toLowerCase().equals("boolean")) {
			return returnObject(EcorePackage.Literals.EBOOLEAN);
		} else if(paramType.toLowerCase().equals("int") || paramType.toLowerCase().equals("integer")) {
			return returnObject(EcorePackage.Literals.EINT);
		}		
		return null;
	}
	
	private String digestType(String text) {
		return text.substring(1, text.length()-1);
	}
}