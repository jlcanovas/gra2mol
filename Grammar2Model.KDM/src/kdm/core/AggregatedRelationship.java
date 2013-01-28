/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.core.AggregatedRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getTo <em>To</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getRelation <em>Relation</em>}</li>
 *   <li>{@link kdm.core.AggregatedRelationship#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.core.CorePackage#getAggregatedRelationship()
 * @model
 * @generated
 */
public interface AggregatedRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(KDMEntity)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KDMEntity getFrom();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(KDMEntity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(KDMEntity)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KDMEntity getTo();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(KDMEntity value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference list.
	 * @see kdm.core.CorePackage#getAggregatedRelationship_Relation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMRelationship> getRelation();

	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see #setDensity(Integer)
	 * @see kdm.core.CorePackage#getAggregatedRelationship_Density()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getDensity();

	/**
	 * Sets the value of the '{@link kdm.core.AggregatedRelationship#getDensity <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' attribute.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(Integer value);

} // AggregatedRelationship
