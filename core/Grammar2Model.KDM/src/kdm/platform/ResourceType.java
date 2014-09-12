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
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.ResourceType#getPlatformElement <em>Platform Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends AbstractPlatformElement {
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
	 * @see kdm.platform.PlatformPackage#getResourceType_PlatformElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractPlatformElement> getPlatformElement();

} // ResourceType
