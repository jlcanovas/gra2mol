/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build.impl;

import java.util.Collection;

import kdm.build.AbstractBuildElement;
import kdm.build.BuildPackage;
import kdm.build.SuppliedBy;
import kdm.build.Supplier;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.Stereotype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplied By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.build.impl.SuppliedByImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.build.impl.SuppliedByImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.build.impl.SuppliedByImpl#getTo <em>To</em>}</li>
 *   <li>{@link kdm.build.impl.SuppliedByImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuppliedByImpl extends ElementImpl implements SuppliedBy {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotype;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedValue> taggedValue;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Supplier to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected AbstractBuildElement from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuppliedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.SUPPLIED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, BuildPackage.SUPPLIED_BY__STEREOTYPE);
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, BuildPackage.SUPPLIED_BY__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Supplier)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.SUPPLIED_BY__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Supplier newTo) {
		Supplier oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.SUPPLIED_BY__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBuildElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (AbstractBuildElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.SUPPLIED_BY__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBuildElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(AbstractBuildElement newFrom) {
		AbstractBuildElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.SUPPLIED_BY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.SUPPLIED_BY__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.SUPPLIED_BY__STEREOTYPE:
				return getStereotype();
			case BuildPackage.SUPPLIED_BY__TAGGED_VALUE:
				return getTaggedValue();
			case BuildPackage.SUPPLIED_BY__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case BuildPackage.SUPPLIED_BY__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case BuildPackage.SUPPLIED_BY__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case BuildPackage.SUPPLIED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case BuildPackage.SUPPLIED_BY__TO:
				setTo((Supplier)newValue);
				return;
			case BuildPackage.SUPPLIED_BY__FROM:
				setFrom((AbstractBuildElement)newValue);
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
			case BuildPackage.SUPPLIED_BY__STEREOTYPE:
				getStereotype().clear();
				return;
			case BuildPackage.SUPPLIED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case BuildPackage.SUPPLIED_BY__TO:
				setTo((Supplier)null);
				return;
			case BuildPackage.SUPPLIED_BY__FROM:
				setFrom((AbstractBuildElement)null);
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
			case BuildPackage.SUPPLIED_BY__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case BuildPackage.SUPPLIED_BY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case BuildPackage.SUPPLIED_BY__TO:
				return to != null;
			case BuildPackage.SUPPLIED_BY__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //SuppliedByImpl
