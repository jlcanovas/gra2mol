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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.BuildResource#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.build.BuildResource#getGroupedBuild <em>Grouped Build</em>}</li>
 *   <li>{@link kdm.build.BuildResource#getBuildElement <em>Build Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getBuildResource()
 * @model
 * @generated
 */
public interface BuildResource extends AbstractBuildElement {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see kdm.build.BuildPackage#getBuildResource_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Grouped Build</b></em>' reference list.
	 * The list contents are of type {@link kdm.build.AbstractBuildElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Build</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Build</em>' reference list.
	 * @see kdm.build.BuildPackage#getBuildResource_GroupedBuild()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractBuildElement> getGroupedBuild();

	/**
	 * Returns the value of the '<em><b>Build Element</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.build.AbstractBuildElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Element</em>' containment reference list.
	 * @see kdm.build.BuildPackage#getBuildResource_BuildElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBuildElement> getBuildElement();

} // BuildResource
