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

import qmm.Course;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.Course} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseItemProvider extends RootClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getCourse_MandatoryFor());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCourse_Exam());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCourse_Name_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCourse_CourseNumber_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCourse_CourseType_AttrEClass());
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
	 * This returns Course.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Course"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Course)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Course_type") :
			getString("_UI_Course_type") + " " + label;
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

		switch (notification.getFeatureID(Course.class)) {
			case QmmPackage.COURSE__MANDATORY_FOR:
			case QmmPackage.COURSE__EXAM:
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getCourse_MandatoryFor(),
				 QmmFactory.eINSTANCE.createCourse_Reference_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCourse_Exam(),
				 QmmFactory.eINSTANCE.createExam_Containment_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCourse_Name_AttrEClass(),
				 QmmFactory.eINSTANCE.createCourse_name_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCourse_CourseNumber_AttrEClass(),
				 QmmFactory.eINSTANCE.createCourse_courseNumber_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCourse_CourseType_AttrEClass(),
				 QmmFactory.eINSTANCE.createCourse_courseType_AttrEClass()));
	}

}
