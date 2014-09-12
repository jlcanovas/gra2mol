/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data.util;

import kdm.action.AbstractActionRelationship;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

import kdm.data.*;

import kdm.kdm.KDMFramework;
import kdm.kdm.KDMModel;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kdm.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
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
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
			@Override
			public Adapter caseDataModel(DataModel object) {
				return createDataModelAdapter();
			}
			@Override
			public Adapter caseAbstractDataElement(AbstractDataElement object) {
				return createAbstractDataElementAdapter();
			}
			@Override
			public Adapter caseDataResource(DataResource object) {
				return createDataResourceAdapter();
			}
			@Override
			public Adapter caseIndexElement(IndexElement object) {
				return createIndexElementAdapter();
			}
			@Override
			public Adapter caseUniqueKey(UniqueKey object) {
				return createUniqueKeyAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseAbstractDataRelationship(AbstractDataRelationship object) {
				return createAbstractDataRelationshipAdapter();
			}
			@Override
			public Adapter caseKeyRelation(KeyRelation object) {
				return createKeyRelationAdapter();
			}
			@Override
			public Adapter caseReferenceKey(ReferenceKey object) {
				return createReferenceKeyAdapter();
			}
			@Override
			public Adapter caseDataContainer(DataContainer object) {
				return createDataContainerAdapter();
			}
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseRelationalSchema(RelationalSchema object) {
				return createRelationalSchemaAdapter();
			}
			@Override
			public Adapter caseColumnSet(ColumnSet object) {
				return createColumnSetAdapter();
			}
			@Override
			public Adapter caseRelationalTable(RelationalTable object) {
				return createRelationalTableAdapter();
			}
			@Override
			public Adapter caseRelationalView(RelationalView object) {
				return createRelationalViewAdapter();
			}
			@Override
			public Adapter caseRecordFile(RecordFile object) {
				return createRecordFileAdapter();
			}
			@Override
			public Adapter caseDataEvent(DataEvent object) {
				return createDataEventAdapter();
			}
			@Override
			public Adapter caseXMLSchema(XMLSchema object) {
				return createXMLSchemaAdapter();
			}
			@Override
			public Adapter caseAbstractContentElement(AbstractContentElement object) {
				return createAbstractContentElementAdapter();
			}
			@Override
			public Adapter caseComplexContentType(ComplexContentType object) {
				return createComplexContentTypeAdapter();
			}
			@Override
			public Adapter caseAllContent(AllContent object) {
				return createAllContentAdapter();
			}
			@Override
			public Adapter caseSeqContent(SeqContent object) {
				return createSeqContentAdapter();
			}
			@Override
			public Adapter caseChoiceContent(ChoiceContent object) {
				return createChoiceContentAdapter();
			}
			@Override
			public Adapter caseContentItem(ContentItem object) {
				return createContentItemAdapter();
			}
			@Override
			public Adapter caseGroupContent(GroupContent object) {
				return createGroupContentAdapter();
			}
			@Override
			public Adapter caseContentRestriction(ContentRestriction object) {
				return createContentRestrictionAdapter();
			}
			@Override
			public Adapter caseSimpleContentType(SimpleContentType object) {
				return createSimpleContentTypeAdapter();
			}
			@Override
			public Adapter caseExtendedDataElement(ExtendedDataElement object) {
				return createExtendedDataElementAdapter();
			}
			@Override
			public Adapter caseDataRelationship(DataRelationship object) {
				return createDataRelationshipAdapter();
			}
			@Override
			public Adapter caseMixedContent(MixedContent object) {
				return createMixedContentAdapter();
			}
			@Override
			public Adapter caseContentReference(ContentReference object) {
				return createContentReferenceAdapter();
			}
			@Override
			public Adapter caseDataAction(DataAction object) {
				return createDataActionAdapter();
			}
			@Override
			public Adapter caseReadsColumnSet(ReadsColumnSet object) {
				return createReadsColumnSetAdapter();
			}
			@Override
			public Adapter caseContentAttribute(ContentAttribute object) {
				return createContentAttributeAdapter();
			}
			@Override
			public Adapter caseTypedBy(TypedBy object) {
				return createTypedByAdapter();
			}
			@Override
			public Adapter caseReferenceTo(ReferenceTo object) {
				return createReferenceToAdapter();
			}
			@Override
			public Adapter caseRestrictionOf(RestrictionOf object) {
				return createRestrictionOfAdapter();
			}
			@Override
			public Adapter caseExtensionTo(ExtensionTo object) {
				return createExtensionToAdapter();
			}
			@Override
			public Adapter caseDatatypeOf(DatatypeOf object) {
				return createDatatypeOfAdapter();
			}
			@Override
			public Adapter caseHasContent(HasContent object) {
				return createHasContentAdapter();
			}
			@Override
			public Adapter caseWritesColumnSet(WritesColumnSet object) {
				return createWritesColumnSetAdapter();
			}
			@Override
			public Adapter caseProducesDataEvent(ProducesDataEvent object) {
				return createProducesDataEventAdapter();
			}
			@Override
			public Adapter caseDataSegment(DataSegment object) {
				return createDataSegmentAdapter();
			}
			@Override
			public Adapter caseContentElement(ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseManagesData(ManagesData object) {
				return createManagesDataAdapter();
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
			public Adapter caseKDMFramework(KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMEntity(KDMEntity object) {
				return createKDMEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link kdm.data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.AbstractDataElement <em>Abstract Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.AbstractDataElement
	 * @generated
	 */
	public Adapter createAbstractDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataResource
	 * @generated
	 */
	public Adapter createDataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.IndexElement <em>Index Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.IndexElement
	 * @generated
	 */
	public Adapter createIndexElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.UniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.UniqueKey
	 * @generated
	 */
	public Adapter createUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.AbstractDataRelationship <em>Abstract Data Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.AbstractDataRelationship
	 * @generated
	 */
	public Adapter createAbstractDataRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.KeyRelation <em>Key Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.KeyRelation
	 * @generated
	 */
	public Adapter createKeyRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ReferenceKey <em>Reference Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ReferenceKey
	 * @generated
	 */
	public Adapter createReferenceKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataContainer
	 * @generated
	 */
	public Adapter createDataContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.RelationalSchema
	 * @generated
	 */
	public Adapter createRelationalSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ColumnSet
	 * @generated
	 */
	public Adapter createColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.RelationalTable
	 * @generated
	 */
	public Adapter createRelationalTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.RelationalView <em>Relational View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.RelationalView
	 * @generated
	 */
	public Adapter createRelationalViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.RecordFile <em>Record File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.RecordFile
	 * @generated
	 */
	public Adapter createRecordFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataEvent
	 * @generated
	 */
	public Adapter createDataEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.XMLSchema <em>XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.XMLSchema
	 * @generated
	 */
	public Adapter createXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.AbstractContentElement <em>Abstract Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.AbstractContentElement
	 * @generated
	 */
	public Adapter createAbstractContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ComplexContentType <em>Complex Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ComplexContentType
	 * @generated
	 */
	public Adapter createComplexContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.AllContent <em>All Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.AllContent
	 * @generated
	 */
	public Adapter createAllContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.SeqContent <em>Seq Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.SeqContent
	 * @generated
	 */
	public Adapter createSeqContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ChoiceContent <em>Choice Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ChoiceContent
	 * @generated
	 */
	public Adapter createChoiceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ContentItem
	 * @generated
	 */
	public Adapter createContentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.GroupContent <em>Group Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.GroupContent
	 * @generated
	 */
	public Adapter createGroupContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ContentRestriction <em>Content Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ContentRestriction
	 * @generated
	 */
	public Adapter createContentRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.SimpleContentType <em>Simple Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.SimpleContentType
	 * @generated
	 */
	public Adapter createSimpleContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ExtendedDataElement <em>Extended Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ExtendedDataElement
	 * @generated
	 */
	public Adapter createExtendedDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataRelationship
	 * @generated
	 */
	public Adapter createDataRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.MixedContent <em>Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.MixedContent
	 * @generated
	 */
	public Adapter createMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ContentReference
	 * @generated
	 */
	public Adapter createContentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataAction
	 * @generated
	 */
	public Adapter createDataActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ReadsColumnSet <em>Reads Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ReadsColumnSet
	 * @generated
	 */
	public Adapter createReadsColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ContentAttribute <em>Content Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ContentAttribute
	 * @generated
	 */
	public Adapter createContentAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.TypedBy <em>Typed By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.TypedBy
	 * @generated
	 */
	public Adapter createTypedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ReferenceTo
	 * @generated
	 */
	public Adapter createReferenceToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.RestrictionOf <em>Restriction Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.RestrictionOf
	 * @generated
	 */
	public Adapter createRestrictionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ExtensionTo <em>Extension To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ExtensionTo
	 * @generated
	 */
	public Adapter createExtensionToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DatatypeOf <em>Datatype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DatatypeOf
	 * @generated
	 */
	public Adapter createDatatypeOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.HasContent <em>Has Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.HasContent
	 * @generated
	 */
	public Adapter createHasContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.WritesColumnSet <em>Writes Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.WritesColumnSet
	 * @generated
	 */
	public Adapter createWritesColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ProducesDataEvent <em>Produces Data Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ProducesDataEvent
	 * @generated
	 */
	public Adapter createProducesDataEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.DataSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.DataSegment
	 * @generated
	 */
	public Adapter createDataSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.data.ManagesData <em>Manages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.data.ManagesData
	 * @generated
	 */
	public Adapter createManagesDataAdapter() {
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

} //DataAdapterFactory
