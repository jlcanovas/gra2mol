/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.ExtensionFamily#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.kdm.ExtensionFamily#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getExtensionFamily()
 * @model
 * @generated
 */
public interface ExtensionFamily extends Element {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getExtensionFamily_Stereotype()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Stereotype> getStereotype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kdm.kdm.KdmPackage#getExtensionFamily_Name()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kdm.kdm.ExtensionFamily#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ExtensionFamily
