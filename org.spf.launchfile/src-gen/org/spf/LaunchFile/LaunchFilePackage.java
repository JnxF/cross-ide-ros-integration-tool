/**
 */
package org.spf.LaunchFile;

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
 * @see org.spf.LaunchFile.LaunchFileFactory
 * @model kind="package"
 * @generated
 */
public interface LaunchFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LaunchFile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spf.org/launchfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LaunchFile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaunchFilePackage eINSTANCE = org.spf.LaunchFile.impl.LaunchFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.PythonFileImpl <em>Python File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.PythonFileImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getPythonFile()
	 * @generated
	 */
	int PYTHON_FILE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Python File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Python File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.PythonInstructionImpl <em>Python Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.PythonInstructionImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getPythonInstruction()
	 * @generated
	 */
	int PYTHON_INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Python Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Python Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.ImportStatementImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__FROM = PYTHON_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORTS = PYTHON_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = PYTHON_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_OPERATION_COUNT = PYTHON_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.FunctionImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = PYTHON_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = PYTHON_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = PYTHON_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = PYTHON_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.ReturnStatementImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Launch Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__LAUNCH_DESCRIPTION = PYTHON_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = PYTHON_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_OPERATION_COUNT = PYTHON_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.LaunchDescriptionImpl <em>Launch Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.LaunchDescriptionImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getLaunchDescription()
	 * @generated
	 */
	int LAUNCH_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_DESCRIPTION__NODES = 0;

	/**
	 * The number of structural features of the '<em>Launch Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Launch Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.NodeImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Node name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Node executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_EXECUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Package name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAMESPACE = 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.LaunchFile.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.LaunchFile.impl.ParameterImpl
	 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.PythonFile <em>Python File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Python File</em>'.
	 * @see org.spf.LaunchFile.PythonFile
	 * @generated
	 */
	EClass getPythonFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.LaunchFile.PythonFile#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.spf.LaunchFile.PythonFile#getInstructions()
	 * @see #getPythonFile()
	 * @generated
	 */
	EReference getPythonFile_Instructions();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.PythonInstruction <em>Python Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Python Instruction</em>'.
	 * @see org.spf.LaunchFile.PythonInstruction
	 * @generated
	 */
	EClass getPythonInstruction();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.spf.LaunchFile.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.ImportStatement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.spf.LaunchFile.ImportStatement#getFrom()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_From();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.LaunchFile.ImportStatement#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.spf.LaunchFile.ImportStatement#getImports()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_Imports();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.spf.LaunchFile.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.LaunchFile.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.LaunchFile.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.spf.LaunchFile.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.spf.LaunchFile.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.spf.LaunchFile.ReturnStatement#getLaunchDescription <em>Launch Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launch Description</em>'.
	 * @see org.spf.LaunchFile.ReturnStatement#getLaunchDescription()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_LaunchDescription();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.LaunchDescription <em>Launch Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Description</em>'.
	 * @see org.spf.LaunchFile.LaunchDescription
	 * @generated
	 */
	EClass getLaunchDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.LaunchFile.LaunchDescription#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.spf.LaunchFile.LaunchDescription#getNodes()
	 * @see #getLaunchDescription()
	 * @generated
	 */
	EReference getLaunchDescription_Nodes();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.spf.LaunchFile.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Node#getNode_name <em>Node name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node name</em>'.
	 * @see org.spf.LaunchFile.Node#getNode_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Node_name();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Node#getNode_executable <em>Node executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node executable</em>'.
	 * @see org.spf.LaunchFile.Node#getNode_executable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Node_executable();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Node#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.spf.LaunchFile.Node#getOutput()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.LaunchFile.Node#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.spf.LaunchFile.Node#getParameters()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Node#getPackage_name <em>Package name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package name</em>'.
	 * @see org.spf.LaunchFile.Node#getPackage_name()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Package_name();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Node#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.spf.LaunchFile.Node#getNamespace()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Namespace();

	/**
	 * Returns the meta object for class '{@link org.spf.LaunchFile.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.spf.LaunchFile.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.LaunchFile.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.LaunchFile.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.spf.LaunchFile.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaunchFileFactory getLaunchFileFactory();

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
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.PythonFileImpl <em>Python File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.PythonFileImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getPythonFile()
		 * @generated
		 */
		EClass PYTHON_FILE = eINSTANCE.getPythonFile();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PYTHON_FILE__INSTRUCTIONS = eINSTANCE.getPythonFile_Instructions();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.PythonInstructionImpl <em>Python Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.PythonInstructionImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getPythonInstruction()
		 * @generated
		 */
		EClass PYTHON_INSTRUCTION = eINSTANCE.getPythonInstruction();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.ImportStatementImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__FROM = eINSTANCE.getImportStatement_From();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__IMPORTS = eINSTANCE.getImportStatement_Imports();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.FunctionImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.ReturnStatementImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Launch Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__LAUNCH_DESCRIPTION = eINSTANCE.getReturnStatement_LaunchDescription();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.LaunchDescriptionImpl <em>Launch Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.LaunchDescriptionImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getLaunchDescription()
		 * @generated
		 */
		EClass LAUNCH_DESCRIPTION = eINSTANCE.getLaunchDescription();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH_DESCRIPTION__NODES = eINSTANCE.getLaunchDescription_Nodes();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.NodeImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_NAME = eINSTANCE.getNode_Node_name();

		/**
		 * The meta object literal for the '<em><b>Node executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_EXECUTABLE = eINSTANCE.getNode_Node_executable();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__OUTPUT = eINSTANCE.getNode_Output();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETERS = eINSTANCE.getNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Package name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PACKAGE_NAME = eINSTANCE.getNode_Package_name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAMESPACE = eINSTANCE.getNode_Namespace();

		/**
		 * The meta object literal for the '{@link org.spf.LaunchFile.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.LaunchFile.impl.ParameterImpl
		 * @see org.spf.LaunchFile.impl.LaunchFilePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

	}

} //LaunchFilePackage
