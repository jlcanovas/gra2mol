/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.util;

import kdm.conceptual.*;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kdm.conceptual.ConceptualPackage
 * @generated
 */
public class ConceptualAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptualPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConceptualPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSwitch<Adapter> modelSwitch =
		new ConceptualSwitch<Adapter>() {
			@Override
			public Adapter caseConceptualModel(ConceptualModel object) {
				return createConceptualModelAdapter();
			}
			@Override
			public Adapter caseAbstractConceptualElement(AbstractConceptualElement object) {
				return createAbstractConceptualElementAdapter();
			}
			@Override
			public Adapter caseTermUnit(TermUnit object) {
				return createTermUnitAdapter();
			}
			@Override
			public Adapter caseConceptualContainer(ConceptualContainer object) {
				return createConceptualContainerAdapter();
			}
			@Override
			public Adapter caseFactUnit(FactUnit object) {
				return createFactUnitAdapter();
			}
			@Override
			public Adapter caseAbstractConceptualRelationship(AbstractConceptualRelationship object) {
				return createAbstractConceptualRelationshipAdapter();
			}
			@Override
			public Adapter caseConceptualRelationship(ConceptualRelationship object) {
				return createConceptualRelationshipAdapter();
			}
			@Override
			public Adapter caseBehaviorUnit(BehaviorUnit object) {
				return createBehaviorUnitAdapter();
			}
			@Override
			public Adapter caseRuleUnit(RuleUnit object) {
				return createRuleUnitAdapter();
			}
			@Override
			public Adapter caseScenarioUnit(ScenarioUnit object) {
				return createScenarioUnitAdapter();
			}
			@Override
			public Adapter caseConceptualFlow(ConceptualFlow object) {
				return createConceptualFlowAdapter();
			}
			@Override
			public Adapter caseConceptualElement(ConceptualElement object) {
				return createConceptualElementAdapter();
			}
			@Override
			public Adapter caseConceptualRole(ConceptualRole object) {
				return createConceptualRoleAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMFramework(KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMEntity(KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualModel
	 * @generated
	 */
	public Adapter createConceptualModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.AbstractConceptualElement <em>Abstract Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.AbstractConceptualElement
	 * @generated
	 */
	public Adapter createAbstractConceptualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.TermUnit <em>Term Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.TermUnit
	 * @generated
	 */
	public Adapter createTermUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualContainer
	 * @generated
	 */
	public Adapter createConceptualContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.FactUnit <em>Fact Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.FactUnit
	 * @generated
	 */
	public Adapter createFactUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.AbstractConceptualRelationship <em>Abstract Conceptual Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.AbstractConceptualRelationship
	 * @generated
	 */
	public Adapter createAbstractConceptualRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualRelationship
	 * @generated
	 */
	public Adapter createConceptualRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.BehaviorUnit <em>Behavior Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.BehaviorUnit
	 * @generated
	 */
	public Adapter createBehaviorUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.RuleUnit <em>Rule Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.RuleUnit
	 * @generated
	 */
	public Adapter createRuleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ScenarioUnit <em>Scenario Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ScenarioUnit
	 * @generated
	 */
	public Adapter createScenarioUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualFlow
	 * @generated
	 */
	public Adapter createConceptualFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualElement
	 * @generated
	 */
	public Adapter createConceptualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.conceptual.ConceptualRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.conceptual.ConceptualRole
	 * @generated
	 */
	public Adapter createConceptualRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.KDMEntity
	 * @generated
	 */
	public Adapter createKDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConceptualAdapterFactory
