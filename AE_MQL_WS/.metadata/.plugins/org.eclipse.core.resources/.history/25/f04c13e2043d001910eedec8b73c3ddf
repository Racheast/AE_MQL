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

import qmm.Course_Reference_OrGroup;
import qmm.NamedElement;
import qmm.Person;
import qmm.Professor;
import qmm.Professor_employeeNumber_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ProfessorImpl#getLectures <em>Lectures</em>}</li>
 *   <li>{@link qmm.impl.ProfessorImpl#getEmployeeNumber_AttrEClass <em>Employee Number Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessorImpl extends PersonImpl implements Professor {
	/**
	 * The cached value of the '{@link #getLectures() <em>Lectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectures()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_Reference_OrGroup> lectures;

	/**
	 * The cached value of the '{@link #getEmployeeNumber_AttrEClass() <em>Employee Number Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor_employeeNumber_AttrEClass> employeeNumber_AttrEClass;

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
		return QmmPackage.eINSTANCE.getProfessor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_Reference_OrGroup> getLectures() {
		if (lectures == null) {
			lectures = new EObjectContainmentEList<Course_Reference_OrGroup>(Course_Reference_OrGroup.class, this, QmmPackage.PROFESSOR__LECTURES);
		}
		return lectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professor_employeeNumber_AttrEClass> getEmployeeNumber_AttrEClass() {
		if (employeeNumber_AttrEClass == null) {
			employeeNumber_AttrEClass = new EObjectContainmentEList<Professor_employeeNumber_AttrEClass>(Professor_employeeNumber_AttrEClass.class, this, QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS);
		}
		return employeeNumber_AttrEClass;
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
		
		final int lectures_upperBound = -1;
		int nr_nonTransitive_lectures = 0;
		if(this.lectures != null){
				for(qmm.OrGroup og : this.lectures) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_lectures++;
		}
		if(nr_nonTransitive_lectures > lectures_upperBound && lectures_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Professor contains " + nr_nonTransitive_lectures + " non-transitive, non-negated and non-generalized lectures(s). Only " + lectures_upperBound + " non-transitive, non-negated and non-generalized lectures(s) are allowed.",new Object[] { this }));
		
		final int employeeNumber_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_employeeNumber_AttrEClass = 0;
		if(this.employeeNumber_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.employeeNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_employeeNumber_AttrEClass++;
		}
		if(nr_nonGeneralized_employeeNumber_AttrEClass > employeeNumber_AttrEClass_upperBound && employeeNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Professor contains " + nr_nonGeneralized_employeeNumber_AttrEClass + " non-generalized and non-negated employeeNumber(s). Only " + employeeNumber_AttrEClass_upperBound + " non-generalized and non-negated employeeNumber(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.PROFESSOR__LECTURES:
				return ((InternalEList<?>)getLectures()).basicRemove(otherEnd, msgs);
			case QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS:
				return ((InternalEList<?>)getEmployeeNumber_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.PROFESSOR__LECTURES:
				return getLectures();
			case QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS:
				return getEmployeeNumber_AttrEClass();
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
			case QmmPackage.PROFESSOR__LECTURES:
				getLectures().clear();
				getLectures().addAll((Collection<? extends Course_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS:
				getEmployeeNumber_AttrEClass().clear();
				getEmployeeNumber_AttrEClass().addAll((Collection<? extends Professor_employeeNumber_AttrEClass>)newValue);
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
			case QmmPackage.PROFESSOR__LECTURES:
				getLectures().clear();
				return;
			case QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS:
				getEmployeeNumber_AttrEClass().clear();
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
			case QmmPackage.PROFESSOR__LECTURES:
				return lectures != null && !lectures.isEmpty();
			case QmmPackage.PROFESSOR__EMPLOYEE_NUMBER_ATTR_ECLASS:
				return employeeNumber_AttrEClass != null && !employeeNumber_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.PROFESSOR___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Person.class) {
			switch (baseOperationID) {
				case QmmPackage.PERSON___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.PROFESSOR___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.PROFESSOR___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProfessorImpl
