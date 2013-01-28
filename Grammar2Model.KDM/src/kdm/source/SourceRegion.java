/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;

import kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.SourceRegion#getFile <em>File</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getEndLine <em>End Line</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getLanguage <em>Language</em>}</li>
 *   <li>{@link kdm.source.SourceRegion#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getSourceRegion()
 * @model
 * @generated
 */
public interface SourceRegion extends Element {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(SourceFile)
	 * @see kdm.source.SourcePackage#getSourceRegion_File()
	 * @model ordered="false"
	 * @generated
	 */
	SourceFile getFile();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(SourceFile value);

	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(Integer)
	 * @see kdm.source.SourcePackage#getSourceRegion_StartLine()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getStartLine();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(Integer)
	 * @see kdm.source.SourcePackage#getSourceRegion_StartPosition()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getStartPosition();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(Integer)
	 * @see kdm.source.SourcePackage#getSourceRegion_EndLine()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getEndLine();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(Integer value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' attribute.
	 * @see #setEndPosition(Integer)
	 * @see kdm.source.SourcePackage#getSourceRegion_EndPosition()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getEndPosition();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getEndPosition <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' attribute.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(Integer value);

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
	 * @see kdm.source.SourcePackage#getSourceRegion_Language()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

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
	 * @see kdm.source.SourcePackage#getSourceRegion_Path()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRegion#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // SourceRegion
