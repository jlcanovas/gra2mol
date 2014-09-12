package gts.modernization.ui.editors.gra2mol.properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

public class Gra2MoLPropertyPage extends PropertyPage {	
	public static final String TARGETMETAMODEL_PROPERTY = "TARGETMETAMODEL_PROPERTY";
	private static final String TARGETMETAMODEL_TITLE = "Target &metamodel:";
	private static final String DEFAULT_TARGETMETAMODEL = "http://modelum.es/gra2mol";
	
	public static final String SOURCEGRAMMAR_PROPERTY = "SOURCEGRAMMAR_PROPERTY";
	private static final String SOURCEGRAMMAR_TITLE = "Source &grammar:";
	private static final String DEFAULT_SOURCEGRAMMAR = "Java.g3";

	private static final int TEXT_FIELD_WIDTH = 50;

	private FileFieldEditor targetMetamodel;
	private FileFieldEditor sourceGrammar; 

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public Gra2MoLPropertyPage() {
		super();
	}
	

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);
		
		targetMetamodel = new FileFieldEditor("Target metamodel", "Target metamodel", composite);
		String metamodelFile = null;
		try {
			metamodelFile = ((IResource) getElement()).getPersistentProperty(new QualifiedName("", TARGETMETAMODEL_PROPERTY));
		} catch (CoreException e) {
			metamodelFile = "";
		}
		if(metamodelFile != null) 
			targetMetamodel.setStringValue(metamodelFile);
		
		sourceGrammar = new FileFieldEditor("Source grammar", "Source grammar", composite);
		String sourceGrammarFile = null;
		try {
			sourceGrammarFile = ((IResource) getElement()).getPersistentProperty(new QualifiedName("", SOURCEGRAMMAR_PROPERTY));
		} catch (CoreException e) {
			sourceGrammarFile = "";
		}
		if(sourceGrammarFile != null) 
			sourceGrammar.setStringValue(sourceGrammarFile);
		
		return composite;
	}


	protected void performDefaults() {
		// Populate the text fields with the default values
		targetMetamodel.setStringValue(DEFAULT_TARGETMETAMODEL);
		sourceGrammar.setStringValue(DEFAULT_SOURCEGRAMMAR);
	}
	
	public boolean performOk() {
		try {
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName("", TARGETMETAMODEL_PROPERTY),
				targetMetamodel.getStringValue());
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName("", SOURCEGRAMMAR_PROPERTY),
				sourceGrammar.getStringValue());
		} catch (CoreException e) {
			return false;
		}
		return true;
	}
	
	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}
	
	

}