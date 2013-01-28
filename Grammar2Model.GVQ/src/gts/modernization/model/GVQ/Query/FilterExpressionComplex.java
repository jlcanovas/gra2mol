/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionComplex.java,v 1.3 2008/01/14 09:21:04 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import gts.modernization.model.GVQ.Query.util.ExpressionVisitable;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionComplex()
 * @model
 * @generated
 */
public interface FilterExpressionComplex extends FilterExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.GVQ.Query.FilterExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionComplex_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.GVQ.Query.FilterExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionType
	 * @see #setType(FilterExpressionType)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionComplex_Type()
	 * @model
	 * @generated
	 */
	FilterExpressionType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionType
	 * @see #getType()
	 * @generated
	 */
	void setType(FilterExpressionType value);

} // FilterExpressionComplex
