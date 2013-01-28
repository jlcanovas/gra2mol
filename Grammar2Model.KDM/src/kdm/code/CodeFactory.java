/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kdm.code.CodePackage
 * @generated
 */
public interface CodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeFactory eINSTANCE = kdm.code.impl.CodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Element</em>'.
	 * @generated
	 */
	ControlElement createControlElement();

	/**
	 * Returns a new object of class '<em>Method Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Unit</em>'.
	 * @generated
	 */
	MethodUnit createMethodUnit();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly</em>'.
	 * @generated
	 */
	CodeAssembly createCodeAssembly();

	/**
	 * Returns a new object of class '<em>Callable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callable Unit</em>'.
	 * @generated
	 */
	CallableUnit createCallableUnit();

	/**
	 * Returns a new object of class '<em>Template Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Unit</em>'.
	 * @generated
	 */
	TemplateUnit createTemplateUnit();

	/**
	 * Returns a new object of class '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Parameter</em>'.
	 * @generated
	 */
	TemplateParameter createTemplateParameter();

	/**
	 * Returns a new object of class '<em>Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Of</em>'.
	 * @generated
	 */
	InstanceOf createInstanceOf();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	CodeModel createCodeModel();

	/**
	 * Returns a new object of class '<em>Derived Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Type</em>'.
	 * @generated
	 */
	DerivedType createDerivedType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns a new object of class '<em>Char Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Type</em>'.
	 * @generated
	 */
	CharType createCharType();

	/**
	 * Returns a new object of class '<em>Class Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Unit</em>'.
	 * @generated
	 */
	ClassUnit createClassUnit();

	/**
	 * Returns a new object of class '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Type</em>'.
	 * @generated
	 */
	CompositeType createCompositeType();

	/**
	 * Returns a new object of class '<em>Record Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type</em>'.
	 * @generated
	 */
	RecordType createRecordType();

	/**
	 * Returns a new object of class '<em>Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Type</em>'.
	 * @generated
	 */
	EnumeratedType createEnumeratedType();

	/**
	 * Returns a new object of class '<em>Extends</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extends</em>'.
	 * @generated
	 */
	Extends createExtends();

	/**
	 * Returns a new object of class '<em>Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaled Type</em>'.
	 * @generated
	 */
	ScaledType createScaledType();

	/**
	 * Returns a new object of class '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Type</em>'.
	 * @generated
	 */
	FloatType createFloatType();

	/**
	 * Returns a new object of class '<em>Has Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Type</em>'.
	 * @generated
	 */
	HasType createHasType();

	/**
	 * Returns a new object of class '<em>Implementation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Of</em>'.
	 * @generated
	 */
	ImplementationOf createImplementationOf();

	/**
	 * Returns a new object of class '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implements</em>'.
	 * @generated
	 */
	Implements createImplements();

	/**
	 * Returns a new object of class '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type</em>'.
	 * @generated
	 */
	IntegerType createIntegerType();

	/**
	 * Returns a new object of class '<em>Interface Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Unit</em>'.
	 * @generated
	 */
	InterfaceUnit createInterfaceUnit();

	/**
	 * Returns a new object of class '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type</em>'.
	 * @generated
	 */
	PointerType createPointerType();

	/**
	 * Returns a new object of class '<em>Type Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Unit</em>'.
	 * @generated
	 */
	TypeUnit createTypeUnit();

	/**
	 * Returns a new object of class '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Type</em>'.
	 * @generated
	 */
	RangeType createRangeType();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element</em>'.
	 * @generated
	 */
	DataElement createDataElement();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns a new object of class '<em>Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Type</em>'.
	 * @generated
	 */
	ChoiceType createChoiceType();

	/**
	 * Returns a new object of class '<em>Namespace Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Unit</em>'.
	 * @generated
	 */
	NamespaceUnit createNamespaceUnit();

	/**
	 * Returns a new object of class '<em>Visible In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visible In</em>'.
	 * @generated
	 */
	VisibleIn createVisibleIn();

	/**
	 * Returns a new object of class '<em>Comment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Unit</em>'.
	 * @generated
	 */
	CommentUnit createCommentUnit();

	/**
	 * Returns a new object of class '<em>Shared Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Unit</em>'.
	 * @generated
	 */
	SharedUnit createSharedUnit();

	/**
	 * Returns a new object of class '<em>Decimal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Type</em>'.
	 * @generated
	 */
	DecimalType createDecimalType();

	/**
	 * Returns a new object of class '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Type</em>'.
	 * @generated
	 */
	DateType createDateType();

	/**
	 * Returns a new object of class '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Type</em>'.
	 * @generated
	 */
	TimeType createTimeType();

	/**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
	VoidType createVoidType();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Value List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value List</em>'.
	 * @generated
	 */
	ValueList createValueList();

	/**
	 * Returns a new object of class '<em>Storable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storable Unit</em>'.
	 * @generated
	 */
	StorableUnit createStorableUnit();

	/**
	 * Returns a new object of class '<em>Member Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Unit</em>'.
	 * @generated
	 */
	MemberUnit createMemberUnit();

	/**
	 * Returns a new object of class '<em>Parameter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Unit</em>'.
	 * @generated
	 */
	ParameterUnit createParameterUnit();

	/**
	 * Returns a new object of class '<em>Item Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Unit</em>'.
	 * @generated
	 */
	ItemUnit createItemUnit();

	/**
	 * Returns a new object of class '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Unit</em>'.
	 * @generated
	 */
	IndexUnit createIndexUnit();

	/**
	 * Returns a new object of class '<em>Synonym Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synonym Type</em>'.
	 * @generated
	 */
	SynonymType createSynonymType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Type</em>'.
	 * @generated
	 */
	BagType createBagType();

	/**
	 * Returns a new object of class '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Type</em>'.
	 * @generated
	 */
	SetType createSetType();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	CodeElement createCodeElement();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	CodeRelationship createCodeRelationship();

	/**
	 * Returns a new object of class '<em>Language Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Unit</em>'.
	 * @generated
	 */
	LanguageUnit createLanguageUnit();

	/**
	 * Returns a new object of class '<em>Ordinal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Type</em>'.
	 * @generated
	 */
	OrdinalType createOrdinalType();

	/**
	 * Returns a new object of class '<em>Bitstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitstring Type</em>'.
	 * @generated
	 */
	BitstringType createBitstringType();

	/**
	 * Returns a new object of class '<em>Octet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octet Type</em>'.
	 * @generated
	 */
	OctetType createOctetType();

	/**
	 * Returns a new object of class '<em>Octetstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octetstring Type</em>'.
	 * @generated
	 */
	OctetstringType createOctetstringType();

	/**
	 * Returns a new object of class '<em>Bit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Type</em>'.
	 * @generated
	 */
	BitType createBitType();

	/**
	 * Returns a new object of class '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imports</em>'.
	 * @generated
	 */
	Imports createImports();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	kdm.code.Package createPackage();

	/**
	 * Returns a new object of class '<em>Parameter To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter To</em>'.
	 * @generated
	 */
	ParameterTo createParameterTo();

	/**
	 * Returns a new object of class '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type</em>'.
	 * @generated
	 */
	TemplateType createTemplateType();

	/**
	 * Returns a new object of class '<em>Preprocessor Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessor Directive</em>'.
	 * @generated
	 */
	PreprocessorDirective createPreprocessorDirective();

	/**
	 * Returns a new object of class '<em>Macro Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Directive</em>'.
	 * @generated
	 */
	MacroDirective createMacroDirective();

	/**
	 * Returns a new object of class '<em>Macro Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Unit</em>'.
	 * @generated
	 */
	MacroUnit createMacroUnit();

	/**
	 * Returns a new object of class '<em>Conditional Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Directive</em>'.
	 * @generated
	 */
	ConditionalDirective createConditionalDirective();

	/**
	 * Returns a new object of class '<em>Include Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Directive</em>'.
	 * @generated
	 */
	IncludeDirective createIncludeDirective();

	/**
	 * Returns a new object of class '<em>Variant To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant To</em>'.
	 * @generated
	 */
	VariantTo createVariantTo();

	/**
	 * Returns a new object of class '<em>Expands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expands</em>'.
	 * @generated
	 */
	Expands createExpands();

	/**
	 * Returns a new object of class '<em>Redefines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefines</em>'.
	 * @generated
	 */
	Redefines createRedefines();

	/**
	 * Returns a new object of class '<em>Generated From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated From</em>'.
	 * @generated
	 */
	GeneratedFrom createGeneratedFrom();

	/**
	 * Returns a new object of class '<em>Includes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Includes</em>'.
	 * @generated
	 */
	Includes createIncludes();

	/**
	 * Returns a new object of class '<em>Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Value</em>'.
	 * @generated
	 */
	HasValue createHasValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodePackage getCodePackage();

} //CodeFactory
