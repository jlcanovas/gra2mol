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

package gts.modernization.model.Gra2MoL.Core;

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
 * @see gts.modernization.model.Gra2MoL.Core.CoreFactory
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
	String eNS_URI = "http://gts.inf.um.es/modernization/gra2mol/core";

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
	CorePackage eINSTANCE = gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE_GRAMMAR = 1;

	/**
	 * The feature id for the '<em><b>Target Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__HASHES = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RULES = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.RuleImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__QUERIES = 1;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INITS = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl <em>Standard Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getStandardRule()
	 * @generated
	 */
	int STANDARD_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__QUERIES = RULE__QUERIES;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__INITS = RULE__INITS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__TYPE = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__FROM = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__CONTEXT = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__TO = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE__MIXINS = RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Standard Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.MixinRuleImpl <em>Mixin Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.MixinRuleImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getMixinRule()
	 * @generated
	 */
	int MIXIN_RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_RULE__QUERIES = RULE__QUERIES;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_RULE__INITS = RULE__INITS;

	/**
	 * The number of structural features of the '<em>Mixin Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.FromElementImpl <em>From Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.FromElementImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getFromElement()
	 * @generated
	 */
	int FROM_ELEMENT = 4;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.ToElementImpl <em>To Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.ToElementImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getToElement()
	 * @generated
	 */
	int TO_ELEMENT = 5;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitImpl <em>Init Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnit()
	 * @generated
	 */
	int INIT_UNIT = 6;

	/**
	 * The number of structural features of the '<em>Init Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementImpl <em>Init Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElement()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT = 7;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementValueImpl <em>Init Unit Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementValueImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElementValue()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT_VALUE = 8;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl <em>Init Unit Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitGroup()
	 * @generated
	 */
	int INIT_UNIT_GROUP = 9;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.ParameterImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.HashImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHash()
	 * @generated
	 */
	int HASH = 11;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.impl.HashValueImpl <em>Hash Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.impl.HashValueImpl
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHashValue()
	 * @generated
	 */
	int HASH_VALUE = 12;

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
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.RuleType
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 13;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElementValueType()
	 * @generated
	 */
	int INIT_UNIT_ELEMENT_VALUE_TYPE = 14;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroupType <em>Init Unit Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroupType
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitGroupType()
	 * @generated
	 */
	int INIT_UNIT_GROUP_TYPE = 15;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.ParameterType
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 16;

	/**
	 * The meta object id for the '{@link gts.modernization.model.Gra2MoL.Core.HashValueType <em>Hash Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHashValueType()
	 * @generated
	 */
	int HASH_VALUE_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getSourceGrammar <em>Source Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Grammar</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation#getSourceGrammar()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_SourceGrammar();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getTargetMetamodel <em>Target Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Metamodel</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation#getTargetMetamodel()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TargetMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hashes</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation#getHashes()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Hashes();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.Transformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation#getRules()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Rules();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.Rule#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Rule#getQueries()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Queries();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.Rule#getInits <em>Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inits</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Rule#getInits()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Inits();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.StandardRule <em>Standard Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Rule</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule
	 * @generated
	 */
	EClass getStandardRule();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule#getType()
	 * @see #getStandardRule()
	 * @generated
	 */
	EAttribute getStandardRule_Type();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule#getFrom()
	 * @see #getStandardRule()
	 * @generated
	 */
	EReference getStandardRule_From();

	/**
	 * Returns the meta object for the attribute list '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule#getContext()
	 * @see #getStandardRule()
	 * @generated
	 */
	EAttribute getStandardRule_Context();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule#getTo()
	 * @see #getStandardRule()
	 * @generated
	 */
	EReference getStandardRule_To();

	/**
	 * Returns the meta object for the attribute list '{@link gts.modernization.model.Gra2MoL.Core.StandardRule#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixins</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule#getMixins()
	 * @see #getStandardRule()
	 * @generated
	 */
	EAttribute getStandardRule_Mixins();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.MixinRule <em>Mixin Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin Rule</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.MixinRule
	 * @generated
	 */
	EClass getMixinRule();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.FromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.FromElement
	 * @generated
	 */
	EClass getFromElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.FromElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.FromElement#getName()
	 * @see #getFromElement()
	 * @generated
	 */
	EAttribute getFromElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.FromElement#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.FromElement#getFilter()
	 * @see #getFromElement()
	 * @generated
	 */
	EReference getFromElement_Filter();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.FromElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.FromElement#getAlias()
	 * @see #getFromElement()
	 * @generated
	 */
	EAttribute getFromElement_Alias();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.ToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.ToElement
	 * @generated
	 */
	EClass getToElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.ToElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.ToElement#getName()
	 * @see #getToElement()
	 * @generated
	 */
	EAttribute getToElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.ToElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.ToElement#getAlias()
	 * @see #getToElement()
	 * @generated
	 */
	EAttribute getToElement_Alias();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.InitUnit <em>Init Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnit
	 * @generated
	 */
	EClass getInitUnit();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement <em>Init Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElement
	 * @generated
	 */
	EClass getInitUnitElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElement#getElement()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EAttribute getInitUnitElement_Element();

	/**
	 * Returns the meta object for the attribute list '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extension</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElement#getExtension()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EAttribute getInitUnitElement_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElement#getValue()
	 * @see #getInitUnitElement()
	 * @generated
	 */
	EReference getInitUnitElement_Value();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue <em>Init Unit Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Element Value</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue
	 * @generated
	 */
	EClass getInitUnitElementValue();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getType()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getValue()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getExtension()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EAttribute getInitUnitElementValue_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue#getParams()
	 * @see #getInitUnitElementValue()
	 * @generated
	 */
	EReference getInitUnitElementValue_Params();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup <em>Init Unit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Unit Group</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroup
	 * @generated
	 */
	EClass getInitUnitGroup();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getType()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EAttribute getInitUnitGroup_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getInits <em>Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inits</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getInits()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EReference getInitUnitGroup_Inits();

	/**
	 * Returns the meta object for the containment reference '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroup#getExpression()
	 * @see #getInitUnitGroup()
	 * @generated
	 */
	EReference getInitUnitGroup_Expression();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Parameter#getValuePosition <em>Value Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Position</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter#getValuePosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ValuePosition();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Parameter#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter#getExtension()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Extension();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Parameter#getExtensionPosition <em>Extension Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Position</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter#getExtensionPosition()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ExtensionPosition();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.Hash#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Hash#getName()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gts.modernization.model.Gra2MoL.Core.Hash#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.Hash#getContent()
	 * @see #getHash()
	 * @generated
	 */
	EReference getHash_Content();

	/**
	 * Returns the meta object for class '{@link gts.modernization.model.Gra2MoL.Core.HashValue <em>Hash Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Value</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue
	 * @generated
	 */
	EClass getHashValue();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue#getFromElement()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_FromElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getFromElementType <em>From Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Element Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue#getFromElementType()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_FromElementType();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Element</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue#getToElement()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_ToElement();

	/**
	 * Returns the meta object for the attribute '{@link gts.modernization.model.Gra2MoL.Core.HashValue#getToElementType <em>To Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Element Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue#getToElementType()
	 * @see #getHashValue()
	 * @generated
	 */
	EAttribute getHashValue_ToElementType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.Gra2MoL.Core.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.RuleType
	 * @generated
	 */
	EEnum getRuleType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Init Unit Element Value Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType
	 * @generated
	 */
	EEnum getInitUnitElementValueType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroupType <em>Init Unit Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Init Unit Group Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroupType
	 * @generated
	 */
	EEnum getInitUnitGroupType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.Gra2MoL.Core.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link gts.modernization.model.Gra2MoL.Core.HashValueType <em>Hash Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hash Value Type</em>'.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
	 * @generated
	 */
	EEnum getHashValueType();

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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.TransformationImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Source Grammar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SOURCE_GRAMMAR = eINSTANCE.getTransformation_SourceGrammar();

		/**
		 * The meta object literal for the '<em><b>Target Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TARGET_METAMODEL = eINSTANCE.getTransformation_TargetMetamodel();

		/**
		 * The meta object literal for the '<em><b>Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__HASHES = eINSTANCE.getTransformation_Hashes();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.RuleImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getRule()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl <em>Standard Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.StandardRuleImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getStandardRule()
		 * @generated
		 */
		EClass STANDARD_RULE = eINSTANCE.getStandardRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_RULE__TYPE = eINSTANCE.getStandardRule_Type();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_RULE__FROM = eINSTANCE.getStandardRule_From();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_RULE__CONTEXT = eINSTANCE.getStandardRule_Context();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_RULE__TO = eINSTANCE.getStandardRule_To();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_RULE__MIXINS = eINSTANCE.getStandardRule_Mixins();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.MixinRuleImpl <em>Mixin Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.MixinRuleImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getMixinRule()
		 * @generated
		 */
		EClass MIXIN_RULE = eINSTANCE.getMixinRule();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.FromElementImpl <em>From Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.FromElementImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getFromElement()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.ToElementImpl <em>To Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.ToElementImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getToElement()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitImpl <em>Init Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnit()
		 * @generated
		 */
		EClass INIT_UNIT = eINSTANCE.getInitUnit();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementImpl <em>Init Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElement()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementValueImpl <em>Init Unit Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitElementValueImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElementValue()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl <em>Init Unit Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.InitUnitGroupImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitGroup()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.ParameterImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getParameter()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.HashImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHash()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.impl.HashValueImpl <em>Hash Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.impl.HashValueImpl
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHashValue()
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
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.RuleType <em>Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.RuleType
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getRuleType()
		 * @generated
		 */
		EEnum RULE_TYPE = eINSTANCE.getRuleType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType <em>Init Unit Element Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValueType
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitElementValueType()
		 * @generated
		 */
		EEnum INIT_UNIT_ELEMENT_VALUE_TYPE = eINSTANCE.getInitUnitElementValueType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroupType <em>Init Unit Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroupType
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getInitUnitGroupType()
		 * @generated
		 */
		EEnum INIT_UNIT_GROUP_TYPE = eINSTANCE.getInitUnitGroupType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.ParameterType
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link gts.modernization.model.Gra2MoL.Core.HashValueType <em>Hash Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gts.modernization.model.Gra2MoL.Core.HashValueType
		 * @see gts.modernization.model.Gra2MoL.Core.impl.CorePackageImpl#getHashValueType()
		 * @generated
		 */
		EEnum HASH_VALUE_TYPE = eINSTANCE.getHashValueType();

	}

} //CorePackage
