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
 * A representation of the literals of the enumeration '<em><b>Hash Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.GVQ.Core.CorePackage#getHashValueType()
 * @model
 * @generated
 */
public enum HashValueType implements Enumerator {
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
	 * The '<em><b>GRAMMAR ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAMMAR_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	GRAMMAR_ELEMENT(1, "GRAMMAR_ELEMENT", "GRAMMAR_ELEMENT"),

	/**
	 * The '<em><b>METAMODEL ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAMODEL_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	METAMODEL_ELEMENT(2, "METAMODEL_ELEMENT", "METAMODEL_ELEMENT"), /**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(3, "DEFAULT", "DEFAULT");

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
	 * The '<em><b>GRAMMAR ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAMMAR ELEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAMMAR_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAMMAR_ELEMENT_VALUE = 1;

	/**
	 * The '<em><b>METAMODEL ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METAMODEL ELEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METAMODEL_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METAMODEL_ELEMENT_VALUE = 2;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hash Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HashValueType[] VALUES_ARRAY =
		new HashValueType[] {
			VALUE,
			GRAMMAR_ELEMENT,
			METAMODEL_ELEMENT,
			DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Hash Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HashValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hash Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HashValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HashValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hash Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HashValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HashValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hash Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HashValueType get(int value) {
		switch (value) {
			case VALUE_VALUE: return VALUE;
			case GRAMMAR_ELEMENT_VALUE: return GRAMMAR_ELEMENT;
			case METAMODEL_ELEMENT_VALUE: return METAMODEL_ELEMENT;
			case DEFAULT_VALUE: return DEFAULT;
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
	private HashValueType(int value, String name, String literal) {
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
	
} //HashValueType
