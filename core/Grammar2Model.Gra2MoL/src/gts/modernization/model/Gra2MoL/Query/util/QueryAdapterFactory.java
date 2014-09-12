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

package gts.modernization.model.Gra2MoL.Query.util;

import gts.modernization.model.Gra2MoL.Query.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySwitch<Adapter> modelSwitch =
		new QuerySwitch<Adapter>() {
			@Override
			public Adapter caseQueryUnit(QueryUnit object) {
				return createQueryUnitAdapter();
			}
			@Override
			public Adapter caseQueryControl(QueryControl object) {
				return createQueryControlAdapter();
			}
			@Override
			public Adapter caseQueryControlFor(QueryControlFor object) {
				return createQueryControlForAdapter();
			}
			@Override
			public Adapter caseQueryControlGreater(QueryControlGreater object) {
				return createQueryControlGreaterAdapter();
			}
			@Override
			public Adapter caseQueryControlExtension(QueryControlExtension object) {
				return createQueryControlExtensionAdapter();
			}
			@Override
			public Adapter caseFilterUnit(FilterUnit object) {
				return createFilterUnitAdapter();
			}
			@Override
			public Adapter caseQueryElement(QueryElement object) {
				return createQueryElementAdapter();
			}
			@Override
			public Adapter caseFilterExpression(FilterExpression object) {
				return createFilterExpressionAdapter();
			}
			@Override
			public Adapter caseFilterExpressionComplex(FilterExpressionComplex object) {
				return createFilterExpressionComplexAdapter();
			}
			@Override
			public Adapter caseFilterExpressionUnit(FilterExpressionUnit object) {
				return createFilterExpressionUnitAdapter();
			}
			@Override
			public Adapter caseExpressionElement(ExpressionElement object) {
				return createExpressionElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryUnit
	 * @generated
	 */
	public Adapter createQueryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryControl
	 * @generated
	 */
	public Adapter createQueryControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryControlFor <em>Control For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryControlFor
	 * @generated
	 */
	public Adapter createQueryControlForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryControlGreater <em>Control Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryControlGreater
	 * @generated
	 */
	public Adapter createQueryControlGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryControlExtension <em>Control Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryControlExtension
	 * @generated
	 */
	public Adapter createQueryControlExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit <em>Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterUnit
	 * @generated
	 */
	public Adapter createFilterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.QueryElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.QueryElement
	 * @generated
	 */
	public Adapter createQueryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterExpression
	 * @generated
	 */
	public Adapter createFilterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex <em>Filter Expression Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterExpressionComplex
	 * @generated
	 */
	public Adapter createFilterExpressionComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit <em>Filter Expression Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterExpressionUnit
	 * @generated
	 */
	public Adapter createFilterExpressionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Query.ExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Query.ExpressionElement
	 * @generated
	 */
	public Adapter createExpressionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueryAdapterFactory
