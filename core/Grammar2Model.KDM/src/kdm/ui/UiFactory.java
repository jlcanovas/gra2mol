/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.ui.UiPackage
 * @generated
 */
public interface UiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiFactory eINSTANCE = kdm.ui.impl.UiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Resource</em>'.
	 * @generated
	 */
	UIResource createUIResource();

	/**
	 * Returns a new object of class '<em>UI Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Display</em>'.
	 * @generated
	 */
	UIDisplay createUIDisplay();

	/**
	 * Returns a new object of class '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen</em>'.
	 * @generated
	 */
	Screen createScreen();

	/**
	 * Returns a new object of class '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report</em>'.
	 * @generated
	 */
	Report createReport();

	/**
	 * Returns a new object of class '<em>UI Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Model</em>'.
	 * @generated
	 */
	UIModel createUIModel();

	/**
	 * Returns a new object of class '<em>UI Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Layout</em>'.
	 * @generated
	 */
	UILayout createUILayout();

	/**
	 * Returns a new object of class '<em>UI Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Field</em>'.
	 * @generated
	 */
	UIField createUIField();

	/**
	 * Returns a new object of class '<em>Displays Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Displays Image</em>'.
	 * @generated
	 */
	DisplaysImage createDisplaysImage();

	/**
	 * Returns a new object of class '<em>Displays</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Displays</em>'.
	 * @generated
	 */
	Displays createDisplays();

	/**
	 * Returns a new object of class '<em>UI Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Flow</em>'.
	 * @generated
	 */
	UIFlow createUIFlow();

	/**
	 * Returns a new object of class '<em>UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Element</em>'.
	 * @generated
	 */
	UIElement createUIElement();

	/**
	 * Returns a new object of class '<em>UI Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Relationship</em>'.
	 * @generated
	 */
	UIRelationship createUIRelationship();

	/**
	 * Returns a new object of class '<em>UI Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Action</em>'.
	 * @generated
	 */
	UIAction createUIAction();

	/**
	 * Returns a new object of class '<em>UI Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Event</em>'.
	 * @generated
	 */
	UIEvent createUIEvent();

	/**
	 * Returns a new object of class '<em>Reads UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reads UI</em>'.
	 * @generated
	 */
	ReadsUI createReadsUI();

	/**
	 * Returns a new object of class '<em>Writes UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writes UI</em>'.
	 * @generated
	 */
	WritesUI createWritesUI();

	/**
	 * Returns a new object of class '<em>Manages UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manages UI</em>'.
	 * @generated
	 */
	ManagesUI createManagesUI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiPackage getUiPackage();

} //UiFactory
