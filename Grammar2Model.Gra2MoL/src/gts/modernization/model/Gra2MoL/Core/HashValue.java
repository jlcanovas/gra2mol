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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElement <em>From Element</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElementType <em>From Element Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElement <em>To Element</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElementType <em>To Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getHashValue()
 * @model
 * @generated
 */
public interface HashValue extends EObject {
	/**
	 * Returns the value of the '<em><b>From Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' attribute.
	 * @see #setFromElement(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getHashValue_FromElement()
	 * @model
	 * @generated
	 */
	String getFromElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElement <em>From Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' attribute.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(String value);

	/**
	 * Returns the value of the '<em><b>From Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Core.HashValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @see #setFromElementType(HashValueType)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getHashValue_FromElementType()
	 * @model
	 * @generated
	 */
	HashValueType getFromElementType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElementType <em>From Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @see #getFromElementType()
	 * @generated
	 */
	void setFromElementType(HashValueType value);

	/**
	 * Returns the value of the '<em><b>To Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' attribute.
	 * @see #setToElement(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getHashValue_ToElement()
	 * @model
	 * @generated
	 */
	String getToElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElement <em>To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' attribute.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(String value);

	/**
	 * Returns the value of the '<em><b>To Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Core.HashValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @see #setToElementType(HashValueType)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getHashValue_ToElementType()
	 * @model
	 * @generated
	 */
	HashValueType getToElementType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElementType <em>To Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @see #getToElementType()
	 * @generated
	 */
	void setToElementType(HashValueType value);

} // HashValue
