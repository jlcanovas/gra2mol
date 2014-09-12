/**
 * <copyright>
 * </copyright>
 *
 * $Id: Element.java,v 1.1 2008/01/14 09:09:07 Javier Canovas Exp $
 */
package gts.modernization.model.CST;

import gts.modernization.model.CST.util.CSTVisitable;
import gts.modernization.model.CST.util.CSTVisitor;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.CST.Element#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.CST.CSTPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject, CSTVisitable {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see gts.modernization.model.CST.CSTPackage#getElement_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link gts.modernization.model.CST.Element#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // Element
