/**
 */
package org.spf.LaunchFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spf.LaunchFile.LaunchFilePackage;
import org.spf.LaunchFile.Node;
import org.spf.LaunchFile.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getNode_executable <em>Node executable</em>}</li>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getPackage_name <em>Package name</em>}</li>
 *   <li>{@link org.spf.LaunchFile.impl.NodeImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getNode_name() <em>Node name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode_name() <em>Node name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_name()
	 * @generated
	 * @ordered
	 */
	protected String node_name = NODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode_executable() <em>Node executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_executable()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EXECUTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode_executable() <em>Node executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_executable()
	 * @generated
	 * @ordered
	 */
	protected String node_executable = NODE_EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getPackage_name() <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage_name() <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage_name()
	 * @generated
	 * @ordered
	 */
	protected String package_name = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaunchFilePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode_name() {
		return node_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_name(String newNode_name) {
		String oldNode_name = node_name;
		node_name = newNode_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.NODE__NODE_NAME, oldNode_name, node_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode_executable() {
		return node_executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_executable(String newNode_executable) {
		String oldNode_executable = node_executable;
		node_executable = newNode_executable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.NODE__NODE_EXECUTABLE, oldNode_executable, node_executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.NODE__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, LaunchFilePackage.NODE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage_name() {
		return package_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage_name(String newPackage_name) {
		String oldPackage_name = package_name;
		package_name = newPackage_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.NODE__PACKAGE_NAME, oldPackage_name, package_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchFilePackage.NODE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaunchFilePackage.NODE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case LaunchFilePackage.NODE__NODE_NAME:
				return getNode_name();
			case LaunchFilePackage.NODE__NODE_EXECUTABLE:
				return getNode_executable();
			case LaunchFilePackage.NODE__OUTPUT:
				return getOutput();
			case LaunchFilePackage.NODE__PARAMETERS:
				return getParameters();
			case LaunchFilePackage.NODE__PACKAGE_NAME:
				return getPackage_name();
			case LaunchFilePackage.NODE__NAMESPACE:
				return getNamespace();
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
			case LaunchFilePackage.NODE__NODE_NAME:
				setNode_name((String)newValue);
				return;
			case LaunchFilePackage.NODE__NODE_EXECUTABLE:
				setNode_executable((String)newValue);
				return;
			case LaunchFilePackage.NODE__OUTPUT:
				setOutput((String)newValue);
				return;
			case LaunchFilePackage.NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case LaunchFilePackage.NODE__PACKAGE_NAME:
				setPackage_name((String)newValue);
				return;
			case LaunchFilePackage.NODE__NAMESPACE:
				setNamespace((String)newValue);
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
			case LaunchFilePackage.NODE__NODE_NAME:
				setNode_name(NODE_NAME_EDEFAULT);
				return;
			case LaunchFilePackage.NODE__NODE_EXECUTABLE:
				setNode_executable(NODE_EXECUTABLE_EDEFAULT);
				return;
			case LaunchFilePackage.NODE__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case LaunchFilePackage.NODE__PARAMETERS:
				getParameters().clear();
				return;
			case LaunchFilePackage.NODE__PACKAGE_NAME:
				setPackage_name(PACKAGE_NAME_EDEFAULT);
				return;
			case LaunchFilePackage.NODE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case LaunchFilePackage.NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? node_name != null : !NODE_NAME_EDEFAULT.equals(node_name);
			case LaunchFilePackage.NODE__NODE_EXECUTABLE:
				return NODE_EXECUTABLE_EDEFAULT == null ? node_executable != null : !NODE_EXECUTABLE_EDEFAULT.equals(node_executable);
			case LaunchFilePackage.NODE__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case LaunchFilePackage.NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case LaunchFilePackage.NODE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? package_name != null : !PACKAGE_NAME_EDEFAULT.equals(package_name);
			case LaunchFilePackage.NODE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (node_name: ");
		result.append(node_name);
		result.append(", node_executable: ");
		result.append(node_executable);
		result.append(", output: ");
		result.append(output);
		result.append(", package_name: ");
		result.append(package_name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
