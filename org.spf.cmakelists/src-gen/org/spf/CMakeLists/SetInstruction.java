/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.SetInstruction#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.spf.CMakeLists.SetInstruction#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getSetInstruction()
 * @model
 * @generated
 */
public interface SetInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getSetInstruction_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.SetInstruction#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getSetInstruction_Arguments()
	 * @model
	 * @generated
	 */
	EList<Object> getArguments();

} // SetInstruction
