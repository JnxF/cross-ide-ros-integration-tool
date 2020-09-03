/**
 */
package org.spf.PackageXML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.UrlTag#getType <em>Type</em>}</li>
 *   <li>{@link org.spf.PackageXML.UrlTag#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getUrlTag()
 * @model
 * @generated
 */
public interface UrlTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getUrlTag_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.UrlTag#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getUrlTag_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.UrlTag#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // UrlTag
