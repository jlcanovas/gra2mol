/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.InstanceOf#getTo <em>To</em>}</li>
 *   <li>{@link kdm.code.InstanceOf#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getInstanceOf()
 * @model
 * @generated
 */
public interface InstanceOf extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TemplateUnit)
	 * @see kdm.code.CodePackage#getInstanceOf_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemplateUnit getTo();

	/**
	 * Sets the value of the '{@link kdm.code.InstanceOf#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TemplateUnit value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractCodeElement)
	 * @see kdm.code.CodePackage#getInstanceOf_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractCodeElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.code.InstanceOf#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractCodeElement value);

} // InstanceOf
