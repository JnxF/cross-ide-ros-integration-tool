/**
 */
package org.spf.PackageXML.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.spf.PackageXML.PackageXMLFactory;
import org.spf.PackageXML.PackageXMLPackage;

/**
 * This is the item provider adapter for a {@link org.spf.PackageXML.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFormatPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_format_feature", "_UI_Package_type"),
				 PackageXMLPackage.Literals.PACKAGE__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_version_feature", "_UI_Package_type"),
				 PackageXMLPackage.Literals.PACKAGE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PackageXMLPackage.Literals.PACKAGE__TAGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.spf.PackageXML.Package)object).getFormat();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(org.spf.PackageXML.Package.class)) {
			case PackageXMLPackage.PACKAGE__FORMAT:
			case PackageXMLPackage.PACKAGE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PackageXMLPackage.PACKAGE__TAGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createNameTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createVersionTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createDescriptionTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createMaintainerTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createLicenseTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createAuthorTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createUrlTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createRunDependencyTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createBuildDependDependencyTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createExecDependDependencyTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createBuildToolDependDependencyTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createExportTag()));

		newChildDescriptors.add
			(createChildParameter
				(PackageXMLPackage.Literals.PACKAGE__TAGS,
				 PackageXMLFactory.eINSTANCE.createArbitraryTag()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PackageXMLEditPlugin.INSTANCE;
	}

}
