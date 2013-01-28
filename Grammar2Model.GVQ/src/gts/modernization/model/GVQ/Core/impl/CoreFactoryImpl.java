/**
 * <copyright>
 * </copyright>
 *
 * $Id: CoreFactoryImpl.java,v 1.1 2008/01/14 09:18:31 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Core.impl;

import gts.modernization.model.GVQ.Core.*;
import gts.modernization.model.GVQ.Core.impl.CoreFactoryImpl;
import gts.modernization.model.GVQ.Core.impl.InitUnitImpl;
import gts.modernization.model.GVQ.Core.impl.RuleImpl;
import gts.modernization.model.GVQ.Core.impl.ViewDefinitionImpl;

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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://gts.inf.um.es/modernization/g2mv/core"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.VIEW_DEFINITION: return createViewDefinition();
			case CorePackage.RULE: return createRule();
			case CorePackage.FROM_ELEMENT: return createFromElement();
			case CorePackage.TO_ELEMENT: return createToElement();
			case CorePackage.INIT_UNIT: return createInitUnit();
			case CorePackage.INIT_UNIT_ELEMENT: return createInitUnitElement();
			case CorePackage.INIT_UNIT_ELEMENT_VALUE: return createInitUnitElementValue();
			case CorePackage.INIT_UNIT_GROUP: return createInitUnitGroup();
			case CorePackage.PARAMETER: return createParameter();
			case CorePackage.HASH: return createHash();
			case CorePackage.HASH_VALUE: return createHashValue();
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
			case CorePackage.INIT_UNIT_ELEMENT_VALUE_TYPE:
				return createInitUnitElementValueTypeFromString(eDataType, initialValue);
			case CorePackage.INIT_UNIT_GROUP_TYPE:
				return createInitUnitGroupTypeFromString(eDataType, initialValue);
			case CorePackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case CorePackage.HASH_VALUE_TYPE:
				return createHashValueTypeFromString(eDataType, initialValue);
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
			case CorePackage.INIT_UNIT_ELEMENT_VALUE_TYPE:
				return convertInitUnitElementValueTypeToString(eDataType, instanceValue);
			case CorePackage.INIT_UNIT_GROUP_TYPE:
				return convertInitUnitGroupTypeToString(eDataType, instanceValue);
			case CorePackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case CorePackage.HASH_VALUE_TYPE:
				return convertHashValueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromElement createFromElement() {
		FromElementImpl fromElement = new FromElementImpl();
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToElement createToElement() {
		ToElementImpl toElement = new ToElementImpl();
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnit createInitUnit() {
		InitUnitImpl initUnit = new InitUnitImpl();
		return initUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitElement createInitUnitElement() {
		InitUnitElementImpl initUnitElement = new InitUnitElementImpl();
		return initUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitElementValue createInitUnitElementValue() {
		InitUnitElementValueImpl initUnitElementValue = new InitUnitElementValueImpl();
		return initUnitElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitGroup createInitUnitGroup() {
		InitUnitGroupImpl initUnitGroup = new InitUnitGroupImpl();
		return initUnitGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hash createHash() {
		HashImpl hash = new HashImpl();
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashValue createHashValue() {
		HashValueImpl hashValue = new HashValueImpl();
		return hashValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitElementValueType createInitUnitElementValueTypeFromString(EDataType eDataType, String initialValue) {
		InitUnitElementValueType result = InitUnitElementValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitUnitElementValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitUnitGroupType createInitUnitGroupTypeFromString(EDataType eDataType, String initialValue) {
		InitUnitGroupType result = InitUnitGroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitUnitGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashValueType createHashValueTypeFromString(EDataType eDataType, String initialValue) {
		HashValueType result = HashValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDefinition createViewDefinition() {
		ViewDefinitionImpl viewDefinition = new ViewDefinitionImpl();
		return viewDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
