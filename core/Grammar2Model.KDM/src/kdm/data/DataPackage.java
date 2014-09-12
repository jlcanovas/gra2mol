/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.action.ActionPackage;

import kdm.core.CorePackage;

import kdm.kdm.KdmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see kdm.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = kdm.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataModelImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.AbstractDataElement <em>Abstract Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.AbstractDataElement
	 * @see kdm.data.impl.DataPackageImpl#getAbstractDataElement()
	 * @generated
	 */
	int ABSTRACT_DATA_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__DATA_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT__ABSTRACTION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataResourceImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataResource()
	 * @generated
	 */
	int DATA_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__ATTRIBUTE = ABSTRACT_DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__ANNOTATION = ABSTRACT_DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__STEREOTYPE = ABSTRACT_DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__TAGGED_VALUE = ABSTRACT_DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__NAME = ABSTRACT_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__SOURCE = ABSTRACT_DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__DATA_RELATION = ABSTRACT_DATA_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__ABSTRACTION = ABSTRACT_DATA_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_FEATURE_COUNT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.IndexElementImpl <em>Index Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.IndexElementImpl
	 * @see kdm.data.impl.DataPackageImpl#getIndexElement()
	 * @generated
	 */
	int INDEX_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__ATTRIBUTE = DATA_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__ANNOTATION = DATA_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__STEREOTYPE = DATA_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__TAGGED_VALUE = DATA_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__NAME = DATA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__SOURCE = DATA_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__DATA_RELATION = DATA_RESOURCE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__ABSTRACTION = DATA_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT__IMPLEMENTATION = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ELEMENT_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.UniqueKeyImpl <em>Unique Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.UniqueKeyImpl
	 * @see kdm.data.impl.DataPackageImpl#getUniqueKey()
	 * @generated
	 */
	int UNIQUE_KEY = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__ATTRIBUTE = INDEX_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__ANNOTATION = INDEX_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__STEREOTYPE = INDEX_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__TAGGED_VALUE = INDEX_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__NAME = INDEX_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__SOURCE = INDEX_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__DATA_RELATION = INDEX_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__ABSTRACTION = INDEX_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__IMPLEMENTATION = INDEX_ELEMENT__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY_FEATURE_COUNT = INDEX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.IndexImpl
	 * @see kdm.data.impl.DataPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ATTRIBUTE = INDEX_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ANNOTATION = INDEX_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__STEREOTYPE = INDEX_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TAGGED_VALUE = INDEX_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = INDEX_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SOURCE = INDEX_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DATA_RELATION = INDEX_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ABSTRACTION = INDEX_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IMPLEMENTATION = INDEX_ELEMENT__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = INDEX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.AbstractDataRelationship <em>Abstract Data Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.AbstractDataRelationship
	 * @see kdm.data.impl.DataPackageImpl#getAbstractDataRelationship()
	 * @generated
	 */
	int ABSTRACT_DATA_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Data Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.KeyRelationImpl <em>Key Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.KeyRelationImpl
	 * @see kdm.data.impl.DataPackageImpl#getKeyRelation()
	 * @generated
	 */
	int KEY_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATION_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ReferenceKeyImpl <em>Reference Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ReferenceKeyImpl
	 * @see kdm.data.impl.DataPackageImpl#getReferenceKey()
	 * @generated
	 */
	int REFERENCE_KEY = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__ATTRIBUTE = INDEX_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__ANNOTATION = INDEX_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__STEREOTYPE = INDEX_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__TAGGED_VALUE = INDEX_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__NAME = INDEX_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__SOURCE = INDEX_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__DATA_RELATION = INDEX_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__ABSTRACTION = INDEX_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY__IMPLEMENTATION = INDEX_ELEMENT__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Reference Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_KEY_FEATURE_COUNT = INDEX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataContainerImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataContainer()
	 * @generated
	 */
	int DATA_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__ATTRIBUTE = DATA_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__ANNOTATION = DATA_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__STEREOTYPE = DATA_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__TAGGED_VALUE = DATA_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__NAME = DATA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__SOURCE = DATA_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__DATA_RELATION = DATA_RESOURCE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__ABSTRACTION = DATA_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__DATA_ELEMENT = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.CatalogImpl
	 * @see kdm.data.impl.DataPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ATTRIBUTE = DATA_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ANNOTATION = DATA_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__STEREOTYPE = DATA_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TAGGED_VALUE = DATA_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAME = DATA_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SOURCE = DATA_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATA_RELATION = DATA_CONTAINER__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ABSTRACTION = DATA_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATA_ELEMENT = DATA_CONTAINER__DATA_ELEMENT;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.RelationalSchemaImpl <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.RelationalSchemaImpl
	 * @see kdm.data.impl.DataPackageImpl#getRelationalSchema()
	 * @generated
	 */
	int RELATIONAL_SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__ATTRIBUTE = DATA_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__ANNOTATION = DATA_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__STEREOTYPE = DATA_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__TAGGED_VALUE = DATA_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__NAME = DATA_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__SOURCE = DATA_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__DATA_RELATION = DATA_CONTAINER__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__ABSTRACTION = DATA_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__DATA_ELEMENT = DATA_CONTAINER__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA__CODE_ELEMENT = DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_SCHEMA_FEATURE_COUNT = DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ColumnSetImpl <em>Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ColumnSetImpl
	 * @see kdm.data.impl.DataPackageImpl#getColumnSet()
	 * @generated
	 */
	int COLUMN_SET = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__ATTRIBUTE = DATA_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__ANNOTATION = DATA_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__STEREOTYPE = DATA_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__TAGGED_VALUE = DATA_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__NAME = DATA_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__SOURCE = DATA_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__DATA_RELATION = DATA_CONTAINER__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__ABSTRACTION = DATA_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__DATA_ELEMENT = DATA_CONTAINER__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__ITEM_UNIT = DATA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET_FEATURE_COUNT = DATA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.RelationalTableImpl <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.RelationalTableImpl
	 * @see kdm.data.impl.DataPackageImpl#getRelationalTable()
	 * @generated
	 */
	int RELATIONAL_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__ATTRIBUTE = COLUMN_SET__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__ANNOTATION = COLUMN_SET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__STEREOTYPE = COLUMN_SET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__SOURCE = COLUMN_SET__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__DATA_RELATION = COLUMN_SET__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__ABSTRACTION = COLUMN_SET__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__DATA_ELEMENT = COLUMN_SET__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__ITEM_UNIT = COLUMN_SET__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.RelationalViewImpl <em>Relational View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.RelationalViewImpl
	 * @see kdm.data.impl.DataPackageImpl#getRelationalView()
	 * @generated
	 */
	int RELATIONAL_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__ATTRIBUTE = COLUMN_SET__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__ANNOTATION = COLUMN_SET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__STEREOTYPE = COLUMN_SET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__SOURCE = COLUMN_SET__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__DATA_RELATION = COLUMN_SET__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__ABSTRACTION = COLUMN_SET__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__DATA_ELEMENT = COLUMN_SET__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW__ITEM_UNIT = COLUMN_SET__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Relational View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_VIEW_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.RecordFileImpl <em>Record File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.RecordFileImpl
	 * @see kdm.data.impl.DataPackageImpl#getRecordFile()
	 * @generated
	 */
	int RECORD_FILE = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__ATTRIBUTE = COLUMN_SET__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__ANNOTATION = COLUMN_SET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__STEREOTYPE = COLUMN_SET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__SOURCE = COLUMN_SET__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__DATA_RELATION = COLUMN_SET__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__ABSTRACTION = COLUMN_SET__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__DATA_ELEMENT = COLUMN_SET__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__ITEM_UNIT = COLUMN_SET__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Record File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataEventImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataEvent()
	 * @generated
	 */
	int DATA_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__ATTRIBUTE = DATA_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__ANNOTATION = DATA_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__STEREOTYPE = DATA_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__TAGGED_VALUE = DATA_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__NAME = DATA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__SOURCE = DATA_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__DATA_RELATION = DATA_RESOURCE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__ABSTRACTION = DATA_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__KIND = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.XMLSchemaImpl <em>XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.XMLSchemaImpl
	 * @see kdm.data.impl.DataPackageImpl#getXMLSchema()
	 * @generated
	 */
	int XML_SCHEMA = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__ATTRIBUTE = ABSTRACT_DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__ANNOTATION = ABSTRACT_DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__STEREOTYPE = ABSTRACT_DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__TAGGED_VALUE = ABSTRACT_DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__NAME = ABSTRACT_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__SOURCE = ABSTRACT_DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__DATA_RELATION = ABSTRACT_DATA_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__ABSTRACTION = ABSTRACT_DATA_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__CONTENT_ELEMENT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_FEATURE_COUNT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.AbstractContentElement <em>Abstract Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.AbstractContentElement
	 * @see kdm.data.impl.DataPackageImpl#getAbstractContentElement()
	 * @generated
	 */
	int ABSTRACT_CONTENT_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__ATTRIBUTE = ABSTRACT_DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__ANNOTATION = ABSTRACT_DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__STEREOTYPE = ABSTRACT_DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__TAGGED_VALUE = ABSTRACT_DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__NAME = ABSTRACT_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__SOURCE = ABSTRACT_DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__DATA_RELATION = ABSTRACT_DATA_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT__ABSTRACTION = ABSTRACT_DATA_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Abstract Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ComplexContentTypeImpl
	 * @see kdm.data.impl.DataPackageImpl#getComplexContentType()
	 * @generated
	 */
	int COMPLEX_CONTENT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ATTRIBUTE = ABSTRACT_CONTENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ANNOTATION = ABSTRACT_CONTENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__STEREOTYPE = ABSTRACT_CONTENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__TAGGED_VALUE = ABSTRACT_CONTENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__NAME = ABSTRACT_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__SOURCE = ABSTRACT_CONTENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__DATA_RELATION = ABSTRACT_CONTENT_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__ABSTRACTION = ABSTRACT_CONTENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_TYPE_FEATURE_COUNT = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.data.impl.AllContentImpl <em>All Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.AllContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getAllContent()
	 * @generated
	 */
	int ALL_CONTENT = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__ATTRIBUTE = COMPLEX_CONTENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__ANNOTATION = COMPLEX_CONTENT_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__STEREOTYPE = COMPLEX_CONTENT_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__TAGGED_VALUE = COMPLEX_CONTENT_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__NAME = COMPLEX_CONTENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__SOURCE = COMPLEX_CONTENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__DATA_RELATION = COMPLEX_CONTENT_TYPE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__ABSTRACTION = COMPLEX_CONTENT_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT__CONTENT_ELEMENT = COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>All Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONTENT_FEATURE_COUNT = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.SeqContentImpl <em>Seq Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.SeqContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getSeqContent()
	 * @generated
	 */
	int SEQ_CONTENT = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__ATTRIBUTE = COMPLEX_CONTENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__ANNOTATION = COMPLEX_CONTENT_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__STEREOTYPE = COMPLEX_CONTENT_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__TAGGED_VALUE = COMPLEX_CONTENT_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__NAME = COMPLEX_CONTENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__SOURCE = COMPLEX_CONTENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__DATA_RELATION = COMPLEX_CONTENT_TYPE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__ABSTRACTION = COMPLEX_CONTENT_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT__CONTENT_ELEMENT = COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Seq Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_CONTENT_FEATURE_COUNT = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ChoiceContentImpl <em>Choice Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ChoiceContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getChoiceContent()
	 * @generated
	 */
	int CHOICE_CONTENT = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__ATTRIBUTE = COMPLEX_CONTENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__ANNOTATION = COMPLEX_CONTENT_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__STEREOTYPE = COMPLEX_CONTENT_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__TAGGED_VALUE = COMPLEX_CONTENT_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__NAME = COMPLEX_CONTENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__SOURCE = COMPLEX_CONTENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__DATA_RELATION = COMPLEX_CONTENT_TYPE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__ABSTRACTION = COMPLEX_CONTENT_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT__CONTENT_ELEMENT = COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Choice Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_CONTENT_FEATURE_COUNT = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ContentItemImpl <em>Content Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ContentItemImpl
	 * @see kdm.data.impl.DataPackageImpl#getContentItem()
	 * @generated
	 */
	int CONTENT_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__ATTRIBUTE = ABSTRACT_CONTENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__ANNOTATION = ABSTRACT_CONTENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__STEREOTYPE = ABSTRACT_CONTENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__TAGGED_VALUE = ABSTRACT_CONTENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__NAME = ABSTRACT_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__SOURCE = ABSTRACT_CONTENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__DATA_RELATION = ABSTRACT_CONTENT_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__ABSTRACTION = ABSTRACT_CONTENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__TYPE = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM__CONTENT_ELEMENT = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_FEATURE_COUNT = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.GroupContentImpl <em>Group Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.GroupContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getGroupContent()
	 * @generated
	 */
	int GROUP_CONTENT = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__ATTRIBUTE = CONTENT_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__ANNOTATION = CONTENT_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__STEREOTYPE = CONTENT_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__TAGGED_VALUE = CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__NAME = CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__SOURCE = CONTENT_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__DATA_RELATION = CONTENT_ITEM__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__ABSTRACTION = CONTENT_ITEM__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__TYPE = CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT__CONTENT_ELEMENT = CONTENT_ITEM__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Group Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONTENT_FEATURE_COUNT = CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ContentRestrictionImpl <em>Content Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ContentRestrictionImpl
	 * @see kdm.data.impl.DataPackageImpl#getContentRestriction()
	 * @generated
	 */
	int CONTENT_RESTRICTION = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__ATTRIBUTE = ABSTRACT_CONTENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__ANNOTATION = ABSTRACT_CONTENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__STEREOTYPE = ABSTRACT_CONTENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__TAGGED_VALUE = ABSTRACT_CONTENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__NAME = ABSTRACT_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__SOURCE = ABSTRACT_CONTENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__DATA_RELATION = ABSTRACT_CONTENT_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__ABSTRACTION = ABSTRACT_CONTENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__KIND = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION__VALUE = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_RESTRICTION_FEATURE_COUNT = ABSTRACT_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.SimpleContentTypeImpl
	 * @see kdm.data.impl.DataPackageImpl#getSimpleContentType()
	 * @generated
	 */
	int SIMPLE_CONTENT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ATTRIBUTE = COMPLEX_CONTENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ANNOTATION = COMPLEX_CONTENT_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__STEREOTYPE = COMPLEX_CONTENT_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__TAGGED_VALUE = COMPLEX_CONTENT_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__NAME = COMPLEX_CONTENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__SOURCE = COMPLEX_CONTENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__DATA_RELATION = COMPLEX_CONTENT_TYPE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__ABSTRACTION = COMPLEX_CONTENT_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__CONTENT_ELEMENT = COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__TYPE = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE__KIND = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_TYPE_FEATURE_COUNT = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ExtendedDataElementImpl <em>Extended Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ExtendedDataElementImpl
	 * @see kdm.data.impl.DataPackageImpl#getExtendedDataElement()
	 * @generated
	 */
	int EXTENDED_DATA_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__ATTRIBUTE = ABSTRACT_DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__ANNOTATION = ABSTRACT_DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__STEREOTYPE = ABSTRACT_DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__TAGGED_VALUE = ABSTRACT_DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__NAME = ABSTRACT_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__SOURCE = ABSTRACT_DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__DATA_RELATION = ABSTRACT_DATA_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT__ABSTRACTION = ABSTRACT_DATA_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Extended Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_ELEMENT_FEATURE_COUNT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataRelationshipImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataRelationship()
	 * @generated
	 */
	int DATA_RELATIONSHIP = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.MixedContentImpl <em>Mixed Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.MixedContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getMixedContent()
	 * @generated
	 */
	int MIXED_CONTENT = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__ATTRIBUTE = COMPLEX_CONTENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__ANNOTATION = COMPLEX_CONTENT_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__STEREOTYPE = COMPLEX_CONTENT_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__TAGGED_VALUE = COMPLEX_CONTENT_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__NAME = COMPLEX_CONTENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__SOURCE = COMPLEX_CONTENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__DATA_RELATION = COMPLEX_CONTENT_TYPE__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__ABSTRACTION = COMPLEX_CONTENT_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__CONTENT_ELEMENT = COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT_FEATURE_COUNT = COMPLEX_CONTENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ContentReferenceImpl
	 * @see kdm.data.impl.DataPackageImpl#getContentReference()
	 * @generated
	 */
	int CONTENT_REFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ATTRIBUTE = CONTENT_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ANNOTATION = CONTENT_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__STEREOTYPE = CONTENT_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__TAGGED_VALUE = CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__NAME = CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__SOURCE = CONTENT_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DATA_RELATION = CONTENT_ITEM__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ABSTRACTION = CONTENT_ITEM__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__TYPE = CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__CONTENT_ELEMENT = CONTENT_ITEM__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_FEATURE_COUNT = CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataActionImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataAction()
	 * @generated
	 */
	int DATA_ACTION = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__ATTRIBUTE = ABSTRACT_DATA_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__ANNOTATION = ABSTRACT_DATA_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__STEREOTYPE = ABSTRACT_DATA_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__TAGGED_VALUE = ABSTRACT_DATA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__NAME = ABSTRACT_DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__SOURCE = ABSTRACT_DATA_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__DATA_RELATION = ABSTRACT_DATA_ELEMENT__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__ABSTRACTION = ABSTRACT_DATA_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__KIND = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__IMPLEMENTATION = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION__DATA_ELEMENT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACTION_FEATURE_COUNT = ABSTRACT_DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ReadsColumnSetImpl <em>Reads Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ReadsColumnSetImpl
	 * @see kdm.data.impl.DataPackageImpl#getReadsColumnSet()
	 * @generated
	 */
	int READS_COLUMN_SET = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_COLUMN_SET_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ContentAttributeImpl <em>Content Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ContentAttributeImpl
	 * @see kdm.data.impl.DataPackageImpl#getContentAttribute()
	 * @generated
	 */
	int CONTENT_ATTRIBUTE = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ATTRIBUTE = CONTENT_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ANNOTATION = CONTENT_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__STEREOTYPE = CONTENT_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__TAGGED_VALUE = CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__NAME = CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__SOURCE = CONTENT_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__DATA_RELATION = CONTENT_ITEM__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__ABSTRACTION = CONTENT_ITEM__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__TYPE = CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE__CONTENT_ELEMENT = CONTENT_ITEM__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Content Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ATTRIBUTE_FEATURE_COUNT = CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.TypedByImpl <em>Typed By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.TypedByImpl
	 * @see kdm.data.impl.DataPackageImpl#getTypedBy()
	 * @generated
	 */
	int TYPED_BY = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_BY_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ReferenceToImpl <em>Reference To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ReferenceToImpl
	 * @see kdm.data.impl.DataPackageImpl#getReferenceTo()
	 * @generated
	 */
	int REFERENCE_TO = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.RestrictionOfImpl <em>Restriction Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.RestrictionOfImpl
	 * @see kdm.data.impl.DataPackageImpl#getRestrictionOf()
	 * @generated
	 */
	int RESTRICTION_OF = 36;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Restriction Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OF_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ExtensionToImpl <em>Extension To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ExtensionToImpl
	 * @see kdm.data.impl.DataPackageImpl#getExtensionTo()
	 * @generated
	 */
	int EXTENSION_TO = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TO_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DatatypeOfImpl <em>Datatype Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DatatypeOfImpl
	 * @see kdm.data.impl.DataPackageImpl#getDatatypeOf()
	 * @generated
	 */
	int DATATYPE_OF = 38;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__ATTRIBUTE = ABSTRACT_DATA_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__ANNOTATION = ABSTRACT_DATA_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__STEREOTYPE = ABSTRACT_DATA_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__TAGGED_VALUE = ABSTRACT_DATA_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__TO = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF__FROM = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OF_FEATURE_COUNT = ABSTRACT_DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.HasContentImpl <em>Has Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.HasContentImpl
	 * @see kdm.data.impl.DataPackageImpl#getHasContent()
	 * @generated
	 */
	int HAS_CONTENT = 39;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CONTENT_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.WritesColumnSetImpl <em>Writes Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.WritesColumnSetImpl
	 * @see kdm.data.impl.DataPackageImpl#getWritesColumnSet()
	 * @generated
	 */
	int WRITES_COLUMN_SET = 40;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writes Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_COLUMN_SET_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ProducesDataEventImpl <em>Produces Data Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ProducesDataEventImpl
	 * @see kdm.data.impl.DataPackageImpl#getProducesDataEvent()
	 * @generated
	 */
	int PRODUCES_DATA_EVENT = 41;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Produces Data Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_DATA_EVENT_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.data.impl.DataSegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.DataSegmentImpl
	 * @see kdm.data.impl.DataPackageImpl#getDataSegment()
	 * @generated
	 */
	int DATA_SEGMENT = 42;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__ATTRIBUTE = COLUMN_SET__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__ANNOTATION = COLUMN_SET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__STEREOTYPE = COLUMN_SET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__SOURCE = COLUMN_SET__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__DATA_RELATION = COLUMN_SET__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__ABSTRACTION = COLUMN_SET__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__DATA_ELEMENT = COLUMN_SET__DATA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Item Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT__ITEM_UNIT = COLUMN_SET__ITEM_UNIT;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEGMENT_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ContentElementImpl <em>Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ContentElementImpl
	 * @see kdm.data.impl.DataPackageImpl#getContentElement()
	 * @generated
	 */
	int CONTENT_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__ATTRIBUTE = CONTENT_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__ANNOTATION = CONTENT_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__STEREOTYPE = CONTENT_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__TAGGED_VALUE = CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__NAME = CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__SOURCE = CONTENT_ITEM__SOURCE;

	/**
	 * The feature id for the '<em><b>Data Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__DATA_RELATION = CONTENT_ITEM__DATA_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__ABSTRACTION = CONTENT_ITEM__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__TYPE = CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Content Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__CONTENT_ELEMENT = CONTENT_ITEM__CONTENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_FEATURE_COUNT = CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.data.impl.ManagesDataImpl <em>Manages Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.data.impl.ManagesDataImpl
	 * @see kdm.data.impl.DataPackageImpl#getManagesData()
	 * @generated
	 */
	int MANAGES_DATA = 44;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manages Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_DATA_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kdm.data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.data.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.DataModel#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Element</em>'.
	 * @see kdm.data.DataModel#getDataElement()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.AbstractDataElement <em>Abstract Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Element</em>'.
	 * @see kdm.data.AbstractDataElement
	 * @generated
	 */
	EClass getAbstractDataElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.AbstractDataElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see kdm.data.AbstractDataElement#getSource()
	 * @see #getAbstractDataElement()
	 * @generated
	 */
	EReference getAbstractDataElement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.AbstractDataElement#getDataRelation <em>Data Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Relation</em>'.
	 * @see kdm.data.AbstractDataElement#getDataRelation()
	 * @see #getAbstractDataElement()
	 * @generated
	 */
	EReference getAbstractDataElement_DataRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.AbstractDataElement#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstraction</em>'.
	 * @see kdm.data.AbstractDataElement#getAbstraction()
	 * @see #getAbstractDataElement()
	 * @generated
	 */
	EReference getAbstractDataElement_Abstraction();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see kdm.data.DataResource
	 * @generated
	 */
	EClass getDataResource();

	/**
	 * Returns the meta object for class '{@link kdm.data.IndexElement <em>Index Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Element</em>'.
	 * @see kdm.data.IndexElement
	 * @generated
	 */
	EClass getIndexElement();

	/**
	 * Returns the meta object for the reference list '{@link kdm.data.IndexElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.data.IndexElement#getImplementation()
	 * @see #getIndexElement()
	 * @generated
	 */
	EReference getIndexElement_Implementation();

	/**
	 * Returns the meta object for class '{@link kdm.data.UniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Key</em>'.
	 * @see kdm.data.UniqueKey
	 * @generated
	 */
	EClass getUniqueKey();

	/**
	 * Returns the meta object for class '{@link kdm.data.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see kdm.data.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link kdm.data.AbstractDataRelationship <em>Abstract Data Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Relationship</em>'.
	 * @see kdm.data.AbstractDataRelationship
	 * @generated
	 */
	EClass getAbstractDataRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.data.KeyRelation <em>Key Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Relation</em>'.
	 * @see kdm.data.KeyRelation
	 * @generated
	 */
	EClass getKeyRelation();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.KeyRelation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.KeyRelation#getTo()
	 * @see #getKeyRelation()
	 * @generated
	 */
	EReference getKeyRelation_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.KeyRelation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.KeyRelation#getFrom()
	 * @see #getKeyRelation()
	 * @generated
	 */
	EReference getKeyRelation_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.ReferenceKey <em>Reference Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Key</em>'.
	 * @see kdm.data.ReferenceKey
	 * @generated
	 */
	EClass getReferenceKey();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see kdm.data.DataContainer
	 * @generated
	 */
	EClass getDataContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.DataContainer#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Element</em>'.
	 * @see kdm.data.DataContainer#getDataElement()
	 * @see #getDataContainer()
	 * @generated
	 */
	EReference getDataContainer_DataElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see kdm.data.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for class '{@link kdm.data.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see kdm.data.RelationalSchema
	 * @generated
	 */
	EClass getRelationalSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.RelationalSchema#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see kdm.data.RelationalSchema#getCodeElement()
	 * @see #getRelationalSchema()
	 * @generated
	 */
	EReference getRelationalSchema_CodeElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.ColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Set</em>'.
	 * @see kdm.data.ColumnSet
	 * @generated
	 */
	EClass getColumnSet();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.ColumnSet#getItemUnit <em>Item Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Unit</em>'.
	 * @see kdm.data.ColumnSet#getItemUnit()
	 * @see #getColumnSet()
	 * @generated
	 */
	EReference getColumnSet_ItemUnit();

	/**
	 * Returns the meta object for class '{@link kdm.data.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see kdm.data.RelationalTable
	 * @generated
	 */
	EClass getRelationalTable();

	/**
	 * Returns the meta object for class '{@link kdm.data.RelationalView <em>Relational View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational View</em>'.
	 * @see kdm.data.RelationalView
	 * @generated
	 */
	EClass getRelationalView();

	/**
	 * Returns the meta object for class '{@link kdm.data.RecordFile <em>Record File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record File</em>'.
	 * @see kdm.data.RecordFile
	 * @generated
	 */
	EClass getRecordFile();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see kdm.data.DataEvent
	 * @generated
	 */
	EClass getDataEvent();

	/**
	 * Returns the meta object for the attribute '{@link kdm.data.DataEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.data.DataEvent#getKind()
	 * @see #getDataEvent()
	 * @generated
	 */
	EAttribute getDataEvent_Kind();

	/**
	 * Returns the meta object for class '{@link kdm.data.XMLSchema <em>XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Schema</em>'.
	 * @see kdm.data.XMLSchema
	 * @generated
	 */
	EClass getXMLSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.XMLSchema#getContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Element</em>'.
	 * @see kdm.data.XMLSchema#getContentElement()
	 * @see #getXMLSchema()
	 * @generated
	 */
	EReference getXMLSchema_ContentElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.AbstractContentElement <em>Abstract Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Content Element</em>'.
	 * @see kdm.data.AbstractContentElement
	 * @generated
	 */
	EClass getAbstractContentElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.ComplexContentType <em>Complex Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Content Type</em>'.
	 * @see kdm.data.ComplexContentType
	 * @generated
	 */
	EClass getComplexContentType();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.ComplexContentType#getContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Element</em>'.
	 * @see kdm.data.ComplexContentType#getContentElement()
	 * @see #getComplexContentType()
	 * @generated
	 */
	EReference getComplexContentType_ContentElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.AllContent <em>All Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Content</em>'.
	 * @see kdm.data.AllContent
	 * @generated
	 */
	EClass getAllContent();

	/**
	 * Returns the meta object for class '{@link kdm.data.SeqContent <em>Seq Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Content</em>'.
	 * @see kdm.data.SeqContent
	 * @generated
	 */
	EClass getSeqContent();

	/**
	 * Returns the meta object for class '{@link kdm.data.ChoiceContent <em>Choice Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Content</em>'.
	 * @see kdm.data.ChoiceContent
	 * @generated
	 */
	EClass getChoiceContent();

	/**
	 * Returns the meta object for class '{@link kdm.data.ContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Item</em>'.
	 * @see kdm.data.ContentItem
	 * @generated
	 */
	EClass getContentItem();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ContentItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see kdm.data.ContentItem#getType()
	 * @see #getContentItem()
	 * @generated
	 */
	EReference getContentItem_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.ContentItem#getContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Element</em>'.
	 * @see kdm.data.ContentItem#getContentElement()
	 * @see #getContentItem()
	 * @generated
	 */
	EReference getContentItem_ContentElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.GroupContent <em>Group Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Content</em>'.
	 * @see kdm.data.GroupContent
	 * @generated
	 */
	EClass getGroupContent();

	/**
	 * Returns the meta object for class '{@link kdm.data.ContentRestriction <em>Content Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Restriction</em>'.
	 * @see kdm.data.ContentRestriction
	 * @generated
	 */
	EClass getContentRestriction();

	/**
	 * Returns the meta object for the attribute '{@link kdm.data.ContentRestriction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.data.ContentRestriction#getKind()
	 * @see #getContentRestriction()
	 * @generated
	 */
	EAttribute getContentRestriction_Kind();

	/**
	 * Returns the meta object for the attribute '{@link kdm.data.ContentRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kdm.data.ContentRestriction#getValue()
	 * @see #getContentRestriction()
	 * @generated
	 */
	EAttribute getContentRestriction_Value();

	/**
	 * Returns the meta object for class '{@link kdm.data.SimpleContentType <em>Simple Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Content Type</em>'.
	 * @see kdm.data.SimpleContentType
	 * @generated
	 */
	EClass getSimpleContentType();

	/**
	 * Returns the meta object for the reference list '{@link kdm.data.SimpleContentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see kdm.data.SimpleContentType#getType()
	 * @see #getSimpleContentType()
	 * @generated
	 */
	EReference getSimpleContentType_Type();

	/**
	 * Returns the meta object for the attribute '{@link kdm.data.SimpleContentType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.data.SimpleContentType#getKind()
	 * @see #getSimpleContentType()
	 * @generated
	 */
	EAttribute getSimpleContentType_Kind();

	/**
	 * Returns the meta object for class '{@link kdm.data.ExtendedDataElement <em>Extended Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Data Element</em>'.
	 * @see kdm.data.ExtendedDataElement
	 * @generated
	 */
	EClass getExtendedDataElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.data.DataRelationship
	 * @generated
	 */
	EClass getDataRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.DataRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.DataRelationship#getTo()
	 * @see #getDataRelationship()
	 * @generated
	 */
	EReference getDataRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.DataRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.DataRelationship#getFrom()
	 * @see #getDataRelationship()
	 * @generated
	 */
	EReference getDataRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.MixedContent <em>Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Content</em>'.
	 * @see kdm.data.MixedContent
	 * @generated
	 */
	EClass getMixedContent();

	/**
	 * Returns the meta object for class '{@link kdm.data.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Reference</em>'.
	 * @see kdm.data.ContentReference
	 * @generated
	 */
	EClass getContentReference();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see kdm.data.DataAction
	 * @generated
	 */
	EClass getDataAction();

	/**
	 * Returns the meta object for the attribute '{@link kdm.data.DataAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.data.DataAction#getKind()
	 * @see #getDataAction()
	 * @generated
	 */
	EAttribute getDataAction_Kind();

	/**
	 * Returns the meta object for the reference list '{@link kdm.data.DataAction#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.data.DataAction#getImplementation()
	 * @see #getDataAction()
	 * @generated
	 */
	EReference getDataAction_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.data.DataAction#getDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Element</em>'.
	 * @see kdm.data.DataAction#getDataElement()
	 * @see #getDataAction()
	 * @generated
	 */
	EReference getDataAction_DataElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.ReadsColumnSet <em>Reads Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads Column Set</em>'.
	 * @see kdm.data.ReadsColumnSet
	 * @generated
	 */
	EClass getReadsColumnSet();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ReadsColumnSet#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.ReadsColumnSet#getTo()
	 * @see #getReadsColumnSet()
	 * @generated
	 */
	EReference getReadsColumnSet_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ReadsColumnSet#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.ReadsColumnSet#getFrom()
	 * @see #getReadsColumnSet()
	 * @generated
	 */
	EReference getReadsColumnSet_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.ContentAttribute <em>Content Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Attribute</em>'.
	 * @see kdm.data.ContentAttribute
	 * @generated
	 */
	EClass getContentAttribute();

	/**
	 * Returns the meta object for class '{@link kdm.data.TypedBy <em>Typed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed By</em>'.
	 * @see kdm.data.TypedBy
	 * @generated
	 */
	EClass getTypedBy();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.TypedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.TypedBy#getTo()
	 * @see #getTypedBy()
	 * @generated
	 */
	EReference getTypedBy_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.TypedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.TypedBy#getFrom()
	 * @see #getTypedBy()
	 * @generated
	 */
	EReference getTypedBy_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.ReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference To</em>'.
	 * @see kdm.data.ReferenceTo
	 * @generated
	 */
	EClass getReferenceTo();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ReferenceTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.ReferenceTo#getTo()
	 * @see #getReferenceTo()
	 * @generated
	 */
	EReference getReferenceTo_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ReferenceTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.ReferenceTo#getFrom()
	 * @see #getReferenceTo()
	 * @generated
	 */
	EReference getReferenceTo_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.RestrictionOf <em>Restriction Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Of</em>'.
	 * @see kdm.data.RestrictionOf
	 * @generated
	 */
	EClass getRestrictionOf();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.RestrictionOf#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.RestrictionOf#getTo()
	 * @see #getRestrictionOf()
	 * @generated
	 */
	EReference getRestrictionOf_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.RestrictionOf#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.RestrictionOf#getFrom()
	 * @see #getRestrictionOf()
	 * @generated
	 */
	EReference getRestrictionOf_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.ExtensionTo <em>Extension To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension To</em>'.
	 * @see kdm.data.ExtensionTo
	 * @generated
	 */
	EClass getExtensionTo();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ExtensionTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.ExtensionTo#getTo()
	 * @see #getExtensionTo()
	 * @generated
	 */
	EReference getExtensionTo_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ExtensionTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.ExtensionTo#getFrom()
	 * @see #getExtensionTo()
	 * @generated
	 */
	EReference getExtensionTo_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.DatatypeOf <em>Datatype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Of</em>'.
	 * @see kdm.data.DatatypeOf
	 * @generated
	 */
	EClass getDatatypeOf();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.DatatypeOf#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.DatatypeOf#getTo()
	 * @see #getDatatypeOf()
	 * @generated
	 */
	EReference getDatatypeOf_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.DatatypeOf#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.DatatypeOf#getFrom()
	 * @see #getDatatypeOf()
	 * @generated
	 */
	EReference getDatatypeOf_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.HasContent <em>Has Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Content</em>'.
	 * @see kdm.data.HasContent
	 * @generated
	 */
	EClass getHasContent();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.HasContent#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.HasContent#getTo()
	 * @see #getHasContent()
	 * @generated
	 */
	EReference getHasContent_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.HasContent#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.HasContent#getFrom()
	 * @see #getHasContent()
	 * @generated
	 */
	EReference getHasContent_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.WritesColumnSet <em>Writes Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes Column Set</em>'.
	 * @see kdm.data.WritesColumnSet
	 * @generated
	 */
	EClass getWritesColumnSet();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.WritesColumnSet#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.WritesColumnSet#getTo()
	 * @see #getWritesColumnSet()
	 * @generated
	 */
	EReference getWritesColumnSet_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.WritesColumnSet#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.WritesColumnSet#getFrom()
	 * @see #getWritesColumnSet()
	 * @generated
	 */
	EReference getWritesColumnSet_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.ProducesDataEvent <em>Produces Data Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produces Data Event</em>'.
	 * @see kdm.data.ProducesDataEvent
	 * @generated
	 */
	EClass getProducesDataEvent();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ProducesDataEvent#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.ProducesDataEvent#getTo()
	 * @see #getProducesDataEvent()
	 * @generated
	 */
	EReference getProducesDataEvent_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ProducesDataEvent#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.ProducesDataEvent#getFrom()
	 * @see #getProducesDataEvent()
	 * @generated
	 */
	EReference getProducesDataEvent_From();

	/**
	 * Returns the meta object for class '{@link kdm.data.DataSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see kdm.data.DataSegment
	 * @generated
	 */
	EClass getDataSegment();

	/**
	 * Returns the meta object for class '{@link kdm.data.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Element</em>'.
	 * @see kdm.data.ContentElement
	 * @generated
	 */
	EClass getContentElement();

	/**
	 * Returns the meta object for class '{@link kdm.data.ManagesData <em>Manages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manages Data</em>'.
	 * @see kdm.data.ManagesData
	 * @generated
	 */
	EClass getManagesData();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ManagesData#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.data.ManagesData#getTo()
	 * @see #getManagesData()
	 * @generated
	 */
	EReference getManagesData_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.data.ManagesData#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.data.ManagesData#getFrom()
	 * @see #getManagesData()
	 * @generated
	 */
	EReference getManagesData_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link kdm.data.impl.DataModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataModelImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_ELEMENT = eINSTANCE.getDataModel_DataElement();

		/**
		 * The meta object literal for the '{@link kdm.data.AbstractDataElement <em>Abstract Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.AbstractDataElement
		 * @see kdm.data.impl.DataPackageImpl#getAbstractDataElement()
		 * @generated
		 */
		EClass ABSTRACT_DATA_ELEMENT = eINSTANCE.getAbstractDataElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_ELEMENT__SOURCE = eINSTANCE.getAbstractDataElement_Source();

		/**
		 * The meta object literal for the '<em><b>Data Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_ELEMENT__DATA_RELATION = eINSTANCE.getAbstractDataElement_DataRelation();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_ELEMENT__ABSTRACTION = eINSTANCE.getAbstractDataElement_Abstraction();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataResourceImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataResource()
		 * @generated
		 */
		EClass DATA_RESOURCE = eINSTANCE.getDataResource();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.IndexElementImpl <em>Index Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.IndexElementImpl
		 * @see kdm.data.impl.DataPackageImpl#getIndexElement()
		 * @generated
		 */
		EClass INDEX_ELEMENT = eINSTANCE.getIndexElement();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ELEMENT__IMPLEMENTATION = eINSTANCE.getIndexElement_Implementation();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.UniqueKeyImpl <em>Unique Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.UniqueKeyImpl
		 * @see kdm.data.impl.DataPackageImpl#getUniqueKey()
		 * @generated
		 */
		EClass UNIQUE_KEY = eINSTANCE.getUniqueKey();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.IndexImpl
		 * @see kdm.data.impl.DataPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link kdm.data.AbstractDataRelationship <em>Abstract Data Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.AbstractDataRelationship
		 * @see kdm.data.impl.DataPackageImpl#getAbstractDataRelationship()
		 * @generated
		 */
		EClass ABSTRACT_DATA_RELATIONSHIP = eINSTANCE.getAbstractDataRelationship();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.KeyRelationImpl <em>Key Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.KeyRelationImpl
		 * @see kdm.data.impl.DataPackageImpl#getKeyRelation()
		 * @generated
		 */
		EClass KEY_RELATION = eINSTANCE.getKeyRelation();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_RELATION__TO = eINSTANCE.getKeyRelation_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_RELATION__FROM = eINSTANCE.getKeyRelation_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ReferenceKeyImpl <em>Reference Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ReferenceKeyImpl
		 * @see kdm.data.impl.DataPackageImpl#getReferenceKey()
		 * @generated
		 */
		EClass REFERENCE_KEY = eINSTANCE.getReferenceKey();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataContainerImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataContainer()
		 * @generated
		 */
		EClass DATA_CONTAINER = eINSTANCE.getDataContainer();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTAINER__DATA_ELEMENT = eINSTANCE.getDataContainer_DataElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.CatalogImpl
		 * @see kdm.data.impl.DataPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.RelationalSchemaImpl <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.RelationalSchemaImpl
		 * @see kdm.data.impl.DataPackageImpl#getRelationalSchema()
		 * @generated
		 */
		EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_SCHEMA__CODE_ELEMENT = eINSTANCE.getRelationalSchema_CodeElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ColumnSetImpl <em>Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ColumnSetImpl
		 * @see kdm.data.impl.DataPackageImpl#getColumnSet()
		 * @generated
		 */
		EClass COLUMN_SET = eINSTANCE.getColumnSet();

		/**
		 * The meta object literal for the '<em><b>Item Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_SET__ITEM_UNIT = eINSTANCE.getColumnSet_ItemUnit();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.RelationalTableImpl <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.RelationalTableImpl
		 * @see kdm.data.impl.DataPackageImpl#getRelationalTable()
		 * @generated
		 */
		EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.RelationalViewImpl <em>Relational View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.RelationalViewImpl
		 * @see kdm.data.impl.DataPackageImpl#getRelationalView()
		 * @generated
		 */
		EClass RELATIONAL_VIEW = eINSTANCE.getRelationalView();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.RecordFileImpl <em>Record File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.RecordFileImpl
		 * @see kdm.data.impl.DataPackageImpl#getRecordFile()
		 * @generated
		 */
		EClass RECORD_FILE = eINSTANCE.getRecordFile();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataEventImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataEvent()
		 * @generated
		 */
		EClass DATA_EVENT = eINSTANCE.getDataEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EVENT__KIND = eINSTANCE.getDataEvent_Kind();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.XMLSchemaImpl <em>XML Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.XMLSchemaImpl
		 * @see kdm.data.impl.DataPackageImpl#getXMLSchema()
		 * @generated
		 */
		EClass XML_SCHEMA = eINSTANCE.getXMLSchema();

		/**
		 * The meta object literal for the '<em><b>Content Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_SCHEMA__CONTENT_ELEMENT = eINSTANCE.getXMLSchema_ContentElement();

		/**
		 * The meta object literal for the '{@link kdm.data.AbstractContentElement <em>Abstract Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.AbstractContentElement
		 * @see kdm.data.impl.DataPackageImpl#getAbstractContentElement()
		 * @generated
		 */
		EClass ABSTRACT_CONTENT_ELEMENT = eINSTANCE.getAbstractContentElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ComplexContentTypeImpl
		 * @see kdm.data.impl.DataPackageImpl#getComplexContentType()
		 * @generated
		 */
		EClass COMPLEX_CONTENT_TYPE = eINSTANCE.getComplexContentType();

		/**
		 * The meta object literal for the '<em><b>Content Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT = eINSTANCE.getComplexContentType_ContentElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.AllContentImpl <em>All Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.AllContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getAllContent()
		 * @generated
		 */
		EClass ALL_CONTENT = eINSTANCE.getAllContent();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.SeqContentImpl <em>Seq Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.SeqContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getSeqContent()
		 * @generated
		 */
		EClass SEQ_CONTENT = eINSTANCE.getSeqContent();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ChoiceContentImpl <em>Choice Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ChoiceContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getChoiceContent()
		 * @generated
		 */
		EClass CHOICE_CONTENT = eINSTANCE.getChoiceContent();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ContentItemImpl <em>Content Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ContentItemImpl
		 * @see kdm.data.impl.DataPackageImpl#getContentItem()
		 * @generated
		 */
		EClass CONTENT_ITEM = eINSTANCE.getContentItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ITEM__TYPE = eINSTANCE.getContentItem_Type();

		/**
		 * The meta object literal for the '<em><b>Content Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ITEM__CONTENT_ELEMENT = eINSTANCE.getContentItem_ContentElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.GroupContentImpl <em>Group Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.GroupContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getGroupContent()
		 * @generated
		 */
		EClass GROUP_CONTENT = eINSTANCE.getGroupContent();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ContentRestrictionImpl <em>Content Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ContentRestrictionImpl
		 * @see kdm.data.impl.DataPackageImpl#getContentRestriction()
		 * @generated
		 */
		EClass CONTENT_RESTRICTION = eINSTANCE.getContentRestriction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_RESTRICTION__KIND = eINSTANCE.getContentRestriction_Kind();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_RESTRICTION__VALUE = eINSTANCE.getContentRestriction_Value();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.SimpleContentTypeImpl
		 * @see kdm.data.impl.DataPackageImpl#getSimpleContentType()
		 * @generated
		 */
		EClass SIMPLE_CONTENT_TYPE = eINSTANCE.getSimpleContentType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTENT_TYPE__TYPE = eINSTANCE.getSimpleContentType_Type();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONTENT_TYPE__KIND = eINSTANCE.getSimpleContentType_Kind();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ExtendedDataElementImpl <em>Extended Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ExtendedDataElementImpl
		 * @see kdm.data.impl.DataPackageImpl#getExtendedDataElement()
		 * @generated
		 */
		EClass EXTENDED_DATA_ELEMENT = eINSTANCE.getExtendedDataElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataRelationshipImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataRelationship()
		 * @generated
		 */
		EClass DATA_RELATIONSHIP = eINSTANCE.getDataRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RELATIONSHIP__TO = eINSTANCE.getDataRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RELATIONSHIP__FROM = eINSTANCE.getDataRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.MixedContentImpl <em>Mixed Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.MixedContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getMixedContent()
		 * @generated
		 */
		EClass MIXED_CONTENT = eINSTANCE.getMixedContent();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ContentReferenceImpl
		 * @see kdm.data.impl.DataPackageImpl#getContentReference()
		 * @generated
		 */
		EClass CONTENT_REFERENCE = eINSTANCE.getContentReference();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataActionImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataAction()
		 * @generated
		 */
		EClass DATA_ACTION = eINSTANCE.getDataAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACTION__KIND = eINSTANCE.getDataAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACTION__IMPLEMENTATION = eINSTANCE.getDataAction_Implementation();

		/**
		 * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACTION__DATA_ELEMENT = eINSTANCE.getDataAction_DataElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ReadsColumnSetImpl <em>Reads Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ReadsColumnSetImpl
		 * @see kdm.data.impl.DataPackageImpl#getReadsColumnSet()
		 * @generated
		 */
		EClass READS_COLUMN_SET = eINSTANCE.getReadsColumnSet();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_COLUMN_SET__TO = eINSTANCE.getReadsColumnSet_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_COLUMN_SET__FROM = eINSTANCE.getReadsColumnSet_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ContentAttributeImpl <em>Content Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ContentAttributeImpl
		 * @see kdm.data.impl.DataPackageImpl#getContentAttribute()
		 * @generated
		 */
		EClass CONTENT_ATTRIBUTE = eINSTANCE.getContentAttribute();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.TypedByImpl <em>Typed By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.TypedByImpl
		 * @see kdm.data.impl.DataPackageImpl#getTypedBy()
		 * @generated
		 */
		EClass TYPED_BY = eINSTANCE.getTypedBy();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_BY__TO = eINSTANCE.getTypedBy_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_BY__FROM = eINSTANCE.getTypedBy_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ReferenceToImpl <em>Reference To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ReferenceToImpl
		 * @see kdm.data.impl.DataPackageImpl#getReferenceTo()
		 * @generated
		 */
		EClass REFERENCE_TO = eINSTANCE.getReferenceTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TO__TO = eINSTANCE.getReferenceTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TO__FROM = eINSTANCE.getReferenceTo_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.RestrictionOfImpl <em>Restriction Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.RestrictionOfImpl
		 * @see kdm.data.impl.DataPackageImpl#getRestrictionOf()
		 * @generated
		 */
		EClass RESTRICTION_OF = eINSTANCE.getRestrictionOf();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_OF__TO = eINSTANCE.getRestrictionOf_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_OF__FROM = eINSTANCE.getRestrictionOf_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ExtensionToImpl <em>Extension To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ExtensionToImpl
		 * @see kdm.data.impl.DataPackageImpl#getExtensionTo()
		 * @generated
		 */
		EClass EXTENSION_TO = eINSTANCE.getExtensionTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TO__TO = eINSTANCE.getExtensionTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TO__FROM = eINSTANCE.getExtensionTo_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DatatypeOfImpl <em>Datatype Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DatatypeOfImpl
		 * @see kdm.data.impl.DataPackageImpl#getDatatypeOf()
		 * @generated
		 */
		EClass DATATYPE_OF = eINSTANCE.getDatatypeOf();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_OF__TO = eINSTANCE.getDatatypeOf_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_OF__FROM = eINSTANCE.getDatatypeOf_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.HasContentImpl <em>Has Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.HasContentImpl
		 * @see kdm.data.impl.DataPackageImpl#getHasContent()
		 * @generated
		 */
		EClass HAS_CONTENT = eINSTANCE.getHasContent();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_CONTENT__TO = eINSTANCE.getHasContent_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_CONTENT__FROM = eINSTANCE.getHasContent_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.WritesColumnSetImpl <em>Writes Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.WritesColumnSetImpl
		 * @see kdm.data.impl.DataPackageImpl#getWritesColumnSet()
		 * @generated
		 */
		EClass WRITES_COLUMN_SET = eINSTANCE.getWritesColumnSet();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_COLUMN_SET__TO = eINSTANCE.getWritesColumnSet_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_COLUMN_SET__FROM = eINSTANCE.getWritesColumnSet_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ProducesDataEventImpl <em>Produces Data Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ProducesDataEventImpl
		 * @see kdm.data.impl.DataPackageImpl#getProducesDataEvent()
		 * @generated
		 */
		EClass PRODUCES_DATA_EVENT = eINSTANCE.getProducesDataEvent();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES_DATA_EVENT__TO = eINSTANCE.getProducesDataEvent_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES_DATA_EVENT__FROM = eINSTANCE.getProducesDataEvent_From();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.DataSegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.DataSegmentImpl
		 * @see kdm.data.impl.DataPackageImpl#getDataSegment()
		 * @generated
		 */
		EClass DATA_SEGMENT = eINSTANCE.getDataSegment();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ContentElementImpl <em>Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ContentElementImpl
		 * @see kdm.data.impl.DataPackageImpl#getContentElement()
		 * @generated
		 */
		EClass CONTENT_ELEMENT = eINSTANCE.getContentElement();

		/**
		 * The meta object literal for the '{@link kdm.data.impl.ManagesDataImpl <em>Manages Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.data.impl.ManagesDataImpl
		 * @see kdm.data.impl.DataPackageImpl#getManagesData()
		 * @generated
		 */
		EClass MANAGES_DATA = eINSTANCE.getManagesData();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_DATA__TO = eINSTANCE.getManagesData_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_DATA__FROM = eINSTANCE.getManagesData_From();

	}

} //DataPackage
