/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;

import kdm.core.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.source.SourceRef#getRegion <em>Region</em>}</li>
 *   <li>{@link kdm.source.SourceRef#getLanguage <em>Language</em>}</li>
 *   <li>{@link kdm.source.SourceRef#getSnippet <em>Snippet</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.source.SourcePackage#getSourceRef()
 * @model
 * @generated
 */
public interface SourceRef extends Element {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.SourceRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see kdm.source.SourcePackage#getSourceRef_Region()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRegion> getRegion();

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
	 * @see kdm.source.SourcePackage#getSourceRef_Language()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRef#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' attribute.
	 * @see #setSnippet(String)
	 * @see kdm.source.SourcePackage#getSourceRef_Snippet()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getSnippet();

	/**
	 * Sets the value of the '{@link kdm.source.SourceRef#getSnippet <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' attribute.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(String value);

} // SourceRef
