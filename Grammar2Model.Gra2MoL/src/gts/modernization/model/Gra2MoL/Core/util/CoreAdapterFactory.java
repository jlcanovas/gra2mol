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

package gts.modernization.model.Gra2MoL.Core.util;

import gts.modernization.model.Gra2MoL.Core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gts.modernization.model.Gra2MoL.Core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseStandardRule(StandardRule object) {
				return createStandardRuleAdapter();
			}
			@Override
			public Adapter caseMixinRule(MixinRule object) {
				return createMixinRuleAdapter();
			}
			@Override
			public Adapter caseFromElement(FromElement object) {
				return createFromElementAdapter();
			}
			@Override
			public Adapter caseToElement(ToElement object) {
				return createToElementAdapter();
			}
			@Override
			public Adapter caseInitUnit(InitUnit object) {
				return createInitUnitAdapter();
			}
			@Override
			public Adapter caseInitUnitElement(InitUnitElement object) {
				return createInitUnitElementAdapter();
			}
			@Override
			public Adapter caseInitUnitElementValue(InitUnitElementValue object) {
				return createInitUnitElementValueAdapter();
			}
			@Override
			public Adapter caseInitUnitGroup(InitUnitGroup object) {
				return createInitUnitGroupAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseHash(Hash object) {
				return createHashAdapter();
			}
			@Override
			public Adapter caseHashValue(HashValue object) {
				return createHashValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.StandardRule <em>Standard Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.StandardRule
	 * @generated
	 */
	public Adapter createStandardRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.MixinRule <em>Mixin Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.MixinRule
	 * @generated
	 */
	public Adapter createMixinRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.FromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.FromElement
	 * @generated
	 */
	public Adapter createFromElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.ToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.ToElement
	 * @generated
	 */
	public Adapter createToElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.InitUnit <em>Init Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnit
	 * @generated
	 */
	public Adapter createInitUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElement <em>Init Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElement
	 * @generated
	 */
	public Adapter createInitUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitElementValue <em>Init Unit Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitElementValue
	 * @generated
	 */
	public Adapter createInitUnitElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.InitUnitGroup <em>Init Unit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.InitUnitGroup
	 * @generated
	 */
	public Adapter createInitUnitGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.Hash
	 * @generated
	 */
	public Adapter createHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gts.modernization.model.Gra2MoL.Core.HashValue <em>Hash Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gts.modernization.model.Gra2MoL.Core.HashValue
	 * @generated
	 */
	public Adapter createHashValueAdapter() {
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

} //CoreAdapterFactory
