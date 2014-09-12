/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.action.ActionElement;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.AbstractDataElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.data.AbstractDataElement#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link kdm.data.AbstractDataElement#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getAbstractDataElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractDataElement extends KDMEntity {
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
	 * @see kdm.data.DataPackage#getAbstractDataElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Data Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.data.AbstractDataRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Relation</em>' containment reference list.
	 * @see kdm.data.DataPackage#getAbstractDataElement_DataRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractDataRelationship> getDataRelation();

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
	 * @see kdm.data.DataPackage#getAbstractDataElement_Abstraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

} // AbstractDataElement
