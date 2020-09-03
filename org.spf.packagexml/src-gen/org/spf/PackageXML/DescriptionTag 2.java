/**
 */
package org.spf.PackageXML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.DescriptionTag#getDescriptionText <em>Description Text</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getDescriptionTag()
 * @model
 * @generated
 */
public interface DescriptionTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Text</em>' attribute list.
	 * @see org.spf.PackageXML.PackageXMLPackage#getDescriptionTag_DescriptionText()
	 * @model
	 * @generated
	 */
	EList<String> getDescriptionText();

} // DescriptionTag
