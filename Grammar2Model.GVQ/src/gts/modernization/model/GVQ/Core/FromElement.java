/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gts.modernization.model.GVQ.Core;

import gts.modernization.model.GVQ.Query.FilterUnit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.FromElement#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.FromElement#getFilter <em>Filter</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.FromElement#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Core.CorePackage#getFromElement()
 * @model
 * @generated
 */
public interface FromElement extends EObject {
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
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getFromElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.FromElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterUnit)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getFromElement_Filter()
	 * @model containment="true"
	 * @generated
	 */
	FilterUnit getFilter();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.FromElement#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterUnit value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getFromElement_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.FromElement#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // FromElement
