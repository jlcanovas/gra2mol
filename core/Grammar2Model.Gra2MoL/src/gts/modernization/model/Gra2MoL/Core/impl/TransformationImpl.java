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
import gts.modernization.model.Gra2MoL.Core.Hash;
import gts.modernization.model.Gra2MoL.Core.Rule;
import gts.modernization.model.Gra2MoL.Core.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl#getSourceGrammar <em>Source Grammar</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl#getTargetMetamodel <em>Target Metamodel</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl#getHashes <em>Hashes</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EObjectImpl implements Transformation {
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
	 * The default value of the '{@link #getSourceGrammar() <em>Source Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceGrammar()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_GRAMMAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceGrammar() <em>Source Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceGrammar()
	 * @generated
	 * @ordered
	 */
	protected String sourceGrammar = SOURCE_GRAMMAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMetamodel() <em>Target Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_METAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMetamodel() <em>Target Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetamodel()
	 * @generated
	 * @ordered
	 */
	protected String targetMetamodel = TARGET_METAMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashes() <em>Hashes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashes()
	 * @generated
	 * @ordered
	 */
	protected EList<Hash> hashes;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceGrammar() {
		return sourceGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceGrammar(String newSourceGrammar) {
		String oldSourceGrammar = sourceGrammar;
		sourceGrammar = newSourceGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION__SOURCE_GRAMMAR, oldSourceGrammar, sourceGrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMetamodel() {
		return targetMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMetamodel(String newTargetMetamodel) {
		String oldTargetMetamodel = targetMetamodel;
		targetMetamodel = newTargetMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION__TARGET_METAMODEL, oldTargetMetamodel, targetMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hash> getHashes() {
		if (hashes == null) {
			hashes = new EObjectContainmentEList<Hash>(Hash.class, this, CorePackage.TRANSFORMATION__HASHES);
		}
		return hashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, CorePackage.TRANSFORMATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRANSFORMATION__HASHES:
				return ((InternalEList<?>)getHashes()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TRANSFORMATION__NAME:
				return getName();
			case CorePackage.TRANSFORMATION__SOURCE_GRAMMAR:
				return getSourceGrammar();
			case CorePackage.TRANSFORMATION__TARGET_METAMODEL:
				return getTargetMetamodel();
			case CorePackage.TRANSFORMATION__HASHES:
				return getHashes();
			case CorePackage.TRANSFORMATION__RULES:
				return getRules();
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
			case CorePackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case CorePackage.TRANSFORMATION__SOURCE_GRAMMAR:
				setSourceGrammar((String)newValue);
				return;
			case CorePackage.TRANSFORMATION__TARGET_METAMODEL:
				setTargetMetamodel((String)newValue);
				return;
			case CorePackage.TRANSFORMATION__HASHES:
				getHashes().clear();
				getHashes().addAll((Collection<? extends Hash>)newValue);
				return;
			case CorePackage.TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case CorePackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.TRANSFORMATION__SOURCE_GRAMMAR:
				setSourceGrammar(SOURCE_GRAMMAR_EDEFAULT);
				return;
			case CorePackage.TRANSFORMATION__TARGET_METAMODEL:
				setTargetMetamodel(TARGET_METAMODEL_EDEFAULT);
				return;
			case CorePackage.TRANSFORMATION__HASHES:
				getHashes().clear();
				return;
			case CorePackage.TRANSFORMATION__RULES:
				getRules().clear();
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
			case CorePackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.TRANSFORMATION__SOURCE_GRAMMAR:
				return SOURCE_GRAMMAR_EDEFAULT == null ? sourceGrammar != null : !SOURCE_GRAMMAR_EDEFAULT.equals(sourceGrammar);
			case CorePackage.TRANSFORMATION__TARGET_METAMODEL:
				return TARGET_METAMODEL_EDEFAULT == null ? targetMetamodel != null : !TARGET_METAMODEL_EDEFAULT.equals(targetMetamodel);
			case CorePackage.TRANSFORMATION__HASHES:
				return hashes != null && !hashes.isEmpty();
			case CorePackage.TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
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
		result.append(", sourceGrammar: ");
		result.append(sourceGrammar);
		result.append(", targetMetamodel: ");
		result.append(targetMetamodel);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
