/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm.impl;

import java.util.Collection;

import kdm.core.impl.ElementImpl;

import kdm.kdm.Audit;
import kdm.kdm.ExtendedValue;
import kdm.kdm.ExtensionFamily;
import kdm.kdm.KDMModel;
import kdm.kdm.KdmPackage;
import kdm.kdm.Segment;
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
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link kdm.kdm.impl.SegmentImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends ElementImpl implements Segment {
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
	 * The cached value of the '{@link #getAudit() <em>Audit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudit()
	 * @generated
	 * @ordered
	 */
	protected EList<Audit> audit;

	/**
	 * The cached value of the '{@link #getExtensionFamily() <em>Extension Family</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionFamily()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionFamily> extensionFamily;

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
	 * The cached value of the '{@link #getSegment() <em>Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segment;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMModel> model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmPackage.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, KdmPackage.SEGMENT__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, KdmPackage.SEGMENT__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audit> getAudit() {
		if (audit == null) {
			audit = new EObjectContainmentEList<Audit>(Audit.class, this, KdmPackage.SEGMENT__AUDIT);
		}
		return audit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionFamily> getExtensionFamily() {
		if (extensionFamily == null) {
			extensionFamily = new EObjectContainmentEList<ExtensionFamily>(ExtensionFamily.class, this, KdmPackage.SEGMENT__EXTENSION_FAMILY);
		}
		return extensionFamily;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KdmPackage.SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getSegment() {
		if (segment == null) {
			segment = new EObjectContainmentEList<Segment>(Segment.class, this, KdmPackage.SEGMENT__SEGMENT);
		}
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMModel> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<KDMModel>(KDMModel.class, this, KdmPackage.SEGMENT__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KdmPackage.SEGMENT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case KdmPackage.SEGMENT__AUDIT:
				return ((InternalEList<?>)getAudit()).basicRemove(otherEnd, msgs);
			case KdmPackage.SEGMENT__EXTENSION_FAMILY:
				return ((InternalEList<?>)getExtensionFamily()).basicRemove(otherEnd, msgs);
			case KdmPackage.SEGMENT__SEGMENT:
				return ((InternalEList<?>)getSegment()).basicRemove(otherEnd, msgs);
			case KdmPackage.SEGMENT__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
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
			case KdmPackage.SEGMENT__STEREOTYPE:
				return getStereotype();
			case KdmPackage.SEGMENT__TAGGED_VALUE:
				return getTaggedValue();
			case KdmPackage.SEGMENT__AUDIT:
				return getAudit();
			case KdmPackage.SEGMENT__EXTENSION_FAMILY:
				return getExtensionFamily();
			case KdmPackage.SEGMENT__NAME:
				return getName();
			case KdmPackage.SEGMENT__SEGMENT:
				return getSegment();
			case KdmPackage.SEGMENT__MODEL:
				return getModel();
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
			case KdmPackage.SEGMENT__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case KdmPackage.SEGMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case KdmPackage.SEGMENT__AUDIT:
				getAudit().clear();
				getAudit().addAll((Collection<? extends Audit>)newValue);
				return;
			case KdmPackage.SEGMENT__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				getExtensionFamily().addAll((Collection<? extends ExtensionFamily>)newValue);
				return;
			case KdmPackage.SEGMENT__NAME:
				setName((String)newValue);
				return;
			case KdmPackage.SEGMENT__SEGMENT:
				getSegment().clear();
				getSegment().addAll((Collection<? extends Segment>)newValue);
				return;
			case KdmPackage.SEGMENT__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends KDMModel>)newValue);
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
			case KdmPackage.SEGMENT__STEREOTYPE:
				getStereotype().clear();
				return;
			case KdmPackage.SEGMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case KdmPackage.SEGMENT__AUDIT:
				getAudit().clear();
				return;
			case KdmPackage.SEGMENT__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				return;
			case KdmPackage.SEGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KdmPackage.SEGMENT__SEGMENT:
				getSegment().clear();
				return;
			case KdmPackage.SEGMENT__MODEL:
				getModel().clear();
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
			case KdmPackage.SEGMENT__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case KdmPackage.SEGMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case KdmPackage.SEGMENT__AUDIT:
				return audit != null && !audit.isEmpty();
			case KdmPackage.SEGMENT__EXTENSION_FAMILY:
				return extensionFamily != null && !extensionFamily.isEmpty();
			case KdmPackage.SEGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KdmPackage.SEGMENT__SEGMENT:
				return segment != null && !segment.isEmpty();
			case KdmPackage.SEGMENT__MODEL:
				return model != null && !model.isEmpty();
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

} //SegmentImpl
