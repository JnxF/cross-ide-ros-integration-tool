/**
 */
package org.spf.PackageXML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintainer Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.MaintainerTag#getEmail <em>Email</em>}</li>
 *   <li>{@link org.spf.PackageXML.MaintainerTag#getMaintainerText <em>Maintainer Text</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getMaintainerTag()
 * @model
 * @generated
 */
public interface MaintainerTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getMaintainerTag_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.MaintainerTag#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Maintainer Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer Text</em>' attribute list.
	 * @see org.spf.PackageXML.PackageXMLPackage#getMaintainerTag_MaintainerText()
	 * @model
	 * @generated
	 */
	EList<String> getMaintainerText();

} // MaintainerTag
