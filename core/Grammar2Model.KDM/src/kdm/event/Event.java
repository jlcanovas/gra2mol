/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.event.Event#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.event.EventPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends AbstractEventElement {
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
	 * @see kdm.event.EventPackage#getEvent_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.event.Event#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // Event
