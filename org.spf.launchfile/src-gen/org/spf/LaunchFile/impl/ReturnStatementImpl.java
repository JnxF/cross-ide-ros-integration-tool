/**
 */
package org.spf.LaunchFile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.spf.LaunchFile.LaunchDescription;
import org.spf.LaunchFile.LaunchFilePackage;
import org.spf.LaunchFile.ReturnStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.impl.ReturnStatementImpl#getLaunchDescription <em>Launch Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnStatementImpl extends PythonInstructionImpl implements ReturnStatement {
	/**
	 * The cached value of the '{@link #getLaunchDescription() <em>Launch Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchDescription()
	 * @generated
	 * @ordered
	 */
	protected LaunchDescription launchDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaunchFilePackage.Literals.RETURN_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchDescription getLaunchDescription() {
		return launchDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaunchDescription(LaunchDescription newLaunchDescription, NotificationChain msgs) {
		LaunchDescription oldLaunchDescription = launchDescription;
		launchDescription = newLaunchDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION, oldLaunchDescription, newLaunchDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchDescription(LaunchDescription newLaunchDescription) {
		if (newLaunchDescription != launchDescription) {
			NotificationChain msgs = null;
			if (launchDescription != null)
				msgs = ((InternalEObject)launchDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION, null, msgs);
			if (newLaunchDescription != null)
				msgs = ((InternalEObject)newLaunchDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION, null, msgs);
			msgs = basicSetLaunchDescription(newLaunchDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION, newLaunchDescription, newLaunchDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION:
				return basicSetLaunchDescription(null, msgs);
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
			case LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION:
				return getLaunchDescription();
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
			case LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION:
				setLaunchDescription((LaunchDescription)newValue);
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
			case LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION:
				setLaunchDescription((LaunchDescription)null);
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
			case LaunchFilePackage.RETURN_STATEMENT__LAUNCH_DESCRIPTION:
				return launchDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnStatementImpl
