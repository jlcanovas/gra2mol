/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui.impl;

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

import kdm.source.SourceRef;

import kdm.ui.AbstractUIElement;
import kdm.ui.AbstractUIRelationship;
import kdm.ui.UIResource;
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
 * An implementation of the model object '<em><b>UI Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getUIRelation <em>UI Relation</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.ui.impl.UIResourceImpl#getUIElement <em>UI Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIResourceImpl extends ElementImpl implements UIResource {
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
	 * The cached value of the '{@link #getUIRelation() <em>UI Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIRelationship> uiRelation;

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
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

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
	protected UIResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, UiPackage.UI_RESOURCE__STEREOTYPE);
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
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, UiPackage.UI_RESOURCE__TAGGED_VALUE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, UiPackage.UI_RESOURCE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIRelationship> getUIRelation() {
		if (uiRelation == null) {
			uiRelation = new EObjectContainmentEList<AbstractUIRelationship>(AbstractUIRelationship.class, this, UiPackage.UI_RESOURCE__UI_RELATION);
		}
		return uiRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, UiPackage.UI_RESOURCE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, UiPackage.UI_RESOURCE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIElement> getUIElement() {
		if (uiElement == null) {
			uiElement = new EObjectContainmentEList<AbstractUIElement>(AbstractUIElement.class, this, UiPackage.UI_RESOURCE__UI_ELEMENT);
		}
		return uiElement;
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
			case UiPackage.UI_RESOURCE__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return ((InternalEList<?>)getUIRelation()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
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
			case UiPackage.UI_RESOURCE__STEREOTYPE:
				return getStereotype();
			case UiPackage.UI_RESOURCE__TAGGED_VALUE:
				return getTaggedValue();
			case UiPackage.UI_RESOURCE__NAME:
				return getName();
			case UiPackage.UI_RESOURCE__SOURCE:
				return getSource();
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return getUIRelation();
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				return getImplementation();
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return getAbstraction();
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
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
			case UiPackage.UI_RESOURCE__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case UiPackage.UI_RESOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case UiPackage.UI_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case UiPackage.UI_RESOURCE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case UiPackage.UI_RESOURCE__UI_RELATION:
				getUIRelation().clear();
				getUIRelation().addAll((Collection<? extends AbstractUIRelationship>)newValue);
				return;
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
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
			case UiPackage.UI_RESOURCE__STEREOTYPE:
				getStereotype().clear();
				return;
			case UiPackage.UI_RESOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case UiPackage.UI_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiPackage.UI_RESOURCE__SOURCE:
				getSource().clear();
				return;
			case UiPackage.UI_RESOURCE__UI_RELATION:
				getUIRelation().clear();
				return;
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
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
			case UiPackage.UI_RESOURCE__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case UiPackage.UI_RESOURCE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case UiPackage.UI_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiPackage.UI_RESOURCE__SOURCE:
				return source != null && !source.isEmpty();
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return uiRelation != null && !uiRelation.isEmpty();
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
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

} //UIResourceImpl
