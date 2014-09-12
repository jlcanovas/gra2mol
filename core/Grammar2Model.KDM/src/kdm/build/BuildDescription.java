/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.BuildDescription#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.build.BuildDescription#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getBuildDescription()
 * @model
 * @generated
 */
public interface BuildDescription extends BuildResource {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see kdm.build.BuildPackage#getBuildDescription_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see kdm.build.BuildPackage#getBuildDescription_Text()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link kdm.build.BuildDescription#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // BuildDescription
