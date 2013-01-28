/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryFactory.java,v 1.1 2008/01/14 09:18:30 Javier Canovas Exp $
 */
package gts.modernization.model.GVQ.Query;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.GVQ.Query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryFactory eINSTANCE = gts.modernization.model.GVQ.Query.impl.QueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	QueryControl createQueryControl();

	/**
	 * Returns a new object of class '<em>Control For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control For</em>'.
	 * @generated
	 */
	QueryControlFor createQueryControlFor();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	QueryUnit createQueryUnit();

	/**
	 * Returns a new object of class '<em>Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Unit</em>'.
	 * @generated
	 */
	FilterUnit createFilterUnit();

	/**
	 * Returns a new object of class '<em>Filter Expression Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Expression Unit</em>'.
	 * @generated
	 */
	FilterExpressionUnit createFilterExpressionUnit();

	/**
	 * Returns a new object of class '<em>Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Element</em>'.
	 * @generated
	 */
	ExpressionElement createExpressionElement();

	/**
	 * Returns a new object of class '<em>Filter Expression Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Expression Complex</em>'.
	 * @generated
	 */
	FilterExpressionComplex createFilterExpressionComplex();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	QueryElement createQueryElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPackage getQueryPackage();

} //QueryFactory
