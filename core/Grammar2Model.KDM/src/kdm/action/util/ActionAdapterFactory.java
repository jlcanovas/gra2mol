/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action.util;

import kdm.action.*;

import kdm.code.AbstractCodeElement;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kdm.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
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
	protected ActionSwitch<Adapter> modelSwitch =
		new ActionSwitch<Adapter>() {
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseCalls(Calls object) {
				return createCallsAdapter();
			}
			@Override
			public Adapter caseCreates(Creates object) {
				return createCreatesAdapter();
			}
			@Override
			public Adapter caseReads(Reads object) {
				return createReadsAdapter();
			}
			@Override
			public Adapter caseWrites(Writes object) {
				return createWritesAdapter();
			}
			@Override
			public Adapter caseCompliesTo(CompliesTo object) {
				return createCompliesToAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseTrueFlow(TrueFlow object) {
				return createTrueFlowAdapter();
			}
			@Override
			public Adapter caseFalseFlow(FalseFlow object) {
				return createFalseFlowAdapter();
			}
			@Override
			public Adapter caseGuardedFlow(GuardedFlow object) {
				return createGuardedFlowAdapter();
			}
			@Override
			public Adapter caseUsesType(UsesType object) {
				return createUsesTypeAdapter();
			}
			@Override
			public Adapter caseAddresses(Addresses object) {
				return createAddressesAdapter();
			}
			@Override
			public Adapter caseActionRelationship(ActionRelationship object) {
				return createActionRelationshipAdapter();
			}
			@Override
			public Adapter caseThrows(Throws object) {
				return createThrowsAdapter();
			}
			@Override
			public Adapter caseDispatches(Dispatches object) {
				return createDispatchesAdapter();
			}
			@Override
			public Adapter caseEntryFlow(EntryFlow object) {
				return createEntryFlowAdapter();
			}
			@Override
			public Adapter caseBlockUnit(BlockUnit object) {
				return createBlockUnitAdapter();
			}
			@Override
			public Adapter caseExceptionUnit(ExceptionUnit object) {
				return createExceptionUnitAdapter();
			}
			@Override
			public Adapter caseTryUnit(TryUnit object) {
				return createTryUnitAdapter();
			}
			@Override
			public Adapter caseFinallyUnit(FinallyUnit object) {
				return createFinallyUnitAdapter();
			}
			@Override
			public Adapter caseCatchUnit(CatchUnit object) {
				return createCatchUnitAdapter();
			}
			@Override
			public Adapter caseExitFlow(ExitFlow object) {
				return createExitFlowAdapter();
			}
			@Override
			public Adapter caseExceptionFlow(ExceptionFlow object) {
				return createExceptionFlowAdapter();
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
			public Adapter caseKDMEntity(KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseAbstractCodeElement(AbstractCodeElement object) {
				return createAbstractCodeElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link kdm.action.ActionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Calls
	 * @generated
	 */
	public Adapter createCallsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Creates
	 * @generated
	 */
	public Adapter createCreatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Reads
	 * @generated
	 */
	public Adapter createReadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Writes
	 * @generated
	 */
	public Adapter createWritesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.CompliesTo <em>Complies To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.CompliesTo
	 * @generated
	 */
	public Adapter createCompliesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.TrueFlow <em>True Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.TrueFlow
	 * @generated
	 */
	public Adapter createTrueFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.FalseFlow <em>False Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.FalseFlow
	 * @generated
	 */
	public Adapter createFalseFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.GuardedFlow <em>Guarded Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.GuardedFlow
	 * @generated
	 */
	public Adapter createGuardedFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.UsesType <em>Uses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.UsesType
	 * @generated
	 */
	public Adapter createUsesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Addresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Addresses
	 * @generated
	 */
	public Adapter createAddressesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.ActionRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ActionRelationship
	 * @generated
	 */
	public Adapter createActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Throws <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Throws
	 * @generated
	 */
	public Adapter createThrowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.Dispatches <em>Dispatches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.Dispatches
	 * @generated
	 */
	public Adapter createDispatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.EntryFlow <em>Entry Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.EntryFlow
	 * @generated
	 */
	public Adapter createEntryFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.BlockUnit
	 * @generated
	 */
	public Adapter createBlockUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ExceptionUnit
	 * @generated
	 */
	public Adapter createExceptionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.TryUnit
	 * @generated
	 */
	public Adapter createTryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.FinallyUnit
	 * @generated
	 */
	public Adapter createFinallyUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.CatchUnit
	 * @generated
	 */
	public Adapter createCatchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.ExitFlow <em>Exit Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ExitFlow
	 * @generated
	 */
	public Adapter createExitFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.ExceptionFlow <em>Exception Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.ExceptionFlow
	 * @generated
	 */
	public Adapter createExceptionFlowAdapter() {
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
	 * Creates a new adapter for an object of class '{@link kdm.code.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.AbstractCodeElement
	 * @generated
	 */
	public Adapter createAbstractCodeElementAdapter() {
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

} //ActionAdapterFactory
