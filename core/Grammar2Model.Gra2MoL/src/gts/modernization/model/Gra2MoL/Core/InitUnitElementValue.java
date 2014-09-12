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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Unit Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getValue <em>Value</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getExtension <em>Extension</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValue()
 * @model
 * @generated
 */
public interface InitUnitElementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType
	 * @see #setType(InitUnitElementValueType)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValue_Type()
	 * @model
	 * @generated
	 */
	InitUnitElementValueType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType
	 * @see #getType()
	 * @generated
	 */
	void setType(InitUnitElementValueType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValue_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.Gra2MoL.Core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValue_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

} // InitUnitElementValue
