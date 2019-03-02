/**
 */
package dmm.impl;

import dmm.Course;
import dmm.CourseType;
import dmm.DmmPackage;
import dmm.Exam;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmm.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link dmm.impl.CourseImpl#getCourseNumber <em>Course Number</em>}</li>
 *   <li>{@link dmm.impl.CourseImpl#getCourseType <em>Course Type</em>}</li>
 *   <li>{@link dmm.impl.CourseImpl#getMandatoryFor <em>Mandatory For</em>}</li>
 *   <li>{@link dmm.impl.CourseImpl#getExam <em>Exam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseNumber() <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COURSE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCourseNumber() <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseNumber()
	 * @generated
	 * @ordered
	 */
	protected int courseNumber = COURSE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType COURSE_TYPE_EDEFAULT = CourseType.VO;

	/**
	 * The cached value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected CourseType courseType = COURSE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatoryFor() <em>Mandatory For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryFor;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> exam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmmPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCourseNumber() {
		return courseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseNumber(int newCourseNumber) {
		int oldCourseNumber = courseNumber;
		courseNumber = newCourseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.COURSE__COURSE_NUMBER, oldCourseNumber, courseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType getCourseType() {
		return courseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseType(CourseType newCourseType) {
		CourseType oldCourseType = courseType;
		courseType = newCourseType == null ? COURSE_TYPE_EDEFAULT : newCourseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.COURSE__COURSE_TYPE, oldCourseType, courseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getMandatoryFor() {
		if (mandatoryFor == null) {
			mandatoryFor = new EObjectResolvingEList<Course>(Course.class, this, DmmPackage.COURSE__MANDATORY_FOR);
		}
		return mandatoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getExam() {
		if (exam == null) {
			exam = new EObjectContainmentEList<Exam>(Exam.class, this, DmmPackage.COURSE__EXAM);
		}
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmmPackage.COURSE__EXAM:
				return ((InternalEList<?>)getExam()).basicRemove(otherEnd, msgs);
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
			case DmmPackage.COURSE__NAME:
				return getName();
			case DmmPackage.COURSE__COURSE_NUMBER:
				return getCourseNumber();
			case DmmPackage.COURSE__COURSE_TYPE:
				return getCourseType();
			case DmmPackage.COURSE__MANDATORY_FOR:
				return getMandatoryFor();
			case DmmPackage.COURSE__EXAM:
				return getExam();
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
			case DmmPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case DmmPackage.COURSE__COURSE_NUMBER:
				setCourseNumber((Integer)newValue);
				return;
			case DmmPackage.COURSE__COURSE_TYPE:
				setCourseType((CourseType)newValue);
				return;
			case DmmPackage.COURSE__MANDATORY_FOR:
				getMandatoryFor().clear();
				getMandatoryFor().addAll((Collection<? extends Course>)newValue);
				return;
			case DmmPackage.COURSE__EXAM:
				getExam().clear();
				getExam().addAll((Collection<? extends Exam>)newValue);
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
			case DmmPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DmmPackage.COURSE__COURSE_NUMBER:
				setCourseNumber(COURSE_NUMBER_EDEFAULT);
				return;
			case DmmPackage.COURSE__COURSE_TYPE:
				setCourseType(COURSE_TYPE_EDEFAULT);
				return;
			case DmmPackage.COURSE__MANDATORY_FOR:
				getMandatoryFor().clear();
				return;
			case DmmPackage.COURSE__EXAM:
				getExam().clear();
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
			case DmmPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DmmPackage.COURSE__COURSE_NUMBER:
				return courseNumber != COURSE_NUMBER_EDEFAULT;
			case DmmPackage.COURSE__COURSE_TYPE:
				return courseType != COURSE_TYPE_EDEFAULT;
			case DmmPackage.COURSE__MANDATORY_FOR:
				return mandatoryFor != null && !mandatoryFor.isEmpty();
			case DmmPackage.COURSE__EXAM:
				return exam != null && !exam.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", courseNumber: ");
		result.append(courseNumber);
		result.append(", courseType: ");
		result.append(courseType);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
