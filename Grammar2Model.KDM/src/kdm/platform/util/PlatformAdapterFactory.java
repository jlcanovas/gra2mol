/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.util;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import kdm.platform.AbstractPlatformElement;
import kdm.platform.AbstractPlatformRelationship;
import kdm.platform.BindsTo;
import kdm.platform.DataManager;
import kdm.platform.DefinedBy;
import kdm.platform.DeployedComponent;
import kdm.platform.DeployedResource;
import kdm.platform.DeployedSoftwareSystem;
import kdm.platform.ExecutionResource;
import kdm.platform.ExternalActor;
import kdm.platform.FileResource;
import kdm.platform.Loads;
import kdm.platform.LockResource;
import kdm.platform.Machine;
import kdm.platform.ManagesResource;
import kdm.platform.MarshalledResource;
import kdm.platform.MessagingResource;
import kdm.platform.NamingResource;
import kdm.platform.PlatformAction;
import kdm.platform.PlatformElement;
import kdm.platform.PlatformEvent;
import kdm.platform.PlatformModel;
import kdm.platform.PlatformPackage;
import kdm.platform.PlatformRelationship;
import kdm.platform.ReadsResource;
import kdm.platform.Requires;
import kdm.platform.ResourceType;
import kdm.platform.RuntimeResource;
import kdm.platform.Spawns;
import kdm.platform.StreamResource;
import kdm.platform.WritesResource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kdm.platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
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
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractPlatformElement(AbstractPlatformElement object) {
				return createAbstractPlatformElementAdapter();
			}
			@Override
			public Adapter casePlatformModel(PlatformModel object) {
				return createPlatformModelAdapter();
			}
			@Override
			public Adapter caseAbstractPlatformRelationship(AbstractPlatformRelationship object) {
				return createAbstractPlatformRelationshipAdapter();
			}
			@Override
			public Adapter caseRequires(Requires object) {
				return createRequiresAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseNamingResource(NamingResource object) {
				return createNamingResourceAdapter();
			}
			@Override
			public Adapter caseMarshalledResource(MarshalledResource object) {
				return createMarshalledResourceAdapter();
			}
			@Override
			public Adapter caseMessagingResource(MessagingResource object) {
				return createMessagingResourceAdapter();
			}
			@Override
			public Adapter caseFileResource(FileResource object) {
				return createFileResourceAdapter();
			}
			@Override
			public Adapter caseExecutionResource(ExecutionResource object) {
				return createExecutionResourceAdapter();
			}
			@Override
			public Adapter casePlatformAction(PlatformAction object) {
				return createPlatformActionAdapter();
			}
			@Override
			public Adapter caseExternalActor(ExternalActor object) {
				return createExternalActorAdapter();
			}
			@Override
			public Adapter caseDataManager(DataManager object) {
				return createDataManagerAdapter();
			}
			@Override
			public Adapter caseBindsTo(BindsTo object) {
				return createBindsToAdapter();
			}
			@Override
			public Adapter casePlatformElement(PlatformElement object) {
				return createPlatformElementAdapter();
			}
			@Override
			public Adapter casePlatformRelationship(PlatformRelationship object) {
				return createPlatformRelationshipAdapter();
			}
			@Override
			public Adapter casePlatformEvent(PlatformEvent object) {
				return createPlatformEventAdapter();
			}
			@Override
			public Adapter caseLockResource(LockResource object) {
				return createLockResourceAdapter();
			}
			@Override
			public Adapter caseDeployedSoftwareSystem(DeployedSoftwareSystem object) {
				return createDeployedSoftwareSystemAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseDeployedComponent(DeployedComponent object) {
				return createDeployedComponentAdapter();
			}
			@Override
			public Adapter caseDeployedResource(DeployedResource object) {
				return createDeployedResourceAdapter();
			}
			@Override
			public Adapter caseLoads(Loads object) {
				return createLoadsAdapter();
			}
			@Override
			public Adapter caseSpawns(Spawns object) {
				return createSpawnsAdapter();
			}
			@Override
			public Adapter caseRuntimeResource(RuntimeResource object) {
				return createRuntimeResourceAdapter();
			}
			@Override
			public Adapter caseThread(kdm.platform.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseProcess(kdm.platform.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseReadsResource(ReadsResource object) {
				return createReadsResourceAdapter();
			}
			@Override
			public Adapter caseWritesResource(WritesResource object) {
				return createWritesResourceAdapter();
			}
			@Override
			public Adapter caseManagesResource(ManagesResource object) {
				return createManagesResourceAdapter();
			}
			@Override
			public Adapter caseDefinedBy(DefinedBy object) {
				return createDefinedByAdapter();
			}
			@Override
			public Adapter caseStreamResource(StreamResource object) {
				return createStreamResourceAdapter();
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
			public Adapter caseKDMFramework(KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(KDMModel object) {
				return createKDMModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link kdm.platform.AbstractPlatformElement <em>Abstract Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.AbstractPlatformElement
	 * @generated
	 */
	public Adapter createAbstractPlatformElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.PlatformModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.PlatformModel
	 * @generated
	 */
	public Adapter createPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.AbstractPlatformRelationship <em>Abstract Platform Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.AbstractPlatformRelationship
	 * @generated
	 */
	public Adapter createAbstractPlatformRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Requires
	 * @generated
	 */
	public Adapter createRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.NamingResource <em>Naming Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.NamingResource
	 * @generated
	 */
	public Adapter createNamingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.MarshalledResource <em>Marshalled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.MarshalledResource
	 * @generated
	 */
	public Adapter createMarshalledResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.MessagingResource <em>Messaging Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.MessagingResource
	 * @generated
	 */
	public Adapter createMessagingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.FileResource <em>File Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.FileResource
	 * @generated
	 */
	public Adapter createFileResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.ExecutionResource <em>Execution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.ExecutionResource
	 * @generated
	 */
	public Adapter createExecutionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.PlatformAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.PlatformAction
	 * @generated
	 */
	public Adapter createPlatformActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.ExternalActor <em>External Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.ExternalActor
	 * @generated
	 */
	public Adapter createExternalActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.DataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.DataManager
	 * @generated
	 */
	public Adapter createDataManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.BindsTo <em>Binds To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.BindsTo
	 * @generated
	 */
	public Adapter createBindsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.PlatformElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.PlatformElement
	 * @generated
	 */
	public Adapter createPlatformElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.PlatformRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.PlatformRelationship
	 * @generated
	 */
	public Adapter createPlatformRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.PlatformEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.PlatformEvent
	 * @generated
	 */
	public Adapter createPlatformEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.LockResource <em>Lock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.LockResource
	 * @generated
	 */
	public Adapter createLockResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.DeployedSoftwareSystem <em>Deployed Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.DeployedSoftwareSystem
	 * @generated
	 */
	public Adapter createDeployedSoftwareSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.DeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.DeployedComponent
	 * @generated
	 */
	public Adapter createDeployedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.DeployedResource <em>Deployed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.DeployedResource
	 * @generated
	 */
	public Adapter createDeployedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Loads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Loads
	 * @generated
	 */
	public Adapter createLoadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Spawns <em>Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Spawns
	 * @generated
	 */
	public Adapter createSpawnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.RuntimeResource <em>Runtime Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.RuntimeResource
	 * @generated
	 */
	public Adapter createRuntimeResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.ReadsResource <em>Reads Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.ReadsResource
	 * @generated
	 */
	public Adapter createReadsResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.WritesResource <em>Writes Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.WritesResource
	 * @generated
	 */
	public Adapter createWritesResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.ManagesResource <em>Manages Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.ManagesResource
	 * @generated
	 */
	public Adapter createManagesResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.DefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.DefinedBy
	 * @generated
	 */
	public Adapter createDefinedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.platform.StreamResource <em>Stream Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.platform.StreamResource
	 * @generated
	 */
	public Adapter createStreamResourceAdapter() {
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

} //PlatformAdapterFactory
