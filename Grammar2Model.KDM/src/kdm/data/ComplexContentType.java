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
 * A representation of the model object '<em><b>Complex Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.ComplexContentType#getContentElement <em>Content Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getComplexContentType()
 * @model
 * @generated
 */
public interface ComplexContentType extends AbstractContentElement {
	/**
	 * Returns the value of the '<em><b>Content Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.data.AbstractContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Element</em>' containment reference list.
	 * @see kdm.data.DataPackage#getComplexContentType_ContentElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractContentElement> getContentElement();

} // ComplexContentType
