/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.conceptual.ConceptualPackage
 * @generated
 */
public interface ConceptualFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualFactory eINSTANCE = kdm.conceptual.impl.ConceptualFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ConceptualModel createConceptualModel();

	/**
	 * Returns a new object of class '<em>Term Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Unit</em>'.
	 * @generated
	 */
	TermUnit createTermUnit();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	ConceptualContainer createConceptualContainer();

	/**
	 * Returns a new object of class '<em>Fact Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Unit</em>'.
	 * @generated
	 */
	FactUnit createFactUnit();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	ConceptualRelationship createConceptualRelationship();

	/**
	 * Returns a new object of class '<em>Behavior Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Unit</em>'.
	 * @generated
	 */
	BehaviorUnit createBehaviorUnit();

	/**
	 * Returns a new object of class '<em>Rule Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Unit</em>'.
	 * @generated
	 */
	RuleUnit createRuleUnit();

	/**
	 * Returns a new object of class '<em>Scenario Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Unit</em>'.
	 * @generated
	 */
	ScenarioUnit createScenarioUnit();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	ConceptualFlow createConceptualFlow();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	ConceptualElement createConceptualElement();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	ConceptualRole createConceptualRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConceptualPackage getConceptualPackage();

} //ConceptualFactory
