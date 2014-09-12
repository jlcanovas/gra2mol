/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kdm.core.CorePackage#getKDMRelationship()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KDMRelationship extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	KDMEntity getTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	KDMEntity getFrom();

} // KDMRelationship
