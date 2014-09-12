/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.CorePackage;

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
 * @see kdm.kdm.KdmFactory
 * @model kind="package"
 * @generated
 */
public interface KdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/kdm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KdmPackage eINSTANCE = kdm.kdm.impl.KdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.kdm.KDMFramework <em>KDM Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.KDMFramework
	 * @see kdm.kdm.impl.KdmPackageImpl#getKDMFramework()
	 * @generated
	 */
	int KDM_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__ATTRIBUTE = CorePackage.MODEL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__ANNOTATION = CorePackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__AUDIT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__EXTENSION_FAMILY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK__NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>KDM Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_FRAMEWORK_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.kdm.KDMModel <em>KDM Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.KDMModel
	 * @see kdm.kdm.impl.KdmPackageImpl#getKDMModel()
	 * @generated
	 */
	int KDM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__ATTRIBUTE = KDM_FRAMEWORK__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__ANNOTATION = KDM_FRAMEWORK__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__STEREOTYPE = KDM_FRAMEWORK__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__TAGGED_VALUE = KDM_FRAMEWORK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__AUDIT = KDM_FRAMEWORK__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__EXTENSION_FAMILY = KDM_FRAMEWORK__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL__NAME = KDM_FRAMEWORK__NAME;

	/**
	 * The number of structural features of the '<em>KDM Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDM_MODEL_FEATURE_COUNT = KDM_FRAMEWORK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.AuditImpl <em>Audit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.AuditImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getAudit()
	 * @generated
	 */
	int AUDIT = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__DESCRIPTION = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__AUTHOR = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__DATE = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Audit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.SegmentImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ATTRIBUTE = KDM_FRAMEWORK__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ANNOTATION = KDM_FRAMEWORK__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__STEREOTYPE = KDM_FRAMEWORK__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__TAGGED_VALUE = KDM_FRAMEWORK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__AUDIT = KDM_FRAMEWORK__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__EXTENSION_FAMILY = KDM_FRAMEWORK__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = KDM_FRAMEWORK__NAME;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__SEGMENT = KDM_FRAMEWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__MODEL = KDM_FRAMEWORK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = KDM_FRAMEWORK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.AttributeImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAG = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.AnnotationImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.TagDefinitionImpl <em>Tag Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.TagDefinitionImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getTagDefinition()
	 * @generated
	 */
	int TAG_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION__TAG = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION__TYPE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.kdm.ExtendedValue <em>Extended Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.ExtendedValue
	 * @see kdm.kdm.impl.KdmPackageImpl#getExtendedValue()
	 * @generated
	 */
	int EXTENDED_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_VALUE__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_VALUE__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_VALUE__TAG = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extended Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_VALUE_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.StereotypeImpl <em>Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.StereotypeImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__TAG = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__TYPE = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.ExtensionFamilyImpl <em>Extension Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.ExtensionFamilyImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getExtensionFamily()
	 * @generated
	 */
	int EXTENSION_FAMILY = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FAMILY__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FAMILY__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FAMILY__STEREOTYPE = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FAMILY__NAME = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FAMILY_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.TaggedRefImpl <em>Tagged Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.TaggedRefImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getTaggedRef()
	 * @generated
	 */
	int TAGGED_REF = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REF__ATTRIBUTE = EXTENDED_VALUE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REF__ANNOTATION = EXTENDED_VALUE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REF__TAG = EXTENDED_VALUE__TAG;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REF__REFERENCE = EXTENDED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_REF_FEATURE_COUNT = EXTENDED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.kdm.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.kdm.impl.TaggedValueImpl
	 * @see kdm.kdm.impl.KdmPackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__ATTRIBUTE = EXTENDED_VALUE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__ANNOTATION = EXTENDED_VALUE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__TAG = EXTENDED_VALUE__TAG;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = EXTENDED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = EXTENDED_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDM Framework</em>'.
	 * @see kdm.kdm.KDMFramework
	 * @generated
	 */
	EClass getKDMFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.KDMFramework#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audit</em>'.
	 * @see kdm.kdm.KDMFramework#getAudit()
	 * @see #getKDMFramework()
	 * @generated
	 */
	EReference getKDMFramework_Audit();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.KDMFramework#getExtensionFamily <em>Extension Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Family</em>'.
	 * @see kdm.kdm.KDMFramework#getExtensionFamily()
	 * @see #getKDMFramework()
	 * @generated
	 */
	EReference getKDMFramework_ExtensionFamily();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.KDMFramework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kdm.kdm.KDMFramework#getName()
	 * @see #getKDMFramework()
	 * @generated
	 */
	EAttribute getKDMFramework_Name();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDM Model</em>'.
	 * @see kdm.kdm.KDMModel
	 * @generated
	 */
	EClass getKDMModel();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.Audit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit</em>'.
	 * @see kdm.kdm.Audit
	 * @generated
	 */
	EClass getAudit();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Audit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kdm.kdm.Audit#getDescription()
	 * @see #getAudit()
	 * @generated
	 */
	EAttribute getAudit_Description();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Audit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see kdm.kdm.Audit#getAuthor()
	 * @see #getAudit()
	 * @generated
	 */
	EAttribute getAudit_Author();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Audit#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see kdm.kdm.Audit#getDate()
	 * @see #getAudit()
	 * @generated
	 */
	EAttribute getAudit_Date();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see kdm.kdm.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.Segment#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see kdm.kdm.Segment#getSegment()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Segment();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.Segment#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see kdm.kdm.Segment#getModel()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Model();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see kdm.kdm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Attribute#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see kdm.kdm.Attribute#getTag()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Tag();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kdm.kdm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see kdm.kdm.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see kdm.kdm.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.TagDefinition <em>Tag Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Definition</em>'.
	 * @see kdm.kdm.TagDefinition
	 * @generated
	 */
	EClass getTagDefinition();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.TagDefinition#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see kdm.kdm.TagDefinition#getTag()
	 * @see #getTagDefinition()
	 * @generated
	 */
	EAttribute getTagDefinition_Tag();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.TagDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kdm.kdm.TagDefinition#getType()
	 * @see #getTagDefinition()
	 * @generated
	 */
	EAttribute getTagDefinition_Type();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.ExtendedValue <em>Extended Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Value</em>'.
	 * @see kdm.kdm.ExtendedValue
	 * @generated
	 */
	EClass getExtendedValue();

	/**
	 * Returns the meta object for the reference '{@link kdm.kdm.ExtendedValue#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see kdm.kdm.ExtendedValue#getTag()
	 * @see #getExtendedValue()
	 * @generated
	 */
	EReference getExtendedValue_Tag();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see kdm.kdm.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.Stereotype#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see kdm.kdm.Stereotype#getTag()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_Tag();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Stereotype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kdm.kdm.Stereotype#getName()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_Name();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.Stereotype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kdm.kdm.Stereotype#getType()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_Type();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.ExtensionFamily <em>Extension Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Family</em>'.
	 * @see kdm.kdm.ExtensionFamily
	 * @generated
	 */
	EClass getExtensionFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.kdm.ExtensionFamily#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stereotype</em>'.
	 * @see kdm.kdm.ExtensionFamily#getStereotype()
	 * @see #getExtensionFamily()
	 * @generated
	 */
	EReference getExtensionFamily_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.ExtensionFamily#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kdm.kdm.ExtensionFamily#getName()
	 * @see #getExtensionFamily()
	 * @generated
	 */
	EAttribute getExtensionFamily_Name();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.TaggedRef <em>Tagged Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Ref</em>'.
	 * @see kdm.kdm.TaggedRef
	 * @generated
	 */
	EClass getTaggedRef();

	/**
	 * Returns the meta object for the reference '{@link kdm.kdm.TaggedRef#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see kdm.kdm.TaggedRef#getReference()
	 * @see #getTaggedRef()
	 * @generated
	 */
	EReference getTaggedRef_Reference();

	/**
	 * Returns the meta object for class '{@link kdm.kdm.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see kdm.kdm.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link kdm.kdm.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kdm.kdm.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KdmFactory getKdmFactory();

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
		 * The meta object literal for the '{@link kdm.kdm.KDMFramework <em>KDM Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.KDMFramework
		 * @see kdm.kdm.impl.KdmPackageImpl#getKDMFramework()
		 * @generated
		 */
		EClass KDM_FRAMEWORK = eINSTANCE.getKDMFramework();

		/**
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_FRAMEWORK__AUDIT = eINSTANCE.getKDMFramework_Audit();

		/**
		 * The meta object literal for the '<em><b>Extension Family</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDM_FRAMEWORK__EXTENSION_FAMILY = eINSTANCE.getKDMFramework_ExtensionFamily();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KDM_FRAMEWORK__NAME = eINSTANCE.getKDMFramework_Name();

		/**
		 * The meta object literal for the '{@link kdm.kdm.KDMModel <em>KDM Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.KDMModel
		 * @see kdm.kdm.impl.KdmPackageImpl#getKDMModel()
		 * @generated
		 */
		EClass KDM_MODEL = eINSTANCE.getKDMModel();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.AuditImpl <em>Audit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.AuditImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getAudit()
		 * @generated
		 */
		EClass AUDIT = eINSTANCE.getAudit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIT__DESCRIPTION = eINSTANCE.getAudit_Description();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIT__AUTHOR = eINSTANCE.getAudit_Author();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIT__DATE = eINSTANCE.getAudit_Date();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.SegmentImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__SEGMENT = eINSTANCE.getSegment_Segment();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__MODEL = eINSTANCE.getSegment_Model();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.AttributeImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TAG = eINSTANCE.getAttribute_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.AnnotationImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.TagDefinitionImpl <em>Tag Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.TagDefinitionImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getTagDefinition()
		 * @generated
		 */
		EClass TAG_DEFINITION = eINSTANCE.getTagDefinition();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_DEFINITION__TAG = eINSTANCE.getTagDefinition_Tag();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_DEFINITION__TYPE = eINSTANCE.getTagDefinition_Type();

		/**
		 * The meta object literal for the '{@link kdm.kdm.ExtendedValue <em>Extended Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.ExtendedValue
		 * @see kdm.kdm.impl.KdmPackageImpl#getExtendedValue()
		 * @generated
		 */
		EClass EXTENDED_VALUE = eINSTANCE.getExtendedValue();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_VALUE__TAG = eINSTANCE.getExtendedValue_Tag();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.StereotypeImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE__TAG = eINSTANCE.getStereotype_Tag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__NAME = eINSTANCE.getStereotype_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__TYPE = eINSTANCE.getStereotype_Type();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.ExtensionFamilyImpl <em>Extension Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.ExtensionFamilyImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getExtensionFamily()
		 * @generated
		 */
		EClass EXTENSION_FAMILY = eINSTANCE.getExtensionFamily();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_FAMILY__STEREOTYPE = eINSTANCE.getExtensionFamily_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_FAMILY__NAME = eINSTANCE.getExtensionFamily_Name();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.TaggedRefImpl <em>Tagged Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.TaggedRefImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getTaggedRef()
		 * @generated
		 */
		EClass TAGGED_REF = eINSTANCE.getTaggedRef();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_REF__REFERENCE = eINSTANCE.getTaggedRef_Reference();

		/**
		 * The meta object literal for the '{@link kdm.kdm.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.kdm.impl.TaggedValueImpl
		 * @see kdm.kdm.impl.KdmPackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

	}

} //KdmPackage
