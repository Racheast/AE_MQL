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
import qmm.QmmPackage;
import qmm.Student;
import qmm.Student_matriculationNumber_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.StudentImpl#getAttends <em>Attends</em>}</li>
 *   <li>{@link qmm.impl.StudentImpl#getMatriculationNumber_AttrEClass <em>Matriculation Number Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The cached value of the '{@link #getAttends() <em>Attends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttends()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_Reference_OrGroup> attends;

	/**
	 * The cached value of the '{@link #getMatriculationNumber_AttrEClass() <em>Matriculation Number Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationNumber_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Student_matriculationNumber_AttrEClass> matriculationNumber_AttrEClass;

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
		return QmmPackage.eINSTANCE.getStudent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_Reference_OrGroup> getAttends() {
		if (attends == null) {
			attends = new EObjectContainmentEList<Course_Reference_OrGroup>(Course_Reference_OrGroup.class, this, QmmPackage.STUDENT__ATTENDS);
		}
		return attends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student_matriculationNumber_AttrEClass> getMatriculationNumber_AttrEClass() {
		if (matriculationNumber_AttrEClass == null) {
			matriculationNumber_AttrEClass = new EObjectContainmentEList<Student_matriculationNumber_AttrEClass>(Student_matriculationNumber_AttrEClass.class, this, QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS);
		}
		return matriculationNumber_AttrEClass;
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
		
		final int attends_upperBound = -1;
		int nr_nonTransitive_attends = 0;
		if(this.attends != null){
				for(qmm.OrGroup og : this.attends) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attends++;
		}
		if(nr_nonTransitive_attends > attends_upperBound && attends_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Student contains " + nr_nonTransitive_attends + " non-transitive, non-negated and non-generalized attends(s). Only " + attends_upperBound + " non-transitive, non-negated and non-generalized attends(s) are allowed.",new Object[] { this }));
		
		final int matriculationNumber_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_matriculationNumber_AttrEClass = 0;
		if(this.matriculationNumber_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.matriculationNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_matriculationNumber_AttrEClass++;
		}
		if(nr_nonGeneralized_matriculationNumber_AttrEClass > matriculationNumber_AttrEClass_upperBound && matriculationNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Student contains " + nr_nonGeneralized_matriculationNumber_AttrEClass + " non-generalized and non-negated matriculationNumber(s). Only " + matriculationNumber_AttrEClass_upperBound + " non-generalized and non-negated matriculationNumber(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.STUDENT__ATTENDS:
				return ((InternalEList<?>)getAttends()).basicRemove(otherEnd, msgs);
			case QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS:
				return ((InternalEList<?>)getMatriculationNumber_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.STUDENT__ATTENDS:
				return getAttends();
			case QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS:
				return getMatriculationNumber_AttrEClass();
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
			case QmmPackage.STUDENT__ATTENDS:
				getAttends().clear();
				getAttends().addAll((Collection<? extends Course_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS:
				getMatriculationNumber_AttrEClass().clear();
				getMatriculationNumber_AttrEClass().addAll((Collection<? extends Student_matriculationNumber_AttrEClass>)newValue);
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
			case QmmPackage.STUDENT__ATTENDS:
				getAttends().clear();
				return;
			case QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS:
				getMatriculationNumber_AttrEClass().clear();
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
			case QmmPackage.STUDENT__ATTENDS:
				return attends != null && !attends.isEmpty();
			case QmmPackage.STUDENT__MATRICULATION_NUMBER_ATTR_ECLASS:
				return matriculationNumber_AttrEClass != null && !matriculationNumber_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.STUDENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Person.class) {
			switch (baseOperationID) {
				case QmmPackage.PERSON___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.STUDENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.STUDENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StudentImpl
