/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.UILayout#getTo <em>To</em>}</li>
 *   <li>{@link kdm.ui.UILayout#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getUILayout()
 * @model
 * @generated
 */
public interface UILayout extends AbstractUIRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(UIResource)
	 * @see kdm.ui.UiPackage#getUILayout_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UIResource getTo();

	/**
	 * Sets the value of the '{@link kdm.ui.UILayout#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(UIResource value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(UIResource)
	 * @see kdm.ui.UiPackage#getUILayout_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UIResource getFrom();

	/**
	 * Sets the value of the '{@link kdm.ui.UILayout#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(UIResource value);

} // UILayout
