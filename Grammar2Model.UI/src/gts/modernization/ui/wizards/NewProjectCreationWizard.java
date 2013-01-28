package gts.modernization.ui.wizards;

import gts.modernization.ui.PluginImages;
import gts.modernization.ui.editors.gra2mol.properties.Gra2MoLPropertyPage;
import gts.modernization.ui.i18n.Gra2molMessages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewProjectCreationWizard extends Wizard implements INewWizard {
	public static final String ID = "gts.modernization.ui.wizards.NewGra2molProjectCreationWizard";
	
//	public static IPath DEFAULT_PATH = Platform.getLocation().append("..").append("workspace").append("Grammar2Model.UI").append("default");
	public static String DEFAULT_PATH = "/Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.UI/default";
	public static String METAMODEL_PATH = DEFAULT_PATH + "/metamodel.ecore";
	public static String METAMODEL_GRA2MOL_PATH = DEFAULT_PATH + "/gra2mol.ecore";
	public static String METAMODEL_CST_PATH = DEFAULT_PATH + "/cst.ecore";
	public static String GRAMMAR_PATH = DEFAULT_PATH + "/grammar.g";
	public static String TRANSFORMATION_PATH = DEFAULT_PATH + "/transformation.g2m";
	public static String BUILD_PATH = DEFAULT_PATH + "/build.xml";
	public static String JAR_PATH = DEFAULT_PATH + "/gra2mol-runtime.jar";
	public static String TEMPLATE_PATH = DEFAULT_PATH + "/G2Ge.stg";
	public static String SOURCE_PATH = DEFAULT_PATH + "/test.simple";
	

	WizardNewProjectCreationPage page;

	@Override
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			realException.printStackTrace();
			MessageDialog.openError(getShell(), "Error!!", realException.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	public void addPages() {	
		page = new WizardNewProjectCreationPage(Gra2molMessages.getString("WizardNewProjectCreationPage.pageName"));
		page.setTitle(Gra2molMessages.getString("WizardNewProjectCreationPage.pageTitle"));
		page.setDescription(Gra2molMessages.getString("WizardNewProjectCreationPage.pageDescription"));
		page.setInitialProjectName("newProject");
		page.setImageDescriptor(PluginImages.DESC_NEW_PROJECT_WIZARD);

		addPage(page);
	}
	
	private void doFinish(IProgressMonitor monitor) throws CoreException, InvocationTargetException {
//		ProjectCreator prj = new ProjectCreator();
//
//		prj.setName(page.getProjectName());
//		prj.setCustomPath(page.getLocationPath());
//
//		prj.hasFolder("metamodels");
//		prj.hasFolder("models");
//		prj.hasFolder("source");
//		prj.hasFolder("transformations");
//		
//		prj.createProject(Gra2molCore.getWorkspace(), new SubProgressMonitor(monitor, 1));
		

		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(page.getProjectName());
		IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(newProject.getName());
		IPath path = Platform.getLocation();
		
		if(page.getLocationPath() != null && !page.getLocationPath().equals(path)) {
			path = page.getLocationPath();
			description.setLocation(path);
		}
		
		if(!newProject.exists()) {
			newProject.create(description, new SubProgressMonitor(monitor, 1));
		}
		
		if(!newProject.isOpen()) {
			newProject.open(new SubProgressMonitor(monitor, 1));
		}

		IWorkspaceRoot wRoot = newProject.getWorkspace().getRoot();
		
		// Too fix...
//		ResourcesUtil.createFolder(newProject, "metamodels");
//		IFolder mfolder = newProject.getFolder("metamodels");
//		IPath mpath = mfolder.getFullPath().append("simpleMetamodel.ecore");
//		IFile mfile = wRoot.getFile(mpath);
//		try {
//			mfile.create(new FileInputStream(METAMODEL_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		IPath m2path = mfolder.getFullPath().append("gra2mol.ecore");
//		IFile m2file = wRoot.getFile(m2path);
//		try {
//			m2file.create(new FileInputStream(METAMODEL_GRA2MOL_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		IPath m3path = mfolder.getFullPath().append("cst.ecore");
//		IFile m3file = wRoot.getFile(m3path);
//		try {
//			m3file.create(new FileInputStream(METAMODEL_CST_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		ResourcesUtil.createFolder(newProject, "grammars");
//		IFolder gfolder = newProject.getFolder("grammars");
//		IPath gpath = gfolder.getFullPath().append("simpleGrammar.g");
//		IFile gfile = wRoot.getFile(gpath);
//		try {
//			gfile.create(new FileInputStream(GRAMMAR_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		ResourcesUtil.createFolder(newProject, "transformations");
//		IFolder tfolder = newProject.getFolder("transformations");
//		IPath tpath = tfolder.getFullPath().append("simpleTransformation.g2m");
//		IFile tfile = wRoot.getFile(tpath);
//		try {
//			tfile.create(new FileInputStream(TRANSFORMATION_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			tfile.setPersistentProperty(
//				new QualifiedName("", Gra2MoLPropertyPage.TARGETMETAMODEL_PROPERTY),
//				mfile.getLocation().toString());
//			tfile.setPersistentProperty(
//				new QualifiedName("", Gra2MoLPropertyPage.SOURCEGRAMMAR_PROPERTY),
//				gfile.getLocation().toString());
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//		
//		ResourcesUtil.createFolder(newProject, "lib");
//		IFolder lfolder = newProject.getFolder("lib");
//		IPath lpath = lfolder.getFullPath().append("gra2mol-runtime.jar");
//		IFile lfile = wRoot.getFile(lpath);
//		try {
//			lfile.create(new FileInputStream(JAR_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		ResourcesUtil.createFolder(lfolder, "templates");
//		IFolder tpfolder = lfolder.getFolder("templates");
//		IPath tppath = tpfolder.getFullPath().append("G2Ge.stg");
//		IFile tpfile = wRoot.getFile(tppath);
//		try {
//			tpfile.create(new FileInputStream(TEMPLATE_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		ResourcesUtil.createFolder(newProject, "extensions");
//		
//		ResourcesUtil.createFolder(newProject, "sources");
//		IFolder srcfolder = newProject.getFolder("sources");
//		IPath srcpath = srcfolder.getFullPath().append("test.simple");
//		IFile srcfile = wRoot.getFile(srcpath);
//		try {
//			srcfile.create(new FileInputStream(SOURCE_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		IPath bpath = newProject.getFullPath().append("build.xml");
//		IFile bfile = wRoot.getFile(bpath);
//		try {
//			bfile.create(new FileInputStream(BUILD_PATH), true, null);
//		} catch (FileNotFoundException e) {
//			System.out.println("Intentando B : " + BUILD_PATH);
//			e.printStackTrace();
//		}
		
	}

}
