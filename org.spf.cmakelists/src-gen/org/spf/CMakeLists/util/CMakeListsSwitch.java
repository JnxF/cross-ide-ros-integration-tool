/**
 */
package org.spf.CMakeLists.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.spf.CMakeLists.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.spf.CMakeLists.CMakeListsPackage
 * @generated
 */
public class CMakeListsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMakeListsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMakeListsSwitch() {
		if (modelPackage == null) {
			modelPackage = CMakeListsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CMakeListsPackage.CMAKE_LISTS_FILE: {
				CMakeListsFile cMakeListsFile = (CMakeListsFile)theEObject;
				T result = caseCMakeListsFile(cMakeListsFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.CMAKE_MINIMUM_REQUIRED: {
				CMakeMinimumRequired cMakeMinimumRequired = (CMakeMinimumRequired)theEObject;
				T result = caseCMakeMinimumRequired(cMakeMinimumRequired);
				if (result == null) result = caseInstruction(cMakeMinimumRequired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.PROJECT_INSTRUCTION: {
				ProjectInstruction projectInstruction = (ProjectInstruction)theEObject;
				T result = caseProjectInstruction(projectInstruction);
				if (result == null) result = caseInstruction(projectInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.FIND_PACKAGE: {
				FindPackage findPackage = (FindPackage)theEObject;
				T result = caseFindPackage(findPackage);
				if (result == null) result = caseInstruction(findPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.ADD_EXECUTABLE: {
				AddExecutable addExecutable = (AddExecutable)theEObject;
				T result = caseAddExecutable(addExecutable);
				if (result == null) result = caseInstruction(addExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.EXECUTABLE: {
				Executable executable = (Executable)theEObject;
				T result = caseExecutable(executable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES: {
				AmentTargetDependencies amentTargetDependencies = (AmentTargetDependencies)theEObject;
				T result = caseAmentTargetDependencies(amentTargetDependencies);
				if (result == null) result = caseInstruction(amentTargetDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.AMENT_PACKAGE_INSTRUCTION: {
				AmentPackageInstruction amentPackageInstruction = (AmentPackageInstruction)theEObject;
				T result = caseAmentPackageInstruction(amentPackageInstruction);
				if (result == null) result = caseInstruction(amentPackageInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.INSTALL_INSTRUCTION: {
				InstallInstruction installInstruction = (InstallInstruction)theEObject;
				T result = caseInstallInstruction(installInstruction);
				if (result == null) result = caseInstruction(installInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.INSTALL_TARGETS: {
				InstallTargets installTargets = (InstallTargets)theEObject;
				T result = caseInstallTargets(installTargets);
				if (result == null) result = caseInstallInstruction(installTargets);
				if (result == null) result = caseInstruction(installTargets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.INSTALL_DIRECTORY: {
				InstallDirectory installDirectory = (InstallDirectory)theEObject;
				T result = caseInstallDirectory(installDirectory);
				if (result == null) result = caseInstallInstruction(installDirectory);
				if (result == null) result = caseInstruction(installDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.IF_INSTRUCTION: {
				IfInstruction ifInstruction = (IfInstruction)theEObject;
				T result = caseIfInstruction(ifInstruction);
				if (result == null) result = caseInstruction(ifInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.SET_INSTRUCTION: {
				SetInstruction setInstruction = (SetInstruction)theEObject;
				T result = caseSetInstruction(setInstruction);
				if (result == null) result = caseInstruction(setInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.ADD_COMPILE_OPTIONS: {
				AddCompileOptions addCompileOptions = (AddCompileOptions)theEObject;
				T result = caseAddCompileOptions(addCompileOptions);
				if (result == null) result = caseInstruction(addCompileOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CMakeListsPackage.UNDEFINED_INSTRUCTION: {
				UndefinedInstruction undefinedInstruction = (UndefinedInstruction)theEObject;
				T result = caseUndefinedInstruction(undefinedInstruction);
				if (result == null) result = caseInstruction(undefinedInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMakeListsFile(CMakeListsFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMake Minimum Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMake Minimum Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMakeMinimumRequired(CMakeMinimumRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectInstruction(ProjectInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindPackage(FindPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddExecutable(AddExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutable(Executable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ament Target Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ament Target Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmentTargetDependencies(AmentTargetDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ament Package Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ament Package Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmentPackageInstruction(AmentPackageInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Install Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Install Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallInstruction(InstallInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Install Targets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Install Targets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallTargets(InstallTargets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Install Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Install Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallDirectory(InstallDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfInstruction(IfInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetInstruction(SetInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Compile Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Compile Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCompileOptions(AddCompileOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndefinedInstruction(UndefinedInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CMakeListsSwitch
