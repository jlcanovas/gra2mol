/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.structure;

import kdm.core.CorePackage;

import kdm.kdm.KdmPackage;

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
 * @see kdm.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = kdm.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.structure.AbstractStructureElement <em>Abstract Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.AbstractStructureElement
	 * @see kdm.structure.impl.StructurePackageImpl#getAbstractStructureElement()
	 * @generated
	 */
	int ABSTRACT_STRUCTURE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.SubsystemImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.LayerImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.StructureModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.StructureModelImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getStructureModel()
	 * @generated
	 */
	int STRUCTURE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__STRUCTURE_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.ComponentImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.SoftwareSystemImpl <em>Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.SoftwareSystemImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getSoftwareSystem()
	 * @generated
	 */
	int SOFTWARE_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.AbstractStructureRelationship <em>Abstract Structure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.AbstractStructureRelationship
	 * @see kdm.structure.impl.StructurePackageImpl#getAbstractStructureRelationship()
	 * @generated
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Structure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRUCTURE_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.StructureRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.StructureRelationshipImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getStructureRelationship()
	 * @generated
	 */
	int STRUCTURE_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__ATTRIBUTE = ABSTRACT_STRUCTURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__ANNOTATION = ABSTRACT_STRUCTURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__STEREOTYPE = ABSTRACT_STRUCTURE_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_STRUCTURE_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__TO = ABSTRACT_STRUCTURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP__FROM = ABSTRACT_STRUCTURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_STRUCTURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.ArchitectureViewImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getArchitectureView()
	 * @generated
	 */
	int ARCHITECTURE_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Architecture View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.structure.impl.StructureElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.structure.impl.StructureElementImpl
	 * @see kdm.structure.impl.StructurePackageImpl#getStructureElement()
	 * @generated
	 */
	int STRUCTURE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__ATTRIBUTE = ABSTRACT_STRUCTURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__ANNOTATION = ABSTRACT_STRUCTURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__STEREOTYPE = ABSTRACT_STRUCTURE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__TAGGED_VALUE = ABSTRACT_STRUCTURE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__NAME = ABSTRACT_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__AGGREGATED = ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__IMPLEMENTATION = ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Structure Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__STRUCTURE_ELEMENT = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP = ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_FEATURE_COUNT = ABSTRACT_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kdm.structure.AbstractStructureElement <em>Abstract Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Structure Element</em>'.
	 * @see kdm.structure.AbstractStructureElement
	 * @generated
	 */
	EClass getAbstractStructureElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.structure.AbstractStructureElement#getAggregated <em>Aggregated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregated</em>'.
	 * @see kdm.structure.AbstractStructureElement#getAggregated()
	 * @see #getAbstractStructureElement()
	 * @generated
	 */
	EReference getAbstractStructureElement_Aggregated();

	/**
	 * Returns the meta object for the reference list '{@link kdm.structure.AbstractStructureElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.structure.AbstractStructureElement#getImplementation()
	 * @see #getAbstractStructureElement()
	 * @generated
	 */
	EReference getAbstractStructureElement_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.structure.AbstractStructureElement#getStructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Element</em>'.
	 * @see kdm.structure.AbstractStructureElement#getStructureElement()
	 * @see #getAbstractStructureElement()
	 * @generated
	 */
	EReference getAbstractStructureElement_StructureElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.structure.AbstractStructureElement#getStructureRelationship <em>Structure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Relationship</em>'.
	 * @see kdm.structure.AbstractStructureElement#getStructureRelationship()
	 * @see #getAbstractStructureElement()
	 * @generated
	 */
	EReference getAbstractStructureElement_StructureRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.structure.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see kdm.structure.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for class '{@link kdm.structure.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see kdm.structure.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for class '{@link kdm.structure.StructureModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.structure.StructureModel
	 * @generated
	 */
	EClass getStructureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.structure.StructureModel#getStructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Element</em>'.
	 * @see kdm.structure.StructureModel#getStructureElement()
	 * @see #getStructureModel()
	 * @generated
	 */
	EReference getStructureModel_StructureElement();

	/**
	 * Returns the meta object for class '{@link kdm.structure.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see kdm.structure.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link kdm.structure.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software System</em>'.
	 * @see kdm.structure.SoftwareSystem
	 * @generated
	 */
	EClass getSoftwareSystem();

	/**
	 * Returns the meta object for class '{@link kdm.structure.AbstractStructureRelationship <em>Abstract Structure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Structure Relationship</em>'.
	 * @see kdm.structure.AbstractStructureRelationship
	 * @generated
	 */
	EClass getAbstractStructureRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.structure.StructureRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.structure.StructureRelationship
	 * @generated
	 */
	EClass getStructureRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.structure.StructureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.structure.StructureRelationship#getTo()
	 * @see #getStructureRelationship()
	 * @generated
	 */
	EReference getStructureRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.structure.StructureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.structure.StructureRelationship#getFrom()
	 * @see #getStructureRelationship()
	 * @generated
	 */
	EReference getStructureRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.structure.ArchitectureView <em>Architecture View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture View</em>'.
	 * @see kdm.structure.ArchitectureView
	 * @generated
	 */
	EClass getArchitectureView();

	/**
	 * Returns the meta object for class '{@link kdm.structure.StructureElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.structure.StructureElement
	 * @generated
	 */
	EClass getStructureElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

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
		 * The meta object literal for the '{@link kdm.structure.AbstractStructureElement <em>Abstract Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.AbstractStructureElement
		 * @see kdm.structure.impl.StructurePackageImpl#getAbstractStructureElement()
		 * @generated
		 */
		EClass ABSTRACT_STRUCTURE_ELEMENT = eINSTANCE.getAbstractStructureElement();

		/**
		 * The meta object literal for the '<em><b>Aggregated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRUCTURE_ELEMENT__AGGREGATED = eINSTANCE.getAbstractStructureElement_Aggregated();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRUCTURE_ELEMENT__IMPLEMENTATION = eINSTANCE.getAbstractStructureElement_Implementation();

		/**
		 * The meta object literal for the '<em><b>Structure Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_ELEMENT = eINSTANCE.getAbstractStructureElement_StructureElement();

		/**
		 * The meta object literal for the '<em><b>Structure Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRUCTURE_ELEMENT__STRUCTURE_RELATIONSHIP = eINSTANCE.getAbstractStructureElement_StructureRelationship();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.SubsystemImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.LayerImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.StructureModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.StructureModelImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getStructureModel()
		 * @generated
		 */
		EClass STRUCTURE_MODEL = eINSTANCE.getStructureModel();

		/**
		 * The meta object literal for the '<em><b>Structure Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MODEL__STRUCTURE_ELEMENT = eINSTANCE.getStructureModel_StructureElement();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.ComponentImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.SoftwareSystemImpl <em>Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.SoftwareSystemImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getSoftwareSystem()
		 * @generated
		 */
		EClass SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystem();

		/**
		 * The meta object literal for the '{@link kdm.structure.AbstractStructureRelationship <em>Abstract Structure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.AbstractStructureRelationship
		 * @see kdm.structure.impl.StructurePackageImpl#getAbstractStructureRelationship()
		 * @generated
		 */
		EClass ABSTRACT_STRUCTURE_RELATIONSHIP = eINSTANCE.getAbstractStructureRelationship();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.StructureRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.StructureRelationshipImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getStructureRelationship()
		 * @generated
		 */
		EClass STRUCTURE_RELATIONSHIP = eINSTANCE.getStructureRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_RELATIONSHIP__TO = eINSTANCE.getStructureRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_RELATIONSHIP__FROM = eINSTANCE.getStructureRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.ArchitectureViewImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getArchitectureView()
		 * @generated
		 */
		EClass ARCHITECTURE_VIEW = eINSTANCE.getArchitectureView();

		/**
		 * The meta object literal for the '{@link kdm.structure.impl.StructureElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.structure.impl.StructureElementImpl
		 * @see kdm.structure.impl.StructurePackageImpl#getStructureElement()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

	}

} //StructurePackage
