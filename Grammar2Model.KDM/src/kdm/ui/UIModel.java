/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.UIModel#getUIElement <em>UI Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getUIModel()
 * @model
 * @generated
 */
public interface UIModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>UI Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.ui.AbstractUIElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Element</em>' containment reference list.
	 * @see kdm.ui.UiPackage#getUIModel_UIElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractUIElement> getUIElement();

} // UIModel
