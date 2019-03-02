/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Person#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Person#getEmail_AttrEClass <em>Email Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends RootClass {
	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Person_name_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getPerson_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person_name_AttrEClass> getName_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Email Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Person_email_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getPerson_Email_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person_email_AttrEClass> getEmail_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int name_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_name_AttrEClass = 0;\nif(this.name_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;\n}\nif(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Person contains \" + nr_nonGeneralized_name_AttrEClass + \" non-generalized and non-negated name(s). Only \" + name_AttrEClass_upperBound + \" non-generalized and non-negated name(s) are allowed.\",new Object[] { this }));\n\nfinal int email_AttrEClass_upperBound = -1;\nint nr_nonGeneralized_email_AttrEClass = 0;\nif(this.email_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.email_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_email_AttrEClass++;\n}\nif(nr_nonGeneralized_email_AttrEClass > email_AttrEClass_upperBound && email_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Person contains \" + nr_nonGeneralized_email_AttrEClass + \" non-generalized and non-negated email(s). Only \" + email_AttrEClass_upperBound + \" non-generalized and non-negated email(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Person
