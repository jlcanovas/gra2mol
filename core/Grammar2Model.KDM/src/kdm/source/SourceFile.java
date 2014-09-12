/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.SourceFile#getLanguage <em>Language</em>}</li>
 *   <li>{@link kdm.source.SourceFile#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends InventoryItem {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see kdm.source.SourcePackage#getSourceFile_Language()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link kdm.source.SourceFile#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see kdm.source.SourcePackage#getSourceFile_Encoding()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link kdm.source.SourceFile#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // SourceFile
