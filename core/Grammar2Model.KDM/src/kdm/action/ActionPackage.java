/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action;

import kdm.code.CodePackage;

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
 * @see kdm.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/action";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionPackage eINSTANCE = kdm.action.impl.ActionPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.action.impl.ActionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ActionElementImpl
	 * @see kdm.action.impl.ActionPackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__ATTRIBUTE = CodePackage.ABSTRACT_CODE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__ANNOTATION = CodePackage.ABSTRACT_CODE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__STEREOTYPE = CodePackage.ABSTRACT_CODE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__TAGGED_VALUE = CodePackage.ABSTRACT_CODE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__NAME = CodePackage.ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__SOURCE = CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__COMMENT = CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_RELATION = CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__KIND = CodePackage.ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_ELEMENT = CodePackage.ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__ACTION_RELATION = CodePackage.ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = CodePackage.ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.AbstractActionRelationship
	 * @see kdm.action.impl.ActionPackageImpl#getAbstractActionRelationship()
	 * @generated
	 */
	int ABSTRACT_ACTION_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Action Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ControlFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.CallsImpl <em>Calls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.CallsImpl
	 * @see kdm.action.impl.ActionPackageImpl#getCalls()
	 * @generated
	 */
	int CALLS = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.CreatesImpl <em>Creates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.CreatesImpl
	 * @see kdm.action.impl.ActionPackageImpl#getCreates()
	 * @generated
	 */
	int CREATES = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Creates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ReadsImpl <em>Reads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ReadsImpl
	 * @see kdm.action.impl.ActionPackageImpl#getReads()
	 * @generated
	 */
	int READS = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.WritesImpl <em>Writes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.WritesImpl
	 * @see kdm.action.impl.ActionPackageImpl#getWrites()
	 * @generated
	 */
	int WRITES = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.CompliesToImpl <em>Complies To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.CompliesToImpl
	 * @see kdm.action.impl.ActionPackageImpl#getCompliesTo()
	 * @generated
	 */
	int COMPLIES_TO = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.FlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ATTRIBUTE = CONTROL_FLOW__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ANNOTATION = CONTROL_FLOW__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STEREOTYPE = CONTROL_FLOW__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TAGGED_VALUE = CONTROL_FLOW__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TO = CONTROL_FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FROM = CONTROL_FLOW__FROM;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.TrueFlowImpl <em>True Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.TrueFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getTrueFlow()
	 * @generated
	 */
	int TRUE_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__ATTRIBUTE = CONTROL_FLOW__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__ANNOTATION = CONTROL_FLOW__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__STEREOTYPE = CONTROL_FLOW__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__TAGGED_VALUE = CONTROL_FLOW__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__TO = CONTROL_FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW__FROM = CONTROL_FLOW__FROM;

	/**
	 * The number of structural features of the '<em>True Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FLOW_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.FalseFlowImpl <em>False Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.FalseFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getFalseFlow()
	 * @generated
	 */
	int FALSE_FLOW = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__ATTRIBUTE = CONTROL_FLOW__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__ANNOTATION = CONTROL_FLOW__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__STEREOTYPE = CONTROL_FLOW__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__TAGGED_VALUE = CONTROL_FLOW__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__TO = CONTROL_FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW__FROM = CONTROL_FLOW__FROM;

	/**
	 * The number of structural features of the '<em>False Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FLOW_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.GuardedFlowImpl <em>Guarded Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.GuardedFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getGuardedFlow()
	 * @generated
	 */
	int GUARDED_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__ATTRIBUTE = CONTROL_FLOW__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__ANNOTATION = CONTROL_FLOW__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__STEREOTYPE = CONTROL_FLOW__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__TAGGED_VALUE = CONTROL_FLOW__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__TO = CONTROL_FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW__FROM = CONTROL_FLOW__FROM;

	/**
	 * The number of structural features of the '<em>Guarded Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FLOW_FEATURE_COUNT = CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.UsesTypeImpl <em>Uses Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.UsesTypeImpl
	 * @see kdm.action.impl.ActionPackageImpl#getUsesType()
	 * @generated
	 */
	int USES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_TYPE_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.AddressesImpl <em>Addresses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.AddressesImpl
	 * @see kdm.action.impl.ActionPackageImpl#getAddresses()
	 * @generated
	 */
	int ADDRESSES = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addresses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ActionRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ActionRelationshipImpl
	 * @see kdm.action.impl.ActionPackageImpl#getActionRelationship()
	 * @generated
	 */
	int ACTION_RELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ThrowsImpl <em>Throws</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ThrowsImpl
	 * @see kdm.action.impl.ActionPackageImpl#getThrows()
	 * @generated
	 */
	int THROWS = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throws</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.DispatchesImpl <em>Dispatches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.DispatchesImpl
	 * @see kdm.action.impl.ActionPackageImpl#getDispatches()
	 * @generated
	 */
	int DISPATCHES = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dispatches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.EntryFlowImpl <em>Entry Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.EntryFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getEntryFlow()
	 * @generated
	 */
	int ENTRY_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FLOW_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.BlockUnitImpl <em>Block Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.BlockUnitImpl
	 * @see kdm.action.impl.ActionPackageImpl#getBlockUnit()
	 * @generated
	 */
	int BLOCK_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__ATTRIBUTE = ACTION_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__ANNOTATION = ACTION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__STEREOTYPE = ACTION_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__TAGGED_VALUE = ACTION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__NAME = ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__SOURCE = ACTION_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__COMMENT = ACTION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_RELATION = ACTION_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__KIND = ACTION_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_ELEMENT = ACTION_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__ACTION_RELATION = ACTION_ELEMENT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Block Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ExceptionUnitImpl
	 * @see kdm.action.impl.ActionPackageImpl#getExceptionUnit()
	 * @generated
	 */
	int EXCEPTION_UNIT = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__ATTRIBUTE = BLOCK_UNIT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__ANNOTATION = BLOCK_UNIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__STEREOTYPE = BLOCK_UNIT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__TAGGED_VALUE = BLOCK_UNIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__NAME = BLOCK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__SOURCE = BLOCK_UNIT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__COMMENT = BLOCK_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_RELATION = BLOCK_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__KIND = BLOCK_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_ELEMENT = BLOCK_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__ACTION_RELATION = BLOCK_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Exception Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT_FEATURE_COUNT = BLOCK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.TryUnitImpl <em>Try Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.TryUnitImpl
	 * @see kdm.action.impl.ActionPackageImpl#getTryUnit()
	 * @generated
	 */
	int TRY_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__ATTRIBUTE = EXCEPTION_UNIT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__ANNOTATION = EXCEPTION_UNIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__STEREOTYPE = EXCEPTION_UNIT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__TAGGED_VALUE = EXCEPTION_UNIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__SOURCE = EXCEPTION_UNIT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Try Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.FinallyUnitImpl
	 * @see kdm.action.impl.ActionPackageImpl#getFinallyUnit()
	 * @generated
	 */
	int FINALLY_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__ATTRIBUTE = EXCEPTION_UNIT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__ANNOTATION = EXCEPTION_UNIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__STEREOTYPE = EXCEPTION_UNIT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__TAGGED_VALUE = EXCEPTION_UNIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__SOURCE = EXCEPTION_UNIT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Finally Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.CatchUnitImpl
	 * @see kdm.action.impl.ActionPackageImpl#getCatchUnit()
	 * @generated
	 */
	int CATCH_UNIT = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__ATTRIBUTE = EXCEPTION_UNIT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__ANNOTATION = EXCEPTION_UNIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__STEREOTYPE = EXCEPTION_UNIT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__TAGGED_VALUE = EXCEPTION_UNIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__SOURCE = EXCEPTION_UNIT__SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Catch Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ExitFlowImpl <em>Exit Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ExitFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getExitFlow()
	 * @generated
	 */
	int EXIT_FLOW = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exit Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FLOW_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.action.impl.ExceptionFlowImpl <em>Exception Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.action.impl.ExceptionFlowImpl
	 * @see kdm.action.impl.ActionPackageImpl#getExceptionFlow()
	 * @generated
	 */
	int EXCEPTION_FLOW = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__ATTRIBUTE = ABSTRACT_ACTION_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__STEREOTYPE = ABSTRACT_ACTION_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__TAGGED_VALUE = ABSTRACT_ACTION_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FLOW_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kdm.action.ActionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.action.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for the attribute '{@link kdm.action.ActionElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kdm.action.ActionElement#getKind()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.action.ActionElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see kdm.action.ActionElement#getCodeElement()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_CodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.action.ActionElement#getActionRelation <em>Action Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Relation</em>'.
	 * @see kdm.action.ActionElement#getActionRelation()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_ActionRelation();

	/**
	 * Returns the meta object for class '{@link kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action Relationship</em>'.
	 * @see kdm.action.AbstractActionRelationship
	 * @generated
	 */
	EClass getAbstractActionRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.action.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see kdm.action.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ControlFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.ControlFlow#getTo()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ControlFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.ControlFlow#getFrom()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calls</em>'.
	 * @see kdm.action.Calls
	 * @generated
	 */
	EClass getCalls();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Calls#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Calls#getTo()
	 * @see #getCalls()
	 * @generated
	 */
	EReference getCalls_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Calls#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Calls#getFrom()
	 * @see #getCalls()
	 * @generated
	 */
	EReference getCalls_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creates</em>'.
	 * @see kdm.action.Creates
	 * @generated
	 */
	EClass getCreates();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Creates#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Creates#getTo()
	 * @see #getCreates()
	 * @generated
	 */
	EReference getCreates_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Creates#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Creates#getFrom()
	 * @see #getCreates()
	 * @generated
	 */
	EReference getCreates_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads</em>'.
	 * @see kdm.action.Reads
	 * @generated
	 */
	EClass getReads();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Reads#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Reads#getTo()
	 * @see #getReads()
	 * @generated
	 */
	EReference getReads_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Reads#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Reads#getFrom()
	 * @see #getReads()
	 * @generated
	 */
	EReference getReads_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes</em>'.
	 * @see kdm.action.Writes
	 * @generated
	 */
	EClass getWrites();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Writes#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Writes#getTo()
	 * @see #getWrites()
	 * @generated
	 */
	EReference getWrites_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Writes#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Writes#getFrom()
	 * @see #getWrites()
	 * @generated
	 */
	EReference getWrites_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.CompliesTo <em>Complies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complies To</em>'.
	 * @see kdm.action.CompliesTo
	 * @generated
	 */
	EClass getCompliesTo();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.CompliesTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.CompliesTo#getTo()
	 * @see #getCompliesTo()
	 * @generated
	 */
	EReference getCompliesTo_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.CompliesTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.CompliesTo#getFrom()
	 * @see #getCompliesTo()
	 * @generated
	 */
	EReference getCompliesTo_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see kdm.action.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for class '{@link kdm.action.TrueFlow <em>True Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Flow</em>'.
	 * @see kdm.action.TrueFlow
	 * @generated
	 */
	EClass getTrueFlow();

	/**
	 * Returns the meta object for class '{@link kdm.action.FalseFlow <em>False Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Flow</em>'.
	 * @see kdm.action.FalseFlow
	 * @generated
	 */
	EClass getFalseFlow();

	/**
	 * Returns the meta object for class '{@link kdm.action.GuardedFlow <em>Guarded Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Flow</em>'.
	 * @see kdm.action.GuardedFlow
	 * @generated
	 */
	EClass getGuardedFlow();

	/**
	 * Returns the meta object for class '{@link kdm.action.UsesType <em>Uses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Type</em>'.
	 * @see kdm.action.UsesType
	 * @generated
	 */
	EClass getUsesType();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.UsesType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.UsesType#getTo()
	 * @see #getUsesType()
	 * @generated
	 */
	EReference getUsesType_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.UsesType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.UsesType#getFrom()
	 * @see #getUsesType()
	 * @generated
	 */
	EReference getUsesType_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Addresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addresses</em>'.
	 * @see kdm.action.Addresses
	 * @generated
	 */
	EClass getAddresses();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Addresses#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Addresses#getTo()
	 * @see #getAddresses()
	 * @generated
	 */
	EReference getAddresses_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Addresses#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Addresses#getFrom()
	 * @see #getAddresses()
	 * @generated
	 */
	EReference getAddresses_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.ActionRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.action.ActionRelationship
	 * @generated
	 */
	EClass getActionRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ActionRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.ActionRelationship#getTo()
	 * @see #getActionRelationship()
	 * @generated
	 */
	EReference getActionRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ActionRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.ActionRelationship#getFrom()
	 * @see #getActionRelationship()
	 * @generated
	 */
	EReference getActionRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Throws <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throws</em>'.
	 * @see kdm.action.Throws
	 * @generated
	 */
	EClass getThrows();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Throws#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Throws#getTo()
	 * @see #getThrows()
	 * @generated
	 */
	EReference getThrows_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Throws#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Throws#getFrom()
	 * @see #getThrows()
	 * @generated
	 */
	EReference getThrows_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.Dispatches <em>Dispatches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatches</em>'.
	 * @see kdm.action.Dispatches
	 * @generated
	 */
	EClass getDispatches();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Dispatches#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.Dispatches#getTo()
	 * @see #getDispatches()
	 * @generated
	 */
	EReference getDispatches_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.Dispatches#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.Dispatches#getFrom()
	 * @see #getDispatches()
	 * @generated
	 */
	EReference getDispatches_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.EntryFlow <em>Entry Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Flow</em>'.
	 * @see kdm.action.EntryFlow
	 * @generated
	 */
	EClass getEntryFlow();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.EntryFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.EntryFlow#getTo()
	 * @see #getEntryFlow()
	 * @generated
	 */
	EReference getEntryFlow_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.EntryFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.EntryFlow#getFrom()
	 * @see #getEntryFlow()
	 * @generated
	 */
	EReference getEntryFlow_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Unit</em>'.
	 * @see kdm.action.BlockUnit
	 * @generated
	 */
	EClass getBlockUnit();

	/**
	 * Returns the meta object for class '{@link kdm.action.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Unit</em>'.
	 * @see kdm.action.ExceptionUnit
	 * @generated
	 */
	EClass getExceptionUnit();

	/**
	 * Returns the meta object for class '{@link kdm.action.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Unit</em>'.
	 * @see kdm.action.TryUnit
	 * @generated
	 */
	EClass getTryUnit();

	/**
	 * Returns the meta object for class '{@link kdm.action.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Unit</em>'.
	 * @see kdm.action.FinallyUnit
	 * @generated
	 */
	EClass getFinallyUnit();

	/**
	 * Returns the meta object for class '{@link kdm.action.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Unit</em>'.
	 * @see kdm.action.CatchUnit
	 * @generated
	 */
	EClass getCatchUnit();

	/**
	 * Returns the meta object for class '{@link kdm.action.ExitFlow <em>Exit Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Flow</em>'.
	 * @see kdm.action.ExitFlow
	 * @generated
	 */
	EClass getExitFlow();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ExitFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.ExitFlow#getTo()
	 * @see #getExitFlow()
	 * @generated
	 */
	EReference getExitFlow_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ExitFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.ExitFlow#getFrom()
	 * @see #getExitFlow()
	 * @generated
	 */
	EReference getExitFlow_From();

	/**
	 * Returns the meta object for class '{@link kdm.action.ExceptionFlow <em>Exception Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Flow</em>'.
	 * @see kdm.action.ExceptionFlow
	 * @generated
	 */
	EClass getExceptionFlow();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ExceptionFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.action.ExceptionFlow#getTo()
	 * @see #getExceptionFlow()
	 * @generated
	 */
	EReference getExceptionFlow_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.action.ExceptionFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.action.ExceptionFlow#getFrom()
	 * @see #getExceptionFlow()
	 * @generated
	 */
	EReference getExceptionFlow_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionFactory getActionFactory();

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
		 * The meta object literal for the '{@link kdm.action.impl.ActionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ActionElementImpl
		 * @see kdm.action.impl.ActionPackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__KIND = eINSTANCE.getActionElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__CODE_ELEMENT = eINSTANCE.getActionElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Action Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__ACTION_RELATION = eINSTANCE.getActionElement_ActionRelation();

		/**
		 * The meta object literal for the '{@link kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.AbstractActionRelationship
		 * @see kdm.action.impl.ActionPackageImpl#getAbstractActionRelationship()
		 * @generated
		 */
		EClass ABSTRACT_ACTION_RELATIONSHIP = eINSTANCE.getAbstractActionRelationship();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ControlFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__TO = eINSTANCE.getControlFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__FROM = eINSTANCE.getControlFlow_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.CallsImpl <em>Calls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.CallsImpl
		 * @see kdm.action.impl.ActionPackageImpl#getCalls()
		 * @generated
		 */
		EClass CALLS = eINSTANCE.getCalls();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLS__TO = eINSTANCE.getCalls_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLS__FROM = eINSTANCE.getCalls_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.CreatesImpl <em>Creates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.CreatesImpl
		 * @see kdm.action.impl.ActionPackageImpl#getCreates()
		 * @generated
		 */
		EClass CREATES = eINSTANCE.getCreates();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATES__TO = eINSTANCE.getCreates_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATES__FROM = eINSTANCE.getCreates_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ReadsImpl <em>Reads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ReadsImpl
		 * @see kdm.action.impl.ActionPackageImpl#getReads()
		 * @generated
		 */
		EClass READS = eINSTANCE.getReads();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS__TO = eINSTANCE.getReads_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS__FROM = eINSTANCE.getReads_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.WritesImpl <em>Writes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.WritesImpl
		 * @see kdm.action.impl.ActionPackageImpl#getWrites()
		 * @generated
		 */
		EClass WRITES = eINSTANCE.getWrites();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES__TO = eINSTANCE.getWrites_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES__FROM = eINSTANCE.getWrites_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.CompliesToImpl <em>Complies To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.CompliesToImpl
		 * @see kdm.action.impl.ActionPackageImpl#getCompliesTo()
		 * @generated
		 */
		EClass COMPLIES_TO = eINSTANCE.getCompliesTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIES_TO__TO = eINSTANCE.getCompliesTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIES_TO__FROM = eINSTANCE.getCompliesTo_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.FlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.TrueFlowImpl <em>True Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.TrueFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getTrueFlow()
		 * @generated
		 */
		EClass TRUE_FLOW = eINSTANCE.getTrueFlow();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.FalseFlowImpl <em>False Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.FalseFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getFalseFlow()
		 * @generated
		 */
		EClass FALSE_FLOW = eINSTANCE.getFalseFlow();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.GuardedFlowImpl <em>Guarded Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.GuardedFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getGuardedFlow()
		 * @generated
		 */
		EClass GUARDED_FLOW = eINSTANCE.getGuardedFlow();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.UsesTypeImpl <em>Uses Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.UsesTypeImpl
		 * @see kdm.action.impl.ActionPackageImpl#getUsesType()
		 * @generated
		 */
		EClass USES_TYPE = eINSTANCE.getUsesType();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_TYPE__TO = eINSTANCE.getUsesType_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_TYPE__FROM = eINSTANCE.getUsesType_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.AddressesImpl <em>Addresses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.AddressesImpl
		 * @see kdm.action.impl.ActionPackageImpl#getAddresses()
		 * @generated
		 */
		EClass ADDRESSES = eINSTANCE.getAddresses();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSES__TO = eINSTANCE.getAddresses_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSES__FROM = eINSTANCE.getAddresses_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ActionRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ActionRelationshipImpl
		 * @see kdm.action.impl.ActionPackageImpl#getActionRelationship()
		 * @generated
		 */
		EClass ACTION_RELATIONSHIP = eINSTANCE.getActionRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RELATIONSHIP__TO = eINSTANCE.getActionRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RELATIONSHIP__FROM = eINSTANCE.getActionRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ThrowsImpl <em>Throws</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ThrowsImpl
		 * @see kdm.action.impl.ActionPackageImpl#getThrows()
		 * @generated
		 */
		EClass THROWS = eINSTANCE.getThrows();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROWS__TO = eINSTANCE.getThrows_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROWS__FROM = eINSTANCE.getThrows_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.DispatchesImpl <em>Dispatches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.DispatchesImpl
		 * @see kdm.action.impl.ActionPackageImpl#getDispatches()
		 * @generated
		 */
		EClass DISPATCHES = eINSTANCE.getDispatches();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCHES__TO = eINSTANCE.getDispatches_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCHES__FROM = eINSTANCE.getDispatches_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.EntryFlowImpl <em>Entry Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.EntryFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getEntryFlow()
		 * @generated
		 */
		EClass ENTRY_FLOW = eINSTANCE.getEntryFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_FLOW__TO = eINSTANCE.getEntryFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_FLOW__FROM = eINSTANCE.getEntryFlow_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.BlockUnitImpl <em>Block Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.BlockUnitImpl
		 * @see kdm.action.impl.ActionPackageImpl#getBlockUnit()
		 * @generated
		 */
		EClass BLOCK_UNIT = eINSTANCE.getBlockUnit();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ExceptionUnitImpl
		 * @see kdm.action.impl.ActionPackageImpl#getExceptionUnit()
		 * @generated
		 */
		EClass EXCEPTION_UNIT = eINSTANCE.getExceptionUnit();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.TryUnitImpl <em>Try Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.TryUnitImpl
		 * @see kdm.action.impl.ActionPackageImpl#getTryUnit()
		 * @generated
		 */
		EClass TRY_UNIT = eINSTANCE.getTryUnit();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.FinallyUnitImpl
		 * @see kdm.action.impl.ActionPackageImpl#getFinallyUnit()
		 * @generated
		 */
		EClass FINALLY_UNIT = eINSTANCE.getFinallyUnit();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.CatchUnitImpl
		 * @see kdm.action.impl.ActionPackageImpl#getCatchUnit()
		 * @generated
		 */
		EClass CATCH_UNIT = eINSTANCE.getCatchUnit();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ExitFlowImpl <em>Exit Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ExitFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getExitFlow()
		 * @generated
		 */
		EClass EXIT_FLOW = eINSTANCE.getExitFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_FLOW__TO = eINSTANCE.getExitFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_FLOW__FROM = eINSTANCE.getExitFlow_From();

		/**
		 * The meta object literal for the '{@link kdm.action.impl.ExceptionFlowImpl <em>Exception Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.action.impl.ExceptionFlowImpl
		 * @see kdm.action.impl.ActionPackageImpl#getExceptionFlow()
		 * @generated
		 */
		EClass EXCEPTION_FLOW = eINSTANCE.getExceptionFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_FLOW__TO = eINSTANCE.getExceptionFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_FLOW__FROM = eINSTANCE.getExceptionFlow_From();

	}

} //ActionPackage
