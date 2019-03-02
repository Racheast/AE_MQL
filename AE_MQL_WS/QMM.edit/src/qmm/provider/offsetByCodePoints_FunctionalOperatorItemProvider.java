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

import qmm.QmmFactory;
import qmm.QmmPackage;
import qmm.offsetByCodePoints_FunctionalOperator;

/**
 * This is the item provider adapter for a {@link qmm.offsetByCodePoints_FunctionalOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class offsetByCodePoints_FunctionalOperatorItemProvider extends String_Original_FunctionalOperatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public offsetByCodePoints_FunctionalOperatorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator());
			childrenFeatures.add(QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_Index());
			childrenFeatures.add(QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_CodePointOffset());
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
	 * This returns offsetByCodePoints_FunctionalOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/offsetByCodePoints_FunctionalOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_offsetByCodePoints_FunctionalOperator_type");
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

		switch (notification.getFeatureID(offsetByCodePoints_FunctionalOperator.class)) {
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__OPERATOR:
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__INDEX:
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR__CODE_POINT_OFFSET:
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
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_Object_Number_hashCode_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_smallerThan_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_Object_Number_toString_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_greaterThan_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_greaterEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_Object_Number_equals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Integer_smallerEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getInteger_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createdoubleValue_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_Index(),
				 QmmFactory.eINSTANCE.createInteger_FunctionalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_CodePointOffset(),
				 QmmFactory.eINSTANCE.createInteger_FunctionalParameter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_Index() ||
			childFeature == QmmPackage.eINSTANCE.getoffsetByCodePoints_FunctionalOperator_CodePointOffset();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
