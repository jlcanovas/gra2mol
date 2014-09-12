/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.event.AbstractEventRelationship;
import kdm.event.Event;
import kdm.event.EventAction;
import kdm.event.EventPackage;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.event.impl.EventActionImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getEventRelation <em>Event Relation</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.event.impl.EventActionImpl#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventActionImpl extends ElementImpl implements EventAction {
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
	 * The cached value of the '{@link #getEventRelation() <em>Event Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventRelationship> eventRelation;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventElement() <em>Event Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> eventElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, EventPackage.EVENT_ACTION__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, EventPackage.EVENT_ACTION__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, EventPackage.EVENT_ACTION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEventRelationship> getEventRelation() {
		if (eventRelation == null) {
			eventRelation = new EObjectContainmentEList<AbstractEventRelationship>(AbstractEventRelationship.class, this, EventPackage.EVENT_ACTION__EVENT_RELATION);
		}
		return eventRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, EventPackage.EVENT_ACTION__ABSTRACTION);
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
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, EventPackage.EVENT_ACTION__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEventElement() {
		if (eventElement == null) {
			eventElement = new EObjectContainmentEList<Event>(Event.class, this, EventPackage.EVENT_ACTION__EVENT_ELEMENT);
		}
		return eventElement;
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
			case EventPackage.EVENT_ACTION__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return ((InternalEList<?>)getEventRelation()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
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
			case EventPackage.EVENT_ACTION__STEREOTYPE:
				return getStereotype();
			case EventPackage.EVENT_ACTION__TAGGED_VALUE:
				return getTaggedValue();
			case EventPackage.EVENT_ACTION__NAME:
				return getName();
			case EventPackage.EVENT_ACTION__SOURCE:
				return getSource();
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return getEventRelation();
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return getAbstraction();
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				return getImplementation();
			case EventPackage.EVENT_ACTION__KIND:
				return getKind();
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
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
			case EventPackage.EVENT_ACTION__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case EventPackage.EVENT_ACTION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case EventPackage.EVENT_ACTION__NAME:
				setName((String)newValue);
				return;
			case EventPackage.EVENT_ACTION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				getEventRelation().clear();
				getEventRelation().addAll((Collection<? extends AbstractEventRelationship>)newValue);
				return;
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case EventPackage.EVENT_ACTION__KIND:
				setKind((String)newValue);
				return;
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				getEventElement().clear();
				getEventElement().addAll((Collection<? extends Event>)newValue);
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
			case EventPackage.EVENT_ACTION__STEREOTYPE:
				getStereotype().clear();
				return;
			case EventPackage.EVENT_ACTION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EventPackage.EVENT_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventPackage.EVENT_ACTION__SOURCE:
				getSource().clear();
				return;
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				getEventRelation().clear();
				return;
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				getAbstraction().clear();
				return;
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case EventPackage.EVENT_ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
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
			case EventPackage.EVENT_ACTION__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case EventPackage.EVENT_ACTION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EventPackage.EVENT_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventPackage.EVENT_ACTION__SOURCE:
				return source != null && !source.isEmpty();
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return eventRelation != null && !eventRelation.isEmpty();
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case EventPackage.EVENT_ACTION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
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
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //EventActionImpl
