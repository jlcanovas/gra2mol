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

import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.QueryControl;
import gts.modernization.model.Gra2MoL.Query.QueryPackage;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryUnitImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryUnitImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryUnitImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryUnitImpl#isAbsoluteQuery <em>Absolute Query</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.impl.QueryUnitImpl#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryUnitImpl extends EObjectImpl implements QueryUnit {
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
	 * The default value of the '{@link #getCast() <em>Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCast()
	 * @generated
	 * @ordered
	 */
	protected static final String CAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCast() <em>Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCast()
	 * @generated
	 * @ordered
	 */
	protected String cast = CAST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterUnit filter;

	/**
	 * The default value of the '{@link #isAbsoluteQuery() <em>Absolute Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsoluteQuery() <em>Absolute Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean absoluteQuery = ABSOLUTE_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected QueryControl control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCast() {
		return cast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCast(String newCast) {
		String oldCast = cast;
		cast = newCast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__CAST, oldCast, cast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterUnit getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterUnit newFilter, NotificationChain msgs) {
		FilterUnit oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterUnit newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_UNIT__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_UNIT__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsoluteQuery() {
		return absoluteQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteQuery(boolean newAbsoluteQuery) {
		boolean oldAbsoluteQuery = absoluteQuery;
		absoluteQuery = newAbsoluteQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__ABSOLUTE_QUERY, oldAbsoluteQuery, absoluteQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryControl getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(QueryControl newControl, NotificationChain msgs) {
		QueryControl oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__CONTROL, oldControl, newControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(QueryControl newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_UNIT__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_UNIT__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_UNIT__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FilterUnit getMarkedFilterUnit() {
		FilterUnit next = this.getFilter();
		while(next != null) {
			if(next.getElement() != null && next.getElement().isMark()) return next;
			next = next.getNext();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.QUERY_UNIT__FILTER:
				return basicSetFilter(null, msgs);
			case QueryPackage.QUERY_UNIT__CONTROL:
				return basicSetControl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.QUERY_UNIT__VARIABLE:
				return getVariable();
			case QueryPackage.QUERY_UNIT__CAST:
				return getCast();
			case QueryPackage.QUERY_UNIT__FILTER:
				return getFilter();
			case QueryPackage.QUERY_UNIT__ABSOLUTE_QUERY:
				return isAbsoluteQuery();
			case QueryPackage.QUERY_UNIT__CONTROL:
				return getControl();
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
			case QueryPackage.QUERY_UNIT__VARIABLE:
				setVariable((String)newValue);
				return;
			case QueryPackage.QUERY_UNIT__CAST:
				setCast((String)newValue);
				return;
			case QueryPackage.QUERY_UNIT__FILTER:
				setFilter((FilterUnit)newValue);
				return;
			case QueryPackage.QUERY_UNIT__ABSOLUTE_QUERY:
				setAbsoluteQuery((Boolean)newValue);
				return;
			case QueryPackage.QUERY_UNIT__CONTROL:
				setControl((QueryControl)newValue);
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
			case QueryPackage.QUERY_UNIT__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case QueryPackage.QUERY_UNIT__CAST:
				setCast(CAST_EDEFAULT);
				return;
			case QueryPackage.QUERY_UNIT__FILTER:
				setFilter((FilterUnit)null);
				return;
			case QueryPackage.QUERY_UNIT__ABSOLUTE_QUERY:
				setAbsoluteQuery(ABSOLUTE_QUERY_EDEFAULT);
				return;
			case QueryPackage.QUERY_UNIT__CONTROL:
				setControl((QueryControl)null);
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
			case QueryPackage.QUERY_UNIT__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case QueryPackage.QUERY_UNIT__CAST:
				return CAST_EDEFAULT == null ? cast != null : !CAST_EDEFAULT.equals(cast);
			case QueryPackage.QUERY_UNIT__FILTER:
				return filter != null;
			case QueryPackage.QUERY_UNIT__ABSOLUTE_QUERY:
				return absoluteQuery != ABSOLUTE_QUERY_EDEFAULT;
			case QueryPackage.QUERY_UNIT__CONTROL:
				return control != null;
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
		result.append(", cast: ");
		result.append(cast);
		result.append(", absoluteQuery: ");
		result.append(absoluteQuery);
		result.append(')');
		return result.toString();
	}

} //QueryUnitImpl
