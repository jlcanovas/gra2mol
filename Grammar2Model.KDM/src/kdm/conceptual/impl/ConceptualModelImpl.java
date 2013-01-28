/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.impl;

import java.util.Collection;

import kdm.conceptual.AbstractConceptualElement;
import kdm.conceptual.ConceptualModel;
import kdm.conceptual.ConceptualPackage;

import kdm.core.impl.ElementImpl;

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
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualModelImpl#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualModelImpl extends ElementImpl implements ConceptualModel {
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
	 * The cached value of the '{@link #getConceptualElement() <em>Conceptual Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualElement> conceptualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.CONCEPTUAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, ConceptualPackage.CONCEPTUAL_MODEL__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE);
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
			audit = new EObjectContainmentEList<Audit>(Audit.class, this, ConceptualPackage.CONCEPTUAL_MODEL__AUDIT);
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
			extensionFamily = new EObjectContainmentEList<ExtensionFamily>(ExtensionFamily.class, this, ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.CONCEPTUAL_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualElement> getConceptualElement() {
		if (conceptualElement == null) {
			conceptualElement = new EObjectContainmentEList<AbstractConceptualElement>(AbstractConceptualElement.class, this, ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT);
		}
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_MODEL__AUDIT:
				return ((InternalEList<?>)getAudit()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY:
				return ((InternalEList<?>)getExtensionFamily()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return ((InternalEList<?>)getConceptualElement()).basicRemove(otherEnd, msgs);
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
			case ConceptualPackage.CONCEPTUAL_MODEL__STEREOTYPE:
				return getStereotype();
			case ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE:
				return getTaggedValue();
			case ConceptualPackage.CONCEPTUAL_MODEL__AUDIT:
				return getAudit();
			case ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY:
				return getExtensionFamily();
			case ConceptualPackage.CONCEPTUAL_MODEL__NAME:
				return getName();
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return getConceptualElement();
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
			case ConceptualPackage.CONCEPTUAL_MODEL__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__AUDIT:
				getAudit().clear();
				getAudit().addAll((Collection<? extends Audit>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				getExtensionFamily().addAll((Collection<? extends ExtensionFamily>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__NAME:
				setName((String)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				getConceptualElement().clear();
				getConceptualElement().addAll((Collection<? extends AbstractConceptualElement>)newValue);
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
			case ConceptualPackage.CONCEPTUAL_MODEL__STEREOTYPE:
				getStereotype().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__AUDIT:
				getAudit().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY:
				getExtensionFamily().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				getConceptualElement().clear();
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
			case ConceptualPackage.CONCEPTUAL_MODEL__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case ConceptualPackage.CONCEPTUAL_MODEL__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ConceptualPackage.CONCEPTUAL_MODEL__AUDIT:
				return audit != null && !audit.isEmpty();
			case ConceptualPackage.CONCEPTUAL_MODEL__EXTENSION_FAMILY:
				return extensionFamily != null && !extensionFamily.isEmpty();
			case ConceptualPackage.CONCEPTUAL_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return conceptualElement != null && !conceptualElement.isEmpty();
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

} //ConceptualModelImpl
