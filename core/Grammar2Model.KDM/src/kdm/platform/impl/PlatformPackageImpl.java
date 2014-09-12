/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.impl;

import kdm.action.ActionPackage;

import kdm.action.impl.ActionPackageImpl;

import kdm.build.BuildPackage;

import kdm.build.impl.BuildPackageImpl;

import kdm.code.CodePackage;

import kdm.code.impl.CodePackageImpl;

import kdm.conceptual.ConceptualPackage;

import kdm.conceptual.impl.ConceptualPackageImpl;

import kdm.core.CorePackage;

import kdm.core.impl.CorePackageImpl;

import kdm.data.DataPackage;

import kdm.data.impl.DataPackageImpl;

import kdm.event.EventPackage;

import kdm.event.impl.EventPackageImpl;

import kdm.kdm.KdmPackage;

import kdm.kdm.impl.KdmPackageImpl;

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

import kdm.source.SourcePackage;

import kdm.source.impl.SourcePackageImpl;

import kdm.structure.StructurePackage;

import kdm.structure.impl.StructurePackageImpl;

import kdm.ui.UiPackage;

import kdm.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPlatformElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPlatformRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marshalledResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindsToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedSoftwareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spawnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readsResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writesResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managesResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamResourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kdm.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PlatformPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPlatformElement() {
		return abstractPlatformElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Source() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Relation() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Abstraction() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Implementation() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformModel() {
		return platformModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_PlatformElement() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPlatformRelationship() {
		return abstractPlatformRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_To() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_From() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_PlatformElement() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingResource() {
		return namingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarshalledResource() {
		return marshalledResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagingResource() {
		return messagingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileResource() {
		return fileResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionResource() {
		return executionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformAction() {
		return platformActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformAction_Kind() {
		return (EAttribute)platformActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformAction_PlatformElement() {
		return (EReference)platformActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalActor() {
		return externalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataManager() {
		return dataManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindsTo() {
		return bindsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindsTo_To() {
		return (EReference)bindsToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindsTo_From() {
		return (EReference)bindsToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformElement() {
		return platformElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformRelationship() {
		return platformRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformRelationship_To() {
		return (EReference)platformRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformRelationship_From() {
		return (EReference)platformRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformEvent() {
		return platformEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformEvent_Kind() {
		return (EAttribute)platformEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLockResource() {
		return lockResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedSoftwareSystem() {
		return deployedSoftwareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedSoftwareSystem_GroupedComponent() {
		return (EReference)deployedSoftwareSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_DeployedComponent() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_DeployedResource() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedComponent() {
		return deployedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedComponent_GroupedCode() {
		return (EReference)deployedComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedResource() {
		return deployedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedResource_PlatformElement() {
		return (EReference)deployedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoads() {
		return loadsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoads_To() {
		return (EReference)loadsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoads_From() {
		return (EReference)loadsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpawns() {
		return spawnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpawns_To() {
		return (EReference)spawnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpawns_From() {
		return (EReference)spawnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResource() {
		return runtimeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadsResource() {
		return readsResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsResource_To() {
		return (EReference)readsResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsResource_From() {
		return (EReference)readsResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritesResource() {
		return writesResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritesResource_To() {
		return (EReference)writesResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritesResource_From() {
		return (EReference)writesResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagesResource() {
		return managesResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagesResource_To() {
		return (EReference)managesResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagesResource_From() {
		return (EReference)managesResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedBy() {
		return definedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedBy_To() {
		return (EReference)definedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedBy_From() {
		return (EReference)definedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamResource() {
		return streamResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractPlatformElementEClass = createEClass(ABSTRACT_PLATFORM_ELEMENT);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__SOURCE);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__RELATION);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION);

		platformModelEClass = createEClass(PLATFORM_MODEL);
		createEReference(platformModelEClass, PLATFORM_MODEL__PLATFORM_ELEMENT);

		abstractPlatformRelationshipEClass = createEClass(ABSTRACT_PLATFORM_RELATIONSHIP);

		requiresEClass = createEClass(REQUIRES);
		createEReference(requiresEClass, REQUIRES__TO);
		createEReference(requiresEClass, REQUIRES__FROM);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__PLATFORM_ELEMENT);

		namingResourceEClass = createEClass(NAMING_RESOURCE);

		marshalledResourceEClass = createEClass(MARSHALLED_RESOURCE);

		messagingResourceEClass = createEClass(MESSAGING_RESOURCE);

		fileResourceEClass = createEClass(FILE_RESOURCE);

		executionResourceEClass = createEClass(EXECUTION_RESOURCE);

		platformActionEClass = createEClass(PLATFORM_ACTION);
		createEAttribute(platformActionEClass, PLATFORM_ACTION__KIND);
		createEReference(platformActionEClass, PLATFORM_ACTION__PLATFORM_ELEMENT);

		externalActorEClass = createEClass(EXTERNAL_ACTOR);

		dataManagerEClass = createEClass(DATA_MANAGER);

		bindsToEClass = createEClass(BINDS_TO);
		createEReference(bindsToEClass, BINDS_TO__TO);
		createEReference(bindsToEClass, BINDS_TO__FROM);

		platformElementEClass = createEClass(PLATFORM_ELEMENT);

		platformRelationshipEClass = createEClass(PLATFORM_RELATIONSHIP);
		createEReference(platformRelationshipEClass, PLATFORM_RELATIONSHIP__TO);
		createEReference(platformRelationshipEClass, PLATFORM_RELATIONSHIP__FROM);

		platformEventEClass = createEClass(PLATFORM_EVENT);
		createEAttribute(platformEventEClass, PLATFORM_EVENT__KIND);

		lockResourceEClass = createEClass(LOCK_RESOURCE);

		deployedSoftwareSystemEClass = createEClass(DEPLOYED_SOFTWARE_SYSTEM);
		createEReference(deployedSoftwareSystemEClass, DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__DEPLOYED_COMPONENT);
		createEReference(machineEClass, MACHINE__DEPLOYED_RESOURCE);

		deployedComponentEClass = createEClass(DEPLOYED_COMPONENT);
		createEReference(deployedComponentEClass, DEPLOYED_COMPONENT__GROUPED_CODE);

		deployedResourceEClass = createEClass(DEPLOYED_RESOURCE);
		createEReference(deployedResourceEClass, DEPLOYED_RESOURCE__PLATFORM_ELEMENT);

		loadsEClass = createEClass(LOADS);
		createEReference(loadsEClass, LOADS__TO);
		createEReference(loadsEClass, LOADS__FROM);

		spawnsEClass = createEClass(SPAWNS);
		createEReference(spawnsEClass, SPAWNS__TO);
		createEReference(spawnsEClass, SPAWNS__FROM);

		runtimeResourceEClass = createEClass(RUNTIME_RESOURCE);

		threadEClass = createEClass(THREAD);

		processEClass = createEClass(PROCESS);

		readsResourceEClass = createEClass(READS_RESOURCE);
		createEReference(readsResourceEClass, READS_RESOURCE__TO);
		createEReference(readsResourceEClass, READS_RESOURCE__FROM);

		writesResourceEClass = createEClass(WRITES_RESOURCE);
		createEReference(writesResourceEClass, WRITES_RESOURCE__TO);
		createEReference(writesResourceEClass, WRITES_RESOURCE__FROM);

		managesResourceEClass = createEClass(MANAGES_RESOURCE);
		createEReference(managesResourceEClass, MANAGES_RESOURCE__TO);
		createEReference(managesResourceEClass, MANAGES_RESOURCE__FROM);

		definedByEClass = createEClass(DEFINED_BY);
		createEReference(definedByEClass, DEFINED_BY__TO);
		createEReference(definedByEClass, DEFINED_BY__FROM);

		streamResourceEClass = createEClass(STREAM_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		KdmPackage theKdmPackage = (KdmPackage)EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractPlatformElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		platformModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractPlatformRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		requiresEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		resourceTypeEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		namingResourceEClass.getESuperTypes().add(this.getResourceType());
		marshalledResourceEClass.getESuperTypes().add(this.getResourceType());
		messagingResourceEClass.getESuperTypes().add(this.getResourceType());
		fileResourceEClass.getESuperTypes().add(this.getResourceType());
		executionResourceEClass.getESuperTypes().add(this.getResourceType());
		platformActionEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		externalActorEClass.getESuperTypes().add(this.getPlatformAction());
		dataManagerEClass.getESuperTypes().add(this.getResourceType());
		bindsToEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		platformElementEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		platformRelationshipEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		platformEventEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		lockResourceEClass.getESuperTypes().add(this.getResourceType());
		deployedSoftwareSystemEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		machineEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		deployedComponentEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		deployedResourceEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		loadsEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		spawnsEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		runtimeResourceEClass.getESuperTypes().add(this.getResourceType());
		threadEClass.getESuperTypes().add(this.getRuntimeResource());
		processEClass.getESuperTypes().add(this.getRuntimeResource());
		readsResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		writesResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		managesResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		definedByEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		streamResourceEClass.getESuperTypes().add(this.getResourceType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractPlatformElementEClass, AbstractPlatformElement.class, "AbstractPlatformElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPlatformElement_Source(), theSourcePackage.getSourceRef(), null, "source", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractPlatformElement_Relation(), this.getAbstractPlatformRelationship(), null, "relation", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractPlatformElement_Abstraction(), theActionPackage.getActionElement(), null, "abstraction", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPlatformElement_Implementation(), theCodePackage.getAbstractCodeElement(), null, "implementation", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(platformModelEClass, PlatformModel.class, "PlatformModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformModel_PlatformElement(), this.getAbstractPlatformElement(), null, "platformElement", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractPlatformRelationshipEClass, AbstractPlatformRelationship.class, "AbstractPlatformRelationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequires_To(), this.getAbstractPlatformElement(), null, "to", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequires_From(), this.getDeployedComponent(), null, "from", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceType_PlatformElement(), this.getAbstractPlatformElement(), null, "platformElement", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namingResourceEClass, NamingResource.class, "NamingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(marshalledResourceEClass, MarshalledResource.class, "MarshalledResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messagingResourceEClass, MessagingResource.class, "MessagingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileResourceEClass, FileResource.class, "FileResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionResourceEClass, ExecutionResource.class, "ExecutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformActionEClass, PlatformAction.class, "PlatformAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatformAction_Kind(), theCorePackage.getString(), "kind", null, 0, 1, PlatformAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformAction_PlatformElement(), this.getPlatformEvent(), null, "platformElement", null, 0, -1, PlatformAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalActorEClass, ExternalActor.class, "ExternalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataManagerEClass, DataManager.class, "DataManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindsToEClass, BindsTo.class, "BindsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindsTo_To(), this.getResourceType(), null, "to", null, 1, 1, BindsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBindsTo_From(), this.getResourceType(), null, "from", null, 1, 1, BindsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(platformElementEClass, PlatformElement.class, "PlatformElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformRelationshipEClass, PlatformRelationship.class, "PlatformRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, PlatformRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPlatformRelationship_From(), this.getAbstractPlatformElement(), null, "from", null, 1, 1, PlatformRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(platformEventEClass, PlatformEvent.class, "PlatformEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatformEvent_Kind(), theCorePackage.getString(), "kind", null, 0, 1, PlatformEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockResourceEClass, LockResource.class, "LockResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deployedSoftwareSystemEClass, DeployedSoftwareSystem.class, "DeployedSoftwareSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedSoftwareSystem_GroupedComponent(), this.getDeployedComponent(), null, "groupedComponent", null, 0, -1, DeployedSoftwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_DeployedComponent(), this.getDeployedComponent(), null, "deployedComponent", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_DeployedResource(), this.getDeployedResource(), null, "deployedResource", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedComponentEClass, DeployedComponent.class, "DeployedComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedComponent_GroupedCode(), theCodePackage.getModule(), null, "groupedCode", null, 0, -1, DeployedComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedResourceEClass, DeployedResource.class, "DeployedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedResource_PlatformElement(), this.getResourceType(), null, "platformElement", null, 0, -1, DeployedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loadsEClass, Loads.class, "Loads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoads_To(), this.getDeployedComponent(), null, "to", null, 1, 1, Loads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoads_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, Loads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(spawnsEClass, Spawns.class, "Spawns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpawns_To(), this.getRuntimeResource(), null, "to", null, 1, 1, Spawns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpawns_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, Spawns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runtimeResourceEClass, RuntimeResource.class, "RuntimeResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadEClass, kdm.platform.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, kdm.platform.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readsResourceEClass, ReadsResource.class, "ReadsResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadsResource_To(), this.getResourceType(), null, "to", null, 1, 1, ReadsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadsResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ReadsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writesResourceEClass, WritesResource.class, "WritesResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWritesResource_To(), this.getResourceType(), null, "to", null, 1, 1, WritesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWritesResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, WritesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(managesResourceEClass, ManagesResource.class, "ManagesResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagesResource_To(), this.getResourceType(), null, "to", null, 1, 1, ManagesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getManagesResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ManagesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(definedByEClass, DefinedBy.class, "DefinedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinedBy_To(), theCodePackage.getCodeItem(), null, "to", null, 1, 1, DefinedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinedBy_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, DefinedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(streamResourceEClass, StreamResource.class, "StreamResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PlatformPackageImpl
