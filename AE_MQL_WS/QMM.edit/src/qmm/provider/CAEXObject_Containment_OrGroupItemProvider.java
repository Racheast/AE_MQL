/**
 */
package qmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qmm.CAEXObject_Containment_OrGroup;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.CAEXObject_Containment_OrGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEXObject_Containment_OrGroupItemProvider extends Containment_OrGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject_Containment_OrGroupItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment());
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
	 * This returns CAEXObject_Containment_OrGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CAEXObject_Containment_OrGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CAEXObject_Containment_OrGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CAEXObject_Containment_OrGroup_type") :
			getString("_UI_CAEXObject_Containment_OrGroup_type") + " " + label;
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

		switch (notification.getFeatureID(CAEXObject_Containment_OrGroup.class)) {
			case QmmPackage.CAEX_OBJECT_CONTAINMENT_OR_GROUP__CONTAINMENT:
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
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createCAEXObject()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createAttributeFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createAttributeLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInterfaceClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createExternalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInstanceHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInterfaceClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInterfaceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createSystemUnitClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInternalElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createRoleClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createRoleFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createSystemUnitClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXObject_Containment_OrGroup_Containment(),
				 QmmFactory.eINSTANCE.createSystemUnitFamily()));
	}

}
