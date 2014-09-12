package gts.modernization.ui.launcher;


import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.IDebugHelpContextIds;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class G2MLaunchConfigurationTab extends AbstractLaunchConfigurationTab {


	private Label binLocationLabel;
	private Text binLocationText;
	private Button binLocationButton;
	private Label genLocationLabel;
	private Text genLocationText;
	private Button genLocationButton;
	private Label srcLocationLabel;
	private Text srcLocationText;
	private Button srcLocationButton;
	private Label metamodelLocationLabel;
	private Text metamodelLocationText;
	private Button metamodelLocationButton;
	private Label templatesLocationLabel;
	private Text templatesLocationText;
	private Button templatesLocationButton;
	private Label gra2molFileLabel;
	private Text gra2molFileText;
	private Button gra2molFileButton;
	private Label sourceLabel;
	private Text sourceText;
	private Button sourceButton;
	private Label targetMetamodelPathLabel;
	private Text targetMetamodelPathText;
	private Button targetMetamodelPathButton;
	private Label targetMetamodelLabel;
	private Text targetMetamodelText;
	private Label resultFileLabel;
	private Text resultFileText;
	private Button resultFileButton;
	private Label projectLabel;
	private Text projectText;
	private Button projectButton;

	@Override
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IDebugHelpContextIds.LAUNCH_CONFIGURATION_DIALOG_COMMON_TAB);
		comp.setLayout(new GridLayout(2, true));
		comp.setFont(parent.getFont());	

		createProject(comp);
		createLocations(comp);
		createExecuteView(comp);
	}

	private void createProject(Composite parent) {
		Composite comp = SWTFactory.createComposite(parent, parent.getFont(), 3, 3, GridData.FILL_BOTH, 0, 0);
		projectLabel = SWTFactory.createLabel(comp, "Project: ", 1);
		projectText = SWTFactory.createSingleText(comp, 1);
		projectButton = createPushButton(comp, "Browse projects", null);	 
		projectButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleProjectButtonSelected(projectText);
			}
		});	
	}

	private void createLocations(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Locations", 3, 2, GridData.FILL_HORIZONTAL);
		Composite comp = SWTFactory.createComposite(group, parent.getFont(), 3, 3, GridData.FILL_BOTH, 0, 0);
		binLocationLabel = SWTFactory.createLabel(comp, "Binaries files: ", 1);
		binLocationText = SWTFactory.createSingleText(comp, 1);
		binLocationButton = createPushButton(comp, "Browse", null);	 
		binLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleLocationButtonSelected(binLocationText);
			}
		});	
		genLocationLabel = SWTFactory.createLabel(comp, "Generated files: ", 1);
		genLocationText = SWTFactory.createSingleText(comp, 1);
		genLocationButton = createPushButton(comp, "Browse", null);
		genLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleLocationButtonSelected(genLocationText);
			}
		});			
		srcLocationLabel = SWTFactory.createLabel(comp, "Source files: ", 1);
		srcLocationText = SWTFactory.createSingleText(comp, 1);
		srcLocationButton = createPushButton(comp, "Browse", null);
		srcLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleLocationButtonSelected(srcLocationText);
			}
		});					
		metamodelLocationLabel = SWTFactory.createLabel(comp, "Metamodel files: ", 1);
		metamodelLocationText = SWTFactory.createSingleText(comp, 1);
		metamodelLocationButton = createPushButton(comp, "Browse", null);
		metamodelLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleLocationButtonSelected(metamodelLocationText);
			}
		});					
		templatesLocationLabel = SWTFactory.createLabel(comp, "Templates files: ", 1);
		templatesLocationText = SWTFactory.createSingleText(comp, 1);
		templatesLocationButton = createPushButton(comp, "Browse", null);
		templatesLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleLocationButtonSelected(templatesLocationText);
			}
		});	
	}	

	private void createExecuteView(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Grammar to Model Transformation", 3, 2, GridData.FILL_HORIZONTAL);
		Composite comp = SWTFactory.createComposite(group, parent.getFont(), 3, 3, GridData.FILL_BOTH, 0, 0);
		sourceLabel = SWTFactory.createLabel(comp, "Source file: ", 1);
		sourceText = SWTFactory.createSingleText(comp, 1);
		sourceButton = createPushButton(comp, "Browse", null);	 
		sourceButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleFileButtonSelected(sourceText);
			}
		});	
		gra2molFileLabel = SWTFactory.createLabel(comp, "Source Gra2MoL file: ", 1);
		gra2molFileText = SWTFactory.createSingleText(comp, 1);
		gra2molFileButton = createPushButton(comp, "Browse", null);	 
		gra2molFileButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleFileButtonSelected(gra2molFileText);
			}
		});	
		targetMetamodelPathLabel = SWTFactory.createLabel(comp, "Target Metamodel: ", 1);
		targetMetamodelPathText = SWTFactory.createSingleText(comp, 1);
		targetMetamodelPathButton = createPushButton(comp, "Browse", null);	 
		targetMetamodelPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleFileButtonSelected(targetMetamodelPathText);
			}
		});	
		targetMetamodelLabel = SWTFactory.createLabel(comp, "Main Package Target Metamodel: ", 1);
		targetMetamodelText = SWTFactory.createSingleText(comp, 1);
		createVerticalSpacer(comp, 1);		

		resultFileLabel = SWTFactory.createLabel(comp, "Result File: ", 1);
		resultFileText = SWTFactory.createSingleText(comp, 1);
		resultFileButton = createPushButton(comp, "Browse", null);	 
		resultFileButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleFileButtonSelected(resultFileText);
			}
		});	
	}	

	/**
	 * Convenience method for getting the workspace root.
	 */
	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	} 

	/**
	 * gets the container form the specified path
	 * @param path the path to get the container from
	 * @return the container for the specified path or null if one cannot be determined
	 */
	private IContainer getContainer(String path) {
		Path containerPath = new Path(path);
		return (IContainer) getWorkspaceRoot().findMember(containerPath);
	}

	/**
	 * Handles the location button being selected
	 */
	private void handleFileButtonSelected(Text text) { 
		FileDialog dialog = new FileDialog(getShell(), 0);
		dialog.open();

		if(!dialog.getFilterPath().equals("") && !dialog.getFileName().equals("")) {
			String result = dialog.getFilterPath() + "/" + dialog.getFileName();
			if(result != null) {
				text.setText(result);
			}
		}
	}	

	private void handleLocationButtonSelected(Text text) {
		String currentContainerString = text.getText();
		IContainer currentContainer = getContainer(currentContainerString);
//		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), currentContainer, false, "Location");
//		dialog.open();
//		Object[] results = dialog.getResult();	
//		if ((results != null) && (results.length > 0) && (results[0] instanceof IPath)) {
//			IPath path = (IPath)results[0];
//			String containerName = path.toString();
//			IPath projectPath = getWorkspaceRoot().getLocation();
//			text.setText(projectPath.toString() + containerName);
//		}				
	}

	private void handleProjectButtonSelected(Text text) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new WorkbenchLabelProvider());
		dialog.setTitle("Select the project");
		dialog.setMessage("Name of the project");
		IProject[] workspaceProjects = getWorkspaceRoot().getProjects();    
		dialog.setElements(workspaceProjects);
		dialog.open();

		Object[] results = dialog.getResult();	
		if ((results != null) && (results.length > 0) && (results[0] instanceof IProject)) {
			IProject project = (IProject)results[0];
			text.setText(project.getName());
			updateLocations();
			updateExecuteView();
		}			
		System.out.println(this.isDirty());
	}

	@Override
	public String getName() {
		return "G2M launch";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {		
		System.out.println("   TAB. initializeFrom");
		updateLocations();
		updateExecuteView();
	}

	private void updateLocations() {
		IPath projectPath = getWorkspaceRoot().getLocation();
		if(projectText != null && !projectText.getText().equals("")) {
			String project = projectText.getText();
			binLocationText.setText(projectPath.toString() + "/" + project + "/bin");
			genLocationText.setText(projectPath.toString() + "/" + project +"/gen");
			srcLocationText.setText(projectPath.toString() + "/" + project +"/src");
			metamodelLocationText.setText(projectPath.toString() + "/" + project +"/metamodels");
			templatesLocationText.setText(projectPath.toString() + "/" + project +"/templates");
		}
	}

	private void updateExecuteView() {
//		if(projectText != null && !projectText.getText().equals("")) {			
		sourceText.setText("java.g3");
		gra2molFileText.setText("pruebaJava.g2m");
		targetMetamodelPathText.setText("struts.ecore");
		targetMetamodelText.setText("StrutsMM");
		resultFileText.setText("result.ecore");
//		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		System.out.println("   TAB. performApply");
		configuration.setAttribute(G2MLaunchConstants.BIN_PATH, binLocationText.getText());
		configuration.setAttribute(G2MLaunchConstants.GEN_PATH, genLocationText.getText());
		configuration.setAttribute(G2MLaunchConstants.SRC_PATH, srcLocationText.getText());
		configuration.setAttribute(G2MLaunchConstants.METAMODEL_PATH, metamodelLocationText.getText());
		configuration.setAttribute(G2MLaunchConstants.TEMPLATES_PATH, templatesLocationText.getText());

		configuration.setAttribute(G2MLaunchConstants.SOURCE_TEXT, sourceText.getText());
		configuration.setAttribute(G2MLaunchConstants.GRA2MOL_DEFINITION, gra2molFileText.getText());
		configuration.setAttribute(G2MLaunchConstants.TARGET_METAMODEL_PATH, targetMetamodelPathText.getText());
		configuration.setAttribute(G2MLaunchConstants.TARGET_METAMODEL, targetMetamodelText.getText());
		configuration.setAttribute(G2MLaunchConstants.RESULT_FILE, resultFileText.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		System.out.println("   TAB. setDefaults");
		// TODO Auto-generated method stub

	}

	public boolean isValid(ILaunchConfiguration config) {
		setMessage(null);
		setErrorMessage(null);

		return true;
	}

	private boolean validateLocations() {
		if (binLocationText.getText().equals("")) {
			setErrorMessage("Binaries location must be defined");
			return false;
		}
		if (genLocationText.getText().equals("")) {
			setErrorMessage("Generated files location must be defined");
			return false;
		}
		if (srcLocationText.getText().equals("")) {
			setErrorMessage("Source files location must be defined");
			return false;
		}
		if (metamodelLocationText.getText().equals("")) {
			setErrorMessage("Metamodel location must be defined");
			return false;
		}
		if (templatesLocationText.getText().equals("")) {
			setErrorMessage("Templates location must be defined");
			return false;
		}
		return true;
	}

	private boolean validateExecuteView() {
		if (sourceText.getText().equals("")) {
			setErrorMessage("Source text must be defined");
			return false;
		}
		if (gra2molFileText.getText().equals("")) {
			setErrorMessage("Gra2MoL definition must be defined");
			return false;
		}
		if (targetMetamodelPathText.getText().equals("")) {
			setErrorMessage("Target Metamodel must be defined");
			return false;
		}
		if (targetMetamodelText.getText().equals("")) {
			setErrorMessage("Target Metamodel main package must be defined");
			return false;
		}
		if (resultFileText.getText().equals("")) {
			setErrorMessage("Result file must be defined");
			return false;
		}
		return true;
	}

	@Override
	public String getId() {
		return "Grammar2Model.tab";
	}

}
