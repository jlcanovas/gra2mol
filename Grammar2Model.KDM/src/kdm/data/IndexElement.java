/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.code.ItemUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.IndexElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getIndexElement()
 * @model
 * @generated
 */
public interface IndexElement extends DataResource {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link kdm.code.ItemUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see kdm.data.DataPackage#getIndexElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ItemUnit> getImplementation();

} // IndexElement
