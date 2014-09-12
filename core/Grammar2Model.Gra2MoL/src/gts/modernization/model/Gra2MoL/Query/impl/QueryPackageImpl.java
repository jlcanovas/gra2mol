/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/

package gts.modernization.model.Gra2MoL.Query.impl;

import gts.modernization.model.Gra2MoL.Core.CorePackage;

import gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl;

import gts.modernization.model.Gra2MoL.Query.ExpressionElement;
import gts.modernization.model.Gra2MoL.Query.ExpressionElementType;
import gts.modernization.model.Gra2MoL.Query.FilterExpression;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionType;
import gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit;
import gts.modernization.model.Gra2MoL.Query.FilterOperationType;
import gts.modernization.model.Gra2MoL.Query.FilterType;
import gts.modernization.model.Gra2MoL.Query.FilterUnit;
import gts.modernization.model.Gra2MoL.Query.OperationType;
import gts.modernization.model.Gra2MoL.Query.QueryControl;
import gts.modernization.model.Gra2MoL.Query.QueryControlExtension;
import gts.modernization.model.Gra2MoL.Query.QueryControlFor;
import gts.modernization.model.Gra2MoL.Query.QueryControlGreater;
import gts.modernization.model.Gra2MoL.Query.QueryElement;
import gts.modernization.model.Gra2MoL.Query.QueryElementType;
import gts.modernization.model.Gra2MoL.Query.QueryFactory;
import gts.modernization.model.Gra2MoL.Query.QueryPackage;
import gts.modernization.model.Gra2MoL.Query.QueryUnit;

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
	private EClass queryUnitEClass = null;

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
	private EClass queryControlGreaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryControlExtensionEClass = null;

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
	private EClass queryElementEClass = null;

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
	private EClass filterExpressionComplexEClass = null;

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
	private EEnum queryElementTypeEEnum = null;

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
	private EEnum operationTypeEEnum = null;

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
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#eNS_URI
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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryPackageImpl());

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

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryPackage.eNS_URI, theQueryPackage);
		return theQueryPackage;
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
	public EAttribute getQueryUnit_AbsoluteQuery() {
		return (EAttribute)queryUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryUnit_Control() {
		return (EReference)queryUnitEClass.getEStructuralFeatures().get(4);
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
	public EClass getQueryControlGreater() {
		return queryControlGreaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlGreater_Variable() {
		return (EAttribute)queryControlGreaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlGreater_NodeId() {
		return (EAttribute)queryControlGreaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlGreater_NodePosition() {
		return (EAttribute)queryControlGreaterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryControlExtension() {
		return queryControlExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryControlExtension_Operation() {
		return (EAttribute)queryControlExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryControlExtension_Params() {
		return (EReference)queryControlExtensionEClass.getEStructuralFeatures().get(1);
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
	public EReference getFilterUnit_Expression() {
		return (EReference)filterUnitEClass.getEStructuralFeatures().get(3);
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
	public EClass getFilterExpression() {
		return filterExpressionEClass;
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
	public EEnum getQueryElementType() {
		return queryElementTypeEEnum;
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
	public EEnum getOperationType() {
		return operationTypeEEnum;
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
		createEAttribute(queryUnitEClass, QUERY_UNIT__ABSOLUTE_QUERY);
		createEReference(queryUnitEClass, QUERY_UNIT__CONTROL);

		queryControlEClass = createEClass(QUERY_CONTROL);

		queryControlForEClass = createEClass(QUERY_CONTROL_FOR);
		createEAttribute(queryControlForEClass, QUERY_CONTROL_FOR__VARIABLE);
		createEAttribute(queryControlForEClass, QUERY_CONTROL_FOR__QUERY_VARIABLE);

		queryControlGreaterEClass = createEClass(QUERY_CONTROL_GREATER);
		createEAttribute(queryControlGreaterEClass, QUERY_CONTROL_GREATER__VARIABLE);
		createEAttribute(queryControlGreaterEClass, QUERY_CONTROL_GREATER__NODE_ID);
		createEAttribute(queryControlGreaterEClass, QUERY_CONTROL_GREATER__NODE_POSITION);

		queryControlExtensionEClass = createEClass(QUERY_CONTROL_EXTENSION);
		createEAttribute(queryControlExtensionEClass, QUERY_CONTROL_EXTENSION__OPERATION);
		createEReference(queryControlExtensionEClass, QUERY_CONTROL_EXTENSION__PARAMS);

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
		queryControlGreaterEClass.getESuperTypes().add(this.getQueryControl());
		queryControlExtensionEClass.getESuperTypes().add(this.getQueryControl());
		filterExpressionComplexEClass.getESuperTypes().add(this.getFilterExpression());
		filterExpressionUnitEClass.getESuperTypes().add(this.getFilterExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(queryUnitEClass, QueryUnit.class, "QueryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryUnit_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryUnit_Cast(), ecorePackage.getEString(), "cast", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryUnit_Filter(), this.getFilterUnit(), null, "filter", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryUnit_AbsoluteQuery(), ecorePackage.getEBoolean(), "absoluteQuery", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryUnit_Control(), this.getQueryControl(), null, "control", null, 0, 1, QueryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(queryUnitEClass, this.getFilterUnit(), "getMarkedFilterUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryControlEClass, QueryControl.class, "QueryControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryControlForEClass, QueryControlFor.class, "QueryControlFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryControlFor_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, QueryControlFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryControlFor_QueryVariable(), ecorePackage.getEString(), "queryVariable", null, 0, 1, QueryControlFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryControlGreaterEClass, QueryControlGreater.class, "QueryControlGreater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryControlGreater_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, QueryControlGreater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryControlGreater_NodeId(), ecorePackage.getEString(), "nodeId", null, 0, 1, QueryControlGreater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryControlGreater_NodePosition(), ecorePackage.getEInt(), "nodePosition", null, 0, 1, QueryControlGreater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryControlExtensionEClass, QueryControlExtension.class, "QueryControlExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryControlExtension_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, QueryControlExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryControlExtension_Params(), theCorePackage.getParameter(), null, "params", null, 0, -1, QueryControlExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getFilterExpressionUnit_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, FilterExpressionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		addEEnumLiteral(operationTypeEEnum, OperationType.STARTS_WITH);
		addEEnumLiteral(operationTypeEEnum, OperationType.ENDS_WITH);

		// Create resource
		createResource(eNS_URI);
	}

} //QueryPackageImpl
