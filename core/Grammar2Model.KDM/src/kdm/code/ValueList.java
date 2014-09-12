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
 * A representation of the model object '<em><b>Value List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.ValueList#getValueElement <em>Value Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getValueList()
 * @model
 * @generated
 */
public interface ValueList extends ValueElement {
	/**
	 * Returns the value of the '<em><b>Value Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.ValueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Element</em>' containment reference list.
	 * @see kdm.code.CodePackage#getValueList_ValueElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueElement> getValueElement();

} // ValueList
