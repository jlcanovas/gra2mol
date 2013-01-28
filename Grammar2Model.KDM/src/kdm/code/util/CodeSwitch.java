/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code.util;

import java.util.List;

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
 * @see kdm.code.CodePackage
 * @generated
 */
public class CodeSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSwitch() {
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
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
			case CodePackage.ABSTRACT_CODE_ELEMENT: {
				AbstractCodeElement abstractCodeElement = (AbstractCodeElement)theEObject;
				T result = caseAbstractCodeElement(abstractCodeElement);
				if (result == null) result = caseKDMEntity(abstractCodeElement);
				if (result == null) result = caseModelElement(abstractCodeElement);
				if (result == null) result = caseElement(abstractCodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_ITEM: {
				CodeItem codeItem = (CodeItem)theEObject;
				T result = caseCodeItem(codeItem);
				if (result == null) result = caseAbstractCodeElement(codeItem);
				if (result == null) result = caseKDMEntity(codeItem);
				if (result == null) result = caseModelElement(codeItem);
				if (result == null) result = caseElement(codeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.COMPUTATIONAL_OBJECT: {
				ComputationalObject computationalObject = (ComputationalObject)theEObject;
				T result = caseComputationalObject(computationalObject);
				if (result == null) result = caseCodeItem(computationalObject);
				if (result == null) result = caseAbstractCodeElement(computationalObject);
				if (result == null) result = caseKDMEntity(computationalObject);
				if (result == null) result = caseModelElement(computationalObject);
				if (result == null) result = caseElement(computationalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CONTROL_ELEMENT: {
				ControlElement controlElement = (ControlElement)theEObject;
				T result = caseControlElement(controlElement);
				if (result == null) result = caseComputationalObject(controlElement);
				if (result == null) result = caseCodeItem(controlElement);
				if (result == null) result = caseAbstractCodeElement(controlElement);
				if (result == null) result = caseKDMEntity(controlElement);
				if (result == null) result = caseModelElement(controlElement);
				if (result == null) result = caseElement(controlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.METHOD_UNIT: {
				MethodUnit methodUnit = (MethodUnit)theEObject;
				T result = caseMethodUnit(methodUnit);
				if (result == null) result = caseControlElement(methodUnit);
				if (result == null) result = caseComputationalObject(methodUnit);
				if (result == null) result = caseCodeItem(methodUnit);
				if (result == null) result = caseAbstractCodeElement(methodUnit);
				if (result == null) result = caseKDMEntity(methodUnit);
				if (result == null) result = caseModelElement(methodUnit);
				if (result == null) result = caseElement(methodUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseCodeItem(module);
				if (result == null) result = caseAbstractCodeElement(module);
				if (result == null) result = caseKDMEntity(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_ASSEMBLY: {
				CodeAssembly codeAssembly = (CodeAssembly)theEObject;
				T result = caseCodeAssembly(codeAssembly);
				if (result == null) result = caseModule(codeAssembly);
				if (result == null) result = caseCodeItem(codeAssembly);
				if (result == null) result = caseAbstractCodeElement(codeAssembly);
				if (result == null) result = caseKDMEntity(codeAssembly);
				if (result == null) result = caseModelElement(codeAssembly);
				if (result == null) result = caseElement(codeAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CALLABLE_UNIT: {
				CallableUnit callableUnit = (CallableUnit)theEObject;
				T result = caseCallableUnit(callableUnit);
				if (result == null) result = caseControlElement(callableUnit);
				if (result == null) result = caseComputationalObject(callableUnit);
				if (result == null) result = caseCodeItem(callableUnit);
				if (result == null) result = caseAbstractCodeElement(callableUnit);
				if (result == null) result = caseKDMEntity(callableUnit);
				if (result == null) result = caseModelElement(callableUnit);
				if (result == null) result = caseElement(callableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseCodeItem(datatype);
				if (result == null) result = caseAbstractCodeElement(datatype);
				if (result == null) result = caseKDMEntity(datatype);
				if (result == null) result = caseModelElement(datatype);
				if (result == null) result = caseElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TEMPLATE_UNIT: {
				TemplateUnit templateUnit = (TemplateUnit)theEObject;
				T result = caseTemplateUnit(templateUnit);
				if (result == null) result = caseDatatype(templateUnit);
				if (result == null) result = caseCodeItem(templateUnit);
				if (result == null) result = caseAbstractCodeElement(templateUnit);
				if (result == null) result = caseKDMEntity(templateUnit);
				if (result == null) result = caseModelElement(templateUnit);
				if (result == null) result = caseElement(templateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TEMPLATE_PARAMETER: {
				TemplateParameter templateParameter = (TemplateParameter)theEObject;
				T result = caseTemplateParameter(templateParameter);
				if (result == null) result = caseDatatype(templateParameter);
				if (result == null) result = caseCodeItem(templateParameter);
				if (result == null) result = caseAbstractCodeElement(templateParameter);
				if (result == null) result = caseKDMEntity(templateParameter);
				if (result == null) result = caseModelElement(templateParameter);
				if (result == null) result = caseElement(templateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ABSTRACT_CODE_RELATIONSHIP: {
				AbstractCodeRelationship abstractCodeRelationship = (AbstractCodeRelationship)theEObject;
				T result = caseAbstractCodeRelationship(abstractCodeRelationship);
				if (result == null) result = caseKDMRelationship(abstractCodeRelationship);
				if (result == null) result = caseModelElement(abstractCodeRelationship);
				if (result == null) result = caseElement(abstractCodeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INSTANCE_OF: {
				InstanceOf instanceOf = (InstanceOf)theEObject;
				T result = caseInstanceOf(instanceOf);
				if (result == null) result = caseAbstractCodeRelationship(instanceOf);
				if (result == null) result = caseKDMRelationship(instanceOf);
				if (result == null) result = caseModelElement(instanceOf);
				if (result == null) result = caseElement(instanceOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseModule(compilationUnit);
				if (result == null) result = caseCodeItem(compilationUnit);
				if (result == null) result = caseAbstractCodeElement(compilationUnit);
				if (result == null) result = caseKDMEntity(compilationUnit);
				if (result == null) result = caseModelElement(compilationUnit);
				if (result == null) result = caseElement(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_MODEL: {
				CodeModel codeModel = (CodeModel)theEObject;
				T result = caseCodeModel(codeModel);
				if (result == null) result = caseKDMModel(codeModel);
				if (result == null) result = caseKDMFramework(codeModel);
				if (result == null) result = caseModelElement(codeModel);
				if (result == null) result = caseElement(codeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DERIVED_TYPE: {
				DerivedType derivedType = (DerivedType)theEObject;
				T result = caseDerivedType(derivedType);
				if (result == null) result = caseDatatype(derivedType);
				if (result == null) result = caseCodeItem(derivedType);
				if (result == null) result = caseAbstractCodeElement(derivedType);
				if (result == null) result = caseKDMEntity(derivedType);
				if (result == null) result = caseModelElement(derivedType);
				if (result == null) result = caseElement(derivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseDerivedType(arrayType);
				if (result == null) result = caseDatatype(arrayType);
				if (result == null) result = caseCodeItem(arrayType);
				if (result == null) result = caseAbstractCodeElement(arrayType);
				if (result == null) result = caseKDMEntity(arrayType);
				if (result == null) result = caseModelElement(arrayType);
				if (result == null) result = caseElement(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDatatype(primitiveType);
				if (result == null) result = caseCodeItem(primitiveType);
				if (result == null) result = caseAbstractCodeElement(primitiveType);
				if (result == null) result = caseKDMEntity(primitiveType);
				if (result == null) result = caseModelElement(primitiveType);
				if (result == null) result = caseElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = casePrimitiveType(booleanType);
				if (result == null) result = caseDatatype(booleanType);
				if (result == null) result = caseCodeItem(booleanType);
				if (result == null) result = caseAbstractCodeElement(booleanType);
				if (result == null) result = caseKDMEntity(booleanType);
				if (result == null) result = caseModelElement(booleanType);
				if (result == null) result = caseElement(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CHAR_TYPE: {
				CharType charType = (CharType)theEObject;
				T result = caseCharType(charType);
				if (result == null) result = casePrimitiveType(charType);
				if (result == null) result = caseDatatype(charType);
				if (result == null) result = caseCodeItem(charType);
				if (result == null) result = caseAbstractCodeElement(charType);
				if (result == null) result = caseKDMEntity(charType);
				if (result == null) result = caseModelElement(charType);
				if (result == null) result = caseElement(charType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CLASS_UNIT: {
				ClassUnit classUnit = (ClassUnit)theEObject;
				T result = caseClassUnit(classUnit);
				if (result == null) result = caseDatatype(classUnit);
				if (result == null) result = caseCodeItem(classUnit);
				if (result == null) result = caseAbstractCodeElement(classUnit);
				if (result == null) result = caseKDMEntity(classUnit);
				if (result == null) result = caseModelElement(classUnit);
				if (result == null) result = caseElement(classUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.COMPOSITE_TYPE: {
				CompositeType compositeType = (CompositeType)theEObject;
				T result = caseCompositeType(compositeType);
				if (result == null) result = caseDatatype(compositeType);
				if (result == null) result = caseCodeItem(compositeType);
				if (result == null) result = caseAbstractCodeElement(compositeType);
				if (result == null) result = caseKDMEntity(compositeType);
				if (result == null) result = caseModelElement(compositeType);
				if (result == null) result = caseElement(compositeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.RECORD_TYPE: {
				RecordType recordType = (RecordType)theEObject;
				T result = caseRecordType(recordType);
				if (result == null) result = caseCompositeType(recordType);
				if (result == null) result = caseDatatype(recordType);
				if (result == null) result = caseCodeItem(recordType);
				if (result == null) result = caseAbstractCodeElement(recordType);
				if (result == null) result = caseKDMEntity(recordType);
				if (result == null) result = caseModelElement(recordType);
				if (result == null) result = caseElement(recordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ENUMERATED_TYPE: {
				EnumeratedType enumeratedType = (EnumeratedType)theEObject;
				T result = caseEnumeratedType(enumeratedType);
				if (result == null) result = caseDatatype(enumeratedType);
				if (result == null) result = caseCodeItem(enumeratedType);
				if (result == null) result = caseAbstractCodeElement(enumeratedType);
				if (result == null) result = caseKDMEntity(enumeratedType);
				if (result == null) result = caseModelElement(enumeratedType);
				if (result == null) result = caseElement(enumeratedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.EXTENDS: {
				Extends extends_ = (Extends)theEObject;
				T result = caseExtends(extends_);
				if (result == null) result = caseAbstractCodeRelationship(extends_);
				if (result == null) result = caseKDMRelationship(extends_);
				if (result == null) result = caseModelElement(extends_);
				if (result == null) result = caseElement(extends_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SCALED_TYPE: {
				ScaledType scaledType = (ScaledType)theEObject;
				T result = caseScaledType(scaledType);
				if (result == null) result = casePrimitiveType(scaledType);
				if (result == null) result = caseDatatype(scaledType);
				if (result == null) result = caseCodeItem(scaledType);
				if (result == null) result = caseAbstractCodeElement(scaledType);
				if (result == null) result = caseKDMEntity(scaledType);
				if (result == null) result = caseModelElement(scaledType);
				if (result == null) result = caseElement(scaledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = casePrimitiveType(floatType);
				if (result == null) result = caseDatatype(floatType);
				if (result == null) result = caseCodeItem(floatType);
				if (result == null) result = caseAbstractCodeElement(floatType);
				if (result == null) result = caseKDMEntity(floatType);
				if (result == null) result = caseModelElement(floatType);
				if (result == null) result = caseElement(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.HAS_TYPE: {
				HasType hasType = (HasType)theEObject;
				T result = caseHasType(hasType);
				if (result == null) result = caseAbstractCodeRelationship(hasType);
				if (result == null) result = caseKDMRelationship(hasType);
				if (result == null) result = caseModelElement(hasType);
				if (result == null) result = caseElement(hasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.IMPLEMENTATION_OF: {
				ImplementationOf implementationOf = (ImplementationOf)theEObject;
				T result = caseImplementationOf(implementationOf);
				if (result == null) result = caseAbstractCodeRelationship(implementationOf);
				if (result == null) result = caseKDMRelationship(implementationOf);
				if (result == null) result = caseModelElement(implementationOf);
				if (result == null) result = caseElement(implementationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.IMPLEMENTS: {
				Implements implements_ = (Implements)theEObject;
				T result = caseImplements(implements_);
				if (result == null) result = caseAbstractCodeRelationship(implements_);
				if (result == null) result = caseKDMRelationship(implements_);
				if (result == null) result = caseModelElement(implements_);
				if (result == null) result = caseElement(implements_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = casePrimitiveType(integerType);
				if (result == null) result = caseDatatype(integerType);
				if (result == null) result = caseCodeItem(integerType);
				if (result == null) result = caseAbstractCodeElement(integerType);
				if (result == null) result = caseKDMEntity(integerType);
				if (result == null) result = caseModelElement(integerType);
				if (result == null) result = caseElement(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INTERFACE_UNIT: {
				InterfaceUnit interfaceUnit = (InterfaceUnit)theEObject;
				T result = caseInterfaceUnit(interfaceUnit);
				if (result == null) result = caseDatatype(interfaceUnit);
				if (result == null) result = caseCodeItem(interfaceUnit);
				if (result == null) result = caseAbstractCodeElement(interfaceUnit);
				if (result == null) result = caseKDMEntity(interfaceUnit);
				if (result == null) result = caseModelElement(interfaceUnit);
				if (result == null) result = caseElement(interfaceUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.POINTER_TYPE: {
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = caseDerivedType(pointerType);
				if (result == null) result = caseDatatype(pointerType);
				if (result == null) result = caseCodeItem(pointerType);
				if (result == null) result = caseAbstractCodeElement(pointerType);
				if (result == null) result = caseKDMEntity(pointerType);
				if (result == null) result = caseModelElement(pointerType);
				if (result == null) result = caseElement(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DEFINED_TYPE: {
				DefinedType definedType = (DefinedType)theEObject;
				T result = caseDefinedType(definedType);
				if (result == null) result = caseDatatype(definedType);
				if (result == null) result = caseCodeItem(definedType);
				if (result == null) result = caseAbstractCodeElement(definedType);
				if (result == null) result = caseKDMEntity(definedType);
				if (result == null) result = caseModelElement(definedType);
				if (result == null) result = caseElement(definedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TYPE_UNIT: {
				TypeUnit typeUnit = (TypeUnit)theEObject;
				T result = caseTypeUnit(typeUnit);
				if (result == null) result = caseDefinedType(typeUnit);
				if (result == null) result = caseDatatype(typeUnit);
				if (result == null) result = caseCodeItem(typeUnit);
				if (result == null) result = caseAbstractCodeElement(typeUnit);
				if (result == null) result = caseKDMEntity(typeUnit);
				if (result == null) result = caseModelElement(typeUnit);
				if (result == null) result = caseElement(typeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = caseDerivedType(rangeType);
				if (result == null) result = caseDatatype(rangeType);
				if (result == null) result = caseCodeItem(rangeType);
				if (result == null) result = caseAbstractCodeElement(rangeType);
				if (result == null) result = caseKDMEntity(rangeType);
				if (result == null) result = caseModelElement(rangeType);
				if (result == null) result = caseElement(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseDatatype(signature);
				if (result == null) result = caseCodeItem(signature);
				if (result == null) result = caseAbstractCodeElement(signature);
				if (result == null) result = caseKDMEntity(signature);
				if (result == null) result = caseModelElement(signature);
				if (result == null) result = caseElement(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseComputationalObject(dataElement);
				if (result == null) result = caseCodeItem(dataElement);
				if (result == null) result = caseAbstractCodeElement(dataElement);
				if (result == null) result = caseKDMEntity(dataElement);
				if (result == null) result = caseModelElement(dataElement);
				if (result == null) result = caseElement(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = casePrimitiveType(stringType);
				if (result == null) result = caseDatatype(stringType);
				if (result == null) result = caseCodeItem(stringType);
				if (result == null) result = caseAbstractCodeElement(stringType);
				if (result == null) result = caseKDMEntity(stringType);
				if (result == null) result = caseModelElement(stringType);
				if (result == null) result = caseElement(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CHOICE_TYPE: {
				ChoiceType choiceType = (ChoiceType)theEObject;
				T result = caseChoiceType(choiceType);
				if (result == null) result = caseCompositeType(choiceType);
				if (result == null) result = caseDatatype(choiceType);
				if (result == null) result = caseCodeItem(choiceType);
				if (result == null) result = caseAbstractCodeElement(choiceType);
				if (result == null) result = caseKDMEntity(choiceType);
				if (result == null) result = caseModelElement(choiceType);
				if (result == null) result = caseElement(choiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.NAMESPACE_UNIT: {
				NamespaceUnit namespaceUnit = (NamespaceUnit)theEObject;
				T result = caseNamespaceUnit(namespaceUnit);
				if (result == null) result = caseCodeItem(namespaceUnit);
				if (result == null) result = caseAbstractCodeElement(namespaceUnit);
				if (result == null) result = caseKDMEntity(namespaceUnit);
				if (result == null) result = caseModelElement(namespaceUnit);
				if (result == null) result = caseElement(namespaceUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VISIBLE_IN: {
				VisibleIn visibleIn = (VisibleIn)theEObject;
				T result = caseVisibleIn(visibleIn);
				if (result == null) result = caseAbstractCodeRelationship(visibleIn);
				if (result == null) result = caseKDMRelationship(visibleIn);
				if (result == null) result = caseModelElement(visibleIn);
				if (result == null) result = caseElement(visibleIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.COMMENT_UNIT: {
				CommentUnit commentUnit = (CommentUnit)theEObject;
				T result = caseCommentUnit(commentUnit);
				if (result == null) result = caseModelElement(commentUnit);
				if (result == null) result = caseElement(commentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SHARED_UNIT: {
				SharedUnit sharedUnit = (SharedUnit)theEObject;
				T result = caseSharedUnit(sharedUnit);
				if (result == null) result = caseCompilationUnit(sharedUnit);
				if (result == null) result = caseModule(sharedUnit);
				if (result == null) result = caseCodeItem(sharedUnit);
				if (result == null) result = caseAbstractCodeElement(sharedUnit);
				if (result == null) result = caseKDMEntity(sharedUnit);
				if (result == null) result = caseModelElement(sharedUnit);
				if (result == null) result = caseElement(sharedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DECIMAL_TYPE: {
				DecimalType decimalType = (DecimalType)theEObject;
				T result = caseDecimalType(decimalType);
				if (result == null) result = casePrimitiveType(decimalType);
				if (result == null) result = caseDatatype(decimalType);
				if (result == null) result = caseCodeItem(decimalType);
				if (result == null) result = caseAbstractCodeElement(decimalType);
				if (result == null) result = caseKDMEntity(decimalType);
				if (result == null) result = caseModelElement(decimalType);
				if (result == null) result = caseElement(decimalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = casePrimitiveType(dateType);
				if (result == null) result = caseDatatype(dateType);
				if (result == null) result = caseCodeItem(dateType);
				if (result == null) result = caseAbstractCodeElement(dateType);
				if (result == null) result = caseKDMEntity(dateType);
				if (result == null) result = caseModelElement(dateType);
				if (result == null) result = caseElement(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = casePrimitiveType(timeType);
				if (result == null) result = caseDatatype(timeType);
				if (result == null) result = caseCodeItem(timeType);
				if (result == null) result = caseAbstractCodeElement(timeType);
				if (result == null) result = caseKDMEntity(timeType);
				if (result == null) result = caseModelElement(timeType);
				if (result == null) result = caseElement(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = casePrimitiveType(voidType);
				if (result == null) result = caseDatatype(voidType);
				if (result == null) result = caseCodeItem(voidType);
				if (result == null) result = caseAbstractCodeElement(voidType);
				if (result == null) result = caseKDMEntity(voidType);
				if (result == null) result = caseModelElement(voidType);
				if (result == null) result = caseElement(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VALUE_ELEMENT: {
				ValueElement valueElement = (ValueElement)theEObject;
				T result = caseValueElement(valueElement);
				if (result == null) result = caseDataElement(valueElement);
				if (result == null) result = caseComputationalObject(valueElement);
				if (result == null) result = caseCodeItem(valueElement);
				if (result == null) result = caseAbstractCodeElement(valueElement);
				if (result == null) result = caseKDMEntity(valueElement);
				if (result == null) result = caseModelElement(valueElement);
				if (result == null) result = caseElement(valueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseValueElement(value);
				if (result == null) result = caseDataElement(value);
				if (result == null) result = caseComputationalObject(value);
				if (result == null) result = caseCodeItem(value);
				if (result == null) result = caseAbstractCodeElement(value);
				if (result == null) result = caseKDMEntity(value);
				if (result == null) result = caseModelElement(value);
				if (result == null) result = caseElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VALUE_LIST: {
				ValueList valueList = (ValueList)theEObject;
				T result = caseValueList(valueList);
				if (result == null) result = caseValueElement(valueList);
				if (result == null) result = caseDataElement(valueList);
				if (result == null) result = caseComputationalObject(valueList);
				if (result == null) result = caseCodeItem(valueList);
				if (result == null) result = caseAbstractCodeElement(valueList);
				if (result == null) result = caseKDMEntity(valueList);
				if (result == null) result = caseModelElement(valueList);
				if (result == null) result = caseElement(valueList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.STORABLE_UNIT: {
				StorableUnit storableUnit = (StorableUnit)theEObject;
				T result = caseStorableUnit(storableUnit);
				if (result == null) result = caseDataElement(storableUnit);
				if (result == null) result = caseComputationalObject(storableUnit);
				if (result == null) result = caseCodeItem(storableUnit);
				if (result == null) result = caseAbstractCodeElement(storableUnit);
				if (result == null) result = caseKDMEntity(storableUnit);
				if (result == null) result = caseModelElement(storableUnit);
				if (result == null) result = caseElement(storableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.MEMBER_UNIT: {
				MemberUnit memberUnit = (MemberUnit)theEObject;
				T result = caseMemberUnit(memberUnit);
				if (result == null) result = caseDataElement(memberUnit);
				if (result == null) result = caseComputationalObject(memberUnit);
				if (result == null) result = caseCodeItem(memberUnit);
				if (result == null) result = caseAbstractCodeElement(memberUnit);
				if (result == null) result = caseKDMEntity(memberUnit);
				if (result == null) result = caseModelElement(memberUnit);
				if (result == null) result = caseElement(memberUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PARAMETER_UNIT: {
				ParameterUnit parameterUnit = (ParameterUnit)theEObject;
				T result = caseParameterUnit(parameterUnit);
				if (result == null) result = caseDataElement(parameterUnit);
				if (result == null) result = caseComputationalObject(parameterUnit);
				if (result == null) result = caseCodeItem(parameterUnit);
				if (result == null) result = caseAbstractCodeElement(parameterUnit);
				if (result == null) result = caseKDMEntity(parameterUnit);
				if (result == null) result = caseModelElement(parameterUnit);
				if (result == null) result = caseElement(parameterUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ITEM_UNIT: {
				ItemUnit itemUnit = (ItemUnit)theEObject;
				T result = caseItemUnit(itemUnit);
				if (result == null) result = caseDataElement(itemUnit);
				if (result == null) result = caseComputationalObject(itemUnit);
				if (result == null) result = caseCodeItem(itemUnit);
				if (result == null) result = caseAbstractCodeElement(itemUnit);
				if (result == null) result = caseKDMEntity(itemUnit);
				if (result == null) result = caseModelElement(itemUnit);
				if (result == null) result = caseElement(itemUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INDEX_UNIT: {
				IndexUnit indexUnit = (IndexUnit)theEObject;
				T result = caseIndexUnit(indexUnit);
				if (result == null) result = caseDataElement(indexUnit);
				if (result == null) result = caseComputationalObject(indexUnit);
				if (result == null) result = caseCodeItem(indexUnit);
				if (result == null) result = caseAbstractCodeElement(indexUnit);
				if (result == null) result = caseKDMEntity(indexUnit);
				if (result == null) result = caseModelElement(indexUnit);
				if (result == null) result = caseElement(indexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SYNONYM_TYPE: {
				SynonymType synonymType = (SynonymType)theEObject;
				T result = caseSynonymType(synonymType);
				if (result == null) result = caseDefinedType(synonymType);
				if (result == null) result = caseDatatype(synonymType);
				if (result == null) result = caseCodeItem(synonymType);
				if (result == null) result = caseAbstractCodeElement(synonymType);
				if (result == null) result = caseKDMEntity(synonymType);
				if (result == null) result = caseModelElement(synonymType);
				if (result == null) result = caseElement(synonymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseDerivedType(sequenceType);
				if (result == null) result = caseDatatype(sequenceType);
				if (result == null) result = caseCodeItem(sequenceType);
				if (result == null) result = caseAbstractCodeElement(sequenceType);
				if (result == null) result = caseKDMEntity(sequenceType);
				if (result == null) result = caseModelElement(sequenceType);
				if (result == null) result = caseElement(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.BAG_TYPE: {
				BagType bagType = (BagType)theEObject;
				T result = caseBagType(bagType);
				if (result == null) result = caseDerivedType(bagType);
				if (result == null) result = caseDatatype(bagType);
				if (result == null) result = caseCodeItem(bagType);
				if (result == null) result = caseAbstractCodeElement(bagType);
				if (result == null) result = caseKDMEntity(bagType);
				if (result == null) result = caseModelElement(bagType);
				if (result == null) result = caseElement(bagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = caseDerivedType(setType);
				if (result == null) result = caseDatatype(setType);
				if (result == null) result = caseCodeItem(setType);
				if (result == null) result = caseAbstractCodeElement(setType);
				if (result == null) result = caseKDMEntity(setType);
				if (result == null) result = caseModelElement(setType);
				if (result == null) result = caseElement(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_ELEMENT: {
				CodeElement codeElement = (CodeElement)theEObject;
				T result = caseCodeElement(codeElement);
				if (result == null) result = caseCodeItem(codeElement);
				if (result == null) result = caseAbstractCodeElement(codeElement);
				if (result == null) result = caseKDMEntity(codeElement);
				if (result == null) result = caseModelElement(codeElement);
				if (result == null) result = caseElement(codeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_RELATIONSHIP: {
				CodeRelationship codeRelationship = (CodeRelationship)theEObject;
				T result = caseCodeRelationship(codeRelationship);
				if (result == null) result = caseAbstractCodeRelationship(codeRelationship);
				if (result == null) result = caseKDMRelationship(codeRelationship);
				if (result == null) result = caseModelElement(codeRelationship);
				if (result == null) result = caseElement(codeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.LANGUAGE_UNIT: {
				LanguageUnit languageUnit = (LanguageUnit)theEObject;
				T result = caseLanguageUnit(languageUnit);
				if (result == null) result = caseModule(languageUnit);
				if (result == null) result = caseCodeItem(languageUnit);
				if (result == null) result = caseAbstractCodeElement(languageUnit);
				if (result == null) result = caseKDMEntity(languageUnit);
				if (result == null) result = caseModelElement(languageUnit);
				if (result == null) result = caseElement(languageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ORDINAL_TYPE: {
				OrdinalType ordinalType = (OrdinalType)theEObject;
				T result = caseOrdinalType(ordinalType);
				if (result == null) result = casePrimitiveType(ordinalType);
				if (result == null) result = caseDatatype(ordinalType);
				if (result == null) result = caseCodeItem(ordinalType);
				if (result == null) result = caseAbstractCodeElement(ordinalType);
				if (result == null) result = caseKDMEntity(ordinalType);
				if (result == null) result = caseModelElement(ordinalType);
				if (result == null) result = caseElement(ordinalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.BITSTRING_TYPE: {
				BitstringType bitstringType = (BitstringType)theEObject;
				T result = caseBitstringType(bitstringType);
				if (result == null) result = casePrimitiveType(bitstringType);
				if (result == null) result = caseDatatype(bitstringType);
				if (result == null) result = caseCodeItem(bitstringType);
				if (result == null) result = caseAbstractCodeElement(bitstringType);
				if (result == null) result = caseKDMEntity(bitstringType);
				if (result == null) result = caseModelElement(bitstringType);
				if (result == null) result = caseElement(bitstringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.OCTET_TYPE: {
				OctetType octetType = (OctetType)theEObject;
				T result = caseOctetType(octetType);
				if (result == null) result = casePrimitiveType(octetType);
				if (result == null) result = caseDatatype(octetType);
				if (result == null) result = caseCodeItem(octetType);
				if (result == null) result = caseAbstractCodeElement(octetType);
				if (result == null) result = caseKDMEntity(octetType);
				if (result == null) result = caseModelElement(octetType);
				if (result == null) result = caseElement(octetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.OCTETSTRING_TYPE: {
				OctetstringType octetstringType = (OctetstringType)theEObject;
				T result = caseOctetstringType(octetstringType);
				if (result == null) result = casePrimitiveType(octetstringType);
				if (result == null) result = caseDatatype(octetstringType);
				if (result == null) result = caseCodeItem(octetstringType);
				if (result == null) result = caseAbstractCodeElement(octetstringType);
				if (result == null) result = caseKDMEntity(octetstringType);
				if (result == null) result = caseModelElement(octetstringType);
				if (result == null) result = caseElement(octetstringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.BIT_TYPE: {
				BitType bitType = (BitType)theEObject;
				T result = caseBitType(bitType);
				if (result == null) result = casePrimitiveType(bitType);
				if (result == null) result = caseDatatype(bitType);
				if (result == null) result = caseCodeItem(bitType);
				if (result == null) result = caseAbstractCodeElement(bitType);
				if (result == null) result = caseKDMEntity(bitType);
				if (result == null) result = caseModelElement(bitType);
				if (result == null) result = caseElement(bitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = caseAbstractCodeRelationship(imports);
				if (result == null) result = caseKDMRelationship(imports);
				if (result == null) result = caseModelElement(imports);
				if (result == null) result = caseElement(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PACKAGE: {
				kdm.code.Package package_ = (kdm.code.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModule(package_);
				if (result == null) result = caseCodeItem(package_);
				if (result == null) result = caseAbstractCodeElement(package_);
				if (result == null) result = caseKDMEntity(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PARAMETER_TO: {
				ParameterTo parameterTo = (ParameterTo)theEObject;
				T result = caseParameterTo(parameterTo);
				if (result == null) result = caseAbstractCodeRelationship(parameterTo);
				if (result == null) result = caseKDMRelationship(parameterTo);
				if (result == null) result = caseModelElement(parameterTo);
				if (result == null) result = caseElement(parameterTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TEMPLATE_TYPE: {
				TemplateType templateType = (TemplateType)theEObject;
				T result = caseTemplateType(templateType);
				if (result == null) result = caseDatatype(templateType);
				if (result == null) result = caseCodeItem(templateType);
				if (result == null) result = caseAbstractCodeElement(templateType);
				if (result == null) result = caseKDMEntity(templateType);
				if (result == null) result = caseModelElement(templateType);
				if (result == null) result = caseElement(templateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PREPROCESSOR_DIRECTIVE: {
				PreprocessorDirective preprocessorDirective = (PreprocessorDirective)theEObject;
				T result = casePreprocessorDirective(preprocessorDirective);
				if (result == null) result = caseAbstractCodeElement(preprocessorDirective);
				if (result == null) result = caseKDMEntity(preprocessorDirective);
				if (result == null) result = caseModelElement(preprocessorDirective);
				if (result == null) result = caseElement(preprocessorDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.MACRO_DIRECTIVE: {
				MacroDirective macroDirective = (MacroDirective)theEObject;
				T result = caseMacroDirective(macroDirective);
				if (result == null) result = casePreprocessorDirective(macroDirective);
				if (result == null) result = caseAbstractCodeElement(macroDirective);
				if (result == null) result = caseKDMEntity(macroDirective);
				if (result == null) result = caseModelElement(macroDirective);
				if (result == null) result = caseElement(macroDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.MACRO_UNIT: {
				MacroUnit macroUnit = (MacroUnit)theEObject;
				T result = caseMacroUnit(macroUnit);
				if (result == null) result = casePreprocessorDirective(macroUnit);
				if (result == null) result = caseAbstractCodeElement(macroUnit);
				if (result == null) result = caseKDMEntity(macroUnit);
				if (result == null) result = caseModelElement(macroUnit);
				if (result == null) result = caseElement(macroUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CONDITIONAL_DIRECTIVE: {
				ConditionalDirective conditionalDirective = (ConditionalDirective)theEObject;
				T result = caseConditionalDirective(conditionalDirective);
				if (result == null) result = casePreprocessorDirective(conditionalDirective);
				if (result == null) result = caseAbstractCodeElement(conditionalDirective);
				if (result == null) result = caseKDMEntity(conditionalDirective);
				if (result == null) result = caseModelElement(conditionalDirective);
				if (result == null) result = caseElement(conditionalDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INCLUDE_DIRECTIVE: {
				IncludeDirective includeDirective = (IncludeDirective)theEObject;
				T result = caseIncludeDirective(includeDirective);
				if (result == null) result = casePreprocessorDirective(includeDirective);
				if (result == null) result = caseAbstractCodeElement(includeDirective);
				if (result == null) result = caseKDMEntity(includeDirective);
				if (result == null) result = caseModelElement(includeDirective);
				if (result == null) result = caseElement(includeDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VARIANT_TO: {
				VariantTo variantTo = (VariantTo)theEObject;
				T result = caseVariantTo(variantTo);
				if (result == null) result = caseAbstractCodeRelationship(variantTo);
				if (result == null) result = caseKDMRelationship(variantTo);
				if (result == null) result = caseModelElement(variantTo);
				if (result == null) result = caseElement(variantTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.EXPANDS: {
				Expands expands = (Expands)theEObject;
				T result = caseExpands(expands);
				if (result == null) result = caseAbstractCodeRelationship(expands);
				if (result == null) result = caseKDMRelationship(expands);
				if (result == null) result = caseModelElement(expands);
				if (result == null) result = caseElement(expands);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.REDEFINES: {
				Redefines redefines = (Redefines)theEObject;
				T result = caseRedefines(redefines);
				if (result == null) result = caseAbstractCodeRelationship(redefines);
				if (result == null) result = caseKDMRelationship(redefines);
				if (result == null) result = caseModelElement(redefines);
				if (result == null) result = caseElement(redefines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.GENERATED_FROM: {
				GeneratedFrom generatedFrom = (GeneratedFrom)theEObject;
				T result = caseGeneratedFrom(generatedFrom);
				if (result == null) result = caseAbstractCodeRelationship(generatedFrom);
				if (result == null) result = caseKDMRelationship(generatedFrom);
				if (result == null) result = caseModelElement(generatedFrom);
				if (result == null) result = caseElement(generatedFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INCLUDES: {
				Includes includes = (Includes)theEObject;
				T result = caseIncludes(includes);
				if (result == null) result = caseAbstractCodeRelationship(includes);
				if (result == null) result = caseKDMRelationship(includes);
				if (result == null) result = caseModelElement(includes);
				if (result == null) result = caseElement(includes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.HAS_VALUE: {
				HasValue hasValue = (HasValue)theEObject;
				T result = caseHasValue(hasValue);
				if (result == null) result = caseAbstractCodeRelationship(hasValue);
				if (result == null) result = caseKDMRelationship(hasValue);
				if (result == null) result = caseModelElement(hasValue);
				if (result == null) result = caseElement(hasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCodeElement(AbstractCodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeItem(CodeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computational Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computational Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationalObject(ComputationalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlElement(ControlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodUnit(MethodUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAssembly(CodeAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableUnit(CallableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateUnit(TemplateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Code Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Code Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCodeRelationship(AbstractCodeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOf(InstanceOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
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
	public T caseCodeModel(CodeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedType(DerivedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharType(CharType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassUnit(ClassUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordType(RecordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedType(EnumeratedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtends(Extends object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaledType(ScaledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatType(FloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasType(HasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationOf(ImplementationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplements(Implements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceUnit(InterfaceUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedType(DefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeUnit(TypeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceType(ChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceUnit(NamespaceUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visible In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visible In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibleIn(VisibleIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentUnit(CommentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedUnit(SharedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalType(DecimalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueElement(ValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueList(ValueList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorableUnit(StorableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberUnit(MemberUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterUnit(ParameterUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemUnit(ItemUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexUnit(IndexUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synonym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synonym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynonymType(SynonymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagType(BagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
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
	public T caseCodeElement(CodeElement object) {
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
	public T caseCodeRelationship(CodeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageUnit(LanguageUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalType(OrdinalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitstring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitstringType(BitstringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctetType(OctetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octetstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octetstring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctetstringType(OctetstringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitType(BitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(kdm.code.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTo(ParameterTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateType(TemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessor Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessor Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessorDirective(PreprocessorDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroDirective(MacroDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroUnit(MacroUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDirective(ConditionalDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeDirective(IncludeDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantTo(VariantTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpands(Expands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefines(Redefines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generated From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generated From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratedFrom(GeneratedFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludes(Includes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasValue(HasValue object) {
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

} //CodeSwitch
