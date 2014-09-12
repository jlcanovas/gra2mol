/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui.util;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import kdm.ui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kdm.ui.UiPackage
 * @generated
 */
public class UiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSwitch<Adapter> modelSwitch =
		new UiSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractUIElement(AbstractUIElement object) {
				return createAbstractUIElementAdapter();
			}
			@Override
			public Adapter caseUIResource(UIResource object) {
				return createUIResourceAdapter();
			}
			@Override
			public Adapter caseUIDisplay(UIDisplay object) {
				return createUIDisplayAdapter();
			}
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseReport(Report object) {
				return createReportAdapter();
			}
			@Override
			public Adapter caseUIModel(UIModel object) {
				return createUIModelAdapter();
			}
			@Override
			public Adapter caseAbstractUIRelationship(AbstractUIRelationship object) {
				return createAbstractUIRelationshipAdapter();
			}
			@Override
			public Adapter caseUILayout(UILayout object) {
				return createUILayoutAdapter();
			}
			@Override
			public Adapter caseUIField(UIField object) {
				return createUIFieldAdapter();
			}
			@Override
			public Adapter caseDisplaysImage(DisplaysImage object) {
				return createDisplaysImageAdapter();
			}
			@Override
			public Adapter caseDisplays(Displays object) {
				return createDisplaysAdapter();
			}
			@Override
			public Adapter caseUIFlow(UIFlow object) {
				return createUIFlowAdapter();
			}
			@Override
			public Adapter caseUIElement(UIElement object) {
				return createUIElementAdapter();
			}
			@Override
			public Adapter caseUIRelationship(UIRelationship object) {
				return createUIRelationshipAdapter();
			}
			@Override
			public Adapter caseUIAction(UIAction object) {
				return createUIActionAdapter();
			}
			@Override
			public Adapter caseUIEvent(UIEvent object) {
				return createUIEventAdapter();
			}
			@Override
			public Adapter caseReadsUI(ReadsUI object) {
				return createReadsUIAdapter();
			}
			@Override
			public Adapter caseWritesUI(WritesUI object) {
				return createWritesUIAdapter();
			}
			@Override
			public Adapter caseManagesUI(ManagesUI object) {
				return createManagesUIAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMEntity(KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseKDMFramework(KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.AbstractUIElement <em>Abstract UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.AbstractUIElement
	 * @generated
	 */
	public Adapter createAbstractUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIResource <em>UI Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIResource
	 * @generated
	 */
	public Adapter createUIResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIDisplay <em>UI Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIDisplay
	 * @generated
	 */
	public Adapter createUIDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIModel <em>UI Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIModel
	 * @generated
	 */
	public Adapter createUIModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.AbstractUIRelationship <em>Abstract UI Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.AbstractUIRelationship
	 * @generated
	 */
	public Adapter createAbstractUIRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UILayout <em>UI Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UILayout
	 * @generated
	 */
	public Adapter createUILayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIField <em>UI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIField
	 * @generated
	 */
	public Adapter createUIFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.DisplaysImage <em>Displays Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.DisplaysImage
	 * @generated
	 */
	public Adapter createDisplaysImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.Displays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.Displays
	 * @generated
	 */
	public Adapter createDisplaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIFlow <em>UI Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIFlow
	 * @generated
	 */
	public Adapter createUIFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIElement
	 * @generated
	 */
	public Adapter createUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIRelationship <em>UI Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIRelationship
	 * @generated
	 */
	public Adapter createUIRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIAction <em>UI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIAction
	 * @generated
	 */
	public Adapter createUIActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.UIEvent <em>UI Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.UIEvent
	 * @generated
	 */
	public Adapter createUIEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.ReadsUI <em>Reads UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.ReadsUI
	 * @generated
	 */
	public Adapter createReadsUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.WritesUI <em>Writes UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.WritesUI
	 * @generated
	 */
	public Adapter createWritesUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.ui.ManagesUI <em>Manages UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.ui.ManagesUI
	 * @generated
	 */
	public Adapter createManagesUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.KDMEntity
	 * @generated
	 */
	public Adapter createKDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.action.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiAdapterFactory
