/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.CMakeLists.IfInstruction#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.spf.CMakeLists.IfInstruction#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.spf.CMakeLists.CMakeListsPackage#getIfInstruction()
 * @model
 * @generated
 */
public interface IfInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getIfInstruction_Predicate()
	 * @model
	 * @generated
	 */
	EList<String> getPredicate();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.CMakeLists.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.spf.CMakeLists.CMakeListsPackage#getIfInstruction_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // IfInstruction
