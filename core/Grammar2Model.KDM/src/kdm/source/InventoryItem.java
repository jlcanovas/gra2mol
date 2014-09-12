/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.InventoryItem#getVersion <em>Version</em>}</li>
 *   <li>{@link kdm.source.InventoryItem#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getInventoryItem()
 * @model
 * @generated
 */
public interface InventoryItem extends AbstractInventoryElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see kdm.source.SourcePackage#getInventoryItem_Version()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link kdm.source.InventoryItem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see kdm.source.SourcePackage#getInventoryItem_Path()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link kdm.source.InventoryItem#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // InventoryItem
