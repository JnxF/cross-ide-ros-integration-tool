/**
 */
package org.spf.CMakeLists.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.spf.CMakeLists.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.spf.CMakeLists.CMakeListsPackage
 * @generated
 */
public class CMakeListsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CMakeListsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMakeListsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CMakeListsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMakeListsSwitch<Adapter> modelSwitch =
		new CMakeListsSwitch<Adapter>() {
			@Override
			public Adapter caseCMakeListsFile(CMakeListsFile object) {
				return createCMakeListsFileAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseCMakeMinimumRequired(CMakeMinimumRequired object) {
				return createCMakeMinimumRequiredAdapter();
			}
			@Override
			public Adapter caseProjectInstruction(ProjectInstruction object) {
				return createProjectInstructionAdapter();
			}
			@Override
			public Adapter caseFindPackage(FindPackage object) {
				return createFindPackageAdapter();
			}
			@Override
			public Adapter caseAddExecutable(AddExecutable object) {
				return createAddExecutableAdapter();
			}
			@Override
			public Adapter caseExecutable(Executable object) {
				return createExecutableAdapter();
			}
			@Override
			public Adapter caseAmentTargetDependencies(AmentTargetDependencies object) {
				return createAmentTargetDependenciesAdapter();
			}
			@Override
			public Adapter caseAmentPackageInstruction(AmentPackageInstruction object) {
				return createAmentPackageInstructionAdapter();
			}
			@Override
			public Adapter caseInstallInstruction(InstallInstruction object) {
				return createInstallInstructionAdapter();
			}
			@Override
			public Adapter caseInstallTargets(InstallTargets object) {
				return createInstallTargetsAdapter();
			}
			@Override
			public Adapter caseInstallDirectory(InstallDirectory object) {
				return createInstallDirectoryAdapter();
			}
			@Override
			public Adapter caseIfInstruction(IfInstruction object) {
				return createIfInstructionAdapter();
			}
			@Override
			public Adapter caseSetInstruction(SetInstruction object) {
				return createSetInstructionAdapter();
			}
			@Override
			public Adapter caseAddCompileOptions(AddCompileOptions object) {
				return createAddCompileOptionsAdapter();
			}
			@Override
			public Adapter caseUndefinedInstruction(UndefinedInstruction object) {
				return createUndefinedInstructionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.CMakeListsFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.CMakeListsFile
	 * @generated
	 */
	public Adapter createCMakeListsFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.CMakeMinimumRequired <em>CMake Minimum Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.CMakeMinimumRequired
	 * @generated
	 */
	public Adapter createCMakeMinimumRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.ProjectInstruction <em>Project Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.ProjectInstruction
	 * @generated
	 */
	public Adapter createProjectInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.FindPackage <em>Find Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.FindPackage
	 * @generated
	 */
	public Adapter createFindPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.AddExecutable <em>Add Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.AddExecutable
	 * @generated
	 */
	public Adapter createAddExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.AmentTargetDependencies <em>Ament Target Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.AmentTargetDependencies
	 * @generated
	 */
	public Adapter createAmentTargetDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.AmentPackageInstruction <em>Ament Package Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.AmentPackageInstruction
	 * @generated
	 */
	public Adapter createAmentPackageInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.InstallInstruction <em>Install Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.InstallInstruction
	 * @generated
	 */
	public Adapter createInstallInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.InstallTargets <em>Install Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.InstallTargets
	 * @generated
	 */
	public Adapter createInstallTargetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.InstallDirectory <em>Install Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.InstallDirectory
	 * @generated
	 */
	public Adapter createInstallDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.IfInstruction <em>If Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.IfInstruction
	 * @generated
	 */
	public Adapter createIfInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.SetInstruction <em>Set Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.SetInstruction
	 * @generated
	 */
	public Adapter createSetInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.AddCompileOptions <em>Add Compile Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.AddCompileOptions
	 * @generated
	 */
	public Adapter createAddCompileOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.CMakeLists.UndefinedInstruction <em>Undefined Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.CMakeLists.UndefinedInstruction
	 * @generated
	 */
	public Adapter createUndefinedInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CMakeListsAdapterFactory
