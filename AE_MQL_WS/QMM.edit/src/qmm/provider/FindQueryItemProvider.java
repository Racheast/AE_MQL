/**
 */
package qmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qmm.FindQuery;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.FindQuery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FindQueryItemProvider 
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
	public FindQueryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getFindQuery_Union());
			childrenFeatures.add(QmmPackage.eINSTANCE.getFindQuery_RootClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getFindQuery_Select());
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
	 * This returns FindQuery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FindQuery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FindQuery_type");
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

		switch (notification.getFeatureID(FindQuery.class)) {
			case QmmPackage.FIND_QUERY__UNION:
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
			case QmmPackage.FIND_QUERY__SELECT:
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
				(QmmPackage.eINSTANCE.getFindQuery_Union(),
				 QmmFactory.eINSTANCE.createFindQuery()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createCAEXBasicObject()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createCAEXObject()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAttributeFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAttributeNameMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAttributeLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAttributeValueRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createCAEXFile()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInterfaceClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createExternalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createExternalReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInstanceHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInterfaceClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInterfaceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInterfaceIDMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createSystemUnitClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInternalElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createNominalScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createOrdinalScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRefSemantic()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRoleClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRoleFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRoleRequirements()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createSupportedRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createSystemUnitClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createSystemUnitFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createUnknownType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createCopyright()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createRevision()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createGenericElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createAdditionalInformation()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_RootClass(),
				 QmmFactory.eINSTANCE.createGenericAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Select(),
				 QmmFactory.eINSTANCE.createSelectClause()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QMMEditPlugin.INSTANCE;
	}

}
