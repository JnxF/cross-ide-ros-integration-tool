/**
 */
package org.spf.PackageXML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.spf.PackageXML.PackageXMLPackage
 * @generated
 */
public interface PackageXMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageXMLFactory eINSTANCE = org.spf.PackageXML.impl.PackageXMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Name Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Tag</em>'.
	 * @generated
	 */
	NameTag createNameTag();

	/**
	 * Returns a new object of class '<em>Declared Package Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declared Package Name</em>'.
	 * @generated
	 */
	DeclaredPackageName createDeclaredPackageName();

	/**
	 * Returns a new object of class '<em>Version Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Tag</em>'.
	 * @generated
	 */
	VersionTag createVersionTag();

	/**
	 * Returns a new object of class '<em>Description Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Tag</em>'.
	 * @generated
	 */
	DescriptionTag createDescriptionTag();

	/**
	 * Returns a new object of class '<em>Maintainer Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintainer Tag</em>'.
	 * @generated
	 */
	MaintainerTag createMaintainerTag();

	/**
	 * Returns a new object of class '<em>License Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Tag</em>'.
	 * @generated
	 */
	LicenseTag createLicenseTag();

	/**
	 * Returns a new object of class '<em>Author Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author Tag</em>'.
	 * @generated
	 */
	AuthorTag createAuthorTag();

	/**
	 * Returns a new object of class '<em>Url Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url Tag</em>'.
	 * @generated
	 */
	UrlTag createUrlTag();

	/**
	 * Returns a new object of class '<em>Run Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Dependency Tag</em>'.
	 * @generated
	 */
	RunDependencyTag createRunDependencyTag();

	/**
	 * Returns a new object of class '<em>Build Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Depend Dependency Tag</em>'.
	 * @generated
	 */
	BuildDependDependencyTag createBuildDependDependencyTag();

	/**
	 * Returns a new object of class '<em>Exec Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Depend Dependency Tag</em>'.
	 * @generated
	 */
	ExecDependDependencyTag createExecDependDependencyTag();

	/**
	 * Returns a new object of class '<em>Build Tool Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Tool Depend Dependency Tag</em>'.
	 * @generated
	 */
	BuildToolDependDependencyTag createBuildToolDependDependencyTag();

	/**
	 * Returns a new object of class '<em>Export Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Tag</em>'.
	 * @generated
	 */
	ExportTag createExportTag();

	/**
	 * Returns a new object of class '<em>Arbitrary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Tag</em>'.
	 * @generated
	 */
	ArbitraryTag createArbitraryTag();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackageXMLPackage getPackageXMLPackage();

} //PackageXMLFactory
