/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.DataContainer#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getDataContainer()
 * @model
 * @generated
 */
public interface DataContainer extends DataResource {
	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.data.DataResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference list.
	 * @see kdm.data.DataPackage#getDataContainer_DataElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataResource> getDataElement();

} // DataContainer
