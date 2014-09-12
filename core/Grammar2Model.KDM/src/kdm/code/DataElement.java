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
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.DataElement#getType <em>Type</em>}</li>
 *   <li>{@link kdm.code.DataElement#getExt <em>Ext</em>}</li>
 *   <li>{@link kdm.code.DataElement#getSize <em>Size</em>}</li>
 *   <li>{@link kdm.code.DataElement#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends ComputationalObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Datatype)
	 * @see kdm.code.CodePackage#getDataElement_Type()
	 * @model ordered="false"
	 *        extendedMetaData="lowerBound='1'"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link kdm.code.DataElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see kdm.code.CodePackage#getDataElement_Ext()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link kdm.code.DataElement#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see kdm.code.CodePackage#getDataElement_Size()
	 * @model dataType="kdm.core.Integer"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link kdm.code.DataElement#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see kdm.code.CodePackage#getDataElement_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Datatype> getCodeElement();

} // DataElement
