/**
 */
package org.spf.CMakeLists;

import org.spf.PackageXML.DeclaredPackageName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.ProjectInstruction#getDeclaredPackageName <em>Declared Package Name</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getProjectInstruction()
 * @model
 * @generated
 */
public interface ProjectInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Declared Package Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Package Name</em>' reference.
	 * @see #setDeclaredPackageName(DeclaredPackageName)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getProjectInstruction_DeclaredPackageName()
	 * @model required="true"
	 * @generated
	 */
	DeclaredPackageName getDeclaredPackageName();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.ProjectInstruction#getDeclaredPackageName <em>Declared Package Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Package Name</em>' reference.
	 * @see #getDeclaredPackageName()
	 * @generated
	 */
	void setDeclaredPackageName(DeclaredPackageName value);

} // ProjectInstruction
