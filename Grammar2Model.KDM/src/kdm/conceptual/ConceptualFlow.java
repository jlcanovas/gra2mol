/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.conceptual.ConceptualFlow#getTo <em>To</em>}</li>
 *   <li>{@link kdm.conceptual.ConceptualFlow#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.conceptual.ConceptualPackage#getConceptualFlow()
 * @model
 * @generated
 */
public interface ConceptualFlow extends AbstractConceptualRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ConceptualContainer)
	 * @see kdm.conceptual.ConceptualPackage#getConceptualFlow_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConceptualContainer getTo();

	/**
	 * Sets the value of the '{@link kdm.conceptual.ConceptualFlow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ConceptualContainer value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ConceptualContainer)
	 * @see kdm.conceptual.ConceptualPackage#getConceptualFlow_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConceptualContainer getFrom();

	/**
	 * Sets the value of the '{@link kdm.conceptual.ConceptualFlow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ConceptualContainer value);

} // ConceptualFlow
