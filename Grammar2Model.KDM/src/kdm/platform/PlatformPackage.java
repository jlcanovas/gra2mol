/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform;

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
 * @see kdm.platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/platform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = kdm.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.platform.AbstractPlatformElement <em>Abstract Platform Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.AbstractPlatformElement
	 * @see kdm.platform.impl.PlatformPackageImpl#getAbstractPlatformElement()
	 * @generated
	 */
	int ABSTRACT_PLATFORM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Platform Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.PlatformModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.PlatformModelImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformModel()
	 * @generated
	 */
	int PLATFORM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__PLATFORM_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.AbstractPlatformRelationship <em>Abstract Platform Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.AbstractPlatformRelationship
	 * @see kdm.platform.impl.PlatformPackageImpl#getAbstractPlatformRelationship()
	 * @generated
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Platform Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.RequiresImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ATTRIBUTE = ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ANNOTATION = ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__STEREOTYPE = ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__TAGGED_VALUE = ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__TO = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__FROM = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ResourceTypeImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PLATFORM_ELEMENT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.NamingResourceImpl <em>Naming Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.NamingResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getNamingResource()
	 * @generated
	 */
	int NAMING_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Naming Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.MarshalledResourceImpl <em>Marshalled Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.MarshalledResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getMarshalledResource()
	 * @generated
	 */
	int MARSHALLED_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Marshalled Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARSHALLED_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.MessagingResourceImpl <em>Messaging Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.MessagingResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getMessagingResource()
	 * @generated
	 */
	int MESSAGING_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Messaging Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.FileResourceImpl <em>File Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.FileResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getFileResource()
	 * @generated
	 */
	int FILE_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>File Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ExecutionResourceImpl <em>Execution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ExecutionResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getExecutionResource()
	 * @generated
	 */
	int EXECUTION_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Execution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.PlatformActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.PlatformActionImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformAction()
	 * @generated
	 */
	int PLATFORM_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__KIND = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION__PLATFORM_ELEMENT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ACTION_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ExternalActorImpl <em>External Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ExternalActorImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getExternalActor()
	 * @generated
	 */
	int EXTERNAL_ACTOR = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__ATTRIBUTE = PLATFORM_ACTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__ANNOTATION = PLATFORM_ACTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__STEREOTYPE = PLATFORM_ACTION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__TAGGED_VALUE = PLATFORM_ACTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__NAME = PLATFORM_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__SOURCE = PLATFORM_ACTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__RELATION = PLATFORM_ACTION__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__ABSTRACTION = PLATFORM_ACTION__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__IMPLEMENTATION = PLATFORM_ACTION__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__KIND = PLATFORM_ACTION__KIND;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__PLATFORM_ELEMENT = PLATFORM_ACTION__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>External Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR_FEATURE_COUNT = PLATFORM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.DataManagerImpl <em>Data Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.DataManagerImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getDataManager()
	 * @generated
	 */
	int DATA_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Data Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.BindsToImpl <em>Binds To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.BindsToImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getBindsTo()
	 * @generated
	 */
	int BINDS_TO = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__ATTRIBUTE = ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__ANNOTATION = ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__STEREOTYPE = ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__TAGGED_VALUE = ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__TO = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO__FROM = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binds To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDS_TO_FEATURE_COUNT = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.PlatformElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.PlatformElementImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformElement()
	 * @generated
	 */
	int PLATFORM_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENT_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.PlatformRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.PlatformRelationshipImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformRelationship()
	 * @generated
	 */
	int PLATFORM_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__ATTRIBUTE = ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__ANNOTATION = ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__STEREOTYPE = ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__TO = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP__FROM = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.PlatformEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.PlatformEventImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformEvent()
	 * @generated
	 */
	int PLATFORM_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT__KIND = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EVENT_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.LockResourceImpl <em>Lock Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.LockResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getLockResource()
	 * @generated
	 */
	int LOCK_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Lock Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.DeployedSoftwareSystemImpl <em>Deployed Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.DeployedSoftwareSystemImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedSoftwareSystem()
	 * @generated
	 */
	int DEPLOYED_SOFTWARE_SYSTEM = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployed Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.MachineImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Deployed Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DEPLOYED_COMPONENT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployed Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DEPLOYED_RESOURCE = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.DeployedComponentImpl <em>Deployed Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.DeployedComponentImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedComponent()
	 * @generated
	 */
	int DEPLOYED_COMPONENT = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__GROUPED_CODE = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployed Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.DeployedResourceImpl <em>Deployed Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.DeployedResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedResource()
	 * @generated
	 */
	int DEPLOYED_RESOURCE = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__ATTRIBUTE = ABSTRACT_PLATFORM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__ANNOTATION = ABSTRACT_PLATFORM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__STEREOTYPE = ABSTRACT_PLATFORM_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__TAGGED_VALUE = ABSTRACT_PLATFORM_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__NAME = ABSTRACT_PLATFORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__SOURCE = ABSTRACT_PLATFORM_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__RELATION = ABSTRACT_PLATFORM_ELEMENT__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__ABSTRACTION = ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__IMPLEMENTATION = ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE__PLATFORM_ELEMENT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_RESOURCE_FEATURE_COUNT = ABSTRACT_PLATFORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.LoadsImpl <em>Loads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.LoadsImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getLoads()
	 * @generated
	 */
	int LOADS = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__ATTRIBUTE = ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__ANNOTATION = ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__STEREOTYPE = ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__TAGGED_VALUE = ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__TO = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS__FROM = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADS_FEATURE_COUNT = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.SpawnsImpl <em>Spawns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.SpawnsImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getSpawns()
	 * @generated
	 */
	int SPAWNS = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__ATTRIBUTE = ABSTRACT_PLATFORM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__ANNOTATION = ABSTRACT_PLATFORM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__STEREOTYPE = ABSTRACT_PLATFORM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__TAGGED_VALUE = ABSTRACT_PLATFORM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__TO = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS__FROM = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spawns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWNS_FEATURE_COUNT = ABSTRACT_PLATFORM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.RuntimeResourceImpl <em>Runtime Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.RuntimeResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getRuntimeResource()
	 * @generated
	 */
	int RUNTIME_RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Runtime Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ThreadImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ATTRIBUTE = RUNTIME_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ANNOTATION = RUNTIME_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__STEREOTYPE = RUNTIME_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__TAGGED_VALUE = RUNTIME_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = RUNTIME_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SOURCE = RUNTIME_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__RELATION = RUNTIME_RESOURCE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ABSTRACTION = RUNTIME_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__IMPLEMENTATION = RUNTIME_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PLATFORM_ELEMENT = RUNTIME_RESOURCE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = RUNTIME_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ProcessImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ATTRIBUTE = RUNTIME_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANNOTATION = RUNTIME_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STEREOTYPE = RUNTIME_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TAGGED_VALUE = RUNTIME_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = RUNTIME_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SOURCE = RUNTIME_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RELATION = RUNTIME_RESOURCE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ABSTRACTION = RUNTIME_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPLEMENTATION = RUNTIME_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PLATFORM_ELEMENT = RUNTIME_RESOURCE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = RUNTIME_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ReadsResourceImpl <em>Reads Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ReadsResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getReadsResource()
	 * @generated
	 */
	int READS_RESOURCE = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_RESOURCE_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.WritesResourceImpl <em>Writes Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.WritesResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getWritesResource()
	 * @generated
	 */
	int WRITES_RESOURCE = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writes Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_RESOURCE_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.ManagesResourceImpl <em>Manages Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.ManagesResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getManagesResource()
	 * @generated
	 */
	int MANAGES_RESOURCE = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manages Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGES_RESOURCE_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.DefinedByImpl <em>Defined By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.DefinedByImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getDefinedBy()
	 * @generated
	 */
	int DEFINED_BY = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Defined By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.platform.impl.StreamResourceImpl <em>Stream Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.platform.impl.StreamResourceImpl
	 * @see kdm.platform.impl.PlatformPackageImpl#getStreamResource()
	 * @generated
	 */
	int STREAM_RESOURCE = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__ATTRIBUTE = RESOURCE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__STEREOTYPE = RESOURCE_TYPE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__TAGGED_VALUE = RESOURCE_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__SOURCE = RESOURCE_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__RELATION = RESOURCE_TYPE__RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__ABSTRACTION = RESOURCE_TYPE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__IMPLEMENTATION = RESOURCE_TYPE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Platform Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE__PLATFORM_ELEMENT = RESOURCE_TYPE__PLATFORM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Stream Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kdm.platform.AbstractPlatformElement <em>Abstract Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Platform Element</em>'.
	 * @see kdm.platform.AbstractPlatformElement
	 * @generated
	 */
	EClass getAbstractPlatformElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.AbstractPlatformElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see kdm.platform.AbstractPlatformElement#getSource()
	 * @see #getAbstractPlatformElement()
	 * @generated
	 */
	EReference getAbstractPlatformElement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.AbstractPlatformElement#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see kdm.platform.AbstractPlatformElement#getRelation()
	 * @see #getAbstractPlatformElement()
	 * @generated
	 */
	EReference getAbstractPlatformElement_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.AbstractPlatformElement#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstraction</em>'.
	 * @see kdm.platform.AbstractPlatformElement#getAbstraction()
	 * @see #getAbstractPlatformElement()
	 * @generated
	 */
	EReference getAbstractPlatformElement_Abstraction();

	/**
	 * Returns the meta object for the reference list '{@link kdm.platform.AbstractPlatformElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.platform.AbstractPlatformElement#getImplementation()
	 * @see #getAbstractPlatformElement()
	 * @generated
	 */
	EReference getAbstractPlatformElement_Implementation();

	/**
	 * Returns the meta object for class '{@link kdm.platform.PlatformModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.platform.PlatformModel
	 * @generated
	 */
	EClass getPlatformModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.PlatformModel#getPlatformElement <em>Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Element</em>'.
	 * @see kdm.platform.PlatformModel#getPlatformElement()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_PlatformElement();

	/**
	 * Returns the meta object for class '{@link kdm.platform.AbstractPlatformRelationship <em>Abstract Platform Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Platform Relationship</em>'.
	 * @see kdm.platform.AbstractPlatformRelationship
	 * @generated
	 */
	EClass getAbstractPlatformRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see kdm.platform.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Requires#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.Requires#getTo()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Requires#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.Requires#getFrom()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see kdm.platform.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.ResourceType#getPlatformElement <em>Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Element</em>'.
	 * @see kdm.platform.ResourceType#getPlatformElement()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_PlatformElement();

	/**
	 * Returns the meta object for class '{@link kdm.platform.NamingResource <em>Naming Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Naming Resource</em>'.
	 * @see kdm.platform.NamingResource
	 * @generated
	 */
	EClass getNamingResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.MarshalledResource <em>Marshalled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marshalled Resource</em>'.
	 * @see kdm.platform.MarshalledResource
	 * @generated
	 */
	EClass getMarshalledResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.MessagingResource <em>Messaging Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messaging Resource</em>'.
	 * @see kdm.platform.MessagingResource
	 * @generated
	 */
	EClass getMessagingResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.FileResource <em>File Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Resource</em>'.
	 * @see kdm.platform.FileResource
	 * @generated
	 */
	EClass getFileResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.ExecutionResource <em>Execution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Resource</em>'.
	 * @see kdm.platform.ExecutionResource
	 * @generated
	 */
	EClass getExecutionResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.PlatformAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see kdm.platform.PlatformAction
	 * @generated
	 */
	EClass getPlatformAction();

	/**
	 * Returns the meta object for the attribute '{@link kdm.platform.PlatformAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.platform.PlatformAction#getKind()
	 * @see #getPlatformAction()
	 * @generated
	 */
	EAttribute getPlatformAction_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.PlatformAction#getPlatformElement <em>Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Element</em>'.
	 * @see kdm.platform.PlatformAction#getPlatformElement()
	 * @see #getPlatformAction()
	 * @generated
	 */
	EReference getPlatformAction_PlatformElement();

	/**
	 * Returns the meta object for class '{@link kdm.platform.ExternalActor <em>External Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Actor</em>'.
	 * @see kdm.platform.ExternalActor
	 * @generated
	 */
	EClass getExternalActor();

	/**
	 * Returns the meta object for class '{@link kdm.platform.DataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Manager</em>'.
	 * @see kdm.platform.DataManager
	 * @generated
	 */
	EClass getDataManager();

	/**
	 * Returns the meta object for class '{@link kdm.platform.BindsTo <em>Binds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binds To</em>'.
	 * @see kdm.platform.BindsTo
	 * @generated
	 */
	EClass getBindsTo();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.BindsTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.BindsTo#getTo()
	 * @see #getBindsTo()
	 * @generated
	 */
	EReference getBindsTo_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.BindsTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.BindsTo#getFrom()
	 * @see #getBindsTo()
	 * @generated
	 */
	EReference getBindsTo_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.PlatformElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.platform.PlatformElement
	 * @generated
	 */
	EClass getPlatformElement();

	/**
	 * Returns the meta object for class '{@link kdm.platform.PlatformRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.platform.PlatformRelationship
	 * @generated
	 */
	EClass getPlatformRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.PlatformRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.PlatformRelationship#getTo()
	 * @see #getPlatformRelationship()
	 * @generated
	 */
	EReference getPlatformRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.PlatformRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.PlatformRelationship#getFrom()
	 * @see #getPlatformRelationship()
	 * @generated
	 */
	EReference getPlatformRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.PlatformEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see kdm.platform.PlatformEvent
	 * @generated
	 */
	EClass getPlatformEvent();

	/**
	 * Returns the meta object for the attribute '{@link kdm.platform.PlatformEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.platform.PlatformEvent#getKind()
	 * @see #getPlatformEvent()
	 * @generated
	 */
	EAttribute getPlatformEvent_Kind();

	/**
	 * Returns the meta object for class '{@link kdm.platform.LockResource <em>Lock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Resource</em>'.
	 * @see kdm.platform.LockResource
	 * @generated
	 */
	EClass getLockResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.DeployedSoftwareSystem <em>Deployed Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Software System</em>'.
	 * @see kdm.platform.DeployedSoftwareSystem
	 * @generated
	 */
	EClass getDeployedSoftwareSystem();

	/**
	 * Returns the meta object for the reference list '{@link kdm.platform.DeployedSoftwareSystem#getGroupedComponent <em>Grouped Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Component</em>'.
	 * @see kdm.platform.DeployedSoftwareSystem#getGroupedComponent()
	 * @see #getDeployedSoftwareSystem()
	 * @generated
	 */
	EReference getDeployedSoftwareSystem_GroupedComponent();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see kdm.platform.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.Machine#getDeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Component</em>'.
	 * @see kdm.platform.Machine#getDeployedComponent()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_DeployedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.Machine#getDeployedResource <em>Deployed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Resource</em>'.
	 * @see kdm.platform.Machine#getDeployedResource()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_DeployedResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.DeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Component</em>'.
	 * @see kdm.platform.DeployedComponent
	 * @generated
	 */
	EClass getDeployedComponent();

	/**
	 * Returns the meta object for the reference list '{@link kdm.platform.DeployedComponent#getGroupedCode <em>Grouped Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Code</em>'.
	 * @see kdm.platform.DeployedComponent#getGroupedCode()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EReference getDeployedComponent_GroupedCode();

	/**
	 * Returns the meta object for class '{@link kdm.platform.DeployedResource <em>Deployed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Resource</em>'.
	 * @see kdm.platform.DeployedResource
	 * @generated
	 */
	EClass getDeployedResource();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.platform.DeployedResource#getPlatformElement <em>Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Element</em>'.
	 * @see kdm.platform.DeployedResource#getPlatformElement()
	 * @see #getDeployedResource()
	 * @generated
	 */
	EReference getDeployedResource_PlatformElement();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Loads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loads</em>'.
	 * @see kdm.platform.Loads
	 * @generated
	 */
	EClass getLoads();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Loads#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.Loads#getTo()
	 * @see #getLoads()
	 * @generated
	 */
	EReference getLoads_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Loads#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.Loads#getFrom()
	 * @see #getLoads()
	 * @generated
	 */
	EReference getLoads_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Spawns <em>Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spawns</em>'.
	 * @see kdm.platform.Spawns
	 * @generated
	 */
	EClass getSpawns();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Spawns#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.Spawns#getTo()
	 * @see #getSpawns()
	 * @generated
	 */
	EReference getSpawns_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.Spawns#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.Spawns#getFrom()
	 * @see #getSpawns()
	 * @generated
	 */
	EReference getSpawns_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.RuntimeResource <em>Runtime Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Resource</em>'.
	 * @see kdm.platform.RuntimeResource
	 * @generated
	 */
	EClass getRuntimeResource();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see kdm.platform.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for class '{@link kdm.platform.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see kdm.platform.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link kdm.platform.ReadsResource <em>Reads Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads Resource</em>'.
	 * @see kdm.platform.ReadsResource
	 * @generated
	 */
	EClass getReadsResource();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.ReadsResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.ReadsResource#getTo()
	 * @see #getReadsResource()
	 * @generated
	 */
	EReference getReadsResource_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.ReadsResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.ReadsResource#getFrom()
	 * @see #getReadsResource()
	 * @generated
	 */
	EReference getReadsResource_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.WritesResource <em>Writes Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes Resource</em>'.
	 * @see kdm.platform.WritesResource
	 * @generated
	 */
	EClass getWritesResource();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.WritesResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.WritesResource#getTo()
	 * @see #getWritesResource()
	 * @generated
	 */
	EReference getWritesResource_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.WritesResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.WritesResource#getFrom()
	 * @see #getWritesResource()
	 * @generated
	 */
	EReference getWritesResource_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.ManagesResource <em>Manages Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manages Resource</em>'.
	 * @see kdm.platform.ManagesResource
	 * @generated
	 */
	EClass getManagesResource();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.ManagesResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.ManagesResource#getTo()
	 * @see #getManagesResource()
	 * @generated
	 */
	EReference getManagesResource_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.ManagesResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.ManagesResource#getFrom()
	 * @see #getManagesResource()
	 * @generated
	 */
	EReference getManagesResource_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.DefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined By</em>'.
	 * @see kdm.platform.DefinedBy
	 * @generated
	 */
	EClass getDefinedBy();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.DefinedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.platform.DefinedBy#getTo()
	 * @see #getDefinedBy()
	 * @generated
	 */
	EReference getDefinedBy_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.platform.DefinedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.platform.DefinedBy#getFrom()
	 * @see #getDefinedBy()
	 * @generated
	 */
	EReference getDefinedBy_From();

	/**
	 * Returns the meta object for class '{@link kdm.platform.StreamResource <em>Stream Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Resource</em>'.
	 * @see kdm.platform.StreamResource
	 * @generated
	 */
	EClass getStreamResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

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
		 * The meta object literal for the '{@link kdm.platform.AbstractPlatformElement <em>Abstract Platform Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.AbstractPlatformElement
		 * @see kdm.platform.impl.PlatformPackageImpl#getAbstractPlatformElement()
		 * @generated
		 */
		EClass ABSTRACT_PLATFORM_ELEMENT = eINSTANCE.getAbstractPlatformElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PLATFORM_ELEMENT__SOURCE = eINSTANCE.getAbstractPlatformElement_Source();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PLATFORM_ELEMENT__RELATION = eINSTANCE.getAbstractPlatformElement_Relation();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION = eINSTANCE.getAbstractPlatformElement_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION = eINSTANCE.getAbstractPlatformElement_Implementation();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.PlatformModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.PlatformModelImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformModel()
		 * @generated
		 */
		EClass PLATFORM_MODEL = eINSTANCE.getPlatformModel();

		/**
		 * The meta object literal for the '<em><b>Platform Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__PLATFORM_ELEMENT = eINSTANCE.getPlatformModel_PlatformElement();

		/**
		 * The meta object literal for the '{@link kdm.platform.AbstractPlatformRelationship <em>Abstract Platform Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.AbstractPlatformRelationship
		 * @see kdm.platform.impl.PlatformPackageImpl#getAbstractPlatformRelationship()
		 * @generated
		 */
		EClass ABSTRACT_PLATFORM_RELATIONSHIP = eINSTANCE.getAbstractPlatformRelationship();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.RequiresImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__TO = eINSTANCE.getRequires_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__FROM = eINSTANCE.getRequires_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ResourceTypeImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Platform Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__PLATFORM_ELEMENT = eINSTANCE.getResourceType_PlatformElement();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.NamingResourceImpl <em>Naming Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.NamingResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getNamingResource()
		 * @generated
		 */
		EClass NAMING_RESOURCE = eINSTANCE.getNamingResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.MarshalledResourceImpl <em>Marshalled Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.MarshalledResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getMarshalledResource()
		 * @generated
		 */
		EClass MARSHALLED_RESOURCE = eINSTANCE.getMarshalledResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.MessagingResourceImpl <em>Messaging Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.MessagingResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getMessagingResource()
		 * @generated
		 */
		EClass MESSAGING_RESOURCE = eINSTANCE.getMessagingResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.FileResourceImpl <em>File Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.FileResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getFileResource()
		 * @generated
		 */
		EClass FILE_RESOURCE = eINSTANCE.getFileResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ExecutionResourceImpl <em>Execution Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ExecutionResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getExecutionResource()
		 * @generated
		 */
		EClass EXECUTION_RESOURCE = eINSTANCE.getExecutionResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.PlatformActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.PlatformActionImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformAction()
		 * @generated
		 */
		EClass PLATFORM_ACTION = eINSTANCE.getPlatformAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_ACTION__KIND = eINSTANCE.getPlatformAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Platform Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ACTION__PLATFORM_ELEMENT = eINSTANCE.getPlatformAction_PlatformElement();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ExternalActorImpl <em>External Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ExternalActorImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getExternalActor()
		 * @generated
		 */
		EClass EXTERNAL_ACTOR = eINSTANCE.getExternalActor();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.DataManagerImpl <em>Data Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.DataManagerImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getDataManager()
		 * @generated
		 */
		EClass DATA_MANAGER = eINSTANCE.getDataManager();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.BindsToImpl <em>Binds To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.BindsToImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getBindsTo()
		 * @generated
		 */
		EClass BINDS_TO = eINSTANCE.getBindsTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDS_TO__TO = eINSTANCE.getBindsTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDS_TO__FROM = eINSTANCE.getBindsTo_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.PlatformElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.PlatformElementImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformElement()
		 * @generated
		 */
		EClass PLATFORM_ELEMENT = eINSTANCE.getPlatformElement();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.PlatformRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.PlatformRelationshipImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformRelationship()
		 * @generated
		 */
		EClass PLATFORM_RELATIONSHIP = eINSTANCE.getPlatformRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_RELATIONSHIP__TO = eINSTANCE.getPlatformRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_RELATIONSHIP__FROM = eINSTANCE.getPlatformRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.PlatformEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.PlatformEventImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getPlatformEvent()
		 * @generated
		 */
		EClass PLATFORM_EVENT = eINSTANCE.getPlatformEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_EVENT__KIND = eINSTANCE.getPlatformEvent_Kind();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.LockResourceImpl <em>Lock Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.LockResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getLockResource()
		 * @generated
		 */
		EClass LOCK_RESOURCE = eINSTANCE.getLockResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.DeployedSoftwareSystemImpl <em>Deployed Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.DeployedSoftwareSystemImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedSoftwareSystem()
		 * @generated
		 */
		EClass DEPLOYED_SOFTWARE_SYSTEM = eINSTANCE.getDeployedSoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Grouped Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT = eINSTANCE.getDeployedSoftwareSystem_GroupedComponent();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.MachineImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Deployed Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__DEPLOYED_COMPONENT = eINSTANCE.getMachine_DeployedComponent();

		/**
		 * The meta object literal for the '<em><b>Deployed Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__DEPLOYED_RESOURCE = eINSTANCE.getMachine_DeployedResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.DeployedComponentImpl <em>Deployed Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.DeployedComponentImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedComponent()
		 * @generated
		 */
		EClass DEPLOYED_COMPONENT = eINSTANCE.getDeployedComponent();

		/**
		 * The meta object literal for the '<em><b>Grouped Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_COMPONENT__GROUPED_CODE = eINSTANCE.getDeployedComponent_GroupedCode();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.DeployedResourceImpl <em>Deployed Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.DeployedResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getDeployedResource()
		 * @generated
		 */
		EClass DEPLOYED_RESOURCE = eINSTANCE.getDeployedResource();

		/**
		 * The meta object literal for the '<em><b>Platform Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_RESOURCE__PLATFORM_ELEMENT = eINSTANCE.getDeployedResource_PlatformElement();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.LoadsImpl <em>Loads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.LoadsImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getLoads()
		 * @generated
		 */
		EClass LOADS = eINSTANCE.getLoads();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADS__TO = eINSTANCE.getLoads_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADS__FROM = eINSTANCE.getLoads_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.SpawnsImpl <em>Spawns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.SpawnsImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getSpawns()
		 * @generated
		 */
		EClass SPAWNS = eINSTANCE.getSpawns();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAWNS__TO = eINSTANCE.getSpawns_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAWNS__FROM = eINSTANCE.getSpawns_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.RuntimeResourceImpl <em>Runtime Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.RuntimeResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getRuntimeResource()
		 * @generated
		 */
		EClass RUNTIME_RESOURCE = eINSTANCE.getRuntimeResource();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ThreadImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ProcessImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ReadsResourceImpl <em>Reads Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ReadsResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getReadsResource()
		 * @generated
		 */
		EClass READS_RESOURCE = eINSTANCE.getReadsResource();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_RESOURCE__TO = eINSTANCE.getReadsResource_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_RESOURCE__FROM = eINSTANCE.getReadsResource_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.WritesResourceImpl <em>Writes Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.WritesResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getWritesResource()
		 * @generated
		 */
		EClass WRITES_RESOURCE = eINSTANCE.getWritesResource();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_RESOURCE__TO = eINSTANCE.getWritesResource_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES_RESOURCE__FROM = eINSTANCE.getWritesResource_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.ManagesResourceImpl <em>Manages Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.ManagesResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getManagesResource()
		 * @generated
		 */
		EClass MANAGES_RESOURCE = eINSTANCE.getManagesResource();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_RESOURCE__TO = eINSTANCE.getManagesResource_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGES_RESOURCE__FROM = eINSTANCE.getManagesResource_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.DefinedByImpl <em>Defined By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.DefinedByImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getDefinedBy()
		 * @generated
		 */
		EClass DEFINED_BY = eINSTANCE.getDefinedBy();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_BY__TO = eINSTANCE.getDefinedBy_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_BY__FROM = eINSTANCE.getDefinedBy_From();

		/**
		 * The meta object literal for the '{@link kdm.platform.impl.StreamResourceImpl <em>Stream Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.platform.impl.StreamResourceImpl
		 * @see kdm.platform.impl.PlatformPackageImpl#getStreamResource()
		 * @generated
		 */
		EClass STREAM_RESOURCE = eINSTANCE.getStreamResource();

	}

} //PlatformPackage
