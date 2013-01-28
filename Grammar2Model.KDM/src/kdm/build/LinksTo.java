/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Links To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.LinksTo#getTo <em>To</em>}</li>
 *   <li>{@link kdm.build.LinksTo#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getLinksTo()
 * @model
 * @generated
 */
public interface LinksTo extends AbstractBuildRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractBuildElement)
	 * @see kdm.build.BuildPackage#getLinksTo_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractBuildElement getTo();

	/**
	 * Sets the value of the '{@link kdm.build.LinksTo#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractBuildElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SymbolicLink)
	 * @see kdm.build.BuildPackage#getLinksTo_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SymbolicLink getFrom();

	/**
	 * Sets the value of the '{@link kdm.build.LinksTo#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SymbolicLink value);

} // LinksTo
