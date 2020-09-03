/**
 */
package org.spf.LaunchFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Python File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.PythonFile#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getPythonFile()
 * @model
 * @generated
 */
public interface PythonFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.LaunchFile.PythonInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.spf.LaunchFile.LaunchFilePackage#getPythonFile_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PythonInstruction> getInstructions();

} // PythonFile
