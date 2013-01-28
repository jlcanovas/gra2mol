/**
 * <copyright>
 * </copyright>
 *
 * $Id: Rule.java,v 1.1 2008/01/14 09:18:31 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core;

import gts.modernization.model.GVQ.Query.FilterUnit;
import gts.modernization.model.GVQ.Query.FilterExpression;
import gts.modernization.model.GVQ.Query.QueryUnit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getFrom <em>From</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getTo <em>To</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getContext <em>Context</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getQueries <em>Queries</em>}</li>
 *   <li>{@link gts.modernization.model.GVQ.Core.Rule#getInits <em>Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
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
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(FromElement)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromElement getFrom();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Rule#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FromElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(ToElement)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ToElement getTo();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Rule#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ToElement value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.GVQ.Query.QueryUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryUnit> getQueries();

	/**
	 * Returns the value of the '<em><b>Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inits</em>' containment reference.
	 * @see #setInits(InitUnitGroup)
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_Inits()
	 * @model containment="true"
	 * @generated
	 */
	InitUnitGroup getInits();

	/**
	 * Sets the value of the '{@link gts.modernization.model.GVQ.Core.Rule#getInits <em>Inits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inits</em>' containment reference.
	 * @see #getInits()
	 * @generated
	 */
	void setInits(InitUnitGroup value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see gts.modernization.model.GVQ.Core.CorePackage#getRule_Context()
	 * @model
	 * @generated
	 */
	EList<String> getContext();

} // Rule
