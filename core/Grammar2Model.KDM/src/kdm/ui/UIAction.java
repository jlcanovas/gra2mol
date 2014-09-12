/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.UIAction#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.ui.UIAction#getUIElement <em>UI Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getUIAction()
 * @model
 * @generated
 */
public interface UIAction extends AbstractUIElement {
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
	 * @see kdm.ui.UiPackage#getUIAction_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.ui.UIAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>UI Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.ui.UIEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Element</em>' containment reference list.
	 * @see kdm.ui.UiPackage#getUIAction_UIElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UIEvent> getUIElement();

} // UIAction
