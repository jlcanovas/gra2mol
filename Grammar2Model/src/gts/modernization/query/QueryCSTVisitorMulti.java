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


package gts.modernization.query;

import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.Leaf;
import gts.modernization.model.CST.Node;
import gts.modernization.model.CST.Tree;
import gts.modernization.model.CST.util.CSTVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class is a controller of CSTVisitor threads. It controls the threads and
 * calls to the visitor methods. The first time it creates a main thread and then 
 * other threads are created by them. 
 * 
 * The use of this controller allows to use the RECURSIVE operator.
 * 
 * @author Javier Canovas
 *
 */
public class QueryCSTVisitorMulti implements CSTVisitor, QueryCST {
	/**
	 * Context of the query
	 */
	private QueryContext context; 
	/**
	 * Threads of CSTVisitor
	 */
	private List<QueryCSTVisitorThread> visitorThreads;
	/**
	 * Cache of threads of CSTVisitor. They are cached until the startVisit finish
	 */
	private List<QueryCSTVisitorThread> cacheThreads;
	

	/**
	 * @param context Context of the query
	 */
	public QueryCSTVisitorMulti(QueryContext context) {
		this.context = context;
		this.visitorThreads = new ArrayList<QueryCSTVisitorThread>();
		this.cacheThreads = new ArrayList<QueryCSTVisitorThread>();
		
		// Creates the first thread
		this.visitorThreads.add(createFirstQueryCSTVisitor());
	}
	
	public void execute() {
		Element tree = context.getTree();
		tree.accept(this);
	}
	
	/**
	 * Creates a new CSTVisitor
	 * 
	 * @param filter Main filter of the query
	 * @param previous Pointer to the previous filter
	 * @param actual Pointer to the actual filter
	 * @param lastElement Last filtered element
	 * @param candidateElement Candidate element
	 * @param lastVisitedNode Last visited element
	 * @param startNode Node that starts the query
	 * @param father Father of the node
	 * @param unique Unique node
	 * @param deep Actual deep
	 */
	public void createQueryCSTVisitor(QueryCSTVisitorState state) {
//		System.out.println("Se crea un nuevo hilo de QueryCSTVisitor ");
		QueryCSTVisitorThread newThread = new QueryCSTVisitorThread(this, context, state);
		this.cacheThreads.add(newThread);
	}
	
	/**
	 * Creates the first CSTVisitor
	 * @return The first CSTVisitor
	 */
	public QueryCSTVisitorThread createFirstQueryCSTVisitor() {
		return new QueryCSTVisitorThread(this, context);
	}

	public void startVisit(Node node) {
		Iterator<QueryCSTVisitorThread> it = visitorThreads.iterator();
		int control = 0;
		while(it.hasNext()) {
			QueryCSTVisitorThread qcvt = it.next();
//			System.out.println("hilo " + control++);
			qcvt.startVisit(node);
		}
		
		// The cached elements are added to main threads
		this.visitorThreads.addAll(cacheThreads);
		this.cacheThreads = new ArrayList<QueryCSTVisitorThread>();
	}
	
	public void endVisit(Node node) {
		Iterator<QueryCSTVisitorThread> it = visitorThreads.iterator();
		int control = 0;
		while(it.hasNext()) {
			QueryCSTVisitorThread qcvt = it.next();
//			System.out.println("hilo " + control++);
			qcvt.endVisit(node);
		}
		
	}
	
	/**
	 * Returns all the results of the threads
	 * @return List of found elements
	 */
	public List<Element> getResult(){
		List<Element> result = new ArrayList<Element>();		
		int control = 0;
		
		Iterator<QueryCSTVisitorThread> it = visitorThreads.iterator();
		while(it.hasNext()) {
			QueryCSTVisitorThread qcvt = it.next();
			if(qcvt.getResult().size() > 0) {
//				System.out.println("Thread " + control++ + ": " + qcvt.getResult().size() + " results");
				result.addAll(qcvt.getResult());
			}
		}
		
		return result;
	}
	
	
	
	public QueryContext getContext() {
		return context;
	}

	public void setContext(QueryContext context) {
		this.context = context;
	}

	public void endVisit(Element element) {}
	public void endVisit(Tree tree) {}
	public void endVisit(Leaf leaf) {}
	public void startVisit(Element element) {}
	public void startVisit(Tree tree) {}
	public void startVisit(Leaf leaf) {}

}
