/**
 * <copyright>
 * </copyright>
 *
 * $Id: ViewDefinition.java,v 1.1 2008/01/14 09:18:32 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.ViewDefinition#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.ViewDefinition#getHashes <em>Hashes</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.ViewDefinition#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Core.CorePackage#getViewDefinition()
 * @model
 * @generated
 */
public interface ViewDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getViewDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.ViewDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.GVQ.Core.Hash}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference list.
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getViewDefinition_Hashes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hash> getHashes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.GVQ.Core.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getViewDefinition_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // ViewDefinition
