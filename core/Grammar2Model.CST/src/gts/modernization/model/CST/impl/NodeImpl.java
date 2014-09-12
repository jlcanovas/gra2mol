/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodeImpl.java,v 1.1 2008/01/14 09:09:08 Javier Canovas Exp $
 */
package gts.modernization.model.CST.impl;

import gts.modernization.model.CST.CSTPackage;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.util.CSTVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import gts.modernization.model.CST.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gts.modernization.model.CST.impl.NodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ElementImpl implements Node {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSTPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Element>(Element.class, this, CSTPackage.NODE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CSTPackage.NODE__CHILDREN:
			return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CSTPackage.NODE__CHILDREN:
			return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CSTPackage.NODE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Element>)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CSTPackage.NODE__CHILDREN:
			getChildren().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CSTPackage.NODE__CHILDREN:
			return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void accept(CSTVisitor visitor) {
		visitor.startVisit(this);
		Iterator<Element> it = this.getChildren().iterator();
		while(it.hasNext()) {
			Element e = (Element) it.next();
			e.accept(visitor);
		}
		visitor.endVisit(this);
	}

	@Override
	public List<Leaf> getLeaves() {
		List result = new ArrayList<Leaf>();

		Iterator<Element> it = this.getChildren().iterator();
		while(it.hasNext()) {
			Element e = it.next();
			if (e instanceof Leaf) {
				Leaf l = (Leaf) e;
				result.add(l);
			}
		}

		return result;
	}
	
	@Override
	public List<Node> getNodes() {
		List<Node> result = new ArrayList<Node>();

		Iterator<Element> it = this.getChildren().iterator();
		while(it.hasNext()) {
			Element e = it.next();
			if (e instanceof Node) {
				Node n = (Node) e;
				result.add(n);
			}
		}

		return result;
	}

	@Override
	public Leaf findLeaf(String kind) {		
		Iterator<Leaf> it = this.getLeaves().iterator();
		while(it.hasNext()) {
			Leaf l = it.next();
			if(l.getKind().equals(kind)) return l;
		}
		return null;
	}

	@Override
	public Leaf getLeaf(String kind, int position) {	
		List foundedList = new ArrayList<Leaf>();

		Iterator<Leaf> it = this.getLeaves().iterator();
		while(it.hasNext()) {
			Leaf l = it.next();
			if(l.getKind().equals(kind)) foundedList.add(l);
		}

		if(position == -1) return (Leaf) foundedList.get(foundedList.size()-1);
		else if(position < foundedList.size()) return (Leaf) foundedList.get(position);
		else return null;
	}
	
	@Override
	public Node getNode(String kind, int position) {	
		List<Node> foundedList = new ArrayList<Node>();

		Iterator<Node> it = this.getNodes().iterator();
		while(it.hasNext()) {
			Node n = it.next();
			if(n.getKind().equals(kind)) foundedList.add(n);
		}

		if(position == -1) return (Node) foundedList.get(foundedList.size()-1);
		else if(position < foundedList.size()) return (Node) foundedList.get(position);
		else return null;
	}

	@Override
	public boolean deepEquals(Node node) {
		boolean sol = true;

		if(!this.getKind().equals(node.getKind())) return false;
		
		Iterator<Element> it = this.getChildren().iterator();
		int count = 0;
		while(it.hasNext()) {
			Element e1 = it.next();
			Element e2 = node.getChildren().get(count);

			if (e1 instanceof Node) {
				Node n1 = (Node) e1;
				if (e2 instanceof Node) {
					Node n2 = (Node) e2;
					sol = sol && n1.deepEquals(n2);
				} else if (e2 instanceof Leaf) {
					Leaf l2 = (Leaf) e2;
					return false;
				}
			} else if (e1 instanceof Leaf) {
				Leaf l1 = (Leaf) e1;
				if (e2 instanceof Node) {
					Node n2 = (Node) e2;
					return false;
				} else if (e2 instanceof Leaf) {
					Leaf l2 = (Leaf) e2;
					sol = sol && l1.equals(l2);
				}
			}
		}

		return sol;
	}

	@Override
	public List<Leaf> getAllLeaves(String kind) {
		List foundList = new ArrayList<Leaf>();

		Iterator<Leaf> it = this.getLeaves().iterator();
		while(it.hasNext()) {
			Leaf l = it.next();
			if(l.getKind().equals(kind)) foundList.add(l);
		}

		return foundList;
	}

	@Override
	public String extractContent(boolean introduceSpaces) {
		String result = "";

		Iterator<Element> children = this.getChildren().iterator();
		while(children.hasNext()) {
			Element e = children.next();
			if (e instanceof Leaf) {
				Leaf leaf = (Leaf) e;
				result = result + leaf.getValue();
				if(introduceSpaces) result = result + " ";
//				if(!isSpecialCharacter(leaf.getValue())) result = result + " ";
			} else if (e instanceof Node) {
				Node node = (Node) e;
				result = result + node.extractContent(introduceSpaces);
			} 			
		}
		
		// Removes the last space
		if(introduceSpaces && result.length() > 0) {			
			result = result.substring(0, result.length()-1);
		}
		return result;
	}

	private String parseSol(String msg) {
		String sol = "";
		Pattern patron = Pattern.compile(" \\. ");
		Matcher matcher = patron.matcher(msg);
		sol = matcher.replaceAll("\\.");
		return sol;
	}
	
	
} //NodeImpl

