import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Node;

public class ExtractCST {
	
	public static void main(String[] args) throws Exception {
		ANTLRFileStream afs = new ANTLRFileStream("files/src/Java.g3");
		ANTLRv3Lexer lexer = new ANTLRv3Lexer(afs);
		CommonTokenStream cts = new CommonTokenStream(lexer);
		ANTLRv3Parser parser = new ANTLRv3Parser(cts);
		ANTLRv3Parser.grammarDef_return r = parser.grammarDef();
		Node n = r.returnNode;		
		saveTree("files/gen/resultado.ecore", n);
	}

	public static void saveTree(String path, Node n) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(URI.createFileURI(path));
		try {
			r.getContents().add(n);
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}