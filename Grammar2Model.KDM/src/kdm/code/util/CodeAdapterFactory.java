/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code.util;

import kdm.code.AbstractCodeElement;
import kdm.code.AbstractCodeRelationship;
import kdm.code.ArrayType;
import kdm.code.BagType;
import kdm.code.BitType;
import kdm.code.BitstringType;
import kdm.code.BooleanType;
import kdm.code.CallableUnit;
import kdm.code.CharType;
import kdm.code.ChoiceType;
import kdm.code.ClassUnit;
import kdm.code.CodeAssembly;
import kdm.code.CodeElement;
import kdm.code.CodeItem;
import kdm.code.CodeModel;
import kdm.code.CodePackage;
import kdm.code.CodeRelationship;
import kdm.code.CommentUnit;
import kdm.code.CompilationUnit;
import kdm.code.CompositeType;
import kdm.code.ComputationalObject;
import kdm.code.ConditionalDirective;
import kdm.code.ControlElement;
import kdm.code.DataElement;
import kdm.code.Datatype;
import kdm.code.DateType;
import kdm.code.DecimalType;
import kdm.code.DefinedType;
import kdm.code.DerivedType;
import kdm.code.EnumeratedType;
import kdm.code.Expands;
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
import kdm.code.MacroUnit;
import kdm.code.MemberUnit;
import kdm.code.MethodUnit;
import kdm.code.Module;
import kdm.code.NamespaceUnit;
import kdm.code.OctetType;
import kdm.code.OctetstringType;
import kdm.code.OrdinalType;
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
import kdm.code.StorableUnit;
import kdm.code.StringType;
import kdm.code.SynonymType;
import kdm.code.TemplateParameter;
import kdm.code.TemplateType;
import kdm.code.TemplateUnit;
import kdm.code.TimeType;
import kdm.code.TypeUnit;
import kdm.code.Value;
import kdm.code.ValueElement;
import kdm.code.ValueList;
import kdm.code.VariantTo;
import kdm.code.VisibleIn;
import kdm.code.VoidType;

import kdm.core.Element;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;
import kdm.core.ModelElement;

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
 * @see kdm.code.CodePackage
 * @generated
 */
