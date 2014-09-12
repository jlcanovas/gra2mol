/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = kdm.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	DataModel createDataModel();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	DataResource createDataResource();

	/**
	 * Returns a new object of class '<em>Index Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Element</em>'.
	 * @generated
	 */
	IndexElement createIndexElement();

	/**
	 * Returns a new object of class '<em>Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Key</em>'.
	 * @generated
	 */
	UniqueKey createUniqueKey();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>Key Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Relation</em>'.
	 * @generated
	 */
	KeyRelation createKeyRelation();

	/**
	 * Returns a new object of class '<em>Reference Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Key</em>'.
	 * @generated
	 */
	ReferenceKey createReferenceKey();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	DataContainer createDataContainer();

	/**
	 * Returns a new object of class '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * Returns a new object of class '<em>Relational Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Schema</em>'.
	 * @generated
	 */
	RelationalSchema createRelationalSchema();

	/**
	 * Returns a new object of class '<em>Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Set</em>'.
	 * @generated
	 */
	ColumnSet createColumnSet();

	/**
	 * Returns a new object of class '<em>Relational Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Table</em>'.
	 * @generated
	 */
	RelationalTable createRelationalTable();

	/**
	 * Returns a new object of class '<em>Relational View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational View</em>'.
	 * @generated
	 */
	RelationalView createRelationalView();

	/**
	 * Returns a new object of class '<em>Record File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record File</em>'.
	 * @generated
	 */
	RecordFile createRecordFile();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	DataEvent createDataEvent();

	/**
	 * Returns a new object of class '<em>XML Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Schema</em>'.
	 * @generated
	 */
	XMLSchema createXMLSchema();

	/**
	 * Returns a new object of class '<em>Complex Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Content Type</em>'.
	 * @generated
	 */
	ComplexContentType createComplexContentType();

	/**
	 * Returns a new object of class '<em>All Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Content</em>'.
	 * @generated
	 */
	AllContent createAllContent();

	/**
	 * Returns a new object of class '<em>Seq Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Content</em>'.
	 * @generated
	 */
	SeqContent createSeqContent();

	/**
	 * Returns a new object of class '<em>Choice Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Content</em>'.
	 * @generated
	 */
	ChoiceContent createChoiceContent();

	/**
	 * Returns a new object of class '<em>Content Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Item</em>'.
	 * @generated
	 */
	ContentItem createContentItem();

	/**
	 * Returns a new object of class '<em>Group Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Content</em>'.
	 * @generated
	 */
	GroupContent createGroupContent();

	/**
	 * Returns a new object of class '<em>Content Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Restriction</em>'.
	 * @generated
	 */
	ContentRestriction createContentRestriction();

	/**
	 * Returns a new object of class '<em>Simple Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Content Type</em>'.
	 * @generated
	 */
	SimpleContentType createSimpleContentType();

	/**
	 * Returns a new object of class '<em>Extended Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Element</em>'.
	 * @generated
	 */
	ExtendedDataElement createExtendedDataElement();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	DataRelationship createDataRelationship();

	/**
	 * Returns a new object of class '<em>Mixed Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Content</em>'.
	 * @generated
	 */
	MixedContent createMixedContent();

	/**
	 * Returns a new object of class '<em>Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Reference</em>'.
	 * @generated
	 */
	ContentReference createContentReference();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	DataAction createDataAction();

	/**
	 * Returns a new object of class '<em>Reads Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reads Column Set</em>'.
	 * @generated
	 */
	ReadsColumnSet createReadsColumnSet();

	/**
	 * Returns a new object of class '<em>Content Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Attribute</em>'.
	 * @generated
	 */
	ContentAttribute createContentAttribute();

	/**
	 * Returns a new object of class '<em>Typed By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed By</em>'.
	 * @generated
	 */
	TypedBy createTypedBy();

	/**
	 * Returns a new object of class '<em>Reference To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference To</em>'.
	 * @generated
	 */
	ReferenceTo createReferenceTo();

	/**
	 * Returns a new object of class '<em>Restriction Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Of</em>'.
	 * @generated
	 */
	RestrictionOf createRestrictionOf();

	/**
	 * Returns a new object of class '<em>Extension To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension To</em>'.
	 * @generated
	 */
	ExtensionTo createExtensionTo();

	/**
	 * Returns a new object of class '<em>Datatype Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Of</em>'.
	 * @generated
	 */
	DatatypeOf createDatatypeOf();

	/**
	 * Returns a new object of class '<em>Has Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Content</em>'.
	 * @generated
	 */
	HasContent createHasContent();

	/**
	 * Returns a new object of class '<em>Writes Column Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writes Column Set</em>'.
	 * @generated
	 */
	WritesColumnSet createWritesColumnSet();

	/**
	 * Returns a new object of class '<em>Produces Data Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produces Data Event</em>'.
	 * @generated
	 */
	ProducesDataEvent createProducesDataEvent();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	DataSegment createDataSegment();

	/**
	 * Returns a new object of class '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Element</em>'.
	 * @generated
	 */
	ContentElement createContentElement();

	/**
	 * Returns a new object of class '<em>Manages Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manages Data</em>'.
	 * @generated
	 */
	ManagesData createManagesData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
