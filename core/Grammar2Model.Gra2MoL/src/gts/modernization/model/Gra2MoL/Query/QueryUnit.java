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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getCast <em>Cast</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getFilter <em>Filter</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#isAbsoluteQuery <em>Absolute Query</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit()
 * @model
 * @generated
 */
public interface QueryUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' attribute.
	 * @see #setCast(String)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit_Cast()
	 * @model
	 * @generated
	 */
	String getCast();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getCast <em>Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast</em>' attribute.
	 * @see #getCast()
	 * @generated
	 */
	void setCast(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterUnit)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit_Filter()
	 * @model containment="true"
	 * @generated
	 */
	FilterUnit getFilter();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterUnit value);

	/**
	 * Returns the value of the '<em><b>Absolute Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Query</em>' attribute.
	 * @see #setAbsoluteQuery(boolean)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit_AbsoluteQuery()
	 * @model
	 * @generated
	 */
	boolean isAbsoluteQuery();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#isAbsoluteQuery <em>Absolute Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Query</em>' attribute.
	 * @see #isAbsoluteQuery()
	 * @generated
	 */
	void setAbsoluteQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(QueryControl)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryUnit_Control()
	 * @model containment="true"
	 * @generated
	 */
	QueryControl getControl();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(QueryControl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	FilterUnit getMarkedFilterUnit();

} // QueryUnit
