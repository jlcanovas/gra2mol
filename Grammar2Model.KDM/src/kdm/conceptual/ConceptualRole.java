/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.conceptual.ConceptualRole#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.conceptual.ConceptualPackage#getConceptualRole()
 * @model
 * @generated
 */
public interface ConceptualRole extends AbstractConceptualElement {
	/**
	 * Returns the value of the '<em><b>Conceptual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Element</em>' reference.
	 * @see #setConceptualElement(AbstractConceptualElement)
	 * @see kdm.conceptual.ConceptualPackage#getConceptualRole_ConceptualElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractConceptualElement getConceptualElement();

	/**
	 * Sets the value of the '{@link kdm.conceptual.ConceptualRole#getConceptualElement <em>Conceptual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual Element</em>' reference.
	 * @see #getConceptualElement()
	 * @generated
	 */
	void setConceptualElement(AbstractConceptualElement value);

} // ConceptualRole
