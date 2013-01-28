/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryUnit.java,v 1.1 2008/01/14 09:18:30 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryUnit#getVariable <em>Variable</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryUnit#getCast <em>Cast</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryUnit#getFilter <em>Filter</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryUnit#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryUnit()
 * @model
 * @generated
 */
public interface QueryUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryUnit_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryUnit#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' attribute.
	 * @see #setCast(String)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryUnit_Cast()
	 * @model
	 * @generated
	 */
	String getCast();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryUnit#getCast <em>Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast</em>' attribute.
	 * @see #getCast()
	 * @generated
	 */
	void setCast(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterUnit)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryUnit_Filter()
	 * @model containment="true"
	 * @generated
	 */
	FilterUnit getFilter();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryUnit#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterUnit value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(QueryControl)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryUnit_Control()
	 * @model containment="true"
	 * @generated
	 */
	QueryControl getControl();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryUnit#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(QueryControl value);

} // QueryUnit
