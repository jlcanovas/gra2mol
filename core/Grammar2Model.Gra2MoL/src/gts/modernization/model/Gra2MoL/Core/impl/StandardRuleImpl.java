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
import gts.modernization.model.Gra2MoL.Core.RuleType;
import gts.modernization.model.Gra2MoL.Core.StandardRule;
import gts.modernization.model.Gra2MoL.Core.ToElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl#getTo <em>To</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardRuleImpl extends RuleImpl implements StandardRule {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType TYPE_EDEFAULT = RuleType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected FromElement from;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> context;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ToElement to;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STANDARD_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RuleType newType) {
		RuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STANDARD_RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromElement getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FromElement newFrom, NotificationChain msgs) {
		FromElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.STANDARD_RULE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(FromElement newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.STANDARD_RULE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.STANDARD_RULE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STANDARD_RULE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContext() {
		if (context == null) {
			context = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.STANDARD_RULE__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToElement getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToElement newTo, NotificationChain msgs) {
		ToElement oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.STANDARD_RULE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ToElement newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.STANDARD_RULE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.STANDARD_RULE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STANDARD_RULE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMixins() {
		if (mixins == null) {
			mixins = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.STANDARD_RULE__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.STANDARD_RULE__FROM:
				return basicSetFrom(null, msgs);
			case CorePackage.STANDARD_RULE__TO:
				return basicSetTo(null, msgs);
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
			case CorePackage.STANDARD_RULE__TYPE:
				return getType();
			case CorePackage.STANDARD_RULE__FROM:
				return getFrom();
			case CorePackage.STANDARD_RULE__CONTEXT:
				return getContext();
			case CorePackage.STANDARD_RULE__TO:
				return getTo();
			case CorePackage.STANDARD_RULE__MIXINS:
				return getMixins();
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
			case CorePackage.STANDARD_RULE__TYPE:
				setType((RuleType)newValue);
				return;
			case CorePackage.STANDARD_RULE__FROM:
				setFrom((FromElement)newValue);
				return;
			case CorePackage.STANDARD_RULE__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.STANDARD_RULE__TO:
				setTo((ToElement)newValue);
				return;
			case CorePackage.STANDARD_RULE__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.STANDARD_RULE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.STANDARD_RULE__FROM:
				setFrom((FromElement)null);
				return;
			case CorePackage.STANDARD_RULE__CONTEXT:
				getContext().clear();
				return;
			case CorePackage.STANDARD_RULE__TO:
				setTo((ToElement)null);
				return;
			case CorePackage.STANDARD_RULE__MIXINS:
				getMixins().clear();
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
			case CorePackage.STANDARD_RULE__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.STANDARD_RULE__FROM:
				return from != null;
			case CorePackage.STANDARD_RULE__CONTEXT:
				return context != null && !context.isEmpty();
			case CorePackage.STANDARD_RULE__TO:
				return to != null;
			case CorePackage.STANDARD_RULE__MIXINS:
				return mixins != null && !mixins.isEmpty();
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
		result.append(", context: ");
		result.append(context);
		result.append(", mixins: ");
		result.append(mixins);
		result.append(')');
		return result.toString();
	}

} //StandardRuleImpl
