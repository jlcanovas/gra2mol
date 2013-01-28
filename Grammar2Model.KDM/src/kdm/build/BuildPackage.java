/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;

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
 * @see kdm.build.BuildFactory
 * @model kind="package"
 * @generated
 */
public interface BuildPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "build";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdm/build";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "build";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildPackage eINSTANCE = kdm.build.impl.BuildPackageImpl.init();

	/**
	 * The meta object id for the '{@link kdm.build.AbstractBuildElement <em>Abstract Build Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.AbstractBuildElement
	 * @see kdm.build.impl.BuildPackageImpl#getAbstractBuildElement()
	 * @generated
	 */
	int ABSTRACT_BUILD_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__ATTRIBUTE = CorePackage.KDM_ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__ANNOTATION = CorePackage.KDM_ENTITY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__STEREOTYPE = CorePackage.KDM_ENTITY__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE = CorePackage.KDM_ENTITY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__NAME = CorePackage.KDM_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT__BUILD_RELATION = CorePackage.KDM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Build Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT = CorePackage.KDM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildResourceImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildResource()
	 * @generated
	 */
	int BUILD_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__ATTRIBUTE = ABSTRACT_BUILD_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__ANNOTATION = ABSTRACT_BUILD_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__STEREOTYPE = ABSTRACT_BUILD_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__TAGGED_VALUE = ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__NAME = ABSTRACT_BUILD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__BUILD_RELATION = ABSTRACT_BUILD_ELEMENT__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__IMPLEMENTATION = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__GROUPED_BUILD = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE__BUILD_ELEMENT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESOURCE_FEATURE_COUNT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildDescriptionImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildDescription()
	 * @generated
	 */
	int BUILD_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__ATTRIBUTE = BUILD_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__ANNOTATION = BUILD_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__STEREOTYPE = BUILD_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__TAGGED_VALUE = BUILD_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__NAME = BUILD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__BUILD_RELATION = BUILD_RESOURCE__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__IMPLEMENTATION = BUILD_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__GROUPED_BUILD = BUILD_RESOURCE__GROUPED_BUILD;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__BUILD_ELEMENT = BUILD_RESOURCE__BUILD_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__SOURCE = BUILD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION__TEXT = BUILD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DESCRIPTION_FEATURE_COUNT = BUILD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.SymbolicLinkImpl <em>Symbolic Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.SymbolicLinkImpl
	 * @see kdm.build.impl.BuildPackageImpl#getSymbolicLink()
	 * @generated
	 */
	int SYMBOLIC_LINK = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__ATTRIBUTE = ABSTRACT_BUILD_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__ANNOTATION = ABSTRACT_BUILD_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__STEREOTYPE = ABSTRACT_BUILD_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__TAGGED_VALUE = ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__NAME = ABSTRACT_BUILD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK__BUILD_RELATION = ABSTRACT_BUILD_ELEMENT__BUILD_RELATION;

	/**
	 * The number of structural features of the '<em>Symbolic Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_LINK_FEATURE_COUNT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.AbstractBuildRelationship <em>Abstract Build Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.AbstractBuildRelationship
	 * @see kdm.build.impl.BuildPackageImpl#getAbstractBuildRelationship()
	 * @generated
	 */
	int ABSTRACT_BUILD_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE = CorePackage.KDM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION = CorePackage.KDM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE = CorePackage.KDM_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE = CorePackage.KDM_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Abstract Build Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT = CorePackage.KDM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.LinksToImpl <em>Links To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.LinksToImpl
	 * @see kdm.build.impl.BuildPackageImpl#getLinksTo()
	 * @generated
	 */
	int LINKS_TO = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Links To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_TO_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.ConsumesImpl <em>Consumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.ConsumesImpl
	 * @see kdm.build.impl.BuildPackageImpl#getConsumes()
	 * @generated
	 */
	int CONSUMES = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildModelImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildModel()
	 * @generated
	 */
	int BUILD_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__ATTRIBUTE = KdmPackage.KDM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__ANNOTATION = KdmPackage.KDM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__STEREOTYPE = KdmPackage.KDM_MODEL__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__TAGGED_VALUE = KdmPackage.KDM_MODEL__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__AUDIT = KdmPackage.KDM_MODEL__AUDIT;

	/**
	 * The feature id for the '<em><b>Extension Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__EXTENSION_FAMILY = KdmPackage.KDM_MODEL__EXTENSION_FAMILY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__NAME = KdmPackage.KDM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL__BUILD_ELEMENT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_MODEL_FEATURE_COUNT = KdmPackage.KDM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildComponentImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildComponent()
	 * @generated
	 */
	int BUILD_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__ATTRIBUTE = BUILD_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__ANNOTATION = BUILD_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__STEREOTYPE = BUILD_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__TAGGED_VALUE = BUILD_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__NAME = BUILD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__BUILD_RELATION = BUILD_RESOURCE__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__IMPLEMENTATION = BUILD_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__GROUPED_BUILD = BUILD_RESOURCE__GROUPED_BUILD;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT__BUILD_ELEMENT = BUILD_RESOURCE__BUILD_ELEMENT;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_COMPONENT_FEATURE_COUNT = BUILD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.SupplierImpl
	 * @see kdm.build.impl.BuildPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ATTRIBUTE = ABSTRACT_BUILD_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ANNOTATION = ABSTRACT_BUILD_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__STEREOTYPE = ABSTRACT_BUILD_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__TAGGED_VALUE = ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = ABSTRACT_BUILD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__BUILD_RELATION = ABSTRACT_BUILD_ELEMENT__BUILD_RELATION;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.ToolImpl
	 * @see kdm.build.impl.BuildPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ATTRIBUTE = ABSTRACT_BUILD_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ANNOTATION = ABSTRACT_BUILD_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__STEREOTYPE = ABSTRACT_BUILD_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TAGGED_VALUE = ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = ABSTRACT_BUILD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__BUILD_RELATION = ABSTRACT_BUILD_ELEMENT__BUILD_RELATION;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildElementImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildElement()
	 * @generated
	 */
	int BUILD_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__ATTRIBUTE = ABSTRACT_BUILD_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__ANNOTATION = ABSTRACT_BUILD_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__STEREOTYPE = ABSTRACT_BUILD_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__TAGGED_VALUE = ABSTRACT_BUILD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__NAME = ABSTRACT_BUILD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT__BUILD_RELATION = ABSTRACT_BUILD_ELEMENT__BUILD_RELATION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_ELEMENT_FEATURE_COUNT = ABSTRACT_BUILD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildRelationshipImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildRelationship()
	 * @generated
	 */
	int BUILD_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RELATIONSHIP_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.SuppliedByImpl <em>Supplied By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.SuppliedByImpl
	 * @see kdm.build.impl.BuildPackageImpl#getSuppliedBy()
	 * @generated
	 */
	int SUPPLIED_BY = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supplied By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIED_BY_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.LibraryImpl
	 * @see kdm.build.impl.BuildPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ATTRIBUTE = BUILD_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ANNOTATION = BUILD_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__STEREOTYPE = BUILD_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TAGGED_VALUE = BUILD_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = BUILD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BUILD_RELATION = BUILD_RESOURCE__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IMPLEMENTATION = BUILD_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__GROUPED_BUILD = BUILD_RESOURCE__GROUPED_BUILD;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BUILD_ELEMENT = BUILD_RESOURCE__BUILD_ELEMENT;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = BUILD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildStepImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildStep()
	 * @generated
	 */
	int BUILD_STEP = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__ATTRIBUTE = BUILD_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__ANNOTATION = BUILD_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__STEREOTYPE = BUILD_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__TAGGED_VALUE = BUILD_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__NAME = BUILD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__BUILD_RELATION = BUILD_RESOURCE__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__IMPLEMENTATION = BUILD_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__GROUPED_BUILD = BUILD_RESOURCE__GROUPED_BUILD;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP__BUILD_ELEMENT = BUILD_RESOURCE__BUILD_ELEMENT;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_STEP_FEATURE_COUNT = BUILD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.ProducesImpl <em>Produces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.ProducesImpl
	 * @see kdm.build.impl.BuildPackageImpl#getProduces()
	 * @generated
	 */
	int PRODUCES = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Produces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.SupportedByImpl
	 * @see kdm.build.impl.BuildPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kdm.build.impl.BuildProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.BuildProductImpl
	 * @see kdm.build.impl.BuildPackageImpl#getBuildProduct()
	 * @generated
	 */
	int BUILD_PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__ATTRIBUTE = BUILD_RESOURCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__ANNOTATION = BUILD_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__STEREOTYPE = BUILD_RESOURCE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__TAGGED_VALUE = BUILD_RESOURCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__NAME = BUILD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Build Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__BUILD_RELATION = BUILD_RESOURCE__BUILD_RELATION;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__IMPLEMENTATION = BUILD_RESOURCE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Grouped Build</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__GROUPED_BUILD = BUILD_RESOURCE__GROUPED_BUILD;

	/**
	 * The feature id for the '<em><b>Build Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT__BUILD_ELEMENT = BUILD_RESOURCE__BUILD_ELEMENT;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PRODUCT_FEATURE_COUNT = BUILD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kdm.build.impl.DescribedByImpl <em>Described By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kdm.build.impl.DescribedByImpl
	 * @see kdm.build.impl.BuildPackageImpl#getDescribedBy()
	 * @generated
	 */
	int DESCRIBED_BY = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__ATTRIBUTE = ABSTRACT_BUILD_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__ANNOTATION = ABSTRACT_BUILD_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__STEREOTYPE = ABSTRACT_BUILD_RELATIONSHIP__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__TAGGED_VALUE = ABSTRACT_BUILD_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__TO = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY__FROM = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Described By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_BY_FEATURE_COUNT = ABSTRACT_BUILD_RELATIONSHIP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link kdm.build.AbstractBuildElement <em>Abstract Build Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Build Element</em>'.
	 * @see kdm.build.AbstractBuildElement
	 * @generated
	 */
	EClass getAbstractBuildElement();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.build.AbstractBuildElement#getBuildRelation <em>Build Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Relation</em>'.
	 * @see kdm.build.AbstractBuildElement#getBuildRelation()
	 * @see #getAbstractBuildElement()
	 * @generated
	 */
	EReference getAbstractBuildElement_BuildRelation();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see kdm.build.BuildResource
	 * @generated
	 */
	EClass getBuildResource();

	/**
	 * Returns the meta object for the reference list '{@link kdm.build.BuildResource#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see kdm.build.BuildResource#getImplementation()
	 * @see #getBuildResource()
	 * @generated
	 */
	EReference getBuildResource_Implementation();

	/**
	 * Returns the meta object for the reference list '{@link kdm.build.BuildResource#getGroupedBuild <em>Grouped Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Build</em>'.
	 * @see kdm.build.BuildResource#getGroupedBuild()
	 * @see #getBuildResource()
	 * @generated
	 */
	EReference getBuildResource_GroupedBuild();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.build.BuildResource#getBuildElement <em>Build Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Element</em>'.
	 * @see kdm.build.BuildResource#getBuildElement()
	 * @see #getBuildResource()
	 * @generated
	 */
	EReference getBuildResource_BuildElement();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see kdm.build.BuildDescription
	 * @generated
	 */
	EClass getBuildDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.build.BuildDescription#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see kdm.build.BuildDescription#getSource()
	 * @see #getBuildDescription()
	 * @generated
	 */
	EReference getBuildDescription_Source();

	/**
	 * Returns the meta object for the attribute '{@link kdm.build.BuildDescription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see kdm.build.BuildDescription#getText()
	 * @see #getBuildDescription()
	 * @generated
	 */
	EAttribute getBuildDescription_Text();

	/**
	 * Returns the meta object for class '{@link kdm.build.SymbolicLink <em>Symbolic Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Link</em>'.
	 * @see kdm.build.SymbolicLink
	 * @generated
	 */
	EClass getSymbolicLink();

	/**
	 * Returns the meta object for class '{@link kdm.build.AbstractBuildRelationship <em>Abstract Build Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Build Relationship</em>'.
	 * @see kdm.build.AbstractBuildRelationship
	 * @generated
	 */
	EClass getAbstractBuildRelationship();

	/**
	 * Returns the meta object for class '{@link kdm.build.LinksTo <em>Links To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links To</em>'.
	 * @see kdm.build.LinksTo
	 * @generated
	 */
	EClass getLinksTo();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.LinksTo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.LinksTo#getTo()
	 * @see #getLinksTo()
	 * @generated
	 */
	EReference getLinksTo_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.LinksTo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.LinksTo#getFrom()
	 * @see #getLinksTo()
	 * @generated
	 */
	EReference getLinksTo_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.Consumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes</em>'.
	 * @see kdm.build.Consumes
	 * @generated
	 */
	EClass getConsumes();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.Consumes#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.Consumes#getTo()
	 * @see #getConsumes()
	 * @generated
	 */
	EReference getConsumes_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.Consumes#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.Consumes#getFrom()
	 * @see #getConsumes()
	 * @generated
	 */
	EReference getConsumes_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see kdm.build.BuildModel
	 * @generated
	 */
	EClass getBuildModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kdm.build.BuildModel#getBuildElement <em>Build Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Element</em>'.
	 * @see kdm.build.BuildModel#getBuildElement()
	 * @see #getBuildModel()
	 * @generated
	 */
	EReference getBuildModel_BuildElement();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see kdm.build.BuildComponent
	 * @generated
	 */
	EClass getBuildComponent();

	/**
	 * Returns the meta object for class '{@link kdm.build.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see kdm.build.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for class '{@link kdm.build.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see kdm.build.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see kdm.build.BuildElement
	 * @generated
	 */
	EClass getBuildElement();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kdm.build.BuildRelationship
	 * @generated
	 */
	EClass getBuildRelationship();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.BuildRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.BuildRelationship#getTo()
	 * @see #getBuildRelationship()
	 * @generated
	 */
	EReference getBuildRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.BuildRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.BuildRelationship#getFrom()
	 * @see #getBuildRelationship()
	 * @generated
	 */
	EReference getBuildRelationship_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.SuppliedBy <em>Supplied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplied By</em>'.
	 * @see kdm.build.SuppliedBy
	 * @generated
	 */
	EClass getSuppliedBy();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.SuppliedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.SuppliedBy#getTo()
	 * @see #getSuppliedBy()
	 * @generated
	 */
	EReference getSuppliedBy_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.SuppliedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.SuppliedBy#getFrom()
	 * @see #getSuppliedBy()
	 * @generated
	 */
	EReference getSuppliedBy_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see kdm.build.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see kdm.build.BuildStep
	 * @generated
	 */
	EClass getBuildStep();

	/**
	 * Returns the meta object for class '{@link kdm.build.Produces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produces</em>'.
	 * @see kdm.build.Produces
	 * @generated
	 */
	EClass getProduces();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.Produces#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.Produces#getTo()
	 * @see #getProduces()
	 * @generated
	 */
	EReference getProduces_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.Produces#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.Produces#getFrom()
	 * @see #getProduces()
	 * @generated
	 */
	EReference getProduces_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see kdm.build.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.SupportedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.SupportedBy#getTo()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EReference getSupportedBy_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.SupportedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.SupportedBy#getFrom()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EReference getSupportedBy_From();

	/**
	 * Returns the meta object for class '{@link kdm.build.BuildProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see kdm.build.BuildProduct
	 * @generated
	 */
	EClass getBuildProduct();

	/**
	 * Returns the meta object for class '{@link kdm.build.DescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described By</em>'.
	 * @see kdm.build.DescribedBy
	 * @generated
	 */
	EClass getDescribedBy();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.DescribedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see kdm.build.DescribedBy#getTo()
	 * @see #getDescribedBy()
	 * @generated
	 */
	EReference getDescribedBy_To();

	/**
	 * Returns the meta object for the reference '{@link kdm.build.DescribedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see kdm.build.DescribedBy#getFrom()
	 * @see #getDescribedBy()
	 * @generated
	 */
	EReference getDescribedBy_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildFactory getBuildFactory();

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
		 * The meta object literal for the '{@link kdm.build.AbstractBuildElement <em>Abstract Build Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.AbstractBuildElement
		 * @see kdm.build.impl.BuildPackageImpl#getAbstractBuildElement()
		 * @generated
		 */
		EClass ABSTRACT_BUILD_ELEMENT = eINSTANCE.getAbstractBuildElement();

		/**
		 * The meta object literal for the '<em><b>Build Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILD_ELEMENT__BUILD_RELATION = eINSTANCE.getAbstractBuildElement_BuildRelation();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildResourceImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildResource()
		 * @generated
		 */
		EClass BUILD_RESOURCE = eINSTANCE.getBuildResource();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RESOURCE__IMPLEMENTATION = eINSTANCE.getBuildResource_Implementation();

		/**
		 * The meta object literal for the '<em><b>Grouped Build</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RESOURCE__GROUPED_BUILD = eINSTANCE.getBuildResource_GroupedBuild();

		/**
		 * The meta object literal for the '<em><b>Build Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RESOURCE__BUILD_ELEMENT = eINSTANCE.getBuildResource_BuildElement();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildDescriptionImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildDescription()
		 * @generated
		 */
		EClass BUILD_DESCRIPTION = eINSTANCE.getBuildDescription();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_DESCRIPTION__SOURCE = eINSTANCE.getBuildDescription_Source();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_DESCRIPTION__TEXT = eINSTANCE.getBuildDescription_Text();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.SymbolicLinkImpl <em>Symbolic Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.SymbolicLinkImpl
		 * @see kdm.build.impl.BuildPackageImpl#getSymbolicLink()
		 * @generated
		 */
		EClass SYMBOLIC_LINK = eINSTANCE.getSymbolicLink();

		/**
		 * The meta object literal for the '{@link kdm.build.AbstractBuildRelationship <em>Abstract Build Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.AbstractBuildRelationship
		 * @see kdm.build.impl.BuildPackageImpl#getAbstractBuildRelationship()
		 * @generated
		 */
		EClass ABSTRACT_BUILD_RELATIONSHIP = eINSTANCE.getAbstractBuildRelationship();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.LinksToImpl <em>Links To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.LinksToImpl
		 * @see kdm.build.impl.BuildPackageImpl#getLinksTo()
		 * @generated
		 */
		EClass LINKS_TO = eINSTANCE.getLinksTo();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS_TO__TO = eINSTANCE.getLinksTo_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS_TO__FROM = eINSTANCE.getLinksTo_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.ConsumesImpl <em>Consumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.ConsumesImpl
		 * @see kdm.build.impl.BuildPackageImpl#getConsumes()
		 * @generated
		 */
		EClass CONSUMES = eINSTANCE.getConsumes();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES__TO = eINSTANCE.getConsumes_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES__FROM = eINSTANCE.getConsumes_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildModelImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildModel()
		 * @generated
		 */
		EClass BUILD_MODEL = eINSTANCE.getBuildModel();

		/**
		 * The meta object literal for the '<em><b>Build Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_MODEL__BUILD_ELEMENT = eINSTANCE.getBuildModel_BuildElement();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildComponentImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildComponent()
		 * @generated
		 */
		EClass BUILD_COMPONENT = eINSTANCE.getBuildComponent();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.SupplierImpl
		 * @see kdm.build.impl.BuildPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.ToolImpl
		 * @see kdm.build.impl.BuildPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildElementImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildElement()
		 * @generated
		 */
		EClass BUILD_ELEMENT = eINSTANCE.getBuildElement();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildRelationshipImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildRelationship()
		 * @generated
		 */
		EClass BUILD_RELATIONSHIP = eINSTANCE.getBuildRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RELATIONSHIP__TO = eINSTANCE.getBuildRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RELATIONSHIP__FROM = eINSTANCE.getBuildRelationship_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.SuppliedByImpl <em>Supplied By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.SuppliedByImpl
		 * @see kdm.build.impl.BuildPackageImpl#getSuppliedBy()
		 * @generated
		 */
		EClass SUPPLIED_BY = eINSTANCE.getSuppliedBy();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIED_BY__TO = eINSTANCE.getSuppliedBy_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIED_BY__FROM = eINSTANCE.getSuppliedBy_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.LibraryImpl
		 * @see kdm.build.impl.BuildPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildStepImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildStep()
		 * @generated
		 */
		EClass BUILD_STEP = eINSTANCE.getBuildStep();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.ProducesImpl <em>Produces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.ProducesImpl
		 * @see kdm.build.impl.BuildPackageImpl#getProduces()
		 * @generated
		 */
		EClass PRODUCES = eINSTANCE.getProduces();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES__TO = eINSTANCE.getProduces_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES__FROM = eINSTANCE.getProduces_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.SupportedByImpl
		 * @see kdm.build.impl.BuildPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_BY__TO = eINSTANCE.getSupportedBy_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_BY__FROM = eINSTANCE.getSupportedBy_From();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.BuildProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.BuildProductImpl
		 * @see kdm.build.impl.BuildPackageImpl#getBuildProduct()
		 * @generated
		 */
		EClass BUILD_PRODUCT = eINSTANCE.getBuildProduct();

		/**
		 * The meta object literal for the '{@link kdm.build.impl.DescribedByImpl <em>Described By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kdm.build.impl.DescribedByImpl
		 * @see kdm.build.impl.BuildPackageImpl#getDescribedBy()
		 * @generated
		 */
		EClass DESCRIBED_BY = eINSTANCE.getDescribedBy();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBED_BY__TO = eINSTANCE.getDescribedBy_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBED_BY__FROM = eINSTANCE.getDescribedBy_From();

	}

} //BuildPackage
