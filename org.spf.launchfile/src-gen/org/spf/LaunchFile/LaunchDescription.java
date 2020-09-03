/**
 */
package org.spf.LaunchFile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spf.LaunchFile.LaunchDescription#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.spf.LaunchFile.LaunchFilePackage#getLaunchDescription()
 * @model
 * @generated
 */
public interface LaunchDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.spf.LaunchFile.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.spf.LaunchFile.LaunchFilePackage#getLaunchDescription_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // LaunchDescription
