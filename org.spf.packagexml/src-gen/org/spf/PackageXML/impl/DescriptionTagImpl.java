/**
 */
package org.spf.PackageXML.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.spf.PackageXML.DescriptionTag;
import org.spf.PackageXML.PackageXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.impl.DescriptionTagImpl#getDescriptionText <em>Description Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionTagImpl extends TagImpl implements DescriptionTag {
	/**
	 * The cached value of the '{@link #getDescriptionText() <em>Description Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descriptionText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageXMLPackage.Literals.DESCRIPTION_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptionText() {
		if (descriptionText == null) {
			descriptionText = new EDataTypeUniqueEList<String>(String.class, this, PackageXMLPackage.DESCRIPTION_TAG__DESCRIPTION_TEXT);
		}
		return descriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageXMLPackage.DESCRIPTION_TAG__DESCRIPTION_TEXT:
				return getDescriptionText();
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
			case PackageXMLPackage.DESCRIPTION_TAG__DESCRIPTION_TEXT:
				getDescriptionText().clear();
				getDescriptionText().addAll((Collection<? extends String>)newValue);
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
			case PackageXMLPackage.DESCRIPTION_TAG__DESCRIPTION_TEXT:
				getDescriptionText().clear();
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
			case PackageXMLPackage.DESCRIPTION_TAG__DESCRIPTION_TEXT:
				return descriptionText != null && !descriptionText.isEmpty();
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
		result.append(" (descriptionText: ");
		result.append(descriptionText);
		result.append(')');
		return result.toString();
	}

} //DescriptionTagImpl
