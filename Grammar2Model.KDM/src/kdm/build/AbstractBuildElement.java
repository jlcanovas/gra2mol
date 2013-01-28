/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;

import kdm.core.KDMEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Build Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.AbstractBuildElement#getBuildRelation <em>Build Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getAbstractBuildElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractBuildElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Build Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.build.AbstractBuildRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Relation</em>' containment reference list.
	 * @see kdm.build.BuildPackage#getAbstractBuildElement_BuildRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBuildRelationship> getBuildRelation();

} // AbstractBuildElement
