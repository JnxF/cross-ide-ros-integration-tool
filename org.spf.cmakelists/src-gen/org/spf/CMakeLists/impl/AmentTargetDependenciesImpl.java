/**
 */
package org.spf.CMakeLists.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.spf.CMakeLists.AmentTargetDependencies;
import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.CMakeLists.Executable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ament Target Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.impl.AmentTargetDependenciesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spf.CMakeLists.impl.AmentTargetDependenciesImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmentTargetDependenciesImpl extends InstructionImpl implements AmentTargetDependencies {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Executable name;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmentTargetDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMakeListsPackage.Literals.AMENT_TARGET_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Executable getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Executable)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executable basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(Executable newName) {
		Executable oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDependencies() {
		if (dependencies == null) {
			dependencies = new EDataTypeUniqueEList<String>(String.class, this, CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME:
				if (resolve) return getName();
				return basicGetName();
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__DEPENDENCIES:
				return getDependencies();
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
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME:
				setName((Executable)newValue);
				return;
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
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
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME:
				setName((Executable)null);
				return;
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__DEPENDENCIES:
				getDependencies().clear();
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
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__NAME:
				return name != null;
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dependencies: ");
		result.append(dependencies);
		result.append(')');
		return result.toString();
	}

} //AmentTargetDependenciesImpl
