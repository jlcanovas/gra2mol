/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.Directory#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends InventoryContainer {
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
	 * @see kdm.source.SourcePackage#getDirectory_Path()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link kdm.source.Directory#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Directory
