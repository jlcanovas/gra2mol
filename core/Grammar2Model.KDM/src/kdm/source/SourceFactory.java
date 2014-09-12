/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.source.SourcePackage
 * @generated
 */
public interface SourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourceFactory eINSTANCE = kdm.source.impl.SourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref</em>'.
	 * @generated
	 */
	SourceRef createSourceRef();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	SourceRegion createSourceRegion();

	/**
	 * Returns a new object of class '<em>Inventory Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Model</em>'.
	 * @generated
	 */
	InventoryModel createInventoryModel();

	/**
	 * Returns a new object of class '<em>Inventory Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Item</em>'.
	 * @generated
	 */
	InventoryItem createInventoryItem();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	SourceFile createSourceFile();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Resource Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Description</em>'.
	 * @generated
	 */
	ResourceDescription createResourceDescription();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Inventory Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Container</em>'.
	 * @generated
	 */
	InventoryContainer createInventoryContainer();

	/**
	 * Returns a new object of class '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directory</em>'.
	 * @generated
	 */
	Directory createDirectory();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary File</em>'.
	 * @generated
	 */
	BinaryFile createBinaryFile();

	/**
	 * Returns a new object of class '<em>Executable File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable File</em>'.
	 * @generated
	 */
	ExecutableFile createExecutableFile();

	/**
	 * Returns a new object of class '<em>Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depends On</em>'.
	 * @generated
	 */
	DependsOn createDependsOn();

	/**
	 * Returns a new object of class '<em>Inventory Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Element</em>'.
	 * @generated
	 */
	InventoryElement createInventoryElement();

	/**
	 * Returns a new object of class '<em>Inventory Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Relationship</em>'.
	 * @generated
	 */
	InventoryRelationship createInventoryRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SourcePackage getSourcePackage();

} //SourceFactory
