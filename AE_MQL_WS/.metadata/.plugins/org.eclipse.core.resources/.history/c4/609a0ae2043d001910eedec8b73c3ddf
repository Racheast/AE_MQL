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

import qmm.Exam;
import qmm.Exam_examID_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ExamImpl#getExamID_AttrEClass <em>Exam ID Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends RootClassImpl implements Exam {
	/**
	 * The cached value of the '{@link #getExamID_AttrEClass() <em>Exam ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_examID_AttrEClass> examID_AttrEClass;

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
		return QmmPackage.eINSTANCE.getExam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_examID_AttrEClass> getExamID_AttrEClass() {
		if (examID_AttrEClass == null) {
			examID_AttrEClass = new EObjectContainmentEList<Exam_examID_AttrEClass>(Exam_examID_AttrEClass.class, this, QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS);
		}
		return examID_AttrEClass;
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
		
		final int examID_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_examID_AttrEClass = 0;
		if(this.examID_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.examID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_examID_AttrEClass++;
		}
		if(nr_nonGeneralized_examID_AttrEClass > examID_AttrEClass_upperBound && examID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Exam contains " + nr_nonGeneralized_examID_AttrEClass + " non-generalized and non-negated examID(s). Only " + examID_AttrEClass_upperBound + " non-generalized and non-negated examID(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS:
				return ((InternalEList<?>)getExamID_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS:
				return getExamID_AttrEClass();
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
			case QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS:
				getExamID_AttrEClass().clear();
				getExamID_AttrEClass().addAll((Collection<? extends Exam_examID_AttrEClass>)newValue);
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
			case QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS:
				getExamID_AttrEClass().clear();
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
			case QmmPackage.EXAM__EXAM_ID_ATTR_ECLASS:
				return examID_AttrEClass != null && !examID_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXAM___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.EXAM___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExamImpl
