/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionUnitImpl.java,v 1.2 2008/01/14 09:19:40 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;


import gts.modernization.model.GVQ.Core.Parameter;
import gts.modernization.model.GVQ.Query.ExpressionElement;
import gts.modernization.model.GVQ.Query.util.ExpressionVisitable;
import gts.modernization.model.GVQ.Query.util.ExpressionVisitor;
import gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl;

import gts.modernization.model.GVQ.Query.FilterExpressionType;
import gts.modernization.model.GVQ.Query.FilterExpressionUnit;
import gts.modernization.model.GVQ.Query.OperationType;
import gts.modernization.model.GVQ.Query.QueryElement;
import gts.modernization.model.GVQ.Query.QueryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl#getElement <em>Element</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl#isGlobal <em>Global</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExpressionUnitImpl extends FilterExpressionImpl implements FilterExpressionUnit {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ExpressionElement element;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType OPERATION_EDEFAULT = OperationType.EQUALS;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationType operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobal()
	 * @generated
	 * @ordered
	 */
	protected boolean global = GLOBAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterExpressionUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_EXPRESSION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElement getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(ExpressionElement newElement, NotificationChain msgs) {
		ExpressionElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ExpressionElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(OperationType newOperation) {
		OperationType oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_EXPRESSION_UNIT__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(boolean newGlobal) {
		boolean oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_EXPRESSION_UNIT__GLOBAL, oldGlobal, global));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT:
				return basicSetElement(null, msgs);
			case QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT:
				return getElement();
			case QueryPackage.FILTER_EXPRESSION_UNIT__OPERATION:
				return getOperation();
			case QueryPackage.FILTER_EXPRESSION_UNIT__GLOBAL:
				return isGlobal() ? Boolean.TRUE : Boolean.FALSE;
			case QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS:
				return getParameters();
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
			case QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT:
				setElement((ExpressionElement)newValue);
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__OPERATION:
				setOperation((OperationType)newValue);
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__GLOBAL:
				setGlobal(((Boolean)newValue).booleanValue());
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT:
				setElement((ExpressionElement)null);
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__GLOBAL:
				setGlobal(GLOBAL_EDEFAULT);
				return;
			case QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS:
				getParameters().clear();
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
			case QueryPackage.FILTER_EXPRESSION_UNIT__ELEMENT:
				return element != null;
			case QueryPackage.FILTER_EXPRESSION_UNIT__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case QueryPackage.FILTER_EXPRESSION_UNIT__GLOBAL:
				return global != GLOBAL_EDEFAULT;
			case QueryPackage.FILTER_EXPRESSION_UNIT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(", global: ");
		result.append(global);
		result.append(')');
		return result.toString();
	}

	@Override
	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);		
	}

} //FilterExpressionUnitImpl
