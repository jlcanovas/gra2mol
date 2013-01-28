package gts.modernization.ui.editors.gra2mol.outline;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import gts.modernization.model.Gra2MoL.Core.FromElement;
import gts.modernization.model.Gra2MoL.Core.Hash;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroup;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.ToElement;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;
import gts.modernization.ui.editors.gra2mol.Gra2MoLEditor;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public class OutlineLabelProvider implements ILabelProvider {

	public static String HASH_ICON = "icons/hash.gif";
	public static String RULE_ICON = "icons/rule.gif";
	public static String TO_ICON = "icons/to.gif";
	public static String FROM_ICON = "icons/from.gif";
	public static String CONTEXT_ICON = "icons/context.gif";
	public static String QUERIES_ICON = "icons/queries.gif";
	public static String MAPPINGS_ICON = "icons/mappings.gif";
	
	public OutlineLabelProvider() {
		super();
	}

	protected String imagePath(Object element) {
		if (element instanceof Hash) {
			return OutlineLabelProvider.HASH_ICON;
		} else if (element instanceof Rule) {
			return OutlineLabelProvider.RULE_ICON;
		} else if (element instanceof ToElement) {
			return OutlineLabelProvider.TO_ICON;
		} else if (element instanceof FromElement) {
			return OutlineLabelProvider.FROM_ICON;
		} else if (element instanceof List) {
			List list = (List) element;
			if(!list.isEmpty()) {
				Object firstElement = list.get(0);
				if (firstElement instanceof String) {
					return OutlineLabelProvider.CONTEXT_ICON;	
				} else if (firstElement instanceof QueryUnit) {
					return OutlineLabelProvider.QUERIES_ICON;
				}
			} else {
				return OutlineLabelProvider.QUERIES_ICON;
			}
		} else if (element instanceof InitUnitGroup) {
			return OutlineLabelProvider.MAPPINGS_ICON;
		} 
		return null;

	}

	public Image getImage(Object element) {
		URL url = Gra2MoLEditor.getInstallURL();
		ImageDescriptor descriptor= null;
		try {
			descriptor = ImageDescriptor.createFromURL(new URL(url, imagePath(element)));
		} catch (Exception e) {
			descriptor= ImageDescriptor.getMissingImageDescriptor();
		}
		return descriptor.createImage();
	}

	public String getText(Object element) {
		if (element instanceof Hash) {
			Hash h = (Hash) element;
			return h.getName();
		} else if (element instanceof Rule) {
			Rule r = (Rule) element;
			return r.getName();
		} else if (element instanceof ToElement) {
			ToElement toElem = (ToElement) element;
			return toElem.getName();			
		} else if (element instanceof FromElement) {
			FromElement fromElem = (FromElement) element;
			return fromElem.getName();
		} else if (element instanceof List) {
			List list = (List) element;
			if(!list.isEmpty()) {
				Object firstElement = list.get(0);
				if (firstElement instanceof String) {
					return "Context (" + list.size() + ")";					
				} else if (firstElement instanceof QueryUnit) {
					return "Queries (" + list.size() + ")";					
				}
			} else {
				return "Queries (0)";			
			}
		} else if (element instanceof InitUnitGroup) {
			InitUnitGroup iug = (InitUnitGroup) element;
			return "Mappings (" + iug.getInits().size() + ")";
		} 
		return "---";
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {

	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}
