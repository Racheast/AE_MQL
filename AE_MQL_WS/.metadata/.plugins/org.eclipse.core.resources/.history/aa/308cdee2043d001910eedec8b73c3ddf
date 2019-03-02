/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.UniversityManagementSystem#getCourse <em>Course</em>}</li>
 *   <li>{@link qmm.UniversityManagementSystem#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getUniversityManagementSystem()
 * @model
 * @generated
 */
public interface UniversityManagementSystem extends RootClass {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see qmm.QmmPackage#getUniversityManagementSystem_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_Containment_OrGroup> getCourse();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Person_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see qmm.QmmPackage#getUniversityManagementSystem_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person_Containment_OrGroup> getPerson();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int course_upperBound = -1;\nint nr_nonTransitive_course = 0;\nif(this.course != null){\n\t\tfor(qmm.OrGroup og : this.course) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_course++;\n}\nif(nr_nonTransitive_course > course_upperBound && course_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"UniversityManagementSystem contains \" + nr_nonTransitive_course + \" non-transitive, non-negated and non-generalized course(s). Only \" + course_upperBound + \" non-transitive, non-negated and non-generalized course(s) are allowed.\",new Object[] { this }));\n\nfinal int person_upperBound = -1;\nint nr_nonTransitive_person = 0;\nif(this.person != null){\n\t\tfor(qmm.OrGroup og : this.person) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_person++;\n}\nif(nr_nonTransitive_person > person_upperBound && person_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"UniversityManagementSystem contains \" + nr_nonTransitive_person + \" non-transitive, non-negated and non-generalized person(s). Only \" + person_upperBound + \" non-transitive, non-negated and non-generalized person(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // UniversityManagementSystem
