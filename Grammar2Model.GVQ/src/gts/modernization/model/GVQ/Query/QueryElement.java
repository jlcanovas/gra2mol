/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryElement.java,v 1.1 2008/01/14 09:18:30 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryElement#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryElement#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Query.QueryElement#isMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryElement()
 * @model
 * @generated
 */
public interface QueryElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.GVQ.Query.QueryElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.QueryElementType
	 * @see #setType(QueryElementType)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryElement_Type()
	 * @model
	 * @generated
	 */
	QueryElementType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Query.QueryElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(QueryElementType value);

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' attribute.
	 * @see #setMark(boolean)
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#getQueryElement_Mark()
	 * @model
	 * @generated
	 */
	boolean isMark();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Query.QueryElement#isMark <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' attribute.
	 * @see #isMark()
	 * @generated
	 */
	void setMark(boolean value);

} // QueryElement
