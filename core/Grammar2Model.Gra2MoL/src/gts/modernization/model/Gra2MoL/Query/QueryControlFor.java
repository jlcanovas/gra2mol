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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryControlFor#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryControlFor#getQueryVariable <em>Query Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlFor()
 * @model
 * @generated
 */
public interface QueryControlFor extends QueryControl {
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
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlFor_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryControlFor#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Query Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Variable</em>' attribute.
	 * @see #setQueryVariable(String)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlFor_QueryVariable()
	 * @model
	 * @generated
	 */
	String getQueryVariable();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryControlFor#getQueryVariable <em>Query Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Variable</em>' attribute.
	 * @see #getQueryVariable()
	 * @generated
	 */
	void setQueryVariable(String value);

} // QueryControlFor
