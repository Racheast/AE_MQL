/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Professor#getLectures <em>Lectures</em>}</li>
 *   <li>{@link qmm.Professor#getEmployeeNumber_AttrEClass <em>Employee Number Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Person, RootClass {
	/**
	 * Returns the value of the '<em><b>Lectures</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lectures</em>' containment reference list.
	 * @see qmm.QmmPackage#getProfessor_Lectures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_Reference_OrGroup> getLectures();

	/**
	 * Returns the value of the '<em><b>Employee Number Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Professor_employeeNumber_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Number Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Number Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getProfessor_EmployeeNumber_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor_employeeNumber_AttrEClass> getEmployeeNumber_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int lectures_upperBound = -1;\nint nr_nonTransitive_lectures = 0;\nif(this.lectures != null){\n\t\tfor(qmm.OrGroup og : this.lectures) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_lectures++;\n}\nif(nr_nonTransitive_lectures > lectures_upperBound && lectures_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Professor contains \" + nr_nonTransitive_lectures + \" non-transitive, non-negated and non-generalized lectures(s). Only \" + lectures_upperBound + \" non-transitive, non-negated and non-generalized lectures(s) are allowed.\",new Object[] { this }));\n\nfinal int employeeNumber_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_employeeNumber_AttrEClass = 0;\nif(this.employeeNumber_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.employeeNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_employeeNumber_AttrEClass++;\n}\nif(nr_nonGeneralized_employeeNumber_AttrEClass > employeeNumber_AttrEClass_upperBound && employeeNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Professor contains \" + nr_nonGeneralized_employeeNumber_AttrEClass + \" non-generalized and non-negated employeeNumber(s). Only \" + employeeNumber_AttrEClass_upperBound + \" non-generalized and non-negated employeeNumber(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Professor
