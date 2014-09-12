/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorePackageImpl.java,v 1.1 2008/01/14 09:18:31 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core.impl;

import gts.modernization.model.GVQ.Core.CoreFactory;
import gts.modernization.model.GVQ.Core.CorePackage;
import gts.modernization.model.GVQ.Core.FromElement;
import gts.modernization.model.GVQ.Core.Hash;
import gts.modernization.model.GVQ.Core.HashValue;
import gts.modernization.model.GVQ.Core.HashValueType;
import gts.modernization.model.GVQ.Core.InitUnit;
import gts.modernization.model.GVQ.Core.InitUnitElement;
import gts.modernization.model.GVQ.Core.InitUnitElementValue;
import gts.modernization.model.GVQ.Core.InitUnitElementValueType;
import gts.modernization.model.GVQ.Core.InitUnitGroup;
import gts.modernization.model.GVQ.Core.InitUnitGroupType;
import gts.modernization.model.GVQ.Core.Parameter;
import gts.modernization.model.GVQ.Core.ParameterType;
import gts.modernization.model.GVQ.Core.Rule;
import gts.modernization.model.GVQ.Core.ToElement;
import gts.modernization.model.GVQ.Core.ValueParameter;
import gts.modernization.model.GVQ.Core.ValueParameterType;
import gts.modernization.model.GVQ.Core.ViewDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import gts.modernization.model.GVQ.Core.impl.CorePackageImpl;
import gts.modernization.model.GVQ.Query.QueryPackage;
import gts.modernization.model.GVQ.Query.impl.QueryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initUnitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initUnitElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initUnitGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initUnitElementValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initUnitGroupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hashValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefinitionEClass = null;

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
	 * @see gts.modernization.model.GVQ.Core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_From() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_To() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Queries() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Inits() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromElement() {
		return fromElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromElement_Name() {
		return (EAttribute)fromElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromElement_Filter() {
		return (EReference)fromElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromElement_Alias() {
		return (EAttribute)fromElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToElement() {
		return toElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToElement_Name() {
		return (EAttribute)toElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToElement_Alias() {
		return (EAttribute)toElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Context() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitUnit() {
		return initUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitUnitElement() {
		return initUnitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitElement_Element() {
		return (EAttribute)initUnitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitElement_Extension() {
		return (EAttribute)initUnitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitUnitElement_Value() {
		return (EReference)initUnitElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitUnitElementValue() {
		return initUnitElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitElementValue_Type() {
		return (EAttribute)initUnitElementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitElementValue_Value() {
		return (EAttribute)initUnitElementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitElementValue_Extension() {
		return (EAttribute)initUnitElementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitUnitElementValue_Params() {
		return (EReference)initUnitElementValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitUnitGroup() {
		return initUnitGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitUnitGroup_Type() {
		return (EAttribute)initUnitGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitUnitGroup_Inits() {
		return (EReference)initUnitGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitUnitGroup_Expression() {
		return (EReference)initUnitGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ValuePosition() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Extension() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ExtensionPosition() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHash() {
		return hashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHash_Name() {
		return (EAttribute)hashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHash_Content() {
		return (EReference)hashEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashValue() {
		return hashValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashValue_FromElement() {
		return (EAttribute)hashValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashValue_FromElementType() {
		return (EAttribute)hashValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashValue_ToElement() {
		return (EAttribute)hashValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashValue_ToElementType() {
		return (EAttribute)hashValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitUnitElementValueType() {
		return initUnitElementValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitUnitGroupType() {
		return initUnitGroupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHashValueType() {
		return hashValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDefinition() {
		return viewDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDefinition_Name() {
		return (EAttribute)viewDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDefinition_Hashes() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDefinition_Rules() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		viewDefinitionEClass = createEClass(VIEW_DEFINITION);
		createEAttribute(viewDefinitionEClass, VIEW_DEFINITION__NAME);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__HASHES);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__RULES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEReference(ruleEClass, RULE__FROM);
		createEReference(ruleEClass, RULE__TO);
		createEAttribute(ruleEClass, RULE__CONTEXT);
		createEReference(ruleEClass, RULE__QUERIES);
		createEReference(ruleEClass, RULE__INITS);

		fromElementEClass = createEClass(FROM_ELEMENT);
		createEAttribute(fromElementEClass, FROM_ELEMENT__NAME);
		createEReference(fromElementEClass, FROM_ELEMENT__FILTER);
		createEAttribute(fromElementEClass, FROM_ELEMENT__ALIAS);

		toElementEClass = createEClass(TO_ELEMENT);
		createEAttribute(toElementEClass, TO_ELEMENT__NAME);
		createEAttribute(toElementEClass, TO_ELEMENT__ALIAS);

		initUnitEClass = createEClass(INIT_UNIT);

		initUnitElementEClass = createEClass(INIT_UNIT_ELEMENT);
		createEAttribute(initUnitElementEClass, INIT_UNIT_ELEMENT__ELEMENT);
		createEAttribute(initUnitElementEClass, INIT_UNIT_ELEMENT__EXTENSION);
		createEReference(initUnitElementEClass, INIT_UNIT_ELEMENT__VALUE);

		initUnitElementValueEClass = createEClass(INIT_UNIT_ELEMENT_VALUE);
		createEAttribute(initUnitElementValueEClass, INIT_UNIT_ELEMENT_VALUE__TYPE);
		createEAttribute(initUnitElementValueEClass, INIT_UNIT_ELEMENT_VALUE__VALUE);
		createEAttribute(initUnitElementValueEClass, INIT_UNIT_ELEMENT_VALUE__EXTENSION);
		createEReference(initUnitElementValueEClass, INIT_UNIT_ELEMENT_VALUE__PARAMS);

		initUnitGroupEClass = createEClass(INIT_UNIT_GROUP);
		createEAttribute(initUnitGroupEClass, INIT_UNIT_GROUP__TYPE);
		createEReference(initUnitGroupEClass, INIT_UNIT_GROUP__INITS);
		createEReference(initUnitGroupEClass, INIT_UNIT_GROUP__EXPRESSION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__VALUE_POSITION);
		createEAttribute(parameterEClass, PARAMETER__EXTENSION);
		createEAttribute(parameterEClass, PARAMETER__EXTENSION_POSITION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		hashEClass = createEClass(HASH);
		createEAttribute(hashEClass, HASH__NAME);
		createEReference(hashEClass, HASH__CONTENT);

		hashValueEClass = createEClass(HASH_VALUE);
		createEAttribute(hashValueEClass, HASH_VALUE__FROM_ELEMENT);
		createEAttribute(hashValueEClass, HASH_VALUE__FROM_ELEMENT_TYPE);
		createEAttribute(hashValueEClass, HASH_VALUE__TO_ELEMENT);
		createEAttribute(hashValueEClass, HASH_VALUE__TO_ELEMENT_TYPE);

		// Create enums
		initUnitElementValueTypeEEnum = createEEnum(INIT_UNIT_ELEMENT_VALUE_TYPE);
		initUnitGroupTypeEEnum = createEEnum(INIT_UNIT_GROUP_TYPE);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		hashValueTypeEEnum = createEEnum(HASH_VALUE_TYPE);
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
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initUnitElementEClass.getESuperTypes().add(this.getInitUnit());
		initUnitGroupEClass.getESuperTypes().add(this.getInitUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(viewDefinitionEClass, ViewDefinition.class, "ViewDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinition_Hashes(), this.getHash(), null, "hashes", null, 0, -1, ViewDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinition_Rules(), this.getRule(), null, "rules", null, 0, -1, ViewDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_From(), this.getFromElement(), null, "from", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_To(), this.getToElement(), null, "to", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Context(), ecorePackage.getEString(), "context", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Queries(), theQueryPackage.getQueryUnit(), null, "queries", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Inits(), this.getInitUnitGroup(), null, "inits", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromElementEClass, FromElement.class, "FromElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FromElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFromElement_Filter(), theQueryPackage.getFilterUnit(), null, "filter", null, 0, 1, FromElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromElement_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, FromElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toElementEClass, ToElement.class, "ToElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ToElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToElement_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ToElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initUnitEClass, InitUnit.class, "InitUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initUnitElementEClass, InitUnitElement.class, "InitUnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitUnitElement_Element(), ecorePackage.getEString(), "element", null, 0, 1, InitUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitUnitElement_Extension(), ecorePackage.getEString(), "extension", null, 0, -1, InitUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitUnitElement_Value(), this.getInitUnitElementValue(), null, "value", null, 0, 1, InitUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initUnitElementValueEClass, InitUnitElementValue.class, "InitUnitElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitUnitElementValue_Type(), this.getInitUnitElementValueType(), "type", null, 0, 1, InitUnitElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitUnitElementValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, InitUnitElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitUnitElementValue_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, InitUnitElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitUnitElementValue_Params(), this.getParameter(), null, "params", null, 0, -1, InitUnitElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initUnitGroupEClass, InitUnitGroup.class, "InitUnitGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitUnitGroup_Type(), this.getInitUnitGroupType(), "type", null, 0, 1, InitUnitGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitUnitGroup_Inits(), this.getInitUnit(), null, "inits", null, 0, -1, InitUnitGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitUnitGroup_Expression(), theQueryPackage.getFilterExpression(), null, "expression", null, 0, 1, InitUnitGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ValuePosition(), ecorePackage.getEString(), "valuePosition", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ExtensionPosition(), ecorePackage.getEString(), "extensionPosition", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashEClass, Hash.class, "Hash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHash_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHash_Content(), this.getHashValue(), null, "content", null, 0, -1, Hash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashValueEClass, HashValue.class, "HashValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashValue_FromElement(), ecorePackage.getEString(), "fromElement", null, 0, 1, HashValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashValue_FromElementType(), this.getHashValueType(), "fromElementType", null, 0, 1, HashValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashValue_ToElement(), ecorePackage.getEString(), "toElement", null, 0, 1, HashValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashValue_ToElementType(), this.getHashValueType(), "toElementType", null, 0, 1, HashValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(initUnitElementValueTypeEEnum, InitUnitElementValueType.class, "InitUnitElementValueType");
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.VALUE);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.QUERY_RESULT);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.QUERY_ACCESS);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.OPERATION_CONCAT);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.OPERATION_CREATION);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.HASH);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.OPERATION_CODE);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.OPERATION_CALL);
		addEEnumLiteral(initUnitElementValueTypeEEnum, InitUnitElementValueType.OPERATION_REMOVE_QUOTES);

		initEEnum(initUnitGroupTypeEEnum, InitUnitGroupType.class, "InitUnitGroupType");
		addEEnumLiteral(initUnitGroupTypeEEnum, InitUnitGroupType.NORMAL);
		addEEnumLiteral(initUnitGroupTypeEEnum, InitUnitGroupType.IF);
		addEEnumLiteral(initUnitGroupTypeEEnum, InitUnitGroupType.ELSE);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING_VALUE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.NUMBER_VALUE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.QUERY_ACCESS);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.VARIABLE);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.MULTIPLE);

		initEEnum(hashValueTypeEEnum, HashValueType.class, "HashValueType");
		addEEnumLiteral(hashValueTypeEEnum, HashValueType.VALUE);
		addEEnumLiteral(hashValueTypeEEnum, HashValueType.GRAMMAR_ELEMENT);
		addEEnumLiteral(hashValueTypeEEnum, HashValueType.METAMODEL_ELEMENT);
		addEEnumLiteral(hashValueTypeEEnum, HashValueType.DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}
} //CorePackageImpl
