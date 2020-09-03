/**
 */
package org.spf.LaunchFile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.ReturnStatement#getLaunchDescription <em>Launch Description</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends PythonInstruction {
	/**
	 * Returns the value of the '<em><b>Launch Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Description</em>' containment reference.
	 * @see #setLaunchDescription(LaunchDescription)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getReturnStatement_LaunchDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LaunchDescription getLaunchDescription();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.ReturnStatement#getLaunchDescription <em>Launch Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Description</em>' containment reference.
	 * @see #getLaunchDescription()
	 * @generated
	 */
	void setLaunchDescription(LaunchDescription value);

} // ReturnStatement
