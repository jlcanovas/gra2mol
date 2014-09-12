/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.conceptual;

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
 * @see kdm.conceptual.ConceptualFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptualPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conceptual";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/conceptual";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptual";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptualPackage eINSTANCE = kdm.conceptual.impl.ConceptualPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualModelImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualModel()
	 * @generated
	 */
	int CONCEPTUAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.conceptual.AbstractConceptualElement <em>Abstract Conceptual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.AbstractConceptualElement
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getAbstractConceptualElement()
	 * @generated
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Conceptual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.TermUnitImpl <em>Term Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.TermUnitImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getTermUnit()
	 * @generated
	 */
	int TERM_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__ATTRIBUTE = ABSTRACT_CONCEPTUAL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__ANNOTATION = ABSTRACT_CONCEPTUAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__STEREOTYPE = ABSTRACT_CONCEPTUAL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__NAME = ABSTRACT_CONCEPTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__SOURCE = ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__IMPLEMENTATION = ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__CONCEPTUAL_RELATION = ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT__ABSTRACTION = ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Term Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_UNIT_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualContainerImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualContainer()
	 * @generated
	 */
	int CONCEPTUAL_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__ATTRIBUTE = ABSTRACT_CONCEPTUAL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__ANNOTATION = ABSTRACT_CONCEPTUAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__STEREOTYPE = ABSTRACT_CONCEPTUAL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__NAME = ABSTRACT_CONCEPTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__SOURCE = ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__IMPLEMENTATION = ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION = ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__ABSTRACTION = ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_CONTAINER_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.FactUnitImpl <em>Fact Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.FactUnitImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getFactUnit()
	 * @generated
	 */
	int FACT_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__ATTRIBUTE = CONCEPTUAL_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__ANNOTATION = CONCEPTUAL_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__STEREOTYPE = CONCEPTUAL_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__TAGGED_VALUE = CONCEPTUAL_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__NAME = CONCEPTUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__SOURCE = CONCEPTUAL_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__IMPLEMENTATION = CONCEPTUAL_CONTAINER__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__CONCEPTUAL_RELATION = CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__ABSTRACTION = CONCEPTUAL_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT__CONCEPTUAL_ELEMENT = CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Fact Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_UNIT_FEATURE_COUNT = CONCEPTUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.AbstractConceptualRelationship <em>Abstract Conceptual Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.AbstractConceptualRelationship
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getAbstractConceptualRelationship()
	 * @generated
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Conceptual Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualRelationshipImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualRelationship()
	 * @generated
	 */
	int CONCEPTUAL_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__ATTRIBUTE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__ANNOTATION = ABSTRACT_CONCEPTUAL_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__STEREOTYPE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__TO = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP__FROM = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.BehaviorUnitImpl <em>Behavior Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.BehaviorUnitImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getBehaviorUnit()
	 * @generated
	 */
	int BEHAVIOR_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__ATTRIBUTE = CONCEPTUAL_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__ANNOTATION = CONCEPTUAL_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__STEREOTYPE = CONCEPTUAL_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__TAGGED_VALUE = CONCEPTUAL_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__NAME = CONCEPTUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__SOURCE = CONCEPTUAL_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__IMPLEMENTATION = CONCEPTUAL_CONTAINER__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__CONCEPTUAL_RELATION = CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__ABSTRACTION = CONCEPTUAL_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT__CONCEPTUAL_ELEMENT = CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Behavior Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_UNIT_FEATURE_COUNT = CONCEPTUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.RuleUnitImpl <em>Rule Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.RuleUnitImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getRuleUnit()
	 * @generated
	 */
	int RULE_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__ATTRIBUTE = CONCEPTUAL_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__ANNOTATION = CONCEPTUAL_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__STEREOTYPE = CONCEPTUAL_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__TAGGED_VALUE = CONCEPTUAL_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__NAME = CONCEPTUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__SOURCE = CONCEPTUAL_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__IMPLEMENTATION = CONCEPTUAL_CONTAINER__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__CONCEPTUAL_RELATION = CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__ABSTRACTION = CONCEPTUAL_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT__CONCEPTUAL_ELEMENT = CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Rule Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UNIT_FEATURE_COUNT = CONCEPTUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ScenarioUnitImpl <em>Scenario Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ScenarioUnitImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getScenarioUnit()
	 * @generated
	 */
	int SCENARIO_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__ATTRIBUTE = CONCEPTUAL_CONTAINER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__ANNOTATION = CONCEPTUAL_CONTAINER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__STEREOTYPE = CONCEPTUAL_CONTAINER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__TAGGED_VALUE = CONCEPTUAL_CONTAINER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__NAME = CONCEPTUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__SOURCE = CONCEPTUAL_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__IMPLEMENTATION = CONCEPTUAL_CONTAINER__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__CONCEPTUAL_RELATION = CONCEPTUAL_CONTAINER__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__ABSTRACTION = CONCEPTUAL_CONTAINER__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT__CONCEPTUAL_ELEMENT = CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Scenario Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_UNIT_FEATURE_COUNT = CONCEPTUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualFlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualFlowImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualFlow()
	 * @generated
	 */
	int CONCEPTUAL_FLOW = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__ATTRIBUTE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__ANNOTATION = ABSTRACT_CONCEPTUAL_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__STEREOTYPE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__TO = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW__FROM = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_FLOW_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualElementImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualElement()
	 * @generated
	 */
	int CONCEPTUAL_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__ATTRIBUTE = ABSTRACT_CONCEPTUAL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__ANNOTATION = ABSTRACT_CONCEPTUAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__STEREOTYPE = ABSTRACT_CONCEPTUAL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__NAME = ABSTRACT_CONCEPTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__SOURCE = ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__IMPLEMENTATION = ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION = ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT__ABSTRACTION = ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ELEMENT_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.conceptual.impl.ConceptualRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.conceptual.impl.ConceptualRoleImpl
	 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualRole()
	 * @generated
	 */
	int CONCEPTUAL_ROLE = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__ATTRIBUTE = ABSTRACT_CONCEPTUAL_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__ANNOTATION = ABSTRACT_CONCEPTUAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__STEREOTYPE = ABSTRACT_CONCEPTUAL_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__TAGGED_VALUE = ABSTRACT_CONCEPTUAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__NAME = ABSTRACT_CONCEPTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__SOURCE = ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__IMPLEMENTATION = ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__CONCEPTUAL_RELATION = ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__ABSTRACTION = ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Conceptual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ROLE_FEATURE_COUNT = ABSTRACT_CONCEPTUAL_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.conceptual.ConceptualModel
	 * @generated
	 */
	EClass getConceptualModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.conceptual.ConceptualModel#getConceptualElement <em>Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptual Element</em>'.
	 * @see kdm.conceptual.ConceptualModel#getConceptualElement()
	 * @see #getConceptualModel()
	 * @generated
	 */
	EReference getConceptualModel_ConceptualElement();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.AbstractConceptualElement <em>Abstract Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Conceptual Element</em>'.
	 * @see kdm.conceptual.AbstractConceptualElement
	 * @generated
	 */
	EClass getAbstractConceptualElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.conceptual.AbstractConceptualElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see kdm.conceptual.AbstractConceptualElement#getSource()
	 * @see #getAbstractConceptualElement()
	 * @generated
	 */
	EReference getAbstractConceptualElement_Source();

	/**
	 * Returns the meta object for the reference list '{@link kdm.conceptual.AbstractConceptualElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.conceptual.AbstractConceptualElement#getImplementation()
	 * @see #getAbstractConceptualElement()
	 * @generated
	 */
	EReference getAbstractConceptualElement_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.conceptual.AbstractConceptualElement#getConceptualRelation <em>Conceptual Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptual Relation</em>'.
	 * @see kdm.conceptual.AbstractConceptualElement#getConceptualRelation()
	 * @see #getAbstractConceptualElement()
	 * @generated
	 */
	EReference getAbstractConceptualElement_ConceptualRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.conceptual.AbstractConceptualElement#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstraction</em>'.
	 * @see kdm.conceptual.AbstractConceptualElement#getAbstraction()
	 * @see #getAbstractConceptualElement()
	 * @generated
	 */
	EReference getAbstractConceptualElement_Abstraction();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.TermUnit <em>Term Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Unit</em>'.
	 * @see kdm.conceptual.TermUnit
	 * @generated
	 */
	EClass getTermUnit();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see kdm.conceptual.ConceptualContainer
	 * @generated
	 */
	EClass getConceptualContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.conceptual.ConceptualContainer#getConceptualElement <em>Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptual Element</em>'.
	 * @see kdm.conceptual.ConceptualContainer#getConceptualElement()
	 * @see #getConceptualContainer()
	 * @generated
	 */
	EReference getConceptualContainer_ConceptualElement();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.FactUnit <em>Fact Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Unit</em>'.
	 * @see kdm.conceptual.FactUnit
	 * @generated
	 */
	EClass getFactUnit();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.AbstractConceptualRelationship <em>Abstract Conceptual Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Conceptual Relationship</em>'.
	 * @see kdm.conceptual.AbstractConceptualRelationship
	 * @generated
	 */
	EClass getAbstractConceptualRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.conceptual.ConceptualRelationship
	 * @generated
	 */
	EClass getConceptualRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.conceptual.ConceptualRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.conceptual.ConceptualRelationship#getTo()
	 * @see #getConceptualRelationship()
	 * @generated
	 */
	EReference getConceptualRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.conceptual.ConceptualRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.conceptual.ConceptualRelationship#getFrom()
	 * @see #getConceptualRelationship()
	 * @generated
	 */
	EReference getConceptualRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.BehaviorUnit <em>Behavior Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Unit</em>'.
	 * @see kdm.conceptual.BehaviorUnit
	 * @generated
	 */
	EClass getBehaviorUnit();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.RuleUnit <em>Rule Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Unit</em>'.
	 * @see kdm.conceptual.RuleUnit
	 * @generated
	 */
	EClass getRuleUnit();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ScenarioUnit <em>Scenario Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Unit</em>'.
	 * @see kdm.conceptual.ScenarioUnit
	 * @generated
	 */
	EClass getScenarioUnit();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see kdm.conceptual.ConceptualFlow
	 * @generated
	 */
	EClass getConceptualFlow();

	/**
	 * Returns the meta object for the reference '{@link kdm.conceptual.ConceptualFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.conceptual.ConceptualFlow#getTo()
	 * @see #getConceptualFlow()
	 * @generated
	 */
	EReference getConceptualFlow_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.conceptual.ConceptualFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.conceptual.ConceptualFlow#getFrom()
	 * @see #getConceptualFlow()
	 * @generated
	 */
	EReference getConceptualFlow_From();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.conceptual.ConceptualElement
	 * @generated
	 */
	EClass getConceptualElement();

	/**
	 * Returns the meta object for class '{@link kdm.conceptual.ConceptualRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see kdm.conceptual.ConceptualRole
	 * @generated
	 */
	EClass getConceptualRole();

	/**
	 * Returns the meta object for the reference '{@link kdm.conceptual.ConceptualRole#getConceptualElement <em>Conceptual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conceptual Element</em>'.
	 * @see kdm.conceptual.ConceptualRole#getConceptualElement()
	 * @see #getConceptualRole()
	 * @generated
	 */
	EReference getConceptualRole_ConceptualElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptualFactory getConceptualFactory();

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
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualModelImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualModel()
		 * @generated
		 */
		EClass CONCEPTUAL_MODEL = eINSTANCE.getConceptualModel();

		/**
		 * The meta object literal for the '<em><b>Conceptual Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT = eINSTANCE.getConceptualModel_ConceptualElement();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.AbstractConceptualElement <em>Abstract Conceptual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.AbstractConceptualElement
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getAbstractConceptualElement()
		 * @generated
		 */
		EClass ABSTRACT_CONCEPTUAL_ELEMENT = eINSTANCE.getAbstractConceptualElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE = eINSTANCE.getAbstractConceptualElement_Source();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION = eINSTANCE.getAbstractConceptualElement_Implementation();

		/**
		 * The meta object literal for the '<em><b>Conceptual Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION = eINSTANCE.getAbstractConceptualElement_ConceptualRelation();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION = eINSTANCE.getAbstractConceptualElement_Abstraction();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.TermUnitImpl <em>Term Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.TermUnitImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getTermUnit()
		 * @generated
		 */
		EClass TERM_UNIT = eINSTANCE.getTermUnit();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualContainerImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualContainer()
		 * @generated
		 */
		EClass CONCEPTUAL_CONTAINER = eINSTANCE.getConceptualContainer();

		/**
		 * The meta object literal for the '<em><b>Conceptual Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_CONTAINER__CONCEPTUAL_ELEMENT = eINSTANCE.getConceptualContainer_ConceptualElement();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.FactUnitImpl <em>Fact Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.FactUnitImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getFactUnit()
		 * @generated
		 */
		EClass FACT_UNIT = eINSTANCE.getFactUnit();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.AbstractConceptualRelationship <em>Abstract Conceptual Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.AbstractConceptualRelationship
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getAbstractConceptualRelationship()
		 * @generated
		 */
		EClass ABSTRACT_CONCEPTUAL_RELATIONSHIP = eINSTANCE.getAbstractConceptualRelationship();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualRelationshipImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualRelationship()
		 * @generated
		 */
		EClass CONCEPTUAL_RELATIONSHIP = eINSTANCE.getConceptualRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_RELATIONSHIP__TO = eINSTANCE.getConceptualRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_RELATIONSHIP__FROM = eINSTANCE.getConceptualRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.BehaviorUnitImpl <em>Behavior Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.BehaviorUnitImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getBehaviorUnit()
		 * @generated
		 */
		EClass BEHAVIOR_UNIT = eINSTANCE.getBehaviorUnit();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.RuleUnitImpl <em>Rule Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.RuleUnitImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getRuleUnit()
		 * @generated
		 */
		EClass RULE_UNIT = eINSTANCE.getRuleUnit();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ScenarioUnitImpl <em>Scenario Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ScenarioUnitImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getScenarioUnit()
		 * @generated
		 */
		EClass SCENARIO_UNIT = eINSTANCE.getScenarioUnit();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualFlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualFlowImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualFlow()
		 * @generated
		 */
		EClass CONCEPTUAL_FLOW = eINSTANCE.getConceptualFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_FLOW__TO = eINSTANCE.getConceptualFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_FLOW__FROM = eINSTANCE.getConceptualFlow_From();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualElementImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualElement()
		 * @generated
		 */
		EClass CONCEPTUAL_ELEMENT = eINSTANCE.getConceptualElement();

		/**
		 * The meta object literal for the '{@link kdm.conceptual.impl.ConceptualRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.conceptual.impl.ConceptualRoleImpl
		 * @see kdm.conceptual.impl.ConceptualPackageImpl#getConceptualRole()
		 * @generated
		 */
		EClass CONCEPTUAL_ROLE = eINSTANCE.getConceptualRole();

		/**
		 * The meta object literal for the '<em><b>Conceptual Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT = eINSTANCE.getConceptualRole_ConceptualElement();

	}

} //ConceptualPackage
