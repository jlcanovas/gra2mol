/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gts.modernization.model.GVQ.Core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Parameter#getValuePosition <em>Value Position</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Parameter#getExtension <em>Extension</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Parameter#getExtensionPosition <em>Extension Position</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Position</em>' attribute.
	 * @see #setValuePosition(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter_ValuePosition()
	 * @model
	 * @generated
	 */
	String getValuePosition();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Parameter#getValuePosition <em>Value Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Position</em>' attribute.
	 * @see #getValuePosition()
	 * @generated
	 */
	void setValuePosition(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Parameter#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Extension Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Position</em>' attribute.
	 * @see #setExtensionPosition(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter_ExtensionPosition()
	 * @model
	 * @generated
	 */
	String getExtensionPosition();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Parameter#getExtensionPosition <em>Extension Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Position</em>' attribute.
	 * @see #getExtensionPosition()
	 * @generated
	 */
	void setExtensionPosition(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.GVQ.Core.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Core.ParameterType
	 * @see #setType(ParameterType)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.GVQ.Core.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

} // Parameter
