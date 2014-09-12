/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.SimpleContentType#getType <em>Type</em>}</li>
 *   <li>{@link kdm.data.SimpleContentType#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getSimpleContentType()
 * @model
 * @generated
 */
public interface SimpleContentType extends ComplexContentType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link kdm.data.ComplexContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see kdm.data.DataPackage#getSimpleContentType_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComplexContentType> getType();

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
	 * @see kdm.data.DataPackage#getSimpleContentType_Kind()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link kdm.data.SimpleContentType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // SimpleContentType
