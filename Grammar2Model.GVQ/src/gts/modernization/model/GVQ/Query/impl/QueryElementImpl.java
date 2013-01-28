/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryElementImpl.java,v 1.1 2008/01/14 09:18:29 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;

import gts.modernization.model.GVQ.Query.QueryElement;
import gts.modernization.model.GVQ.Query.QueryElementType;
import gts.modernization.model.GVQ.Query.QueryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.QueryElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.QueryElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.QueryElementImpl#isMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryElementImpl extends EObjectImpl implements QueryElement {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QueryElementType TYPE_EDEFAULT = QueryElementType.NODE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QueryElementType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMark()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMark()
	 * @generated
	 * @ordered
	 */
	protected boolean mark = MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QueryElementType newType) {
		QueryElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMark() {
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMark(boolean newMark) {
		boolean oldMark = mark;
		mark = newMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_ELEMENT__MARK, oldMark, mark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.QUERY_ELEMENT__NAME:
				return getName();
			case QueryPackage.QUERY_ELEMENT__TYPE:
				return getType();
			case QueryPackage.QUERY_ELEMENT__MARK:
				return isMark() ? Boolean.TRUE : Boolean.FALSE;
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
			case QueryPackage.QUERY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case QueryPackage.QUERY_ELEMENT__TYPE:
				setType((QueryElementType)newValue);
				return;
			case QueryPackage.QUERY_ELEMENT__MARK:
				setMark(((Boolean)newValue).booleanValue());
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
			case QueryPackage.QUERY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueryPackage.QUERY_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QueryPackage.QUERY_ELEMENT__MARK:
				setMark(MARK_EDEFAULT);
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
			case QueryPackage.QUERY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.QUERY_ELEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case QueryPackage.QUERY_ELEMENT__MARK:
				return mark != MARK_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", mark: ");
		result.append(mark);
		result.append(')');
		return result.toString();
	}

} //QueryElementImpl
