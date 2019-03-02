/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InternalLink#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link qmm.InternalLink#getPartnerSideB <em>Partner Side B</em>}</li>
 *   <li>{@link qmm.InternalLink#getRefPartnerSideA_AttrEClass <em>Ref Partner Side AAttr EClass</em>}</li>
 *   <li>{@link qmm.InternalLink#getRefPartnerSideB_AttrEClass <em>Ref Partner Side BAttr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInternalLink()
 * @model
 * @generated
 */
public interface InternalLink extends CAEXObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Partner Side A</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side A</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalLink_PartnerSideA()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_Reference_OrGroup> getPartnerSideA();

	/**
	 * Returns the value of the '<em><b>Partner Side B</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side B</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side B</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalLink_PartnerSideB()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_Reference_OrGroup> getPartnerSideB();

	/**
	 * Returns the value of the '<em><b>Ref Partner Side AAttr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InternalLink_refPartnerSideA_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side AAttr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side AAttr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalLink_RefPartnerSideA_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalLink_refPartnerSideA_AttrEClass> getRefPartnerSideA_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Ref Partner Side BAttr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InternalLink_refPartnerSideB_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side BAttr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side BAttr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalLink_RefPartnerSideB_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalLink_refPartnerSideB_AttrEClass> getRefPartnerSideB_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int partnerSideA_upperBound = 1;\nint nr_nonTransitive_partnerSideA = 0;\nif(this.partnerSideA != null){\n\t\tfor(qmm.OrGroup og : this.partnerSideA) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_partnerSideA++;\n}\nif(nr_nonTransitive_partnerSideA > partnerSideA_upperBound && partnerSideA_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalLink contains \" + nr_nonTransitive_partnerSideA + \" non-transitive, non-negated and non-generalized partnerSideA(s). Only \" + partnerSideA_upperBound + \" non-transitive, non-negated and non-generalized partnerSideA(s) are allowed.\",new Object[] { this }));\n\nfinal int partnerSideB_upperBound = 1;\nint nr_nonTransitive_partnerSideB = 0;\nif(this.partnerSideB != null){\n\t\tfor(qmm.OrGroup og : this.partnerSideB) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_partnerSideB++;\n}\nif(nr_nonTransitive_partnerSideB > partnerSideB_upperBound && partnerSideB_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalLink contains \" + nr_nonTransitive_partnerSideB + \" non-transitive, non-negated and non-generalized partnerSideB(s). Only \" + partnerSideB_upperBound + \" non-transitive, non-negated and non-generalized partnerSideB(s) are allowed.\",new Object[] { this }));\n\nfinal int refPartnerSideA_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refPartnerSideA_AttrEClass = 0;\nif(this.refPartnerSideA_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refPartnerSideA_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refPartnerSideA_AttrEClass++;\n}\nif(nr_nonGeneralized_refPartnerSideA_AttrEClass > refPartnerSideA_AttrEClass_upperBound && refPartnerSideA_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalLink contains \" + nr_nonGeneralized_refPartnerSideA_AttrEClass + \" non-generalized and non-negated refPartnerSideA(s). Only \" + refPartnerSideA_AttrEClass_upperBound + \" non-generalized and non-negated refPartnerSideA(s) are allowed.\",new Object[] { this }));\n\nfinal int refPartnerSideB_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refPartnerSideB_AttrEClass = 0;\nif(this.refPartnerSideB_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refPartnerSideB_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refPartnerSideB_AttrEClass++;\n}\nif(nr_nonGeneralized_refPartnerSideB_AttrEClass > refPartnerSideB_AttrEClass_upperBound && refPartnerSideB_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalLink contains \" + nr_nonGeneralized_refPartnerSideB_AttrEClass + \" non-generalized and non-negated refPartnerSideB(s). Only \" + refPartnerSideB_AttrEClass_upperBound + \" non-generalized and non-negated refPartnerSideB(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InternalLink
