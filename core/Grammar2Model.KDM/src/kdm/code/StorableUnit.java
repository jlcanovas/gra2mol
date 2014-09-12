/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.StorableUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getStorableUnit()
 * @model
 * @generated
 */
public interface StorableUnit extends DataElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.StorableKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.StorableKind
	 * @see #setKind(StorableKind)
	 * @see kdm.code.CodePackage#getStorableUnit_Kind()
	 * @model
	 * @generated
	 */
	StorableKind getKind();

	/**
	 * Sets the value of the '{@link kdm.code.StorableUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.StorableKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StorableKind value);

} // StorableUnit
