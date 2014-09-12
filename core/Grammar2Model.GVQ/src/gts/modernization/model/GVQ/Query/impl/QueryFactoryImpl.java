/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryFactoryImpl.java,v 1.1 2008/01/14 09:18:28 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query.impl;

import gts.modernization.model.GVQ.Query.*;
import gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl;
import gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl;
import gts.modernization.model.GVQ.Query.impl.FilterUnitImpl;
import gts.modernization.model.GVQ.Query.impl.QueryElementImpl;
import gts.modernization.model.GVQ.Query.impl.QueryFactoryImpl;
import gts.modernization.model.GVQ.Query.impl.QueryUnitImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://gts.inf.um.es/modernization/g2mv/query"); 
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
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
			case QueryPackage.QUERY_UNIT: return createQueryUnit();
			case QueryPackage.QUERY_CONTROL: return createQueryControl();
			case QueryPackage.QUERY_CONTROL_FOR: return createQueryControlFor();
			case QueryPackage.FILTER_UNIT: return createFilterUnit();
			case QueryPackage.QUERY_ELEMENT: return createQueryElement();
			case QueryPackage.FILTER_EXPRESSION_COMPLEX: return createFilterExpressionComplex();
			case QueryPackage.FILTER_EXPRESSION_UNIT: return createFilterExpressionUnit();
			case QueryPackage.EXPRESSION_ELEMENT: return createExpressionElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.FILTER_TYPE:
				return createFilterTypeFromString(eDataType, initialValue);
			case QueryPackage.FILTER_OPERATION_TYPE:
				return createFilterOperationTypeFromString(eDataType, initialValue);
			case QueryPackage.QUERY_ELEMENT_TYPE:
				return createQueryElementTypeFromString(eDataType, initialValue);
			case QueryPackage.FILTER_EXPRESSION_TYPE:
				return createFilterExpressionTypeFromString(eDataType, initialValue);
			case QueryPackage.EXPRESSION_ELEMENT_TYPE:
				return createExpressionElementTypeFromString(eDataType, initialValue);
			case QueryPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.FILTER_TYPE:
				return convertFilterTypeToString(eDataType, instanceValue);
			case QueryPackage.FILTER_OPERATION_TYPE:
				return convertFilterOperationTypeToString(eDataType, instanceValue);
			case QueryPackage.QUERY_ELEMENT_TYPE:
				return convertQueryElementTypeToString(eDataType, instanceValue);
			case QueryPackage.FILTER_EXPRESSION_TYPE:
				return convertFilterExpressionTypeToString(eDataType, instanceValue);
			case QueryPackage.EXPRESSION_ELEMENT_TYPE:
				return convertExpressionElementTypeToString(eDataType, instanceValue);
			case QueryPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryControl createQueryControl() {
		QueryControlImpl queryControl = new QueryControlImpl();
		return queryControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryControlFor createQueryControlFor() {
		QueryControlForImpl queryControlFor = new QueryControlForImpl();
		return queryControlFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryUnit createQueryUnit() {
		QueryUnitImpl queryUnit = new QueryUnitImpl();
		return queryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterUnit createFilterUnit() {
		FilterUnitImpl filterUnit = new FilterUnitImpl();
		return filterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpressionUnit createFilterExpressionUnit() {
		FilterExpressionUnitImpl filterExpressionUnit = new FilterExpressionUnitImpl();
		return filterExpressionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElement createExpressionElement() {
		ExpressionElementImpl expressionElement = new ExpressionElementImpl();
		return expressionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpressionComplex createFilterExpressionComplex() {
		FilterExpressionComplexImpl filterExpressionComplex = new FilterExpressionComplexImpl();
		return filterExpressionComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElement createQueryElement() {
		QueryElementImpl queryElement = new QueryElementImpl();
		return queryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterTypeFromString(EDataType eDataType, String initialValue) {
		FilterType result = FilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperationType createFilterOperationTypeFromString(EDataType eDataType, String initialValue) {
		FilterOperationType result = FilterOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpressionType createFilterExpressionTypeFromString(EDataType eDataType, String initialValue) {
		FilterExpressionType result = FilterExpressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElementType createExpressionElementTypeFromString(EDataType eDataType, String initialValue) {
		ExpressionElementType result = ExpressionElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElementType createQueryElementTypeFromString(EDataType eDataType, String initialValue) {
		QueryElementType result = QueryElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
