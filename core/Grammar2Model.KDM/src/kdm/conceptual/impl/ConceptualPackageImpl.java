/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual.impl;

import kdm.action.ActionPackage;

import kdm.action.impl.ActionPackageImpl;

import kdm.build.BuildPackage;

import kdm.build.impl.BuildPackageImpl;

import kdm.code.CodePackage;

import kdm.code.impl.CodePackageImpl;

import kdm.conceptual.AbstractConceptualElement;
import kdm.conceptual.AbstractConceptualRelationship;
import kdm.conceptual.BehaviorUnit;
import kdm.conceptual.ConceptualContainer;
import kdm.conceptual.ConceptualElement;
import kdm.conceptual.ConceptualFactory;
import kdm.conceptual.ConceptualFlow;
import kdm.conceptual.ConceptualModel;
import kdm.conceptual.ConceptualPackage;
import kdm.conceptual.ConceptualRelationship;
import kdm.conceptual.ConceptualRole;
import kdm.conceptual.FactUnit;
import kdm.conceptual.RuleUnit;
import kdm.conceptual.ScenarioUnit;
import kdm.conceptual.TermUnit;

import kdm.core.CorePackage;

import kdm.core.impl.CorePackageImpl;

import kdm.data.DataPackage;

import kdm.data.impl.DataPackageImpl;

import kdm.event.EventPackage;

import kdm.event.impl.EventPackageImpl;

import kdm.kdm.KdmPackage;

import kdm.kdm.impl.KdmPackageImpl;

import kdm.platform.PlatformPackage;

import kdm.platform.impl.PlatformPackageImpl;

import kdm.source.SourcePackage;

import kdm.source.impl.SourcePackageImpl;

import kdm.structure.StructurePackage;

import kdm.structure.impl.StructurePackageImpl;

import kdm.ui.UiPackage;

