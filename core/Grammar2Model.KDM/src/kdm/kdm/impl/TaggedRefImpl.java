/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm.impl;

import kdm.core.ModelElement;

import kdm.core.impl.ElementImpl;

import kdm.kdm.KdmPackage;
import kdm.kdm.TagDefinition;
import kdm.kdm.TaggedRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.kdm.impl.TaggedRefImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kdm.kdm.impl.TaggedRefImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaggedRefImpl extends ElementImpl implements TaggedRef {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected TagDefinition tag;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ModelElement reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmPackage.Literals.TAGGED_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDefinition getTag() {
		if (tag != null && tag.eIsProxy()) {
			InternalEObject oldTag = (InternalEObject)tag;
			tag = (TagDefinition)eResolveProxy(oldTag);
			if (tag != oldTag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmPackage.TAGGED_REF__TAG, oldTag, tag));
			}
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDefinition basicGetTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(TagDefinition newTag) {
		TagDefinition oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmPackage.TAGGED_REF__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (ModelElement)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmPackage.TAGGED_REF__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ModelElement newReference) {
		ModelElement oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmPackage.TAGGED_REF__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KdmPackage.TAGGED_REF__TAG:
				if (resolve) return getTag();
				return basicGetTag();
			case KdmPackage.TAGGED_REF__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
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
			case KdmPackage.TAGGED_REF__TAG:
				setTag((TagDefinition)newValue);
				return;
			case KdmPackage.TAGGED_REF__REFERENCE:
				setReference((ModelElement)newValue);
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
			case KdmPackage.TAGGED_REF__TAG:
				setTag((TagDefinition)null);
				return;
			case KdmPackage.TAGGED_REF__REFERENCE:
				setReference((ModelElement)null);
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
			case KdmPackage.TAGGED_REF__TAG:
				return tag != null;
			case KdmPackage.TAGGED_REF__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //TaggedRefImpl
