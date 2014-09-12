/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source.impl;

import java.util.Collection;

import kdm.core.impl.ElementImpl;

import kdm.source.SourcePackage;
import kdm.source.SourceRef;
import kdm.source.SourceRegion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.source.impl.SourceRefImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRefImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRefImpl#getSnippet <em>Snippet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceRefImpl extends ElementImpl implements SourceRef {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRegion> region;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnippet() <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnippet() <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected String snippet = SNIPPET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.SOURCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRegion> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<SourceRegion>(SourceRegion.class, this, SourcePackage.SOURCE_REF__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REF__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippet(String newSnippet) {
		String oldSnippet = snippet;
		snippet = newSnippet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REF__SNIPPET, oldSnippet, snippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.SOURCE_REF__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
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
			case SourcePackage.SOURCE_REF__REGION:
				return getRegion();
			case SourcePackage.SOURCE_REF__LANGUAGE:
				return getLanguage();
			case SourcePackage.SOURCE_REF__SNIPPET:
				return getSnippet();
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
			case SourcePackage.SOURCE_REF__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends SourceRegion>)newValue);
				return;
			case SourcePackage.SOURCE_REF__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case SourcePackage.SOURCE_REF__SNIPPET:
				setSnippet((String)newValue);
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
			case SourcePackage.SOURCE_REF__REGION:
				getRegion().clear();
				return;
			case SourcePackage.SOURCE_REF__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REF__SNIPPET:
				setSnippet(SNIPPET_EDEFAULT);
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
			case SourcePackage.SOURCE_REF__REGION:
				return region != null && !region.isEmpty();
			case SourcePackage.SOURCE_REF__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case SourcePackage.SOURCE_REF__SNIPPET:
				return SNIPPET_EDEFAULT == null ? snippet != null : !SNIPPET_EDEFAULT.equals(snippet);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (language: ");
		result.append(language);
		result.append(", snippet: ");
		result.append(snippet);
		result.append(')');
		return result.toString();
	}

} //SourceRefImpl
