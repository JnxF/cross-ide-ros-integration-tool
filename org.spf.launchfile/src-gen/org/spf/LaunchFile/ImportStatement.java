/**
 */
package org.spf.LaunchFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.ImportStatement#getFrom <em>From</em>}</li>
 *   <li>{@link org.spf.LaunchFile.ImportStatement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends PythonInstruction {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.spf.LaunchFile.LaunchFilePackage#getImportStatement_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.spf.LaunchFile.ImportStatement#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see org.spf.LaunchFile.LaunchFilePackage#getImportStatement_Imports()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getImports();

} // ImportStatement
