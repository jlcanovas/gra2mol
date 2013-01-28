/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.ExtendedValue#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getExtendedValue()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExtendedValue extends Element {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(TagDefinition)
	 * @see kdm.kdm.KdmPackage#getExtendedValue_Tag()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TagDefinition getTag();

	/**
	 * Sets the value of the '{@link kdm.kdm.ExtendedValue#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagDefinition value);

} // ExtendedValue
