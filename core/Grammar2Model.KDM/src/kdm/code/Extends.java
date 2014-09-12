/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.Extends#getTo <em>To</em>}</li>
 *   <li>{@link kdm.code.Extends#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getExtends()
 * @model
 * @generated
 */
public interface Extends extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Datatype)
	 * @see kdm.code.CodePackage#getExtends_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getTo();

	/**
	 * Sets the value of the '{@link kdm.code.Extends#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Datatype value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Datatype)
	 * @see kdm.code.CodePackage#getExtends_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getFrom();

	/**
	 * Sets the value of the '{@link kdm.code.Extends#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Datatype value);

} // Extends
