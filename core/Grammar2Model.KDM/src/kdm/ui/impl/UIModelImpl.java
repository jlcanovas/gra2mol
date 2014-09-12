/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui.impl;

import java.util.Collection;

import kdm.core.impl.ElementImpl;

import kdm.kdm.Audit;
import kdm.kdm.ExtendedValue;
import kdm.kdm.ExtensionFamily;
import kdm.kdm.Stereotype;

import kdm.ui.AbstractUIElement;
import kdm.ui.UIModel;
import kdm.ui.UiPackage;

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
 * An implementation of the model object '<em><b>UI Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.ui.impl.UIModelImpl#getUIElement <em>UI Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIModelImpl extends ElementImpl implements UIModel {
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
	 * The cached value of the '{@link #getUIElement() <em>UI Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIElement> uiElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, UiPackage.UI_MODEL__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, UiPackage.UI_MODEL__TAGGED_VALUE);
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
			audit = new EObjectContainmentEList<Audit>(Audit.class, this, UiPackage.UI_MODEL__AUDIT);
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
			extensionFamily = new EObjectContainmentEList<ExtensionFamily>(ExtensionFamily.class, this, UiPackage.UI_MODEL__EXTENSION_FAMILY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIElement> getUIElement() {
		if (uiElement == null) {
			uiElement = new EObjectContainmentEList<AbstractUIElement>(AbstractUIElement.class, this, UiPackage.UI_MODEL__UI_ELEMENT);
		}
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_MODEL__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_MODEL__AUDIT:
				return ((InternalEList<?>)getAudit()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_MODEL__EXTENSION_FAMILY:
				return ((InternalEList<?>)getExtensionFamily()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_MODEL__UI_ELEMENT:
				return ((InternalEList<?>)getUIElement()).basicRemove(otherEnd, msgs);
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
			case UiPackage.UI_MODEL__STEREOTYPE:
				return getStereotype();
			case UiPackage.UI_MODEL__TAGGED_VALUE:
				return getTaggedValue();
			case UiPackage.UI_MODEL__AUDIT:
				return getAudit();
			case UiPackage.UI_MODEL__EXTENSION_FAMILY:
				return getExtensionFamily();
			case UiPackage.UI_MODEL__NAME:
				return getName();
			case UiPackage.UI_MODEL__UI_ELEMENT:
				return getUIElement();
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
			case UiPackage.UI_MODEL__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case UiPackage.UI_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case UiPackage.UI_MODEL__AUDIT:
				getAudit().clear();
				getAudit().addAll((Collection<? extends Audit>)newValue);
				return;
			case UiPackage.UI_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				getExtensionFamily().addAll((Collection<? extends ExtensionFamily>)newValue);
				return;
			case UiPackage.UI_MODEL__NAME:
				setName((String)newValue);
				return;
			case UiPackage.UI_MODEL__UI_ELEMENT:
				getUIElement().clear();
				getUIElement().addAll((Collection<? extends AbstractUIElement>)newValue);
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
			case UiPackage.UI_MODEL__STEREOTYPE:
				getStereotype().clear();
				return;
			case UiPackage.UI_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case UiPackage.UI_MODEL__AUDIT:
				getAudit().clear();
				return;
			case UiPackage.UI_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				return;
			case UiPackage.UI_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiPackage.UI_MODEL__UI_ELEMENT:
				getUIElement().clear();
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
			case UiPackage.UI_MODEL__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case UiPackage.UI_MODEL__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case UiPackage.UI_MODEL__AUDIT:
				return audit != null && !audit.isEmpty();
			case UiPackage.UI_MODEL__EXTENSION_FAMILY:
				return extensionFamily != null && !extensionFamily.isEmpty();
			case UiPackage.UI_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiPackage.UI_MODEL__UI_ELEMENT:
				return uiElement != null && !uiElement.isEmpty();
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

} //UIModelImpl
