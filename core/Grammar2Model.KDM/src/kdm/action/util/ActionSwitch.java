/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action.util;

import java.util.List;

import kdm.action.*;

import kdm.code.AbstractCodeElement;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

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
 * @see kdm.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
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
			case ActionPackage.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T result = caseActionElement(actionElement);
				if (result == null) result = caseAbstractCodeElement(actionElement);
				if (result == null) result = caseKDMEntity(actionElement);
				if (result == null) result = caseModelElement(actionElement);
				if (result == null) result = caseElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.ABSTRACT_ACTION_RELATIONSHIP: {
				AbstractActionRelationship abstractActionRelationship = (AbstractActionRelationship)theEObject;
				T result = caseAbstractActionRelationship(abstractActionRelationship);
				if (result == null) result = caseKDMRelationship(abstractActionRelationship);
				if (result == null) result = caseModelElement(abstractActionRelationship);
				if (result == null) result = caseElement(abstractActionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseAbstractActionRelationship(controlFlow);
				if (result == null) result = caseKDMRelationship(controlFlow);
				if (result == null) result = caseModelElement(controlFlow);
				if (result == null) result = caseElement(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.CALLS: {
				Calls calls = (Calls)theEObject;
				T result = caseCalls(calls);
				if (result == null) result = caseAbstractActionRelationship(calls);
				if (result == null) result = caseKDMRelationship(calls);
				if (result == null) result = caseModelElement(calls);
				if (result == null) result = caseElement(calls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.CREATES: {
				Creates creates = (Creates)theEObject;
				T result = caseCreates(creates);
				if (result == null) result = caseAbstractActionRelationship(creates);
				if (result == null) result = caseKDMRelationship(creates);
				if (result == null) result = caseModelElement(creates);
				if (result == null) result = caseElement(creates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.READS: {
				Reads reads = (Reads)theEObject;
				T result = caseReads(reads);
				if (result == null) result = caseAbstractActionRelationship(reads);
				if (result == null) result = caseKDMRelationship(reads);
				if (result == null) result = caseModelElement(reads);
				if (result == null) result = caseElement(reads);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.WRITES: {
				Writes writes = (Writes)theEObject;
				T result = caseWrites(writes);
				if (result == null) result = caseAbstractActionRelationship(writes);
				if (result == null) result = caseKDMRelationship(writes);
				if (result == null) result = caseModelElement(writes);
				if (result == null) result = caseElement(writes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.COMPLIES_TO: {
				CompliesTo compliesTo = (CompliesTo)theEObject;
				T result = caseCompliesTo(compliesTo);
				if (result == null) result = caseAbstractActionRelationship(compliesTo);
				if (result == null) result = caseKDMRelationship(compliesTo);
				if (result == null) result = caseModelElement(compliesTo);
				if (result == null) result = caseElement(compliesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseControlFlow(flow);
				if (result == null) result = caseAbstractActionRelationship(flow);
				if (result == null) result = caseKDMRelationship(flow);
				if (result == null) result = caseModelElement(flow);
				if (result == null) result = caseElement(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.TRUE_FLOW: {
				TrueFlow trueFlow = (TrueFlow)theEObject;
				T result = caseTrueFlow(trueFlow);
				if (result == null) result = caseControlFlow(trueFlow);
				if (result == null) result = caseAbstractActionRelationship(trueFlow);
				if (result == null) result = caseKDMRelationship(trueFlow);
				if (result == null) result = caseModelElement(trueFlow);
				if (result == null) result = caseElement(trueFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.FALSE_FLOW: {
				FalseFlow falseFlow = (FalseFlow)theEObject;
				T result = caseFalseFlow(falseFlow);
				if (result == null) result = caseControlFlow(falseFlow);
				if (result == null) result = caseAbstractActionRelationship(falseFlow);
				if (result == null) result = caseKDMRelationship(falseFlow);
				if (result == null) result = caseModelElement(falseFlow);
				if (result == null) result = caseElement(falseFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.GUARDED_FLOW: {
				GuardedFlow guardedFlow = (GuardedFlow)theEObject;
				T result = caseGuardedFlow(guardedFlow);
				if (result == null) result = caseControlFlow(guardedFlow);
				if (result == null) result = caseAbstractActionRelationship(guardedFlow);
				if (result == null) result = caseKDMRelationship(guardedFlow);
				if (result == null) result = caseModelElement(guardedFlow);
				if (result == null) result = caseElement(guardedFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.USES_TYPE: {
				UsesType usesType = (UsesType)theEObject;
				T result = caseUsesType(usesType);
				if (result == null) result = caseAbstractActionRelationship(usesType);
				if (result == null) result = caseKDMRelationship(usesType);
				if (result == null) result = caseModelElement(usesType);
				if (result == null) result = caseElement(usesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.ADDRESSES: {
				Addresses addresses = (Addresses)theEObject;
				T result = caseAddresses(addresses);
				if (result == null) result = caseAbstractActionRelationship(addresses);
				if (result == null) result = caseKDMRelationship(addresses);
				if (result == null) result = caseModelElement(addresses);
				if (result == null) result = caseElement(addresses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.ACTION_RELATIONSHIP: {
				ActionRelationship actionRelationship = (ActionRelationship)theEObject;
				T result = caseActionRelationship(actionRelationship);
				if (result == null) result = caseAbstractActionRelationship(actionRelationship);
				if (result == null) result = caseKDMRelationship(actionRelationship);
				if (result == null) result = caseModelElement(actionRelationship);
				if (result == null) result = caseElement(actionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.THROWS: {
				Throws throws_ = (Throws)theEObject;
				T result = caseThrows(throws_);
				if (result == null) result = caseAbstractActionRelationship(throws_);
				if (result == null) result = caseKDMRelationship(throws_);
				if (result == null) result = caseModelElement(throws_);
				if (result == null) result = caseElement(throws_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.DISPATCHES: {
				Dispatches dispatches = (Dispatches)theEObject;
				T result = caseDispatches(dispatches);
				if (result == null) result = caseAbstractActionRelationship(dispatches);
				if (result == null) result = caseKDMRelationship(dispatches);
				if (result == null) result = caseModelElement(dispatches);
				if (result == null) result = caseElement(dispatches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.ENTRY_FLOW: {
				EntryFlow entryFlow = (EntryFlow)theEObject;
				T result = caseEntryFlow(entryFlow);
				if (result == null) result = caseAbstractActionRelationship(entryFlow);
				if (result == null) result = caseKDMRelationship(entryFlow);
				if (result == null) result = caseModelElement(entryFlow);
				if (result == null) result = caseElement(entryFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.BLOCK_UNIT: {
				BlockUnit blockUnit = (BlockUnit)theEObject;
				T result = caseBlockUnit(blockUnit);
				if (result == null) result = caseActionElement(blockUnit);
				if (result == null) result = caseAbstractCodeElement(blockUnit);
				if (result == null) result = caseKDMEntity(blockUnit);
				if (result == null) result = caseModelElement(blockUnit);
				if (result == null) result = caseElement(blockUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.EXCEPTION_UNIT: {
				ExceptionUnit exceptionUnit = (ExceptionUnit)theEObject;
				T result = caseExceptionUnit(exceptionUnit);
				if (result == null) result = caseBlockUnit(exceptionUnit);
				if (result == null) result = caseActionElement(exceptionUnit);
				if (result == null) result = caseAbstractCodeElement(exceptionUnit);
				if (result == null) result = caseKDMEntity(exceptionUnit);
				if (result == null) result = caseModelElement(exceptionUnit);
				if (result == null) result = caseElement(exceptionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.TRY_UNIT: {
				TryUnit tryUnit = (TryUnit)theEObject;
				T result = caseTryUnit(tryUnit);
				if (result == null) result = caseExceptionUnit(tryUnit);
				if (result == null) result = caseBlockUnit(tryUnit);
				if (result == null) result = caseActionElement(tryUnit);
				if (result == null) result = caseAbstractCodeElement(tryUnit);
				if (result == null) result = caseKDMEntity(tryUnit);
				if (result == null) result = caseModelElement(tryUnit);
				if (result == null) result = caseElement(tryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.FINALLY_UNIT: {
				FinallyUnit finallyUnit = (FinallyUnit)theEObject;
				T result = caseFinallyUnit(finallyUnit);
				if (result == null) result = caseExceptionUnit(finallyUnit);
				if (result == null) result = caseBlockUnit(finallyUnit);
				if (result == null) result = caseActionElement(finallyUnit);
				if (result == null) result = caseAbstractCodeElement(finallyUnit);
				if (result == null) result = caseKDMEntity(finallyUnit);
				if (result == null) result = caseModelElement(finallyUnit);
				if (result == null) result = caseElement(finallyUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.CATCH_UNIT: {
				CatchUnit catchUnit = (CatchUnit)theEObject;
				T result = caseCatchUnit(catchUnit);
				if (result == null) result = caseExceptionUnit(catchUnit);
				if (result == null) result = caseBlockUnit(catchUnit);
				if (result == null) result = caseActionElement(catchUnit);
				if (result == null) result = caseAbstractCodeElement(catchUnit);
				if (result == null) result = caseKDMEntity(catchUnit);
				if (result == null) result = caseModelElement(catchUnit);
				if (result == null) result = caseElement(catchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.EXIT_FLOW: {
				ExitFlow exitFlow = (ExitFlow)theEObject;
				T result = caseExitFlow(exitFlow);
				if (result == null) result = caseAbstractActionRelationship(exitFlow);
				if (result == null) result = caseKDMRelationship(exitFlow);
				if (result == null) result = caseModelElement(exitFlow);
				if (result == null) result = caseElement(exitFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionPackage.EXCEPTION_FLOW: {
				ExceptionFlow exceptionFlow = (ExceptionFlow)theEObject;
				T result = caseExceptionFlow(exceptionFlow);
				if (result == null) result = caseAbstractActionRelationship(exceptionFlow);
				if (result == null) result = caseKDMRelationship(exceptionFlow);
				if (result == null) result = caseModelElement(exceptionFlow);
				if (result == null) result = caseElement(exceptionFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActionRelationship(AbstractActionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalls(Calls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreates(Creates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReads(Reads object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrites(Writes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complies To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complies To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompliesTo(CompliesTo object) {
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
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueFlow(TrueFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalseFlow(FalseFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guarded Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guarded Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardedFlow(GuardedFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesType(UsesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addresses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddresses(Addresses object) {
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
	public T caseActionRelationship(ActionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throws</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throws</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrows(Throws object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatches(Dispatches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryFlow(EntryFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockUnit(BlockUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionUnit(ExceptionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryUnit(TryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyUnit(FinallyUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchUnit(CatchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitFlow(ExitFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionFlow(ExceptionFlow object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCodeElement(AbstractCodeElement object) {
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

} //ActionSwitch
