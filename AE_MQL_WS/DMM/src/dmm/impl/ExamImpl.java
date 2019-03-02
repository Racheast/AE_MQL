/**
 */
package dmm.impl;

import dmm.DmmPackage;
import dmm.Exam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmm.impl.ExamImpl#getExamID <em>Exam ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends MinimalEObjectImpl.Container implements Exam {
	/**
	 * The default value of the '{@link #getExamID() <em>Exam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamID() <em>Exam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamID()
	 * @generated
	 * @ordered
	 */
	protected String examID = EXAM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmmPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExamID() {
		return examID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamID(String newExamID) {
		String oldExamID = examID;
		examID = newExamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.EXAM__EXAM_ID, oldExamID, examID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmmPackage.EXAM__EXAM_ID:
				return getExamID();
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
			case DmmPackage.EXAM__EXAM_ID:
				setExamID((String)newValue);
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
			case DmmPackage.EXAM__EXAM_ID:
				setExamID(EXAM_ID_EDEFAULT);
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
			case DmmPackage.EXAM__EXAM_ID:
				return EXAM_ID_EDEFAULT == null ? examID != null : !EXAM_ID_EDEFAULT.equals(examID);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (examID: ");
		result.append(examID);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
