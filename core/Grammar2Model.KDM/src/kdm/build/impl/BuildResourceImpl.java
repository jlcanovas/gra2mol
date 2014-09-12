/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build.impl;

import java.util.Collection;

import kdm.build.AbstractBuildElement;
import kdm.build.AbstractBuildRelationship;
import kdm.build.BuildPackage;
import kdm.build.BuildResource;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getBuildRelation <em>Build Relation</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getGroupedBuild <em>Grouped Build</em>}</li>
 *   <li>{@link kdm.build.impl.BuildResourceImpl#getBuildElement <em>Build Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildResourceImpl extends ElementImpl implements BuildResource {
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
	 * The cached value of the '{@link #getBuildRelation() <em>Build Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildRelationship> buildRelation;

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
	 * The cached value of the '{@link #getGroupedBuild() <em>Grouped Build</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBuild()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildElement> groupedBuild;

	/**
	 * The cached value of the '{@link #getBuildElement() <em>Build Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildElement> buildElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.BUILD_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, BuildPackage.BUILD_RESOURCE__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, BuildPackage.BUILD_RESOURCE__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractBuildRelationship> getBuildRelation() {
		if (buildRelation == null) {
			buildRelation = new EObjectContainmentEList<AbstractBuildRelationship>(AbstractBuildRelationship.class, this, BuildPackage.BUILD_RESOURCE__BUILD_RELATION);
		}
		return buildRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, BuildPackage.BUILD_RESOURCE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractBuildElement> getGroupedBuild() {
		if (groupedBuild == null) {
			groupedBuild = new EObjectResolvingEList<AbstractBuildElement>(AbstractBuildElement.class, this, BuildPackage.BUILD_RESOURCE__GROUPED_BUILD);
		}
		return groupedBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractBuildElement> getBuildElement() {
		if (buildElement == null) {
			buildElement = new EObjectContainmentEList<AbstractBuildElement>(AbstractBuildElement.class, this, BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT);
		}
		return buildElement;
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
			case BuildPackage.BUILD_RESOURCE__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return ((InternalEList<?>)getBuildRelation()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return ((InternalEList<?>)getBuildElement()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.BUILD_RESOURCE__STEREOTYPE:
				return getStereotype();
			case BuildPackage.BUILD_RESOURCE__TAGGED_VALUE:
				return getTaggedValue();
			case BuildPackage.BUILD_RESOURCE__NAME:
				return getName();
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return getBuildRelation();
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				return getImplementation();
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				return getGroupedBuild();
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return getBuildElement();
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
			case BuildPackage.BUILD_RESOURCE__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				getBuildRelation().clear();
				getBuildRelation().addAll((Collection<? extends AbstractBuildRelationship>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				getGroupedBuild().clear();
				getGroupedBuild().addAll((Collection<? extends AbstractBuildElement>)newValue);
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				getBuildElement().clear();
				getBuildElement().addAll((Collection<? extends AbstractBuildElement>)newValue);
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
			case BuildPackage.BUILD_RESOURCE__STEREOTYPE:
				getStereotype().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				getBuildRelation().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				getGroupedBuild().clear();
				return;
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				getBuildElement().clear();
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
			case BuildPackage.BUILD_RESOURCE__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case BuildPackage.BUILD_RESOURCE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case BuildPackage.BUILD_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
				return buildRelation != null && !buildRelation.isEmpty();
			case BuildPackage.BUILD_RESOURCE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case BuildPackage.BUILD_RESOURCE__GROUPED_BUILD:
				return groupedBuild != null && !groupedBuild.isEmpty();
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
				return buildElement != null && !buildElement.isEmpty();
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

} //BuildResourceImpl
