/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryPackage.java,v 1.1 2008/01/14 09:18:30 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gts.modernization.model.GVQ.Query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gts.inf.um.es/modernization/g2mv/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = gts.modernization.model.GVQ.Query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.QueryControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.QueryControlImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryControl()
	 * @generated
	 */
	int QUERY_CONTROL = 1;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.QueryControlForImpl <em>Control For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.QueryControlForImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryControlFor()
	 * @generated
	 */
	int QUERY_CONTROL_FOR = 2;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.QueryUnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.QueryUnitImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryUnit()
	 * @generated
	 */
	int QUERY_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_UNIT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_UNIT__CAST = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_UNIT__FILTER = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_UNIT__CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONTROL_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONTROL_FOR__VARIABLE = QUERY_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONTROL_FOR__QUERY_VARIABLE = QUERY_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CONTROL_FOR_FEATURE_COUNT = QUERY_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.FilterUnitImpl <em>Filter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.FilterUnitImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterUnit()
	 * @generated
	 */
	int FILTER_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__NEXT = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__POSITION = 5;

	/**
	 * The number of structural features of the '<em>Filter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpression()
	 * @generated
	 */
	int FILTER_EXPRESSION = 5;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl <em>Filter Expression Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionUnit()
	 * @generated
	 */
	int FILTER_EXPRESSION_UNIT = 7;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.ExpressionElementImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 8;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl <em>Filter Expression Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionComplex()
	 * @generated
	 */
	int FILTER_EXPRESSION_COMPLEX = 6;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.impl.QueryElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.impl.QueryElementImpl
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryElement()
	 * @generated
	 */
	int QUERY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__MARK = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_COMPLEX__EXPRESSIONS = FILTER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_COMPLEX__TYPE = FILTER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Expression Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_COMPLEX_FEATURE_COUNT = FILTER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_UNIT__ELEMENT = FILTER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_UNIT__OPERATION = FILTER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_UNIT__GLOBAL = FILTER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_UNIT__PARAMETERS = FILTER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Filter Expression Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_UNIT_FEATURE_COUNT = FILTER_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.FilterType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 9;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.FilterOperationType <em>Filter Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.FilterOperationType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterOperationType()
	 * @generated
	 */
	int FILTER_OPERATION_TYPE = 10;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.OperationType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.QueryControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryControl
	 * @generated
	 */
	EClass getQueryControl();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.QueryControlFor <em>Control For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control For</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryControlFor
	 * @generated
	 */
	EClass getQueryControlFor();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryControlFor#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryControlFor#getVariable()
	 * @see #getQueryControlFor()
	 * @generated
	 */
	EAttribute getQueryControlFor_Variable();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryControlFor#getQueryVariable <em>Query Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Variable</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryControlFor#getQueryVariable()
	 * @see #getQueryControlFor()
	 * @generated
	 */
	EAttribute getQueryControlFor_QueryVariable();

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.FilterExpressionType <em>Filter Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionType()
	 * @generated
	 */
	int FILTER_EXPRESSION_TYPE = 12;


	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.ExpressionElementType <em>Expression Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.ExpressionElementType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getExpressionElementType()
	 * @generated
	 */
	int EXPRESSION_ELEMENT_TYPE = 13;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Query.QueryElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Query.QueryElementType
	 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryElementType()
	 * @generated
	 */
	int QUERY_ELEMENT_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.QueryUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryUnit
	 * @generated
	 */
	EClass getQueryUnit();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryUnit#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryUnit#getVariable()
	 * @see #getQueryUnit()
	 * @generated
	 */
	EAttribute getQueryUnit_Variable();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryUnit#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryUnit#getCast()
	 * @see #getQueryUnit()
	 * @generated
	 */
	EAttribute getQueryUnit_Cast();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.QueryUnit#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryUnit#getFilter()
	 * @see #getQueryUnit()
	 * @generated
	 */
	EReference getQueryUnit_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.QueryUnit#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryUnit#getControl()
	 * @see #getQueryUnit()
	 * @generated
	 */
	EReference getQueryUnit_Control();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.FilterUnit <em>Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Unit</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit
	 * @generated
	 */
	EClass getFilterUnit();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getType()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EAttribute getFilterUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterUnit#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getOperation()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EAttribute getFilterUnit_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.FilterUnit#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getElement()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EReference getFilterUnit_Element();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpression
	 * @generated
	 */
	EClass getFilterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.FilterUnit#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getNext()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EReference getFilterUnit_Next();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterUnit#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getPosition()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EAttribute getFilterUnit_Position();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.FilterUnit#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterUnit#getExpression()
	 * @see #getFilterUnit()
	 * @generated
	 */
	EReference getFilterUnit_Expression();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit <em>Filter Expression Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression Unit</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionUnit
	 * @generated
	 */
	EClass getFilterExpressionUnit();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionUnit#getElement()
	 * @see #getFilterExpressionUnit()
	 * @generated
	 */
	EReference getFilterExpressionUnit_Element();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionUnit#getOperation()
	 * @see #getFilterExpressionUnit()
	 * @generated
	 */
	EAttribute getFilterExpressionUnit_Operation();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionUnit#isGlobal()
	 * @see #getFilterExpressionUnit()
	 * @generated
	 */
	EAttribute getFilterExpressionUnit_Global();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.QueryElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryElement
	 * @generated
	 */
	EClass getQueryElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryElement#getName()
	 * @see #getQueryElement()
	 * @generated
	 */
	EAttribute getQueryElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryElement#getType()
	 * @see #getQueryElement()
	 * @generated
	 */
	EAttribute getQueryElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.QueryElement#isMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryElement#isMark()
	 * @see #getQueryElement()
	 * @generated
	 */
	EAttribute getQueryElement_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Query.FilterExpressionUnit#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionUnit#getParameters()
	 * @see #getFilterExpressionUnit()
	 * @generated
	 */
	EReference getFilterExpressionUnit_Parameters();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.ExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Element</em>'.
	 * @see gts.modernization.model.GVQ.Query.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.ExpressionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Query.ExpressionElement#getName()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EAttribute getExpressionElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.ExpressionElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.ExpressionElement#getType()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EAttribute getExpressionElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.ExpressionElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see gts.modernization.model.GVQ.Query.ExpressionElement#getPosition()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EAttribute getExpressionElement_Position();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex <em>Filter Expression Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression Complex</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionComplex
	 * @generated
	 */
	EClass getFilterExpressionComplex();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionComplex#getExpressions()
	 * @see #getFilterExpressionComplex()
	 * @generated
	 */
	EReference getFilterExpressionComplex_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Query.FilterExpressionComplex#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionComplex#getType()
	 * @see #getFilterExpressionComplex()
	 * @generated
	 */
	EAttribute getFilterExpressionComplex_Type();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.FilterOperationType <em>Filter Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Operation Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterOperationType
	 * @generated
	 */
	EEnum getFilterOperationType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.FilterExpressionType <em>Filter Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Expression Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.FilterExpressionType
	 * @generated
	 */
	EEnum getFilterExpressionType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.ExpressionElementType <em>Expression Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Element Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.ExpressionElementType
	 * @generated
	 */
	EEnum getExpressionElementType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Query.QueryElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see gts.modernization.model.GVQ.Query.QueryElementType
	 * @generated
	 */
	EEnum getQueryElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.QueryControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.QueryControlImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryControl()
		 * @generated
		 */
		EClass QUERY_CONTROL = eINSTANCE.getQueryControl();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.QueryControlForImpl <em>Control For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.QueryControlForImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryControlFor()
		 * @generated
		 */
		EClass QUERY_CONTROL_FOR = eINSTANCE.getQueryControlFor();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONTROL_FOR__VARIABLE = eINSTANCE.getQueryControlFor_Variable();

		/**
		 * The meta object literal for the '<em><b>Query Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CONTROL_FOR__QUERY_VARIABLE = eINSTANCE.getQueryControlFor_QueryVariable();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.QueryUnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.QueryUnitImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryUnit()
		 * @generated
		 */
		EClass QUERY_UNIT = eINSTANCE.getQueryUnit();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_UNIT__VARIABLE = eINSTANCE.getQueryUnit_Variable();

		/**
		 * The meta object literal for the '<em><b>Cast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_UNIT__CAST = eINSTANCE.getQueryUnit_Cast();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_UNIT__FILTER = eINSTANCE.getQueryUnit_Filter();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_UNIT__CONTROL = eINSTANCE.getQueryUnit_Control();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.FilterUnitImpl <em>Filter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.FilterUnitImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterUnit()
		 * @generated
		 */
		EClass FILTER_UNIT = eINSTANCE.getFilterUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_UNIT__TYPE = eINSTANCE.getFilterUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_UNIT__OPERATION = eINSTANCE.getFilterUnit_Operation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_UNIT__ELEMENT = eINSTANCE.getFilterUnit_Element();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpression()
		 * @generated
		 */
		EClass FILTER_EXPRESSION = eINSTANCE.getFilterExpression();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_UNIT__NEXT = eINSTANCE.getFilterUnit_Next();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_UNIT__POSITION = eINSTANCE.getFilterUnit_Position();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_UNIT__EXPRESSION = eINSTANCE.getFilterUnit_Expression();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl <em>Filter Expression Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionUnitImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionUnit()
		 * @generated
		 */
		EClass FILTER_EXPRESSION_UNIT = eINSTANCE.getFilterExpressionUnit();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION_UNIT__ELEMENT = eINSTANCE.getFilterExpressionUnit_Element();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_EXPRESSION_UNIT__OPERATION = eINSTANCE.getFilterExpressionUnit_Operation();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_EXPRESSION_UNIT__GLOBAL = eINSTANCE.getFilterExpressionUnit_Global();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.QueryElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.QueryElementImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryElement()
		 * @generated
		 */
		EClass QUERY_ELEMENT = eINSTANCE.getQueryElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_ELEMENT__NAME = eINSTANCE.getQueryElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_ELEMENT__TYPE = eINSTANCE.getQueryElement_Type();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_ELEMENT__MARK = eINSTANCE.getQueryElement_Mark();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION_UNIT__PARAMETERS = eINSTANCE.getFilterExpressionUnit_Parameters();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.ExpressionElementImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ELEMENT__NAME = eINSTANCE.getExpressionElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ELEMENT__TYPE = eINSTANCE.getExpressionElement_Type();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ELEMENT__POSITION = eINSTANCE.getExpressionElement_Position();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl <em>Filter Expression Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.impl.FilterExpressionComplexImpl
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionComplex()
		 * @generated
		 */
		EClass FILTER_EXPRESSION_COMPLEX = eINSTANCE.getFilterExpressionComplex();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION_COMPLEX__EXPRESSIONS = eINSTANCE.getFilterExpressionComplex_Expressions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_EXPRESSION_COMPLEX__TYPE = eINSTANCE.getFilterExpressionComplex_Type();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.FilterType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.FilterOperationType <em>Filter Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.FilterOperationType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterOperationType()
		 * @generated
		 */
		EEnum FILTER_OPERATION_TYPE = eINSTANCE.getFilterOperationType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.OperationType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.FilterExpressionType <em>Filter Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.FilterExpressionType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getFilterExpressionType()
		 * @generated
		 */
		EEnum FILTER_EXPRESSION_TYPE = eINSTANCE.getFilterExpressionType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.ExpressionElementType <em>Expression Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.ExpressionElementType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getExpressionElementType()
		 * @generated
		 */
		EEnum EXPRESSION_ELEMENT_TYPE = eINSTANCE.getExpressionElementType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Query.QueryElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Query.QueryElementType
		 * @see gts.modernization.model.GVQ.Query.impl.QueryPackageImpl#getQueryElementType()
		 * @generated
		 */
		EEnum QUERY_ELEMENT_TYPE = eINSTANCE.getQueryElementType();

	}

} //QueryPackage
