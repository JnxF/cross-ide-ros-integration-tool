/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Compile Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.AddCompileOptions#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getAddCompileOptions()
 * @model
 * @generated
 */
public interface AddCompileOptions extends Instruction {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getAddCompileOptions_Options()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getOptions();

} // AddCompileOptions
