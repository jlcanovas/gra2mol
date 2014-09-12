package gts.modernization.model.CST.util;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.Tree;

public interface CSTVisitor {

	/**
	 * Start the visit to the Element
	 * @param element Element to visit
	 */
	public void startVisit(Element element);
	/**
	 * Ends the visit to the Element
	 * @param element Elemento to visit
	 */
	public void endVisit(Element element);
	/**
	 * Start the visit to the tree
	 * @param tree Tree to visit
	 */
	public void startVisit(Tree tree);
	/**
	 * Ends the visit to the tree
	 * @param tree Tree to visit
	 */
	public void endVisit(Tree tree);
	/**
	 * Start the visit to the node
	 * @param node Node to visit
	 */
	public void startVisit(Node node); 
	/**
	 * Ends the visit to the node
	 * @param node Node to visit
	 */
	public void endVisit(Node node);
	/**
	 * Start the visit to the leaf
	 * @param leaf Leaf to visit
	 */
	public void startVisit(Leaf leaf);
	/**
	 * Ends the visit to the leaf
	 * @param leaf Leaf to visit
	 */
	public void endVisit(Leaf leaf);
	
}
