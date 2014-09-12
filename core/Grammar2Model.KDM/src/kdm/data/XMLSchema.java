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
 * A representation of the model object '<em><b>XML Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.XMLSchema#getContentElement <em>Content Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getXMLSchema()
 * @model
 * @generated
 */
public interface XMLSchema extends AbstractDataElement {
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
	 * @see kdm.data.DataPackage#getXMLSchema_ContentElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractContentElement> getContentElement();

} // XMLSchema
