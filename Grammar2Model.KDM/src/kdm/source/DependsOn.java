/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.DependsOn#getTo <em>To</em>}</li>
 *   <li>{@link kdm.source.DependsOn#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getDependsOn()
 * @model
 * @generated
 */
public interface DependsOn extends AbstractInventoryRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractInventoryElement)
	 * @see kdm.source.SourcePackage#getDependsOn_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractInventoryElement getTo();

	/**
	 * Sets the value of the '{@link kdm.source.DependsOn#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractInventoryElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractInventoryElement)
	 * @see kdm.source.SourcePackage#getDependsOn_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractInventoryElement getFrom();

	/**
	 * Sets the value of the '{@link kdm.source.DependsOn#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractInventoryElement value);

} // DependsOn
