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
 * A representation of the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.DeployedSoftwareSystem#getGroupedComponent <em>Grouped Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getDeployedSoftwareSystem()
 * @model
 * @generated
 */
public interface DeployedSoftwareSystem extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Grouped Component</b></em>' reference list.
	 * The list contents are of type {@link kdm.platform.DeployedComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Component</em>' reference list.
	 * @see kdm.platform.PlatformPackage#getDeployedSoftwareSystem_GroupedComponent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getGroupedComponent();

} // DeployedSoftwareSystem
