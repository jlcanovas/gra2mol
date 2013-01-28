/**
 * <copyright>
 * </copyright>
 *
 * $Id: CoreFactory.java,v 1.1 2008/01/14 09:18:31 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.GVQ.Core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = gts.modernization.model.GVQ.Core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>From Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Element</em>'.
	 * @generated
	 */
	FromElement createFromElement();

	/**
	 * Returns a new object of class '<em>To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Element</em>'.
	 * @generated
	 */
	ToElement createToElement();

	/**
	 * Returns a new object of class '<em>Init Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Unit</em>'.
	 * @generated
	 */
	InitUnit createInitUnit();

	/**
	 * Returns a new object of class '<em>Init Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Unit Element</em>'.
	 * @generated
	 */
	InitUnitElement createInitUnitElement();

	/**
	 * Returns a new object of class '<em>Init Unit Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Unit Element Value</em>'.
	 * @generated
	 */
	InitUnitElementValue createInitUnitElementValue();

	/**
	 * Returns a new object of class '<em>Init Unit Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Unit Group</em>'.
	 * @generated
	 */
	InitUnitGroup createInitUnitGroup();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Hash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash</em>'.
	 * @generated
	 */
	Hash createHash();

	/**
	 * Returns a new object of class '<em>Hash Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Value</em>'.
	 * @generated
	 */
	HashValue createHashValue();

	/**
	 * Returns a new object of class '<em>View Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Definition</em>'.
	 * @generated
	 */
	ViewDefinition createViewDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
