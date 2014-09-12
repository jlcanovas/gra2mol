/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorePackage.java,v 1.1 2008/01/14 09:18:32 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core;

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
 * @see gts.modernization.model.GVQ.Core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gts.inf.um.es/modernization/g2mv/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = gts.modernization.model.GVQ.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.RuleImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitImpl <em>Init Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.InitUnitImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnit()
	 * @generated
	 */
	int INIT_UNIT = 4;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.ParameterType
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 13;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.HashValueType <em>Hash Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.HashValueType
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHashValueType()
	 * @generated
	 */
	int HASH_VALUE_TYPE = 14;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.ViewDefinitionImpl <em>View Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.ViewDefinitionImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getViewDefinition()
	 * @generated
	 */
	int VIEW_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION__HASHES = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION__RULES = 2;

	/**
	 * The number of structural features of the '<em>View Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TO = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__QUERIES = 4;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INITS = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.FromElementImpl <em>From Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.FromElementImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getFromElement()
	 * @generated
	 */
	int FROM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__ALIAS = 2;

	/**
	 * The number of structural features of the '<em>From Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.ToElementImpl <em>To Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.ToElementImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getToElement()
	 * @generated
	 */
	int TO_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>To Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Init Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitElementImpl <em>Init Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.InitUnitElementImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElement()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT__ELEMENT = INIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT__EXTENSION = INIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT__VALUE = INIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Init Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_FEATURE_COUNT = INIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitElementValueImpl <em>Init Unit Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.InitUnitElementValueImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElementValue()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_VALUE__EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_VALUE__PARAMS = 3;

	/**
	 * The number of structural features of the '<em>Init Unit Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_ELEMENT_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitGroupImpl <em>Init Unit Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.InitUnitGroupImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitGroup()
	 * @generated
	 */
	int INIT_UNIT_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_GROUP__TYPE = INIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_GROUP__INITS = INIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_GROUP__EXPRESSION = INIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Init Unit Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_GROUP_FEATURE_COUNT = INIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.ParameterImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Extension Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXTENSION_POSITION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.HashImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHash()
	 * @generated
	 */
	int HASH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl <em>Hash Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.impl.HashValueImpl
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHashValue()
	 * @generated
	 */
	int HASH_VALUE = 10;

	/**
	 * The feature id for the '<em><b>From Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_VALUE__FROM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>From Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_VALUE__FROM_ELEMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_VALUE__TO_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>To Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_VALUE__TO_ELEMENT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Hash Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValueType
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElementValueType()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT_VALUE_TYPE = 11;

	/**
	 * The meta object id for the '{@link gts.modernization.model.GVQ.Core.InitUnitGroupType <em>Init Unit Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroupType
	 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitGroupType()
	 * @generated
	 */
	int INIT_UNIT_GROUP_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.Rule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getFrom()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_From();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.Rule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getTo()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_To();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.Rule#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getQueries()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Queries();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.Rule#getInits <em>Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inits</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getInits()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Inits();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.FromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.FromElement
	 * @generated
	 */
	EClass getFromElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.FromElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Core.FromElement#getName()
	 * @see #getFromElement()
	 * @generated
	 */
	EAttribute getFromElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.FromElement#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see gts.modernization.model.GVQ.Core.FromElement#getFilter()
	 * @see #getFromElement()
	 * @generated
	 */
	EReference getFromElement_Filter();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.FromElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see gts.modernization.model.GVQ.Core.FromElement#getAlias()
	 * @see #getFromElement()
	 * @generated
	 */
	EAttribute getFromElement_Alias();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.ToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.ToElement
	 * @generated
	 */
	EClass getToElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.ToElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Core.ToElement#getName()
	 * @see #getToElement()
	 * @generated
	 */
	EAttribute getToElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.ToElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see gts.modernization.model.GVQ.Core.ToElement#getAlias()
	 * @see #getToElement()
	 * @generated
	 */
	EAttribute getToElement_Alias();

	/**
	 * Returns the meta object for the attribute list '{@link gts.modernization.model.GVQ.Core.Rule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context</em>'.
	 * @see gts.modernization.model.GVQ.Core.Rule#getContext()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Context();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.InitUnit <em>Init Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnit
	 * @generated
	 */
	EClass getInitUnit();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.InitUnitElement <em>Init Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElement
	 * @generated
	 */
	EClass getInitUnitElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.InitUnitElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElement#getElement()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EAttribute getInitUnitElement_Element();

	/**
	 * Returns the meta object for the attribute list '{@link gts.modernization.model.GVQ.Core.InitUnitElement#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extension</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElement#getExtension()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EAttribute getInitUnitElement_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.InitUnitElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElement#getValue()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EReference getInitUnitElement_Value();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.InitUnitElementValue <em>Init Unit Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Element Value</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValue
	 * @generated
	 */
	EClass getInitUnitElementValue();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.InitUnitElementValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValue#getType()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.InitUnitElementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValue#getValue()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.InitUnitElementValue#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValue#getExtension()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.InitUnitElementValue#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValue#getParams()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EReference getInitUnitElementValue_Params();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.InitUnitGroup <em>Init Unit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Group</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroup
	 * @generated
	 */
	EClass getInitUnitGroup();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.InitUnitGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroup#getType()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EAttribute getInitUnitGroup_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.InitUnitGroup#getInits <em>Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inits</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroup#getInits()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EReference getInitUnitGroup_Inits();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.GVQ.Core.InitUnitGroup#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroup#getExpression()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EReference getInitUnitGroup_Expression();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Parameter#getValuePosition <em>Value Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Position</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter#getValuePosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ValuePosition();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Parameter#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter#getExtension()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Extension();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Parameter#getExtensionPosition <em>Extension Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Position</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter#getExtensionPosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ExtensionPosition();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see gts.modernization.model.GVQ.Core.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.Hash#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Core.Hash#getName()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.Hash#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see gts.modernization.model.GVQ.Core.Hash#getContent()
	 * @see #getHash()
	 * @generated
	 */
	EReference getHash_Content();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.HashValue <em>Hash Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Value</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValue
	 * @generated
	 */
	EClass getHashValue();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.HashValue#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValue#getFromElement()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_FromElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.HashValue#getFromElementType <em>From Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Element Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValue#getFromElementType()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_FromElementType();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.HashValue#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Element</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValue#getToElement()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_ToElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.HashValue#getToElementType <em>To Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Element Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValue#getToElementType()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_ToElementType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Init Unit Element Value Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitElementValueType
	 * @generated
	 */
	EEnum getInitUnitElementValueType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Core.InitUnitGroupType <em>Init Unit Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Init Unit Group Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.InitUnitGroupType
	 * @generated
	 */
	EEnum getInitUnitGroupType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Core.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.GVQ.Core.HashValueType <em>Hash Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hash Value Type</em>'.
	 * @see gts.modernization.model.GVQ.Core.HashValueType
	 * @generated
	 */
	EEnum getHashValueType();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.GVQ.Core.ViewDefinition <em>View Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Definition</em>'.
	 * @see gts.modernization.model.GVQ.Core.ViewDefinition
	 * @generated
	 */
	EClass getViewDefinition();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.GVQ.Core.ViewDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.GVQ.Core.ViewDefinition#getName()
	 * @see #getViewDefinition()
	 * @generated
	 */
	EAttribute getViewDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.ViewDefinition#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hashes</em>'.
	 * @see gts.modernization.model.GVQ.Core.ViewDefinition#getHashes()
	 * @see #getViewDefinition()
	 * @generated
	 */
	EReference getViewDefinition_Hashes();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.GVQ.Core.ViewDefinition#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see gts.modernization.model.GVQ.Core.ViewDefinition#getRules()
	 * @see #getViewDefinition()
	 * @generated
	 */
	EReference getViewDefinition_Rules();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.RuleImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FROM = eINSTANCE.getRule_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TO = eINSTANCE.getRule_To();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__QUERIES = eINSTANCE.getRule_Queries();

		/**
		 * The meta object literal for the '<em><b>Inits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INITS = eINSTANCE.getRule_Inits();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.FromElementImpl <em>From Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.FromElementImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getFromElement()
		 * @generated
		 */
		EClass FROM_ELEMENT = eINSTANCE.getFromElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ELEMENT__NAME = eINSTANCE.getFromElement_Name();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_ELEMENT__FILTER = eINSTANCE.getFromElement_Filter();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ELEMENT__ALIAS = eINSTANCE.getFromElement_Alias();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.ToElementImpl <em>To Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.ToElementImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getToElement()
		 * @generated
		 */
		EClass TO_ELEMENT = eINSTANCE.getToElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_ELEMENT__NAME = eINSTANCE.getToElement_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_ELEMENT__ALIAS = eINSTANCE.getToElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONTEXT = eINSTANCE.getRule_Context();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitImpl <em>Init Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.InitUnitImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnit()
		 * @generated
		 */
		EClass INIT_UNIT = eINSTANCE.getInitUnit();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitElementImpl <em>Init Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.InitUnitElementImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElement()
		 * @generated
		 */
		EClass INIT_UNIT_ELEMENT = eINSTANCE.getInitUnitElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_ELEMENT__ELEMENT = eINSTANCE.getInitUnitElement_Element();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_ELEMENT__EXTENSION = eINSTANCE.getInitUnitElement_Extension();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_UNIT_ELEMENT__VALUE = eINSTANCE.getInitUnitElement_Value();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitElementValueImpl <em>Init Unit Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.InitUnitElementValueImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElementValue()
		 * @generated
		 */
		EClass INIT_UNIT_ELEMENT_VALUE = eINSTANCE.getInitUnitElementValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_ELEMENT_VALUE__TYPE = eINSTANCE.getInitUnitElementValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_ELEMENT_VALUE__VALUE = eINSTANCE.getInitUnitElementValue_Value();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_ELEMENT_VALUE__EXTENSION = eINSTANCE.getInitUnitElementValue_Extension();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_UNIT_ELEMENT_VALUE__PARAMS = eINSTANCE.getInitUnitElementValue_Params();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.InitUnitGroupImpl <em>Init Unit Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.InitUnitGroupImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitGroup()
		 * @generated
		 */
		EClass INIT_UNIT_GROUP = eINSTANCE.getInitUnitGroup();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_UNIT_GROUP__TYPE = eINSTANCE.getInitUnitGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Inits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_UNIT_GROUP__INITS = eINSTANCE.getInitUnitGroup_Inits();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_UNIT_GROUP__EXPRESSION = eINSTANCE.getInitUnitGroup_Expression();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.ParameterImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Value Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE_POSITION = eINSTANCE.getParameter_ValuePosition();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXTENSION = eINSTANCE.getParameter_Extension();

		/**
		 * The meta object literal for the '<em><b>Extension Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXTENSION_POSITION = eINSTANCE.getParameter_ExtensionPosition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.HashImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHash()
		 * @generated
		 */
		EClass HASH = eINSTANCE.getHash();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH__NAME = eINSTANCE.getHash_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH__CONTENT = eINSTANCE.getHash_Content();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.HashValueImpl <em>Hash Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.HashValueImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHashValue()
		 * @generated
		 */
		EClass HASH_VALUE = eINSTANCE.getHashValue();

		/**
		 * The meta object literal for the '<em><b>From Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_VALUE__FROM_ELEMENT = eINSTANCE.getHashValue_FromElement();

		/**
		 * The meta object literal for the '<em><b>From Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_VALUE__FROM_ELEMENT_TYPE = eINSTANCE.getHashValue_FromElementType();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_VALUE__TO_ELEMENT = eINSTANCE.getHashValue_ToElement();

		/**
		 * The meta object literal for the '<em><b>To Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_VALUE__TO_ELEMENT_TYPE = eINSTANCE.getHashValue_ToElementType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.InitUnitElementValueType
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitElementValueType()
		 * @generated
		 */
		EEnum INIT_UNIT_ELEMENT_VALUE_TYPE = eINSTANCE.getInitUnitElementValueType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.InitUnitGroupType <em>Init Unit Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.InitUnitGroupType
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getInitUnitGroupType()
		 * @generated
		 */
		EEnum INIT_UNIT_GROUP_TYPE = eINSTANCE.getInitUnitGroupType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.ParameterType
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.HashValueType <em>Hash Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.HashValueType
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getHashValueType()
		 * @generated
		 */
		EEnum HASH_VALUE_TYPE = eINSTANCE.getHashValueType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.GVQ.Core.impl.ViewDefinitionImpl <em>View Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.GVQ.Core.impl.ViewDefinitionImpl
		 * @see gts.modernization.model.GVQ.Core.impl.CorePackageImpl#getViewDefinition()
		 * @generated
		 */
		EClass VIEW_DEFINITION = eINSTANCE.getViewDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEFINITION__NAME = eINSTANCE.getViewDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_DEFINITION__HASHES = eINSTANCE.getViewDefinition_Hashes();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_DEFINITION__RULES = eINSTANCE.getViewDefinition_Rules();

	}
	
} //CorePackage
