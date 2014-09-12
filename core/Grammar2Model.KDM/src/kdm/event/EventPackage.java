/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.event;

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
 * @see kdm.event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "event";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/event";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "event";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventPackage eINSTANCE = kdm.event.impl.EventPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventModelImpl
	 * @see kdm.event.impl.EventPackageImpl#getEventModel()
	 * @generated
	 */
	int EVENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__EVENT_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.event.AbstractEventElement <em>Abstract Event Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.AbstractEventElement
	 * @see kdm.event.impl.EventPackageImpl#getAbstractEventElement()
	 * @generated
	 */
	int ABSTRACT_EVENT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__SOURCE = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__EVENT_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__ABSTRACTION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Event Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventImpl
	 * @see kdm.event.impl.EventPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ATTRIBUTE = ABSTRACT_EVENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANNOTATION = ABSTRACT_EVENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__STEREOTYPE = ABSTRACT_EVENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TAGGED_VALUE = ABSTRACT_EVENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ABSTRACT_EVENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOURCE = ABSTRACT_EVENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_RELATION = ABSTRACT_EVENT_ELEMENT__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABSTRACTION = ABSTRACT_EVENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMPLEMENTATION = ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.event.AbstractEventRelationship <em>Abstract Event Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.AbstractEventRelationship
	 * @see kdm.event.impl.EventPackageImpl#getAbstractEventRelationship()
	 * @generated
	 */
	int ABSTRACT_EVENT_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Event Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventRelationshipImpl
	 * @see kdm.event.impl.EventPackageImpl#getEventRelationship()
	 * @generated
	 */
	int EVENT_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__ATTRIBUTE = ABSTRACT_EVENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__ANNOTATION = ABSTRACT_EVENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__STEREOTYPE = ABSTRACT_EVENT_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_EVENT_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__TO = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP__FROM = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventResourceImpl
	 * @see kdm.event.impl.EventPackageImpl#getEventResource()
	 * @generated
	 */
	int EVENT_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__ATTRIBUTE = ABSTRACT_EVENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__ANNOTATION = ABSTRACT_EVENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__STEREOTYPE = ABSTRACT_EVENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__TAGGED_VALUE = ABSTRACT_EVENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__NAME = ABSTRACT_EVENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__SOURCE = ABSTRACT_EVENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__EVENT_RELATION = ABSTRACT_EVENT_ELEMENT__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__ABSTRACTION = ABSTRACT_EVENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__IMPLEMENTATION = ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE__EVENT_ELEMENT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RESOURCE_FEATURE_COUNT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.event.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.StateImpl
	 * @see kdm.event.impl.EventPackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ATTRIBUTE = EVENT_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANNOTATION = EVENT_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STEREOTYPE = EVENT_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TAGGED_VALUE = EVENT_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = EVENT_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SOURCE = EVENT_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENT_RELATION = EVENT_RESOURCE__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ABSTRACTION = EVENT_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IMPLEMENTATION = EVENT_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENT_ELEMENT = EVENT_RESOURCE__EVENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = EVENT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.TransitionImpl
	 * @see kdm.event.impl.EventPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ATTRIBUTE = EVENT_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATION = EVENT_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STEREOTYPE = EVENT_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TAGGED_VALUE = EVENT_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = EVENT_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = EVENT_RESOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT_RELATION = EVENT_RESOURCE__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ABSTRACTION = EVENT_RESOURCE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IMPLEMENTATION = EVENT_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT_ELEMENT = EVENT_RESOURCE__EVENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = EVENT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.OnEntryImpl <em>On Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.OnEntryImpl
	 * @see kdm.event.impl.EventPackageImpl#getOnEntry()
	 * @generated
	 */
	int ON_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__ATTRIBUTE = TRANSITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__STEREOTYPE = TRANSITION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__TAGGED_VALUE = TRANSITION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__EVENT_RELATION = TRANSITION__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__ABSTRACTION = TRANSITION__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__IMPLEMENTATION = TRANSITION__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__EVENT_ELEMENT = TRANSITION__EVENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.OnExitImpl <em>On Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.OnExitImpl
	 * @see kdm.event.impl.EventPackageImpl#getOnExit()
	 * @generated
	 */
	int ON_EXIT = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__ATTRIBUTE = TRANSITION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__ANNOTATION = TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__STEREOTYPE = TRANSITION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__TAGGED_VALUE = TRANSITION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__EVENT_RELATION = TRANSITION__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__ABSTRACTION = TRANSITION__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__IMPLEMENTATION = TRANSITION__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__EVENT_ELEMENT = TRANSITION__EVENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventActionImpl
	 * @see kdm.event.impl.EventPackageImpl#getEventAction()
	 * @generated
	 */
	int EVENT_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ATTRIBUTE = ABSTRACT_EVENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ANNOTATION = ABSTRACT_EVENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__STEREOTYPE = ABSTRACT_EVENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__TAGGED_VALUE = ABSTRACT_EVENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__NAME = ABSTRACT_EVENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__SOURCE = ABSTRACT_EVENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__EVENT_RELATION = ABSTRACT_EVENT_ELEMENT__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ABSTRACTION = ABSTRACT_EVENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__IMPLEMENTATION = ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__KIND = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__EVENT_ELEMENT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_FEATURE_COUNT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.ReadsStateImpl <em>Reads State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.ReadsStateImpl
	 * @see kdm.event.impl.EventPackageImpl#getReadsState()
	 * @generated
	 */
	int READS_STATE = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_STATE_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.ProducesEventImpl <em>Produces Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.ProducesEventImpl
	 * @see kdm.event.impl.EventPackageImpl#getProducesEvent()
	 * @generated
	 */
	int PRODUCES_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Produces Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_EVENT_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.ConsumesEventImpl <em>Consumes Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.ConsumesEventImpl
	 * @see kdm.event.impl.EventPackageImpl#getConsumesEvent()
	 * @generated
	 */
	int CONSUMES_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__ATTRIBUTE = ABSTRACT_EVENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__ANNOTATION = ABSTRACT_EVENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__STEREOTYPE = ABSTRACT_EVENT_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__TAGGED_VALUE = ABSTRACT_EVENT_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__TO = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT__FROM = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumes Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_EVENT_FEATURE_COUNT = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.NextStateImpl <em>Next State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.NextStateImpl
	 * @see kdm.event.impl.EventPackageImpl#getNextState()
	 * @generated
	 */
	int NEXT_STATE = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__ATTRIBUTE = ABSTRACT_EVENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__ANNOTATION = ABSTRACT_EVENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__STEREOTYPE = ABSTRACT_EVENT_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__TAGGED_VALUE = ABSTRACT_EVENT_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__TO = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE__FROM = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Next State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_STATE_FEATURE_COUNT = ABSTRACT_EVENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.event.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.InitialStateImpl
	 * @see kdm.event.impl.EventPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ATTRIBUTE = STATE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ANNOTATION = STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STEREOTYPE = STATE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__TAGGED_VALUE = STATE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__SOURCE = STATE__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__EVENT_RELATION = STATE__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ABSTRACTION = STATE__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__IMPLEMENTATION = STATE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Event Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__EVENT_ELEMENT = STATE__EVENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.EventElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.EventElementImpl
	 * @see kdm.event.impl.EventPackageImpl#getEventElement()
	 * @generated
	 */
	int EVENT_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__ATTRIBUTE = ABSTRACT_EVENT_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__ANNOTATION = ABSTRACT_EVENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__STEREOTYPE = ABSTRACT_EVENT_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__TAGGED_VALUE = ABSTRACT_EVENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__NAME = ABSTRACT_EVENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__SOURCE = ABSTRACT_EVENT_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__EVENT_RELATION = ABSTRACT_EVENT_ELEMENT__EVENT_RELATION;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__ABSTRACTION = ABSTRACT_EVENT_ELEMENT__ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT__IMPLEMENTATION = ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEMENT_FEATURE_COUNT = ABSTRACT_EVENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.event.impl.HasStateImpl <em>Has State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.event.impl.HasStateImpl
	 * @see kdm.event.impl.EventPackageImpl#getHasState()
	 * @generated
	 */
	int HAS_STATE = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__ATTRIBUTE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__ANNOTATION = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__STEREOTYPE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__TAGGED_VALUE = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__TO = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE__FROM = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATE_FEATURE_COUNT = ActionPackage.ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kdm.event.EventModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.event.EventModel
	 * @generated
	 */
	EClass getEventModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.EventModel#getEventElement <em>Event Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Element</em>'.
	 * @see kdm.event.EventModel#getEventElement()
	 * @see #getEventModel()
	 * @generated
	 */
	EReference getEventModel_EventElement();

	/**
	 * Returns the meta object for class '{@link kdm.event.AbstractEventElement <em>Abstract Event Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event Element</em>'.
	 * @see kdm.event.AbstractEventElement
	 * @generated
	 */
	EClass getAbstractEventElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.AbstractEventElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see kdm.event.AbstractEventElement#getSource()
	 * @see #getAbstractEventElement()
	 * @generated
	 */
	EReference getAbstractEventElement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.AbstractEventElement#getEventRelation <em>Event Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Relation</em>'.
	 * @see kdm.event.AbstractEventElement#getEventRelation()
	 * @see #getAbstractEventElement()
	 * @generated
	 */
	EReference getAbstractEventElement_EventRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.AbstractEventElement#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstraction</em>'.
	 * @see kdm.event.AbstractEventElement#getAbstraction()
	 * @see #getAbstractEventElement()
	 * @generated
	 */
	EReference getAbstractEventElement_Abstraction();

	/**
	 * Returns the meta object for the reference list '{@link kdm.event.AbstractEventElement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.event.AbstractEventElement#getImplementation()
	 * @see #getAbstractEventElement()
	 * @generated
	 */
	EReference getAbstractEventElement_Implementation();

	/**
	 * Returns the meta object for class '{@link kdm.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see kdm.event.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link kdm.event.Event#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.event.Event#getKind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Kind();

	/**
	 * Returns the meta object for class '{@link kdm.event.AbstractEventRelationship <em>Abstract Event Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event Relationship</em>'.
	 * @see kdm.event.AbstractEventRelationship
	 * @generated
	 */
	EClass getAbstractEventRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.event.EventRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.event.EventRelationship
	 * @generated
	 */
	EClass getEventRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.EventRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.EventRelationship#getTo()
	 * @see #getEventRelationship()
	 * @generated
	 */
	EReference getEventRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.EventRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.EventRelationship#getFrom()
	 * @see #getEventRelationship()
	 * @generated
	 */
	EReference getEventRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.event.EventResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see kdm.event.EventResource
	 * @generated
	 */
	EClass getEventResource();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.EventResource#getEventElement <em>Event Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Element</em>'.
	 * @see kdm.event.EventResource#getEventElement()
	 * @see #getEventResource()
	 * @generated
	 */
	EReference getEventResource_EventElement();

	/**
	 * Returns the meta object for class '{@link kdm.event.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see kdm.event.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link kdm.event.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see kdm.event.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link kdm.event.OnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Entry</em>'.
	 * @see kdm.event.OnEntry
	 * @generated
	 */
	EClass getOnEntry();

	/**
	 * Returns the meta object for class '{@link kdm.event.OnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Exit</em>'.
	 * @see kdm.event.OnExit
	 * @generated
	 */
	EClass getOnExit();

	/**
	 * Returns the meta object for class '{@link kdm.event.EventAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see kdm.event.EventAction
	 * @generated
	 */
	EClass getEventAction();

	/**
	 * Returns the meta object for the attribute '{@link kdm.event.EventAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.event.EventAction#getKind()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.event.EventAction#getEventElement <em>Event Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Element</em>'.
	 * @see kdm.event.EventAction#getEventElement()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_EventElement();

	/**
	 * Returns the meta object for class '{@link kdm.event.ReadsState <em>Reads State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads State</em>'.
	 * @see kdm.event.ReadsState
	 * @generated
	 */
	EClass getReadsState();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ReadsState#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.ReadsState#getTo()
	 * @see #getReadsState()
	 * @generated
	 */
	EReference getReadsState_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ReadsState#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.ReadsState#getFrom()
	 * @see #getReadsState()
	 * @generated
	 */
	EReference getReadsState_From();

	/**
	 * Returns the meta object for class '{@link kdm.event.ProducesEvent <em>Produces Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produces Event</em>'.
	 * @see kdm.event.ProducesEvent
	 * @generated
	 */
	EClass getProducesEvent();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ProducesEvent#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.ProducesEvent#getTo()
	 * @see #getProducesEvent()
	 * @generated
	 */
	EReference getProducesEvent_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ProducesEvent#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.ProducesEvent#getFrom()
	 * @see #getProducesEvent()
	 * @generated
	 */
	EReference getProducesEvent_From();

	/**
	 * Returns the meta object for class '{@link kdm.event.ConsumesEvent <em>Consumes Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes Event</em>'.
	 * @see kdm.event.ConsumesEvent
	 * @generated
	 */
	EClass getConsumesEvent();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ConsumesEvent#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.ConsumesEvent#getTo()
	 * @see #getConsumesEvent()
	 * @generated
	 */
	EReference getConsumesEvent_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.ConsumesEvent#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.ConsumesEvent#getFrom()
	 * @see #getConsumesEvent()
	 * @generated
	 */
	EReference getConsumesEvent_From();

	/**
	 * Returns the meta object for class '{@link kdm.event.NextState <em>Next State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next State</em>'.
	 * @see kdm.event.NextState
	 * @generated
	 */
	EClass getNextState();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.NextState#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.NextState#getTo()
	 * @see #getNextState()
	 * @generated
	 */
	EReference getNextState_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.NextState#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.NextState#getFrom()
	 * @see #getNextState()
	 * @generated
	 */
	EReference getNextState_From();

	/**
	 * Returns the meta object for class '{@link kdm.event.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see kdm.event.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link kdm.event.EventElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.event.EventElement
	 * @generated
	 */
	EClass getEventElement();

	/**
	 * Returns the meta object for class '{@link kdm.event.HasState <em>Has State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has State</em>'.
	 * @see kdm.event.HasState
	 * @generated
	 */
	EClass getHasState();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.HasState#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.event.HasState#getTo()
	 * @see #getHasState()
	 * @generated
	 */
	EReference getHasState_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.event.HasState#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.event.HasState#getFrom()
	 * @see #getHasState()
	 * @generated
	 */
	EReference getHasState_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventFactory getEventFactory();

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
		 * The meta object literal for the '{@link kdm.event.impl.EventModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventModelImpl
		 * @see kdm.event.impl.EventPackageImpl#getEventModel()
		 * @generated
		 */
		EClass EVENT_MODEL = eINSTANCE.getEventModel();

		/**
		 * The meta object literal for the '<em><b>Event Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL__EVENT_ELEMENT = eINSTANCE.getEventModel_EventElement();

		/**
		 * The meta object literal for the '{@link kdm.event.AbstractEventElement <em>Abstract Event Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.AbstractEventElement
		 * @see kdm.event.impl.EventPackageImpl#getAbstractEventElement()
		 * @generated
		 */
		EClass ABSTRACT_EVENT_ELEMENT = eINSTANCE.getAbstractEventElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EVENT_ELEMENT__SOURCE = eINSTANCE.getAbstractEventElement_Source();

		/**
		 * The meta object literal for the '<em><b>Event Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EVENT_ELEMENT__EVENT_RELATION = eINSTANCE.getAbstractEventElement_EventRelation();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EVENT_ELEMENT__ABSTRACTION = eINSTANCE.getAbstractEventElement_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EVENT_ELEMENT__IMPLEMENTATION = eINSTANCE.getAbstractEventElement_Implementation();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventImpl
		 * @see kdm.event.impl.EventPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KIND = eINSTANCE.getEvent_Kind();

		/**
		 * The meta object literal for the '{@link kdm.event.AbstractEventRelationship <em>Abstract Event Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.AbstractEventRelationship
		 * @see kdm.event.impl.EventPackageImpl#getAbstractEventRelationship()
		 * @generated
		 */
		EClass ABSTRACT_EVENT_RELATIONSHIP = eINSTANCE.getAbstractEventRelationship();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.EventRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventRelationshipImpl
		 * @see kdm.event.impl.EventPackageImpl#getEventRelationship()
		 * @generated
		 */
		EClass EVENT_RELATIONSHIP = eINSTANCE.getEventRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RELATIONSHIP__TO = eINSTANCE.getEventRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RELATIONSHIP__FROM = eINSTANCE.getEventRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.EventResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventResourceImpl
		 * @see kdm.event.impl.EventPackageImpl#getEventResource()
		 * @generated
		 */
		EClass EVENT_RESOURCE = eINSTANCE.getEventResource();

		/**
		 * The meta object literal for the '<em><b>Event Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RESOURCE__EVENT_ELEMENT = eINSTANCE.getEventResource_EventElement();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.StateImpl
		 * @see kdm.event.impl.EventPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.TransitionImpl
		 * @see kdm.event.impl.EventPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.OnEntryImpl <em>On Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.OnEntryImpl
		 * @see kdm.event.impl.EventPackageImpl#getOnEntry()
		 * @generated
		 */
		EClass ON_ENTRY = eINSTANCE.getOnEntry();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.OnExitImpl <em>On Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.OnExitImpl
		 * @see kdm.event.impl.EventPackageImpl#getOnExit()
		 * @generated
		 */
		EClass ON_EXIT = eINSTANCE.getOnExit();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.EventActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventActionImpl
		 * @see kdm.event.impl.EventPackageImpl#getEventAction()
		 * @generated
		 */
		EClass EVENT_ACTION = eINSTANCE.getEventAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__KIND = eINSTANCE.getEventAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Event Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__EVENT_ELEMENT = eINSTANCE.getEventAction_EventElement();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.ReadsStateImpl <em>Reads State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.ReadsStateImpl
		 * @see kdm.event.impl.EventPackageImpl#getReadsState()
		 * @generated
		 */
		EClass READS_STATE = eINSTANCE.getReadsState();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_STATE__TO = eINSTANCE.getReadsState_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS_STATE__FROM = eINSTANCE.getReadsState_From();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.ProducesEventImpl <em>Produces Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.ProducesEventImpl
		 * @see kdm.event.impl.EventPackageImpl#getProducesEvent()
		 * @generated
		 */
		EClass PRODUCES_EVENT = eINSTANCE.getProducesEvent();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES_EVENT__TO = eINSTANCE.getProducesEvent_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES_EVENT__FROM = eINSTANCE.getProducesEvent_From();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.ConsumesEventImpl <em>Consumes Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.ConsumesEventImpl
		 * @see kdm.event.impl.EventPackageImpl#getConsumesEvent()
		 * @generated
		 */
		EClass CONSUMES_EVENT = eINSTANCE.getConsumesEvent();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_EVENT__TO = eINSTANCE.getConsumesEvent_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_EVENT__FROM = eINSTANCE.getConsumesEvent_From();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.NextStateImpl <em>Next State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.NextStateImpl
		 * @see kdm.event.impl.EventPackageImpl#getNextState()
		 * @generated
		 */
		EClass NEXT_STATE = eINSTANCE.getNextState();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_STATE__TO = eINSTANCE.getNextState_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_STATE__FROM = eINSTANCE.getNextState_From();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.InitialStateImpl
		 * @see kdm.event.impl.EventPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.EventElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.EventElementImpl
		 * @see kdm.event.impl.EventPackageImpl#getEventElement()
		 * @generated
		 */
		EClass EVENT_ELEMENT = eINSTANCE.getEventElement();

		/**
		 * The meta object literal for the '{@link kdm.event.impl.HasStateImpl <em>Has State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.event.impl.HasStateImpl
		 * @see kdm.event.impl.EventPackageImpl#getHasState()
		 * @generated
		 */
		EClass HAS_STATE = eINSTANCE.getHasState();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_STATE__TO = eINSTANCE.getHasState_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_STATE__FROM = eINSTANCE.getHasState_From();

	}

} //EventPackage
