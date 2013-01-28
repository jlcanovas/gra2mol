/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;

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
 * @see kdm.source.SourceFactory
 * @model kind="package"
 * @generated
 */
public interface SourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "source";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/source";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "source";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcePackage eINSTANCE = kdm.source.impl.SourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.source.impl.SourceRefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.SourceRefImpl
	 * @see kdm.source.impl.SourcePackageImpl#getSourceRef()
	 * @generated
	 */
	int SOURCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__REGION = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__LANGUAGE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__SNIPPET = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.source.impl.SourceRegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.SourceRegionImpl
	 * @see kdm.source.impl.SourcePackageImpl#getSourceRegion()
	 * @generated
	 */
	int SOURCE_REGION = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__ATTRIBUTE = CorePackage.ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__ANNOTATION = CorePackage.ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__FILE = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__START_LINE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__START_POSITION = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__END_LINE = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__END_POSITION = CorePackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__LANGUAGE = CorePackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION__PATH = CorePackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REGION_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link kdm.source.impl.InventoryModelImpl <em>Inventory Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.InventoryModelImpl
	 * @see kdm.source.impl.SourcePackageImpl#getInventoryModel()
	 * @generated
	 */
	int INVENTORY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL__INVENTORY_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inventory Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.source.AbstractInventoryElement <em>Abstract Inventory Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.AbstractInventoryElement
	 * @see kdm.source.impl.SourcePackageImpl#getAbstractInventoryElement()
	 * @generated
	 */
	int ABSTRACT_INVENTORY_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Inventory Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.source.impl.InventoryItemImpl <em>Inventory Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.InventoryItemImpl
	 * @see kdm.source.impl.SourcePackageImpl#getInventoryItem()
	 * @generated
	 */
	int INVENTORY_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__ATTRIBUTE = ABSTRACT_INVENTORY_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__ANNOTATION = ABSTRACT_INVENTORY_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__STEREOTYPE = ABSTRACT_INVENTORY_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__TAGGED_VALUE = ABSTRACT_INVENTORY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__NAME = ABSTRACT_INVENTORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__INVENTORY_RELATION = ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__VERSION = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__PATH = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inventory Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_FEATURE_COUNT = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.source.impl.SourceFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.SourceFileImpl
	 * @see kdm.source.impl.SourcePackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__LANGUAGE = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__ENCODING = INVENTORY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.source.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.ImageImpl
	 * @see kdm.source.impl.SourcePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.ResourceDescriptionImpl <em>Resource Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.ResourceDescriptionImpl
	 * @see kdm.source.impl.SourcePackageImpl#getResourceDescription()
	 * @generated
	 */
	int RESOURCE_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Resource Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DESCRIPTION_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.ConfigurationImpl
	 * @see kdm.source.impl.SourcePackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.InventoryContainerImpl <em>Inventory Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.InventoryContainerImpl
	 * @see kdm.source.impl.SourcePackageImpl#getInventoryContainer()
	 * @generated
	 */
	int INVENTORY_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__ATTRIBUTE = ABSTRACT_INVENTORY_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__ANNOTATION = ABSTRACT_INVENTORY_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__STEREOTYPE = ABSTRACT_INVENTORY_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__TAGGED_VALUE = ABSTRACT_INVENTORY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__NAME = ABSTRACT_INVENTORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__INVENTORY_RELATION = ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Inventory Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER__INVENTORY_ELEMENT = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inventory Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_CONTAINER_FEATURE_COUNT = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.source.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.DirectoryImpl
	 * @see kdm.source.impl.SourcePackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ATTRIBUTE = INVENTORY_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ANNOTATION = INVENTORY_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__STEREOTYPE = INVENTORY_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__TAGGED_VALUE = INVENTORY_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = INVENTORY_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__INVENTORY_RELATION = INVENTORY_CONTAINER__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Inventory Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__INVENTORY_ELEMENT = INVENTORY_CONTAINER__INVENTORY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = INVENTORY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = INVENTORY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.source.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.ProjectImpl
	 * @see kdm.source.impl.SourcePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ATTRIBUTE = INVENTORY_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ANNOTATION = INVENTORY_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STEREOTYPE = INVENTORY_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TAGGED_VALUE = INVENTORY_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = INVENTORY_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INVENTORY_RELATION = INVENTORY_CONTAINER__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Inventory Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INVENTORY_ELEMENT = INVENTORY_CONTAINER__INVENTORY_ELEMENT;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = INVENTORY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.AbstractInventoryRelationship <em>Abstract Inventory Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.AbstractInventoryRelationship
	 * @see kdm.source.impl.SourcePackageImpl#getAbstractInventoryRelationship()
	 * @generated
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Inventory Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.BinaryFileImpl <em>Binary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.BinaryFileImpl
	 * @see kdm.source.impl.SourcePackageImpl#getBinaryFile()
	 * @generated
	 */
	int BINARY_FILE = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FILE_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.ExecutableFileImpl <em>Executable File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.ExecutableFileImpl
	 * @see kdm.source.impl.SourcePackageImpl#getExecutableFile()
	 * @generated
	 */
	int EXECUTABLE_FILE = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__ATTRIBUTE = INVENTORY_ITEM__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__ANNOTATION = INVENTORY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__STEREOTYPE = INVENTORY_ITEM__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__TAGGED_VALUE = INVENTORY_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__NAME = INVENTORY_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__INVENTORY_RELATION = INVENTORY_ITEM__INVENTORY_RELATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__VERSION = INVENTORY_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE__PATH = INVENTORY_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Executable File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FILE_FEATURE_COUNT = INVENTORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.DependsOnImpl <em>Depends On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.DependsOnImpl
	 * @see kdm.source.impl.SourcePackageImpl#getDependsOn()
	 * @generated
	 */
	int DEPENDS_ON = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ATTRIBUTE = ABSTRACT_INVENTORY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ANNOTATION = ABSTRACT_INVENTORY_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__STEREOTYPE = ABSTRACT_INVENTORY_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__TAGGED_VALUE = ABSTRACT_INVENTORY_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__TO = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__FROM = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Depends On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_FEATURE_COUNT = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.source.impl.InventoryElementImpl <em>Inventory Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.InventoryElementImpl
	 * @see kdm.source.impl.SourcePackageImpl#getInventoryElement()
	 * @generated
	 */
	int INVENTORY_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__ATTRIBUTE = ABSTRACT_INVENTORY_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__ANNOTATION = ABSTRACT_INVENTORY_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__STEREOTYPE = ABSTRACT_INVENTORY_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__TAGGED_VALUE = ABSTRACT_INVENTORY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__NAME = ABSTRACT_INVENTORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inventory Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT__INVENTORY_RELATION = ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATION;

	/**
	 * The number of structural features of the '<em>Inventory Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ELEMENT_FEATURE_COUNT = ABSTRACT_INVENTORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.source.impl.InventoryRelationshipImpl <em>Inventory Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.source.impl.InventoryRelationshipImpl
	 * @see kdm.source.impl.SourcePackageImpl#getInventoryRelationship()
	 * @generated
	 */
	int INVENTORY_RELATIONSHIP = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__ATTRIBUTE = ABSTRACT_INVENTORY_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__ANNOTATION = ABSTRACT_INVENTORY_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__STEREOTYPE = ABSTRACT_INVENTORY_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_INVENTORY_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__TO = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP__FROM = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inventory Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_INVENTORY_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kdm.source.SourceRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see kdm.source.SourceRef
	 * @generated
	 */
	EClass getSourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.source.SourceRef#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see kdm.source.SourceRef#getRegion()
	 * @see #getSourceRef()
	 * @generated
	 */
	EReference getSourceRef_Region();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRef#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see kdm.source.SourceRef#getLanguage()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Language();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRef#getSnippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet</em>'.
	 * @see kdm.source.SourceRef#getSnippet()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Snippet();

	/**
	 * Returns the meta object for class '{@link kdm.source.SourceRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see kdm.source.SourceRegion
	 * @generated
	 */
	EClass getSourceRegion();

	/**
	 * Returns the meta object for the reference '{@link kdm.source.SourceRegion#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see kdm.source.SourceRegion#getFile()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EReference getSourceRegion_File();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getStartLine <em>Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line</em>'.
	 * @see kdm.source.SourceRegion#getStartLine()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_StartLine();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see kdm.source.SourceRegion#getStartPosition()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_StartPosition();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getEndLine <em>End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line</em>'.
	 * @see kdm.source.SourceRegion#getEndLine()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_EndLine();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Position</em>'.
	 * @see kdm.source.SourceRegion#getEndPosition()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_EndPosition();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see kdm.source.SourceRegion#getLanguage()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_Language();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceRegion#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kdm.source.SourceRegion#getPath()
	 * @see #getSourceRegion()
	 * @generated
	 */
	EAttribute getSourceRegion_Path();

	/**
	 * Returns the meta object for class '{@link kdm.source.InventoryModel <em>Inventory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Model</em>'.
	 * @see kdm.source.InventoryModel
	 * @generated
	 */
	EClass getInventoryModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.source.InventoryModel#getInventoryElement <em>Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Element</em>'.
	 * @see kdm.source.InventoryModel#getInventoryElement()
	 * @see #getInventoryModel()
	 * @generated
	 */
	EReference getInventoryModel_InventoryElement();

	/**
	 * Returns the meta object for class '{@link kdm.source.AbstractInventoryElement <em>Abstract Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Inventory Element</em>'.
	 * @see kdm.source.AbstractInventoryElement
	 * @generated
	 */
	EClass getAbstractInventoryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.source.AbstractInventoryElement#getInventoryRelation <em>Inventory Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Relation</em>'.
	 * @see kdm.source.AbstractInventoryElement#getInventoryRelation()
	 * @see #getAbstractInventoryElement()
	 * @generated
	 */
	EReference getAbstractInventoryElement_InventoryRelation();

	/**
	 * Returns the meta object for class '{@link kdm.source.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Item</em>'.
	 * @see kdm.source.InventoryItem
	 * @generated
	 */
	EClass getInventoryItem();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.InventoryItem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see kdm.source.InventoryItem#getVersion()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_Version();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.InventoryItem#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kdm.source.InventoryItem#getPath()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_Path();

	/**
	 * Returns the meta object for class '{@link kdm.source.SourceFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see kdm.source.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceFile#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see kdm.source.SourceFile#getLanguage()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_Language();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.SourceFile#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see kdm.source.SourceFile#getEncoding()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_Encoding();

	/**
	 * Returns the meta object for class '{@link kdm.source.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see kdm.source.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link kdm.source.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Description</em>'.
	 * @see kdm.source.ResourceDescription
	 * @generated
	 */
	EClass getResourceDescription();

	/**
	 * Returns the meta object for class '{@link kdm.source.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see kdm.source.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link kdm.source.InventoryContainer <em>Inventory Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Container</em>'.
	 * @see kdm.source.InventoryContainer
	 * @generated
	 */
	EClass getInventoryContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.source.InventoryContainer#getInventoryElement <em>Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Element</em>'.
	 * @see kdm.source.InventoryContainer#getInventoryElement()
	 * @see #getInventoryContainer()
	 * @generated
	 */
	EReference getInventoryContainer_InventoryElement();

	/**
	 * Returns the meta object for class '{@link kdm.source.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see kdm.source.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the attribute '{@link kdm.source.Directory#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kdm.source.Directory#getPath()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Path();

	/**
	 * Returns the meta object for class '{@link kdm.source.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see kdm.source.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for class '{@link kdm.source.AbstractInventoryRelationship <em>Abstract Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Inventory Relationship</em>'.
	 * @see kdm.source.AbstractInventoryRelationship
	 * @generated
	 */
	EClass getAbstractInventoryRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.source.BinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary File</em>'.
	 * @see kdm.source.BinaryFile
	 * @generated
	 */
	EClass getBinaryFile();

	/**
	 * Returns the meta object for class '{@link kdm.source.ExecutableFile <em>Executable File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable File</em>'.
	 * @see kdm.source.ExecutableFile
	 * @generated
	 */
	EClass getExecutableFile();

	/**
	 * Returns the meta object for class '{@link kdm.source.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends On</em>'.
	 * @see kdm.source.DependsOn
	 * @generated
	 */
	EClass getDependsOn();

	/**
	 * Returns the meta object for the reference '{@link kdm.source.DependsOn#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.source.DependsOn#getTo()
	 * @see #getDependsOn()
	 * @generated
	 */
	EReference getDependsOn_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.source.DependsOn#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.source.DependsOn#getFrom()
	 * @see #getDependsOn()
	 * @generated
	 */
	EReference getDependsOn_From();

	/**
	 * Returns the meta object for class '{@link kdm.source.InventoryElement <em>Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Element</em>'.
	 * @see kdm.source.InventoryElement
	 * @generated
	 */
	EClass getInventoryElement();

	/**
	 * Returns the meta object for class '{@link kdm.source.InventoryRelationship <em>Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Relationship</em>'.
	 * @see kdm.source.InventoryRelationship
	 * @generated
	 */
	EClass getInventoryRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.source.InventoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.source.InventoryRelationship#getTo()
	 * @see #getInventoryRelationship()
	 * @generated
	 */
	EReference getInventoryRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.source.InventoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.source.InventoryRelationship#getFrom()
	 * @see #getInventoryRelationship()
	 * @generated
	 */
	EReference getInventoryRelationship_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourceFactory getSourceFactory();

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
		 * The meta object literal for the '{@link kdm.source.impl.SourceRefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.SourceRefImpl
		 * @see kdm.source.impl.SourcePackageImpl#getSourceRef()
		 * @generated
		 */
		EClass SOURCE_REF = eINSTANCE.getSourceRef();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_REF__REGION = eINSTANCE.getSourceRef_Region();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__LANGUAGE = eINSTANCE.getSourceRef_Language();

		/**
		 * The meta object literal for the '<em><b>Snippet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__SNIPPET = eINSTANCE.getSourceRef_Snippet();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.SourceRegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.SourceRegionImpl
		 * @see kdm.source.impl.SourcePackageImpl#getSourceRegion()
		 * @generated
		 */
		EClass SOURCE_REGION = eINSTANCE.getSourceRegion();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_REGION__FILE = eINSTANCE.getSourceRegion_File();

		/**
		 * The meta object literal for the '<em><b>Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__START_LINE = eINSTANCE.getSourceRegion_StartLine();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__START_POSITION = eINSTANCE.getSourceRegion_StartPosition();

		/**
		 * The meta object literal for the '<em><b>End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__END_LINE = eINSTANCE.getSourceRegion_EndLine();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__END_POSITION = eINSTANCE.getSourceRegion_EndPosition();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__LANGUAGE = eINSTANCE.getSourceRegion_Language();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REGION__PATH = eINSTANCE.getSourceRegion_Path();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.InventoryModelImpl <em>Inventory Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.InventoryModelImpl
		 * @see kdm.source.impl.SourcePackageImpl#getInventoryModel()
		 * @generated
		 */
		EClass INVENTORY_MODEL = eINSTANCE.getInventoryModel();

		/**
		 * The meta object literal for the '<em><b>Inventory Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_MODEL__INVENTORY_ELEMENT = eINSTANCE.getInventoryModel_InventoryElement();

		/**
		 * The meta object literal for the '{@link kdm.source.AbstractInventoryElement <em>Abstract Inventory Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.AbstractInventoryElement
		 * @see kdm.source.impl.SourcePackageImpl#getAbstractInventoryElement()
		 * @generated
		 */
		EClass ABSTRACT_INVENTORY_ELEMENT = eINSTANCE.getAbstractInventoryElement();

		/**
		 * The meta object literal for the '<em><b>Inventory Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATION = eINSTANCE.getAbstractInventoryElement_InventoryRelation();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.InventoryItemImpl <em>Inventory Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.InventoryItemImpl
		 * @see kdm.source.impl.SourcePackageImpl#getInventoryItem()
		 * @generated
		 */
		EClass INVENTORY_ITEM = eINSTANCE.getInventoryItem();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__VERSION = eINSTANCE.getInventoryItem_Version();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY_ITEM__PATH = eINSTANCE.getInventoryItem_Path();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.SourceFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.SourceFileImpl
		 * @see kdm.source.impl.SourcePackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__LANGUAGE = eINSTANCE.getSourceFile_Language();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__ENCODING = eINSTANCE.getSourceFile_Encoding();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.ImageImpl
		 * @see kdm.source.impl.SourcePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.ResourceDescriptionImpl <em>Resource Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.ResourceDescriptionImpl
		 * @see kdm.source.impl.SourcePackageImpl#getResourceDescription()
		 * @generated
		 */
		EClass RESOURCE_DESCRIPTION = eINSTANCE.getResourceDescription();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.ConfigurationImpl
		 * @see kdm.source.impl.SourcePackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.InventoryContainerImpl <em>Inventory Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.InventoryContainerImpl
		 * @see kdm.source.impl.SourcePackageImpl#getInventoryContainer()
		 * @generated
		 */
		EClass INVENTORY_CONTAINER = eINSTANCE.getInventoryContainer();

		/**
		 * The meta object literal for the '<em><b>Inventory Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_CONTAINER__INVENTORY_ELEMENT = eINSTANCE.getInventoryContainer_InventoryElement();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.DirectoryImpl
		 * @see kdm.source.impl.SourcePackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTORY__PATH = eINSTANCE.getDirectory_Path();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.ProjectImpl
		 * @see kdm.source.impl.SourcePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '{@link kdm.source.AbstractInventoryRelationship <em>Abstract Inventory Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.AbstractInventoryRelationship
		 * @see kdm.source.impl.SourcePackageImpl#getAbstractInventoryRelationship()
		 * @generated
		 */
		EClass ABSTRACT_INVENTORY_RELATIONSHIP = eINSTANCE.getAbstractInventoryRelationship();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.BinaryFileImpl <em>Binary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.BinaryFileImpl
		 * @see kdm.source.impl.SourcePackageImpl#getBinaryFile()
		 * @generated
		 */
		EClass BINARY_FILE = eINSTANCE.getBinaryFile();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.ExecutableFileImpl <em>Executable File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.ExecutableFileImpl
		 * @see kdm.source.impl.SourcePackageImpl#getExecutableFile()
		 * @generated
		 */
		EClass EXECUTABLE_FILE = eINSTANCE.getExecutableFile();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.DependsOnImpl <em>Depends On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.DependsOnImpl
		 * @see kdm.source.impl.SourcePackageImpl#getDependsOn()
		 * @generated
		 */
		EClass DEPENDS_ON = eINSTANCE.getDependsOn();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDS_ON__TO = eINSTANCE.getDependsOn_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDS_ON__FROM = eINSTANCE.getDependsOn_From();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.InventoryElementImpl <em>Inventory Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.InventoryElementImpl
		 * @see kdm.source.impl.SourcePackageImpl#getInventoryElement()
		 * @generated
		 */
		EClass INVENTORY_ELEMENT = eINSTANCE.getInventoryElement();

		/**
		 * The meta object literal for the '{@link kdm.source.impl.InventoryRelationshipImpl <em>Inventory Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.source.impl.InventoryRelationshipImpl
		 * @see kdm.source.impl.SourcePackageImpl#getInventoryRelationship()
		 * @generated
		 */
		EClass INVENTORY_RELATIONSHIP = eINSTANCE.getInventoryRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_RELATIONSHIP__TO = eINSTANCE.getInventoryRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_RELATIONSHIP__FROM = eINSTANCE.getInventoryRelationship_From();

	}

} //SourcePackage
