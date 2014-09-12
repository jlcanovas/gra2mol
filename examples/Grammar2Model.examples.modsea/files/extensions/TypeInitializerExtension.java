/*******************************************************************************
 * Copyright (c) 2008, 2012
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/

import org.eclipse.emf.ecore.EcorePackage;

import gts.modernization.extension.*;

public class TypeInitializerExtension extends MappingExtensionPoint {

	@Override
	public ExtensionValueReturn execute() {
		return returnObject(EcorePackage.Literals.ESTRUCTURAL_FEATURE);
	}
	

	public static String[] keywords() {
		return new String[] { "typeInitializer" };
	}

}
