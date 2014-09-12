/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.MethodUnit#getKind <em>Kind</em>}</li>
 *   <li>{@link kdm.code.MethodUnit#getExport <em>Export</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getMethodUnit()
 * @model
 * @generated
 */
public interface MethodUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.MethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.MethodKind
	 * @see #setKind(MethodKind)
	 * @see kdm.code.CodePackage#getMethodUnit_Kind()
	 * @model
	 * @generated
	 */
	MethodKind getKind();

	/**
	 * Sets the value of the '{@link kdm.code.MethodUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.MethodKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MethodKind value);

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
	 * @see kdm.code.CodePackage#getMethodUnit_Export()
	 * @model
	 * @generated
	 */
	ExportKind getExport();

	/**
	 * Sets the value of the '{@link kdm.code.MethodUnit#getExport <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' attribute.
	 * @see kdm.code.ExportKind
	 * @see #getExport()
	 * @generated
	 */
	void setExport(ExportKind value);

} // MethodUnit
