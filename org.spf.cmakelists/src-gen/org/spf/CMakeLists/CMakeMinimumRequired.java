/**
 */
package org.spf.CMakeLists;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMake Minimum Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.CMakeMinimumRequired#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getCMakeMinimumRequired()
 * @model
 * @generated
 */
public interface CMakeMinimumRequired extends Instruction {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getCMakeMinimumRequired_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.CMakeMinimumRequired#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CMakeMinimumRequired
