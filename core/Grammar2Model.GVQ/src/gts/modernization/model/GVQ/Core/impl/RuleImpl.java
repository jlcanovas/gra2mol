/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleImpl.java,v 1.1 2008/01/14 09:18:31 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core.impl;



import gts.modernization.model.GVQ.Core.CorePackage;
import gts.modernization.model.GVQ.Core.FromElement;
import gts.modernization.model.GVQ.Core.InitUnitGroup;
import gts.modernization.model.GVQ.Core.InitUnit;
import gts.modernization.model.GVQ.Core.Rule;
import gts.modernization.model.GVQ.Core.ToElement;
import gts.modernization.model.GVQ.Query.FilterUnit;
import gts.modernization.model.GVQ.Query.FilterExpression;
import gts.modernization.model.GVQ.Query.QueryUnit;

import java.util.Collection;

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
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getTo <em>To</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.RuleImpl#getInits <em>Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected FromElement from;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> context;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RULE__FROM, oldFrom, newFrom);
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
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RULE__FROM, newFrom, newFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RULE__TO, oldTo, newTo);
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
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RULE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RULE__TO, newTo, newTo));
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContext() {
		if (context == null) {
			context = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.RULE__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RULE__FROM:
				return basicSetFrom(null, msgs);
			case CorePackage.RULE__TO:
				return basicSetTo(null, msgs);
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
			case CorePackage.RULE__FROM:
				return getFrom();
			case CorePackage.RULE__TO:
				return getTo();
			case CorePackage.RULE__CONTEXT:
				return getContext();
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
			case CorePackage.RULE__FROM:
				setFrom((FromElement)newValue);
				return;
			case CorePackage.RULE__TO:
				setTo((ToElement)newValue);
				return;
			case CorePackage.RULE__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.RULE__FROM:
				setFrom((FromElement)null);
				return;
			case CorePackage.RULE__TO:
				setTo((ToElement)null);
				return;
			case CorePackage.RULE__CONTEXT:
				getContext().clear();
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
			case CorePackage.RULE__FROM:
				return from != null;
			case CorePackage.RULE__TO:
				return to != null;
			case CorePackage.RULE__CONTEXT:
				return context != null && !context.isEmpty();
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
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
