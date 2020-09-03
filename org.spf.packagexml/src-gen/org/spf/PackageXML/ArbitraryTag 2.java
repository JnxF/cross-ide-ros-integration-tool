/**
 */
package org.spf.PackageXML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.ArbitraryTag#getName <em>Name</em>}</li>
 *   <li>{@link org.spf.PackageXML.ArbitraryTag#getInnerText <em>Inner Text</em>}</li>
 *   <li>{@link org.spf.PackageXML.ArbitraryTag#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getArbitraryTag()
 * @model
 * @generated
 */
public interface ArbitraryTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getArbitraryTag_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.ArbitraryTag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inner Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Text</em>' attribute list.
	 * @see org.spf.PackageXML.PackageXMLPackage#getArbitraryTag_InnerText()
	 * @model
	 * @generated
	 */
	EList<String> getInnerText();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.PackageXML.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.spf.PackageXML.PackageXMLPackage#getArbitraryTag_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // ArbitraryTag
