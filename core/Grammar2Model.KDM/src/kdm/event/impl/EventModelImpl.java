/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event.impl;

import java.util.Collection;

import kdm.core.impl.ElementImpl;

import kdm.event.AbstractEventElement;
import kdm.event.EventModel;
import kdm.event.EventPackage;

import kdm.kdm.Audit;
import kdm.kdm.ExtendedValue;
import kdm.kdm.ExtensionFamily;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.event.impl.EventModelImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.event.impl.EventModelImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.event.impl.EventModelImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.event.impl.EventModelImpl#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.event.impl.EventModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.event.impl.EventModelImpl#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventModelImpl extends ElementImpl implements EventModel {
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
	 * The cached value of the '{@link #getEventElement() <em>Event Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventElement> eventElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, EventPackage.EVENT_MODEL__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, EventPackage.EVENT_MODEL__TAGGED_VALUE);
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
			audit = new EObjectContainmentEList<Audit>(Audit.class, this, EventPackage.EVENT_MODEL__AUDIT);
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
			extensionFamily = new EObjectContainmentEList<ExtensionFamily>(ExtensionFamily.class, this, EventPackage.EVENT_MODEL__EXTENSION_FAMILY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEventElement> getEventElement() {
		if (eventElement == null) {
			eventElement = new EObjectContainmentEList<AbstractEventElement>(AbstractEventElement.class, this, EventPackage.EVENT_MODEL__EVENT_ELEMENT);
		}
		return eventElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventPackage.EVENT_MODEL__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_MODEL__AUDIT:
				return ((InternalEList<?>)getAudit()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_MODEL__EXTENSION_FAMILY:
				return ((InternalEList<?>)getExtensionFamily()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return ((InternalEList<?>)getEventElement()).basicRemove(otherEnd, msgs);
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
			case EventPackage.EVENT_MODEL__STEREOTYPE:
				return getStereotype();
			case EventPackage.EVENT_MODEL__TAGGED_VALUE:
				return getTaggedValue();
			case EventPackage.EVENT_MODEL__AUDIT:
				return getAudit();
			case EventPackage.EVENT_MODEL__EXTENSION_FAMILY:
				return getExtensionFamily();
			case EventPackage.EVENT_MODEL__NAME:
				return getName();
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return getEventElement();
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
			case EventPackage.EVENT_MODEL__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case EventPackage.EVENT_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case EventPackage.EVENT_MODEL__AUDIT:
				getAudit().clear();
				getAudit().addAll((Collection<? extends Audit>)newValue);
				return;
			case EventPackage.EVENT_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				getExtensionFamily().addAll((Collection<? extends ExtensionFamily>)newValue);
				return;
			case EventPackage.EVENT_MODEL__NAME:
				setName((String)newValue);
				return;
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				getEventElement().clear();
				getEventElement().addAll((Collection<? extends AbstractEventElement>)newValue);
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
			case EventPackage.EVENT_MODEL__STEREOTYPE:
				getStereotype().clear();
				return;
			case EventPackage.EVENT_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EventPackage.EVENT_MODEL__AUDIT:
				getAudit().clear();
				return;
			case EventPackage.EVENT_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				return;
			case EventPackage.EVENT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				getEventElement().clear();
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
			case EventPackage.EVENT_MODEL__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case EventPackage.EVENT_MODEL__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EventPackage.EVENT_MODEL__AUDIT:
				return audit != null && !audit.isEmpty();
			case EventPackage.EVENT_MODEL__EXTENSION_FAMILY:
				return extensionFamily != null && !extensionFamily.isEmpty();
			case EventPackage.EVENT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventPackage.EVENT_MODEL__EVENT_ELEMENT:
				return eventElement != null && !eventElement.isEmpty();
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

} //EventModelImpl
