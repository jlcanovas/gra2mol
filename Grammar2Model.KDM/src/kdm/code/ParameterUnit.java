/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.ParameterUnit#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.code.ParameterUnit#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getParameterUnit()
 * @model
 * @generated
 */
public interface ParameterUnit extends DataElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.ParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.ParameterKind
	 * @see #setKind(ParameterKind)
	 * @see kdm.code.CodePackage#getParameterUnit_Kind()
	 * @model
	 * @generated
	 */
	ParameterKind getKind();

	/**
	 * Sets the value of the '{@link kdm.code.ParameterUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.ParameterKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ParameterKind value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(Integer)
	 * @see kdm.code.CodePackage#getParameterUnit_Pos()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getPos();

	/**
	 * Sets the value of the '{@link kdm.code.ParameterUnit#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Integer value);

} // ParameterUnit
