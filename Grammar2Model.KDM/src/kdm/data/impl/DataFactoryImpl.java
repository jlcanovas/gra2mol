/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data.impl;

import kdm.data.*;

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
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/data"); 
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
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
			case DataPackage.DATA_MODEL: return createDataModel();
			case DataPackage.DATA_RESOURCE: return createDataResource();
			case DataPackage.INDEX_ELEMENT: return createIndexElement();
			case DataPackage.UNIQUE_KEY: return createUniqueKey();
			case DataPackage.INDEX: return createIndex();
			case DataPackage.KEY_RELATION: return createKeyRelation();
			case DataPackage.REFERENCE_KEY: return createReferenceKey();
			case DataPackage.DATA_CONTAINER: return createDataContainer();
			case DataPackage.CATALOG: return createCatalog();
			case DataPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case DataPackage.COLUMN_SET: return createColumnSet();
			case DataPackage.RELATIONAL_TABLE: return createRelationalTable();
			case DataPackage.RELATIONAL_VIEW: return createRelationalView();
			case DataPackage.RECORD_FILE: return createRecordFile();
			case DataPackage.DATA_EVENT: return createDataEvent();
			case DataPackage.XML_SCHEMA: return createXMLSchema();
			case DataPackage.COMPLEX_CONTENT_TYPE: return createComplexContentType();
			case DataPackage.ALL_CONTENT: return createAllContent();
			case DataPackage.SEQ_CONTENT: return createSeqContent();
			case DataPackage.CHOICE_CONTENT: return createChoiceContent();
			case DataPackage.CONTENT_ITEM: return createContentItem();
			case DataPackage.GROUP_CONTENT: return createGroupContent();
			case DataPackage.CONTENT_RESTRICTION: return createContentRestriction();
			case DataPackage.SIMPLE_CONTENT_TYPE: return createSimpleContentType();
			case DataPackage.EXTENDED_DATA_ELEMENT: return createExtendedDataElement();
			case DataPackage.DATA_RELATIONSHIP: return createDataRelationship();
			case DataPackage.MIXED_CONTENT: return createMixedContent();
			case DataPackage.CONTENT_REFERENCE: return createContentReference();
			case DataPackage.DATA_ACTION: return createDataAction();
			case DataPackage.READS_COLUMN_SET: return createReadsColumnSet();
			case DataPackage.CONTENT_ATTRIBUTE: return createContentAttribute();
			case DataPackage.TYPED_BY: return createTypedBy();
			case DataPackage.REFERENCE_TO: return createReferenceTo();
			case DataPackage.RESTRICTION_OF: return createRestrictionOf();
			case DataPackage.EXTENSION_TO: return createExtensionTo();
			case DataPackage.DATATYPE_OF: return createDatatypeOf();
			case DataPackage.HAS_CONTENT: return createHasContent();
			case DataPackage.WRITES_COLUMN_SET: return createWritesColumnSet();
			case DataPackage.PRODUCES_DATA_EVENT: return createProducesDataEvent();
			case DataPackage.DATA_SEGMENT: return createDataSegment();
			case DataPackage.CONTENT_ELEMENT: return createContentElement();
			case DataPackage.MANAGES_DATA: return createManagesData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource createDataResource() {
		DataResourceImpl dataResource = new DataResourceImpl();
		return dataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexElement createIndexElement() {
		IndexElementImpl indexElement = new IndexElementImpl();
		return indexElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKey createUniqueKey() {
		UniqueKeyImpl uniqueKey = new UniqueKeyImpl();
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyRelation createKeyRelation() {
		KeyRelationImpl keyRelation = new KeyRelationImpl();
		return keyRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceKey createReferenceKey() {
		ReferenceKeyImpl referenceKey = new ReferenceKeyImpl();
		return referenceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContainer createDataContainer() {
		DataContainerImpl dataContainer = new DataContainerImpl();
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSchema createRelationalSchema() {
		RelationalSchemaImpl relationalSchema = new RelationalSchemaImpl();
		return relationalSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSet createColumnSet() {
		ColumnSetImpl columnSet = new ColumnSetImpl();
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable createRelationalTable() {
		RelationalTableImpl relationalTable = new RelationalTableImpl();
		return relationalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalView createRelationalView() {
		RelationalViewImpl relationalView = new RelationalViewImpl();
		return relationalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordFile createRecordFile() {
		RecordFileImpl recordFile = new RecordFileImpl();
		return recordFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEvent createDataEvent() {
		DataEventImpl dataEvent = new DataEventImpl();
		return dataEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLSchema createXMLSchema() {
		XMLSchemaImpl xmlSchema = new XMLSchemaImpl();
		return xmlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexContentType createComplexContentType() {
		ComplexContentTypeImpl complexContentType = new ComplexContentTypeImpl();
		return complexContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllContent createAllContent() {
		AllContentImpl allContent = new AllContentImpl();
		return allContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqContent createSeqContent() {
		SeqContentImpl seqContent = new SeqContentImpl();
		return seqContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceContent createChoiceContent() {
		ChoiceContentImpl choiceContent = new ChoiceContentImpl();
		return choiceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentItem createContentItem() {
		ContentItemImpl contentItem = new ContentItemImpl();
		return contentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupContent createGroupContent() {
		GroupContentImpl groupContent = new GroupContentImpl();
		return groupContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentRestriction createContentRestriction() {
		ContentRestrictionImpl contentRestriction = new ContentRestrictionImpl();
		return contentRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleContentType createSimpleContentType() {
		SimpleContentTypeImpl simpleContentType = new SimpleContentTypeImpl();
		return simpleContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataElement createExtendedDataElement() {
		ExtendedDataElementImpl extendedDataElement = new ExtendedDataElementImpl();
		return extendedDataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationship createDataRelationship() {
		DataRelationshipImpl dataRelationship = new DataRelationshipImpl();
		return dataRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedContent createMixedContent() {
		MixedContentImpl mixedContent = new MixedContentImpl();
		return mixedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentReference createContentReference() {
		ContentReferenceImpl contentReference = new ContentReferenceImpl();
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAction createDataAction() {
		DataActionImpl dataAction = new DataActionImpl();
		return dataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadsColumnSet createReadsColumnSet() {
		ReadsColumnSetImpl readsColumnSet = new ReadsColumnSetImpl();
		return readsColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentAttribute createContentAttribute() {
		ContentAttributeImpl contentAttribute = new ContentAttributeImpl();
		return contentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedBy createTypedBy() {
		TypedByImpl typedBy = new TypedByImpl();
		return typedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTo createReferenceTo() {
		ReferenceToImpl referenceTo = new ReferenceToImpl();
		return referenceTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionOf createRestrictionOf() {
		RestrictionOfImpl restrictionOf = new RestrictionOfImpl();
		return restrictionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionTo createExtensionTo() {
		ExtensionToImpl extensionTo = new ExtensionToImpl();
		return extensionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeOf createDatatypeOf() {
		DatatypeOfImpl datatypeOf = new DatatypeOfImpl();
		return datatypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasContent createHasContent() {
		HasContentImpl hasContent = new HasContentImpl();
		return hasContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritesColumnSet createWritesColumnSet() {
		WritesColumnSetImpl writesColumnSet = new WritesColumnSetImpl();
		return writesColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProducesDataEvent createProducesDataEvent() {
		ProducesDataEventImpl producesDataEvent = new ProducesDataEventImpl();
		return producesDataEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSegment createDataSegment() {
		DataSegmentImpl dataSegment = new DataSegmentImpl();
		return dataSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentElement createContentElement() {
		ContentElementImpl contentElement = new ContentElementImpl();
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagesData createManagesData() {
		ManagesDataImpl managesData = new ManagesDataImpl();
		return managesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
