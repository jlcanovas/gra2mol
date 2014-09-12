/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gts.modernization.model.GVQ.Core.impl;

import gts.modernization.model.GVQ.Core.CorePackage;
import gts.modernization.model.GVQ.Core.Parameter;
import gts.modernization.model.GVQ.Core.ParameterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl#getValuePosition <em>Value Position</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl#getExtensionPosition <em>Extension Position</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValuePosition() <em>Value Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuePosition() <em>Value Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePosition()
	 * @generated
	 * @ordered
	 */
	protected String valuePosition = VALUE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionPosition() <em>Extension Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionPosition() <em>Extension Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPosition()
	 * @generated
	 * @ordered
	 */
	protected String extensionPosition = EXTENSION_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.STRING_VALUE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuePosition() {
		return valuePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePosition(String newValuePosition) {
		String oldValuePosition = valuePosition;
		valuePosition = newValuePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER__VALUE_POSITION, oldValuePosition, valuePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionPosition() {
		return extensionPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPosition(String newExtensionPosition) {
		String oldExtensionPosition = extensionPosition;
		extensionPosition = newExtensionPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER__EXTENSION_POSITION, oldExtensionPosition, extensionPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PARAMETER__VALUE:
				return getValue();
			case CorePackage.PARAMETER__VALUE_POSITION:
				return getValuePosition();
			case CorePackage.PARAMETER__EXTENSION:
				return getExtension();
			case CorePackage.PARAMETER__EXTENSION_POSITION:
				return getExtensionPosition();
			case CorePackage.PARAMETER__TYPE:
				return getType();
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
			case CorePackage.PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case CorePackage.PARAMETER__VALUE_POSITION:
				setValuePosition((String)newValue);
				return;
			case CorePackage.PARAMETER__EXTENSION:
				setExtension((String)newValue);
				return;
			case CorePackage.PARAMETER__EXTENSION_POSITION:
				setExtensionPosition((String)newValue);
				return;
			case CorePackage.PARAMETER__TYPE:
				setType((ParameterType)newValue);
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
			case CorePackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CorePackage.PARAMETER__VALUE_POSITION:
				setValuePosition(VALUE_POSITION_EDEFAULT);
				return;
			case CorePackage.PARAMETER__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case CorePackage.PARAMETER__EXTENSION_POSITION:
				setExtensionPosition(EXTENSION_POSITION_EDEFAULT);
				return;
			case CorePackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CorePackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CorePackage.PARAMETER__VALUE_POSITION:
				return VALUE_POSITION_EDEFAULT == null ? valuePosition != null : !VALUE_POSITION_EDEFAULT.equals(valuePosition);
			case CorePackage.PARAMETER__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case CorePackage.PARAMETER__EXTENSION_POSITION:
				return EXTENSION_POSITION_EDEFAULT == null ? extensionPosition != null : !EXTENSION_POSITION_EDEFAULT.equals(extensionPosition);
			case CorePackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", valuePosition: ");
		result.append(valuePosition);
		result.append(", extension: ");
		result.append(extension);
		result.append(", extensionPosition: ");
		result.append(extensionPosition);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
