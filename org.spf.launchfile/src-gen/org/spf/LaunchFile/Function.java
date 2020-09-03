/**
 */
package org.spf.LaunchFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.spf.LaunchFile.Function#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends PythonInstruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.LaunchFile.PythonInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.spf.LaunchFile.LaunchFilePackage#getFunction_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PythonInstruction> getBody();

} // Function
