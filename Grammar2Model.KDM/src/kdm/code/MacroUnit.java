/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.MacroUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getMacroUnit()
 * @model
 * @generated
 */
public interface MacroUnit extends PreprocessorDirective {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kdm.code.MacroKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.MacroKind
	 * @see #setKind(MacroKind)
	 * @see kdm.code.CodePackage#getMacroUnit_Kind()
	 * @model
	 * @generated
	 */
	MacroKind getKind();

	/**
	 * Sets the value of the '{@link kdm.code.MacroUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kdm.code.MacroKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MacroKind value);

} // MacroUnit
