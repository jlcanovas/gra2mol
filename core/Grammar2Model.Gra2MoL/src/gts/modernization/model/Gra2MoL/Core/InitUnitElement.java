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

package gts.modernization.model.Gra2MoL.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getElement <em>Element</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getExtension <em>Extension</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElement()
 * @model
 * @generated
 */
public interface InitUnitElement extends InitUnit {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElement_Element()
	 * @model
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElement_Extension()
	 * @model
	 * @generated
	 */
	EList<String> getExtension();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InitUnitElementValue)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElement_Value()
	 * @model containment="true"
	 * @generated
	 */
	InitUnitElementValue getValue();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InitUnitElementValue value);

} // InitUnitElement
