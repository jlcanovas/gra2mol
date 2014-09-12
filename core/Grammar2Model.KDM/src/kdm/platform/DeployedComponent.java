/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

import kdm.code.Module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.DeployedComponent#getGroupedCode <em>Grouped Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getDeployedComponent()
 * @model
 * @generated
 */
public interface DeployedComponent extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Grouped Code</b></em>' reference list.
	 * The list contents are of type {@link kdm.code.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Code</em>' reference list.
	 * @see kdm.platform.PlatformPackage#getDeployedComponent_GroupedCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Module> getGroupedCode();

} // DeployedComponent
