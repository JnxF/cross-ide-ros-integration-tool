/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.spf.CMakeLists.CMakeListsPackage
 * @generated
 */
public interface CMakeListsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMakeListsFactory eINSTANCE = org.spf.CMakeLists.impl.CMakeListsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	CMakeListsFile createCMakeListsFile();

	/**
	 * Returns a new object of class '<em>CMake Minimum Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMake Minimum Required</em>'.
	 * @generated
	 */
	CMakeMinimumRequired createCMakeMinimumRequired();

	/**
	 * Returns a new object of class '<em>Project Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Instruction</em>'.
	 * @generated
	 */
	ProjectInstruction createProjectInstruction();

	/**
	 * Returns a new object of class '<em>Find Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Package</em>'.
	 * @generated
	 */
	FindPackage createFindPackage();

	/**
	 * Returns a new object of class '<em>Add Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Executable</em>'.
	 * @generated
	 */
	AddExecutable createAddExecutable();

	/**
	 * Returns a new object of class '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable</em>'.
	 * @generated
	 */
	Executable createExecutable();

	/**
	 * Returns a new object of class '<em>Ament Target Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ament Target Dependencies</em>'.
	 * @generated
	 */
	AmentTargetDependencies createAmentTargetDependencies();

	/**
	 * Returns a new object of class '<em>Ament Package Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ament Package Instruction</em>'.
	 * @generated
	 */
	AmentPackageInstruction createAmentPackageInstruction();

	/**
	 * Returns a new object of class '<em>Install Targets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Install Targets</em>'.
	 * @generated
	 */
	InstallTargets createInstallTargets();

	/**
	 * Returns a new object of class '<em>Install Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Install Directory</em>'.
	 * @generated
	 */
	InstallDirectory createInstallDirectory();

	/**
	 * Returns a new object of class '<em>If Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Instruction</em>'.
	 * @generated
	 */
	IfInstruction createIfInstruction();

	/**
	 * Returns a new object of class '<em>Set Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Instruction</em>'.
	 * @generated
	 */
	SetInstruction createSetInstruction();

	/**
	 * Returns a new object of class '<em>Add Compile Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Compile Options</em>'.
	 * @generated
	 */
	AddCompileOptions createAddCompileOptions();

	/**
	 * Returns a new object of class '<em>Undefined Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Instruction</em>'.
	 * @generated
	 */
	UndefinedInstruction createUndefinedInstruction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CMakeListsPackage getCMakeListsPackage();

} //CMakeListsFactory
