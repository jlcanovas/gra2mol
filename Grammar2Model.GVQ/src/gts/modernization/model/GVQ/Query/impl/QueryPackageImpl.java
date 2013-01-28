/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryPackageImpl.java,v 1.1 2008/01/14 09:18:28 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;

import gts.modernization.model.GVQ.Core.CorePackage;
import gts.modernization.model.GVQ.Core.impl.CorePackageImpl;
import gts.modernization.model.GVQ.Query.ExpressionElement;
import gts.modernization.model.GVQ.Query.ExpressionElementType;
import gts.modernization.model.GVQ.Query.FilterExpression;
import gts.modernization.model.GVQ.Query.FilterExpressionComplex;
import gts.modernization.model.GVQ.Query.FilterExpressionType;
import gts.modernization.model.GVQ.Query.FilterExpressionUnit;
import gts.modernization.model.GVQ.Query.FilterOperationType;
import gts.modernization.model.GVQ.Query.FilterType;
import gts.modernization.model.GVQ.Query.FilterUnit;
import gts.modernization.model.GVQ.Query.OperationType;
import gts.modernization.model.GVQ.Query.QueryControl;
import gts.modernization.model.GVQ.Query.QueryControlFor;
import gts.modernization.model.GVQ.Query.QueryElement;
import gts.modernization.model.GVQ.Query.QueryElementType;
import gts.modernization.model.GVQ.Query.QueryFactory;
import gts.modernization.model.GVQ.Query.QueryPackage;
import gts.modernization.model.GVQ.Query.QueryUnit;


