/**
 */
package org.spf.PackageXML;

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
 * @see org.spf.PackageXML.PackageXMLFactory
 * @model kind="package"
 * @generated
 */
public interface PackageXMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PackageXML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spf.org/packagexml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PackageXML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageXMLPackage eINSTANCE = org.spf.PackageXML.impl.PackageXMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.PackageImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.TagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.DependencyTagImpl <em>Dependency Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.DependencyTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDependencyTag()
	 * @generated
	 */
	int DEPENDENCY_TAG = 2;

	/**
	 * The number of structural features of the '<em>Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.NameTagImpl <em>Name Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.NameTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getNameTag()
	 * @generated
	 */
	int NAME_TAG = 3;

	/**
	 * The feature id for the '<em><b>Declared Package Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TAG__DECLARED_PACKAGE_NAME = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.DeclaredPackageNameImpl <em>Declared Package Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.DeclaredPackageNameImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDeclaredPackageName()
	 * @generated
	 */
	int DECLARED_PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PACKAGE_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Declared Package Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PACKAGE_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Declared Package Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PACKAGE_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.VersionTagImpl <em>Version Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.VersionTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getVersionTag()
	 * @generated
	 */
	int VERSION_TAG = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG__VERSION = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Version Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Version Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.DescriptionTagImpl <em>Description Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.DescriptionTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDescriptionTag()
	 * @generated
	 */
	int DESCRIPTION_TAG = 6;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TAG__DESCRIPTION_TEXT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Description Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.MaintainerTagImpl <em>Maintainer Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.MaintainerTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getMaintainerTag()
	 * @generated
	 */
	int MAINTAINER_TAG = 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINER_TAG__EMAIL = TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maintainer Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINER_TAG__MAINTAINER_TEXT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Maintainer Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINER_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Maintainer Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINER_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.LicenseTagImpl <em>License Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.LicenseTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getLicenseTag()
	 * @generated
	 */
	int LICENSE_TAG = 8;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TAG__LICENSE = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>License Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>License Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.AuthorTagImpl <em>Author Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.AuthorTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getAuthorTag()
	 * @generated
	 */
	int AUTHOR_TAG = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TAG__EMAIL = TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TAG__AUTHOR_TEXT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Author Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Author Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.UrlTagImpl <em>Url Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.UrlTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getUrlTag()
	 * @generated
	 */
	int URL_TAG = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TAG__TYPE = TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TAG__URL = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Url Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Url Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.RunDependencyTagImpl <em>Run Dependency Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.RunDependencyTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getRunDependencyTag()
	 * @generated
	 */
	int RUN_DEPENDENCY_TAG = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_DEPENDENCY_TAG__NAME = DEPENDENCY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_DEPENDENCY_TAG_FEATURE_COUNT = DEPENDENCY_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Run Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_DEPENDENCY_TAG_OPERATION_COUNT = DEPENDENCY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.BuildDependDependencyTagImpl <em>Build Depend Dependency Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.BuildDependDependencyTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getBuildDependDependencyTag()
	 * @generated
	 */
	int BUILD_DEPEND_DEPENDENCY_TAG = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DEPEND_DEPENDENCY_TAG__NAME = DEPENDENCY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DEPEND_DEPENDENCY_TAG_FEATURE_COUNT = DEPENDENCY_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Build Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_DEPEND_DEPENDENCY_TAG_OPERATION_COUNT = DEPENDENCY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.ExecDependDependencyTagImpl <em>Exec Depend Dependency Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.ExecDependDependencyTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getExecDependDependencyTag()
	 * @generated
	 */
	int EXEC_DEPEND_DEPENDENCY_TAG = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_DEPEND_DEPENDENCY_TAG__NAME = DEPENDENCY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exec Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_DEPEND_DEPENDENCY_TAG_FEATURE_COUNT = DEPENDENCY_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exec Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_DEPEND_DEPENDENCY_TAG_OPERATION_COUNT = DEPENDENCY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.BuildToolDependDependencyTagImpl <em>Build Tool Depend Dependency Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.BuildToolDependDependencyTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getBuildToolDependDependencyTag()
	 * @generated
	 */
	int BUILD_TOOL_DEPEND_DEPENDENCY_TAG = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TOOL_DEPEND_DEPENDENCY_TAG__NAME = DEPENDENCY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Tool Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TOOL_DEPEND_DEPENDENCY_TAG_FEATURE_COUNT = DEPENDENCY_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Build Tool Depend Dependency Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TOOL_DEPEND_DEPENDENCY_TAG_OPERATION_COUNT = DEPENDENCY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.ExportTagImpl <em>Export Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.ExportTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getExportTag()
	 * @generated
	 */
	int EXPORT_TAG = 15;

	/**
	 * The feature id for the '<em><b>Arbitrary tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TAG__ARBITRARY_TAGS = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Export Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.ArbitraryTagImpl <em>Arbitrary Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.ArbitraryTagImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getArbitraryTag()
	 * @generated
	 */
	int ARBITRARY_TAG = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TAG__NAME = TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TAG__INNER_TEXT = TAG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TAG__ATTRIBUTES = TAG_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arbitrary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arbitrary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.spf.PackageXML.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spf.PackageXML.impl.AttributeImpl
	 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.spf.PackageXML.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.Package#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.spf.PackageXML.Package#getFormat()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.spf.PackageXML.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.PackageXML.Package#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.spf.PackageXML.Package#getTags()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Tags();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.spf.PackageXML.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.DependencyTag <em>Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Tag</em>'.
	 * @see org.spf.PackageXML.DependencyTag
	 * @generated
	 */
	EClass getDependencyTag();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.NameTag <em>Name Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Tag</em>'.
	 * @see org.spf.PackageXML.NameTag
	 * @generated
	 */
	EClass getNameTag();

	/**
	 * Returns the meta object for the containment reference '{@link org.spf.PackageXML.NameTag#getDeclaredPackageName <em>Declared Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declared Package Name</em>'.
	 * @see org.spf.PackageXML.NameTag#getDeclaredPackageName()
	 * @see #getNameTag()
	 * @generated
	 */
	EReference getNameTag_DeclaredPackageName();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.DeclaredPackageName <em>Declared Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Package Name</em>'.
	 * @see org.spf.PackageXML.DeclaredPackageName
	 * @generated
	 */
	EClass getDeclaredPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.DeclaredPackageName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.DeclaredPackageName#getName()
	 * @see #getDeclaredPackageName()
	 * @generated
	 */
	EAttribute getDeclaredPackageName_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.VersionTag <em>Version Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Tag</em>'.
	 * @see org.spf.PackageXML.VersionTag
	 * @generated
	 */
	EClass getVersionTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.VersionTag#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.spf.PackageXML.VersionTag#getVersion()
	 * @see #getVersionTag()
	 * @generated
	 */
	EAttribute getVersionTag_Version();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.DescriptionTag <em>Description Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Tag</em>'.
	 * @see org.spf.PackageXML.DescriptionTag
	 * @generated
	 */
	EClass getDescriptionTag();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.PackageXML.DescriptionTag#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description Text</em>'.
	 * @see org.spf.PackageXML.DescriptionTag#getDescriptionText()
	 * @see #getDescriptionTag()
	 * @generated
	 */
	EAttribute getDescriptionTag_DescriptionText();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.MaintainerTag <em>Maintainer Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainer Tag</em>'.
	 * @see org.spf.PackageXML.MaintainerTag
	 * @generated
	 */
	EClass getMaintainerTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.MaintainerTag#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.spf.PackageXML.MaintainerTag#getEmail()
	 * @see #getMaintainerTag()
	 * @generated
	 */
	EAttribute getMaintainerTag_Email();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.PackageXML.MaintainerTag#getMaintainerText <em>Maintainer Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Maintainer Text</em>'.
	 * @see org.spf.PackageXML.MaintainerTag#getMaintainerText()
	 * @see #getMaintainerTag()
	 * @generated
	 */
	EAttribute getMaintainerTag_MaintainerText();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.LicenseTag <em>License Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Tag</em>'.
	 * @see org.spf.PackageXML.LicenseTag
	 * @generated
	 */
	EClass getLicenseTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.LicenseTag#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.spf.PackageXML.LicenseTag#getLicense()
	 * @see #getLicenseTag()
	 * @generated
	 */
	EAttribute getLicenseTag_License();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.AuthorTag <em>Author Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Tag</em>'.
	 * @see org.spf.PackageXML.AuthorTag
	 * @generated
	 */
	EClass getAuthorTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.AuthorTag#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.spf.PackageXML.AuthorTag#getEmail()
	 * @see #getAuthorTag()
	 * @generated
	 */
	EAttribute getAuthorTag_Email();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.PackageXML.AuthorTag#getAuthorText <em>Author Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author Text</em>'.
	 * @see org.spf.PackageXML.AuthorTag#getAuthorText()
	 * @see #getAuthorTag()
	 * @generated
	 */
	EAttribute getAuthorTag_AuthorText();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.UrlTag <em>Url Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Tag</em>'.
	 * @see org.spf.PackageXML.UrlTag
	 * @generated
	 */
	EClass getUrlTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.UrlTag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.spf.PackageXML.UrlTag#getType()
	 * @see #getUrlTag()
	 * @generated
	 */
	EAttribute getUrlTag_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.UrlTag#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.spf.PackageXML.UrlTag#getUrl()
	 * @see #getUrlTag()
	 * @generated
	 */
	EAttribute getUrlTag_Url();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.RunDependencyTag <em>Run Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Dependency Tag</em>'.
	 * @see org.spf.PackageXML.RunDependencyTag
	 * @generated
	 */
	EClass getRunDependencyTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.RunDependencyTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.RunDependencyTag#getName()
	 * @see #getRunDependencyTag()
	 * @generated
	 */
	EAttribute getRunDependencyTag_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.BuildDependDependencyTag <em>Build Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Depend Dependency Tag</em>'.
	 * @see org.spf.PackageXML.BuildDependDependencyTag
	 * @generated
	 */
	EClass getBuildDependDependencyTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.BuildDependDependencyTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.BuildDependDependencyTag#getName()
	 * @see #getBuildDependDependencyTag()
	 * @generated
	 */
	EAttribute getBuildDependDependencyTag_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.ExecDependDependencyTag <em>Exec Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Depend Dependency Tag</em>'.
	 * @see org.spf.PackageXML.ExecDependDependencyTag
	 * @generated
	 */
	EClass getExecDependDependencyTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.ExecDependDependencyTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.ExecDependDependencyTag#getName()
	 * @see #getExecDependDependencyTag()
	 * @generated
	 */
	EAttribute getExecDependDependencyTag_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.BuildToolDependDependencyTag <em>Build Tool Depend Dependency Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Tool Depend Dependency Tag</em>'.
	 * @see org.spf.PackageXML.BuildToolDependDependencyTag
	 * @generated
	 */
	EClass getBuildToolDependDependencyTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.BuildToolDependDependencyTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.BuildToolDependDependencyTag#getName()
	 * @see #getBuildToolDependDependencyTag()
	 * @generated
	 */
	EAttribute getBuildToolDependDependencyTag_Name();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.ExportTag <em>Export Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Tag</em>'.
	 * @see org.spf.PackageXML.ExportTag
	 * @generated
	 */
	EClass getExportTag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.PackageXML.ExportTag#getArbitrary_tags <em>Arbitrary tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arbitrary tags</em>'.
	 * @see org.spf.PackageXML.ExportTag#getArbitrary_tags()
	 * @see #getExportTag()
	 * @generated
	 */
	EReference getExportTag_Arbitrary_tags();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.ArbitraryTag <em>Arbitrary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Tag</em>'.
	 * @see org.spf.PackageXML.ArbitraryTag
	 * @generated
	 */
	EClass getArbitraryTag();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.ArbitraryTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.spf.PackageXML.ArbitraryTag#getName()
	 * @see #getArbitraryTag()
	 * @generated
	 */
	EAttribute getArbitraryTag_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.spf.PackageXML.ArbitraryTag#getInnerText <em>Inner Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inner Text</em>'.
	 * @see org.spf.PackageXML.ArbitraryTag#getInnerText()
	 * @see #getArbitraryTag()
	 * @generated
	 */
	EAttribute getArbitraryTag_InnerText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.spf.PackageXML.ArbitraryTag#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.spf.PackageXML.ArbitraryTag#getAttributes()
	 * @see #getArbitraryTag()
	 * @generated
	 */
	EReference getArbitraryTag_Attributes();

	/**
	 * Returns the meta object for class '{@link org.spf.PackageXML.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.spf.PackageXML.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.Attribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.spf.PackageXML.Attribute#getKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.spf.PackageXML.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.spf.PackageXML.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageXMLFactory getPackageXMLFactory();

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
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.PackageImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__FORMAT = eINSTANCE.getPackage_Format();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TAGS = eINSTANCE.getPackage_Tags();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.TagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.DependencyTagImpl <em>Dependency Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.DependencyTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDependencyTag()
		 * @generated
		 */
		EClass DEPENDENCY_TAG = eINSTANCE.getDependencyTag();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.NameTagImpl <em>Name Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.NameTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getNameTag()
		 * @generated
		 */
		EClass NAME_TAG = eINSTANCE.getNameTag();

		/**
		 * The meta object literal for the '<em><b>Declared Package Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_TAG__DECLARED_PACKAGE_NAME = eINSTANCE.getNameTag_DeclaredPackageName();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.DeclaredPackageNameImpl <em>Declared Package Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.DeclaredPackageNameImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDeclaredPackageName()
		 * @generated
		 */
		EClass DECLARED_PACKAGE_NAME = eINSTANCE.getDeclaredPackageName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_PACKAGE_NAME__NAME = eINSTANCE.getDeclaredPackageName_Name();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.VersionTagImpl <em>Version Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.VersionTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getVersionTag()
		 * @generated
		 */
		EClass VERSION_TAG = eINSTANCE.getVersionTag();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TAG__VERSION = eINSTANCE.getVersionTag_Version();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.DescriptionTagImpl <em>Description Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.DescriptionTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getDescriptionTag()
		 * @generated
		 */
		EClass DESCRIPTION_TAG = eINSTANCE.getDescriptionTag();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TAG__DESCRIPTION_TEXT = eINSTANCE.getDescriptionTag_DescriptionText();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.MaintainerTagImpl <em>Maintainer Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.MaintainerTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getMaintainerTag()
		 * @generated
		 */
		EClass MAINTAINER_TAG = eINSTANCE.getMaintainerTag();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAINER_TAG__EMAIL = eINSTANCE.getMaintainerTag_Email();

		/**
		 * The meta object literal for the '<em><b>Maintainer Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAINER_TAG__MAINTAINER_TEXT = eINSTANCE.getMaintainerTag_MaintainerText();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.LicenseTagImpl <em>License Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.LicenseTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getLicenseTag()
		 * @generated
		 */
		EClass LICENSE_TAG = eINSTANCE.getLicenseTag();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_TAG__LICENSE = eINSTANCE.getLicenseTag_License();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.AuthorTagImpl <em>Author Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.AuthorTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getAuthorTag()
		 * @generated
		 */
		EClass AUTHOR_TAG = eINSTANCE.getAuthorTag();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_TAG__EMAIL = eINSTANCE.getAuthorTag_Email();

		/**
		 * The meta object literal for the '<em><b>Author Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_TAG__AUTHOR_TEXT = eINSTANCE.getAuthorTag_AuthorText();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.UrlTagImpl <em>Url Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.UrlTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getUrlTag()
		 * @generated
		 */
		EClass URL_TAG = eINSTANCE.getUrlTag();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TAG__TYPE = eINSTANCE.getUrlTag_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TAG__URL = eINSTANCE.getUrlTag_Url();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.RunDependencyTagImpl <em>Run Dependency Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.RunDependencyTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getRunDependencyTag()
		 * @generated
		 */
		EClass RUN_DEPENDENCY_TAG = eINSTANCE.getRunDependencyTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_DEPENDENCY_TAG__NAME = eINSTANCE.getRunDependencyTag_Name();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.BuildDependDependencyTagImpl <em>Build Depend Dependency Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.BuildDependDependencyTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getBuildDependDependencyTag()
		 * @generated
		 */
		EClass BUILD_DEPEND_DEPENDENCY_TAG = eINSTANCE.getBuildDependDependencyTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_DEPEND_DEPENDENCY_TAG__NAME = eINSTANCE.getBuildDependDependencyTag_Name();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.ExecDependDependencyTagImpl <em>Exec Depend Dependency Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.ExecDependDependencyTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getExecDependDependencyTag()
		 * @generated
		 */
		EClass EXEC_DEPEND_DEPENDENCY_TAG = eINSTANCE.getExecDependDependencyTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_DEPEND_DEPENDENCY_TAG__NAME = eINSTANCE.getExecDependDependencyTag_Name();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.BuildToolDependDependencyTagImpl <em>Build Tool Depend Dependency Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.BuildToolDependDependencyTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getBuildToolDependDependencyTag()
		 * @generated
		 */
		EClass BUILD_TOOL_DEPEND_DEPENDENCY_TAG = eINSTANCE.getBuildToolDependDependencyTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_TOOL_DEPEND_DEPENDENCY_TAG__NAME = eINSTANCE.getBuildToolDependDependencyTag_Name();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.ExportTagImpl <em>Export Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.ExportTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getExportTag()
		 * @generated
		 */
		EClass EXPORT_TAG = eINSTANCE.getExportTag();

		/**
		 * The meta object literal for the '<em><b>Arbitrary tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_TAG__ARBITRARY_TAGS = eINSTANCE.getExportTag_Arbitrary_tags();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.ArbitraryTagImpl <em>Arbitrary Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.ArbitraryTagImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getArbitraryTag()
		 * @generated
		 */
		EClass ARBITRARY_TAG = eINSTANCE.getArbitraryTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARBITRARY_TAG__NAME = eINSTANCE.getArbitraryTag_Name();

		/**
		 * The meta object literal for the '<em><b>Inner Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARBITRARY_TAG__INNER_TEXT = eINSTANCE.getArbitraryTag_InnerText();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_TAG__ATTRIBUTES = eINSTANCE.getArbitraryTag_Attributes();

		/**
		 * The meta object literal for the '{@link org.spf.PackageXML.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.spf.PackageXML.impl.AttributeImpl
		 * @see org.spf.PackageXML.impl.PackageXMLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

	}

} //PackageXMLPackage
