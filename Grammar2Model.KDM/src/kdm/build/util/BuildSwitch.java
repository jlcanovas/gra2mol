/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.build.util;

import java.util.List;

import kdm.build.*;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

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
 * @see kdm.build.BuildPackage
 * @generated
 */
public class BuildSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuildPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildSwitch() {
		if (modelPackage == null) {
			modelPackage = BuildPackage.eINSTANCE;
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
			case BuildPackage.ABSTRACT_BUILD_ELEMENT: {
				AbstractBuildElement abstractBuildElement = (AbstractBuildElement)theEObject;
				T result = caseAbstractBuildElement(abstractBuildElement);
				if (result == null) result = caseKDMEntity(abstractBuildElement);
				if (result == null) result = caseModelElement(abstractBuildElement);
				if (result == null) result = caseElement(abstractBuildElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_RESOURCE: {
				BuildResource buildResource = (BuildResource)theEObject;
				T result = caseBuildResource(buildResource);
				if (result == null) result = caseAbstractBuildElement(buildResource);
				if (result == null) result = caseKDMEntity(buildResource);
				if (result == null) result = caseModelElement(buildResource);
				if (result == null) result = caseElement(buildResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_DESCRIPTION: {
				BuildDescription buildDescription = (BuildDescription)theEObject;
				T result = caseBuildDescription(buildDescription);
				if (result == null) result = caseBuildResource(buildDescription);
				if (result == null) result = caseAbstractBuildElement(buildDescription);
				if (result == null) result = caseKDMEntity(buildDescription);
				if (result == null) result = caseModelElement(buildDescription);
				if (result == null) result = caseElement(buildDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.SYMBOLIC_LINK: {
				SymbolicLink symbolicLink = (SymbolicLink)theEObject;
				T result = caseSymbolicLink(symbolicLink);
				if (result == null) result = caseAbstractBuildElement(symbolicLink);
				if (result == null) result = caseKDMEntity(symbolicLink);
				if (result == null) result = caseModelElement(symbolicLink);
				if (result == null) result = caseElement(symbolicLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.ABSTRACT_BUILD_RELATIONSHIP: {
				AbstractBuildRelationship abstractBuildRelationship = (AbstractBuildRelationship)theEObject;
				T result = caseAbstractBuildRelationship(abstractBuildRelationship);
				if (result == null) result = caseKDMRelationship(abstractBuildRelationship);
				if (result == null) result = caseModelElement(abstractBuildRelationship);
				if (result == null) result = caseElement(abstractBuildRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.LINKS_TO: {
				LinksTo linksTo = (LinksTo)theEObject;
				T result = caseLinksTo(linksTo);
				if (result == null) result = caseAbstractBuildRelationship(linksTo);
				if (result == null) result = caseKDMRelationship(linksTo);
				if (result == null) result = caseModelElement(linksTo);
				if (result == null) result = caseElement(linksTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.CONSUMES: {
				Consumes consumes = (Consumes)theEObject;
				T result = caseConsumes(consumes);
				if (result == null) result = caseAbstractBuildRelationship(consumes);
				if (result == null) result = caseKDMRelationship(consumes);
				if (result == null) result = caseModelElement(consumes);
				if (result == null) result = caseElement(consumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_MODEL: {
				BuildModel buildModel = (BuildModel)theEObject;
				T result = caseBuildModel(buildModel);
				if (result == null) result = caseKDMModel(buildModel);
				if (result == null) result = caseKDMFramework(buildModel);
				if (result == null) result = caseModelElement(buildModel);
				if (result == null) result = caseElement(buildModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_COMPONENT: {
				BuildComponent buildComponent = (BuildComponent)theEObject;
				T result = caseBuildComponent(buildComponent);
				if (result == null) result = caseBuildResource(buildComponent);
				if (result == null) result = caseAbstractBuildElement(buildComponent);
				if (result == null) result = caseKDMEntity(buildComponent);
				if (result == null) result = caseModelElement(buildComponent);
				if (result == null) result = caseElement(buildComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.SUPPLIER: {
				Supplier supplier = (Supplier)theEObject;
				T result = caseSupplier(supplier);
				if (result == null) result = caseAbstractBuildElement(supplier);
				if (result == null) result = caseKDMEntity(supplier);
				if (result == null) result = caseModelElement(supplier);
				if (result == null) result = caseElement(supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseAbstractBuildElement(tool);
				if (result == null) result = caseKDMEntity(tool);
				if (result == null) result = caseModelElement(tool);
				if (result == null) result = caseElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_ELEMENT: {
				BuildElement buildElement = (BuildElement)theEObject;
				T result = caseBuildElement(buildElement);
				if (result == null) result = caseAbstractBuildElement(buildElement);
				if (result == null) result = caseKDMEntity(buildElement);
				if (result == null) result = caseModelElement(buildElement);
				if (result == null) result = caseElement(buildElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_RELATIONSHIP: {
				BuildRelationship buildRelationship = (BuildRelationship)theEObject;
				T result = caseBuildRelationship(buildRelationship);
				if (result == null) result = caseAbstractBuildRelationship(buildRelationship);
				if (result == null) result = caseKDMRelationship(buildRelationship);
				if (result == null) result = caseModelElement(buildRelationship);
				if (result == null) result = caseElement(buildRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.SUPPLIED_BY: {
				SuppliedBy suppliedBy = (SuppliedBy)theEObject;
				T result = caseSuppliedBy(suppliedBy);
				if (result == null) result = caseAbstractBuildRelationship(suppliedBy);
				if (result == null) result = caseKDMRelationship(suppliedBy);
				if (result == null) result = caseModelElement(suppliedBy);
				if (result == null) result = caseElement(suppliedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseBuildResource(library);
				if (result == null) result = caseAbstractBuildElement(library);
				if (result == null) result = caseKDMEntity(library);
				if (result == null) result = caseModelElement(library);
				if (result == null) result = caseElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_STEP: {
				BuildStep buildStep = (BuildStep)theEObject;
				T result = caseBuildStep(buildStep);
				if (result == null) result = caseBuildResource(buildStep);
				if (result == null) result = caseAbstractBuildElement(buildStep);
				if (result == null) result = caseKDMEntity(buildStep);
				if (result == null) result = caseModelElement(buildStep);
				if (result == null) result = caseElement(buildStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.PRODUCES: {
				Produces produces = (Produces)theEObject;
				T result = caseProduces(produces);
				if (result == null) result = caseAbstractBuildRelationship(produces);
				if (result == null) result = caseKDMRelationship(produces);
				if (result == null) result = caseModelElement(produces);
				if (result == null) result = caseElement(produces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.SUPPORTED_BY: {
				SupportedBy supportedBy = (SupportedBy)theEObject;
				T result = caseSupportedBy(supportedBy);
				if (result == null) result = caseAbstractBuildRelationship(supportedBy);
				if (result == null) result = caseKDMRelationship(supportedBy);
				if (result == null) result = caseModelElement(supportedBy);
				if (result == null) result = caseElement(supportedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.BUILD_PRODUCT: {
				BuildProduct buildProduct = (BuildProduct)theEObject;
				T result = caseBuildProduct(buildProduct);
				if (result == null) result = caseBuildResource(buildProduct);
				if (result == null) result = caseAbstractBuildElement(buildProduct);
				if (result == null) result = caseKDMEntity(buildProduct);
				if (result == null) result = caseModelElement(buildProduct);
				if (result == null) result = caseElement(buildProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildPackage.DESCRIBED_BY: {
				DescribedBy describedBy = (DescribedBy)theEObject;
				T result = caseDescribedBy(describedBy);
				if (result == null) result = caseAbstractBuildRelationship(describedBy);
				if (result == null) result = caseKDMRelationship(describedBy);
				if (result == null) result = caseModelElement(describedBy);
				if (result == null) result = caseElement(describedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Build Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Build Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBuildElement(AbstractBuildElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildResource(BuildResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildDescription(BuildDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicLink(SymbolicLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Build Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Build Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBuildRelationship(AbstractBuildRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinksTo(LinksTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumes(Consumes object) {
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
	public T caseBuildModel(BuildModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildComponent(BuildComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplier(Supplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
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
	public T caseBuildElement(BuildElement object) {
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
	public T caseBuildRelationship(BuildRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplied By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplied By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuppliedBy(SuppliedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildStep(BuildStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduces(Produces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedBy(SupportedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildProduct(BuildProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedBy(DescribedBy object) {
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

} //BuildSwitch
