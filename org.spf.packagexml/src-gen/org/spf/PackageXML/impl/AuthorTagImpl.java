/**
 */
package org.spf.PackageXML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.spf.PackageXML.AuthorTag;
import org.spf.PackageXML.PackageXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.impl.AuthorTagImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.spf.PackageXML.impl.AuthorTagImpl#getAuthorText <em>Author Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorTagImpl extends TagImpl implements AuthorTag {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorText() <em>Author Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authorText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageXMLPackage.Literals.AUTHOR_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageXMLPackage.AUTHOR_TAG__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAuthorText() {
		if (authorText == null) {
			authorText = new EDataTypeUniqueEList<String>(String.class, this, PackageXMLPackage.AUTHOR_TAG__AUTHOR_TEXT);
		}
		return authorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageXMLPackage.AUTHOR_TAG__EMAIL:
				return getEmail();
			case PackageXMLPackage.AUTHOR_TAG__AUTHOR_TEXT:
				return getAuthorText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackageXMLPackage.AUTHOR_TAG__EMAIL:
				setEmail((String)newValue);
				return;
			case PackageXMLPackage.AUTHOR_TAG__AUTHOR_TEXT:
				getAuthorText().clear();
				getAuthorText().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PackageXMLPackage.AUTHOR_TAG__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case PackageXMLPackage.AUTHOR_TAG__AUTHOR_TEXT:
				getAuthorText().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PackageXMLPackage.AUTHOR_TAG__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case PackageXMLPackage.AUTHOR_TAG__AUTHOR_TEXT:
				return authorText != null && !authorText.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (email: ");
		result.append(email);
		result.append(", authorText: ");
		result.append(authorText);
		result.append(')');
		return result.toString();
	}

} //AuthorTagImpl
