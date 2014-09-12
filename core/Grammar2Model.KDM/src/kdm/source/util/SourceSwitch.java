/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source.util;

import java.util.List;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import kdm.source.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kdm.source.SourcePackage
 * @generated
 */
public class SourceSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SourcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceSwitch() {
		if (modelPackage == null) {
			modelPackage = SourcePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SourcePackage.SOURCE_REF: {
				SourceRef sourceRef = (SourceRef)theEObject;
				T result = caseSourceRef(sourceRef);
				if (result == null) result = caseElement(sourceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.SOURCE_REGION: {
				SourceRegion sourceRegion = (SourceRegion)theEObject;
				T result = caseSourceRegion(sourceRegion);
				if (result == null) result = caseElement(sourceRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.INVENTORY_MODEL: {
				InventoryModel inventoryModel = (InventoryModel)theEObject;
				T result = caseInventoryModel(inventoryModel);
				if (result == null) result = caseKDMModel(inventoryModel);
				if (result == null) result = caseKDMFramework(inventoryModel);
				if (result == null) result = caseModelElement(inventoryModel);
				if (result == null) result = caseElement(inventoryModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT: {
				AbstractInventoryElement abstractInventoryElement = (AbstractInventoryElement)theEObject;
				T result = caseAbstractInventoryElement(abstractInventoryElement);
				if (result == null) result = caseKDMEntity(abstractInventoryElement);
				if (result == null) result = caseModelElement(abstractInventoryElement);
				if (result == null) result = caseElement(abstractInventoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.INVENTORY_ITEM: {
				InventoryItem inventoryItem = (InventoryItem)theEObject;
				T result = caseInventoryItem(inventoryItem);
				if (result == null) result = caseAbstractInventoryElement(inventoryItem);
				if (result == null) result = caseKDMEntity(inventoryItem);
				if (result == null) result = caseModelElement(inventoryItem);
				if (result == null) result = caseElement(inventoryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = caseInventoryItem(sourceFile);
				if (result == null) result = caseAbstractInventoryElement(sourceFile);
				if (result == null) result = caseKDMEntity(sourceFile);
				if (result == null) result = caseModelElement(sourceFile);
				if (result == null) result = caseElement(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseInventoryItem(image);
				if (result == null) result = caseAbstractInventoryElement(image);
				if (result == null) result = caseKDMEntity(image);
				if (result == null) result = caseModelElement(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.RESOURCE_DESCRIPTION: {
				ResourceDescription resourceDescription = (ResourceDescription)theEObject;
				T result = caseResourceDescription(resourceDescription);
				if (result == null) result = caseInventoryItem(resourceDescription);
				if (result == null) result = caseAbstractInventoryElement(resourceDescription);
				if (result == null) result = caseKDMEntity(resourceDescription);
				if (result == null) result = caseModelElement(resourceDescription);
				if (result == null) result = caseElement(resourceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseInventoryItem(configuration);
				if (result == null) result = caseAbstractInventoryElement(configuration);
				if (result == null) result = caseKDMEntity(configuration);
				if (result == null) result = caseModelElement(configuration);
				if (result == null) result = caseElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.INVENTORY_CONTAINER: {
				InventoryContainer inventoryContainer = (InventoryContainer)theEObject;
				T result = caseInventoryContainer(inventoryContainer);
				if (result == null) result = caseAbstractInventoryElement(inventoryContainer);
				if (result == null) result = caseKDMEntity(inventoryContainer);
				if (result == null) result = caseModelElement(inventoryContainer);
				if (result == null) result = caseElement(inventoryContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = caseInventoryContainer(directory);
				if (result == null) result = caseAbstractInventoryElement(directory);
				if (result == null) result = caseKDMEntity(directory);
				if (result == null) result = caseModelElement(directory);
				if (result == null) result = caseElement(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseInventoryContainer(project);
				if (result == null) result = caseAbstractInventoryElement(project);
				if (result == null) result = caseKDMEntity(project);
				if (result == null) result = caseModelElement(project);
				if (result == null) result = caseElement(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.ABSTRACT_INVENTORY_RELATIONSHIP: {
				AbstractInventoryRelationship abstractInventoryRelationship = (AbstractInventoryRelationship)theEObject;
				T result = caseAbstractInventoryRelationship(abstractInventoryRelationship);
				if (result == null) result = caseKDMRelationship(abstractInventoryRelationship);
				if (result == null) result = caseModelElement(abstractInventoryRelationship);
				if (result == null) result = caseElement(abstractInventoryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.BINARY_FILE: {
				BinaryFile binaryFile = (BinaryFile)theEObject;
				T result = caseBinaryFile(binaryFile);
				if (result == null) result = caseInventoryItem(binaryFile);
				if (result == null) result = caseAbstractInventoryElement(binaryFile);
				if (result == null) result = caseKDMEntity(binaryFile);
				if (result == null) result = caseModelElement(binaryFile);
				if (result == null) result = caseElement(binaryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.EXECUTABLE_FILE: {
				ExecutableFile executableFile = (ExecutableFile)theEObject;
				T result = caseExecutableFile(executableFile);
				if (result == null) result = caseInventoryItem(executableFile);
				if (result == null) result = caseAbstractInventoryElement(executableFile);
				if (result == null) result = caseKDMEntity(executableFile);
				if (result == null) result = caseModelElement(executableFile);
				if (result == null) result = caseElement(executableFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.DEPENDS_ON: {
				DependsOn dependsOn = (DependsOn)theEObject;
				T result = caseDependsOn(dependsOn);
				if (result == null) result = caseAbstractInventoryRelationship(dependsOn);
				if (result == null) result = caseKDMRelationship(dependsOn);
				if (result == null) result = caseModelElement(dependsOn);
				if (result == null) result = caseElement(dependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.INVENTORY_ELEMENT: {
				InventoryElement inventoryElement = (InventoryElement)theEObject;
				T result = caseInventoryElement(inventoryElement);
				if (result == null) result = caseAbstractInventoryElement(inventoryElement);
				if (result == null) result = caseKDMEntity(inventoryElement);
				if (result == null) result = caseModelElement(inventoryElement);
				if (result == null) result = caseElement(inventoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SourcePackage.INVENTORY_RELATIONSHIP: {
				InventoryRelationship inventoryRelationship = (InventoryRelationship)theEObject;
				T result = caseInventoryRelationship(inventoryRelationship);
				if (result == null) result = caseAbstractInventoryRelationship(inventoryRelationship);
				if (result == null) result = caseKDMRelationship(inventoryRelationship);
				if (result == null) result = caseModelElement(inventoryRelationship);
				if (result == null) result = caseElement(inventoryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceRef(SourceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceRegion(SourceRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryModel(InventoryModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Inventory Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Inventory Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInventoryElement(AbstractInventoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryItem(InventoryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescription(ResourceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryContainer(InventoryContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Inventory Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Inventory Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInventoryRelationship(AbstractInventoryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFile(BinaryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableFile(ExecutableFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependsOn(DependsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryElement(InventoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryRelationship(InventoryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMFramework(KDMFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMModel(KDMModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMEntity(KDMEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMRelationship(KDMRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SourceSwitch
