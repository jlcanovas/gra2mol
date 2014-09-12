/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.PlatformModel#getPlatformElement <em>Platform Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getPlatformModel()
 * @model
 * @generated
 */
public interface PlatformModel extends KDMModel {
	/**
	 * Returns the value of the '<em><b>Platform Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.platform.AbstractPlatformElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Element</em>' containment reference list.
	 * @see kdm.platform.PlatformPackage#getPlatformModel_PlatformElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractPlatformElement> getPlatformElement();

} // PlatformModel
