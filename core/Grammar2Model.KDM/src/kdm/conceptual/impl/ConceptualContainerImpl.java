/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.conceptual.AbstractConceptualElement;
import kdm.conceptual.AbstractConceptualRelationship;
import kdm.conceptual.ConceptualContainer;
import kdm.conceptual.ConceptualPackage;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
import kdm.kdm.Stereotype;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.conceptual.impl.ConceptualContainerImpl#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualContainerImpl extends ElementImpl implements ConceptualContainer {
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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getConceptualRelation() <em>Conceptual Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualRelationship> conceptualRelation;

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
	protected ConceptualContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.CONCEPTUAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.CONCEPTUAL_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualRelationship> getConceptualRelation() {
		if (conceptualRelation == null) {
			conceptualRelation = new EObjectContainmentEList<AbstractConceptualRelationship>(AbstractConceptualRelationship.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION);
		}
		return conceptualRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualElement> getConceptualElement() {
		if (conceptualElement == null) {
			conceptualElement = new EObjectContainmentEList<AbstractConceptualElement>(AbstractConceptualElement.class, this, ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT);
		}
		return conceptualElement;
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
			case ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION:
				return ((InternalEList<?>)getConceptualRelation()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT:
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
			case ConceptualPackage.CONCEPTUAL_CONTAINER__STEREOTYPE:
				return getStereotype();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE:
				return getTaggedValue();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__NAME:
				return getName();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE:
				return getSource();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__IMPLEMENTATION:
				return getImplementation();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION:
				return getConceptualRelation();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION:
				return getAbstraction();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT:
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
			case ConceptualPackage.CONCEPTUAL_CONTAINER__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				getConceptualRelation().addAll((Collection<? extends AbstractConceptualRelationship>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT:
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
			case ConceptualPackage.CONCEPTUAL_CONTAINER__STEREOTYPE:
				getStereotype().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE:
				getSource().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION:
				getAbstraction().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT:
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
			case ConceptualPackage.CONCEPTUAL_CONTAINER__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConceptualPackage.CONCEPTUAL_CONTAINER__SOURCE:
				return source != null && !source.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION:
				return conceptualRelation != null && !conceptualRelation.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case ConceptualPackage.CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT:
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

} //ConceptualContainerImpl
