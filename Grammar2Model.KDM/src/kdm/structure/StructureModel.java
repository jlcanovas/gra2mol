/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.structure;

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
 *   <li>{@link kdm.structure.StructureModel#getStructureElement <em>Structure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.structure.StructurePackage#getStructureModel()
 * @model
 * @generated
 */
public interface StructureModel extends KDMModel {
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
	 * @see kdm.structure.StructurePackage#getStructureModel_StructureElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureElement> getStructureElement();

} // StructureModel
