/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSTFactoryImpl.java,v 1.1 2008/01/14 09:09:08 Javier Canovas Exp $
 */
package gts.modernization.model.CST.impl;

import gts.modernization.model.CST.*;
import gts.modernization.model.CST.impl.ElementImpl;
import gts.modernization.model.CST.impl.LeafImpl;
import gts.modernization.model.CST.impl.NodeImpl;
import gts.modernization.model.CST.impl.TreeImpl;

import org.eclipse.emf.ecore.EClass;
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
public class CSTFactoryImpl extends EFactoryImpl implements CSTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSTFactory init() {
		try {
			CSTFactory theCSTFactory = (CSTFactory)EPackage.Registry.INSTANCE.getEFactory("http://gts.inf.um.es/modernization/cst"); 
			if (theCSTFactory != null) {
				return theCSTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CSTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSTFactoryImpl() {
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
			case CSTPackage.TREE: return createTree();
			case CSTPackage.ELEMENT: return createElement();
			case CSTPackage.NODE: return createNode();
			case CSTPackage.LEAF: return createLeaf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSTPackage getCSTPackage() {
		return (CSTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CSTPackage getPackage() {
		return CSTPackage.eINSTANCE;
	}

	@Override
	public Leaf createLeaf(String kind, String value, int pos, int line) {
		Leaf leaf = createLeaf();
		leaf.setKind(kind);
		leaf.setValue(value);
		leaf.setPos(pos);
		leaf.setLine(line);
		return leaf;
	}

} //CSTFactoryImpl
