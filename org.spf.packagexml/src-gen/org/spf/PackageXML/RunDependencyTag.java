/**
 */
package org.spf.PackageXML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Dependency Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.RunDependencyTag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.spf.PackageXML.PackageXMLPackage#getRunDependencyTag()
 * @model
 * @generated
 */
public interface RunDependencyTag extends DependencyTag {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spf.PackageXML.PackageXMLPackage#getRunDependencyTag_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spf.PackageXML.RunDependencyTag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RunDependencyTag
