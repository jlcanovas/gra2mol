/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.event.EventModel#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.event.EventPackage#getEventModel()
 * @model
 * @generated
 */
public interface EventModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Event Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.event.AbstractEventElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Element</em>' containment reference list.
	 * @see kdm.event.EventPackage#getEventModel_EventElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractEventElement> getEventElement();

} // EventModel
