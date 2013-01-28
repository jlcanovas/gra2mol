package gts.modernization.ui.editors.gra2mol.outline;

import gts.modernization.model.Gra2MoL.Core.InitUnitGroup;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.ViewDefinition;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;
import gts.modernization.ui.editors.gra2mol.Gra2MoLDocument;
import gts.modernization.ui.editors.gra2mol.Gra2MoLEditor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.MarkerUtilities;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;



public class OutlineContentProvider implements ITreeContentProvider {

	private ViewDefinition root = null;
	private IDocumentProvider documentProvider;
	private IEditorInput input;

	protected final static String TAG_POSITIONS = "__tag_positions";
	protected IPositionUpdater positionUpdater = new DefaultPositionUpdater(TAG_POSITIONS);

	public OutlineContentProvider(IDocumentProvider provider){
		super();
		this.documentProvider = provider;
	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Rule) {
			Rule r = (Rule) parentElement;
			List ruleContent = new ArrayList();
			ruleContent.add(r.getFrom());
			if(r.getContext() != null && r.getContext().size() > 0) ruleContent.add(r.getContext());
			ruleContent.add(r.getTo());
			if(r.getQueries() != null && r.getQueries().size() == 0) {
				ruleContent.add(new ArrayList());
			} else {
				ruleContent.add(r.getQueries());
			}			
			ruleContent.add(r.getInits()); 
			return ruleContent.toArray();			
		} else if (parentElement instanceof EList) {
			EList list = (EList) parentElement;
			return list.toArray();			
		} else if (parentElement instanceof InitUnitGroup) {
			InitUnitGroup iug = (InitUnitGroup) parentElement;
			List inits = iug.getInits();
			return inits.toArray();			
		}		
		return new Object[0];
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof Rule) return true;		
		else if (element instanceof EList) return false;	
		else if (element instanceof InitUnitGroup) return false;		
		return false;
	}

	public Object[] getElements(Object inputElement) {
		if (root == null)
			return new Object[0];

		List allDefinitions = new ArrayList();
		List hashDefinitions = root.getHashes();
		if(hashDefinitions != null) 
			allDefinitions.addAll(hashDefinitions);

		List rulesDefinitions = root.getRules();
		if(rulesDefinitions != null) 
			allDefinitions.addAll(rulesDefinitions);

		if (allDefinitions != null)
			return allDefinitions.toArray();
		else 
			return new Object[0];
	}

	public void dispose() {		
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (oldInput != null) {
			IDocument document = documentProvider.getDocument(oldInput);
			if (document != null) {
				try	{
					document.removePositionCategory(TAG_POSITIONS);
				}
				catch (BadPositionCategoryException x) { }
				document.removePositionUpdater(positionUpdater);
			}
		}

		input = (IEditorInput) newInput;

		if (newInput != null) {
			IDocument document = documentProvider.getDocument(newInput);
			if (document != null) {
				document.addPositionCategory(TAG_POSITIONS);
				document.addPositionUpdater(positionUpdater);

				ByteOutputStream bos = new ByteOutputStream();
				PrintStream ps = new PrintStream(bos);
				System.setErr(ps);

				ViewDefinition rootElement = Gra2MoLEditor.loadView(document.get());

				if(document instanceof Gra2MoLDocument) {
					Gra2MoLDocument gra2molDocument = (Gra2MoLDocument) document;
					IFile file = gra2molDocument.getFile();
					try {
						file.deleteMarkers(IMarker.PROBLEM, true, IFile.DEPTH_ONE);
					} catch (CoreException e) {
						System.out.println("Exception marking...");
					}
				}
				
				if(bos.toString().length() > 0) {
					HashMap<Integer, String> errors = digestErrors(bos.toString());
					Iterator<Integer> keys = errors.keySet().iterator();
					while(keys.hasNext()) {
						Integer key = keys.next();
						String message = errors.get(key);

						Map attrs = new HashMap();
						attrs.put(IMarker.LINE_NUMBER, new Integer(key));
						attrs.put(IMarker.MESSAGE, message);
						attrs.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));

						if(document instanceof Gra2MoLDocument) {
							Gra2MoLDocument gra2molDocument = (Gra2MoLDocument) document;
							IFile file = gra2molDocument.getFile();
							try {
								MarkerUtilities.createMarker(file, attrs, IMarker.PROBLEM);
							} catch (CoreException e) {
								System.out.println("Exception marking...");
							}
						}
					} 

				}

				if (rootElement != null) {
					root = rootElement;
				} 
			}
		}		
	}

	private HashMap<Integer, String> digestErrors(String messages) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();

		String[] lines = messages.split("\n");
		for(String line : lines) {
			int dotsPosition = line.indexOf(":");
			if(line.startsWith("line") && dotsPosition > 0) {
				String number = line.substring(5, dotsPosition);
				Integer lineNumber = new Integer(number);
				String message = line.substring(dotsPosition + 3, line.length()).trim();
				result.put(lineNumber, message);
			}
		}

		return result;
	}


}
