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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.platform.PlatformAction#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.platform.PlatformAction#getPlatformElement <em>Platform Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.platform.PlatformPackage#getPlatformAction()
 * @model
 * @generated
 */
public interface PlatformAction extends AbstractPlatformElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see kdm.platform.PlatformPackage#getPlatformAction_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.platform.PlatformAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Platform Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.platform.PlatformEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Element</em>' containment reference list.
	 * @see kdm.platform.PlatformPackage#getPlatformAction_PlatformElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PlatformEvent> getPlatformElement();

} // PlatformAction
