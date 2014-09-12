/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event.util;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.event.*;

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
 * @see kdm.event.EventPackage
 * @generated
 */
public class EventAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EventPackage.eINSTANCE;
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
	protected EventSwitch<Adapter> modelSwitch =
		new EventSwitch<Adapter>() {
			@Override
			public Adapter caseEventModel(EventModel object) {
				return createEventModelAdapter();
			}
			@Override
			public Adapter caseAbstractEventElement(AbstractEventElement object) {
				return createAbstractEventElementAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseAbstractEventRelationship(AbstractEventRelationship object) {
				return createAbstractEventRelationshipAdapter();
			}
			@Override
			public Adapter caseEventRelationship(EventRelationship object) {
				return createEventRelationshipAdapter();
			}
			@Override
			public Adapter caseEventResource(EventResource object) {
				return createEventResourceAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseOnEntry(OnEntry object) {
				return createOnEntryAdapter();
			}
			@Override
			public Adapter caseOnExit(OnExit object) {
				return createOnExitAdapter();
			}
			@Override
			public Adapter caseEventAction(EventAction object) {
				return createEventActionAdapter();
			}
			@Override
			public Adapter caseReadsState(ReadsState object) {
				return createReadsStateAdapter();
			}
			@Override
			public Adapter caseProducesEvent(ProducesEvent object) {
				return createProducesEventAdapter();
			}
			@Override
			public Adapter caseConsumesEvent(ConsumesEvent object) {
				return createConsumesEventAdapter();
			}
			@Override
			public Adapter caseNextState(NextState object) {
				return createNextStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseEventElement(EventElement object) {
				return createEventElementAdapter();
			}
			@Override
			public Adapter caseHasState(HasState object) {
				return createHasStateAdapter();
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
			public Adapter caseAbstractActionRelationship(AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link kdm.event.EventModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.EventModel
	 * @generated
	 */
	public Adapter createEventModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.AbstractEventElement <em>Abstract Event Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.AbstractEventElement
	 * @generated
	 */
	public Adapter createAbstractEventElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.AbstractEventRelationship <em>Abstract Event Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.AbstractEventRelationship
	 * @generated
	 */
	public Adapter createAbstractEventRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.EventRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.EventRelationship
	 * @generated
	 */
	public Adapter createEventRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.EventResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.EventResource
	 * @generated
	 */
	public Adapter createEventResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.OnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.OnEntry
	 * @generated
	 */
	public Adapter createOnEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.OnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.OnExit
	 * @generated
	 */
	public Adapter createOnExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.EventAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.EventAction
	 * @generated
	 */
	public Adapter createEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.ReadsState <em>Reads State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.ReadsState
	 * @generated
	 */
	public Adapter createReadsStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.ProducesEvent <em>Produces Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.ProducesEvent
	 * @generated
	 */
	public Adapter createProducesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.ConsumesEvent <em>Consumes Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.ConsumesEvent
	 * @generated
	 */
	public Adapter createConsumesEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.NextState <em>Next State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.NextState
	 * @generated
	 */
	public Adapter createNextStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.EventElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.EventElement
	 * @generated
	 */
	public Adapter createEventElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.event.HasState <em>Has State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.event.HasState
	 * @generated
	 */
	public Adapter createHasStateAdapter() {
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

} //EventAdapterFactory
