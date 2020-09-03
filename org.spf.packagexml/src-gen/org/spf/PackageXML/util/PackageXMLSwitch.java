/**
 */
package org.spf.PackageXML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.spf.PackageXML.PackageXMLPackage
 * @generated
 */
public class PackageXMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackageXMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageXMLSwitch() {
		if (modelPackage == null) {
			modelPackage = PackageXMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PackageXMLPackage.PACKAGE: {
				org.spf.PackageXML.Package package_ = (org.spf.PackageXML.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.DEPENDENCY_TAG: {
				DependencyTag dependencyTag = (DependencyTag)theEObject;
				T result = caseDependencyTag(dependencyTag);
				if (result == null) result = caseTag(dependencyTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.NAME_TAG: {
				NameTag nameTag = (NameTag)theEObject;
				T result = caseNameTag(nameTag);
				if (result == null) result = caseTag(nameTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.DECLARED_PACKAGE_NAME: {
				DeclaredPackageName declaredPackageName = (DeclaredPackageName)theEObject;
				T result = caseDeclaredPackageName(declaredPackageName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.VERSION_TAG: {
				VersionTag versionTag = (VersionTag)theEObject;
				T result = caseVersionTag(versionTag);
				if (result == null) result = caseTag(versionTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.DESCRIPTION_TAG: {
				DescriptionTag descriptionTag = (DescriptionTag)theEObject;
				T result = caseDescriptionTag(descriptionTag);
				if (result == null) result = caseTag(descriptionTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.MAINTAINER_TAG: {
				MaintainerTag maintainerTag = (MaintainerTag)theEObject;
				T result = caseMaintainerTag(maintainerTag);
				if (result == null) result = caseTag(maintainerTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.LICENSE_TAG: {
				LicenseTag licenseTag = (LicenseTag)theEObject;
				T result = caseLicenseTag(licenseTag);
				if (result == null) result = caseTag(licenseTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.AUTHOR_TAG: {
				AuthorTag authorTag = (AuthorTag)theEObject;
				T result = caseAuthorTag(authorTag);
				if (result == null) result = caseTag(authorTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.URL_TAG: {
				UrlTag urlTag = (UrlTag)theEObject;
				T result = caseUrlTag(urlTag);
				if (result == null) result = caseTag(urlTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.RUN_DEPENDENCY_TAG: {
				RunDependencyTag runDependencyTag = (RunDependencyTag)theEObject;
				T result = caseRunDependencyTag(runDependencyTag);
				if (result == null) result = caseDependencyTag(runDependencyTag);
				if (result == null) result = caseTag(runDependencyTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.BUILD_DEPEND_DEPENDENCY_TAG: {
				BuildDependDependencyTag buildDependDependencyTag = (BuildDependDependencyTag)theEObject;
				T result = caseBuildDependDependencyTag(buildDependDependencyTag);
				if (result == null) result = caseDependencyTag(buildDependDependencyTag);
				if (result == null) result = caseTag(buildDependDependencyTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.EXEC_DEPEND_DEPENDENCY_TAG: {
				ExecDependDependencyTag execDependDependencyTag = (ExecDependDependencyTag)theEObject;
				T result = caseExecDependDependencyTag(execDependDependencyTag);
				if (result == null) result = caseDependencyTag(execDependDependencyTag);
				if (result == null) result = caseTag(execDependDependencyTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.BUILD_TOOL_DEPEND_DEPENDENCY_TAG: {
				BuildToolDependDependencyTag buildToolDependDependencyTag = (BuildToolDependDependencyTag)theEObject;
				T result = caseBuildToolDependDependencyTag(buildToolDependDependencyTag);
				if (result == null) result = caseDependencyTag(buildToolDependDependencyTag);
				if (result == null) result = caseTag(buildToolDependDependencyTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.EXPORT_TAG: {
				ExportTag exportTag = (ExportTag)theEObject;
				T result = caseExportTag(exportTag);
				if (result == null) result = caseTag(exportTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.ARBITRARY_TAG: {
				ArbitraryTag arbitraryTag = (ArbitraryTag)theEObject;
				T result = caseArbitraryTag(arbitraryTag);
				if (result == null) result = caseTag(arbitraryTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageXMLPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.spf.PackageXML.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyTag(DependencyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameTag(NameTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Package Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Package Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredPackageName(DeclaredPackageName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionTag(VersionTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionTag(DescriptionTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainer Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainer Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainerTag(MaintainerTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseTag(LicenseTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorTag(AuthorTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlTag(UrlTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Dependency Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunDependencyTag(RunDependencyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Depend Dependency Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildDependDependencyTag(BuildDependDependencyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exec Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exec Depend Dependency Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecDependDependencyTag(ExecDependDependencyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Tool Depend Dependency Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Tool Depend Dependency Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildToolDependDependencyTag(BuildToolDependDependencyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportTag(ExportTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryTag(ArbitraryTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PackageXMLSwitch
