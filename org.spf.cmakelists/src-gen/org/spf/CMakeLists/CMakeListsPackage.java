/**
 */
package org.spf.CMakeLists;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.spf.CMakeLists.CMakeListsFactory
 * @model kind="package"
 * @generated
 */
public interface CMakeListsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CMakeLists";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spf.org/cmakelists";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CMakeLists";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMakeListsPackage eINSTANCE = org.spf.CMakeLists.impl.CMakeListsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.CMakeListsFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.CMakeListsFileImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getCMakeListsFile()
	 * @generated
	 */
	int CMAKE_LISTS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_LISTS_FILE__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_LISTS_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_LISTS_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.InstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.CMakeMinimumRequiredImpl <em>CMake Minimum Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.CMakeMinimumRequiredImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getCMakeMinimumRequired()
	 * @generated
	 */
	int CMAKE_MINIMUM_REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_MINIMUM_REQUIRED__VERSION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CMake Minimum Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_MINIMUM_REQUIRED_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CMake Minimum Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMAKE_MINIMUM_REQUIRED_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.ProjectInstructionImpl <em>Project Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.ProjectInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getProjectInstruction()
	 * @generated
	 */
	int PROJECT_INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Declared Package Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.FindPackageImpl <em>Find Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.FindPackageImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getFindPackage()
	 * @generated
	 */
	int FIND_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_PACKAGE__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_PACKAGE__REQUIRED = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_PACKAGE__COMPONENTS = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Find Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_PACKAGE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Find Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_PACKAGE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.AddExecutableImpl <em>Add Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.AddExecutableImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAddExecutable()
	 * @generated
	 */
	int ADD_EXECUTABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTABLE__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTABLE__SOURCES = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTABLE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTABLE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.ExecutableImpl <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.ExecutableImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.AmentTargetDependenciesImpl <em>Ament Target Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.AmentTargetDependenciesImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAmentTargetDependencies()
	 * @generated
	 */
	int AMENT_TARGET_DEPENDENCIES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_TARGET_DEPENDENCIES__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_TARGET_DEPENDENCIES__DEPENDENCIES = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ament Target Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_TARGET_DEPENDENCIES_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ament Target Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_TARGET_DEPENDENCIES_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.AmentPackageInstructionImpl <em>Ament Package Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.AmentPackageInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAmentPackageInstruction()
	 * @generated
	 */
	int AMENT_PACKAGE_INSTRUCTION = 8;

	/**
	 * The number of structural features of the '<em>Ament Package Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_PACKAGE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ament Package Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMENT_PACKAGE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.InstallInstructionImpl <em>Install Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.InstallInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallInstruction()
	 * @generated
	 */
	int INSTALL_INSTRUCTION = 9;

	/**
	 * The number of structural features of the '<em>Install Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Install Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.InstallTargetsImpl <em>Install Targets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.InstallTargetsImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallTargets()
	 * @generated
	 */
	int INSTALL_TARGETS = 10;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_TARGETS__TARGETS = INSTALL_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_TARGETS__RUNTIME = INSTALL_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_TARGETS__DESTINATION = INSTALL_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Install Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_TARGETS_FEATURE_COUNT = INSTALL_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Install Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_TARGETS_OPERATION_COUNT = INSTALL_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.InstallDirectoryImpl <em>Install Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.InstallDirectoryImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallDirectory()
	 * @generated
	 */
	int INSTALL_DIRECTORY = 11;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_DIRECTORY__DIRECTORY = INSTALL_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_DIRECTORY__DESTINATION = INSTALL_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_DIRECTORY__PATTERNS = INSTALL_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Install Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_DIRECTORY_FEATURE_COUNT = INSTALL_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Install Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_DIRECTORY_OPERATION_COUNT = INSTALL_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.IfInstructionImpl <em>If Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.IfInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getIfInstruction()
	 * @generated
	 */
	int IF_INSTRUCTION = 12;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION__PREDICATE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.SetInstructionImpl <em>Set Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.SetInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getSetInstruction()
	 * @generated
	 */
	int SET_INSTRUCTION = 13;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INSTRUCTION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INSTRUCTION__ARGUMENTS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.AddCompileOptionsImpl <em>Add Compile Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.AddCompileOptionsImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAddCompileOptions()
	 * @generated
	 */
	int ADD_COMPILE_OPTIONS = 14;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPILE_OPTIONS__OPTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Compile Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPILE_OPTIONS_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Compile Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COMPILE_OPTIONS_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.CMakeLists.impl.UndefinedInstructionImpl <em>Undefined Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.CMakeLists.impl.UndefinedInstructionImpl
	 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getUndefinedInstruction()
	 * @generated
	 */
	int UNDEFINED_INSTRUCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_INSTRUCTION__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_INSTRUCTION__ARGUMENTS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Undefined Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Undefined Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.CMakeListsFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.spf.CMakeLists.CMakeListsFile
	 * @generated
	 */
	EClass getCMakeListsFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.CMakeLists.CMakeListsFile#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.spf.CMakeLists.CMakeListsFile#getInstructions()
	 * @see #getCMakeListsFile()
	 * @generated
	 */
	EReference getCMakeListsFile_Instructions();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.spf.CMakeLists.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.CMakeMinimumRequired <em>CMake Minimum Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMake Minimum Required</em>'.
	 * @see org.spf.CMakeLists.CMakeMinimumRequired
	 * @generated
	 */
	EClass getCMakeMinimumRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.CMakeMinimumRequired#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.spf.CMakeLists.CMakeMinimumRequired#getVersion()
	 * @see #getCMakeMinimumRequired()
	 * @generated
	 */
	EAttribute getCMakeMinimumRequired_Version();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.ProjectInstruction <em>Project Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Instruction</em>'.
	 * @see org.spf.CMakeLists.ProjectInstruction
	 * @generated
	 */
	EClass getProjectInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.spf.CMakeLists.ProjectInstruction#getDeclaredPackageName <em>Declared Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Package Name</em>'.
	 * @see org.spf.CMakeLists.ProjectInstruction#getDeclaredPackageName()
	 * @see #getProjectInstruction()
	 * @generated
	 */
	EReference getProjectInstruction_DeclaredPackageName();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.FindPackage <em>Find Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Package</em>'.
	 * @see org.spf.CMakeLists.FindPackage
	 * @generated
	 */
	EClass getFindPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.FindPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.CMakeLists.FindPackage#getName()
	 * @see #getFindPackage()
	 * @generated
	 */
	EAttribute getFindPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.FindPackage#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.spf.CMakeLists.FindPackage#getRequired()
	 * @see #getFindPackage()
	 * @generated
	 */
	EAttribute getFindPackage_Required();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.FindPackage#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Components</em>'.
	 * @see org.spf.CMakeLists.FindPackage#getComponents()
	 * @see #getFindPackage()
	 * @generated
	 */
	EAttribute getFindPackage_Components();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.AddExecutable <em>Add Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Executable</em>'.
	 * @see org.spf.CMakeLists.AddExecutable
	 * @generated
	 */
	EClass getAddExecutable();

	/**
	 * Returns the meta object for the containment reference '{@link org.spf.CMakeLists.AddExecutable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.spf.CMakeLists.AddExecutable#getName()
	 * @see #getAddExecutable()
	 * @generated
	 */
	EReference getAddExecutable_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.AddExecutable#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sources</em>'.
	 * @see org.spf.CMakeLists.AddExecutable#getSources()
	 * @see #getAddExecutable()
	 * @generated
	 */
	EAttribute getAddExecutable_Sources();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see org.spf.CMakeLists.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.Executable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.CMakeLists.Executable#getName()
	 * @see #getExecutable()
	 * @generated
	 */
	EAttribute getExecutable_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.AmentTargetDependencies <em>Ament Target Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ament Target Dependencies</em>'.
	 * @see org.spf.CMakeLists.AmentTargetDependencies
	 * @generated
	 */
	EClass getAmentTargetDependencies();

	/**
	 * Returns the meta object for the reference '{@link org.spf.CMakeLists.AmentTargetDependencies#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.spf.CMakeLists.AmentTargetDependencies#getName()
	 * @see #getAmentTargetDependencies()
	 * @generated
	 */
	EReference getAmentTargetDependencies_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.AmentTargetDependencies#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependencies</em>'.
	 * @see org.spf.CMakeLists.AmentTargetDependencies#getDependencies()
	 * @see #getAmentTargetDependencies()
	 * @generated
	 */
	EAttribute getAmentTargetDependencies_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.AmentPackageInstruction <em>Ament Package Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ament Package Instruction</em>'.
	 * @see org.spf.CMakeLists.AmentPackageInstruction
	 * @generated
	 */
	EClass getAmentPackageInstruction();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.InstallInstruction <em>Install Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install Instruction</em>'.
	 * @see org.spf.CMakeLists.InstallInstruction
	 * @generated
	 */
	EClass getInstallInstruction();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.InstallTargets <em>Install Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install Targets</em>'.
	 * @see org.spf.CMakeLists.InstallTargets
	 * @generated
	 */
	EClass getInstallTargets();

	/**
	 * Returns the meta object for the reference list '{@link org.spf.CMakeLists.InstallTargets#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.spf.CMakeLists.InstallTargets#getTargets()
	 * @see #getInstallTargets()
	 * @generated
	 */
	EReference getInstallTargets_Targets();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.InstallTargets#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see org.spf.CMakeLists.InstallTargets#getRuntime()
	 * @see #getInstallTargets()
	 * @generated
	 */
	EAttribute getInstallTargets_Runtime();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.InstallTargets#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.spf.CMakeLists.InstallTargets#getDestination()
	 * @see #getInstallTargets()
	 * @generated
	 */
	EAttribute getInstallTargets_Destination();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.InstallDirectory <em>Install Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install Directory</em>'.
	 * @see org.spf.CMakeLists.InstallDirectory
	 * @generated
	 */
	EClass getInstallDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.InstallDirectory#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see org.spf.CMakeLists.InstallDirectory#getDirectory()
	 * @see #getInstallDirectory()
	 * @generated
	 */
	EAttribute getInstallDirectory_Directory();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.InstallDirectory#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.spf.CMakeLists.InstallDirectory#getDestination()
	 * @see #getInstallDirectory()
	 * @generated
	 */
	EAttribute getInstallDirectory_Destination();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.InstallDirectory#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patterns</em>'.
	 * @see org.spf.CMakeLists.InstallDirectory#getPatterns()
	 * @see #getInstallDirectory()
	 * @generated
	 */
	EAttribute getInstallDirectory_Patterns();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.IfInstruction <em>If Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Instruction</em>'.
	 * @see org.spf.CMakeLists.IfInstruction
	 * @generated
	 */
	EClass getIfInstruction();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.IfInstruction#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Predicate</em>'.
	 * @see org.spf.CMakeLists.IfInstruction#getPredicate()
	 * @see #getIfInstruction()
	 * @generated
	 */
	EAttribute getIfInstruction_Predicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.CMakeLists.IfInstruction#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.spf.CMakeLists.IfInstruction#getInstructions()
	 * @see #getIfInstruction()
	 * @generated
	 */
	EReference getIfInstruction_Instructions();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.SetInstruction <em>Set Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Instruction</em>'.
	 * @see org.spf.CMakeLists.SetInstruction
	 * @generated
	 */
	EClass getSetInstruction();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.SetInstruction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.spf.CMakeLists.SetInstruction#getVariable()
	 * @see #getSetInstruction()
	 * @generated
	 */
	EAttribute getSetInstruction_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.SetInstruction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see org.spf.CMakeLists.SetInstruction#getArguments()
	 * @see #getSetInstruction()
	 * @generated
	 */
	EAttribute getSetInstruction_Arguments();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.AddCompileOptions <em>Add Compile Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Compile Options</em>'.
	 * @see org.spf.CMakeLists.AddCompileOptions
	 * @generated
	 */
	EClass getAddCompileOptions();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.AddCompileOptions#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see org.spf.CMakeLists.AddCompileOptions#getOptions()
	 * @see #getAddCompileOptions()
	 * @generated
	 */
	EAttribute getAddCompileOptions_Options();

	/**
	 * Returns the meta object for class '{@link org.spf.CMakeLists.UndefinedInstruction <em>Undefined Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Instruction</em>'.
	 * @see org.spf.CMakeLists.UndefinedInstruction
	 * @generated
	 */
	EClass getUndefinedInstruction();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.CMakeLists.UndefinedInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.CMakeLists.UndefinedInstruction#getName()
	 * @see #getUndefinedInstruction()
	 * @generated
	 */
	EAttribute getUndefinedInstruction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.CMakeLists.UndefinedInstruction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see org.spf.CMakeLists.UndefinedInstruction#getArguments()
	 * @see #getUndefinedInstruction()
	 * @generated
	 */
	EAttribute getUndefinedInstruction_Arguments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CMakeListsFactory getCMakeListsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.CMakeListsFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.CMakeListsFileImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getCMakeListsFile()
		 * @generated
		 */
		EClass CMAKE_LISTS_FILE = eINSTANCE.getCMakeListsFile();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMAKE_LISTS_FILE__INSTRUCTIONS = eINSTANCE.getCMakeListsFile_Instructions();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.InstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.CMakeMinimumRequiredImpl <em>CMake Minimum Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.CMakeMinimumRequiredImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getCMakeMinimumRequired()
		 * @generated
		 */
		EClass CMAKE_MINIMUM_REQUIRED = eINSTANCE.getCMakeMinimumRequired();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMAKE_MINIMUM_REQUIRED__VERSION = eINSTANCE.getCMakeMinimumRequired_Version();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.ProjectInstructionImpl <em>Project Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.ProjectInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getProjectInstruction()
		 * @generated
		 */
		EClass PROJECT_INSTRUCTION = eINSTANCE.getProjectInstruction();

		/**
		 * The meta object literal for the '<em><b>Declared Package Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME = eINSTANCE.getProjectInstruction_DeclaredPackageName();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.FindPackageImpl <em>Find Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.FindPackageImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getFindPackage()
		 * @generated
		 */
		EClass FIND_PACKAGE = eINSTANCE.getFindPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_PACKAGE__NAME = eINSTANCE.getFindPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_PACKAGE__REQUIRED = eINSTANCE.getFindPackage_Required();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_PACKAGE__COMPONENTS = eINSTANCE.getFindPackage_Components();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.AddExecutableImpl <em>Add Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.AddExecutableImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAddExecutable()
		 * @generated
		 */
		EClass ADD_EXECUTABLE = eINSTANCE.getAddExecutable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_EXECUTABLE__NAME = eINSTANCE.getAddExecutable_Name();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_EXECUTABLE__SOURCES = eINSTANCE.getAddExecutable_Sources();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.ExecutableImpl <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.ExecutableImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE__NAME = eINSTANCE.getExecutable_Name();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.AmentTargetDependenciesImpl <em>Ament Target Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.AmentTargetDependenciesImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAmentTargetDependencies()
		 * @generated
		 */
		EClass AMENT_TARGET_DEPENDENCIES = eINSTANCE.getAmentTargetDependencies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMENT_TARGET_DEPENDENCIES__NAME = eINSTANCE.getAmentTargetDependencies_Name();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMENT_TARGET_DEPENDENCIES__DEPENDENCIES = eINSTANCE.getAmentTargetDependencies_Dependencies();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.AmentPackageInstructionImpl <em>Ament Package Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.AmentPackageInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAmentPackageInstruction()
		 * @generated
		 */
		EClass AMENT_PACKAGE_INSTRUCTION = eINSTANCE.getAmentPackageInstruction();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.InstallInstructionImpl <em>Install Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.InstallInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallInstruction()
		 * @generated
		 */
		EClass INSTALL_INSTRUCTION = eINSTANCE.getInstallInstruction();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.InstallTargetsImpl <em>Install Targets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.InstallTargetsImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallTargets()
		 * @generated
		 */
		EClass INSTALL_TARGETS = eINSTANCE.getInstallTargets();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_TARGETS__TARGETS = eINSTANCE.getInstallTargets_Targets();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_TARGETS__RUNTIME = eINSTANCE.getInstallTargets_Runtime();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_TARGETS__DESTINATION = eINSTANCE.getInstallTargets_Destination();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.InstallDirectoryImpl <em>Install Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.InstallDirectoryImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getInstallDirectory()
		 * @generated
		 */
		EClass INSTALL_DIRECTORY = eINSTANCE.getInstallDirectory();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_DIRECTORY__DIRECTORY = eINSTANCE.getInstallDirectory_Directory();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_DIRECTORY__DESTINATION = eINSTANCE.getInstallDirectory_Destination();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL_DIRECTORY__PATTERNS = eINSTANCE.getInstallDirectory_Patterns();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.IfInstructionImpl <em>If Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.IfInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getIfInstruction()
		 * @generated
		 */
		EClass IF_INSTRUCTION = eINSTANCE.getIfInstruction();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_INSTRUCTION__PREDICATE = eINSTANCE.getIfInstruction_Predicate();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_INSTRUCTION__INSTRUCTIONS = eINSTANCE.getIfInstruction_Instructions();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.SetInstructionImpl <em>Set Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.SetInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getSetInstruction()
		 * @generated
		 */
		EClass SET_INSTRUCTION = eINSTANCE.getSetInstruction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INSTRUCTION__VARIABLE = eINSTANCE.getSetInstruction_Variable();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INSTRUCTION__ARGUMENTS = eINSTANCE.getSetInstruction_Arguments();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.AddCompileOptionsImpl <em>Add Compile Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.AddCompileOptionsImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getAddCompileOptions()
		 * @generated
		 */
		EClass ADD_COMPILE_OPTIONS = eINSTANCE.getAddCompileOptions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COMPILE_OPTIONS__OPTIONS = eINSTANCE.getAddCompileOptions_Options();

		/**
		 * The meta object literal for the '{@link org.spf.CMakeLists.impl.UndefinedInstructionImpl <em>Undefined Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.CMakeLists.impl.UndefinedInstructionImpl
		 * @see org.spf.CMakeLists.impl.CMakeListsPackageImpl#getUndefinedInstruction()
		 * @generated
		 */
		EClass UNDEFINED_INSTRUCTION = eINSTANCE.getUndefinedInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDEFINED_INSTRUCTION__NAME = eINSTANCE.getUndefinedInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDEFINED_INSTRUCTION__ARGUMENTS = eINSTANCE.getUndefinedInstruction_Arguments();

	}

} //CMakeListsPackage
