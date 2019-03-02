/**
 */
package dmm.impl;

import dmm.Course;
import dmm.DmmPackage;
import dmm.Professor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmm.impl.ProfessorImpl#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link dmm.impl.ProfessorImpl#getLectures <em>Lectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessorImpl extends PersonImpl implements Professor {
	/**
	 * The default value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected int employeeNumber = EMPLOYEE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLectures() <em>Lectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectures()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> lectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmmPackage.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeNumber(int newEmployeeNumber) {
		int oldEmployeeNumber = employeeNumber;
		employeeNumber = newEmployeeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.PROFESSOR__EMPLOYEE_NUMBER, oldEmployeeNumber, employeeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getLectures() {
		if (lectures == null) {
			lectures = new EObjectResolvingEList<Course>(Course.class, this, DmmPackage.PROFESSOR__LECTURES);
		}
		return lectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmmPackage.PROFESSOR__EMPLOYEE_NUMBER:
				return getEmployeeNumber();
			case DmmPackage.PROFESSOR__LECTURES:
				return getLectures();
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
			case DmmPackage.PROFESSOR__EMPLOYEE_NUMBER:
				setEmployeeNumber((Integer)newValue);
				return;
			case DmmPackage.PROFESSOR__LECTURES:
				getLectures().clear();
				getLectures().addAll((Collection<? extends Course>)newValue);
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
			case DmmPackage.PROFESSOR__EMPLOYEE_NUMBER:
				setEmployeeNumber(EMPLOYEE_NUMBER_EDEFAULT);
				return;
			case DmmPackage.PROFESSOR__LECTURES:
				getLectures().clear();
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
			case DmmPackage.PROFESSOR__EMPLOYEE_NUMBER:
				return employeeNumber != EMPLOYEE_NUMBER_EDEFAULT;
			case DmmPackage.PROFESSOR__LECTURES:
				return lectures != null && !lectures.isEmpty();
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
		result.append(" (employeeNumber: ");
		result.append(employeeNumber);
		result.append(')');
		return result.toString();
	}

} //ProfessorImpl
