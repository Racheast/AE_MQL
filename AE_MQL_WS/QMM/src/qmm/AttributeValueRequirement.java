/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link qmm.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link qmm.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link qmm.AttributeValueRequirement#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeValueRequirement()
 * @model
 * @generated
 */
public interface AttributeValueRequirement extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Ordinal Scaled Type</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.OrdinalScaledType_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal Scaled Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal Scaled Type</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeValueRequirement_OrdinalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrdinalScaledType_Containment_OrGroup> getOrdinalScaledType();

	/**
	 * Returns the value of the '<em><b>Nominal Scaled Type</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.NominalScaledType_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Scaled Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Scaled Type</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeValueRequirement_NominalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	EList<NominalScaledType_Containment_OrGroup> getNominalScaledType();

	/**
	 * Returns the value of the '<em><b>Unknown Type</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.UnknownType_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Type</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeValueRequirement_UnknownType()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownType_Containment_OrGroup> getUnknownType();

	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeValueRequirement_name_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeValueRequirement_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValueRequirement_name_AttrEClass> getName_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int ordinalScaledType_upperBound = 1;\nint nr_nonTransitive_ordinalScaledType = 0;\nif(this.ordinalScaledType != null){\n\t\tfor(qmm.OrGroup og : this.ordinalScaledType) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_ordinalScaledType++;\n}\nif(nr_nonTransitive_ordinalScaledType > ordinalScaledType_upperBound && ordinalScaledType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeValueRequirement contains \" + nr_nonTransitive_ordinalScaledType + \" non-transitive, non-negated and non-generalized ordinalScaledType(s). Only \" + ordinalScaledType_upperBound + \" non-transitive, non-negated and non-generalized ordinalScaledType(s) are allowed.\",new Object[] { this }));\n\nfinal int nominalScaledType_upperBound = 1;\nint nr_nonTransitive_nominalScaledType = 0;\nif(this.nominalScaledType != null){\n\t\tfor(qmm.OrGroup og : this.nominalScaledType) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_nominalScaledType++;\n}\nif(nr_nonTransitive_nominalScaledType > nominalScaledType_upperBound && nominalScaledType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeValueRequirement contains \" + nr_nonTransitive_nominalScaledType + \" non-transitive, non-negated and non-generalized nominalScaledType(s). Only \" + nominalScaledType_upperBound + \" non-transitive, non-negated and non-generalized nominalScaledType(s) are allowed.\",new Object[] { this }));\n\nfinal int unknownType_upperBound = 1;\nint nr_nonTransitive_unknownType = 0;\nif(this.unknownType != null){\n\t\tfor(qmm.OrGroup og : this.unknownType) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_unknownType++;\n}\nif(nr_nonTransitive_unknownType > unknownType_upperBound && unknownType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeValueRequirement contains \" + nr_nonTransitive_unknownType + \" non-transitive, non-negated and non-generalized unknownType(s). Only \" + unknownType_upperBound + \" non-transitive, non-negated and non-generalized unknownType(s) are allowed.\",new Object[] { this }));\n\nfinal int name_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_name_AttrEClass = 0;\nif(this.name_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;\n}\nif(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeValueRequirement contains \" + nr_nonGeneralized_name_AttrEClass + \" non-generalized and non-negated name(s). Only \" + name_AttrEClass_upperBound + \" non-generalized and non-negated name(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // AttributeValueRequirement
