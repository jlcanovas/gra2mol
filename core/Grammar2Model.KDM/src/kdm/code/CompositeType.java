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
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.CompositeType#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Item Unit</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.ItemUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Unit</em>' containment reference list.
	 * @see kdm.code.CodePackage#getCompositeType_ItemUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemUnit> getItemUnit();

} // CompositeType
