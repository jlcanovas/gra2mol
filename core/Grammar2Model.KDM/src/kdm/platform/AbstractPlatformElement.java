/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Platform Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.AbstractPlatformElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.platform.AbstractPlatformElement#getRelation <em>Relation</em>}</li>
 *   <li>{@link kdm.platform.AbstractPlatformElement#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.platform.AbstractPlatformElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getAbstractPlatformElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractPlatformElement extends KDMEntity {
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
	 * @see kdm.platform.PlatformPackage#getAbstractPlatformElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.platform.AbstractPlatformRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see kdm.platform.PlatformPackage#getAbstractPlatformElement_Relation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractPlatformRelationship> getRelation();

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
	 * @see kdm.platform.PlatformPackage#getAbstractPlatformElement_Abstraction()
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
	 * @see kdm.platform.PlatformPackage#getAbstractPlatformElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getImplementation();

} // AbstractPlatformElement
