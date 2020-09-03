/**
 */
package org.spf.LaunchFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.Node#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Node#getNode_executable <em>Node executable</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Node#getOutput <em>Output</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Node#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Node#getPackage_name <em>Package name</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Node#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Node name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node name</em>' attribute.
	 * @see #setNode_name(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Node_name()
	 * @model
	 * @generated
	 */
	String getNode_name();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Node#getNode_name <em>Node name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node name</em>' attribute.
	 * @see #getNode_name()
	 * @generated
	 */
	void setNode_name(String value);

	/**
	 * Returns the value of the '<em><b>Node executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node executable</em>' attribute.
	 * @see #setNode_executable(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Node_executable()
	 * @model required="true"
	 * @generated
	 */
	String getNode_executable();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Node#getNode_executable <em>Node executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node executable</em>' attribute.
	 * @see #getNode_executable()
	 * @generated
	 */
	void setNode_executable(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Node#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.LaunchFile.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Package name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package name</em>' attribute.
	 * @see #setPackage_name(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Package_name()
	 * @model required="true"
	 * @generated
	 */
	String getPackage_name();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Node#getPackage_name <em>Package name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package name</em>' attribute.
	 * @see #getPackage_name()
	 * @generated
	 */
	void setPackage_name(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getNode_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Node#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Node
