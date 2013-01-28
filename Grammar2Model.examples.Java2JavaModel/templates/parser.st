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

public class $grammar$Test {

	public static void main(String[] args) throws Exception {
		ANTLRFileStream afs = new ANTLRFileStream("$pathLanguage$");
		$grammar$Lexer lexer = new $grammar$Lexer(afs);
		CommonTokenStream cts = new CommonTokenStream(lexer);
		$grammar$Parser parser = new $grammar$Parser(cts);
		$grammar$Parser.$mainRule$_return r = parser.$mainRule$();
		Node n = r.returnNode;		
		saveTree("$path$", n);
	}
	
	public static Node parser(String source) throws Exception {
		ANTLRFileStream afs = new ANTLRFileStream(source);
		$grammar$Lexer lexer = new $grammar$Lexer(afs);
		CommonTokenStream cts = new CommonTokenStream(lexer);
		$grammar$Parser parser = new $grammar$Parser(cts);
		$grammar$Parser.$mainRule$_return r = parser.$mainRule$();
		Node n = r.returnNode;		
		return n;
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