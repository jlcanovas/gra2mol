/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.KeyRelation#getTo <em>To</em>}</li>
 *   <li>{@link kdm.data.KeyRelation#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getKeyRelation()
 * @model
 * @generated
 */
public interface KeyRelation extends AbstractDataRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(UniqueKey)
	 * @see kdm.data.DataPackage#getKeyRelation_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UniqueKey getTo();

	/**
	 * Sets the value of the '{@link kdm.data.KeyRelation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(UniqueKey value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ReferenceKey)
	 * @see kdm.data.DataPackage#getKeyRelation_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReferenceKey getFrom();

	/**
	 * Sets the value of the '{@link kdm.data.KeyRelation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ReferenceKey value);

} // KeyRelation
