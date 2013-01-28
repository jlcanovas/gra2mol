/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;

import kdm.action.EntryFlow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.ControlElement#getType <em>Type</em>}</li>
 *   <li>{@link kdm.code.ControlElement#getEntryFlow <em>Entry Flow</em>}</li>
 *   <li>{@link kdm.code.ControlElement#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getControlElement()
 * @model
 * @generated
 */
public interface ControlElement extends ComputationalObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Datatype)
	 * @see kdm.code.CodePackage#getControlElement_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link kdm.code.ControlElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Entry Flow</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.action.EntryFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Flow</em>' containment reference list.
	 * @see kdm.code.CodePackage#getControlElement_EntryFlow()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EntryFlow> getEntryFlow();

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.code.CodePackage#getControlElement_CodeElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCodeElement> getCodeElement();

} // ControlElement
