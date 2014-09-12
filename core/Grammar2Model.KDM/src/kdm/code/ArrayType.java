/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.ArrayType#getSize <em>Size</em>}</li>
 *   <li>{@link kdm.code.ArrayType#getIndexUnit <em>Index Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends DerivedType {
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
	 * @see kdm.code.CodePackage#getArrayType_Size()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link kdm.code.ArrayType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Index Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Unit</em>' containment reference.
	 * @see #setIndexUnit(IndexUnit)
	 * @see kdm.code.CodePackage#getArrayType_IndexUnit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IndexUnit getIndexUnit();

	/**
	 * Sets the value of the '{@link kdm.code.ArrayType#getIndexUnit <em>Index Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Unit</em>' containment reference.
	 * @see #getIndexUnit()
	 * @generated
	 */
	void setIndexUnit(IndexUnit value);

} // ArrayType
