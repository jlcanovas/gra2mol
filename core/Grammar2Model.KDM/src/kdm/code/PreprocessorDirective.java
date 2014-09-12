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
 * A representation of the model object '<em><b>Preprocessor Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.PreprocessorDirective#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getPreprocessorDirective()
 * @model
 * @generated
 */
public interface PreprocessorDirective extends AbstractCodeElement {
	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.code.CodePackage#getPreprocessorDirective_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getCodeElement();

} // PreprocessorDirective
