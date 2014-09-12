/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.source.impl;

import kdm.core.impl.ElementImpl;

import kdm.source.SourceFile;
import kdm.source.SourcePackage;
import kdm.source.SourceRegion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getFile <em>File</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getEndLine <em>End Line</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link kdm.source.impl.SourceRegionImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceRegionImpl extends ElementImpl implements SourceRegion {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected SourceFile file;

	/**
	 * The default value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected Integer startLine = START_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer startPosition = START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected Integer endLine = END_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer endPosition = END_POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.SOURCE_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject)file;
			file = (SourceFile)eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SourcePackage.SOURCE_REGION__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(SourceFile newFile) {
		SourceFile oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartLine() {
		return startLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLine(Integer newStartLine) {
		Integer oldStartLine = startLine;
		startLine = newStartLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__START_LINE, oldStartLine, startLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(Integer newStartPosition) {
		Integer oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndLine() {
		return endLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLine(Integer newEndLine) {
		Integer oldEndLine = endLine;
		endLine = newEndLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__END_LINE, oldEndLine, endLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(Integer newEndPosition) {
		Integer oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__END_POSITION, oldEndPosition, endPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourcePackage.SOURCE_REGION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourcePackage.SOURCE_REGION__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case SourcePackage.SOURCE_REGION__START_LINE:
				return getStartLine();
			case SourcePackage.SOURCE_REGION__START_POSITION:
				return getStartPosition();
			case SourcePackage.SOURCE_REGION__END_LINE:
				return getEndLine();
			case SourcePackage.SOURCE_REGION__END_POSITION:
				return getEndPosition();
			case SourcePackage.SOURCE_REGION__LANGUAGE:
				return getLanguage();
			case SourcePackage.SOURCE_REGION__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SourcePackage.SOURCE_REGION__FILE:
				setFile((SourceFile)newValue);
				return;
			case SourcePackage.SOURCE_REGION__START_LINE:
				setStartLine((Integer)newValue);
				return;
			case SourcePackage.SOURCE_REGION__START_POSITION:
				setStartPosition((Integer)newValue);
				return;
			case SourcePackage.SOURCE_REGION__END_LINE:
				setEndLine((Integer)newValue);
				return;
			case SourcePackage.SOURCE_REGION__END_POSITION:
				setEndPosition((Integer)newValue);
				return;
			case SourcePackage.SOURCE_REGION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case SourcePackage.SOURCE_REGION__PATH:
				setPath((String)newValue);
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
			case SourcePackage.SOURCE_REGION__FILE:
				setFile((SourceFile)null);
				return;
			case SourcePackage.SOURCE_REGION__START_LINE:
				setStartLine(START_LINE_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REGION__START_POSITION:
				setStartPosition(START_POSITION_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REGION__END_LINE:
				setEndLine(END_LINE_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REGION__END_POSITION:
				setEndPosition(END_POSITION_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REGION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case SourcePackage.SOURCE_REGION__PATH:
				setPath(PATH_EDEFAULT);
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
			case SourcePackage.SOURCE_REGION__FILE:
				return file != null;
			case SourcePackage.SOURCE_REGION__START_LINE:
				return START_LINE_EDEFAULT == null ? startLine != null : !START_LINE_EDEFAULT.equals(startLine);
			case SourcePackage.SOURCE_REGION__START_POSITION:
				return START_POSITION_EDEFAULT == null ? startPosition != null : !START_POSITION_EDEFAULT.equals(startPosition);
			case SourcePackage.SOURCE_REGION__END_LINE:
				return END_LINE_EDEFAULT == null ? endLine != null : !END_LINE_EDEFAULT.equals(endLine);
			case SourcePackage.SOURCE_REGION__END_POSITION:
				return END_POSITION_EDEFAULT == null ? endPosition != null : !END_POSITION_EDEFAULT.equals(endPosition);
			case SourcePackage.SOURCE_REGION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case SourcePackage.SOURCE_REGION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (startLine: ");
		result.append(startLine);
		result.append(", startPosition: ");
		result.append(startPosition);
		result.append(", endLine: ");
		result.append(endLine);
		result.append(", endPosition: ");
		result.append(endPosition);
		result.append(", language: ");
		result.append(language);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //SourceRegionImpl
