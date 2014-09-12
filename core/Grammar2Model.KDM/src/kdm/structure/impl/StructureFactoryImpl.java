/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.structure.impl;

import kdm.structure.*;

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
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureFactory init() {
		try {
			StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/structure"); 
			if (theStructureFactory != null) {
				return theStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactoryImpl() {
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
			case StructurePackage.SUBSYSTEM: return createSubsystem();
			case StructurePackage.LAYER: return createLayer();
			case StructurePackage.STRUCTURE_MODEL: return createStructureModel();
			case StructurePackage.COMPONENT: return createComponent();
			case StructurePackage.SOFTWARE_SYSTEM: return createSoftwareSystem();
			case StructurePackage.STRUCTURE_RELATIONSHIP: return createStructureRelationship();
			case StructurePackage.ARCHITECTURE_VIEW: return createArchitectureView();
			case StructurePackage.STRUCTURE_ELEMENT: return createStructureElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureModel createStructureModel() {
		StructureModelImpl structureModel = new StructureModelImpl();
		return structureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem createSoftwareSystem() {
		SoftwareSystemImpl softwareSystem = new SoftwareSystemImpl();
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRelationship createStructureRelationship() {
		StructureRelationshipImpl structureRelationship = new StructureRelationshipImpl();
		return structureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureView createArchitectureView() {
		ArchitectureViewImpl architectureView = new ArchitectureViewImpl();
		return architectureView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElement createStructureElement() {
		StructureElementImpl structureElement = new StructureElementImpl();
		return structureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePackage getStructurePackage() {
		return (StructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurePackage getPackage() {
		return StructurePackage.eINSTANCE;
	}

} //StructureFactoryImpl
