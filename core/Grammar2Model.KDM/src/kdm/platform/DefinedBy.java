/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

import kdm.action.AbstractActionRelationship;
import kdm.action.ActionElement;

import kdm.code.CodeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.DefinedBy#getTo <em>To</em>}</li>
 *   <li>{@link kdm.platform.DefinedBy#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getDefinedBy()
 * @model
 * @generated
 */
public interface DefinedBy extends AbstractActionRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CodeItem)
	 * @see kdm.platform.PlatformPackage#getDefinedBy_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CodeItem getTo();

	/**
	 * Sets the value of the '{@link kdm.platform.DefinedBy#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CodeItem value);

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
	 * @see kdm.platform.PlatformPackage#getDefinedBy_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.platform.DefinedBy#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

} // DefinedBy
