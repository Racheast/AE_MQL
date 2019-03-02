/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Course#getMandatoryFor <em>Mandatory For</em>}</li>
 *   <li>{@link qmm.Course#getExam <em>Exam</em>}</li>
 *   <li>{@link qmm.Course#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Course#getCourseNumber_AttrEClass <em>Course Number Attr EClass</em>}</li>
 *   <li>{@link qmm.Course#getCourseType_AttrEClass <em>Course Type Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends RootClass {
	/**
	 * Returns the value of the '<em><b>Mandatory For</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory For</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory For</em>' containment reference list.
	 * @see qmm.QmmPackage#getCourse_MandatoryFor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_Reference_OrGroup> getMandatoryFor();

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Exam_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference list.
	 * @see qmm.QmmPackage#getCourse_Exam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam_Containment_OrGroup> getExam();

	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_name_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getCourse_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_name_AttrEClass> getName_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Course Number Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_courseNumber_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Number Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Number Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getCourse_CourseNumber_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_courseNumber_AttrEClass> getCourseNumber_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Course Type Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Type Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Type Attr EClass</em>' containment reference.
	 * @see #setCourseType_AttrEClass(Course_courseType_AttrEClass)
	 * @see qmm.QmmPackage#getCourse_CourseType_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Course_courseType_AttrEClass getCourseType_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Course#getCourseType_AttrEClass <em>Course Type Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Type Attr EClass</em>' containment reference.
	 * @see #getCourseType_AttrEClass()
	 * @generated
	 */
	void setCourseType_AttrEClass(Course_courseType_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int mandatoryFor_upperBound = -1;\nint nr_nonTransitive_mandatoryFor = 0;\nif(this.mandatoryFor != null){\n\t\tfor(qmm.OrGroup og : this.mandatoryFor) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_mandatoryFor++;\n}\nif(nr_nonTransitive_mandatoryFor > mandatoryFor_upperBound && mandatoryFor_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Course contains \" + nr_nonTransitive_mandatoryFor + \" non-transitive, non-negated and non-generalized mandatoryFor(s). Only \" + mandatoryFor_upperBound + \" non-transitive, non-negated and non-generalized mandatoryFor(s) are allowed.\",new Object[] { this }));\n\nfinal int exam_upperBound = -1;\nint nr_nonTransitive_exam = 0;\nif(this.exam != null){\n\t\tfor(qmm.OrGroup og : this.exam) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_exam++;\n}\nif(nr_nonTransitive_exam > exam_upperBound && exam_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Course contains \" + nr_nonTransitive_exam + \" non-transitive, non-negated and non-generalized exam(s). Only \" + exam_upperBound + \" non-transitive, non-negated and non-generalized exam(s) are allowed.\",new Object[] { this }));\n\nfinal int name_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_name_AttrEClass = 0;\nif(this.name_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;\n}\nif(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Course contains \" + nr_nonGeneralized_name_AttrEClass + \" non-generalized and non-negated name(s). Only \" + name_AttrEClass_upperBound + \" non-generalized and non-negated name(s) are allowed.\",new Object[] { this }));\n\nfinal int courseNumber_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_courseNumber_AttrEClass = 0;\nif(this.courseNumber_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.courseNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_courseNumber_AttrEClass++;\n}\nif(nr_nonGeneralized_courseNumber_AttrEClass > courseNumber_AttrEClass_upperBound && courseNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Course contains \" + nr_nonGeneralized_courseNumber_AttrEClass + \" non-generalized and non-negated courseNumber(s). Only \" + courseNumber_AttrEClass_upperBound + \" non-generalized and non-negated courseNumber(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Course
