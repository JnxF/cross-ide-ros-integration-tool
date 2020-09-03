/**
 */
package org.spf.CMakeLists.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.spf.CMakeLists.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMakeListsFactoryImpl extends EFactoryImpl implements CMakeListsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMakeListsFactory init() {
		try {
			CMakeListsFactory theCMakeListsFactory = (CMakeListsFactory)EPackage.Registry.INSTANCE.getEFactory(CMakeListsPackage.eNS_URI);
			if (theCMakeListsFactory != null) {
				return theCMakeListsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CMakeListsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMakeListsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CMakeListsPackage.CMAKE_LISTS_FILE: return createCMakeListsFile();
			case CMakeListsPackage.CMAKE_MINIMUM_REQUIRED: return createCMakeMinimumRequired();
			case CMakeListsPackage.PROJECT_INSTRUCTION: return createProjectInstruction();
			case CMakeListsPackage.FIND_PACKAGE: return createFindPackage();
			case CMakeListsPackage.ADD_EXECUTABLE: return createAddExecutable();
			case CMakeListsPackage.EXECUTABLE: return createExecutable();
			case CMakeListsPackage.AMENT_TARGET_DEPENDENCIES: return createAmentTargetDependencies();
			case CMakeListsPackage.AMENT_PACKAGE_INSTRUCTION: return createAmentPackageInstruction();
			case CMakeListsPackage.INSTALL_TARGETS: return createInstallTargets();
			case CMakeListsPackage.INSTALL_DIRECTORY: return createInstallDirectory();
			case CMakeListsPackage.IF_INSTRUCTION: return createIfInstruction();
			case CMakeListsPackage.SET_INSTRUCTION: return createSetInstruction();
			case CMakeListsPackage.ADD_COMPILE_OPTIONS: return createAddCompileOptions();
			case CMakeListsPackage.UNDEFINED_INSTRUCTION: return createUndefinedInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMakeListsFile createCMakeListsFile() {
		CMakeListsFileImpl cMakeListsFile = new CMakeListsFileImpl();
		return cMakeListsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMakeMinimumRequired createCMakeMinimumRequired() {
		CMakeMinimumRequiredImpl cMakeMinimumRequired = new CMakeMinimumRequiredImpl();
		return cMakeMinimumRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectInstruction createProjectInstruction() {
		ProjectInstructionImpl projectInstruction = new ProjectInstructionImpl();
		return projectInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindPackage createFindPackage() {
		FindPackageImpl findPackage = new FindPackageImpl();
		return findPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddExecutable createAddExecutable() {
		AddExecutableImpl addExecutable = new AddExecutableImpl();
		return addExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Executable createExecutable() {
		ExecutableImpl executable = new ExecutableImpl();
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmentTargetDependencies createAmentTargetDependencies() {
		AmentTargetDependenciesImpl amentTargetDependencies = new AmentTargetDependenciesImpl();
		return amentTargetDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmentPackageInstruction createAmentPackageInstruction() {
		AmentPackageInstructionImpl amentPackageInstruction = new AmentPackageInstructionImpl();
		return amentPackageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstallTargets createInstallTargets() {
		InstallTargetsImpl installTargets = new InstallTargetsImpl();
		return installTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstallDirectory createInstallDirectory() {
		InstallDirectoryImpl installDirectory = new InstallDirectoryImpl();
		return installDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfInstruction createIfInstruction() {
		IfInstructionImpl ifInstruction = new IfInstructionImpl();
		return ifInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetInstruction createSetInstruction() {
		SetInstructionImpl setInstruction = new SetInstructionImpl();
		return setInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddCompileOptions createAddCompileOptions() {
		AddCompileOptionsImpl addCompileOptions = new AddCompileOptionsImpl();
		return addCompileOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndefinedInstruction createUndefinedInstruction() {
		UndefinedInstructionImpl undefinedInstruction = new UndefinedInstructionImpl();
		return undefinedInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMakeListsPackage getCMakeListsPackage() {
		return (CMakeListsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CMakeListsPackage getPackage() {
		return CMakeListsPackage.eINSTANCE;
	}

} //CMakeListsFactoryImpl