import kdm.ui.impl.UiPackageImpl;

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
public class ConceptualPackageImpl extends EPackageImpl implements ConceptualPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConceptualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConceptualRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualRoleEClass = null;

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
	 * @see kdm.conceptual.ConceptualPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConceptualPackageImpl() {
		super(eNS_URI, ConceptualFactory.eINSTANCE);
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
	public static ConceptualPackage init() {
		if (isInited) return (ConceptualPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI);

		// Obtain or create and register package
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ConceptualPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theConceptualPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theConceptualPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConceptualPackage.freeze();

		return theConceptualPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualModel() {
		return conceptualModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualModel_ConceptualElement() {
		return (EReference)conceptualModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConceptualElement() {
		return abstractConceptualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConceptualElement_Source() {
		return (EReference)abstractConceptualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConceptualElement_Implementation() {
		return (EReference)abstractConceptualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConceptualElement_ConceptualRelation() {
		return (EReference)abstractConceptualElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConceptualElement_Abstraction() {
		return (EReference)abstractConceptualElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermUnit() {
		return termUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualContainer() {
		return conceptualContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualContainer_ConceptualElement() {
		return (EReference)conceptualContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactUnit() {
		return factUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConceptualRelationship() {
		return abstractConceptualRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualRelationship() {
		return conceptualRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualRelationship_To() {
		return (EReference)conceptualRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualRelationship_From() {
		return (EReference)conceptualRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorUnit() {
		return behaviorUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleUnit() {
		return ruleUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioUnit() {
		return scenarioUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualFlow() {
		return conceptualFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualFlow_To() {
		return (EReference)conceptualFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualFlow_From() {
		return (EReference)conceptualFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualElement() {
		return conceptualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualRole() {
		return conceptualRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualRole_ConceptualElement() {
		return (EReference)conceptualRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualFactory getConceptualFactory() {
		return (ConceptualFactory)getEFactoryInstance();
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
		conceptualModelEClass = createEClass(CONCEPTUAL_MODEL);
		createEReference(conceptualModelEClass, CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT);

		abstractConceptualElementEClass = createEClass(ABSTRACT_CONCEPTUAL_ELEMENT);
		createEReference(abstractConceptualElementEClass, ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE);
		createEReference(abstractConceptualElementEClass, ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION);
		createEReference(abstractConceptualElementEClass, ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION);
		createEReference(abstractConceptualElementEClass, ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION);

		termUnitEClass = createEClass(TERM_UNIT);

		conceptualContainerEClass = createEClass(CONCEPTUAL_CONTAINER);
		createEReference(conceptualContainerEClass, CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT);

		factUnitEClass = createEClass(FACT_UNIT);

		abstractConceptualRelationshipEClass = createEClass(ABSTRACT_CONCEPTUAL_RELATIONSHIP);

		conceptualRelationshipEClass = createEClass(CONCEPTUAL_RELATIONSHIP);
		createEReference(conceptualRelationshipEClass, CONCEPTUAL_RELATIONSHIP__TO);
		createEReference(conceptualRelationshipEClass, CONCEPTUAL_RELATIONSHIP__FROM);

		behaviorUnitEClass = createEClass(BEHAVIOR_UNIT);

		ruleUnitEClass = createEClass(RULE_UNIT);

		scenarioUnitEClass = createEClass(SCENARIO_UNIT);

		conceptualFlowEClass = createEClass(CONCEPTUAL_FLOW);
		createEReference(conceptualFlowEClass, CONCEPTUAL_FLOW__TO);
		createEReference(conceptualFlowEClass, CONCEPTUAL_FLOW__FROM);

		conceptualElementEClass = createEClass(CONCEPTUAL_ELEMENT);

		conceptualRoleEClass = createEClass(CONCEPTUAL_ROLE);
		createEReference(conceptualRoleEClass, CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT);
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
		KdmPackage theKdmPackage = (KdmPackage)EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conceptualModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractConceptualElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		termUnitEClass.getESuperTypes().add(this.getAbstractConceptualElement());
		conceptualContainerEClass.getESuperTypes().add(this.getAbstractConceptualElement());
		factUnitEClass.getESuperTypes().add(this.getConceptualContainer());
		abstractConceptualRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		conceptualRelationshipEClass.getESuperTypes().add(this.getAbstractConceptualRelationship());
		behaviorUnitEClass.getESuperTypes().add(this.getConceptualContainer());
		ruleUnitEClass.getESuperTypes().add(this.getConceptualContainer());
		scenarioUnitEClass.getESuperTypes().add(this.getConceptualContainer());
		conceptualFlowEClass.getESuperTypes().add(this.getAbstractConceptualRelationship());
		conceptualElementEClass.getESuperTypes().add(this.getAbstractConceptualElement());
		conceptualRoleEClass.getESuperTypes().add(this.getAbstractConceptualElement());

		// Initialize classes and features; add operations and parameters
		initEClass(conceptualModelEClass, ConceptualModel.class, "ConceptualModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualModel_ConceptualElement(), this.getAbstractConceptualElement(), null, "conceptualElement", null, 0, -1, ConceptualModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractConceptualElementEClass, AbstractConceptualElement.class, "AbstractConceptualElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConceptualElement_Source(), theSourcePackage.getSourceRef(), null, "source", null, 0, -1, AbstractConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractConceptualElement_Implementation(), theCorePackage.getKDMEntity(), null, "implementation", null, 0, -1, AbstractConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractConceptualElement_ConceptualRelation(), this.getAbstractConceptualRelationship(), null, "conceptualRelation", null, 0, -1, AbstractConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractConceptualElement_Abstraction(), theActionPackage.getActionElement(), null, "abstraction", null, 0, -1, AbstractConceptualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termUnitEClass, TermUnit.class, "TermUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptualContainerEClass, ConceptualContainer.class, "ConceptualContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualContainer_ConceptualElement(), this.getAbstractConceptualElement(), null, "conceptualElement", null, 0, -1, ConceptualContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(factUnitEClass, FactUnit.class, "FactUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractConceptualRelationshipEClass, AbstractConceptualRelationship.class, "AbstractConceptualRelationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptualRelationshipEClass, ConceptualRelationship.class, "ConceptualRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, ConceptualRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConceptualRelationship_From(), this.getAbstractConceptualElement(), null, "from", null, 1, 1, ConceptualRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorUnitEClass, BehaviorUnit.class, "BehaviorUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleUnitEClass, RuleUnit.class, "RuleUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scenarioUnitEClass, ScenarioUnit.class, "ScenarioUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptualFlowEClass, ConceptualFlow.class, "ConceptualFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualFlow_To(), this.getConceptualContainer(), null, "to", null, 1, 1, ConceptualFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConceptualFlow_From(), this.getConceptualContainer(), null, "from", null, 1, 1, ConceptualFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptualElementEClass, ConceptualElement.class, "ConceptualElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptualRoleEClass, ConceptualRole.class, "ConceptualRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualRole_ConceptualElement(), this.getAbstractConceptualElement(), null, "conceptualElement", null, 1, 1, ConceptualRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConceptualPackageImpl
