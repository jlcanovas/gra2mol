/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/

package gts.modernization.model.Gra2MoL.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getParameterType()
 * @model
 * @generated
 */
public enum ParameterType implements Enumerator {
	/**
	 * The '<em><b>STRING VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_VALUE(0, "STRING_VALUE", "STRING_VALUE"),

	/**
	 * The '<em><b>NUMBER VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_VALUE(1, "NUMBER_VALUE", "NUMBER_VALUE"),

	/**
	 * The '<em><b>QUERY ACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_ACCESS(2, "QUERY_ACCESS", "QUERY_ACCESS"),

	/**
	 * The '<em><b>VARIABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE(3, "VARIABLE", "VARIABLE"),

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE(4, "MULTIPLE", "MULTIPLE");

	/**
	 * The '<em><b>STRING VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRING VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE_VALUE = 0;

	/**
	 * The '<em><b>NUMBER VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMBER VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE_VALUE = 1;

	/**
	 * The '<em><b>QUERY ACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUERY ACCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY_ACCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_ACCESS_VALUE = 2;

	/**
	 * The '<em><b>VARIABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARIABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_VALUE = 3;

	/**
	 * The '<em><b>MULTIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterType[] VALUES_ARRAY =
		new ParameterType[] {
			STRING_VALUE,
			NUMBER_VALUE,
			QUERY_ACCESS,
			VARIABLE,
			MULTIPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(int value) {
		switch (value) {
			case STRING_VALUE_VALUE: return STRING_VALUE;
			case NUMBER_VALUE_VALUE: return NUMBER_VALUE;
			case QUERY_ACCESS_VALUE: return QUERY_ACCESS;
			case VARIABLE_VALUE: return VARIABLE;
			case MULTIPLE_VALUE: return MULTIPLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ParameterType
