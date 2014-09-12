package gts.modernization.ui.editors.gra2mol;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import gts.modernization.model.Gra2MoL.Core.ViewDefinition;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;
import gts.modernization.ui.editors.gra2mol.outline.Gra2MoLEditorContentOutlinePage;
import gts.modernization.ui.editors.gra2mol.properties.Gra2MoLPropertyPage;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.DocumentProviderRegistry;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.osgi.framework.Bundle;

import sun.security.action.GetBooleanAction;


public class Gra2MoLEditor extends TextEditor {
	public static String PLUGIN_ID = "Grammar2Model.UI";

	private ColorManager colorManager;
	private IEditorInput input;
	private Gra2MoLEditorContentOutlinePage outlinePage;

	private Gra2MoLConfiguration gra2molConfiguration;
	private Gra2MoLDocumentProvider gra2molDocumentProvider;
	private Gra2MoLEditorContentOutlinePage gra2molEditorContentOutlinePage;
	
	public Gra2MoLEditor() {
		super();
		colorManager = new ColorManager();
		
		gra2molConfiguration = new Gra2MoLConfiguration(colorManager);
		setSourceViewerConfiguration(gra2molConfiguration);
		
		gra2molDocumentProvider = new Gra2MoLDocumentProvider();
		setDocumentProvider(gra2molDocumentProvider);
		
		gra2molEditorContentOutlinePage = new Gra2MoLEditorContentOutlinePage(this);
		update();
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	protected void doSetInput(IEditorInput newInput) throws CoreException {
		super.doSetInput(newInput);
		this.input = newInput;

		if (outlinePage != null)
			outlinePage.setInput(input);
	}

	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {
			if (outlinePage == null) {
				outlinePage = gra2molEditorContentOutlinePage;
				if (getEditorInput() != null)
					outlinePage.setInput(getEditorInput());
			}
			return outlinePage;
		}

		return super.getAdapter(required);
	}

	protected IDocument getInputDocument() {
		IDocument document = getDocumentProvider().getDocument(input);
		return document;
	}

//	protected IFile getInputFile() {
//	IFileEditorInput ife = (IFileEditorInput) input;
//	IFile file = ife.getFile();
//	return file;
//	}

	public IEditorInput getInput() {
		return input;
	}

	public static URL getInstallURL() {
		Bundle bundle = Platform.getBundle(Gra2MoLEditor.PLUGIN_ID);
		if(bundle != null) {
			return bundle.getEntry("/");
		} else
			return null;
	}

	public static String getAbsoluteInstallPath() {
		Bundle bundle = Platform.getBundle(Gra2MoLEditor.PLUGIN_ID);
		String result = null;
		try {
			URL localURL = FileLocator.toFileURL(bundle.getEntry("/"));
			result = localURL.toExternalForm();
			if (result.startsWith("file:/")) {
				result = result.substring(6); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void doSave(IProgressMonitor progressMonitor) {		
		super.doSave(progressMonitor);
		update();
		
	}
	
	public void update() {
		IEditorInput editorinput = getEditorInput();	    
		IDocumentProvider documentProvider = getDocumentProvider();		
		IDocument document = documentProvider.getDocument(editorinput);
		if(document instanceof Gra2MoLDocument) {
			Gra2MoLDocument gra2molDocument = (Gra2MoLDocument) document;
			IFile file = gra2molDocument.getFile();

			gra2molEditorContentOutlinePage.update();
			gra2molConfiguration.update(file);
		}
	}

	public static ViewDefinition loadView(String content) {
		try {
			CharStream input = new ANTLRStringStream(content);
			Gra2MoLLexer lex = new Gra2MoLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			Gra2MoLParser parser = new Gra2MoLParser(tokens);
			Gra2MoLParser.viewDefinition_return r = parser.viewDefinition();	
			return r.viewReturn;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	
	public void saveState(IMemento memento) {
		System.out.println("Salvando estado...");
		
		super.saveState(memento);
	}
	
	
	
}
