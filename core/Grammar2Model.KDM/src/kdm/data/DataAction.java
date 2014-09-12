/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.action.ActionElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.DataAction#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.data.DataAction#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.data.DataAction#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getDataAction()
 * @model
 * @generated
 */
public interface DataAction extends AbstractDataElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see kdm.data.DataPackage#getDataAction_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.data.DataAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see kdm.data.DataPackage#getDataAction_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActionElement> getImplementation();

	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.data.DataEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference list.
	 * @see kdm.data.DataPackage#getDataAction_DataElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataEvent> getDataElement();

} // DataAction
