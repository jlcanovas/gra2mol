package gts.modernization.ui.launcher;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class G2MLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) {
		System.out.println("Entramos en G2MLaunchConfigurationDelegate");

		System.out.println("Atributos:");
		try {
			Iterator it = configuration.getAttributes().keySet().iterator();
			while(it.hasNext()) {
				String key = (String) it.next();
				System.out.println("  key: " + key + " value: " + configuration.getAttribute(key, "null"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
