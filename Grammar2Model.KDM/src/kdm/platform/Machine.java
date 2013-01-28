/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.Machine#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link kdm.platform.Machine#getDeployedResource <em>Deployed Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Deployed Component</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.platform.DeployedComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Component</em>' containment reference list.
	 * @see kdm.platform.PlatformPackage#getMachine_DeployedComponent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getDeployedComponent();

	/**
	 * Returns the value of the '<em><b>Deployed Resource</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.platform.DeployedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Resource</em>' containment reference list.
	 * @see kdm.platform.PlatformPackage#getMachine_DeployedResource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeployedResource> getDeployedResource();

} // Machine
