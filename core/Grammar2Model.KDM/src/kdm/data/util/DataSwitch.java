/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data.util;

import java.util.List;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.data.*;

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
 * @see kdm.data.DataPackage
 * @generated
 */
public class DataSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
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
			case DataPackage.DATA_MODEL: {
				DataModel dataModel = (DataModel)theEObject;
				T result = caseDataModel(dataModel);
				if (result == null) result = caseKDMModel(dataModel);
				if (result == null) result = caseKDMFramework(dataModel);
				if (result == null) result = caseModelElement(dataModel);
				if (result == null) result = caseElement(dataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ABSTRACT_DATA_ELEMENT: {
				AbstractDataElement abstractDataElement = (AbstractDataElement)theEObject;
				T result = caseAbstractDataElement(abstractDataElement);
				if (result == null) result = caseKDMEntity(abstractDataElement);
				if (result == null) result = caseModelElement(abstractDataElement);
				if (result == null) result = caseElement(abstractDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_RESOURCE: {
				DataResource dataResource = (DataResource)theEObject;
				T result = caseDataResource(dataResource);
				if (result == null) result = caseAbstractDataElement(dataResource);
				if (result == null) result = caseKDMEntity(dataResource);
				if (result == null) result = caseModelElement(dataResource);
				if (result == null) result = caseElement(dataResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INDEX_ELEMENT: {
				IndexElement indexElement = (IndexElement)theEObject;
				T result = caseIndexElement(indexElement);
				if (result == null) result = caseDataResource(indexElement);
				if (result == null) result = caseAbstractDataElement(indexElement);
				if (result == null) result = caseKDMEntity(indexElement);
				if (result == null) result = caseModelElement(indexElement);
				if (result == null) result = caseElement(indexElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.UNIQUE_KEY: {
				UniqueKey uniqueKey = (UniqueKey)theEObject;
				T result = caseUniqueKey(uniqueKey);
				if (result == null) result = caseIndexElement(uniqueKey);
				if (result == null) result = caseDataResource(uniqueKey);
				if (result == null) result = caseAbstractDataElement(uniqueKey);
				if (result == null) result = caseKDMEntity(uniqueKey);
				if (result == null) result = caseModelElement(uniqueKey);
				if (result == null) result = caseElement(uniqueKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = caseIndexElement(index);
				if (result == null) result = caseDataResource(index);
				if (result == null) result = caseAbstractDataElement(index);
				if (result == null) result = caseKDMEntity(index);
				if (result == null) result = caseModelElement(index);
				if (result == null) result = caseElement(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ABSTRACT_DATA_RELATIONSHIP: {
				AbstractDataRelationship abstractDataRelationship = (AbstractDataRelationship)theEObject;
				T result = caseAbstractDataRelationship(abstractDataRelationship);
				if (result == null) result = caseKDMRelationship(abstractDataRelationship);
				if (result == null) result = caseModelElement(abstractDataRelationship);
				if (result == null) result = caseElement(abstractDataRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.KEY_RELATION: {
				KeyRelation keyRelation = (KeyRelation)theEObject;
				T result = caseKeyRelation(keyRelation);
				if (result == null) result = caseAbstractDataRelationship(keyRelation);
				if (result == null) result = caseKDMRelationship(keyRelation);
				if (result == null) result = caseModelElement(keyRelation);
				if (result == null) result = caseElement(keyRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.REFERENCE_KEY: {
				ReferenceKey referenceKey = (ReferenceKey)theEObject;
				T result = caseReferenceKey(referenceKey);
				if (result == null) result = caseIndexElement(referenceKey);
				if (result == null) result = caseDataResource(referenceKey);
				if (result == null) result = caseAbstractDataElement(referenceKey);
				if (result == null) result = caseKDMEntity(referenceKey);
				if (result == null) result = caseModelElement(referenceKey);
				if (result == null) result = caseElement(referenceKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_CONTAINER: {
				DataContainer dataContainer = (DataContainer)theEObject;
				T result = caseDataContainer(dataContainer);
				if (result == null) result = caseDataResource(dataContainer);
				if (result == null) result = caseAbstractDataElement(dataContainer);
				if (result == null) result = caseKDMEntity(dataContainer);
				if (result == null) result = caseModelElement(dataContainer);
				if (result == null) result = caseElement(dataContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CATALOG: {
				Catalog catalog = (Catalog)theEObject;
				T result = caseCatalog(catalog);
				if (result == null) result = caseDataContainer(catalog);
				if (result == null) result = caseDataResource(catalog);
				if (result == null) result = caseAbstractDataElement(catalog);
				if (result == null) result = caseKDMEntity(catalog);
				if (result == null) result = caseModelElement(catalog);
				if (result == null) result = caseElement(catalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RELATIONAL_SCHEMA: {
				RelationalSchema relationalSchema = (RelationalSchema)theEObject;
				T result = caseRelationalSchema(relationalSchema);
				if (result == null) result = caseDataContainer(relationalSchema);
				if (result == null) result = caseDataResource(relationalSchema);
				if (result == null) result = caseAbstractDataElement(relationalSchema);
				if (result == null) result = caseKDMEntity(relationalSchema);
				if (result == null) result = caseModelElement(relationalSchema);
				if (result == null) result = caseElement(relationalSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.COLUMN_SET: {
				ColumnSet columnSet = (ColumnSet)theEObject;
				T result = caseColumnSet(columnSet);
				if (result == null) result = caseDataContainer(columnSet);
				if (result == null) result = caseDataResource(columnSet);
				if (result == null) result = caseAbstractDataElement(columnSet);
				if (result == null) result = caseKDMEntity(columnSet);
				if (result == null) result = caseModelElement(columnSet);
				if (result == null) result = caseElement(columnSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RELATIONAL_TABLE: {
				RelationalTable relationalTable = (RelationalTable)theEObject;
				T result = caseRelationalTable(relationalTable);
				if (result == null) result = caseColumnSet(relationalTable);
				if (result == null) result = caseDataContainer(relationalTable);
				if (result == null) result = caseDataResource(relationalTable);
				if (result == null) result = caseAbstractDataElement(relationalTable);
				if (result == null) result = caseKDMEntity(relationalTable);
				if (result == null) result = caseModelElement(relationalTable);
				if (result == null) result = caseElement(relationalTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RELATIONAL_VIEW: {
				RelationalView relationalView = (RelationalView)theEObject;
				T result = caseRelationalView(relationalView);
				if (result == null) result = caseColumnSet(relationalView);
				if (result == null) result = caseDataContainer(relationalView);
				if (result == null) result = caseDataResource(relationalView);
				if (result == null) result = caseAbstractDataElement(relationalView);
				if (result == null) result = caseKDMEntity(relationalView);
				if (result == null) result = caseModelElement(relationalView);
				if (result == null) result = caseElement(relationalView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RECORD_FILE: {
				RecordFile recordFile = (RecordFile)theEObject;
				T result = caseRecordFile(recordFile);
				if (result == null) result = caseColumnSet(recordFile);
				if (result == null) result = caseDataContainer(recordFile);
				if (result == null) result = caseDataResource(recordFile);
				if (result == null) result = caseAbstractDataElement(recordFile);
				if (result == null) result = caseKDMEntity(recordFile);
				if (result == null) result = caseModelElement(recordFile);
				if (result == null) result = caseElement(recordFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_EVENT: {
				DataEvent dataEvent = (DataEvent)theEObject;
				T result = caseDataEvent(dataEvent);
				if (result == null) result = caseDataResource(dataEvent);
				if (result == null) result = caseAbstractDataElement(dataEvent);
				if (result == null) result = caseKDMEntity(dataEvent);
				if (result == null) result = caseModelElement(dataEvent);
				if (result == null) result = caseElement(dataEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.XML_SCHEMA: {
				XMLSchema xmlSchema = (XMLSchema)theEObject;
				T result = caseXMLSchema(xmlSchema);
				if (result == null) result = caseAbstractDataElement(xmlSchema);
				if (result == null) result = caseKDMEntity(xmlSchema);
				if (result == null) result = caseModelElement(xmlSchema);
				if (result == null) result = caseElement(xmlSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ABSTRACT_CONTENT_ELEMENT: {
				AbstractContentElement abstractContentElement = (AbstractContentElement)theEObject;
				T result = caseAbstractContentElement(abstractContentElement);
				if (result == null) result = caseAbstractDataElement(abstractContentElement);
				if (result == null) result = caseKDMEntity(abstractContentElement);
				if (result == null) result = caseModelElement(abstractContentElement);
				if (result == null) result = caseElement(abstractContentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.COMPLEX_CONTENT_TYPE: {
				ComplexContentType complexContentType = (ComplexContentType)theEObject;
				T result = caseComplexContentType(complexContentType);
				if (result == null) result = caseAbstractContentElement(complexContentType);
				if (result == null) result = caseAbstractDataElement(complexContentType);
				if (result == null) result = caseKDMEntity(complexContentType);
				if (result == null) result = caseModelElement(complexContentType);
				if (result == null) result = caseElement(complexContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ALL_CONTENT: {
				AllContent allContent = (AllContent)theEObject;
				T result = caseAllContent(allContent);
				if (result == null) result = caseComplexContentType(allContent);
				if (result == null) result = caseAbstractContentElement(allContent);
				if (result == null) result = caseAbstractDataElement(allContent);
				if (result == null) result = caseKDMEntity(allContent);
				if (result == null) result = caseModelElement(allContent);
				if (result == null) result = caseElement(allContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SEQ_CONTENT: {
				SeqContent seqContent = (SeqContent)theEObject;
				T result = caseSeqContent(seqContent);
				if (result == null) result = caseComplexContentType(seqContent);
				if (result == null) result = caseAbstractContentElement(seqContent);
				if (result == null) result = caseAbstractDataElement(seqContent);
				if (result == null) result = caseKDMEntity(seqContent);
				if (result == null) result = caseModelElement(seqContent);
				if (result == null) result = caseElement(seqContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CHOICE_CONTENT: {
				ChoiceContent choiceContent = (ChoiceContent)theEObject;
				T result = caseChoiceContent(choiceContent);
				if (result == null) result = caseComplexContentType(choiceContent);
				if (result == null) result = caseAbstractContentElement(choiceContent);
				if (result == null) result = caseAbstractDataElement(choiceContent);
				if (result == null) result = caseKDMEntity(choiceContent);
				if (result == null) result = caseModelElement(choiceContent);
				if (result == null) result = caseElement(choiceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT_ITEM: {
				ContentItem contentItem = (ContentItem)theEObject;
				T result = caseContentItem(contentItem);
				if (result == null) result = caseAbstractContentElement(contentItem);
				if (result == null) result = caseAbstractDataElement(contentItem);
				if (result == null) result = caseKDMEntity(contentItem);
				if (result == null) result = caseModelElement(contentItem);
				if (result == null) result = caseElement(contentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.GROUP_CONTENT: {
				GroupContent groupContent = (GroupContent)theEObject;
				T result = caseGroupContent(groupContent);
				if (result == null) result = caseContentItem(groupContent);
				if (result == null) result = caseAbstractContentElement(groupContent);
				if (result == null) result = caseAbstractDataElement(groupContent);
				if (result == null) result = caseKDMEntity(groupContent);
				if (result == null) result = caseModelElement(groupContent);
				if (result == null) result = caseElement(groupContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT_RESTRICTION: {
				ContentRestriction contentRestriction = (ContentRestriction)theEObject;
				T result = caseContentRestriction(contentRestriction);
				if (result == null) result = caseAbstractContentElement(contentRestriction);
				if (result == null) result = caseAbstractDataElement(contentRestriction);
				if (result == null) result = caseKDMEntity(contentRestriction);
				if (result == null) result = caseModelElement(contentRestriction);
				if (result == null) result = caseElement(contentRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SIMPLE_CONTENT_TYPE: {
				SimpleContentType simpleContentType = (SimpleContentType)theEObject;
				T result = caseSimpleContentType(simpleContentType);
				if (result == null) result = caseComplexContentType(simpleContentType);
				if (result == null) result = caseAbstractContentElement(simpleContentType);
				if (result == null) result = caseAbstractDataElement(simpleContentType);
				if (result == null) result = caseKDMEntity(simpleContentType);
				if (result == null) result = caseModelElement(simpleContentType);
				if (result == null) result = caseElement(simpleContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.EXTENDED_DATA_ELEMENT: {
				ExtendedDataElement extendedDataElement = (ExtendedDataElement)theEObject;
				T result = caseExtendedDataElement(extendedDataElement);
				if (result == null) result = caseAbstractDataElement(extendedDataElement);
				if (result == null) result = caseKDMEntity(extendedDataElement);
				if (result == null) result = caseModelElement(extendedDataElement);
				if (result == null) result = caseElement(extendedDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_RELATIONSHIP: {
				DataRelationship dataRelationship = (DataRelationship)theEObject;
				T result = caseDataRelationship(dataRelationship);
				if (result == null) result = caseAbstractDataRelationship(dataRelationship);
				if (result == null) result = caseKDMRelationship(dataRelationship);
				if (result == null) result = caseModelElement(dataRelationship);
				if (result == null) result = caseElement(dataRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MIXED_CONTENT: {
				MixedContent mixedContent = (MixedContent)theEObject;
				T result = caseMixedContent(mixedContent);
				if (result == null) result = caseComplexContentType(mixedContent);
				if (result == null) result = caseAbstractContentElement(mixedContent);
				if (result == null) result = caseAbstractDataElement(mixedContent);
				if (result == null) result = caseKDMEntity(mixedContent);
				if (result == null) result = caseModelElement(mixedContent);
				if (result == null) result = caseElement(mixedContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT_REFERENCE: {
				ContentReference contentReference = (ContentReference)theEObject;
				T result = caseContentReference(contentReference);
				if (result == null) result = caseContentItem(contentReference);
				if (result == null) result = caseAbstractContentElement(contentReference);
				if (result == null) result = caseAbstractDataElement(contentReference);
				if (result == null) result = caseKDMEntity(contentReference);
				if (result == null) result = caseModelElement(contentReference);
				if (result == null) result = caseElement(contentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_ACTION: {
				DataAction dataAction = (DataAction)theEObject;
				T result = caseDataAction(dataAction);
				if (result == null) result = caseAbstractDataElement(dataAction);
				if (result == null) result = caseKDMEntity(dataAction);
				if (result == null) result = caseModelElement(dataAction);
				if (result == null) result = caseElement(dataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.READS_COLUMN_SET: {
				ReadsColumnSet readsColumnSet = (ReadsColumnSet)theEObject;
				T result = caseReadsColumnSet(readsColumnSet);
				if (result == null) result = caseAbstractActionRelationship(readsColumnSet);
				if (result == null) result = caseKDMRelationship(readsColumnSet);
				if (result == null) result = caseModelElement(readsColumnSet);
				if (result == null) result = caseElement(readsColumnSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT_ATTRIBUTE: {
				ContentAttribute contentAttribute = (ContentAttribute)theEObject;
				T result = caseContentAttribute(contentAttribute);
				if (result == null) result = caseContentItem(contentAttribute);
				if (result == null) result = caseAbstractContentElement(contentAttribute);
				if (result == null) result = caseAbstractDataElement(contentAttribute);
				if (result == null) result = caseKDMEntity(contentAttribute);
				if (result == null) result = caseModelElement(contentAttribute);
				if (result == null) result = caseElement(contentAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TYPED_BY: {
				TypedBy typedBy = (TypedBy)theEObject;
				T result = caseTypedBy(typedBy);
				if (result == null) result = caseAbstractDataRelationship(typedBy);
				if (result == null) result = caseKDMRelationship(typedBy);
				if (result == null) result = caseModelElement(typedBy);
				if (result == null) result = caseElement(typedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.REFERENCE_TO: {
				ReferenceTo referenceTo = (ReferenceTo)theEObject;
				T result = caseReferenceTo(referenceTo);
				if (result == null) result = caseAbstractDataRelationship(referenceTo);
				if (result == null) result = caseKDMRelationship(referenceTo);
				if (result == null) result = caseModelElement(referenceTo);
				if (result == null) result = caseElement(referenceTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RESTRICTION_OF: {
				RestrictionOf restrictionOf = (RestrictionOf)theEObject;
				T result = caseRestrictionOf(restrictionOf);
				if (result == null) result = caseAbstractDataRelationship(restrictionOf);
				if (result == null) result = caseKDMRelationship(restrictionOf);
				if (result == null) result = caseModelElement(restrictionOf);
				if (result == null) result = caseElement(restrictionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.EXTENSION_TO: {
				ExtensionTo extensionTo = (ExtensionTo)theEObject;
				T result = caseExtensionTo(extensionTo);
				if (result == null) result = caseAbstractDataRelationship(extensionTo);
				if (result == null) result = caseKDMRelationship(extensionTo);
				if (result == null) result = caseModelElement(extensionTo);
				if (result == null) result = caseElement(extensionTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATATYPE_OF: {
				DatatypeOf datatypeOf = (DatatypeOf)theEObject;
				T result = caseDatatypeOf(datatypeOf);
				if (result == null) result = caseAbstractDataRelationship(datatypeOf);
				if (result == null) result = caseKDMRelationship(datatypeOf);
				if (result == null) result = caseModelElement(datatypeOf);
				if (result == null) result = caseElement(datatypeOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.HAS_CONTENT: {
				HasContent hasContent = (HasContent)theEObject;
				T result = caseHasContent(hasContent);
				if (result == null) result = caseAbstractActionRelationship(hasContent);
				if (result == null) result = caseKDMRelationship(hasContent);
				if (result == null) result = caseModelElement(hasContent);
				if (result == null) result = caseElement(hasContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.WRITES_COLUMN_SET: {
				WritesColumnSet writesColumnSet = (WritesColumnSet)theEObject;
				T result = caseWritesColumnSet(writesColumnSet);
				if (result == null) result = caseAbstractActionRelationship(writesColumnSet);
				if (result == null) result = caseKDMRelationship(writesColumnSet);
				if (result == null) result = caseModelElement(writesColumnSet);
				if (result == null) result = caseElement(writesColumnSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PRODUCES_DATA_EVENT: {
				ProducesDataEvent producesDataEvent = (ProducesDataEvent)theEObject;
				T result = caseProducesDataEvent(producesDataEvent);
				if (result == null) result = caseAbstractActionRelationship(producesDataEvent);
				if (result == null) result = caseKDMRelationship(producesDataEvent);
				if (result == null) result = caseModelElement(producesDataEvent);
				if (result == null) result = caseElement(producesDataEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SEGMENT: {
				DataSegment dataSegment = (DataSegment)theEObject;
				T result = caseDataSegment(dataSegment);
				if (result == null) result = caseColumnSet(dataSegment);
				if (result == null) result = caseDataContainer(dataSegment);
				if (result == null) result = caseDataResource(dataSegment);
				if (result == null) result = caseAbstractDataElement(dataSegment);
				if (result == null) result = caseKDMEntity(dataSegment);
				if (result == null) result = caseModelElement(dataSegment);
				if (result == null) result = caseElement(dataSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT_ELEMENT: {
				ContentElement contentElement = (ContentElement)theEObject;
				T result = caseContentElement(contentElement);
				if (result == null) result = caseContentItem(contentElement);
				if (result == null) result = caseAbstractContentElement(contentElement);
				if (result == null) result = caseAbstractDataElement(contentElement);
				if (result == null) result = caseKDMEntity(contentElement);
				if (result == null) result = caseModelElement(contentElement);
				if (result == null) result = caseElement(contentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MANAGES_DATA: {
				ManagesData managesData = (ManagesData)theEObject;
				T result = caseManagesData(managesData);
				if (result == null) result = caseAbstractActionRelationship(managesData);
				if (result == null) result = caseKDMRelationship(managesData);
				if (result == null) result = caseModelElement(managesData);
				if (result == null) result = caseElement(managesData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseDataModel(DataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataElement(AbstractDataElement object) {
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
	public T caseDataResource(DataResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexElement(IndexElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueKey(UniqueKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataRelationship(AbstractDataRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyRelation(KeyRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceKey(ReferenceKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContainer(DataContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalSchema(RelationalSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnSet(ColumnSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalTable(RelationalTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalView(RelationalView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordFile(RecordFile object) {
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
	public T caseDataEvent(DataEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLSchema(XMLSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContentElement(AbstractContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexContentType(ComplexContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllContent(AllContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqContent(SeqContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceContent(ChoiceContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentItem(ContentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupContent(GroupContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentRestriction(ContentRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleContentType(SimpleContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedDataElement(ExtendedDataElement object) {
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
	public T caseDataRelationship(DataRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedContent(MixedContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentReference(ContentReference object) {
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
	public T caseDataAction(DataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads Column Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadsColumnSet(ReadsColumnSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentAttribute(ContentAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedBy(TypedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTo(ReferenceTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionOf(RestrictionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionTo(ExtensionTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeOf(DatatypeOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasContent(HasContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writes Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writes Column Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritesColumnSet(WritesColumnSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produces Data Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produces Data Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducesDataEvent(ProducesDataEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSegment(DataSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentElement(ContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manages Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manages Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagesData(ManagesData object) {
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

} //DataSwitch
