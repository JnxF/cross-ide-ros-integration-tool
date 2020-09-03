/**
 */
package org.spf.PackageXML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.spf.PackageXML.ArbitraryTag;
import org.spf.PackageXML.Attribute;
import org.spf.PackageXML.AuthorTag;
import org.spf.PackageXML.BuildDependDependencyTag;
import org.spf.PackageXML.BuildToolDependDependencyTag;
import org.spf.PackageXML.DeclaredPackageName;
import org.spf.PackageXML.DescriptionTag;
import org.spf.PackageXML.ExecDependDependencyTag;
import org.spf.PackageXML.ExportTag;
import org.spf.PackageXML.LicenseTag;
import org.spf.PackageXML.MaintainerTag;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.PackageXMLFactory;
import org.spf.PackageXML.PackageXMLPackage;
import org.spf.PackageXML.RunDependencyTag;
import org.spf.PackageXML.UrlTag;
import org.spf.PackageXML.VersionTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageXMLFactoryImpl extends EFactoryImpl implements PackageXMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageXMLFactory init() {
		try {
			PackageXMLFactory thePackageXMLFactory = (PackageXMLFactory)EPackage.Registry.INSTANCE.getEFactory(PackageXMLPackage.eNS_URI);
			if (thePackageXMLFactory != null) {
				return thePackageXMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageXMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageXMLFactoryImpl() {
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
			case PackageXMLPackage.PACKAGE: return createPackage();
			case PackageXMLPackage.NAME_TAG: return createNameTag();
			case PackageXMLPackage.DECLARED_PACKAGE_NAME: return createDeclaredPackageName();
			case PackageXMLPackage.VERSION_TAG: return createVersionTag();
			case PackageXMLPackage.DESCRIPTION_TAG: return createDescriptionTag();
			case PackageXMLPackage.MAINTAINER_TAG: return createMaintainerTag();
			case PackageXMLPackage.LICENSE_TAG: return createLicenseTag();
			case PackageXMLPackage.AUTHOR_TAG: return createAuthorTag();
			case PackageXMLPackage.URL_TAG: return createUrlTag();
			case PackageXMLPackage.RUN_DEPENDENCY_TAG: return createRunDependencyTag();
			case PackageXMLPackage.BUILD_DEPEND_DEPENDENCY_TAG: return createBuildDependDependencyTag();
			case PackageXMLPackage.EXEC_DEPEND_DEPENDENCY_TAG: return createExecDependDependencyTag();
			case PackageXMLPackage.BUILD_TOOL_DEPEND_DEPENDENCY_TAG: return createBuildToolDependDependencyTag();
			case PackageXMLPackage.EXPORT_TAG: return createExportTag();
			case PackageXMLPackage.ARBITRARY_TAG: return createArbitraryTag();
			case PackageXMLPackage.ATTRIBUTE: return createAttribute();
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
	public org.spf.PackageXML.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameTag createNameTag() {
		NameTagImpl nameTag = new NameTagImpl();
		return nameTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclaredPackageName createDeclaredPackageName() {
		DeclaredPackageNameImpl declaredPackageName = new DeclaredPackageNameImpl();
		return declaredPackageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionTag createVersionTag() {
		VersionTagImpl versionTag = new VersionTagImpl();
		return versionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionTag createDescriptionTag() {
		DescriptionTagImpl descriptionTag = new DescriptionTagImpl();
		return descriptionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintainerTag createMaintainerTag() {
		MaintainerTagImpl maintainerTag = new MaintainerTagImpl();
		return maintainerTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseTag createLicenseTag() {
		LicenseTagImpl licenseTag = new LicenseTagImpl();
		return licenseTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorTag createAuthorTag() {
		AuthorTagImpl authorTag = new AuthorTagImpl();
		return authorTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UrlTag createUrlTag() {
		UrlTagImpl urlTag = new UrlTagImpl();
		return urlTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunDependencyTag createRunDependencyTag() {
		RunDependencyTagImpl runDependencyTag = new RunDependencyTagImpl();
		return runDependencyTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildDependDependencyTag createBuildDependDependencyTag() {
		BuildDependDependencyTagImpl buildDependDependencyTag = new BuildDependDependencyTagImpl();
		return buildDependDependencyTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecDependDependencyTag createExecDependDependencyTag() {
		ExecDependDependencyTagImpl execDependDependencyTag = new ExecDependDependencyTagImpl();
		return execDependDependencyTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildToolDependDependencyTag createBuildToolDependDependencyTag() {
		BuildToolDependDependencyTagImpl buildToolDependDependencyTag = new BuildToolDependDependencyTagImpl();
		return buildToolDependDependencyTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportTag createExportTag() {
		ExportTagImpl exportTag = new ExportTagImpl();
		return exportTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArbitraryTag createArbitraryTag() {
		ArbitraryTagImpl arbitraryTag = new ArbitraryTagImpl();
		return arbitraryTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageXMLPackage getPackageXMLPackage() {
		return (PackageXMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackageXMLPackage getPackage() {
		return PackageXMLPackage.eINSTANCE;
	}

} //PackageXMLFactoryImpl
