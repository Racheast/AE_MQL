/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.Course_Containment_OrGroup;
import qmm.NamedElement;
import qmm.Person_Containment_OrGroup;
import qmm.QmmPackage;
import qmm.UniversityManagementSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University Management System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.UniversityManagementSystemImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link qmm.impl.UniversityManagementSystemImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityManagementSystemImpl extends RootClassImpl implements UniversityManagementSystem {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_Containment_OrGroup> course;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person_Containment_OrGroup> person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityManagementSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getUniversityManagementSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_Containment_OrGroup> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course_Containment_OrGroup>(Course_Containment_OrGroup.class, this, QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person_Containment_OrGroup> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person_Containment_OrGroup>(Person_Containment_OrGroup.class, this, QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		super.validate(diagnostic, context);
		if(diagnostic!=null){
		    if(this.evaluationOperator != null){
		    	EList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);
		    	for(int i=0; i<diagnosticList.size(); i++){
		    		diagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));
		    	}
		    }
		}
		
		final int course_upperBound = -1;
		int nr_nonTransitive_course = 0;
		if(this.course != null){
				for(qmm.OrGroup og : this.course) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_course++;
		}
		if(nr_nonTransitive_course > course_upperBound && course_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "UniversityManagementSystem contains " + nr_nonTransitive_course + " non-transitive, non-negated and non-generalized course(s). Only " + course_upperBound + " non-transitive, non-negated and non-generalized course(s) are allowed.",new Object[] { this }));
		
		final int person_upperBound = -1;
		int nr_nonTransitive_person = 0;
		if(this.person != null){
				for(qmm.OrGroup og : this.person) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_person++;
		}
		if(nr_nonTransitive_person > person_upperBound && person_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "UniversityManagementSystem contains " + nr_nonTransitive_person + " non-transitive, non-negated and non-generalized person(s). Only " + person_upperBound + " non-transitive, non-negated and non-generalized person(s) are allowed.",new Object[] { this }));
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE:
				return getCourse();
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON:
				return getPerson();
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
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person_Containment_OrGroup>)newValue);
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
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE:
				getCourse().clear();
				return;
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON:
				getPerson().clear();
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
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__COURSE:
				return course != null && !course.isEmpty();
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM__PERSON:
				return person != null && !person.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.UNIVERSITY_MANAGEMENT_SYSTEM___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UniversityManagementSystemImpl
