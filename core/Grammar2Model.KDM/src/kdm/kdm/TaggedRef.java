/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.TaggedRef#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getTaggedRef()
 * @model
 * @generated
 */
public interface TaggedRef extends ExtendedValue {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ModelElement)
	 * @see kdm.kdm.KdmPackage#getTaggedRef_Reference()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelElement getReference();

	/**
	 * Sets the value of the '{@link kdm.kdm.TaggedRef#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ModelElement value);

} // TaggedRef
