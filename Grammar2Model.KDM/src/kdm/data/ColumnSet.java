/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.code.ItemUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.ColumnSet#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getColumnSet()
 * @model
 * @generated
 */
public interface ColumnSet extends DataContainer {
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
	 * @see kdm.data.DataPackage#getColumnSet_ItemUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemUnit> getItemUnit();

} // ColumnSet
