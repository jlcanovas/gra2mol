/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.MemberUnit#getExport <em>Export</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getMemberUnit()
 * @model
 * @generated
 */
public interface MemberUnit extends DataElement {
	/**
	 * Returns the value of the '<em><b>Export</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.ExportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' attribute.
	 * @see kdm.code.ExportKind
	 * @see #setExport(ExportKind)
	 * @see kdm.code.CodePackage#getMemberUnit_Export()
	 * @model
	 * @generated
	 */
	ExportKind getExport();

	/**
	 * Sets the value of the '{@link kdm.code.MemberUnit#getExport <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' attribute.
	 * @see kdm.code.ExportKind
	 * @see #getExport()
	 * @generated
	 */
	void setExport(ExportKind value);

} // MemberUnit
