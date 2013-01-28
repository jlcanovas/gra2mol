/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.Segment#getSegment <em>Segment</em>}</li>
 *   <li>{@link kdm.kdm.Segment#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends KDMFramework {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getSegment_Segment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Segment> getSegment();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.KDMModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getSegment_Model()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KDMModel> getModel();

} // Segment
