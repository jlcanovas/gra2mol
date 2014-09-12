/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;

import kdm.action.ActionElement;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Conceptual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.conceptual.AbstractConceptualElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.conceptual.AbstractConceptualElement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.conceptual.AbstractConceptualElement#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link kdm.conceptual.AbstractConceptualElement#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.conceptual.ConceptualPackage#getAbstractConceptualElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractConceptualElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.conceptual.AbstractConceptualRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Relation</em>' containment reference list.
	 * @see kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_ConceptualRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractConceptualRelationship> getConceptualRelation();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' containment reference list.
	 * @see kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Abstraction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

} // AbstractConceptualElement
