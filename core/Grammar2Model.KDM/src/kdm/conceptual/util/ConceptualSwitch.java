/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.util;

import java.util.List;

import kdm.conceptual.*;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kdm.conceptual.ConceptualPackage
 * @generated
 */
public class ConceptualSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptualPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSwitch() {
		if (modelPackage == null) {
			modelPackage = ConceptualPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConceptualPackage.CONCEPTUAL_MODEL: {
				ConceptualModel conceptualModel = (ConceptualModel)theEObject;
				T result = caseConceptualModel(conceptualModel);
				if (result == null) result = caseKDMModel(conceptualModel);
				if (result == null) result = caseKDMFramework(conceptualModel);
				if (result == null) result = caseModelElement(conceptualModel);
				if (result == null) result = caseElement(conceptualModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.ABSTRACT_CONCEPTUAL_ELEMENT: {
				AbstractConceptualElement abstractConceptualElement = (AbstractConceptualElement)theEObject;
				T result = caseAbstractConceptualElement(abstractConceptualElement);
				if (result == null) result = caseKDMEntity(abstractConceptualElement);
				if (result == null) result = caseModelElement(abstractConceptualElement);
				if (result == null) result = caseElement(abstractConceptualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.TERM_UNIT: {
				TermUnit termUnit = (TermUnit)theEObject;
				T result = caseTermUnit(termUnit);
				if (result == null) result = caseAbstractConceptualElement(termUnit);
				if (result == null) result = caseKDMEntity(termUnit);
				if (result == null) result = caseModelElement(termUnit);
				if (result == null) result = caseElement(termUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.CONCEPTUAL_CONTAINER: {
				ConceptualContainer conceptualContainer = (ConceptualContainer)theEObject;
				T result = caseConceptualContainer(conceptualContainer);
				if (result == null) result = caseAbstractConceptualElement(conceptualContainer);
				if (result == null) result = caseKDMEntity(conceptualContainer);
				if (result == null) result = caseModelElement(conceptualContainer);
				if (result == null) result = caseElement(conceptualContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.FACT_UNIT: {
				FactUnit factUnit = (FactUnit)theEObject;
				T result = caseFactUnit(factUnit);
				if (result == null) result = caseConceptualContainer(factUnit);
				if (result == null) result = caseAbstractConceptualElement(factUnit);
				if (result == null) result = caseKDMEntity(factUnit);
				if (result == null) result = caseModelElement(factUnit);
				if (result == null) result = caseElement(factUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.ABSTRACT_CONCEPTUAL_RELATIONSHIP: {
				AbstractConceptualRelationship abstractConceptualRelationship = (AbstractConceptualRelationship)theEObject;
				T result = caseAbstractConceptualRelationship(abstractConceptualRelationship);
				if (result == null) result = caseKDMRelationship(abstractConceptualRelationship);
				if (result == null) result = caseModelElement(abstractConceptualRelationship);
				if (result == null) result = caseElement(abstractConceptualRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.CONCEPTUAL_RELATIONSHIP: {
				ConceptualRelationship conceptualRelationship = (ConceptualRelationship)theEObject;
				T result = caseConceptualRelationship(conceptualRelationship);
				if (result == null) result = caseAbstractConceptualRelationship(conceptualRelationship);
				if (result == null) result = caseKDMRelationship(conceptualRelationship);
				if (result == null) result = caseModelElement(conceptualRelationship);
				if (result == null) result = caseElement(conceptualRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.BEHAVIOR_UNIT: {
				BehaviorUnit behaviorUnit = (BehaviorUnit)theEObject;
				T result = caseBehaviorUnit(behaviorUnit);
				if (result == null) result = caseConceptualContainer(behaviorUnit);
				if (result == null) result = caseAbstractConceptualElement(behaviorUnit);
				if (result == null) result = caseKDMEntity(behaviorUnit);
				if (result == null) result = caseModelElement(behaviorUnit);
				if (result == null) result = caseElement(behaviorUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.RULE_UNIT: {
				RuleUnit ruleUnit = (RuleUnit)theEObject;
				T result = caseRuleUnit(ruleUnit);
				if (result == null) result = caseConceptualContainer(ruleUnit);
				if (result == null) result = caseAbstractConceptualElement(ruleUnit);
				if (result == null) result = caseKDMEntity(ruleUnit);
				if (result == null) result = caseModelElement(ruleUnit);
				if (result == null) result = caseElement(ruleUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.SCENARIO_UNIT: {
				ScenarioUnit scenarioUnit = (ScenarioUnit)theEObject;
				T result = caseScenarioUnit(scenarioUnit);
				if (result == null) result = caseConceptualContainer(scenarioUnit);
				if (result == null) result = caseAbstractConceptualElement(scenarioUnit);
				if (result == null) result = caseKDMEntity(scenarioUnit);
				if (result == null) result = caseModelElement(scenarioUnit);
				if (result == null) result = caseElement(scenarioUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.CONCEPTUAL_FLOW: {
				ConceptualFlow conceptualFlow = (ConceptualFlow)theEObject;
				T result = caseConceptualFlow(conceptualFlow);
				if (result == null) result = caseAbstractConceptualRelationship(conceptualFlow);
				if (result == null) result = caseKDMRelationship(conceptualFlow);
				if (result == null) result = caseModelElement(conceptualFlow);
				if (result == null) result = caseElement(conceptualFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.CONCEPTUAL_ELEMENT: {
				ConceptualElement conceptualElement = (ConceptualElement)theEObject;
				T result = caseConceptualElement(conceptualElement);
				if (result == null) result = caseAbstractConceptualElement(conceptualElement);
				if (result == null) result = caseKDMEntity(conceptualElement);
				if (result == null) result = caseModelElement(conceptualElement);
				if (result == null) result = caseElement(conceptualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptualPackage.CONCEPTUAL_ROLE: {
				ConceptualRole conceptualRole = (ConceptualRole)theEObject;
				T result = caseConceptualRole(conceptualRole);
				if (result == null) result = caseAbstractConceptualElement(conceptualRole);
				if (result == null) result = caseKDMEntity(conceptualRole);
				if (result == null) result = caseModelElement(conceptualRole);
				if (result == null) result = caseElement(conceptualRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualModel(ConceptualModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Conceptual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Conceptual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConceptualElement(AbstractConceptualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermUnit(TermUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualContainer(ConceptualContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactUnit(FactUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Conceptual Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Conceptual Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConceptualRelationship(AbstractConceptualRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualRelationship(ConceptualRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorUnit(BehaviorUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleUnit(RuleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioUnit(ScenarioUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualFlow(ConceptualFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualElement(ConceptualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualRole(ConceptualRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMFramework(KDMFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMModel(KDMModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMEntity(KDMEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMRelationship(KDMRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ConceptualSwitch
