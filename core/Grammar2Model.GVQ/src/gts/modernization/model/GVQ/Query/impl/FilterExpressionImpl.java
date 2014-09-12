/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionImpl.java,v 1.1 2008/01/14 09:18:28 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;

import gts.modernization.model.GVQ.Query.FilterExpression;
import gts.modernization.model.GVQ.Query.QueryPackage;
import gts.modernization.model.GVQ.Query.util.ExpressionVisitable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FilterExpressionImpl extends EObjectImpl implements FilterExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FILTER_EXPRESSION;
	}

} //FilterExpressionImpl
