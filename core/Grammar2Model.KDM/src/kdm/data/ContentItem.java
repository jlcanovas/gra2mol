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
 * A representation of the model object '<em><b>Content Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.ContentItem#getType <em>Type</em>}</li>
 *   <li>{@link kdm.data.ContentItem#getContentElement <em>Content Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getContentItem()
 * @model
 * @generated
 */
public interface ContentItem extends AbstractContentElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComplexContentType)
	 * @see kdm.data.DataPackage#getContentItem_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ComplexContentType getType();

	/**
	 * Sets the value of the '{@link kdm.data.ContentItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComplexContentType value);

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
	 * @see kdm.data.DataPackage#getContentItem_ContentElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractContentElement> getContentElement();

} // ContentItem
