/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.impl;

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
import kdm.platform.PlatformFactory;
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
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/platform"); 
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
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
			case PlatformPackage.PLATFORM_MODEL: return createPlatformModel();
			case PlatformPackage.REQUIRES: return createRequires();
			case PlatformPackage.RESOURCE_TYPE: return createResourceType();
			case PlatformPackage.NAMING_RESOURCE: return createNamingResource();
			case PlatformPackage.MARSHALLED_RESOURCE: return createMarshalledResource();
			case PlatformPackage.MESSAGING_RESOURCE: return createMessagingResource();
			case PlatformPackage.FILE_RESOURCE: return createFileResource();
			case PlatformPackage.EXECUTION_RESOURCE: return createExecutionResource();
			case PlatformPackage.PLATFORM_ACTION: return createPlatformAction();
			case PlatformPackage.EXTERNAL_ACTOR: return createExternalActor();
			case PlatformPackage.DATA_MANAGER: return createDataManager();
			case PlatformPackage.BINDS_TO: return createBindsTo();
			case PlatformPackage.PLATFORM_ELEMENT: return createPlatformElement();
			case PlatformPackage.PLATFORM_RELATIONSHIP: return createPlatformRelationship();
			case PlatformPackage.PLATFORM_EVENT: return createPlatformEvent();
			case PlatformPackage.LOCK_RESOURCE: return createLockResource();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM: return createDeployedSoftwareSystem();
			case PlatformPackage.MACHINE: return createMachine();
			case PlatformPackage.DEPLOYED_COMPONENT: return createDeployedComponent();
			case PlatformPackage.DEPLOYED_RESOURCE: return createDeployedResource();
			case PlatformPackage.LOADS: return createLoads();
			case PlatformPackage.SPAWNS: return createSpawns();
			case PlatformPackage.RUNTIME_RESOURCE: return createRuntimeResource();
			case PlatformPackage.THREAD: return createThread();
			case PlatformPackage.PROCESS: return createProcess();
			case PlatformPackage.READS_RESOURCE: return createReadsResource();
			case PlatformPackage.WRITES_RESOURCE: return createWritesResource();
			case PlatformPackage.MANAGES_RESOURCE: return createManagesResource();
			case PlatformPackage.DEFINED_BY: return createDefinedBy();
			case PlatformPackage.STREAM_RESOURCE: return createStreamResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel createPlatformModel() {
		PlatformModelImpl platformModel = new PlatformModelImpl();
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requires createRequires() {
		RequiresImpl requires = new RequiresImpl();
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingResource createNamingResource() {
		NamingResourceImpl namingResource = new NamingResourceImpl();
		return namingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarshalledResource createMarshalledResource() {
		MarshalledResourceImpl marshalledResource = new MarshalledResourceImpl();
		return marshalledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingResource createMessagingResource() {
		MessagingResourceImpl messagingResource = new MessagingResourceImpl();
		return messagingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileResource createFileResource() {
		FileResourceImpl fileResource = new FileResourceImpl();
		return fileResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionResource createExecutionResource() {
		ExecutionResourceImpl executionResource = new ExecutionResourceImpl();
		return executionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAction createPlatformAction() {
		PlatformActionImpl platformAction = new PlatformActionImpl();
		return platformAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalActor createExternalActor() {
		ExternalActorImpl externalActor = new ExternalActorImpl();
		return externalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManager createDataManager() {
		DataManagerImpl dataManager = new DataManagerImpl();
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindsTo createBindsTo() {
		BindsToImpl bindsTo = new BindsToImpl();
		return bindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformElement createPlatformElement() {
		PlatformElementImpl platformElement = new PlatformElementImpl();
		return platformElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformRelationship createPlatformRelationship() {
		PlatformRelationshipImpl platformRelationship = new PlatformRelationshipImpl();
		return platformRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformEvent createPlatformEvent() {
		PlatformEventImpl platformEvent = new PlatformEventImpl();
		return platformEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockResource createLockResource() {
		LockResourceImpl lockResource = new LockResourceImpl();
		return lockResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedSoftwareSystem createDeployedSoftwareSystem() {
		DeployedSoftwareSystemImpl deployedSoftwareSystem = new DeployedSoftwareSystemImpl();
		return deployedSoftwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedComponent createDeployedComponent() {
		DeployedComponentImpl deployedComponent = new DeployedComponentImpl();
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedResource createDeployedResource() {
		DeployedResourceImpl deployedResource = new DeployedResourceImpl();
		return deployedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loads createLoads() {
		LoadsImpl loads = new LoadsImpl();
		return loads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spawns createSpawns() {
		SpawnsImpl spawns = new SpawnsImpl();
		return spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResource createRuntimeResource() {
		RuntimeResourceImpl runtimeResource = new RuntimeResourceImpl();
		return runtimeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kdm.platform.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kdm.platform.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadsResource createReadsResource() {
		ReadsResourceImpl readsResource = new ReadsResourceImpl();
		return readsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritesResource createWritesResource() {
		WritesResourceImpl writesResource = new WritesResourceImpl();
		return writesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagesResource createManagesResource() {
		ManagesResourceImpl managesResource = new ManagesResourceImpl();
		return managesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedBy createDefinedBy() {
		DefinedByImpl definedBy = new DefinedByImpl();
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamResource createStreamResource() {
		StreamResourceImpl streamResource = new StreamResourceImpl();
		return streamResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
