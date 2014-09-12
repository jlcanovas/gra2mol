package gts.modernization.ui;

import java.net.URL;

import gts.modernization.ui.editors.gra2mol.Gra2MoLEditor;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Gra2molCore extends Plugin {
    public final static String PLUGIN_ID = "gts.modernization.gra2mol.core";


	private static Gra2molCore plugin;
    
	public Gra2molCore() {
		plugin = this;
	}
	
	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static Gra2molCore getDefault() {
		return plugin;
	}
	
	/**
	 * Returns the current workspace
	 * @return the current workspace
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}
	
	
	public static URL getInstallURL() {
		Bundle bundle = Platform.getBundle(Gra2molCore.PLUGIN_ID);
		if(bundle != null) {
			return bundle.getEntry("/");
		} else
			return null;
	}
}
