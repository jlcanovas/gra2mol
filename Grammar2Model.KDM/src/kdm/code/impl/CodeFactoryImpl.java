/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code.impl;

import kdm.code.ArrayType;
import kdm.code.BagType;
import kdm.code.BitType;
import kdm.code.BitstringType;
import kdm.code.BooleanType;
import kdm.code.CallableKind;
import kdm.code.CallableUnit;
import kdm.code.CharType;
import kdm.code.ChoiceType;
import kdm.code.ClassUnit;
import kdm.code.CodeAssembly;
import kdm.code.CodeElement;
import kdm.code.CodeFactory;
import kdm.code.CodeModel;
import kdm.code.CodePackage;
import kdm.code.CodeRelationship;
import kdm.code.CommentUnit;
import kdm.code.CompilationUnit;
import kdm.code.CompositeType;
import kdm.code.ConditionalDirective;
import kdm.code.ControlElement;
import kdm.code.DataElement;
import kdm.code.DateType;
import kdm.code.DecimalType;
import kdm.code.DerivedType;
import kdm.code.EnumeratedType;
import kdm.code.Expands;
import kdm.code.ExportKind;
import kdm.code.Extends;
import kdm.code.FloatType;
import kdm.code.GeneratedFrom;
import kdm.code.HasType;
import kdm.code.HasValue;
import kdm.code.ImplementationOf;
import kdm.code.Implements;
import kdm.code.Imports;
import kdm.code.IncludeDirective;
import kdm.code.Includes;
import kdm.code.IndexUnit;
import kdm.code.InstanceOf;
import kdm.code.IntegerType;
import kdm.code.InterfaceUnit;
import kdm.code.ItemUnit;
import kdm.code.LanguageUnit;
import kdm.code.MacroDirective;
import kdm.code.MacroKind;
import kdm.code.MacroUnit;
import kdm.code.MemberUnit;
import kdm.code.MethodKind;
import kdm.code.MethodUnit;
import kdm.code.Module;
import kdm.code.NamespaceUnit;
import kdm.code.OctetType;
import kdm.code.OctetstringType;
import kdm.code.OrdinalType;
import kdm.code.ParameterKind;
import kdm.code.ParameterTo;
import kdm.code.ParameterUnit;
import kdm.code.PointerType;
import kdm.code.PreprocessorDirective;
import kdm.code.PrimitiveType;
import kdm.code.RangeType;
import kdm.code.RecordType;
import kdm.code.Redefines;
import kdm.code.ScaledType;
import kdm.code.SequenceType;
import kdm.code.SetType;
import kdm.code.SharedUnit;
import kdm.code.Signature;
import kdm.code.StorableKind;
import kdm.code.StorableUnit;
import kdm.code.StringType;
import kdm.code.SynonymType;
import kdm.code.TemplateParameter;
import kdm.code.TemplateType;
import kdm.code.TemplateUnit;
import kdm.code.TimeType;
import kdm.code.TypeUnit;
import kdm.code.Value;
import kdm.code.ValueList;
import kdm.code.VariantTo;
import kdm.code.VisibleIn;
import kdm.code.VoidType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/code"); 
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
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
			case CodePackage.CONTROL_ELEMENT: return createControlElement();
			case CodePackage.METHOD_UNIT: return createMethodUnit();
			case CodePackage.MODULE: return createModule();
			case CodePackage.CODE_ASSEMBLY: return createCodeAssembly();
			case CodePackage.CALLABLE_UNIT: return createCallableUnit();
			case CodePackage.TEMPLATE_UNIT: return createTemplateUnit();
			case CodePackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case CodePackage.INSTANCE_OF: return createInstanceOf();
			case CodePackage.COMPILATION_UNIT: return createCompilationUnit();
			case CodePackage.CODE_MODEL: return createCodeModel();
			case CodePackage.DERIVED_TYPE: return createDerivedType();
			case CodePackage.ARRAY_TYPE: return createArrayType();
			case CodePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case CodePackage.BOOLEAN_TYPE: return createBooleanType();
			case CodePackage.CHAR_TYPE: return createCharType();
			case CodePackage.CLASS_UNIT: return createClassUnit();
			case CodePackage.COMPOSITE_TYPE: return createCompositeType();
			case CodePackage.RECORD_TYPE: return createRecordType();
			case CodePackage.ENUMERATED_TYPE: return createEnumeratedType();
			case CodePackage.EXTENDS: return createExtends();
			case CodePackage.SCALED_TYPE: return createScaledType();
			case CodePackage.FLOAT_TYPE: return createFloatType();
			case CodePackage.HAS_TYPE: return createHasType();
			case CodePackage.IMPLEMENTATION_OF: return createImplementationOf();
			case CodePackage.IMPLEMENTS: return createImplements();
			case CodePackage.INTEGER_TYPE: return createIntegerType();
			case CodePackage.INTERFACE_UNIT: return createInterfaceUnit();
			case CodePackage.POINTER_TYPE: return createPointerType();
			case CodePackage.TYPE_UNIT: return createTypeUnit();
			case CodePackage.RANGE_TYPE: return createRangeType();
			case CodePackage.SIGNATURE: return createSignature();
			case CodePackage.DATA_ELEMENT: return createDataElement();
			case CodePackage.STRING_TYPE: return createStringType();
			case CodePackage.CHOICE_TYPE: return createChoiceType();
			case CodePackage.NAMESPACE_UNIT: return createNamespaceUnit();
			case CodePackage.VISIBLE_IN: return createVisibleIn();
			case CodePackage.COMMENT_UNIT: return createCommentUnit();
			case CodePackage.SHARED_UNIT: return createSharedUnit();
			case CodePackage.DECIMAL_TYPE: return createDecimalType();
			case CodePackage.DATE_TYPE: return createDateType();
			case CodePackage.TIME_TYPE: return createTimeType();
			case CodePackage.VOID_TYPE: return createVoidType();
			case CodePackage.VALUE: return createValue();
			case CodePackage.VALUE_LIST: return createValueList();
			case CodePackage.STORABLE_UNIT: return createStorableUnit();
			case CodePackage.MEMBER_UNIT: return createMemberUnit();
			case CodePackage.PARAMETER_UNIT: return createParameterUnit();
			case CodePackage.ITEM_UNIT: return createItemUnit();
			case CodePackage.INDEX_UNIT: return createIndexUnit();
			case CodePackage.SYNONYM_TYPE: return createSynonymType();
			case CodePackage.SEQUENCE_TYPE: return createSequenceType();
			case CodePackage.BAG_TYPE: return createBagType();
			case CodePackage.SET_TYPE: return createSetType();
			case CodePackage.CODE_ELEMENT: return createCodeElement();
			case CodePackage.CODE_RELATIONSHIP: return createCodeRelationship();
			case CodePackage.LANGUAGE_UNIT: return createLanguageUnit();
			case CodePackage.ORDINAL_TYPE: return createOrdinalType();
			case CodePackage.BITSTRING_TYPE: return createBitstringType();
			case CodePackage.OCTET_TYPE: return createOctetType();
			case CodePackage.OCTETSTRING_TYPE: return createOctetstringType();
			case CodePackage.BIT_TYPE: return createBitType();
			case CodePackage.IMPORTS: return createImports();
			case CodePackage.PACKAGE: return createPackage();
			case CodePackage.PARAMETER_TO: return createParameterTo();
			case CodePackage.TEMPLATE_TYPE: return createTemplateType();
			case CodePackage.PREPROCESSOR_DIRECTIVE: return createPreprocessorDirective();
			case CodePackage.MACRO_DIRECTIVE: return createMacroDirective();
			case CodePackage.MACRO_UNIT: return createMacroUnit();
			case CodePackage.CONDITIONAL_DIRECTIVE: return createConditionalDirective();
			case CodePackage.INCLUDE_DIRECTIVE: return createIncludeDirective();
			case CodePackage.VARIANT_TO: return createVariantTo();
			case CodePackage.EXPANDS: return createExpands();
			case CodePackage.REDEFINES: return createRedefines();
			case CodePackage.GENERATED_FROM: return createGeneratedFrom();
			case CodePackage.INCLUDES: return createIncludes();
			case CodePackage.HAS_VALUE: return createHasValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CodePackage.METHOD_KIND:
				return createMethodKindFromString(eDataType, initialValue);
			case CodePackage.PARAMETER_KIND:
				return createParameterKindFromString(eDataType, initialValue);
			case CodePackage.EXPORT_KIND:
				return createExportKindFromString(eDataType, initialValue);
			case CodePackage.STORABLE_KIND:
				return createStorableKindFromString(eDataType, initialValue);
			case CodePackage.CALLABLE_KIND:
				return createCallableKindFromString(eDataType, initialValue);
			case CodePackage.MACRO_KIND:
				return createMacroKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CodePackage.METHOD_KIND:
				return convertMethodKindToString(eDataType, instanceValue);
			case CodePackage.PARAMETER_KIND:
				return convertParameterKindToString(eDataType, instanceValue);
			case CodePackage.EXPORT_KIND:
				return convertExportKindToString(eDataType, instanceValue);
			case CodePackage.STORABLE_KIND:
				return convertStorableKindToString(eDataType, instanceValue);
			case CodePackage.CALLABLE_KIND:
				return convertCallableKindToString(eDataType, instanceValue);
			case CodePackage.MACRO_KIND:
				return convertMacroKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlElement createControlElement() {
		ControlElementImpl controlElement = new ControlElementImpl();
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodUnit createMethodUnit() {
		MethodUnitImpl methodUnit = new MethodUnitImpl();
		return methodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAssembly createCodeAssembly() {
		CodeAssemblyImpl codeAssembly = new CodeAssemblyImpl();
		return codeAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableUnit createCallableUnit() {
		CallableUnitImpl callableUnit = new CallableUnitImpl();
		return callableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateUnit createTemplateUnit() {
		TemplateUnitImpl templateUnit = new TemplateUnitImpl();
		return templateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceOf createInstanceOf() {
		InstanceOfImpl instanceOf = new InstanceOfImpl();
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeModel createCodeModel() {
		CodeModelImpl codeModel = new CodeModelImpl();
		return codeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType createDerivedType() {
		DerivedTypeImpl derivedType = new DerivedTypeImpl();
		return derivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharType createCharType() {
		CharTypeImpl charType = new CharTypeImpl();
		return charType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUnit createClassUnit() {
		ClassUnitImpl classUnit = new ClassUnitImpl();
		return classUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordType createRecordType() {
		RecordTypeImpl recordType = new RecordTypeImpl();
		return recordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedType createEnumeratedType() {
		EnumeratedTypeImpl enumeratedType = new EnumeratedTypeImpl();
		return enumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extends createExtends() {
		ExtendsImpl extends_ = new ExtendsImpl();
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledType createScaledType() {
		ScaledTypeImpl scaledType = new ScaledTypeImpl();
		return scaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasType createHasType() {
		HasTypeImpl hasType = new HasTypeImpl();
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationOf createImplementationOf() {
		ImplementationOfImpl implementationOf = new ImplementationOfImpl();
		return implementationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implements createImplements() {
		ImplementsImpl implements_ = new ImplementsImpl();
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceUnit createInterfaceUnit() {
		InterfaceUnitImpl interfaceUnit = new InterfaceUnitImpl();
		return interfaceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUnit createTypeUnit() {
		TypeUnitImpl typeUnit = new TypeUnitImpl();
		return typeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType createChoiceType() {
		ChoiceTypeImpl choiceType = new ChoiceTypeImpl();
		return choiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceUnit createNamespaceUnit() {
		NamespaceUnitImpl namespaceUnit = new NamespaceUnitImpl();
		return namespaceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleIn createVisibleIn() {
		VisibleInImpl visibleIn = new VisibleInImpl();
		return visibleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentUnit createCommentUnit() {
		CommentUnitImpl commentUnit = new CommentUnitImpl();
		return commentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedUnit createSharedUnit() {
		SharedUnitImpl sharedUnit = new SharedUnitImpl();
		return sharedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalType createDecimalType() {
		DecimalTypeImpl decimalType = new DecimalTypeImpl();
		return decimalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueList createValueList() {
		ValueListImpl valueList = new ValueListImpl();
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableUnit createStorableUnit() {
		StorableUnitImpl storableUnit = new StorableUnitImpl();
		return storableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberUnit createMemberUnit() {
		MemberUnitImpl memberUnit = new MemberUnitImpl();
		return memberUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUnit createParameterUnit() {
		ParameterUnitImpl parameterUnit = new ParameterUnitImpl();
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemUnit createItemUnit() {
		ItemUnitImpl itemUnit = new ItemUnitImpl();
		return itemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit createIndexUnit() {
		IndexUnitImpl indexUnit = new IndexUnitImpl();
		return indexUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynonymType createSynonymType() {
		SynonymTypeImpl synonymType = new SynonymTypeImpl();
		return synonymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeElement createCodeElement() {
		CodeElementImpl codeElement = new CodeElementImpl();
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeRelationship createCodeRelationship() {
		CodeRelationshipImpl codeRelationship = new CodeRelationshipImpl();
		return codeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageUnit createLanguageUnit() {
		LanguageUnitImpl languageUnit = new LanguageUnitImpl();
		return languageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalType createOrdinalType() {
		OrdinalTypeImpl ordinalType = new OrdinalTypeImpl();
		return ordinalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitstringType createBitstringType() {
		BitstringTypeImpl bitstringType = new BitstringTypeImpl();
		return bitstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctetType createOctetType() {
		OctetTypeImpl octetType = new OctetTypeImpl();
		return octetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctetstringType createOctetstringType() {
		OctetstringTypeImpl octetstringType = new OctetstringTypeImpl();
		return octetstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitType createBitType() {
		BitTypeImpl bitType = new BitTypeImpl();
		return bitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kdm.code.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTo createParameterTo() {
		ParameterToImpl parameterTo = new ParameterToImpl();
		return parameterTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType createTemplateType() {
		TemplateTypeImpl templateType = new TemplateTypeImpl();
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessorDirective createPreprocessorDirective() {
		PreprocessorDirectiveImpl preprocessorDirective = new PreprocessorDirectiveImpl();
		return preprocessorDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroDirective createMacroDirective() {
		MacroDirectiveImpl macroDirective = new MacroDirectiveImpl();
		return macroDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroUnit createMacroUnit() {
		MacroUnitImpl macroUnit = new MacroUnitImpl();
		return macroUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDirective createConditionalDirective() {
		ConditionalDirectiveImpl conditionalDirective = new ConditionalDirectiveImpl();
		return conditionalDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeDirective createIncludeDirective() {
		IncludeDirectiveImpl includeDirective = new IncludeDirectiveImpl();
		return includeDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantTo createVariantTo() {
		VariantToImpl variantTo = new VariantToImpl();
		return variantTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expands createExpands() {
		ExpandsImpl expands = new ExpandsImpl();
		return expands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redefines createRedefines() {
		RedefinesImpl redefines = new RedefinesImpl();
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFrom createGeneratedFrom() {
		GeneratedFromImpl generatedFrom = new GeneratedFromImpl();
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasValue createHasValue() {
		HasValueImpl hasValue = new HasValueImpl();
		return hasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodKind createMethodKindFromString(EDataType eDataType, String initialValue) {
		MethodKind result = MethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
		ParameterKind result = ParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportKind createExportKindFromString(EDataType eDataType, String initialValue) {
		ExportKind result = ExportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableKind createStorableKindFromString(EDataType eDataType, String initialValue) {
		StorableKind result = StorableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableKind createCallableKindFromString(EDataType eDataType, String initialValue) {
		CallableKind result = CallableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroKind createMacroKindFromString(EDataType eDataType, String initialValue) {
		MacroKind result = MacroKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacroKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackage getCodePackage() {
		return (CodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
