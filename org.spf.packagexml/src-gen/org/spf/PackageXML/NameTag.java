/**
 */
package org.spf.PackageXML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.NameTag#getDeclaredPackageName <em>Declared Package Name</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getNameTag()
 * @model
 * @generated
 */
public interface NameTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Declared Package Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Package Name</em>' containment reference.
	 * @see #setDeclaredPackageName(DeclaredPackageName)
	 * @see org.spf.PackageXML.PackageXMLPackage#getNameTag_DeclaredPackageName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeclaredPackageName getDeclaredPackageName();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.NameTag#getDeclaredPackageName <em>Declared Package Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Package Name</em>' containment reference.
	 * @see #getDeclaredPackageName()
	 * @generated
	 */
	void setDeclaredPackageName(DeclaredPackageName value);

} // NameTag
