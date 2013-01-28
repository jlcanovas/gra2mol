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

import gts.modernization.model.Gra2MoL.Query.FilterExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Unit Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getInits <em>Inits</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitGroup()
 * @model
 * @generated
 */
public interface InitUnitGroup extends InitUnit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Core.InitUnitGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroupType
	 * @see #setType(InitUnitGroupType)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitGroup_Type()
	 * @model
	 * @generated
	 */
	InitUnitGroupType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroupType
	 * @see #getType()
	 * @generated
	 */
	void setType(InitUnitGroupType value);

	/**
	 * Returns the value of the '<em><b>Inits</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.Gra2MoL.Core.InitUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inits</em>' containment reference list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitGroup_Inits()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitUnit> getInits();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(FilterExpression)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitGroup_Expression()
	 * @model containment="true"
	 * @generated
	 */
	FilterExpression getExpression();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(FilterExpression value);

} // InitUnitGroup
