/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action;

import kdm.code.ControlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.action.Calls#getTo <em>To</em>}</li>
 *   <li>{@link kdm.action.Calls#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.action.ActionPackage#getCalls()
 * @model
 * @generated
 */
public interface Calls extends AbstractActionRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ControlElement)
	 * @see kdm.action.ActionPackage#getCalls_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControlElement getTo();

	/**
	 * Sets the value of the '{@link kdm.action.Calls#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ControlElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ActionElement)
	 * @see kdm.action.ActionPackage#getCalls_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.action.Calls#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

} // Calls
