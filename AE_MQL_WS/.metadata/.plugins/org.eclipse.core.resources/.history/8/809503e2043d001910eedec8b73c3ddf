/**
 */
package qmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.CourseType_AttributeEClass;
import qmm.CourseType_EnumerationOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Type Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CourseType_AttributeEClassImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CourseType_AttributeEClassImpl extends EnumerationAttributeEClassImpl implements CourseType_AttributeEClass {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected CourseType_EnumerationOperator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseType_AttributeEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCourseType_AttributeEClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType_EnumerationOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(CourseType_EnumerationOperator newOperator, NotificationChain msgs) {
		CourseType_EnumerationOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(CourseType_EnumerationOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR:
				setOperator((CourseType_EnumerationOperator)newValue);
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
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR:
				setOperator((CourseType_EnumerationOperator)null);
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
			case QmmPackage.COURSE_TYPE_ATTRIBUTE_ECLASS__OPERATOR:
				return operator != null;
		}
		return super.eIsSet(featureID);
	}

} //CourseType_AttributeEClassImpl
