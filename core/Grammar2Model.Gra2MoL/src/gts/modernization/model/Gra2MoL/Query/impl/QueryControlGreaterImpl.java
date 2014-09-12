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

package gts.modernization.model.Gra2MoL.Query.impl;

import gts.modernization.model.Gra2MoL.Query.QueryControlGreater;
import gts.modernization.model.Gra2MoL.Query.QueryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Greater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryControlGreaterImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryControlGreaterImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryControlGreaterImpl#getNodePosition <em>Node Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryControlGreaterImpl extends QueryControlImpl implements QueryControlGreater {
	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected String nodeId = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodePosition() <em>Node Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePosition()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodePosition() <em>Node Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePosition()
	 * @generated
	 * @ordered
	 */
	protected int nodePosition = NODE_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryControlGreaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_CONTROL_GREATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_CONTROL_GREATER__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		String oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_CONTROL_GREATER__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodePosition() {
		return nodePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodePosition(int newNodePosition) {
		int oldNodePosition = nodePosition;
		nodePosition = newNodePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_CONTROL_GREATER__NODE_POSITION, oldNodePosition, nodePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.QUERY_CONTROL_GREATER__VARIABLE:
				return getVariable();
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_ID:
				return getNodeId();
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_POSITION:
				return getNodePosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.QUERY_CONTROL_GREATER__VARIABLE:
				setVariable((String)newValue);
				return;
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_ID:
				setNodeId((String)newValue);
				return;
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_POSITION:
				setNodePosition((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.QUERY_CONTROL_GREATER__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_POSITION:
				setNodePosition(NODE_POSITION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.QUERY_CONTROL_GREATER__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeId != null : !NODE_ID_EDEFAULT.equals(nodeId);
			case QueryPackage.QUERY_CONTROL_GREATER__NODE_POSITION:
				return nodePosition != NODE_POSITION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variable: ");
		result.append(variable);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", nodePosition: ");
		result.append(nodePosition);
		result.append(')');
		return result.toString();
	}

} //QueryControlGreaterImpl
