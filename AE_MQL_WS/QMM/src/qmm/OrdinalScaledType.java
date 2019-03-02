/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredMaxValue_AttrEClass <em>Required Max Value Attr EClass</em>}</li>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredMinValue_AttrEClass <em>Required Min Value Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getOrdinalScaledType()
 * @model
 * @generated
 */
public interface OrdinalScaledType extends RootClass {
	/**
	 * Returns the value of the '<em><b>Required Max Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.OrdinalScaledType_requiredMaxValue_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Max Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Max Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredMaxValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrdinalScaledType_requiredMaxValue_AttrEClass> getRequiredMaxValue_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Required Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.OrdinalScaledType_requiredValue_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrdinalScaledType_requiredValue_AttrEClass> getRequiredValue_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Required Min Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.OrdinalScaledType_requiredMinValue_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Min Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Min Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredMinValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrdinalScaledType_requiredMinValue_AttrEClass> getRequiredMinValue_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int requiredMaxValue_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_requiredMaxValue_AttrEClass = 0;\nif(this.requiredMaxValue_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.requiredMaxValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredMaxValue_AttrEClass++;\n}\nif(nr_nonGeneralized_requiredMaxValue_AttrEClass > requiredMaxValue_AttrEClass_upperBound && requiredMaxValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"OrdinalScaledType contains \" + nr_nonGeneralized_requiredMaxValue_AttrEClass + \" non-generalized and non-negated requiredMaxValue(s). Only \" + requiredMaxValue_AttrEClass_upperBound + \" non-generalized and non-negated requiredMaxValue(s) are allowed.\",new Object[] { this }));\n\nfinal int requiredValue_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_requiredValue_AttrEClass = 0;\nif(this.requiredValue_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.requiredValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredValue_AttrEClass++;\n}\nif(nr_nonGeneralized_requiredValue_AttrEClass > requiredValue_AttrEClass_upperBound && requiredValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"OrdinalScaledType contains \" + nr_nonGeneralized_requiredValue_AttrEClass + \" non-generalized and non-negated requiredValue(s). Only \" + requiredValue_AttrEClass_upperBound + \" non-generalized and non-negated requiredValue(s) are allowed.\",new Object[] { this }));\n\nfinal int requiredMinValue_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_requiredMinValue_AttrEClass = 0;\nif(this.requiredMinValue_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.requiredMinValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredMinValue_AttrEClass++;\n}\nif(nr_nonGeneralized_requiredMinValue_AttrEClass > requiredMinValue_AttrEClass_upperBound && requiredMinValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"OrdinalScaledType contains \" + nr_nonGeneralized_requiredMinValue_AttrEClass + \" non-generalized and non-negated requiredMinValue(s). Only \" + requiredMinValue_AttrEClass_upperBound + \" non-generalized and non-negated requiredMinValue(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // OrdinalScaledType
