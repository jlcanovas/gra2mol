/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.ReferenceTo#getTo <em>To</em>}</li>
 *   <li>{@link kdm.data.ReferenceTo#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getReferenceTo()
 * @model
 * @generated
 */
public interface ReferenceTo extends AbstractDataRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ContentItem)
	 * @see kdm.data.DataPackage#getReferenceTo_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContentItem getTo();

	/**
	 * Sets the value of the '{@link kdm.data.ReferenceTo#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ContentItem value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ContentItem)
	 * @see kdm.data.DataPackage#getReferenceTo_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContentItem getFrom();

	/**
	 * Sets the value of the '{@link kdm.data.ReferenceTo#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ContentItem value);

} // ReferenceTo
