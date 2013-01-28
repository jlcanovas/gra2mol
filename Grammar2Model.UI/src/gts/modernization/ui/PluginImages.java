package gts.modernization.ui;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

public class PluginImages {
	private static final String iconUrl = "icons/";

	public static final String NEW_PROJECT_WIZARD = iconUrl + "g2m.gif";

	public static final ImageDescriptor DESC_NEW_PROJECT_WIZARD = create(NEW_PROJECT_WIZARD);

	protected static ImageDescriptor create(String name) {
		return ImageDescriptor.createFromFile(PluginImages.class, name);
	}

	protected static URL makeIconFileURL(String prefix, String name) throws MalformedURLException {
		StringBuffer buffer = new StringBuffer(prefix);
		buffer.append('/');
		buffer.append(name);
		return new URL(buffer.toString());
	}
}
