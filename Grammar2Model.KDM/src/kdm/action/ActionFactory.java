/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionFactory eINSTANCE = kdm.action.impl.ActionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	ActionElement createActionElement();

	/**
	 * Returns a new object of class '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow</em>'.
	 * @generated
	 */
	ControlFlow createControlFlow();

	/**
	 * Returns a new object of class '<em>Calls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calls</em>'.
	 * @generated
	 */
	Calls createCalls();

	/**
	 * Returns a new object of class '<em>Creates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creates</em>'.
	 * @generated
	 */
	Creates createCreates();

	/**
	 * Returns a new object of class '<em>Reads</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reads</em>'.
	 * @generated
	 */
	Reads createReads();

	/**
	 * Returns a new object of class '<em>Writes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writes</em>'.
	 * @generated
	 */
	Writes createWrites();

	/**
	 * Returns a new object of class '<em>Complies To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complies To</em>'.
	 * @generated
	 */
	CompliesTo createCompliesTo();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>True Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Flow</em>'.
	 * @generated
	 */
	TrueFlow createTrueFlow();

	/**
	 * Returns a new object of class '<em>False Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False Flow</em>'.
	 * @generated
	 */
	FalseFlow createFalseFlow();

	/**
	 * Returns a new object of class '<em>Guarded Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded Flow</em>'.
	 * @generated
	 */
	GuardedFlow createGuardedFlow();

	/**
	 * Returns a new object of class '<em>Uses Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Type</em>'.
	 * @generated
	 */
	UsesType createUsesType();

	/**
	 * Returns a new object of class '<em>Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addresses</em>'.
	 * @generated
	 */
	Addresses createAddresses();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	ActionRelationship createActionRelationship();

	/**
	 * Returns a new object of class '<em>Throws</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throws</em>'.
	 * @generated
	 */
	Throws createThrows();

	/**
	 * Returns a new object of class '<em>Dispatches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatches</em>'.
	 * @generated
	 */
	Dispatches createDispatches();

	/**
	 * Returns a new object of class '<em>Entry Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Flow</em>'.
	 * @generated
	 */
	EntryFlow createEntryFlow();

	/**
	 * Returns a new object of class '<em>Block Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Unit</em>'.
	 * @generated
	 */
	BlockUnit createBlockUnit();

	/**
	 * Returns a new object of class '<em>Exception Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Unit</em>'.
	 * @generated
	 */
	ExceptionUnit createExceptionUnit();

	/**
	 * Returns a new object of class '<em>Try Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Unit</em>'.
	 * @generated
	 */
	TryUnit createTryUnit();

	/**
	 * Returns a new object of class '<em>Finally Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finally Unit</em>'.
	 * @generated
	 */
	FinallyUnit createFinallyUnit();

	/**
	 * Returns a new object of class '<em>Catch Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Unit</em>'.
	 * @generated
	 */
	CatchUnit createCatchUnit();

	/**
	 * Returns a new object of class '<em>Exit Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Flow</em>'.
	 * @generated
	 */
	ExitFlow createExitFlow();

	/**
	 * Returns a new object of class '<em>Exception Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Flow</em>'.
	 * @generated
	 */
	ExceptionFlow createExceptionFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionPackage getActionPackage();

} //ActionFactory
