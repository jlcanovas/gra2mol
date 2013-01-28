package gts.modernization.ui.editors.gra2mol.outline;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

public class Gra2MoLEditorContentOutlinePage extends ContentOutlinePage {
	private ITextEditor editor;
	private IEditorInput input;
	private OutlineContentProvider outlineContentProvider;
	private OutlineLabelProvider outlineLabelProvider;

	public Gra2MoLEditorContentOutlinePage(ITextEditor editor) {
		super();
		this.editor = editor;
	}

	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer viewer = getTreeViewer();
		
		outlineContentProvider = new OutlineContentProvider(editor.getDocumentProvider());
		viewer.setContentProvider(outlineContentProvider);
		outlineLabelProvider = new OutlineLabelProvider();
		viewer.setLabelProvider(outlineLabelProvider);
		
		viewer.addSelectionChangedListener(this);

		// Control is created after input is set
		if (input != null)
			viewer.setInput(input);
	}

	/**
	 * Sets the input of the outline page
	 */
	public void setInput(Object input) {
		this.input = (IEditorInput) input;
		update();
	}

	/*
	 * Change in selection
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
	}

	/**
	 * The editor is saved, so we should refresh representation
	 * 
	 * @param tableNamePositions
	 */
	public void update()
	{
		// Set the input so that the outlines parse can be called
		// update the tree viewer state
		TreeViewer viewer = getTreeViewer();

		if (viewer != null) {
			Control control = viewer.getControl();
			if (control != null && !control.isDisposed()) {
				control.setRedraw(false);
				viewer.setInput(input);
				viewer.expandAll();
				control.setRedraw(true);
			}
		}
	}


}
