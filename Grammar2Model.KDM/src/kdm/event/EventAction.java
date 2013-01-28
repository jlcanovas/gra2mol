/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.event.EventAction#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.event.EventAction#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.event.EventPackage#getEventAction()
 * @model
 * @generated
 */
public interface EventAction extends AbstractEventElement {
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
	 * @see kdm.event.EventPackage#getEventAction_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.event.EventAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Event Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.event.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Element</em>' containment reference list.
	 * @see kdm.event.EventPackage#getEventAction_EventElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Event> getEventElement();

} // EventAction
