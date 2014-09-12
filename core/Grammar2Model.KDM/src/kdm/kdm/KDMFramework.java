/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.KDMFramework#getAudit <em>Audit</em>}</li>
 *   <li>{@link kdm.kdm.KDMFramework#getExtensionFamily <em>Extension Family</em>}</li>
 *   <li>{@link kdm.kdm.KDMFramework#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getKDMFramework()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KDMFramework extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Audit</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.Audit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getKDMFramework_Audit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Audit> getAudit();

	/**
	 * Returns the value of the '<em><b>Extension Family</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.kdm.ExtensionFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Family</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Family</em>' containment reference list.
	 * @see kdm.kdm.KdmPackage#getKDMFramework_ExtensionFamily()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionFamily> getExtensionFamily();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kdm.kdm.KdmPackage#getKDMFramework_Name()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kdm.kdm.KDMFramework#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // KDMFramework
