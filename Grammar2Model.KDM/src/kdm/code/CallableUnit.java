/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.CallableUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getCallableUnit()
 * @model
 * @generated
 */
public interface CallableUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.CallableKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.CallableKind
	 * @see #setKind(CallableKind)
	 * @see kdm.code.CodePackage#getCallableUnit_Kind()
	 * @model
	 * @generated
	 */
	CallableKind getKind();

	/**
	 * Sets the value of the '{@link kdm.code.CallableUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.CallableKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CallableKind value);

} // CallableUnit
