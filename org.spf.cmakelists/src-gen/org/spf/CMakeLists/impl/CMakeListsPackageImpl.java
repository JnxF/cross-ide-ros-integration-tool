/**
 */
package org.spf.CMakeLists.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.spf.CMakeLists.AddCompileOptions;
import org.spf.CMakeLists.AddExecutable;
import org.spf.CMakeLists.AmentPackageInstruction;
import org.spf.CMakeLists.AmentTargetDependencies;
import org.spf.CMakeLists.CMakeListsFactory;
import org.spf.CMakeLists.CMakeListsFile;
import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.CMakeLists.CMakeMinimumRequired;
import org.spf.CMakeLists.Executable;
import org.spf.CMakeLists.FindPackage;
import org.spf.CMakeLists.IfInstruction;
import org.spf.CMakeLists.InstallDirectory;
import org.spf.CMakeLists.InstallInstruction;
import org.spf.CMakeLists.InstallTargets;
import org.spf.CMakeLists.Instruction;
import org.spf.CMakeLists.ProjectInstruction;
import org.spf.CMakeLists.SetInstruction;
import org.spf.CMakeLists.UndefinedInstruction;

import org.spf.PackageXML.PackageXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMakeListsPackageImpl extends EPackageImpl implements CMakeListsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cMakeListsFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cMakeMinimumRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amentTargetDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amentPackageInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installTargetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addCompileOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undefinedInstructionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.spf.CMakeLists.CMakeListsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CMakeListsPackageImpl() {
		super(eNS_URI, CMakeListsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CMakeListsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CMakeListsPackage init() {
		if (isInited) return (CMakeListsPackage)EPackage.Registry.INSTANCE.getEPackage(CMakeListsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCMakeListsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CMakeListsPackageImpl theCMakeListsPackage = registeredCMakeListsPackage instanceof CMakeListsPackageImpl ? (CMakeListsPackageImpl)registeredCMakeListsPackage : new CMakeListsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PackageXMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCMakeListsPackage.createPackageContents();

		// Initialize created meta-data
		theCMakeListsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCMakeListsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CMakeListsPackage.eNS_URI, theCMakeListsPackage);
		return theCMakeListsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMakeListsFile() {
		return cMakeListsFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMakeListsFile_Instructions() {
		return (EReference)cMakeListsFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMakeMinimumRequired() {
		return cMakeMinimumRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMakeMinimumRequired_Version() {
		return (EAttribute)cMakeMinimumRequiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectInstruction() {
		return projectInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectInstruction_DeclaredPackageName() {
		return (EReference)projectInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFindPackage() {
		return findPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindPackage_Name() {
		return (EAttribute)findPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindPackage_Required() {
		return (EAttribute)findPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindPackage_Components() {
		return (EAttribute)findPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddExecutable() {
		return addExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddExecutable_Name() {
		return (EReference)addExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddExecutable_Sources() {
		return (EAttribute)addExecutableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutable() {
		return executableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutable_Name() {
		return (EAttribute)executableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmentTargetDependencies() {
		return amentTargetDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmentTargetDependencies_Name() {
		return (EReference)amentTargetDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmentTargetDependencies_Dependencies() {
		return (EAttribute)amentTargetDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmentPackageInstruction() {
		return amentPackageInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstallInstruction() {
		return installInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstallTargets() {
		return installTargetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstallTargets_Targets() {
		return (EReference)installTargetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallTargets_Runtime() {
		return (EAttribute)installTargetsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallTargets_Destination() {
		return (EAttribute)installTargetsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstallDirectory() {
		return installDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallDirectory_Directory() {
		return (EAttribute)installDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallDirectory_Destination() {
		return (EAttribute)installDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstallDirectory_Patterns() {
		return (EAttribute)installDirectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfInstruction() {
		return ifInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfInstruction_Predicate() {
		return (EAttribute)ifInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfInstruction_Instructions() {
		return (EReference)ifInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetInstruction() {
		return setInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInstruction_Variable() {
		return (EAttribute)setInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetInstruction_Arguments() {
		return (EAttribute)setInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddCompileOptions() {
		return addCompileOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddCompileOptions_Options() {
		return (EAttribute)addCompileOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndefinedInstruction() {
		return undefinedInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUndefinedInstruction_Name() {
		return (EAttribute)undefinedInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUndefinedInstruction_Arguments() {
		return (EAttribute)undefinedInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMakeListsFactory getCMakeListsFactory() {
		return (CMakeListsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cMakeListsFileEClass = createEClass(CMAKE_LISTS_FILE);
		createEReference(cMakeListsFileEClass, CMAKE_LISTS_FILE__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		cMakeMinimumRequiredEClass = createEClass(CMAKE_MINIMUM_REQUIRED);
		createEAttribute(cMakeMinimumRequiredEClass, CMAKE_MINIMUM_REQUIRED__VERSION);

		projectInstructionEClass = createEClass(PROJECT_INSTRUCTION);
		createEReference(projectInstructionEClass, PROJECT_INSTRUCTION__DECLARED_PACKAGE_NAME);

		findPackageEClass = createEClass(FIND_PACKAGE);
		createEAttribute(findPackageEClass, FIND_PACKAGE__NAME);
		createEAttribute(findPackageEClass, FIND_PACKAGE__REQUIRED);
		createEAttribute(findPackageEClass, FIND_PACKAGE__COMPONENTS);

		addExecutableEClass = createEClass(ADD_EXECUTABLE);
		createEReference(addExecutableEClass, ADD_EXECUTABLE__NAME);
		createEAttribute(addExecutableEClass, ADD_EXECUTABLE__SOURCES);

		executableEClass = createEClass(EXECUTABLE);
		createEAttribute(executableEClass, EXECUTABLE__NAME);

		amentTargetDependenciesEClass = createEClass(AMENT_TARGET_DEPENDENCIES);
		createEReference(amentTargetDependenciesEClass, AMENT_TARGET_DEPENDENCIES__NAME);
		createEAttribute(amentTargetDependenciesEClass, AMENT_TARGET_DEPENDENCIES__DEPENDENCIES);

		amentPackageInstructionEClass = createEClass(AMENT_PACKAGE_INSTRUCTION);

		installInstructionEClass = createEClass(INSTALL_INSTRUCTION);

		installTargetsEClass = createEClass(INSTALL_TARGETS);
		createEReference(installTargetsEClass, INSTALL_TARGETS__TARGETS);
		createEAttribute(installTargetsEClass, INSTALL_TARGETS__RUNTIME);
		createEAttribute(installTargetsEClass, INSTALL_TARGETS__DESTINATION);

		installDirectoryEClass = createEClass(INSTALL_DIRECTORY);
		createEAttribute(installDirectoryEClass, INSTALL_DIRECTORY__DIRECTORY);
		createEAttribute(installDirectoryEClass, INSTALL_DIRECTORY__DESTINATION);
		createEAttribute(installDirectoryEClass, INSTALL_DIRECTORY__PATTERNS);

		ifInstructionEClass = createEClass(IF_INSTRUCTION);
		createEAttribute(ifInstructionEClass, IF_INSTRUCTION__PREDICATE);
		createEReference(ifInstructionEClass, IF_INSTRUCTION__INSTRUCTIONS);

		setInstructionEClass = createEClass(SET_INSTRUCTION);
		createEAttribute(setInstructionEClass, SET_INSTRUCTION__VARIABLE);
		createEAttribute(setInstructionEClass, SET_INSTRUCTION__ARGUMENTS);

		addCompileOptionsEClass = createEClass(ADD_COMPILE_OPTIONS);
		createEAttribute(addCompileOptionsEClass, ADD_COMPILE_OPTIONS__OPTIONS);

		undefinedInstructionEClass = createEClass(UNDEFINED_INSTRUCTION);
		createEAttribute(undefinedInstructionEClass, UNDEFINED_INSTRUCTION__NAME);
		createEAttribute(undefinedInstructionEClass, UNDEFINED_INSTRUCTION__ARGUMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PackageXMLPackage thePackageXMLPackage = (PackageXMLPackage)EPackage.Registry.INSTANCE.getEPackage(PackageXMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cMakeMinimumRequiredEClass.getESuperTypes().add(this.getInstruction());
		projectInstructionEClass.getESuperTypes().add(this.getInstruction());
		findPackageEClass.getESuperTypes().add(this.getInstruction());
		addExecutableEClass.getESuperTypes().add(this.getInstruction());
		amentTargetDependenciesEClass.getESuperTypes().add(this.getInstruction());
		amentPackageInstructionEClass.getESuperTypes().add(this.getInstruction());
		installInstructionEClass.getESuperTypes().add(this.getInstruction());
		installTargetsEClass.getESuperTypes().add(this.getInstallInstruction());
		installDirectoryEClass.getESuperTypes().add(this.getInstallInstruction());
		ifInstructionEClass.getESuperTypes().add(this.getInstruction());
		setInstructionEClass.getESuperTypes().add(this.getInstruction());
		addCompileOptionsEClass.getESuperTypes().add(this.getInstruction());
		undefinedInstructionEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(cMakeListsFileEClass, CMakeListsFile.class, "CMakeListsFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMakeListsFile_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, CMakeListsFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cMakeMinimumRequiredEClass, CMakeMinimumRequired.class, "CMakeMinimumRequired", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCMakeMinimumRequired_Version(), ecorePackage.getEString(), "version", null, 1, 1, CMakeMinimumRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectInstructionEClass, ProjectInstruction.class, "ProjectInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectInstruction_DeclaredPackageName(), thePackageXMLPackage.getDeclaredPackageName(), null, "declaredPackageName", null, 1, 1, ProjectInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findPackageEClass, FindPackage.class, "FindPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFindPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, FindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindPackage_Required(), ecorePackage.getEBooleanObject(), "required", "false", 0, 1, FindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFindPackage_Components(), ecorePackage.getEString(), "components", null, 0, -1, FindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addExecutableEClass, AddExecutable.class, "AddExecutable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddExecutable_Name(), this.getExecutable(), null, "name", null, 1, 1, AddExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddExecutable_Sources(), ecorePackage.getEString(), "sources", null, 1, -1, AddExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executableEClass, Executable.class, "Executable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Executable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amentTargetDependenciesEClass, AmentTargetDependencies.class, "AmentTargetDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmentTargetDependencies_Name(), this.getExecutable(), null, "name", null, 1, 1, AmentTargetDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmentTargetDependencies_Dependencies(), ecorePackage.getEString(), "dependencies", null, 1, -1, AmentTargetDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amentPackageInstructionEClass, AmentPackageInstruction.class, "AmentPackageInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(installInstructionEClass, InstallInstruction.class, "InstallInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(installTargetsEClass, InstallTargets.class, "InstallTargets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstallTargets_Targets(), this.getExecutable(), null, "targets", null, 1, -1, InstallTargets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallTargets_Runtime(), ecorePackage.getEBooleanObject(), "runtime", "false", 0, 1, InstallTargets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallTargets_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, InstallTargets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installDirectoryEClass, InstallDirectory.class, "InstallDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstallDirectory_Directory(), ecorePackage.getEString(), "directory", null, 1, 1, InstallDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallDirectory_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, InstallDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallDirectory_Patterns(), ecorePackage.getEString(), "patterns", null, 0, -1, InstallDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifInstructionEClass, IfInstruction.class, "IfInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIfInstruction_Predicate(), ecorePackage.getEString(), "predicate", null, 0, -1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfInstruction_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, IfInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setInstructionEClass, SetInstruction.class, "SetInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetInstruction_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, SetInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetInstruction_Arguments(), ecorePackage.getEJavaObject(), "arguments", null, 0, -1, SetInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addCompileOptionsEClass, AddCompileOptions.class, "AddCompileOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddCompileOptions_Options(), ecorePackage.getEString(), "options", null, 1, -1, AddCompileOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undefinedInstructionEClass, UndefinedInstruction.class, "UndefinedInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUndefinedInstruction_Name(), ecorePackage.getEString(), "name", null, 1, 1, UndefinedInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUndefinedInstruction_Arguments(), ecorePackage.getEJavaObject(), "arguments", null, 0, -1, UndefinedInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CMakeListsPackageImpl
