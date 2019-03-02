/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.ExternalReferenceType#getAlias_AttrEClass <em>Alias Attr EClass</em>}</li>
 *   <li>{@link qmm.ExternalReferenceType#getPath_AttrEClass <em>Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getExternalReferenceType()
 * @model
 * @generated
 */
public interface ExternalReferenceType extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Alias Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalReferenceType_alias_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getExternalReferenceType_Alias_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReferenceType_alias_AttrEClass> getAlias_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Path Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalReferenceType_path_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getExternalReferenceType_Path_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReferenceType_path_AttrEClass> getPath_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int alias_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_alias_AttrEClass = 0;\nif(this.alias_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.alias_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_alias_AttrEClass++;\n}\nif(nr_nonGeneralized_alias_AttrEClass > alias_AttrEClass_upperBound && alias_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"ExternalReferenceType contains \" + nr_nonGeneralized_alias_AttrEClass + \" non-generalized and non-negated alias(s). Only \" + alias_AttrEClass_upperBound + \" non-generalized and non-negated alias(s) are allowed.\",new Object[] { this }));\n\nfinal int path_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_path_AttrEClass = 0;\nif(this.path_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.path_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_path_AttrEClass++;\n}\nif(nr_nonGeneralized_path_AttrEClass > path_AttrEClass_upperBound && path_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"ExternalReferenceType contains \" + nr_nonGeneralized_path_AttrEClass + \" non-generalized and non-negated path(s). Only \" + path_AttrEClass_upperBound + \" non-generalized and non-negated path(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // ExternalReferenceType
