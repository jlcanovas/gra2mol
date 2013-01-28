/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.util;

import java.util.List;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import kdm.platform.AbstractPlatformElement;
import kdm.platform.AbstractPlatformRelationship;
import kdm.platform.BindsTo;
import kdm.platform.DataManager;
import kdm.platform.DefinedBy;
import kdm.platform.DeployedComponent;
import kdm.platform.DeployedResource;
import kdm.platform.DeployedSoftwareSystem;
import kdm.platform.ExecutionResource;
import kdm.platform.ExternalActor;
import kdm.platform.FileResource;
import kdm.platform.Loads;
import kdm.platform.LockResource;
import kdm.platform.Machine;
import kdm.platform.ManagesResource;
import kdm.platform.MarshalledResource;
import kdm.platform.MessagingResource;
import kdm.platform.NamingResource;
import kdm.platform.PlatformAction;
import kdm.platform.PlatformElement;
import kdm.platform.PlatformEvent;
import kdm.platform.PlatformModel;
import kdm.platform.PlatformPackage;
import kdm.platform.PlatformRelationship;
import kdm.platform.ReadsResource;
import kdm.platform.Requires;
import kdm.platform.ResourceType;
import kdm.platform.RuntimeResource;
import kdm.platform.Spawns;
import kdm.platform.StreamResource;
import kdm.platform.WritesResource;

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
 * @see kdm.platform.PlatformPackage
 * @generated
 */
