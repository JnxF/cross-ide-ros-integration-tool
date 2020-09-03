/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.InstallDirectory#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.spf.CMakeLists.InstallDirectory#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.spf.CMakeLists.InstallDirectory#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallDirectory()
 * @model
 * @generated
 */
public interface InstallDirectory extends InstallInstruction {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallDirectory_Directory()
	 * @model required="true"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.InstallDirectory#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallDirectory_Destination()
	 * @model required="true"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.InstallDirectory#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallDirectory_Patterns()
	 * @model
	 * @generated
	 */
	EList<String> getPatterns();

} // InstallDirectory
