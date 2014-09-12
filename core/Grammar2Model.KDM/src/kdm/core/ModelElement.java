/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.core;

import kdm.kdm.ExtendedValue;
import kdm.kdm.Stereotype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.core.ModelElement#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.core.ModelElement#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.core.CorePackage#getModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelElement extends Element {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' reference list.
	 * The list contents are of type {@link kdm.kdm.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' reference list.
	 * @see kdm.core.CorePackage#getModelElement_Stereotype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Stereotype> getStereotype();

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.ExtendedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see kdm.core.CorePackage#getModelElement_TaggedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtendedValue> getTaggedValue();

} // ModelElement
