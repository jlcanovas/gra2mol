/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build;

import kdm.kdm.KDMModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.build.BuildModel#getBuildElement <em>Build Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.build.BuildPackage#getBuildModel()
 * @model
 * @generated
 */
public interface BuildModel extends KDMModel {
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
	 * @see kdm.build.BuildPackage#getBuildModel_BuildElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBuildElement> getBuildElement();

} // BuildModel