public class PlatformSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
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
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT: {
				AbstractPlatformElement abstractPlatformElement = (AbstractPlatformElement)theEObject;
				T result = caseAbstractPlatformElement(abstractPlatformElement);
				if (result == null) result = caseKDMEntity(abstractPlatformElement);
				if (result == null) result = caseModelElement(abstractPlatformElement);
				if (result == null) result = caseElement(abstractPlatformElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_MODEL: {
				PlatformModel platformModel = (PlatformModel)theEObject;
				T result = casePlatformModel(platformModel);
				if (result == null) result = caseKDMModel(platformModel);
				if (result == null) result = caseKDMFramework(platformModel);
				if (result == null) result = caseModelElement(platformModel);
				if (result == null) result = caseElement(platformModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ABSTRACT_PLATFORM_RELATIONSHIP: {
				AbstractPlatformRelationship abstractPlatformRelationship = (AbstractPlatformRelationship)theEObject;
				T result = caseAbstractPlatformRelationship(abstractPlatformRelationship);
				if (result == null) result = caseKDMRelationship(abstractPlatformRelationship);
				if (result == null) result = caseModelElement(abstractPlatformRelationship);
				if (result == null) result = caseElement(abstractPlatformRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.REQUIRES: {
				Requires requires = (Requires)theEObject;
				T result = caseRequires(requires);
				if (result == null) result = caseAbstractPlatformRelationship(requires);
				if (result == null) result = caseKDMRelationship(requires);
				if (result == null) result = caseModelElement(requires);
				if (result == null) result = caseElement(requires);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = caseAbstractPlatformElement(resourceType);
				if (result == null) result = caseKDMEntity(resourceType);
				if (result == null) result = caseModelElement(resourceType);
				if (result == null) result = caseElement(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.NAMING_RESOURCE: {
				NamingResource namingResource = (NamingResource)theEObject;
				T result = caseNamingResource(namingResource);
				if (result == null) result = caseResourceType(namingResource);
				if (result == null) result = caseAbstractPlatformElement(namingResource);
				if (result == null) result = caseKDMEntity(namingResource);
				if (result == null) result = caseModelElement(namingResource);
				if (result == null) result = caseElement(namingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MARSHALLED_RESOURCE: {
				MarshalledResource marshalledResource = (MarshalledResource)theEObject;
				T result = caseMarshalledResource(marshalledResource);
				if (result == null) result = caseResourceType(marshalledResource);
				if (result == null) result = caseAbstractPlatformElement(marshalledResource);
				if (result == null) result = caseKDMEntity(marshalledResource);
				if (result == null) result = caseModelElement(marshalledResource);
				if (result == null) result = caseElement(marshalledResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MESSAGING_RESOURCE: {
				MessagingResource messagingResource = (MessagingResource)theEObject;
				T result = caseMessagingResource(messagingResource);
				if (result == null) result = caseResourceType(messagingResource);
				if (result == null) result = caseAbstractPlatformElement(messagingResource);
				if (result == null) result = caseKDMEntity(messagingResource);
				if (result == null) result = caseModelElement(messagingResource);
				if (result == null) result = caseElement(messagingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FILE_RESOURCE: {
				FileResource fileResource = (FileResource)theEObject;
				T result = caseFileResource(fileResource);
				if (result == null) result = caseResourceType(fileResource);
				if (result == null) result = caseAbstractPlatformElement(fileResource);
				if (result == null) result = caseKDMEntity(fileResource);
				if (result == null) result = caseModelElement(fileResource);
				if (result == null) result = caseElement(fileResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXECUTION_RESOURCE: {
				ExecutionResource executionResource = (ExecutionResource)theEObject;
				T result = caseExecutionResource(executionResource);
				if (result == null) result = caseResourceType(executionResource);
				if (result == null) result = caseAbstractPlatformElement(executionResource);
				if (result == null) result = caseKDMEntity(executionResource);
				if (result == null) result = caseModelElement(executionResource);
				if (result == null) result = caseElement(executionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_ACTION: {
				PlatformAction platformAction = (PlatformAction)theEObject;
				T result = casePlatformAction(platformAction);
				if (result == null) result = caseAbstractPlatformElement(platformAction);
				if (result == null) result = caseKDMEntity(platformAction);
				if (result == null) result = caseModelElement(platformAction);
				if (result == null) result = caseElement(platformAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXTERNAL_ACTOR: {
				ExternalActor externalActor = (ExternalActor)theEObject;
				T result = caseExternalActor(externalActor);
				if (result == null) result = casePlatformAction(externalActor);
				if (result == null) result = caseAbstractPlatformElement(externalActor);
				if (result == null) result = caseKDMEntity(externalActor);
				if (result == null) result = caseModelElement(externalActor);
				if (result == null) result = caseElement(externalActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DATA_MANAGER: {
				DataManager dataManager = (DataManager)theEObject;
				T result = caseDataManager(dataManager);
				if (result == null) result = caseResourceType(dataManager);
				if (result == null) result = caseAbstractPlatformElement(dataManager);
				if (result == null) result = caseKDMEntity(dataManager);
				if (result == null) result = caseModelElement(dataManager);
				if (result == null) result = caseElement(dataManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BINDS_TO: {
				BindsTo bindsTo = (BindsTo)theEObject;
				T result = caseBindsTo(bindsTo);
				if (result == null) result = caseAbstractPlatformRelationship(bindsTo);
				if (result == null) result = caseKDMRelationship(bindsTo);
				if (result == null) result = caseModelElement(bindsTo);
				if (result == null) result = caseElement(bindsTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_ELEMENT: {
				PlatformElement platformElement = (PlatformElement)theEObject;
				T result = casePlatformElement(platformElement);
				if (result == null) result = caseAbstractPlatformElement(platformElement);
				if (result == null) result = caseKDMEntity(platformElement);
				if (result == null) result = caseModelElement(platformElement);
				if (result == null) result = caseElement(platformElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_RELATIONSHIP: {
				PlatformRelationship platformRelationship = (PlatformRelationship)theEObject;
				T result = casePlatformRelationship(platformRelationship);
				if (result == null) result = caseAbstractPlatformRelationship(platformRelationship);
				if (result == null) result = caseKDMRelationship(platformRelationship);
				if (result == null) result = caseModelElement(platformRelationship);
				if (result == null) result = caseElement(platformRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_EVENT: {
				PlatformEvent platformEvent = (PlatformEvent)theEObject;
				T result = casePlatformEvent(platformEvent);
				if (result == null) result = caseAbstractPlatformElement(platformEvent);
				if (result == null) result = caseKDMEntity(platformEvent);
				if (result == null) result = caseModelElement(platformEvent);
				if (result == null) result = caseElement(platformEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LOCK_RESOURCE: {
				LockResource lockResource = (LockResource)theEObject;
				T result = caseLockResource(lockResource);
				if (result == null) result = caseResourceType(lockResource);
				if (result == null) result = caseAbstractPlatformElement(lockResource);
				if (result == null) result = caseKDMEntity(lockResource);
				if (result == null) result = caseModelElement(lockResource);
				if (result == null) result = caseElement(lockResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM: {
				DeployedSoftwareSystem deployedSoftwareSystem = (DeployedSoftwareSystem)theEObject;
				T result = caseDeployedSoftwareSystem(deployedSoftwareSystem);
				if (result == null) result = caseAbstractPlatformElement(deployedSoftwareSystem);
				if (result == null) result = caseKDMEntity(deployedSoftwareSystem);
				if (result == null) result = caseModelElement(deployedSoftwareSystem);
				if (result == null) result = caseElement(deployedSoftwareSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseAbstractPlatformElement(machine);
				if (result == null) result = caseKDMEntity(machine);
				if (result == null) result = caseModelElement(machine);
				if (result == null) result = caseElement(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DEPLOYED_COMPONENT: {
				DeployedComponent deployedComponent = (DeployedComponent)theEObject;
				T result = caseDeployedComponent(deployedComponent);
				if (result == null) result = caseAbstractPlatformElement(deployedComponent);
				if (result == null) result = caseKDMEntity(deployedComponent);
				if (result == null) result = caseModelElement(deployedComponent);
				if (result == null) result = caseElement(deployedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DEPLOYED_RESOURCE: {
				DeployedResource deployedResource = (DeployedResource)theEObject;
				T result = caseDeployedResource(deployedResource);
				if (result == null) result = caseAbstractPlatformElement(deployedResource);
				if (result == null) result = caseKDMEntity(deployedResource);
				if (result == null) result = caseModelElement(deployedResource);
				if (result == null) result = caseElement(deployedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LOADS: {
				Loads loads = (Loads)theEObject;
				T result = caseLoads(loads);
				if (result == null) result = caseAbstractPlatformRelationship(loads);
				if (result == null) result = caseKDMRelationship(loads);
				if (result == null) result = caseModelElement(loads);
				if (result == null) result = caseElement(loads);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SPAWNS: {
				Spawns spawns = (Spawns)theEObject;
				T result = caseSpawns(spawns);
				if (result == null) result = caseAbstractPlatformRelationship(spawns);
				if (result == null) result = caseKDMRelationship(spawns);
				if (result == null) result = caseModelElement(spawns);
				if (result == null) result = caseElement(spawns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RUNTIME_RESOURCE: {
				RuntimeResource runtimeResource = (RuntimeResource)theEObject;
				T result = caseRuntimeResource(runtimeResource);
				if (result == null) result = caseResourceType(runtimeResource);
				if (result == null) result = caseAbstractPlatformElement(runtimeResource);
				if (result == null) result = caseKDMEntity(runtimeResource);
				if (result == null) result = caseModelElement(runtimeResource);
				if (result == null) result = caseElement(runtimeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.THREAD: {
				kdm.platform.Thread thread = (kdm.platform.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = caseRuntimeResource(thread);
				if (result == null) result = caseResourceType(thread);
				if (result == null) result = caseAbstractPlatformElement(thread);
				if (result == null) result = caseKDMEntity(thread);
				if (result == null) result = caseModelElement(thread);
				if (result == null) result = caseElement(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PROCESS: {
				kdm.platform.Process process = (kdm.platform.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseRuntimeResource(process);
				if (result == null) result = caseResourceType(process);
				if (result == null) result = caseAbstractPlatformElement(process);
				if (result == null) result = caseKDMEntity(process);
				if (result == null) result = caseModelElement(process);
				if (result == null) result = caseElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.READS_RESOURCE: {
				ReadsResource readsResource = (ReadsResource)theEObject;
				T result = caseReadsResource(readsResource);
				if (result == null) result = caseAbstractActionRelationship(readsResource);
				if (result == null) result = caseKDMRelationship(readsResource);
				if (result == null) result = caseModelElement(readsResource);
				if (result == null) result = caseElement(readsResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.WRITES_RESOURCE: {
				WritesResource writesResource = (WritesResource)theEObject;
				T result = caseWritesResource(writesResource);
				if (result == null) result = caseAbstractActionRelationship(writesResource);
				if (result == null) result = caseKDMRelationship(writesResource);
				if (result == null) result = caseModelElement(writesResource);
				if (result == null) result = caseElement(writesResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MANAGES_RESOURCE: {
				ManagesResource managesResource = (ManagesResource)theEObject;
				T result = caseManagesResource(managesResource);
				if (result == null) result = caseAbstractActionRelationship(managesResource);
				if (result == null) result = caseKDMRelationship(managesResource);
				if (result == null) result = caseModelElement(managesResource);
				if (result == null) result = caseElement(managesResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DEFINED_BY: {
				DefinedBy definedBy = (DefinedBy)theEObject;
				T result = caseDefinedBy(definedBy);
				if (result == null) result = caseAbstractActionRelationship(definedBy);
				if (result == null) result = caseKDMRelationship(definedBy);
				if (result == null) result = caseModelElement(definedBy);
				if (result == null) result = caseElement(definedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STREAM_RESOURCE: {
				StreamResource streamResource = (StreamResource)theEObject;
				T result = caseStreamResource(streamResource);
				if (result == null) result = caseResourceType(streamResource);
				if (result == null) result = caseAbstractPlatformElement(streamResource);
				if (result == null) result = caseKDMEntity(streamResource);
				if (result == null) result = caseModelElement(streamResource);
				if (result == null) result = caseElement(streamResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Platform Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Platform Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPlatformElement(AbstractPlatformElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformModel(PlatformModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Platform Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Platform Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPlatformRelationship(AbstractPlatformRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequires(Requires object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingResource(NamingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marshalled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marshalled Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarshalledResource(MarshalledResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messaging Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messaging Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagingResource(MessagingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileResource(FileResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionResource(ExecutionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformAction(PlatformAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalActor(ExternalActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataManager(DataManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binds To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binds To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindsTo(BindsTo object) {
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
	public T casePlatformElement(PlatformElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformRelationship(PlatformRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformEvent(PlatformEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lock Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockResource(LockResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Software System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Software System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedSoftwareSystem(DeployedSoftwareSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedComponent(DeployedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedResource(DeployedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loads</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loads</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoads(Loads object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spawns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spawns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpawns(Spawns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeResource(RuntimeResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThread(kdm.platform.Thread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(kdm.platform.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadsResource(ReadsResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writes Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writes Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritesResource(WritesResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manages Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manages Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagesResource(ManagesResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedBy(DefinedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamResource(StreamResource object) {
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

} //PlatformSwitch
