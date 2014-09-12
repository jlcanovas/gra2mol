/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.NamespaceUnit#getGroupedCode <em>Grouped Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getNamespaceUnit()
 * @model
 * @generated
 */
public interface NamespaceUnit extends CodeItem {
	/**
	 * Returns the value of the '<em><b>Grouped Code</b></em>' reference list.
	 * The list contents are of type {@link kdm.code.CodeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Code</em>' reference list.
	 * @see kdm.code.CodePackage#getNamespaceUnit_GroupedCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CodeItem> getGroupedCode();

} // NamespaceUnit
