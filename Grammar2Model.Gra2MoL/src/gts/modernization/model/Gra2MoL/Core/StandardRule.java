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
 * A representation of the model object '<em><b>Standard Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getFrom <em>From</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getContext <em>Context</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getTo <em>To</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getMixins <em>Mixins</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule()
 * @model
 * @generated
 */
public interface StandardRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Core.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.RuleType
	 * @see #setType(RuleType)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule_Type()
	 * @model
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.RuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(FromElement)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromElement getFrom();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FromElement value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule_Context()
	 * @model
	 * @generated
	 */
	EList<String> getContext();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(ToElement)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule_To()
	 * @model containment="true"
	 * @generated
	 */
	ToElement getTo();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ToElement value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' attribute list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getStandardRule_Mixins()
	 * @model
	 * @generated
	 */
	EList<String> getMixins();

} // StandardRule
