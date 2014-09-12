/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.structure.impl;

import java.util.Collection;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
import kdm.kdm.Stereotype;

import kdm.structure.AbstractStructureElement;
import kdm.structure.AbstractStructureRelationship;
import kdm.structure.SoftwareSystem;
import kdm.structure.StructurePackage;

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
 * An implementation of the model object '<em><b>Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link kdm.structure.impl.SoftwareSystemImpl#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareSystemImpl extends ElementImpl implements SoftwareSystem {
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
	 * The cached value of the '{@link #getAggregated() <em>Aggregated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregated()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRelationship> aggregated;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getStructureElement() <em>Structure Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureElement> structureElement;

	/**
	 * The cached value of the '{@link #getStructureRelationship() <em>Structure Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureRelationship> structureRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.SOFTWARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, StructurePackage.SOFTWARE_SYSTEM__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE);
		}
		return taggedValue;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.SOFTWARE_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getAggregated() {
		if (aggregated == null) {
			aggregated = new EObjectContainmentEList<AggregatedRelationship>(AggregatedRelationship.class, this, StructurePackage.SOFTWARE_SYSTEM__AGGREGATED);
		}
		return aggregated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, StructurePackage.SOFTWARE_SYSTEM__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStructureElement> getStructureElement() {
		if (structureElement == null) {
			structureElement = new EObjectContainmentEList<AbstractStructureElement>(AbstractStructureElement.class, this, StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT);
		}
		return structureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStructureRelationship> getStructureRelationship() {
		if (structureRelationship == null) {
			structureRelationship = new EObjectContainmentEList<AbstractStructureRelationship>(AbstractStructureRelationship.class, this, StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP);
		}
		return structureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAggregation(KDMEntity otherEntity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAggregation(AggregatedRelationship aggregation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getInbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOutbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOwnedRelation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getInAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getOutAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getOwnedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroup() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroupedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMModel getModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case StructurePackage.SOFTWARE_SYSTEM__AGGREGATED:
				return ((InternalEList<?>)getAggregated()).basicRemove(otherEnd, msgs);
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT:
				return ((InternalEList<?>)getStructureElement()).basicRemove(otherEnd, msgs);
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP:
				return ((InternalEList<?>)getStructureRelationship()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.SOFTWARE_SYSTEM__STEREOTYPE:
				return getStereotype();
			case StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE:
				return getTaggedValue();
			case StructurePackage.SOFTWARE_SYSTEM__NAME:
				return getName();
			case StructurePackage.SOFTWARE_SYSTEM__AGGREGATED:
				return getAggregated();
			case StructurePackage.SOFTWARE_SYSTEM__IMPLEMENTATION:
				return getImplementation();
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT:
				return getStructureElement();
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP:
				return getStructureRelationship();
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
			case StructurePackage.SOFTWARE_SYSTEM__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__AGGREGATED:
				getAggregated().clear();
				getAggregated().addAll((Collection<? extends AggregatedRelationship>)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				getStructureElement().addAll((Collection<? extends AbstractStructureElement>)newValue);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
				getStructureRelationship().addAll((Collection<? extends AbstractStructureRelationship>)newValue);
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
			case StructurePackage.SOFTWARE_SYSTEM__STEREOTYPE:
				getStereotype().clear();
				return;
			case StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case StructurePackage.SOFTWARE_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.SOFTWARE_SYSTEM__AGGREGATED:
				getAggregated().clear();
				return;
			case StructurePackage.SOFTWARE_SYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				return;
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
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
			case StructurePackage.SOFTWARE_SYSTEM__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case StructurePackage.SOFTWARE_SYSTEM__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case StructurePackage.SOFTWARE_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.SOFTWARE_SYSTEM__AGGREGATED:
				return aggregated != null && !aggregated.isEmpty();
			case StructurePackage.SOFTWARE_SYSTEM__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_ELEMENT:
				return structureElement != null && !structureElement.isEmpty();
			case StructurePackage.SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP:
				return structureRelationship != null && !structureRelationship.isEmpty();
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

} //SoftwareSystemImpl
