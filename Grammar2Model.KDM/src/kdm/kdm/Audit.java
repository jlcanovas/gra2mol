/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.Audit#getDescription <em>Description</em>}</li>
 *   <li>{@link kdm.kdm.Audit#getAuthor <em>Author</em>}</li>
 *   <li>{@link kdm.kdm.Audit#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getAudit()
 * @model
 * @generated
 */
public interface Audit extends Element {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see kdm.kdm.KdmPackage#getAudit_Description()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link kdm.kdm.Audit#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see kdm.kdm.KdmPackage#getAudit_Author()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link kdm.kdm.Audit#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see kdm.kdm.KdmPackage#getAudit_Date()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link kdm.kdm.Audit#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

} // Audit
