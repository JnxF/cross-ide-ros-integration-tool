/**
 */
package org.spf.PackageXML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.spf.PackageXML.ArbitraryTag;
import org.spf.PackageXML.Attribute;
import org.spf.PackageXML.AuthorTag;
import org.spf.PackageXML.BuildDependDependencyTag;
import org.spf.PackageXML.BuildToolDependDependencyTag;
import org.spf.PackageXML.DeclaredPackageName;
import org.spf.PackageXML.DependencyTag;
import org.spf.PackageXML.DescriptionTag;
import org.spf.PackageXML.ExecDependDependencyTag;
import org.spf.PackageXML.ExportTag;
import org.spf.PackageXML.LicenseTag;
import org.spf.PackageXML.MaintainerTag;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.PackageXMLFactory;
import org.spf.PackageXML.PackageXMLPackage;
import org.spf.PackageXML.RunDependencyTag;
import org.spf.PackageXML.Tag;
import org.spf.PackageXML.UrlTag;
import org.spf.PackageXML.VersionTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageXMLPackageImpl extends EPackageImpl implements PackageXMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaredPackageNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainerTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runDependencyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildDependDependencyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execDependDependencyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildToolDependDependencyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

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
	 * @see org.spf.PackageXML.PackageXMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackageXMLPackageImpl() {
		super(eNS_URI, PackageXMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PackageXMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackageXMLPackage init() {
		if (isInited) return (PackageXMLPackage)EPackage.Registry.INSTANCE.getEPackage(PackageXMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPackageXMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PackageXMLPackageImpl thePackageXMLPackage = registeredPackageXMLPackage instanceof PackageXMLPackageImpl ? (PackageXMLPackageImpl)registeredPackageXMLPackage : new PackageXMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePackageXMLPackage.createPackageContents();

		// Initialize created meta-data
		thePackageXMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackageXMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackageXMLPackage.eNS_URI, thePackageXMLPackage);
		return thePackageXMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Format() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Tags() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyTag() {
		return dependencyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameTag() {
		return nameTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameTag_DeclaredPackageName() {
		return (EReference)nameTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclaredPackageName() {
		return declaredPackageNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeclaredPackageName_Name() {
		return (EAttribute)declaredPackageNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionTag() {
		return versionTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionTag_Version() {
		return (EAttribute)versionTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionTag() {
		return descriptionTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionTag_DescriptionText() {
		return (EAttribute)descriptionTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaintainerTag() {
		return maintainerTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaintainerTag_Email() {
		return (EAttribute)maintainerTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaintainerTag_MaintainerText() {
		return (EAttribute)maintainerTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseTag() {
		return licenseTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseTag_License() {
		return (EAttribute)licenseTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorTag() {
		return authorTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorTag_Email() {
		return (EAttribute)authorTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorTag_AuthorText() {
		return (EAttribute)authorTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrlTag() {
		return urlTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUrlTag_Type() {
		return (EAttribute)urlTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUrlTag_Url() {
		return (EAttribute)urlTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunDependencyTag() {
		return runDependencyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunDependencyTag_Name() {
		return (EAttribute)runDependencyTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildDependDependencyTag() {
		return buildDependDependencyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildDependDependencyTag_Name() {
		return (EAttribute)buildDependDependencyTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecDependDependencyTag() {
		return execDependDependencyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecDependDependencyTag_Name() {
		return (EAttribute)execDependDependencyTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildToolDependDependencyTag() {
		return buildToolDependDependencyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildToolDependDependencyTag_Name() {
		return (EAttribute)buildToolDependDependencyTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExportTag() {
		return exportTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExportTag_Arbitrary_tags() {
		return (EReference)exportTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArbitraryTag() {
		return arbitraryTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArbitraryTag_Name() {
		return (EAttribute)arbitraryTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArbitraryTag_InnerText() {
		return (EAttribute)arbitraryTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArbitraryTag_Attributes() {
		return (EReference)arbitraryTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Key() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageXMLFactory getPackageXMLFactory() {
		return (PackageXMLFactory)getEFactoryInstance();
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
		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__FORMAT);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEReference(packageEClass, PACKAGE__TAGS);

		tagEClass = createEClass(TAG);

		dependencyTagEClass = createEClass(DEPENDENCY_TAG);

		nameTagEClass = createEClass(NAME_TAG);
		createEReference(nameTagEClass, NAME_TAG__DECLARED_PACKAGE_NAME);

		declaredPackageNameEClass = createEClass(DECLARED_PACKAGE_NAME);
		createEAttribute(declaredPackageNameEClass, DECLARED_PACKAGE_NAME__NAME);

		versionTagEClass = createEClass(VERSION_TAG);
		createEAttribute(versionTagEClass, VERSION_TAG__VERSION);

		descriptionTagEClass = createEClass(DESCRIPTION_TAG);
		createEAttribute(descriptionTagEClass, DESCRIPTION_TAG__DESCRIPTION_TEXT);

		maintainerTagEClass = createEClass(MAINTAINER_TAG);
		createEAttribute(maintainerTagEClass, MAINTAINER_TAG__EMAIL);
		createEAttribute(maintainerTagEClass, MAINTAINER_TAG__MAINTAINER_TEXT);

		licenseTagEClass = createEClass(LICENSE_TAG);
		createEAttribute(licenseTagEClass, LICENSE_TAG__LICENSE);

		authorTagEClass = createEClass(AUTHOR_TAG);
		createEAttribute(authorTagEClass, AUTHOR_TAG__EMAIL);
		createEAttribute(authorTagEClass, AUTHOR_TAG__AUTHOR_TEXT);

		urlTagEClass = createEClass(URL_TAG);
		createEAttribute(urlTagEClass, URL_TAG__TYPE);
		createEAttribute(urlTagEClass, URL_TAG__URL);

		runDependencyTagEClass = createEClass(RUN_DEPENDENCY_TAG);
		createEAttribute(runDependencyTagEClass, RUN_DEPENDENCY_TAG__NAME);

		buildDependDependencyTagEClass = createEClass(BUILD_DEPEND_DEPENDENCY_TAG);
		createEAttribute(buildDependDependencyTagEClass, BUILD_DEPEND_DEPENDENCY_TAG__NAME);

		execDependDependencyTagEClass = createEClass(EXEC_DEPEND_DEPENDENCY_TAG);
		createEAttribute(execDependDependencyTagEClass, EXEC_DEPEND_DEPENDENCY_TAG__NAME);

		buildToolDependDependencyTagEClass = createEClass(BUILD_TOOL_DEPEND_DEPENDENCY_TAG);
		createEAttribute(buildToolDependDependencyTagEClass, BUILD_TOOL_DEPEND_DEPENDENCY_TAG__NAME);

		exportTagEClass = createEClass(EXPORT_TAG);
		createEReference(exportTagEClass, EXPORT_TAG__ARBITRARY_TAGS);

		arbitraryTagEClass = createEClass(ARBITRARY_TAG);
		createEAttribute(arbitraryTagEClass, ARBITRARY_TAG__NAME);
		createEAttribute(arbitraryTagEClass, ARBITRARY_TAG__INNER_TEXT);
		createEReference(arbitraryTagEClass, ARBITRARY_TAG__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dependencyTagEClass.getESuperTypes().add(this.getTag());
		nameTagEClass.getESuperTypes().add(this.getTag());
		versionTagEClass.getESuperTypes().add(this.getTag());
		descriptionTagEClass.getESuperTypes().add(this.getTag());
		maintainerTagEClass.getESuperTypes().add(this.getTag());
		licenseTagEClass.getESuperTypes().add(this.getTag());
		authorTagEClass.getESuperTypes().add(this.getTag());
		urlTagEClass.getESuperTypes().add(this.getTag());
		runDependencyTagEClass.getESuperTypes().add(this.getDependencyTag());
		buildDependDependencyTagEClass.getESuperTypes().add(this.getDependencyTag());
		execDependDependencyTagEClass.getESuperTypes().add(this.getDependencyTag());
		buildToolDependDependencyTagEClass.getESuperTypes().add(this.getDependencyTag());
		exportTagEClass.getESuperTypes().add(this.getTag());
		arbitraryTagEClass.getESuperTypes().add(this.getTag());

		// Initialize classes, features, and operations; add parameters
		initEClass(packageEClass, org.spf.PackageXML.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Format(), ecorePackage.getEString(), "format", null, 1, 1, org.spf.PackageXML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 1, 1, org.spf.PackageXML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Tags(), this.getTag(), null, "tags", null, 0, -1, org.spf.PackageXML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyTagEClass, DependencyTag.class, "DependencyTag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameTagEClass, NameTag.class, "NameTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameTag_DeclaredPackageName(), this.getDeclaredPackageName(), null, "declaredPackageName", null, 1, 1, NameTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declaredPackageNameEClass, DeclaredPackageName.class, "DeclaredPackageName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaredPackageName_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeclaredPackageName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionTagEClass, VersionTag.class, "VersionTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionTag_Version(), ecorePackage.getEString(), "version", null, 1, 1, VersionTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionTagEClass, DescriptionTag.class, "DescriptionTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionTag_DescriptionText(), ecorePackage.getEString(), "descriptionText", null, 0, -1, DescriptionTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maintainerTagEClass, MaintainerTag.class, "MaintainerTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaintainerTag_Email(), ecorePackage.getEString(), "email", null, 1, 1, MaintainerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintainerTag_MaintainerText(), ecorePackage.getEString(), "maintainerText", null, 0, -1, MaintainerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseTagEClass, LicenseTag.class, "LicenseTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicenseTag_License(), ecorePackage.getEString(), "license", null, 1, 1, LicenseTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorTagEClass, AuthorTag.class, "AuthorTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorTag_Email(), ecorePackage.getEString(), "email", null, 0, 1, AuthorTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorTag_AuthorText(), ecorePackage.getEString(), "authorText", null, 0, -1, AuthorTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlTagEClass, UrlTag.class, "UrlTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlTag_Type(), ecorePackage.getEString(), "type", null, 1, 1, UrlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlTag_Url(), ecorePackage.getEString(), "url", null, 1, 1, UrlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runDependencyTagEClass, RunDependencyTag.class, "RunDependencyTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunDependencyTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, RunDependencyTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildDependDependencyTagEClass, BuildDependDependencyTag.class, "BuildDependDependencyTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildDependDependencyTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, BuildDependDependencyTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execDependDependencyTagEClass, ExecDependDependencyTag.class, "ExecDependDependencyTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecDependDependencyTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExecDependDependencyTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildToolDependDependencyTagEClass, BuildToolDependDependencyTag.class, "BuildToolDependDependencyTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildToolDependDependencyTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, BuildToolDependDependencyTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportTagEClass, ExportTag.class, "ExportTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportTag_Arbitrary_tags(), this.getArbitraryTag(), null, "arbitrary_tags", null, 0, -1, ExportTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitraryTagEClass, ArbitraryTag.class, "ArbitraryTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArbitraryTag_Name(), ecorePackage.getEString(), "name", null, 1, 1, ArbitraryTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArbitraryTag_InnerText(), ecorePackage.getEString(), "innerText", null, 0, -1, ArbitraryTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryTag_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ArbitraryTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Key(), ecorePackage.getEString(), "key", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PackageXMLPackageImpl
