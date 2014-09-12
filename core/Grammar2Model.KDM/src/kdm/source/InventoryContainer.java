/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.InventoryContainer#getInventoryElement <em>Inventory Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getInventoryContainer()
 * @model
 * @generated
 */
public interface InventoryContainer extends AbstractInventoryElement {
	/**
	 * Returns the value of the '<em><b>Inventory Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.AbstractInventoryElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Element</em>' containment reference list.
	 * @see kdm.source.SourcePackage#getInventoryContainer_InventoryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractInventoryElement> getInventoryElement();

} // InventoryContainer
