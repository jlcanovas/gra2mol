/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.ExtensionTo#getTo <em>To</em>}</li>
 *   <li>{@link kdm.data.ExtensionTo#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getExtensionTo()
 * @model
 * @generated
 */
public interface ExtensionTo extends AbstractDataRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ComplexContentType)
	 * @see kdm.data.DataPackage#getExtensionTo_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComplexContentType getTo();

	/**
	 * Sets the value of the '{@link kdm.data.ExtensionTo#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ComplexContentType value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ComplexContentType)
	 * @see kdm.data.DataPackage#getExtensionTo_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComplexContentType getFrom();

	/**
	 * Sets the value of the '{@link kdm.data.ExtensionTo#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ComplexContentType value);

} // ExtensionTo
