/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.UIEvent#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getUIEvent()
 * @model
 * @generated
 */
public interface UIEvent extends AbstractUIElement {
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
	 * @see kdm.ui.UiPackage#getUIEvent_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.ui.UIEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // UIEvent
