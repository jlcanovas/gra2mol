/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.impl;

import kdm.conceptual.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualFactoryImpl extends EFactoryImpl implements ConceptualFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptualFactory init() {
		try {
			ConceptualFactory theConceptualFactory = (ConceptualFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/conceptual"); 
			if (theConceptualFactory != null) {
				return theConceptualFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptualFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConceptualPackage.CONCEPTUAL_MODEL: return createConceptualModel();
			case ConceptualPackage.TERM_UNIT: return createTermUnit();
			case ConceptualPackage.CONCEPTUAL_CONTAINER: return createConceptualContainer();
			case ConceptualPackage.FACT_UNIT: return createFactUnit();
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP: return createConceptualRelationship();
			case ConceptualPackage.BEHAVIOR_UNIT: return createBehaviorUnit();
			case ConceptualPackage.RULE_UNIT: return createRuleUnit();
			case ConceptualPackage.SCENARIO_UNIT: return createScenarioUnit();
			case ConceptualPackage.CONCEPTUAL_FLOW: return createConceptualFlow();
			case ConceptualPackage.CONCEPTUAL_ELEMENT: return createConceptualElement();
			case ConceptualPackage.CONCEPTUAL_ROLE: return createConceptualRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualModel createConceptualModel() {
		ConceptualModelImpl conceptualModel = new ConceptualModelImpl();
		return conceptualModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermUnit createTermUnit() {
		TermUnitImpl termUnit = new TermUnitImpl();
		return termUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualContainer createConceptualContainer() {
		ConceptualContainerImpl conceptualContainer = new ConceptualContainerImpl();
		return conceptualContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactUnit createFactUnit() {
		FactUnitImpl factUnit = new FactUnitImpl();
		return factUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualRelationship createConceptualRelationship() {
		ConceptualRelationshipImpl conceptualRelationship = new ConceptualRelationshipImpl();
		return conceptualRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorUnit createBehaviorUnit() {
		BehaviorUnitImpl behaviorUnit = new BehaviorUnitImpl();
		return behaviorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleUnit createRuleUnit() {
		RuleUnitImpl ruleUnit = new RuleUnitImpl();
		return ruleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioUnit createScenarioUnit() {
		ScenarioUnitImpl scenarioUnit = new ScenarioUnitImpl();
		return scenarioUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualFlow createConceptualFlow() {
		ConceptualFlowImpl conceptualFlow = new ConceptualFlowImpl();
		return conceptualFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualElement createConceptualElement() {
		ConceptualElementImpl conceptualElement = new ConceptualElementImpl();
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualRole createConceptualRole() {
		ConceptualRoleImpl conceptualRole = new ConceptualRoleImpl();
		return conceptualRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualPackage getConceptualPackage() {
		return (ConceptualPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptualPackage getPackage() {
		return ConceptualPackage.eINSTANCE;
	}

} //ConceptualFactoryImpl
