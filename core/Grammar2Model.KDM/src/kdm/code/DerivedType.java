/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.DerivedType#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getDerivedType()
 * @model
 * @generated
 */
public interface DerivedType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Unit</em>' containment reference.
	 * @see #setItemUnit(ItemUnit)
	 * @see kdm.code.CodePackage#getDerivedType_ItemUnit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ItemUnit getItemUnit();

	/**
	 * Sets the value of the '{@link kdm.code.DerivedType#getItemUnit <em>Item Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Unit</em>' containment reference.
	 * @see #getItemUnit()
	 * @generated
	 */
	void setItemUnit(ItemUnit value);

} // DerivedType
