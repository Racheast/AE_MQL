/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Student#getAttends <em>Attends</em>}</li>
 *   <li>{@link qmm.Student#getMatriculationNumber_AttrEClass <em>Matriculation Number Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person, RootClass {
	/**
	 * Returns the value of the '<em><b>Attends</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Course_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attends</em>' containment reference list.
	 * @see qmm.QmmPackage#getStudent_Attends()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course_Reference_OrGroup> getAttends();

	/**
	 * Returns the value of the '<em><b>Matriculation Number Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Student_matriculationNumber_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matriculation Number Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculation Number Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getStudent_MatriculationNumber_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student_matriculationNumber_AttrEClass> getMatriculationNumber_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attends_upperBound = -1;\nint nr_nonTransitive_attends = 0;\nif(this.attends != null){\n\t\tfor(qmm.OrGroup og : this.attends) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attends++;\n}\nif(nr_nonTransitive_attends > attends_upperBound && attends_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Student contains \" + nr_nonTransitive_attends + \" non-transitive, non-negated and non-generalized attends(s). Only \" + attends_upperBound + \" non-transitive, non-negated and non-generalized attends(s) are allowed.\",new Object[] { this }));\n\nfinal int matriculationNumber_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_matriculationNumber_AttrEClass = 0;\nif(this.matriculationNumber_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.matriculationNumber_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_matriculationNumber_AttrEClass++;\n}\nif(nr_nonGeneralized_matriculationNumber_AttrEClass > matriculationNumber_AttrEClass_upperBound && matriculationNumber_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Student contains \" + nr_nonGeneralized_matriculationNumber_AttrEClass + \" non-generalized and non-negated matriculationNumber(s). Only \" + matriculationNumber_AttrEClass_upperBound + \" non-generalized and non-negated matriculationNumber(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Student
