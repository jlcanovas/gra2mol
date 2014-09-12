/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.code.CodeItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.RelationalSchema#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getRelationalSchema()
 * @model
 * @generated
 */
public interface RelationalSchema extends DataContainer {
	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.CodeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.data.DataPackage#getRelationalSchema_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CodeItem> getCodeElement();

} // RelationalSchema
