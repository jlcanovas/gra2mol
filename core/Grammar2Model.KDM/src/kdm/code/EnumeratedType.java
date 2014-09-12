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
 * A representation of the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.EnumeratedType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getEnumeratedType()
 * @model
 * @generated
 */
public interface EnumeratedType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see kdm.code.CodePackage#getEnumeratedType_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // EnumeratedType
