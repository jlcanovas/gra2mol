/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gts.modernization.model.GVQ.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Init Unit Element Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.GVQ.Core.CorePackage#getInitUnitElementValueType()
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
	 * The '<em><b>OPERATION CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CODE(6, "OPERATION_CODE", "OPERATION_CODE"),

	/**
	 * The '<em><b>OPERATION CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_CALL(7, "OPERATION_CALL", "OPERATION_CALL"), /**
	 * The '<em><b>OPERATION REMOVE QUOTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_REMOVE_QUOTES_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_REMOVE_QUOTES(8, "OPERATION_REMOVE_QUOTES", "OPERATION_REMOVE_QUOTES");

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
	 * The '<em><b>OPERATION CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION CODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_CODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_CODE_VALUE = 6;

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
			OPERATION_CODE,
			OPERATION_CALL,
			OPERATION_REMOVE_QUOTES,
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
			case OPERATION_CODE_VALUE: return OPERATION_CODE;
			case OPERATION_CALL_VALUE: return OPERATION_CALL;
			case OPERATION_REMOVE_QUOTES_VALUE: return OPERATION_REMOVE_QUOTES;
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