import gts.modernization.model.GVQ.Query.impl.QueryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPackageImpl extends EPackageImpl implements QueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryControlForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterExpressionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterExpressionComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterOperationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterExpressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryElementTypeEEnum = null;

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
	 * @see gts.modernization.model.GVQ.Query.QueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPackageImpl() {
		super(eNS_URI, QueryFactory.eINSTANCE);
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
	public static QueryPackage init() {
		if (isInited) return (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Obtain or create and register package
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QueryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theQueryPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theQueryPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPackage.freeze();

		return theQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryControl() {
		return queryControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryControlFor() {
		return queryControlForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlFor_Variable() {
		return (EAttribute)queryControlForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlFor_QueryVariable() {
		return (EAttribute)queryControlForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryUnit() {
		return queryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryUnit_Variable() {
		return (EAttribute)queryUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryUnit_Cast() {
		return (EAttribute)queryUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryUnit_Filter() {
		return (EReference)queryUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryUnit_Control() {
		return (EReference)queryUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterUnit() {
		return filterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterUnit_Type() {
		return (EAttribute)filterUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterUnit_Operation() {
		return (EAttribute)filterUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterUnit_Element() {
		return (EReference)filterUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterExpression() {
		return filterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterUnit_Next() {
		return (EReference)filterUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterUnit_Position() {
		return (EAttribute)filterUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterUnit_Expression() {
		return (EReference)filterUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterExpressionUnit() {
		return filterExpressionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpressionUnit_Element() {
		return (EReference)filterExpressionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterExpressionUnit_Operation() {
		return (EAttribute)filterExpressionUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterExpressionUnit_Global() {
		return (EAttribute)filterExpressionUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryElement() {
		return queryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryElement_Name() {
		return (EAttribute)queryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryElement_Type() {
		return (EAttribute)queryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryElement_Mark() {
		return (EAttribute)queryElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpressionUnit_Parameters() {
		return (EReference)filterExpressionUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionElement() {
		return expressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionElement_Name() {
		return (EAttribute)expressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionElement_Type() {
		return (EAttribute)expressionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionElement_Position() {
		return (EAttribute)expressionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterExpressionComplex() {
		return filterExpressionComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpressionComplex_Expressions() {
		return (EReference)filterExpressionComplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterExpressionComplex_Type() {
		return (EAttribute)filterExpressionComplexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterType() {
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterOperationType() {
		return filterOperationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterExpressionType() {
		return filterExpressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpressionElementType() {
		return expressionElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryElementType() {
		return queryElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactory getQueryFactory() {
		return (QueryFactory)getEFactoryInstance();
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
		queryUnitEClass = createEClass(QUERY_UNIT);
		createEAttribute(queryUnitEClass, QUERY_UNIT__VARIABLE);
		createEAttribute(queryUnitEClass, QUERY_UNIT__CAST);
		createEReference(queryUnitEClass, QUERY_UNIT__FILTER);
		createEReference(queryUnitEClass, QUERY_UNIT__CONTROL);

		queryControlEClass = createEClass(QUERY_CONTROL);

		queryControlForEClass = createEClass(QUERY_CONTROL_FOR);
		createEAttribute(queryControlForEClass, QUERY_CONTROL_FOR__VARIABLE);
		createEAttribute(queryControlForEClass, QUERY_CONTROL_FOR__QUERY_VARIABLE);

		filterUnitEClass = createEClass(FILTER_UNIT);
		createEAttribute(filterUnitEClass, FILTER_UNIT__TYPE);
		createEAttribute(filterUnitEClass, FILTER_UNIT__OPERATION);
		createEReference(filterUnitEClass, FILTER_UNIT__ELEMENT);
		createEReference(filterUnitEClass, FILTER_UNIT__EXPRESSION);
		createEReference(filterUnitEClass, FILTER_UNIT__NEXT);
		createEAttribute(filterUnitEClass, FILTER_UNIT__POSITION);

		queryElementEClass = createEClass(QUERY_ELEMENT);
		createEAttribute(queryElementEClass, QUERY_ELEMENT__NAME);
		createEAttribute(queryElementEClass, QUERY_ELEMENT__TYPE);
		createEAttribute(queryElementEClass, QUERY_ELEMENT__MARK);

		filterExpressionEClass = createEClass(FILTER_EXPRESSION);

		filterExpressionComplexEClass = createEClass(FILTER_EXPRESSION_COMPLEX);
		createEReference(filterExpressionComplexEClass, FILTER_EXPRESSION_COMPLEX__EXPRESSIONS);
		createEAttribute(filterExpressionComplexEClass, FILTER_EXPRESSION_COMPLEX__TYPE);

		filterExpressionUnitEClass = createEClass(FILTER_EXPRESSION_UNIT);
		createEReference(filterExpressionUnitEClass, FILTER_EXPRESSION_UNIT__ELEMENT);
		createEAttribute(filterExpressionUnitEClass, FILTER_EXPRESSION_UNIT__OPERATION);
		createEAttribute(filterExpressionUnitEClass, FILTER_EXPRESSION_UNIT__GLOBAL);
		createEReference(filterExpressionUnitEClass, FILTER_EXPRESSION_UNIT__PARAMETERS);

		expressionElementEClass = createEClass(EXPRESSION_ELEMENT);
		createEAttribute(expressionElementEClass, EXPRESSION_ELEMENT__NAME);
		createEAttribute(expressionElementEClass, EXPRESSION_ELEMENT__TYPE);
		createEAttribute(expressionElementEClass, EXPRESSION_ELEMENT__POSITION);

		// Create enums
		filterTypeEEnum = createEEnum(FILTER_TYPE);
		filterOperationTypeEEnum = createEEnum(FILTER_OPERATION_TYPE);
		queryElementTypeEEnum = createEEnum(QUERY_ELEMENT_TYPE);
		filterExpressionTypeEEnum = createEEnum(FILTER_EXPRESSION_TYPE);
		expressionElementTypeEEnum = createEEnum(EXPRESSION_ELEMENT_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		queryControlForEClass.getESuperTypes().add(this.getQueryControl());
		filterExpressionComplexEClass.getESuperTypes().add(this.getFilterExpression());
		filterExpressionUnitEClass.getESuperTypes().add(this.getFilterExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(queryUnitEClass, QueryUnit.class, "QueryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryUnit_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryUnit_Cast(), ecorePackage.getEString(), "cast", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryUnit_Filter(), this.getFilterUnit(), null, "filter", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryUnit_Control(), this.getQueryControl(), null, "control", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryControlEClass, QueryControl.class, "QueryControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryControlForEClass, QueryControlFor.class, "QueryControlFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryControlFor_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, QueryControlFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryControlFor_QueryVariable(), ecorePackage.getEString(), "queryVariable", null, 0, 1, QueryControlFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterUnitEClass, FilterUnit.class, "FilterUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterUnit_Type(), this.getFilterType(), "type", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterUnit_Operation(), this.getFilterOperationType(), "operation", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterUnit_Element(), this.getQueryElement(), null, "element", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterUnit_Expression(), this.getFilterExpression(), null, "expression", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterUnit_Next(), this.getFilterUnit(), null, "next", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterUnit_Position(), ecorePackage.getEInt(), "position", null, 0, 1, FilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryElementEClass, QueryElement.class, "QueryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryElement_Type(), this.getQueryElementType(), "type", null, 0, 1, QueryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryElement_Mark(), ecorePackage.getEBoolean(), "mark", null, 0, 1, QueryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterExpressionEClass, FilterExpression.class, "FilterExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterExpressionComplexEClass, FilterExpressionComplex.class, "FilterExpressionComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterExpressionComplex_Expressions(), this.getFilterExpression(), null, "expressions", null, 0, -1, FilterExpressionComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterExpressionComplex_Type(), this.getFilterExpressionType(), "type", null, 0, 1, FilterExpressionComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterExpressionUnitEClass, FilterExpressionUnit.class, "FilterExpressionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterExpressionUnit_Element(), this.getExpressionElement(), null, "element", null, 0, 1, FilterExpressionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterExpressionUnit_Operation(), this.getOperationType(), "operation", null, 0, 1, FilterExpressionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterExpressionUnit_Global(), ecorePackage.getEBoolean(), "global", null, 0, 1, FilterExpressionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterExpressionUnit_Parameters(), theCorePackage.getParameter(), null, "parameters", null, 0, -1, FilterExpressionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionElementEClass, ExpressionElement.class, "ExpressionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionElement_Type(), this.getExpressionElementType(), "type", null, 0, 1, ExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionElement_Position(), ecorePackage.getEInt(), "position", null, 0, 1, ExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(filterTypeEEnum, FilterType.class, "FilterType");
		addEEnumLiteral(filterTypeEEnum, FilterType.DIRECT);
		addEEnumLiteral(filterTypeEEnum, FilterType.INDIRECT);
		addEEnumLiteral(filterTypeEEnum, FilterType.RECURSIVE);

		initEEnum(filterOperationTypeEEnum, FilterOperationType.class, "FilterOperationType");
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.NORMAL);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.POSITION);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.UNIQUE);

		initEEnum(queryElementTypeEEnum, QueryElementType.class, "QueryElementType");
		addEEnumLiteral(queryElementTypeEEnum, QueryElementType.NODE);
		addEEnumLiteral(queryElementTypeEEnum, QueryElementType.LEAF);
		addEEnumLiteral(queryElementTypeEEnum, QueryElementType.TOKEN);

		initEEnum(filterExpressionTypeEEnum, FilterExpressionType.class, "FilterExpressionType");
		addEEnumLiteral(filterExpressionTypeEEnum, FilterExpressionType.AND);
		addEEnumLiteral(filterExpressionTypeEEnum, FilterExpressionType.OR);
		addEEnumLiteral(filterExpressionTypeEEnum, FilterExpressionType.NOT);

		initEEnum(expressionElementTypeEEnum, ExpressionElementType.class, "ExpressionElementType");
		addEEnumLiteral(expressionElementTypeEEnum, ExpressionElementType.LEAF);
		addEEnumLiteral(expressionElementTypeEEnum, ExpressionElementType.TOKEN);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.EQUALS);
		addEEnumLiteral(operationTypeEEnum, OperationType.EXISTS);
		addEEnumLiteral(operationTypeEEnum, OperationType.CHECK);
		addEEnumLiteral(operationTypeEEnum, OperationType.HASRESULTS);

		// Create resource
		createResource(eNS_URI);
	}

} //QueryPackageImpl
