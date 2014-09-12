/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.data.AbstractDataRelationship;
import kdm.data.DataAction;
import kdm.data.DataEvent;
import kdm.data.DataPackage;

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
 *   <li>{@link kdm.data.impl.DataActionImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.data.impl.DataActionImpl#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataActionImpl extends ElementImpl implements DataAction {
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
	 * The cached value of the '{@link #getDataRelation() <em>Data Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDataRelationship> dataRelation;

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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> implementation;

	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEvent> dataElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, DataPackage.DATA_ACTION__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, DataPackage.DATA_ACTION__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, DataPackage.DATA_ACTION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDataRelationship> getDataRelation() {
		if (dataRelation == null) {
			dataRelation = new EObjectContainmentEList<AbstractDataRelationship>(AbstractDataRelationship.class, this, DataPackage.DATA_ACTION__DATA_RELATION);
		}
		return dataRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, DataPackage.DATA_ACTION__ABSTRACTION);
		}
		return abstraction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<ActionElement>(ActionElement.class, this, DataPackage.DATA_ACTION__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEvent> getDataElement() {
		if (dataElement == null) {
			dataElement = new EObjectContainmentEList<DataEvent>(DataEvent.class, this, DataPackage.DATA_ACTION__DATA_ELEMENT);
		}
		return dataElement;
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
			case DataPackage.DATA_ACTION__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return ((InternalEList<?>)getDataRelation()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return ((InternalEList<?>)getDataElement()).basicRemove(otherEnd, msgs);
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
			case DataPackage.DATA_ACTION__STEREOTYPE:
				return getStereotype();
			case DataPackage.DATA_ACTION__TAGGED_VALUE:
				return getTaggedValue();
			case DataPackage.DATA_ACTION__NAME:
				return getName();
			case DataPackage.DATA_ACTION__SOURCE:
				return getSource();
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return getDataRelation();
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return getAbstraction();
			case DataPackage.DATA_ACTION__KIND:
				return getKind();
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				return getImplementation();
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return getDataElement();
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
			case DataPackage.DATA_ACTION__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case DataPackage.DATA_ACTION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case DataPackage.DATA_ACTION__NAME:
				setName((String)newValue);
				return;
			case DataPackage.DATA_ACTION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case DataPackage.DATA_ACTION__DATA_RELATION:
				getDataRelation().clear();
				getDataRelation().addAll((Collection<? extends AbstractDataRelationship>)newValue);
				return;
			case DataPackage.DATA_ACTION__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.DATA_ACTION__KIND:
				setKind((String)newValue);
				return;
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				getDataElement().clear();
				getDataElement().addAll((Collection<? extends DataEvent>)newValue);
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
			case DataPackage.DATA_ACTION__STEREOTYPE:
				getStereotype().clear();
				return;
			case DataPackage.DATA_ACTION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case DataPackage.DATA_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.DATA_ACTION__SOURCE:
				getSource().clear();
				return;
			case DataPackage.DATA_ACTION__DATA_RELATION:
				getDataRelation().clear();
				return;
			case DataPackage.DATA_ACTION__ABSTRACTION:
				getAbstraction().clear();
				return;
			case DataPackage.DATA_ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				getDataElement().clear();
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
			case DataPackage.DATA_ACTION__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case DataPackage.DATA_ACTION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case DataPackage.DATA_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.DATA_ACTION__SOURCE:
				return source != null && !source.isEmpty();
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return dataRelation != null && !dataRelation.isEmpty();
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case DataPackage.DATA_ACTION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return dataElement != null && !dataElement.isEmpty();
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

} //DataActionImpl
