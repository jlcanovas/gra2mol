/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.UIFlow#getTo <em>To</em>}</li>
 *   <li>{@link kdm.ui.UIFlow#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getUIFlow()
 * @model
 * @generated
 */
public interface UIFlow extends AbstractUIRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractUIElement)
	 * @see kdm.ui.UiPackage#getUIFlow_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractUIElement getTo();

	/**
	 * Sets the value of the '{@link kdm.ui.UIFlow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractUIElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractUIElement)
	 * @see kdm.ui.UiPackage#getUIFlow_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractUIElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.ui.UIFlow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractUIElement value);

} // UIFlow
