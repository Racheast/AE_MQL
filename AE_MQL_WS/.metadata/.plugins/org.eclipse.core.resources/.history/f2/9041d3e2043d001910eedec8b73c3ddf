/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Exam#getExamID_AttrEClass <em>Exam ID Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends RootClass {
	/**
	 * Returns the value of the '<em><b>Exam ID Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Exam_examID_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam ID Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam ID Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getExam_ExamID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam_examID_AttrEClass> getExamID_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int examID_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_examID_AttrEClass = 0;\nif(this.examID_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.examID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_examID_AttrEClass++;\n}\nif(nr_nonGeneralized_examID_AttrEClass > examID_AttrEClass_upperBound && examID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Exam contains \" + nr_nonGeneralized_examID_AttrEClass + \" non-generalized and non-negated examID(s). Only \" + examID_AttrEClass_upperBound + \" non-generalized and non-negated examID(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Exam
