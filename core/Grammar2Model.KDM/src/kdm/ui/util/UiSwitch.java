/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.ui.util;

import java.util.List;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import kdm.ui.*;

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
 * @see kdm.ui.UiPackage
 * @generated
 */
public class UiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSwitch() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
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
			case UiPackage.ABSTRACT_UI_ELEMENT: {
				AbstractUIElement abstractUIElement = (AbstractUIElement)theEObject;
				T result = caseAbstractUIElement(abstractUIElement);
				if (result == null) result = caseKDMEntity(abstractUIElement);
				if (result == null) result = caseModelElement(abstractUIElement);
				if (result == null) result = caseElement(abstractUIElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_RESOURCE: {
				UIResource uiResource = (UIResource)theEObject;
				T result = caseUIResource(uiResource);
				if (result == null) result = caseAbstractUIElement(uiResource);
				if (result == null) result = caseKDMEntity(uiResource);
				if (result == null) result = caseModelElement(uiResource);
				if (result == null) result = caseElement(uiResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_DISPLAY: {
				UIDisplay uiDisplay = (UIDisplay)theEObject;
				T result = caseUIDisplay(uiDisplay);
				if (result == null) result = caseUIResource(uiDisplay);
				if (result == null) result = caseAbstractUIElement(uiDisplay);
				if (result == null) result = caseKDMEntity(uiDisplay);
				if (result == null) result = caseModelElement(uiDisplay);
				if (result == null) result = caseElement(uiDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseUIDisplay(screen);
				if (result == null) result = caseUIResource(screen);
				if (result == null) result = caseAbstractUIElement(screen);
				if (result == null) result = caseKDMEntity(screen);
				if (result == null) result = caseModelElement(screen);
				if (result == null) result = caseElement(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.REPORT: {
				Report report = (Report)theEObject;
				T result = caseReport(report);
				if (result == null) result = caseUIDisplay(report);
				if (result == null) result = caseUIResource(report);
				if (result == null) result = caseAbstractUIElement(report);
				if (result == null) result = caseKDMEntity(report);
				if (result == null) result = caseModelElement(report);
				if (result == null) result = caseElement(report);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_MODEL: {
				UIModel uiModel = (UIModel)theEObject;
				T result = caseUIModel(uiModel);
				if (result == null) result = caseKDMModel(uiModel);
				if (result == null) result = caseKDMFramework(uiModel);
				if (result == null) result = caseModelElement(uiModel);
				if (result == null) result = caseElement(uiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.ABSTRACT_UI_RELATIONSHIP: {
				AbstractUIRelationship abstractUIRelationship = (AbstractUIRelationship)theEObject;
				T result = caseAbstractUIRelationship(abstractUIRelationship);
				if (result == null) result = caseKDMRelationship(abstractUIRelationship);
				if (result == null) result = caseModelElement(abstractUIRelationship);
				if (result == null) result = caseElement(abstractUIRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_LAYOUT: {
				UILayout uiLayout = (UILayout)theEObject;
				T result = caseUILayout(uiLayout);
				if (result == null) result = caseAbstractUIRelationship(uiLayout);
				if (result == null) result = caseKDMRelationship(uiLayout);
				if (result == null) result = caseModelElement(uiLayout);
				if (result == null) result = caseElement(uiLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_FIELD: {
				UIField uiField = (UIField)theEObject;
				T result = caseUIField(uiField);
				if (result == null) result = caseUIResource(uiField);
				if (result == null) result = caseAbstractUIElement(uiField);
				if (result == null) result = caseKDMEntity(uiField);
				if (result == null) result = caseModelElement(uiField);
				if (result == null) result = caseElement(uiField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.DISPLAYS_IMAGE: {
				DisplaysImage displaysImage = (DisplaysImage)theEObject;
				T result = caseDisplaysImage(displaysImage);
				if (result == null) result = caseAbstractUIRelationship(displaysImage);
				if (result == null) result = caseKDMRelationship(displaysImage);
				if (result == null) result = caseModelElement(displaysImage);
				if (result == null) result = caseElement(displaysImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.DISPLAYS: {
				Displays displays = (Displays)theEObject;
				T result = caseDisplays(displays);
				if (result == null) result = caseAbstractUIRelationship(displays);
				if (result == null) result = caseKDMRelationship(displays);
				if (result == null) result = caseModelElement(displays);
				if (result == null) result = caseElement(displays);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_FLOW: {
				UIFlow uiFlow = (UIFlow)theEObject;
				T result = caseUIFlow(uiFlow);
				if (result == null) result = caseAbstractUIRelationship(uiFlow);
				if (result == null) result = caseKDMRelationship(uiFlow);
				if (result == null) result = caseModelElement(uiFlow);
				if (result == null) result = caseElement(uiFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_ELEMENT: {
				UIElement uiElement = (UIElement)theEObject;
				T result = caseUIElement(uiElement);
				if (result == null) result = caseAbstractUIElement(uiElement);
				if (result == null) result = caseKDMEntity(uiElement);
				if (result == null) result = caseModelElement(uiElement);
				if (result == null) result = caseElement(uiElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_RELATIONSHIP: {
				UIRelationship uiRelationship = (UIRelationship)theEObject;
				T result = caseUIRelationship(uiRelationship);
				if (result == null) result = caseAbstractUIRelationship(uiRelationship);
				if (result == null) result = caseKDMRelationship(uiRelationship);
				if (result == null) result = caseModelElement(uiRelationship);
				if (result == null) result = caseElement(uiRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_ACTION: {
				UIAction uiAction = (UIAction)theEObject;
				T result = caseUIAction(uiAction);
				if (result == null) result = caseAbstractUIElement(uiAction);
				if (result == null) result = caseKDMEntity(uiAction);
				if (result == null) result = caseModelElement(uiAction);
				if (result == null) result = caseElement(uiAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_EVENT: {
				UIEvent uiEvent = (UIEvent)theEObject;
				T result = caseUIEvent(uiEvent);
				if (result == null) result = caseAbstractUIElement(uiEvent);
				if (result == null) result = caseKDMEntity(uiEvent);
				if (result == null) result = caseModelElement(uiEvent);
				if (result == null) result = caseElement(uiEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.READS_UI: {
				ReadsUI readsUI = (ReadsUI)theEObject;
				T result = caseReadsUI(readsUI);
				if (result == null) result = caseAbstractActionRelationship(readsUI);
				if (result == null) result = caseKDMRelationship(readsUI);
				if (result == null) result = caseModelElement(readsUI);
				if (result == null) result = caseElement(readsUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.WRITES_UI: {
				WritesUI writesUI = (WritesUI)theEObject;
				T result = caseWritesUI(writesUI);
				if (result == null) result = caseAbstractActionRelationship(writesUI);
				if (result == null) result = caseKDMRelationship(writesUI);
				if (result == null) result = caseModelElement(writesUI);
				if (result == null) result = caseElement(writesUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.MANAGES_UI: {
				ManagesUI managesUI = (ManagesUI)theEObject;
				T result = caseManagesUI(managesUI);
				if (result == null) result = caseAbstractActionRelationship(managesUI);
				if (result == null) result = caseKDMRelationship(managesUI);
				if (result == null) result = caseModelElement(managesUI);
				if (result == null) result = caseElement(managesUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractUIElement(AbstractUIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIResource(UIResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDisplay(UIDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReport(Report object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIModel(UIModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract UI Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract UI Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractUIRelationship(AbstractUIRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUILayout(UILayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIField(UIField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displays Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displays Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplaysImage(DisplaysImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displays</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displays</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplays(Displays object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIFlow(UIFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElement(UIElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIRelationship(UIRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAction(UIAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIEvent(UIEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadsUI(ReadsUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writes UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writes UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritesUI(WritesUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manages UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manages UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagesUI(ManagesUI object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActionRelationship(AbstractActionRelationship object) {
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

} //UiSwitch
