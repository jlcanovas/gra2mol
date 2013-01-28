/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;

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
 *   <li>{@link kdm.conceptual.ConceptualModel#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.conceptual.ConceptualPackage#getConceptualModel()
 * @model
 * @generated
 */
public interface ConceptualModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.conceptual.AbstractConceptualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Element</em>' containment reference list.
	 * @see kdm.conceptual.ConceptualPackage#getConceptualModel_ConceptualElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractConceptualElement> getConceptualElement();

} // ConceptualModel
