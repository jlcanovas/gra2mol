/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.Requires#getTo <em>To</em>}</li>
 *   <li>{@link kdm.platform.Requires#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getRequires()
 * @model
 * @generated
 */
public interface Requires extends AbstractPlatformRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractPlatformElement)
	 * @see kdm.platform.PlatformPackage#getRequires_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractPlatformElement getTo();

	/**
	 * Sets the value of the '{@link kdm.platform.Requires#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractPlatformElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DeployedComponent)
	 * @see kdm.platform.PlatformPackage#getRequires_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeployedComponent getFrom();

	/**
	 * Sets the value of the '{@link kdm.platform.Requires#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DeployedComponent value);

} // Requires
