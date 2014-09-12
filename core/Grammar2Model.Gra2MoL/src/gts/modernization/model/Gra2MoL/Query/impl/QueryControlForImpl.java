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

import gts.modernization.model.Gra2MoL.Query.QueryControlFor;
import gts.modernization.model.Gra2MoL.Query.QueryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryControlForImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryControlForImpl#getQueryVariable <em>Query Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryControlForImpl extends QueryControlImpl implements QueryControlFor {
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
	 * The default value of the '{@link #getQueryVariable() <em>Query Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryVariable() <em>Query Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryVariable()
	 * @generated
	 * @ordered
	 */
	protected String queryVariable = QUERY_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryControlForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_CONTROL_FOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_CONTROL_FOR__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryVariable() {
		return queryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryVariable(String newQueryVariable) {
		String oldQueryVariable = queryVariable;
		queryVariable = newQueryVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_CONTROL_FOR__QUERY_VARIABLE, oldQueryVariable, queryVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.QUERY_CONTROL_FOR__VARIABLE:
				return getVariable();
			case QueryPackage.QUERY_CONTROL_FOR__QUERY_VARIABLE:
				return getQueryVariable();
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
			case QueryPackage.QUERY_CONTROL_FOR__VARIABLE:
				setVariable((String)newValue);
				return;
			case QueryPackage.QUERY_CONTROL_FOR__QUERY_VARIABLE:
				setQueryVariable((String)newValue);
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
			case QueryPackage.QUERY_CONTROL_FOR__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case QueryPackage.QUERY_CONTROL_FOR__QUERY_VARIABLE:
				setQueryVariable(QUERY_VARIABLE_EDEFAULT);
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
			case QueryPackage.QUERY_CONTROL_FOR__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case QueryPackage.QUERY_CONTROL_FOR__QUERY_VARIABLE:
				return QUERY_VARIABLE_EDEFAULT == null ? queryVariable != null : !QUERY_VARIABLE_EDEFAULT.equals(queryVariable);
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
		result.append(", queryVariable: ");
		result.append(queryVariable);
		result.append(')');
		return result.toString();
	}

} //QueryControlForImpl
