/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Semantic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.RefSemantic#getCorrespondingAttributePath_AttrEClass <em>Corresponding Attribute Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRefSemantic()
 * @model
 * @generated
 */
public interface RefSemantic extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Corresponding Attribute Path Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RefSemantic_correspondingAttributePath_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Attribute Path Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Attribute Path Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRefSemantic_CorrespondingAttributePath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSemantic_correspondingAttributePath_AttrEClass> getCorrespondingAttributePath_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int correspondingAttributePath_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_correspondingAttributePath_AttrEClass = 0;\nif(this.correspondingAttributePath_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.correspondingAttributePath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_correspondingAttributePath_AttrEClass++;\n}\nif(nr_nonGeneralized_correspondingAttributePath_AttrEClass > correspondingAttributePath_AttrEClass_upperBound && correspondingAttributePath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"RefSemantic contains \" + nr_nonGeneralized_correspondingAttributePath_AttrEClass + \" non-generalized and non-negated correspondingAttributePath(s). Only \" + correspondingAttributePath_AttrEClass_upperBound + \" non-generalized and non-negated correspondingAttributePath(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // RefSemantic
