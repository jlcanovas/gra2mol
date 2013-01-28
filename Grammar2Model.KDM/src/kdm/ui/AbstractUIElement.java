/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract UI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.ui.AbstractUIElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.ui.AbstractUIElement#getUIRelation <em>UI Relation</em>}</li>
 *   <li>{@link kdm.ui.AbstractUIElement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.ui.AbstractUIElement#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.ui.UiPackage#getAbstractUIElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractUIElement extends KDMEntity {
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
	 * @see kdm.ui.UiPackage#getAbstractUIElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>UI Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.ui.AbstractUIRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Relation</em>' containment reference list.
	 * @see kdm.ui.UiPackage#getAbstractUIElement_UIRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractUIRelationship> getUIRelation();

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
	 * @see kdm.ui.UiPackage#getAbstractUIElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getImplementation();

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
	 * @see kdm.ui.UiPackage#getAbstractUIElement_Abstraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

} // AbstractUIElement
