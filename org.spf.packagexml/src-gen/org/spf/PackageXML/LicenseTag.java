/**
 */
package org.spf.PackageXML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.LicenseTag#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getLicenseTag()
 * @model
 * @generated
 */
public interface LicenseTag extends Tag {
	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getLicenseTag_License()
	 * @model required="true"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.LicenseTag#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

} // LicenseTag
