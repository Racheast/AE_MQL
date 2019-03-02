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

import qmm.Max_AggregationOperator_Double;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.Max_AggregationOperator_Double} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Max_AggregationOperator_DoubleItemProvider extends CalculatingAggregationOperatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max_AggregationOperator_DoubleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator());
			childrenFeatures.add(QmmPackage.eINSTANCE.getMax_AggregationOperator_Double_Calculateable());
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
	 * This returns Max_AggregationOperator_Double.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Max_AggregationOperator_Double"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Max_AggregationOperator_Double_type");
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

		switch (notification.getFeatureID(Max_AggregationOperator_Double.class)) {
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
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
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_hashCode_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_equals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_greaterEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_Object_Number_toString_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_smallerThan_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_smallerEquals_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getDouble_FunctionalType_Operator(),
				 QmmFactory.eINSTANCE.createNumber_Double_greaterThan_FunctionalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getMax_AggregationOperator_Double_Calculateable(),
				 QmmFactory.eINSTANCE.createDouble_CalculateableParameter()));
	}

}
