/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;

import kdm.action.ActionElement;

import kdm.source.Image;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displays Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.DisplaysImage#getTo <em>To</em>}</li>
 *   <li>{@link kdm.ui.DisplaysImage#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getDisplaysImage()
 * @model
 * @generated
 */
public interface DisplaysImage extends AbstractUIRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Image)
	 * @see kdm.ui.UiPackage#getDisplaysImage_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Image getTo();

	/**
	 * Sets the value of the '{@link kdm.ui.DisplaysImage#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Image value);

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
	 * @see kdm.ui.UiPackage#getDisplaysImage_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.ui.DisplaysImage#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

} // DisplaysImage
