package gts.modernization.ui.editors.gra2mol;

import gts.modernization.ui.editors.gra2mol.scanners.Gra2MoLPartitionScanner;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class Gra2MoLDocumentProvider extends FileDocumentProvider {

	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);

		if (element instanceof IFileEditorInput) {
		    IFileEditorInput input = (IFileEditorInput)element;
		    IFile file = input.getFile();
			IContainer parent = file.getParent();
			while (parent instanceof IFolder) {
				parent = parent.getParent();
			}
			if (parent instanceof IProject) {
				document = new Gra2MoLDocument(file);
				if (!setDocumentContent(document, input, getEncoding(element)))
					document = null;
			}					
		} 
		
		if (document != null) {
			IDocumentPartitioner partitioner = new Gra2MoLPartitioner(
					new Gra2MoLPartitionScanner(), 
					new String[] {
						Gra2MoLPartitionScanner.GRA2MOL_RULE,
						Gra2MoLPartitionScanner.GRA2MOL_HASH,
						Gra2MoLPartitionScanner.GRA2MOL_COMMENT
						});
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		
		return document;
	}
}