public class CodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
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
	protected CodeSwitch<Adapter> modelSwitch =
		new CodeSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCodeElement(AbstractCodeElement object) {
				return createAbstractCodeElementAdapter();
			}
			@Override
			public Adapter caseCodeItem(CodeItem object) {
				return createCodeItemAdapter();
			}
			@Override
			public Adapter caseComputationalObject(ComputationalObject object) {
				return createComputationalObjectAdapter();
			}
			@Override
			public Adapter caseControlElement(ControlElement object) {
				return createControlElementAdapter();
			}
			@Override
			public Adapter caseMethodUnit(MethodUnit object) {
				return createMethodUnitAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseCodeAssembly(CodeAssembly object) {
				return createCodeAssemblyAdapter();
			}
			@Override
			public Adapter caseCallableUnit(CallableUnit object) {
				return createCallableUnitAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseTemplateUnit(TemplateUnit object) {
				return createTemplateUnitAdapter();
			}
			@Override
			public Adapter caseTemplateParameter(TemplateParameter object) {
				return createTemplateParameterAdapter();
			}
			@Override
			public Adapter caseAbstractCodeRelationship(AbstractCodeRelationship object) {
				return createAbstractCodeRelationshipAdapter();
			}
			@Override
			public Adapter caseInstanceOf(InstanceOf object) {
				return createInstanceOfAdapter();
			}
			@Override
			public Adapter caseCompilationUnit(CompilationUnit object) {
				return createCompilationUnitAdapter();
			}
			@Override
			public Adapter caseCodeModel(CodeModel object) {
				return createCodeModelAdapter();
			}
			@Override
			public Adapter caseDerivedType(DerivedType object) {
				return createDerivedTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseCharType(CharType object) {
				return createCharTypeAdapter();
			}
			@Override
			public Adapter caseClassUnit(ClassUnit object) {
				return createClassUnitAdapter();
			}
			@Override
			public Adapter caseCompositeType(CompositeType object) {
				return createCompositeTypeAdapter();
			}
			@Override
			public Adapter caseRecordType(RecordType object) {
				return createRecordTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedType(EnumeratedType object) {
				return createEnumeratedTypeAdapter();
			}
			@Override
			public Adapter caseExtends(Extends object) {
				return createExtendsAdapter();
			}
			@Override
			public Adapter caseScaledType(ScaledType object) {
				return createScaledTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseHasType(HasType object) {
				return createHasTypeAdapter();
			}
			@Override
			public Adapter caseImplementationOf(ImplementationOf object) {
				return createImplementationOfAdapter();
			}
			@Override
			public Adapter caseImplements(Implements object) {
				return createImplementsAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceUnit(InterfaceUnit object) {
				return createInterfaceUnitAdapter();
			}
			@Override
			public Adapter casePointerType(PointerType object) {
				return createPointerTypeAdapter();
			}
			@Override
			public Adapter caseDefinedType(DefinedType object) {
				return createDefinedTypeAdapter();
			}
			@Override
			public Adapter caseTypeUnit(TypeUnit object) {
				return createTypeUnitAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseDataElement(DataElement object) {
				return createDataElementAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseChoiceType(ChoiceType object) {
				return createChoiceTypeAdapter();
			}
			@Override
			public Adapter caseNamespaceUnit(NamespaceUnit object) {
				return createNamespaceUnitAdapter();
			}
			@Override
			public Adapter caseVisibleIn(VisibleIn object) {
				return createVisibleInAdapter();
			}
			@Override
			public Adapter caseCommentUnit(CommentUnit object) {
				return createCommentUnitAdapter();
			}
			@Override
			public Adapter caseSharedUnit(SharedUnit object) {
				return createSharedUnitAdapter();
			}
			@Override
			public Adapter caseDecimalType(DecimalType object) {
				return createDecimalTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseValueElement(ValueElement object) {
				return createValueElementAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValueList(ValueList object) {
				return createValueListAdapter();
			}
			@Override
			public Adapter caseStorableUnit(StorableUnit object) {
				return createStorableUnitAdapter();
			}
			@Override
			public Adapter caseMemberUnit(MemberUnit object) {
				return createMemberUnitAdapter();
			}
			@Override
			public Adapter caseParameterUnit(ParameterUnit object) {
				return createParameterUnitAdapter();
			}
			@Override
			public Adapter caseItemUnit(ItemUnit object) {
				return createItemUnitAdapter();
			}
			@Override
			public Adapter caseIndexUnit(IndexUnit object) {
				return createIndexUnitAdapter();
			}
			@Override
			public Adapter caseSynonymType(SynonymType object) {
				return createSynonymTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseCodeElement(CodeElement object) {
				return createCodeElementAdapter();
			}
			@Override
			public Adapter caseCodeRelationship(CodeRelationship object) {
				return createCodeRelationshipAdapter();
			}
			@Override
			public Adapter caseLanguageUnit(LanguageUnit object) {
				return createLanguageUnitAdapter();
			}
			@Override
			public Adapter caseOrdinalType(OrdinalType object) {
				return createOrdinalTypeAdapter();
			}
			@Override
			public Adapter caseBitstringType(BitstringType object) {
				return createBitstringTypeAdapter();
			}
			@Override
			public Adapter caseOctetType(OctetType object) {
				return createOctetTypeAdapter();
			}
			@Override
			public Adapter caseOctetstringType(OctetstringType object) {
				return createOctetstringTypeAdapter();
			}
			@Override
			public Adapter caseBitType(BitType object) {
				return createBitTypeAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter casePackage(kdm.code.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseParameterTo(ParameterTo object) {
				return createParameterToAdapter();
			}
			@Override
			public Adapter caseTemplateType(TemplateType object) {
				return createTemplateTypeAdapter();
			}
			@Override
			public Adapter casePreprocessorDirective(PreprocessorDirective object) {
				return createPreprocessorDirectiveAdapter();
			}
			@Override
			public Adapter caseMacroDirective(MacroDirective object) {
				return createMacroDirectiveAdapter();
			}
			@Override
			public Adapter caseMacroUnit(MacroUnit object) {
				return createMacroUnitAdapter();
			}
			@Override
			public Adapter caseConditionalDirective(ConditionalDirective object) {
				return createConditionalDirectiveAdapter();
			}
			@Override
			public Adapter caseIncludeDirective(IncludeDirective object) {
				return createIncludeDirectiveAdapter();
			}
			@Override
			public Adapter caseVariantTo(VariantTo object) {
				return createVariantToAdapter();
			}
			@Override
			public Adapter caseExpands(Expands object) {
				return createExpandsAdapter();
			}
			@Override
			public Adapter caseRedefines(Redefines object) {
				return createRedefinesAdapter();
			}
			@Override
			public Adapter caseGeneratedFrom(GeneratedFrom object) {
				return createGeneratedFromAdapter();
			}
			@Override
			public Adapter caseIncludes(Includes object) {
				return createIncludesAdapter();
			}
			@Override
			public Adapter caseHasValue(HasValue object) {
				return createHasValueAdapter();
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
			public Adapter caseKDMRelationship(KDMRelationship object) {
				return createKDMRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link kdm.code.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.AbstractCodeElement
	 * @generated
	 */
	public Adapter createAbstractCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CodeItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CodeItem
	 * @generated
	 */
	public Adapter createCodeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ComputationalObject
	 * @generated
	 */
	public Adapter createComputationalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ControlElement
	 * @generated
	 */
	public Adapter createControlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.MethodUnit
	 * @generated
	 */
	public Adapter createMethodUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CodeAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CodeAssembly
	 * @generated
	 */
	public Adapter createCodeAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CallableUnit
	 * @generated
	 */
	public Adapter createCallableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.TemplateUnit
	 * @generated
	 */
	public Adapter createTemplateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.AbstractCodeRelationship
	 * @generated
	 */
	public Adapter createAbstractCodeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.InstanceOf
	 * @generated
	 */
	public Adapter createInstanceOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CodeModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CodeModel
	 * @generated
	 */
	public Adapter createCodeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.DerivedType
	 * @generated
	 */
	public Adapter createDerivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CharType
	 * @generated
	 */
	public Adapter createCharTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ClassUnit
	 * @generated
	 */
	public Adapter createClassUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CompositeType
	 * @generated
	 */
	public Adapter createCompositeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.RecordType
	 * @generated
	 */
	public Adapter createRecordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.EnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.EnumeratedType
	 * @generated
	 */
	public Adapter createEnumeratedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Extends
	 * @generated
	 */
	public Adapter createExtendsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ScaledType <em>Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ScaledType
	 * @generated
	 */
	public Adapter createScaledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.FloatType
	 * @generated
	 */
	public Adapter createFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.HasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.HasType
	 * @generated
	 */
	public Adapter createHasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ImplementationOf
	 * @generated
	 */
	public Adapter createImplementationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Implements
	 * @generated
	 */
	public Adapter createImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.InterfaceUnit
	 * @generated
	 */
	public Adapter createInterfaceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.DefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.DefinedType
	 * @generated
	 */
	public Adapter createDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.TypeUnit <em>Type Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.TypeUnit
	 * @generated
	 */
	public Adapter createTypeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.DataElement
	 * @generated
	 */
	public Adapter createDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ChoiceType <em>Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ChoiceType
	 * @generated
	 */
	public Adapter createChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.NamespaceUnit <em>Namespace Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.NamespaceUnit
	 * @generated
	 */
	public Adapter createNamespaceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.VisibleIn <em>Visible In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.VisibleIn
	 * @generated
	 */
	public Adapter createVisibleInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CommentUnit
	 * @generated
	 */
	public Adapter createCommentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.SharedUnit <em>Shared Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.SharedUnit
	 * @generated
	 */
	public Adapter createSharedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.DecimalType
	 * @generated
	 */
	public Adapter createDecimalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ValueElement
	 * @generated
	 */
	public Adapter createValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ValueList
	 * @generated
	 */
	public Adapter createValueListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.StorableUnit
	 * @generated
	 */
	public Adapter createStorableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.MemberUnit <em>Member Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.MemberUnit
	 * @generated
	 */
	public Adapter createMemberUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ParameterUnit
	 * @generated
	 */
	public Adapter createParameterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ItemUnit <em>Item Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ItemUnit
	 * @generated
	 */
	public Adapter createItemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.IndexUnit
	 * @generated
	 */
	public Adapter createIndexUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.SynonymType <em>Synonym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.SynonymType
	 * @generated
	 */
	public Adapter createSynonymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CodeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CodeElement
	 * @generated
	 */
	public Adapter createCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.CodeRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.CodeRelationship
	 * @generated
	 */
	public Adapter createCodeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.LanguageUnit <em>Language Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.LanguageUnit
	 * @generated
	 */
	public Adapter createLanguageUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.OrdinalType <em>Ordinal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.OrdinalType
	 * @generated
	 */
	public Adapter createOrdinalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.BitstringType <em>Bitstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.BitstringType
	 * @generated
	 */
	public Adapter createBitstringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.OctetType <em>Octet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.OctetType
	 * @generated
	 */
	public Adapter createOctetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.OctetstringType <em>Octetstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.OctetstringType
	 * @generated
	 */
	public Adapter createOctetstringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.BitType <em>Bit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.BitType
	 * @generated
	 */
	public Adapter createBitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ParameterTo <em>Parameter To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ParameterTo
	 * @generated
	 */
	public Adapter createParameterToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.TemplateType
	 * @generated
	 */
	public Adapter createTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.PreprocessorDirective <em>Preprocessor Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.PreprocessorDirective
	 * @generated
	 */
	public Adapter createPreprocessorDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.MacroDirective <em>Macro Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.MacroDirective
	 * @generated
	 */
	public Adapter createMacroDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.MacroUnit <em>Macro Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.MacroUnit
	 * @generated
	 */
	public Adapter createMacroUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.ConditionalDirective <em>Conditional Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.ConditionalDirective
	 * @generated
	 */
	public Adapter createConditionalDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.IncludeDirective <em>Include Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.IncludeDirective
	 * @generated
	 */
	public Adapter createIncludeDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.VariantTo <em>Variant To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.VariantTo
	 * @generated
	 */
	public Adapter createVariantToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Expands <em>Expands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Expands
	 * @generated
	 */
	public Adapter createExpandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Redefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Redefines
	 * @generated
	 */
	public Adapter createRedefinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.GeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.GeneratedFrom
	 * @generated
	 */
	public Adapter createGeneratedFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.Includes
	 * @generated
	 */
	public Adapter createIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kdm.code.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kdm.code.HasValue
	 * @generated
	 */
	public Adapter createHasValueAdapter() {
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

} //CodeAdapterFactory
