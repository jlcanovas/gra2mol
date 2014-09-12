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
import gts.modernization.model.Gra2MoL.Core.InitUnit;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroup;
import gts.modernization.model.Gra2MoL.Core.InitUnitGroupType;

import gts.modernization.model.Gra2MoL.Query.FilterExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Unit Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl#getInits <em>Inits</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitUnitGroupImpl extends InitUnitImpl implements InitUnitGroup {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InitUnitGroupType TYPE_EDEFAULT = InitUnitGroupType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InitUnitGroupType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInits() <em>Inits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInits()
	 * @generated
	 * @ordered
	 */
	protected EList<InitUnit> inits;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected FilterExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitUnitGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INIT_UNIT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitGroupType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InitUnitGroupType newType) {
		InitUnitGroupType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INIT_UNIT_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitUnit> getInits() {
		if (inits == null) {
			inits = new EObjectContainmentEList<InitUnit>(InitUnit.class, this, CorePackage.INIT_UNIT_GROUP__INITS);
		}
		return inits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(FilterExpression newExpression, NotificationChain msgs) {
		FilterExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INIT_UNIT_GROUP__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(FilterExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INIT_UNIT_GROUP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INIT_UNIT_GROUP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INIT_UNIT_GROUP__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INIT_UNIT_GROUP__INITS:
				return ((InternalEList<?>)getInits()).basicRemove(otherEnd, msgs);
			case CorePackage.INIT_UNIT_GROUP__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case CorePackage.INIT_UNIT_GROUP__TYPE:
				return getType();
			case CorePackage.INIT_UNIT_GROUP__INITS:
				return getInits();
			case CorePackage.INIT_UNIT_GROUP__EXPRESSION:
				return getExpression();
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
			case CorePackage.INIT_UNIT_GROUP__TYPE:
				setType((InitUnitGroupType)newValue);
				return;
			case CorePackage.INIT_UNIT_GROUP__INITS:
				getInits().clear();
				getInits().addAll((Collection<? extends InitUnit>)newValue);
				return;
			case CorePackage.INIT_UNIT_GROUP__EXPRESSION:
				setExpression((FilterExpression)newValue);
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
			case CorePackage.INIT_UNIT_GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.INIT_UNIT_GROUP__INITS:
				getInits().clear();
				return;
			case CorePackage.INIT_UNIT_GROUP__EXPRESSION:
				setExpression((FilterExpression)null);
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
			case CorePackage.INIT_UNIT_GROUP__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.INIT_UNIT_GROUP__INITS:
				return inits != null && !inits.isEmpty();
			case CorePackage.INIT_UNIT_GROUP__EXPRESSION:
				return expression != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InitUnitGroupImpl
