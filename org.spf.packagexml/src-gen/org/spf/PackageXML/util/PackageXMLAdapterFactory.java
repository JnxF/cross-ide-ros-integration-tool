/**
 */
package org.spf.PackageXML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import org.spf.PackageXML.PackageXMLPackage;
import org.spf.PackageXML.RunDependencyTag;
import org.spf.PackageXML.Tag;
import org.spf.PackageXML.UrlTag;
import org.spf.PackageXML.VersionTag;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.spf.PackageXML.PackageXMLPackage
 * @generated
 */
public class PackageXMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackageXMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageXMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PackageXMLPackage.eINSTANCE;
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
	protected PackageXMLSwitch<Adapter> modelSwitch =
		new PackageXMLSwitch<Adapter>() {
			@Override
			public Adapter casePackage(org.spf.PackageXML.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseDependencyTag(DependencyTag object) {
				return createDependencyTagAdapter();
			}
			@Override
			public Adapter caseNameTag(NameTag object) {
				return createNameTagAdapter();
			}
			@Override
			public Adapter caseDeclaredPackageName(DeclaredPackageName object) {
				return createDeclaredPackageNameAdapter();
			}
			@Override
			public Adapter caseVersionTag(VersionTag object) {
				return createVersionTagAdapter();
			}
			@Override
			public Adapter caseDescriptionTag(DescriptionTag object) {
				return createDescriptionTagAdapter();
			}
			@Override
			public Adapter caseMaintainerTag(MaintainerTag object) {
				return createMaintainerTagAdapter();
			}
			@Override
			public Adapter caseLicenseTag(LicenseTag object) {
				return createLicenseTagAdapter();
			}
			@Override
			public Adapter caseAuthorTag(AuthorTag object) {
				return createAuthorTagAdapter();
			}
			@Override
			public Adapter caseUrlTag(UrlTag object) {
				return createUrlTagAdapter();
			}
			@Override
			public Adapter caseRunDependencyTag(RunDependencyTag object) {
				return createRunDependencyTagAdapter();
			}
			@Override
			public Adapter caseBuildDependDependencyTag(BuildDependDependencyTag object) {
				return createBuildDependDependencyTagAdapter();
			}
			@Override
			public Adapter caseExecDependDependencyTag(ExecDependDependencyTag object) {
				return createExecDependDependencyTagAdapter();
			}
			@Override
			public Adapter caseBuildToolDependDependencyTag(BuildToolDependDependencyTag object) {
				return createBuildToolDependDependencyTagAdapter();
			}
			@Override
			public Adapter caseExportTag(ExportTag object) {
				return createExportTagAdapter();
			}
			@Override
			public Adapter caseArbitraryTag(ArbitraryTag object) {
				return createArbitraryTagAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.DependencyTag <em>Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.DependencyTag
	 * @generated
	 */
	public Adapter createDependencyTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.NameTag <em>Name Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.NameTag
	 * @generated
	 */
	public Adapter createNameTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.DeclaredPackageName <em>Declared Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.DeclaredPackageName
	 * @generated
	 */
	public Adapter createDeclaredPackageNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.VersionTag <em>Version Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.VersionTag
	 * @generated
	 */
	public Adapter createVersionTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.DescriptionTag <em>Description Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.DescriptionTag
	 * @generated
	 */
	public Adapter createDescriptionTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.MaintainerTag <em>Maintainer Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.MaintainerTag
	 * @generated
	 */
	public Adapter createMaintainerTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.LicenseTag <em>License Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.LicenseTag
	 * @generated
	 */
	public Adapter createLicenseTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.AuthorTag <em>Author Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.AuthorTag
	 * @generated
	 */
	public Adapter createAuthorTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.UrlTag <em>Url Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.UrlTag
	 * @generated
	 */
	public Adapter createUrlTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.RunDependencyTag <em>Run Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.RunDependencyTag
	 * @generated
	 */
	public Adapter createRunDependencyTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.BuildDependDependencyTag <em>Build Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.BuildDependDependencyTag
	 * @generated
	 */
	public Adapter createBuildDependDependencyTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.ExecDependDependencyTag <em>Exec Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.ExecDependDependencyTag
	 * @generated
	 */
	public Adapter createExecDependDependencyTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.BuildToolDependDependencyTag <em>Build Tool Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.BuildToolDependDependencyTag
	 * @generated
	 */
	public Adapter createBuildToolDependDependencyTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.ExportTag <em>Export Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.ExportTag
	 * @generated
	 */
	public Adapter createExportTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.ArbitraryTag <em>Arbitrary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.ArbitraryTag
	 * @generated
	 */
	public Adapter createArbitraryTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spf.PackageXML.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spf.PackageXML.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
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

} //PackageXMLAdapterFactory
