/**
 */
package org.spf.PackageXML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spf.PackageXML.DeclaredPackageName;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.PackageXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.impl.NameTagImpl#getDeclaredPackageName <em>Declared Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameTagImpl extends TagImpl implements NameTag {
	/**
	 * The cached value of the '{@link #getDeclaredPackageName() <em>Declared Package Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredPackageName()
	 * @generated
	 * @ordered
	 */
	protected DeclaredPackageName declaredPackageName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageXMLPackage.Literals.NAME_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclaredPackageName getDeclaredPackageName() {
		return declaredPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaredPackageName(DeclaredPackageName newDeclaredPackageName, NotificationChain msgs) {
		DeclaredPackageName oldDeclaredPackageName = declaredPackageName;
		declaredPackageName = newDeclaredPackageName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME, oldDeclaredPackageName, newDeclaredPackageName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaredPackageName(DeclaredPackageName newDeclaredPackageName) {
		if (newDeclaredPackageName != declaredPackageName) {
			NotificationChain msgs = null;
			if (declaredPackageName != null)
				msgs = ((InternalEObject)declaredPackageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME, null, msgs);
			if (newDeclaredPackageName != null)
				msgs = ((InternalEObject)newDeclaredPackageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME, null, msgs);
			msgs = basicSetDeclaredPackageName(newDeclaredPackageName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME, newDeclaredPackageName, newDeclaredPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME:
				return basicSetDeclaredPackageName(null, msgs);
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
			case PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME:
				return getDeclaredPackageName();
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
			case PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME:
				setDeclaredPackageName((DeclaredPackageName)newValue);
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
			case PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME:
				setDeclaredPackageName((DeclaredPackageName)null);
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
			case PackageXMLPackage.NAME_TAG__DECLARED_PACKAGE_NAME:
				return declaredPackageName != null;
		}
		return super.eIsSet(featureID);
	}

} //NameTagImpl
