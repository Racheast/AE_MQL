/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.UnknownType#getRequirements_AttrEClass <em>Requirements Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getUnknownType()
 * @model
 * @generated
 */
public interface UnknownType extends RootClass {
	/**
	 * Returns the value of the '<em><b>Requirements Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.UnknownType_requirements_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getUnknownType_Requirements_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownType_requirements_AttrEClass> getRequirements_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int requirements_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_requirements_AttrEClass = 0;\nif(this.requirements_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.requirements_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requirements_AttrEClass++;\n}\nif(nr_nonGeneralized_requirements_AttrEClass > requirements_AttrEClass_upperBound && requirements_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"UnknownType contains \" + nr_nonGeneralized_requirements_AttrEClass + \" non-generalized and non-negated requirements(s). Only \" + requirements_AttrEClass_upperBound + \" non-generalized and non-negated requirements(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // UnknownType
