/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.impl;

import java.util.Collection;

import kdm.conceptual.AbstractConceptualElement;
import kdm.conceptual.ConceptualPackage;
import kdm.conceptual.ConceptualRelationship;

import kdm.core.KDMEntity;

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
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.conceptual.impl.ConceptualRelationshipImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualRelationshipImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualRelationshipImpl#getTo <em>To</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualRelationshipImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualRelationshipImpl extends ElementImpl implements ConceptualRelationship {
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
	protected KDMEntity to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected AbstractConceptualElement from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.CONCEPTUAL_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (KDMEntity)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(KDMEntity newTo) {
		KDMEntity oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConceptualElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (AbstractConceptualElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConceptualElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(AbstractConceptualElement newFrom) {
		AbstractConceptualElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE:
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
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__STEREOTYPE:
				return getStereotype();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE:
				return getTaggedValue();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM:
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
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO:
				setTo((KDMEntity)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM:
				setFrom((AbstractConceptualElement)newValue);
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
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__STEREOTYPE:
				getStereotype().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO:
				setTo((KDMEntity)null);
				return;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM:
				setFrom((AbstractConceptualElement)null);
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
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__TO:
				return to != null;
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptualRelationshipImpl
