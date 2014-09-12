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
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.Signature#getParameterUnit <em>Parameter Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends Datatype {
	/**
	 * Returns the value of the '<em><b>Parameter Unit</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.ParameterUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Unit</em>' containment reference list.
	 * @see kdm.code.CodePackage#getSignature_ParameterUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterUnit> getParameterUnit();

} // Signature
