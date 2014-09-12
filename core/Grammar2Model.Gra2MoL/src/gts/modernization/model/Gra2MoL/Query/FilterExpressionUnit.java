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

package gts.modernization.model.Gra2MoL.Query;

import gts.modernization.model.Gra2MoL.Core.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#getElement <em>Element</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#getOperation <em>Operation</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#isGlobal <em>Global</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterExpressionUnit()
 * @model
 * @generated
 */
public interface FilterExpressionUnit extends FilterExpression {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(ExpressionElement)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterExpressionUnit_Element()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionElement getElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterExpressionUnit_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(boolean)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterExpressionUnit_Global()
	 * @model
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.Gra2MoL.Core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterExpressionUnit_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // FilterExpressionUnit
