/**
 */
package org.spf.CMakeLists.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.CMakeLists.ProjectInstruction;

import org.spf.PackageXML.DeclaredPackageName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.impl.ProjectInstructionImpl#getDeclaredPackageName <em>Declared Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectInstructionImpl extends InstructionImpl implements ProjectInstruction {
	/**
	 * The cached value of the '{@link #getDeclaredPackageName() <em>Declared Package Name</em>}' reference.
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
	protected ProjectInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMakeListsPackage.Literals.PROJECT_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclaredPackageName getDeclaredPackageName() {
		if (declaredPackageName != null && declaredPackageName.eIsProxy()) {
			InternalEObject oldDeclaredPackageName = (InternalEObject)declaredPackageName;
			declaredPackageName = (DeclaredPackageName)eResolveProxy(oldDeclaredPackageName);
			if (declaredPackageName != oldDeclaredPackageName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME, oldDeclaredPackageName, declaredPackageName));
			}
		}
		return declaredPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredPackageName basicGetDeclaredPackageName() {
		return declaredPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaredPackageName(DeclaredPackageName newDeclaredPackageName) {
		DeclaredPackageName oldDeclaredPackageName = declaredPackageName;
		declaredPackageName = newDeclaredPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME, oldDeclaredPackageName, declaredPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME:
				if (resolve) return getDeclaredPackageName();
				return basicGetDeclaredPackageName();
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
			case CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME:
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
			case CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME:
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
			case CMakeListsPackage.PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME:
				return declaredPackageName != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectInstructionImpl
