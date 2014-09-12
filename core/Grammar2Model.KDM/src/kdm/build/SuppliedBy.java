/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplied By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.SuppliedBy#getTo <em>To</em>}</li>
 *   <li>{@link kdm.build.SuppliedBy#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getSuppliedBy()
 * @model
 * @generated
 */
public interface SuppliedBy extends AbstractBuildRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Supplier)
	 * @see kdm.build.BuildPackage#getSuppliedBy_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Supplier getTo();

	/**
	 * Sets the value of the '{@link kdm.build.SuppliedBy#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Supplier value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractBuildElement)
	 * @see kdm.build.BuildPackage#getSuppliedBy_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractBuildElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.build.SuppliedBy#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractBuildElement value);

} // SuppliedBy
