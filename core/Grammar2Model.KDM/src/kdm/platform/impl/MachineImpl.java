/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
import kdm.kdm.Stereotype;

import kdm.platform.AbstractPlatformRelationship;
import kdm.platform.DeployedComponent;
import kdm.platform.DeployedResource;
import kdm.platform.Machine;
import kdm.platform.PlatformPackage;

import kdm.source.SourceRef;

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
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.platform.impl.MachineImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link kdm.platform.impl.MachineImpl#getDeployedResource <em>Deployed Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends ElementImpl implements Machine {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPlatformRelationship> relation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * The cached value of the '{@link #getDeployedComponent() <em>Deployed Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> deployedComponent;

	/**
	 * The cached value of the '{@link #getDeployedResource() <em>Deployed Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedResource> deployedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, PlatformPackage.MACHINE__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, PlatformPackage.MACHINE__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, PlatformPackage.MACHINE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPlatformRelationship> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<AbstractPlatformRelationship>(AbstractPlatformRelationship.class, this, PlatformPackage.MACHINE__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, PlatformPackage.MACHINE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, PlatformPackage.MACHINE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedComponent> getDeployedComponent() {
		if (deployedComponent == null) {
			deployedComponent = new EObjectContainmentEList<DeployedComponent>(DeployedComponent.class, this, PlatformPackage.MACHINE__DEPLOYED_COMPONENT);
		}
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedResource> getDeployedResource() {
		if (deployedResource == null) {
			deployedResource = new EObjectContainmentEList<DeployedResource>(DeployedResource.class, this, PlatformPackage.MACHINE__DEPLOYED_RESOURCE);
		}
		return deployedResource;
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
			case PlatformPackage.MACHINE__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return ((InternalEList<?>)getDeployedComponent()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return ((InternalEList<?>)getDeployedResource()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.MACHINE__STEREOTYPE:
				return getStereotype();
			case PlatformPackage.MACHINE__TAGGED_VALUE:
				return getTaggedValue();
			case PlatformPackage.MACHINE__NAME:
				return getName();
			case PlatformPackage.MACHINE__SOURCE:
				return getSource();
			case PlatformPackage.MACHINE__RELATION:
				return getRelation();
			case PlatformPackage.MACHINE__ABSTRACTION:
				return getAbstraction();
			case PlatformPackage.MACHINE__IMPLEMENTATION:
				return getImplementation();
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return getDeployedComponent();
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return getDeployedResource();
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
			case PlatformPackage.MACHINE__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case PlatformPackage.MACHINE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case PlatformPackage.MACHINE__NAME:
				setName((String)newValue);
				return;
			case PlatformPackage.MACHINE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case PlatformPackage.MACHINE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends AbstractPlatformRelationship>)newValue);
				return;
			case PlatformPackage.MACHINE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case PlatformPackage.MACHINE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				getDeployedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
				return;
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				getDeployedResource().clear();
				getDeployedResource().addAll((Collection<? extends DeployedResource>)newValue);
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
			case PlatformPackage.MACHINE__STEREOTYPE:
				getStereotype().clear();
				return;
			case PlatformPackage.MACHINE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case PlatformPackage.MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlatformPackage.MACHINE__SOURCE:
				getSource().clear();
				return;
			case PlatformPackage.MACHINE__RELATION:
				getRelation().clear();
				return;
			case PlatformPackage.MACHINE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case PlatformPackage.MACHINE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				return;
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				getDeployedResource().clear();
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
			case PlatformPackage.MACHINE__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case PlatformPackage.MACHINE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case PlatformPackage.MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlatformPackage.MACHINE__SOURCE:
				return source != null && !source.isEmpty();
			case PlatformPackage.MACHINE__RELATION:
				return relation != null && !relation.isEmpty();
			case PlatformPackage.MACHINE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case PlatformPackage.MACHINE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return deployedComponent != null && !deployedComponent.isEmpty();
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return deployedResource != null && !deployedResource.isEmpty();
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

} //MachineImpl
