/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.SequenceType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends DerivedType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see kdm.code.CodePackage#getSequenceType_Size()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link kdm.code.SequenceType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // SequenceType
