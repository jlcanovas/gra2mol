/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/

package gts.modernization.model.Gra2MoL.Core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.Transformation#getSourceGrammar <em>Source Grammar</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.Transformation#getTargetMetamodel <em>Target Metamodel</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.Transformation#getHashes <em>Hashes</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Core.Transformation#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
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
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Grammar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Grammar</em>' attribute.
	 * @see #setSourceGrammar(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation_SourceGrammar()
	 * @model
	 * @generated
	 */
	String getSourceGrammar();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getSourceGrammar <em>Source Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Grammar</em>' attribute.
	 * @see #getSourceGrammar()
	 * @generated
	 */
	void setSourceGrammar(String value);

	/**
	 * Returns the value of the '<em><b>Target Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Metamodel</em>' attribute.
	 * @see #setTargetMetamodel(String)
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation_TargetMetamodel()
	 * @model
	 * @generated
	 */
	String getTargetMetamodel();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getTargetMetamodel <em>Target Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Metamodel</em>' attribute.
	 * @see #getTargetMetamodel()
	 * @generated
	 */
	void setTargetMetamodel(String value);

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.Gra2MoL.Core.Hash}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation_Hashes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hash> getHashes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.Gra2MoL.Core.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getTransformation_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Transformation
