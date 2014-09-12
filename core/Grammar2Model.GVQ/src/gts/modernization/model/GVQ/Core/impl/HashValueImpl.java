/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gts.modernization.model.GVQ.Core.impl;

import gts.modernization.model.GVQ.Core.CorePackage;
import gts.modernization.model.GVQ.Core.HashValue;
import gts.modernization.model.GVQ.Core.HashValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl#getFromElement <em>From Element</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl#getFromElementType <em>From Element Type</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl#getToElement <em>To Element</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl#getToElementType <em>To Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashValueImpl extends EObjectImpl implements HashValue {
	/**
	 * The default value of the '{@link #getFromElement() <em>From Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected String fromElement = FROM_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromElementType() <em>From Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElementType()
	 * @generated
	 * @ordered
	 */
	protected static final HashValueType FROM_ELEMENT_TYPE_EDEFAULT = HashValueType.VALUE;

	/**
	 * The cached value of the '{@link #getFromElementType() <em>From Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElementType()
	 * @generated
	 * @ordered
	 */
	protected HashValueType fromElementType = FROM_ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToElement() <em>To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected String toElement = TO_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToElementType() <em>To Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElementType()
	 * @generated
	 * @ordered
	 */
	protected static final HashValueType TO_ELEMENT_TYPE_EDEFAULT = HashValueType.VALUE;

	/**
	 * The cached value of the '{@link #getToElementType() <em>To Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElementType()
	 * @generated
	 * @ordered
	 */
	protected HashValueType toElementType = TO_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.HASH_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(String newFromElement) {
		String oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HASH_VALUE__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashValueType getFromElementType() {
		return fromElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElementType(HashValueType newFromElementType) {
		HashValueType oldFromElementType = fromElementType;
		fromElementType = newFromElementType == null ? FROM_ELEMENT_TYPE_EDEFAULT : newFromElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HASH_VALUE__FROM_ELEMENT_TYPE, oldFromElementType, fromElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(String newToElement) {
		String oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HASH_VALUE__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashValueType getToElementType() {
		return toElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElementType(HashValueType newToElementType) {
		HashValueType oldToElementType = toElementType;
		toElementType = newToElementType == null ? TO_ELEMENT_TYPE_EDEFAULT : newToElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HASH_VALUE__TO_ELEMENT_TYPE, oldToElementType, toElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.HASH_VALUE__FROM_ELEMENT:
				return getFromElement();
			case CorePackage.HASH_VALUE__FROM_ELEMENT_TYPE:
				return getFromElementType();
			case CorePackage.HASH_VALUE__TO_ELEMENT:
				return getToElement();
			case CorePackage.HASH_VALUE__TO_ELEMENT_TYPE:
				return getToElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.HASH_VALUE__FROM_ELEMENT:
				setFromElement((String)newValue);
				return;
			case CorePackage.HASH_VALUE__FROM_ELEMENT_TYPE:
				setFromElementType((HashValueType)newValue);
				return;
			case CorePackage.HASH_VALUE__TO_ELEMENT:
				setToElement((String)newValue);
				return;
			case CorePackage.HASH_VALUE__TO_ELEMENT_TYPE:
				setToElementType((HashValueType)newValue);
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
			case CorePackage.HASH_VALUE__FROM_ELEMENT:
				setFromElement(FROM_ELEMENT_EDEFAULT);
				return;
			case CorePackage.HASH_VALUE__FROM_ELEMENT_TYPE:
				setFromElementType(FROM_ELEMENT_TYPE_EDEFAULT);
				return;
			case CorePackage.HASH_VALUE__TO_ELEMENT:
				setToElement(TO_ELEMENT_EDEFAULT);
				return;
			case CorePackage.HASH_VALUE__TO_ELEMENT_TYPE:
				setToElementType(TO_ELEMENT_TYPE_EDEFAULT);
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
			case CorePackage.HASH_VALUE__FROM_ELEMENT:
				return FROM_ELEMENT_EDEFAULT == null ? fromElement != null : !FROM_ELEMENT_EDEFAULT.equals(fromElement);
			case CorePackage.HASH_VALUE__FROM_ELEMENT_TYPE:
				return fromElementType != FROM_ELEMENT_TYPE_EDEFAULT;
			case CorePackage.HASH_VALUE__TO_ELEMENT:
				return TO_ELEMENT_EDEFAULT == null ? toElement != null : !TO_ELEMENT_EDEFAULT.equals(toElement);
			case CorePackage.HASH_VALUE__TO_ELEMENT_TYPE:
				return toElementType != TO_ELEMENT_TYPE_EDEFAULT;
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
		result.append(" (fromElement: ");
		result.append(fromElement);
		result.append(", fromElementType: ");
		result.append(fromElementType);
		result.append(", toElement: ");
		result.append(toElement);
		result.append(", toElementType: ");
		result.append(toElementType);
		result.append(')');
		return result.toString();
	}

} //HashValueImpl
