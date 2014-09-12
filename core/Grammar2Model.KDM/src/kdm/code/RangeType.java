/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.RangeType#getLower <em>Lower</em>}</li>
 *   <li>{@link kdm.code.RangeType#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getRangeType()
 * @model
 * @generated
 */
public interface RangeType extends DerivedType {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see kdm.code.CodePackage#getRangeType_Lower()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link kdm.code.RangeType#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see kdm.code.CodePackage#getRangeType_Upper()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link kdm.code.RangeType#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

} // RangeType
