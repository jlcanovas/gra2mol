/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

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
 *   <li>{@link kdm.data.DataModel#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.data.AbstractDataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference list.
	 * @see kdm.data.DataPackage#getDataModel_DataElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractDataElement> getDataElement();

} // DataModel
