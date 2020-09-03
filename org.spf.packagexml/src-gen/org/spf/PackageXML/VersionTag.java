/**
 */
package org.spf.PackageXML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.VersionTag#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getVersionTag()
 * @model
 * @generated
 */
public interface VersionTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getVersionTag_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.VersionTag#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // VersionTag
