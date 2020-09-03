/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ament Target Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.AmentTargetDependencies#getName <em>Name</em>}</li>
 *   <li>{@link org.spf.CMakeLists.AmentTargetDependencies#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getAmentTargetDependencies()
 * @model
 * @generated
 */
public interface AmentTargetDependencies extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Executable)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getAmentTargetDependencies_Name()
	 * @model required="true"
	 * @generated
	 */
	Executable getName();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.AmentTargetDependencies#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Executable value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getAmentTargetDependencies_Dependencies()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getDependencies();

} // AmentTargetDependencies
