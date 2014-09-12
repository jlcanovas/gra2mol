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
 * A representation of the literals of the enumeration '<em><b>Init Unit Element Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage#getInitUnitElementValueType()
 * @model
 * @generated
 */
public enum InitUnitElementValueType implements Enumerator {
	/**
	 * The '<em><b>VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(0, "VALUE", "VALUE"),

	/**
	 * The '<em><b>QUERY RESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_RESULT(1, "QUERY_RESULT", "QUERY_RESULT"),

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
	 * The '<em><b>OPERATION CONCAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CONCAT_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CONCAT(3, "OPERATION_CONCAT", "OPERATION_CONCAT"),

	/**
	 * The '<em><b>OPERATION CREATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CREATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CREATION(4, "OPERATION_CREATION", "OPERATION_CREATION"),

	/**
	 * The '<em><b>HASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASH_VALUE
	 * @generated
	 * @ordered
	 */
	HASH(5, "HASH", "HASH"),

	/**
	 * The '<em><b>OPERATION EXTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_EXTRACT(6, "OPERATION_EXTRACT", "OPERATION_CODE"), /**
	 * The '<em><b>OPERATION CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CALL(7, "OPERATION_CALL", "OPERATION_CALL"),

	/**
	 * The '<em><b>OPERATION REMOVE QUOTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_REMOVE_QUOTES_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_REMOVE_QUOTES(8, "OPERATION_REMOVE_QUOTES", "OPERATION_REMOVE_QUOTES"), /**
	 * The '<em><b>OPERATION EXTRACTID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTRACTID_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_EXTRACTID(9, "OPERATION_EXTRACTID", "OPERATION_EXTRACTID"), /**
	 * The '<em><b>SKIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_VALUE
	 * @generated
	 * @ordered
	 */
	SKIP(10, "SKIP", "SKIP"), /**
	 * The '<em><b>OPERATION COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_COUNT(11, "OPERATION_COUNT", "OPERATION_COUNT"), /**
	 * The '<em><b>OPERATION CONVERTH2S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CONVERTH2S_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CONVERTH2S(12, "OPERATION_CONVERTH2S", "OPERATION_CONVERTH2S"), /**
	 * The '<em><b>OPERATION EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_EXTENSION(13, "OPERATION_EXTENSION", "OPERATION_EXTENSION");

	/**
	 * The '<em><b>VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 0;

	/**
	 * The '<em><b>QUERY RESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUERY RESULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY_RESULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_RESULT_VALUE = 1;

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
	 * The '<em><b>OPERATION CONCAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION CONCAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CONCAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_CONCAT_VALUE = 3;

	/**
	 * The '<em><b>OPERATION CREATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION CREATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CREATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_CREATION_VALUE = 4;

	/**
	 * The '<em><b>HASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HASH_VALUE = 5;

	/**
	 * The '<em><b>OPERATION EXTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION EXTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTRACT
	 * @model literal="OPERATION_CODE"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_EXTRACT_VALUE = 6;

	/**
	 * The '<em><b>OPERATION CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION CALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_CALL_VALUE = 7;

	/**
	 * The '<em><b>OPERATION REMOVE QUOTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION REMOVE QUOTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_REMOVE_QUOTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_REMOVE_QUOTES_VALUE = 8;

	/**
	 * The '<em><b>OPERATION EXTRACTID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION EXTRACTID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTRACTID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_EXTRACTID_VALUE = 9;

	/**
	 * The '<em><b>SKIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SKIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKIP_VALUE = 10;

	/**
	 * The '<em><b>OPERATION COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION COUNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_COUNT_VALUE = 11;

	/**
	 * The '<em><b>OPERATION CONVERTH2S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION CONVERTH2S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CONVERTH2S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_CONVERTH2S_VALUE = 12;

	/**
	 * The '<em><b>OPERATION EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_EXTENSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_EXTENSION_VALUE = 13;

	/**
	 * An array of all the '<em><b>Init Unit Element Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitUnitElementValueType[] VALUES_ARRAY =
		new InitUnitElementValueType[] {
			VALUE,
			QUERY_RESULT,
			QUERY_ACCESS,
			OPERATION_CONCAT,
			OPERATION_CREATION,
			HASH,
			OPERATION_EXTRACT,
			OPERATION_CALL,
			OPERATION_REMOVE_QUOTES,
			OPERATION_EXTRACTID,
			SKIP,
			OPERATION_COUNT,
			OPERATION_CONVERTH2S,
			OPERATION_EXTENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Init Unit Element Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InitUnitElementValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Init Unit Element Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitUnitElementValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitUnitElementValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Init Unit Element Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitUnitElementValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitUnitElementValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Init Unit Element Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitUnitElementValueType get(int value) {
		switch (value) {
			case VALUE_VALUE: return VALUE;
			case QUERY_RESULT_VALUE: return QUERY_RESULT;
			case QUERY_ACCESS_VALUE: return QUERY_ACCESS;
			case OPERATION_CONCAT_VALUE: return OPERATION_CONCAT;
			case OPERATION_CREATION_VALUE: return OPERATION_CREATION;
			case HASH_VALUE: return HASH;
			case OPERATION_EXTRACT_VALUE: return OPERATION_EXTRACT;
			case OPERATION_CALL_VALUE: return OPERATION_CALL;
			case OPERATION_REMOVE_QUOTES_VALUE: return OPERATION_REMOVE_QUOTES;
			case OPERATION_EXTRACTID_VALUE: return OPERATION_EXTRACTID;
			case SKIP_VALUE: return SKIP;
			case OPERATION_COUNT_VALUE: return OPERATION_COUNT;
			case OPERATION_CONVERTH2S_VALUE: return OPERATION_CONVERTH2S;
			case OPERATION_EXTENSION_VALUE: return OPERATION_EXTENSION;
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
	private InitUnitElementValueType(int value, String name, String literal) {
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
	
} //InitUnitElementValueType
