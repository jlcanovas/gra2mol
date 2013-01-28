/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;

import kdm.core.KDMEntity;

import kdm.source.SourceRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.code.AbstractCodeElement#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.code.AbstractCodeElement#getComment <em>Comment</em>}</li>
 *   <li>{@link kdm.code.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.code.CodePackage#getAbstractCodeElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractCodeElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see kdm.code.CodePackage#getAbstractCodeElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.CommentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see kdm.code.CodePackage#getAbstractCodeElement_Comment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CommentUnit> getComment();

	/**
	 * Returns the value of the '<em><b>Code Relation</b></em>' containment reference list.
	 * The list contents are of type {@link kdm.code.AbstractCodeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Relation</em>' containment reference list.
	 * @see kdm.code.CodePackage#getAbstractCodeElement_CodeRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractCodeRelationship> getCodeRelation();

} // AbstractCodeElement
