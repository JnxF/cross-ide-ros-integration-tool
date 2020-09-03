/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.AddExecutable#getName <em>Name</em>}</li>
 *   <li>{@link org.spf.CMakeLists.AddExecutable#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getAddExecutable()
 * @model
 * @generated
 */
public interface AddExecutable extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Executable)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getAddExecutable_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Executable getName();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.AddExecutable#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Executable value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getAddExecutable_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSources();

} // AddExecutable
