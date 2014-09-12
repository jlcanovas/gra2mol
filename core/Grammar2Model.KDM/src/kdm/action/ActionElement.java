/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action;

import kdm.code.AbstractCodeElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.action.ActionElement#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.action.ActionElement#getCodeElement <em>Code Element</em>}</li>
 *   <li>{@link kdm.action.ActionElement#getActionRelation <em>Action Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.action.ActionPackage#getActionElement()
 * @model
 * @generated
 */
public interface ActionElement extends AbstractCodeElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see kdm.action.ActionPackage#getActionElement_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.action.ActionElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.action.ActionPackage#getActionElement_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getCodeElement();

	/**
	 * Returns the value of the '<em><b>Action Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.action.AbstractActionRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Relation</em>' containment reference list.
	 * @see kdm.action.ActionPackage#getActionElement_ActionRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActionRelationship> getActionRelation();

} // ActionElement
