/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source.impl;

import kdm.source.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceFactoryImpl extends EFactoryImpl implements SourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceFactory init() {
		try {
			SourceFactory theSourceFactory = (SourceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/source"); 
			if (theSourceFactory != null) {
				return theSourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SourcePackage.SOURCE_REF: return createSourceRef();
			case SourcePackage.SOURCE_REGION: return createSourceRegion();
			case SourcePackage.INVENTORY_MODEL: return createInventoryModel();
			case SourcePackage.INVENTORY_ITEM: return createInventoryItem();
			case SourcePackage.SOURCE_FILE: return createSourceFile();
			case SourcePackage.IMAGE: return createImage();
			case SourcePackage.RESOURCE_DESCRIPTION: return createResourceDescription();
			case SourcePackage.CONFIGURATION: return createConfiguration();
			case SourcePackage.INVENTORY_CONTAINER: return createInventoryContainer();
			case SourcePackage.DIRECTORY: return createDirectory();
			case SourcePackage.PROJECT: return createProject();
			case SourcePackage.BINARY_FILE: return createBinaryFile();
			case SourcePackage.EXECUTABLE_FILE: return createExecutableFile();
			case SourcePackage.DEPENDS_ON: return createDependsOn();
			case SourcePackage.INVENTORY_ELEMENT: return createInventoryElement();
			case SourcePackage.INVENTORY_RELATIONSHIP: return createInventoryRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRef createSourceRef() {
		SourceRefImpl sourceRef = new SourceRefImpl();
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRegion createSourceRegion() {
		SourceRegionImpl sourceRegion = new SourceRegionImpl();
		return sourceRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryModel createInventoryModel() {
		InventoryModelImpl inventoryModel = new InventoryModelImpl();
		return inventoryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem createInventoryItem() {
		InventoryItemImpl inventoryItem = new InventoryItemImpl();
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescription createResourceDescription() {
		ResourceDescriptionImpl resourceDescription = new ResourceDescriptionImpl();
		return resourceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryContainer createInventoryContainer() {
		InventoryContainerImpl inventoryContainer = new InventoryContainerImpl();
		return inventoryContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFile createBinaryFile() {
		BinaryFileImpl binaryFile = new BinaryFileImpl();
		return binaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableFile createExecutableFile() {
		ExecutableFileImpl executableFile = new ExecutableFileImpl();
		return executableFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsOn createDependsOn() {
		DependsOnImpl dependsOn = new DependsOnImpl();
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryElement createInventoryElement() {
		InventoryElementImpl inventoryElement = new InventoryElementImpl();
		return inventoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryRelationship createInventoryRelationship() {
		InventoryRelationshipImpl inventoryRelationship = new InventoryRelationshipImpl();
		return inventoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePackage getSourcePackage() {
		return (SourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SourcePackage getPackage() {
		return SourcePackage.eINSTANCE;
	}

} //SourceFactoryImpl
