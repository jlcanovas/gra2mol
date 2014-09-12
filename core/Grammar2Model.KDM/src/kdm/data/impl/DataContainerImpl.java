/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data.impl;

import java.util.Collection;

import kdm.data.DataContainer;
import kdm.data.DataPackage;
import kdm.data.DataResource;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.data.impl.DataContainerImpl#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataContainerImpl extends DataResourceImpl implements DataContainer {
	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataResource> dataElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataResource> getDataElement() {
		if (dataElement == null) {
			dataElement = new EObjectContainmentEList<DataResource>(DataResource.class, this, DataPackage.DATA_CONTAINER__DATA_ELEMENT);
		}
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_CONTAINER__DATA_ELEMENT:
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
			case DataPackage.DATA_CONTAINER__DATA_ELEMENT:
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
			case DataPackage.DATA_CONTAINER__DATA_ELEMENT:
				getDataElement().clear();
				getDataElement().addAll((Collection<? extends DataResource>)newValue);
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
			case DataPackage.DATA_CONTAINER__DATA_ELEMENT:
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
			case DataPackage.DATA_CONTAINER__DATA_ELEMENT:
				return dataElement != null && !dataElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataContainerImpl
