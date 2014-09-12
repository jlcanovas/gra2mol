/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.structure;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Structure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.structure.AbstractStructureElement#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link kdm.structure.AbstractStructureElement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.structure.AbstractStructureElement#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link kdm.structure.AbstractStructureElement#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.structure.StructurePackage#getAbstractStructureElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractStructureElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Aggregated</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.core.AggregatedRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated</em>' containment reference list.
	 * @see kdm.structure.StructurePackage#getAbstractStructureElement_Aggregated()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AggregatedRelationship> getAggregated();

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
	 * @see kdm.structure.StructurePackage#getAbstractStructureElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Structure Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.structure.AbstractStructureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Element</em>' containment reference list.
	 * @see kdm.structure.StructurePackage#getAbstractStructureElement_StructureElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureElement> getStructureElement();

	/**
	 * Returns the value of the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.structure.AbstractStructureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Relationship</em>' containment reference list.
	 * @see kdm.structure.StructurePackage#getAbstractStructureElement_StructureRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureRelationship> getStructureRelationship();

} // AbstractStructureElement
