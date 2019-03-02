/**
 */
package dmm.impl;

import dmm.Course;
import dmm.DmmPackage;
import dmm.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmm.impl.StudentImpl#getMatriculationNumber <em>Matriculation Number</em>}</li>
 *   <li>{@link dmm.impl.StudentImpl#getAttends <em>Attends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The default value of the '{@link #getMatriculationNumber() <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULATION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatriculationNumber() <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationNumber()
	 * @generated
	 * @ordered
	 */
	protected int matriculationNumber = MATRICULATION_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttends() <em>Attends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttends()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> attends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmmPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatriculationNumber(int newMatriculationNumber) {
		int oldMatriculationNumber = matriculationNumber;
		matriculationNumber = newMatriculationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.STUDENT__MATRICULATION_NUMBER, oldMatriculationNumber, matriculationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getAttends() {
		if (attends == null) {
			attends = new EObjectResolvingEList<Course>(Course.class, this, DmmPackage.STUDENT__ATTENDS);
		}
		return attends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmmPackage.STUDENT__MATRICULATION_NUMBER:
				return getMatriculationNumber();
			case DmmPackage.STUDENT__ATTENDS:
				return getAttends();
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
			case DmmPackage.STUDENT__MATRICULATION_NUMBER:
				setMatriculationNumber((Integer)newValue);
				return;
			case DmmPackage.STUDENT__ATTENDS:
				getAttends().clear();
				getAttends().addAll((Collection<? extends Course>)newValue);
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
			case DmmPackage.STUDENT__MATRICULATION_NUMBER:
				setMatriculationNumber(MATRICULATION_NUMBER_EDEFAULT);
				return;
			case DmmPackage.STUDENT__ATTENDS:
				getAttends().clear();
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
			case DmmPackage.STUDENT__MATRICULATION_NUMBER:
				return matriculationNumber != MATRICULATION_NUMBER_EDEFAULT;
			case DmmPackage.STUDENT__ATTENDS:
				return attends != null && !attends.isEmpty();
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
		result.append(" (matriculationNumber: ");
		result.append(matriculationNumber);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
