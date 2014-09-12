/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.DefinedType#getType <em>Type</em>}</li>
 *   <li>{@link kdm.code.DefinedType#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getDefinedType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DefinedType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Datatype)
	 * @see kdm.code.CodePackage#getDefinedType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link kdm.code.DefinedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference.
	 * @see #setCodeElement(Datatype)
	 * @see kdm.code.CodePackage#getDefinedType_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Datatype getCodeElement();

	/**
	 * Sets the value of the '{@link kdm.code.DefinedType#getCodeElement <em>Code Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Element</em>' containment reference.
	 * @see #getCodeElement()
	 * @generated
	 */
	void setCodeElement(Datatype value);

} // DefinedType
