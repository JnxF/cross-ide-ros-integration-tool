/**
 */
package org.spf.PackageXML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.ExportTag#getArbitrary_tags <em>Arbitrary tags</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getExportTag()
 * @model
 * @generated
 */
public interface ExportTag extends Tag {
	/**
	 * Returns the value of the '<em><b>Arbitrary tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.PackageXML.ArbitraryTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbitrary tags</em>' containment reference list.
	 * @see org.spf.PackageXML.PackageXMLPackage#getExportTag_Arbitrary_tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArbitraryTag> getArbitrary_tags();

} // ExportTag
