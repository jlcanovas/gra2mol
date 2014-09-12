/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source.impl;

import java.util.Collection;

import kdm.core.impl.ElementImpl;

import kdm.kdm.Audit;
import kdm.kdm.ExtendedValue;
import kdm.kdm.ExtensionFamily;
import kdm.kdm.Stereotype;

import kdm.source.AbstractInventoryElement;
import kdm.source.InventoryModel;
import kdm.source.SourcePackage;

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
 * An implementation of the model object '<em><b>Inventory Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.source.impl.InventoryModelImpl#getInventoryElement <em>Inventory Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InventoryModelImpl extends ElementImpl implements InventoryModel {
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
	 * The cached value of the '{@link #getInventoryElement() <em>Inventory Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInventoryElement> inventoryElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.INVENTORY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, SourcePackage.INVENTORY_MODEL__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, SourcePackage.INVENTORY_MODEL__TAGGED_VALUE);
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
			audit = new EObjectContainmentEList<Audit>(Audit.class, this, SourcePackage.INVENTORY_MODEL__AUDIT);
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
			extensionFamily = new EObjectContainmentEList<ExtensionFamily>(ExtensionFamily.class, this, SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.INVENTORY_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInventoryElement> getInventoryElement() {
		if (inventoryElement == null) {
			inventoryElement = new EObjectContainmentEList<AbstractInventoryElement>(AbstractInventoryElement.class, this, SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT);
		}
		return inventoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.INVENTORY_MODEL__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case SourcePackage.INVENTORY_MODEL__AUDIT:
				return ((InternalEList<?>)getAudit()).basicRemove(otherEnd, msgs);
			case SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY:
				return ((InternalEList<?>)getExtensionFamily()).basicRemove(otherEnd, msgs);
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return ((InternalEList<?>)getInventoryElement()).basicRemove(otherEnd, msgs);
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
			case SourcePackage.INVENTORY_MODEL__STEREOTYPE:
				return getStereotype();
			case SourcePackage.INVENTORY_MODEL__TAGGED_VALUE:
				return getTaggedValue();
			case SourcePackage.INVENTORY_MODEL__AUDIT:
				return getAudit();
			case SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY:
				return getExtensionFamily();
			case SourcePackage.INVENTORY_MODEL__NAME:
				return getName();
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return getInventoryElement();
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
			case SourcePackage.INVENTORY_MODEL__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case SourcePackage.INVENTORY_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case SourcePackage.INVENTORY_MODEL__AUDIT:
				getAudit().clear();
				getAudit().addAll((Collection<? extends Audit>)newValue);
				return;
			case SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				getExtensionFamily().addAll((Collection<? extends ExtensionFamily>)newValue);
				return;
			case SourcePackage.INVENTORY_MODEL__NAME:
				setName((String)newValue);
				return;
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				getInventoryElement().clear();
				getInventoryElement().addAll((Collection<? extends AbstractInventoryElement>)newValue);
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
			case SourcePackage.INVENTORY_MODEL__STEREOTYPE:
				getStereotype().clear();
				return;
			case SourcePackage.INVENTORY_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case SourcePackage.INVENTORY_MODEL__AUDIT:
				getAudit().clear();
				return;
			case SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				return;
			case SourcePackage.INVENTORY_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				getInventoryElement().clear();
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
			case SourcePackage.INVENTORY_MODEL__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case SourcePackage.INVENTORY_MODEL__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case SourcePackage.INVENTORY_MODEL__AUDIT:
				return audit != null && !audit.isEmpty();
			case SourcePackage.INVENTORY_MODEL__EXTENSION_FAMILY:
				return extensionFamily != null && !extensionFamily.isEmpty();
			case SourcePackage.INVENTORY_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SourcePackage.INVENTORY_MODEL__INVENTORY_ELEMENT:
				return inventoryElement != null && !inventoryElement.isEmpty();
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

} //InventoryModelImpl
