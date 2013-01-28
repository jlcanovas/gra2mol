/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionComplexImpl.java,v 1.2 2008/01/14 09:19:41 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;

import gts.modernization.model.GVQ.Query.util.ExpressionVisitable;
import gts.modernization.model.GVQ.Query.util.ExpressionVisitor;
import gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl;

import gts.modernization.model.GVQ.Query.FilterExpression;
import gts.modernization.model.GVQ.Query.FilterExpressionComplex;
import gts.modernization.model.GVQ.Query.FilterExpressionType;
import gts.modernization.model.GVQ.Query.QueryPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExpressionComplexImpl extends FilterExpressionImpl implements FilterExpressionComplex {
	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterExpression> expressions;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterExpressionType TYPE_EDEFAULT = FilterExpressionType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FilterExpressionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterExpressionComplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_EXPRESSION_COMPLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<FilterExpression>(FilterExpression.class, this, QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpressionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FilterExpressionType newType) {
		FilterExpressionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FILTER_EXPRESSION_COMPLEX__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS:
				return getExpressions();
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__TYPE:
				return getType();
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
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends FilterExpression>)newValue);
				return;
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__TYPE:
				setType((FilterExpressionType)newValue);
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
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS:
				getExpressions().clear();
				return;
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__TYPE:
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
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case QueryPackage.FILTER_EXPRESSION_COMPLEX__TYPE:
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);		
	}

} //FilterExpressionComplexImpl
