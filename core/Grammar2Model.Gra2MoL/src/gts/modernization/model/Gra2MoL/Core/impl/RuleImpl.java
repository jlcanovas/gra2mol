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

package gts.modernization.model.Gra2MoL.Core.impl;

import gts.modernization.model.Gra2MoL.Core.CorePackage;
import gts.modernization.model.Gra2MoL.Core.FromElement;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroup;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.RuleType;
import gts.modernization.model.Gra2MoL.Core.ToElement;

import gts.modernization.model.Gra2MoL.Query.QueryUnit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.RuleImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.RuleImpl#getInits <em>Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryUnit> queries;

	/**
	 * The cached value of the '{@link #getInits() <em>Inits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInits()
	 * @generated
	 * @ordered
	 */
	protected InitUnitGroup inits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryUnit> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<QueryUnit>(QueryUnit.class, this, CorePackage.RULE__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitGroup getInits() {
		return inits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInits(InitUnitGroup newInits, NotificationChain msgs) {
		InitUnitGroup oldInits = inits;
		inits = newInits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RULE__INITS, oldInits, newInits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInits(InitUnitGroup newInits) {
		if (newInits != inits) {
			NotificationChain msgs = null;
			if (inits != null)
				msgs = ((InternalEObject)inits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__INITS, null, msgs);
			if (newInits != null)
				msgs = ((InternalEObject)newInits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__INITS, null, msgs);
			msgs = basicSetInits(newInits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RULE__INITS, newInits, newInits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Analizes the queries included in the queries section to initialize the
	 * absoluteQuery attribute propertly
	 * <!-- end-user-doc -->
	 */
	public void prepareQueryUnits() {
		// Store the name of the variables used
		List<String> variables = new ArrayList<String>();
		for(QueryUnit qUnit : this.getQueries()) {
			variables.add(qUnit.getVariable());
		}
		
		// Checking if the first filterUnit uses a variable
		for(QueryUnit qUnit : this.getQueries()) {
			if(variables.contains(qUnit.getFilter().getElement().getName())) 
				qUnit.setAbsoluteQuery(false);
			else
				qUnit.setAbsoluteQuery(true);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Extracts a specific queryUnit from its variable name
	 * <!-- end-user-doc -->
	 */
	public QueryUnit getQuery(String variableName) {
		for(QueryUnit qUnit : this.getQueries()) {
			if(qUnit.getVariable().equals(variableName)) 
				return qUnit;
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
			case CorePackage.RULE__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
			case CorePackage.RULE__INITS:
				return basicSetInits(null, msgs);
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
			case CorePackage.RULE__NAME:
				return getName();
			case CorePackage.RULE__QUERIES:
				return getQueries();
			case CorePackage.RULE__INITS:
				return getInits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RULE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.RULE__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends QueryUnit>)newValue);
				return;
			case CorePackage.RULE__INITS:
				setInits((InitUnitGroup)newValue);
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
			case CorePackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.RULE__QUERIES:
				getQueries().clear();
				return;
			case CorePackage.RULE__INITS:
				setInits((InitUnitGroup)null);
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
			case CorePackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.RULE__QUERIES:
				return queries != null && !queries.isEmpty();
			case CorePackage.RULE__INITS:
				return inits != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
