/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterExpressionUnit.java,v 1.3 2008/01/14 09:21:04 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import gts.modernization.model.GVQ.Core.Parameter;
import gts.modernization.model.GVQ.Query.util.ExpressionVisitable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getElement <em>Element</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getOperation <em>Operation</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#isGlobal <em>Global</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionUnit()
 * @model
 * @generated
 */
public interface FilterExpressionUnit extends FilterExpression {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(ExpressionElement)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionUnit_Element()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionElement getElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.GVQ.Query.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.OperationType
	 * @see #setOperation(OperationType)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionUnit_Operation()
	 * @model
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.OperationType
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(boolean)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionUnit_Global()
	 * @model
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.GVQ.Core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getFilterExpressionUnit_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // FilterExpressionUnit
