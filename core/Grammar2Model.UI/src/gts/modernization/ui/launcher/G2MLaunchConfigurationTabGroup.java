package gts.modernization.ui.launcher;

import java.util.ArrayList;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTabGroup;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

public class G2MLaunchConfigurationTabGroup implements ILaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		System.out.println("G2MLaunchCOnfigurationTabGroup. createTabs. mode:" + mode);
				
	}

	@Override
	public void dispose() {
		System.out.println("G2MLaunchCOnfigurationTabGroup. dispose.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public ILaunchConfigurationTab[] getTabs() {
		System.out.println("G2MLaunchCOnfigurationTabGroup. getTabs.");

		CommonTab ct = new CommonTab();
		G2MLaunchConfigurationTab myt = new G2MLaunchConfigurationTab();
		

		ILaunchConfigurationTab[] sol = { myt, ct };
		return sol;
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		System.out.println("G2MLaunchCOnfigurationTabGroup. initializeFrom.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launched(ILaunch launch) {
		System.out.println("G2MLaunchCOnfigurationTabGroup. launched.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		System.out.println("G2MLaunchCOnfigurationTabGroup. performApply.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		System.out.println("G2MLaunchCOnfigurationTabGroup. setDefaults.");
		// TODO Auto-generated method stub
		
	}

}
