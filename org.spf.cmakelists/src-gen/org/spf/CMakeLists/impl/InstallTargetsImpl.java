/**
 */
package org.spf.CMakeLists.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.CMakeLists.Executable;
import org.spf.CMakeLists.InstallTargets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Install Targets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.impl.InstallTargetsImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.spf.CMakeLists.impl.InstallTargetsImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.spf.CMakeLists.impl.InstallTargetsImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstallTargetsImpl extends InstallInstructionImpl implements InstallTargets {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Executable> targets;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNTIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected Boolean runtime = RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstallTargetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMakeListsPackage.Literals.INSTALL_TARGETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Executable> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Executable>(Executable.class, this, CMakeListsPackage.INSTALL_TARGETS__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(Boolean newRuntime) {
		Boolean oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMakeListsPackage.INSTALL_TARGETS__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMakeListsPackage.INSTALL_TARGETS__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMakeListsPackage.INSTALL_TARGETS__TARGETS:
				return getTargets();
			case CMakeListsPackage.INSTALL_TARGETS__RUNTIME:
				return getRuntime();
			case CMakeListsPackage.INSTALL_TARGETS__DESTINATION:
				return getDestination();
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
			case CMakeListsPackage.INSTALL_TARGETS__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Executable>)newValue);
				return;
			case CMakeListsPackage.INSTALL_TARGETS__RUNTIME:
				setRuntime((Boolean)newValue);
				return;
			case CMakeListsPackage.INSTALL_TARGETS__DESTINATION:
				setDestination((String)newValue);
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
			case CMakeListsPackage.INSTALL_TARGETS__TARGETS:
				getTargets().clear();
				return;
			case CMakeListsPackage.INSTALL_TARGETS__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case CMakeListsPackage.INSTALL_TARGETS__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
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
			case CMakeListsPackage.INSTALL_TARGETS__TARGETS:
				return targets != null && !targets.isEmpty();
			case CMakeListsPackage.INSTALL_TARGETS__RUNTIME:
				return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
			case CMakeListsPackage.INSTALL_TARGETS__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
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
		result.append(" (runtime: ");
		result.append(runtime);
		result.append(", destination: ");
		result.append(destination);
		result.append(')');
		return result.toString();
	}

} //InstallTargetsImpl
