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
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.Stereotype#getTag <em>Tag</em>}</li>
 *   <li>{@link kdm.kdm.Stereotype#getName <em>Name</em>}</li>
 *   <li>{@link kdm.kdm.Stereotype#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends Element {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.TagDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getStereotype_Tag()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TagDefinition> getTag();

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
	 * @see kdm.kdm.KdmPackage#getStereotype_Name()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kdm.kdm.Stereotype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see kdm.kdm.KdmPackage#getStereotype_Type()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link kdm.kdm.Stereotype#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Stereotype
