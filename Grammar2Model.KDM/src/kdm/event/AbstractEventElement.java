/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Event Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.event.AbstractEventElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.event.AbstractEventElement#getEventRelation <em>Event Relation</em>}</li>
 *   <li>{@link kdm.event.AbstractEventElement#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.event.AbstractEventElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.event.EventPackage#getAbstractEventElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractEventElement extends KDMEntity {
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
	 * @see kdm.event.EventPackage#getAbstractEventElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Event Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.event.AbstractEventRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Relation</em>' containment reference list.
	 * @see kdm.event.EventPackage#getAbstractEventElement_EventRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractEventRelationship> getEventRelation();

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
	 * @see kdm.event.EventPackage#getAbstractEventElement_Abstraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see kdm.event.EventPackage#getAbstractEventElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getImplementation();

} // AbstractEventElement
