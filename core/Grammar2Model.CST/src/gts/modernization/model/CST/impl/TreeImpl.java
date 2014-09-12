/**
 * <copyright>
 * </copyright>
 *
 * $Id: TreeImpl.java,v 1.1 2008/01/14 09:09:08 Javier Canovas Exp $
 */
package gts.modernization.model.CST.impl;

import gts.modernization.model.CST.CSTPackage;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Tree;
import gts.modernization.model.CST.util.CSTVisitor;

import java.util.Iterator;

import gts.modernization.model.CST.impl.NodeImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TreeImpl extends NodeImpl implements Tree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSTPackage.Literals.TREE;
	}
} //TreeImpl
