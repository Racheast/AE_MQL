/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.Course;
import qmm.Course_Reference_OrGroup;
import qmm.Course_courseNumber_AttrEClass;
import qmm.Course_courseType_AttrEClass;
import qmm.Course_name_AttrEClass;
import qmm.Exam_Containment_OrGroup;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CourseImpl#getMandatoryFor <em>Mandatory For</em>}</li>
 *   <li>{@link qmm.impl.CourseImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link qmm.impl.CourseImpl#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CourseImpl#getCourseNumber_AttrEClass <em>Course Number Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CourseImpl#getCourseType_AttrEClass <em>Course Type Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends RootClassImpl implements Course {
	/**
	 * The cached value of the '{@link #getMandatoryFor() <em>Mandatory For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_Reference_OrGroup> mandatoryFor;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_Containment_OrGroup> exam;

	/**
	 * The cached value of the '{@link #getName_AttrEClass() <em>Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_name_AttrEClass> name_AttrEClass;

	/**
	 * The cached value of the '{@link #getCourseNumber_AttrEClass() <em>Course Number Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseNumber_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Course_courseNumber_AttrEClass> courseNumber_AttrEClass;

	/**
	 * The cached value of the '{@link #getCourseType_AttrEClass() <em>Course Type Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Course_courseType_AttrEClass courseType_AttrEClass;

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
		return QmmPackage.eINSTANCE.getCourse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_Reference_OrGroup> getMandatoryFor() {
		if (mandatoryFor == null) {
			mandatoryFor = new EObjectContainmentEList<Course_Reference_OrGroup>(Course_Reference_OrGroup.class, this, QmmPackage.COURSE__MANDATORY_FOR);
		}
		return mandatoryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_Containment_OrGroup> getExam() {
		if (exam == null) {
			exam = new EObjectContainmentEList<Exam_Containment_OrGroup>(Exam_Containment_OrGroup.class, this, QmmPackage.COURSE__EXAM);
		}
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_name_AttrEClass> getName_AttrEClass() {
		if (name_AttrEClass == null) {
			name_AttrEClass = new EObjectContainmentEList<Course_name_AttrEClass>(Course_name_AttrEClass.class, this, QmmPackage.COURSE__NAME_ATTR_ECLASS);
		}
		return name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course_courseNumber_AttrEClass> getCourseNumber_AttrEClass() {
		if (courseNumber_AttrEClass == null) {
			courseNumber_AttrEClass = new EObjectContainmentEList<Course_courseNumber_AttrEClass>(Course_courseNumber_AttrEClass.class, this, QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS);
		}
		return courseNumber_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_courseType_AttrEClass getCourseType_AttrEClass() {
		return courseType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseType_AttrEClass(Course_courseType_AttrEClass newCourseType_AttrEClass, NotificationChain msgs) {
		Course_courseType_AttrEClass oldCourseType_AttrEClass = courseType_AttrEClass;
		courseType_AttrEClass = newCourseType_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS, oldCourseType_AttrEClass, newCourseType_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseType_AttrEClass(Course_courseType_AttrEClass newCourseType_AttrEClass) {
		if (newCourseType_AttrEClass != courseType_AttrEClass) {
			NotificationChain msgs = null;
			if (courseType_AttrEClass != null)
				msgs = ((InternalEObject)courseType_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS, null, msgs);
			if (newCourseType_AttrEClass != null)
				msgs = ((InternalEObject)newCourseType_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS, null, msgs);
			msgs = basicSetCourseType_AttrEClass(newCourseType_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS, newCourseType_AttrEClass, newCourseType_AttrEClass));
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
		
		final int mandatoryFor_upperBound = -1;
		int nr_nonTransitive_mandatoryFor = 0;
		if(this.mandatoryFor != null){
				for(qmm.OrGroup og : this.mandatoryFor) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_mandatoryFor++;
		}
		if(nr_nonTransitive_mandatoryFor > mandatoryFor_upperBound && mandatoryFor_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Course contains " + nr_nonTransitive_mandatoryFor + " non-transitive, non-negated and non-generalized mandatoryFor(s). Only " + mandatoryFor_upperBound + " non-transitive, non-negated and non-generalized mandatoryFor(s) are allowed.",new Object[] { this }));
		
		final int exam_upperBound = -1;
		int nr_nonTransitive_exam = 0;
		if(this.exam != null){
				for(qmm.OrGroup og : this.exam) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_exam++;
		}
		if(nr_nonTransitive_exam > exam_upperBound && exam_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Course contains " + nr_nonTransitive_exam + " non-transitive, non-negated and non-generalized exam(s). Only " + exam_upperBound + " non-transitive, non-negated and non-generalized exam(s) are allowed.",new Object[] { this }));
		
		final int name_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_name_AttrEClass = 0;
		if(this.name_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;
		}
		if(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Course contains " + nr_nonGeneralized_name_AttrEClass + " non-generalized and non-negated name(s). Only " + name_AttrEClass_upperBound + " non-generalized and non-negated name(s) are allowed.",new Object[] { this }));
		
		final int courseNumber_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_courseNumber_AttrEClass = 0;
		if(this.courseNumber_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.courseNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_courseNumber_AttrEClass++;
		}
		if(nr_nonGeneralized_courseNumber_AttrEClass > courseNumber_AttrEClass_upperBound && courseNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Course contains " + nr_nonGeneralized_courseNumber_AttrEClass + " non-generalized and non-negated courseNumber(s). Only " + courseNumber_AttrEClass_upperBound + " non-generalized and non-negated courseNumber(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.COURSE__MANDATORY_FOR:
				return ((InternalEList<?>)getMandatoryFor()).basicRemove(otherEnd, msgs);
			case QmmPackage.COURSE__EXAM:
				return ((InternalEList<?>)getExam()).basicRemove(otherEnd, msgs);
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getName_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
				return ((InternalEList<?>)getCourseNumber_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
				return basicSetCourseType_AttrEClass(null, msgs);
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
			case QmmPackage.COURSE__MANDATORY_FOR:
				return getMandatoryFor();
			case QmmPackage.COURSE__EXAM:
				return getExam();
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
				return getName_AttrEClass();
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
				return getCourseNumber_AttrEClass();
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
				return getCourseType_AttrEClass();
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
			case QmmPackage.COURSE__MANDATORY_FOR:
				getMandatoryFor().clear();
				getMandatoryFor().addAll((Collection<? extends Course_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.COURSE__EXAM:
				getExam().clear();
				getExam().addAll((Collection<? extends Exam_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
				getName_AttrEClass().clear();
				getName_AttrEClass().addAll((Collection<? extends Course_name_AttrEClass>)newValue);
				return;
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
				getCourseNumber_AttrEClass().clear();
				getCourseNumber_AttrEClass().addAll((Collection<? extends Course_courseNumber_AttrEClass>)newValue);
				return;
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
				setCourseType_AttrEClass((Course_courseType_AttrEClass)newValue);
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
			case QmmPackage.COURSE__MANDATORY_FOR:
				getMandatoryFor().clear();
				return;
			case QmmPackage.COURSE__EXAM:
				getExam().clear();
				return;
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
				getName_AttrEClass().clear();
				return;
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
				getCourseNumber_AttrEClass().clear();
				return;
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
				setCourseType_AttrEClass((Course_courseType_AttrEClass)null);
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
			case QmmPackage.COURSE__MANDATORY_FOR:
				return mandatoryFor != null && !mandatoryFor.isEmpty();
			case QmmPackage.COURSE__EXAM:
				return exam != null && !exam.isEmpty();
			case QmmPackage.COURSE__NAME_ATTR_ECLASS:
				return name_AttrEClass != null && !name_AttrEClass.isEmpty();
			case QmmPackage.COURSE__COURSE_NUMBER_ATTR_ECLASS:
				return courseNumber_AttrEClass != null && !courseNumber_AttrEClass.isEmpty();
			case QmmPackage.COURSE__COURSE_TYPE_ATTR_ECLASS:
				return courseType_AttrEClass != null;
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.COURSE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.COURSE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CourseImpl
