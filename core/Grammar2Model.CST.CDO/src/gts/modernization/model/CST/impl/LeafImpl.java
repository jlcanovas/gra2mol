/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/

package gts.modernization.model.CST.impl;

import gts.modernization.model.CST.CSTPackage;
import gts.modernization.model.CST.Leaf;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.CST.impl.LeafImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gts.modernization.model.CST.impl.LeafImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link gts.modernization.model.CST.impl.LeafImpl#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafImpl extends ElementImpl implements Leaf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSTPackage.Literals.LEAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(CSTPackage.Literals.LEAF__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(CSTPackage.Literals.LEAF__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos() {
		return ((Integer)eGet(CSTPackage.Literals.LEAF__POS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(int newPos) {
		eSet(CSTPackage.Literals.LEAF__POS, new Integer(newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return ((Integer)eGet(CSTPackage.Literals.LEAF__LINE, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		eSet(CSTPackage.Literals.LEAF__LINE, new Integer(newLine));
	}

} //LeafImpl
