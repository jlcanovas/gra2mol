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
 * A representation of the model object '<em><b>Control Greater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getNodePosition <em>Node Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlGreater()
 * @model
 * @generated
 */
public interface QueryControlGreater extends QueryControl {
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
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlGreater_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlGreater_NodeId()
	 * @model
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Node Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Position</em>' attribute.
	 * @see #setNodePosition(int)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getQueryControlGreater_NodePosition()
	 * @model
	 * @generated
	 */
	int getNodePosition();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater#getNodePosition <em>Node Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Position</em>' attribute.
	 * @see #getNodePosition()
	 * @generated
	 */
	void setNodePosition(int value);

} // QueryControlGreater
