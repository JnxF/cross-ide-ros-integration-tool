/**
 */
package org.spf.PackageXML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spf.PackageXML.ArbitraryTag;
import org.spf.PackageXML.ExportTag;
import org.spf.PackageXML.PackageXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.spf.PackageXML.impl.ExportTagImpl#getArbitrary_tags <em>Arbitrary tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportTagImpl extends TagImpl implements ExportTag {
	/**
	 * The cached value of the '{@link #getArbitrary_tags() <em>Arbitrary tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbitrary_tags()
	 * @generated
	 * @ordered
	 */
	protected EList<ArbitraryTag> arbitrary_tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageXMLPackage.Literals.EXPORT_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArbitraryTag> getArbitrary_tags() {
		if (arbitrary_tags == null) {
			arbitrary_tags = new EObjectContainmentEList<ArbitraryTag>(ArbitraryTag.class, this, PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS);
		}
		return arbitrary_tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS:
				return ((InternalEList<?>)getArbitrary_tags()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS:
				return getArbitrary_tags();
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
			case PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS:
				getArbitrary_tags().clear();
				getArbitrary_tags().addAll((Collection<? extends ArbitraryTag>)newValue);
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
			case PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS:
				getArbitrary_tags().clear();
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
			case PackageXMLPackage.EXPORT_TAG__ARBITRARY_TAGS:
				return arbitrary_tags != null && !arbitrary_tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExportTagImpl
