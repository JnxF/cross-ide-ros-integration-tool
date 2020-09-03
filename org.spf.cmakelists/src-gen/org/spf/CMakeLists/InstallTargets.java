/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install Targets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.InstallTargets#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.spf.CMakeLists.InstallTargets#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link org.spf.CMakeLists.InstallTargets#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallTargets()
 * @model
 * @generated
 */
public interface InstallTargets extends InstallInstruction {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.spf.CMakeLists.Executable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallTargets_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Executable> getTargets();

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(Boolean)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallTargets_Runtime()
	 * @model default="false"
	 * @generated
	 */
	Boolean getRuntime();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.InstallTargets#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.spf.CMakeLists.CMakeListsPackage#getInstallTargets_Destination()
	 * @model required="true"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.spf.CMakeLists.InstallTargets#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

} // InstallTargets
