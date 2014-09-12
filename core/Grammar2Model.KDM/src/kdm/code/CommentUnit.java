/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;

import kdm.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.CommentUnit#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getCommentUnit()
 * @model
 * @generated
 */
public interface CommentUnit extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see kdm.code.CodePackage#getCommentUnit_Text()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link kdm.code.CommentUnit#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CommentUnit
