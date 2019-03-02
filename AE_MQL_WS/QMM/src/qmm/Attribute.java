/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Attribute#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link qmm.Attribute#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link qmm.Attribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.Attribute#getDefaultValue_AttrEClass <em>Default Value Attr EClass</em>}</li>
 *   <li>{@link qmm.Attribute#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.Attribute#getAttributeDataType_AttrEClass <em>Attribute Data Type Attr EClass</em>}</li>
 *   <li>{@link qmm.Attribute#getRefAttributeType_AttrEClass <em>Ref Attribute Type Attr EClass</em>}</li>
 *   <li>{@link qmm.Attribute#getUnit_AttrEClass <em>Unit Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends CAEXObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RefSemantic_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Semantic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Semantic</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_RefSemantic()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSemantic_Containment_OrGroup> getRefSemantic();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeValueRequirement_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValueRequirement_Containment_OrGroup> getConstraint();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_Containment_OrGroup> getAttribute();

	/**
	 * Returns the value of the '<em><b>Default Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_defaultValue_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_DefaultValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_defaultValue_AttrEClass> getDefaultValue_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_value_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_Value_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_value_AttrEClass> getValue_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Attribute Data Type Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_attributeDataType_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Data Type Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Data Type Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_AttributeDataType_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_attributeDataType_AttrEClass> getAttributeDataType_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Ref Attribute Type Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_refAttributeType_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Attribute Type Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Attribute Type Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_RefAttributeType_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_refAttributeType_AttrEClass> getRefAttributeType_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Unit Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_unit_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttribute_Unit_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_unit_AttrEClass> getUnit_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int refSemantic_upperBound = -1;\nint nr_nonTransitive_refSemantic = 0;\nif(this.refSemantic != null){\n\t\tfor(qmm.OrGroup og : this.refSemantic) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_refSemantic++;\n}\nif(nr_nonTransitive_refSemantic > refSemantic_upperBound && refSemantic_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonTransitive_refSemantic + \" non-transitive, non-negated and non-generalized refSemantic(s). Only \" + refSemantic_upperBound + \" non-transitive, non-negated and non-generalized refSemantic(s) are allowed.\",new Object[] { this }));\n\nfinal int constraint_upperBound = -1;\nint nr_nonTransitive_constraint = 0;\nif(this.constraint != null){\n\t\tfor(qmm.OrGroup og : this.constraint) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_constraint++;\n}\nif(nr_nonTransitive_constraint > constraint_upperBound && constraint_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonTransitive_constraint + \" non-transitive, non-negated and non-generalized constraint(s). Only \" + constraint_upperBound + \" non-transitive, non-negated and non-generalized constraint(s) are allowed.\",new Object[] { this }));\n\nfinal int attribute_upperBound = -1;\nint nr_nonTransitive_attribute = 0;\nif(this.attribute != null){\n\t\tfor(qmm.OrGroup og : this.attribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attribute++;\n}\nif(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonTransitive_attribute + \" non-transitive, non-negated and non-generalized attribute(s). Only \" + attribute_upperBound + \" non-transitive, non-negated and non-generalized attribute(s) are allowed.\",new Object[] { this }));\n\nfinal int defaultValue_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_defaultValue_AttrEClass = 0;\nif(this.defaultValue_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.defaultValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_defaultValue_AttrEClass++;\n}\nif(nr_nonGeneralized_defaultValue_AttrEClass > defaultValue_AttrEClass_upperBound && defaultValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonGeneralized_defaultValue_AttrEClass + \" non-generalized and non-negated defaultValue(s). Only \" + defaultValue_AttrEClass_upperBound + \" non-generalized and non-negated defaultValue(s) are allowed.\",new Object[] { this }));\n\nfinal int value_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_value_AttrEClass = 0;\nif(this.value_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.value_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_value_AttrEClass++;\n}\nif(nr_nonGeneralized_value_AttrEClass > value_AttrEClass_upperBound && value_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonGeneralized_value_AttrEClass + \" non-generalized and non-negated value(s). Only \" + value_AttrEClass_upperBound + \" non-generalized and non-negated value(s) are allowed.\",new Object[] { this }));\n\nfinal int attributeDataType_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_attributeDataType_AttrEClass = 0;\nif(this.attributeDataType_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.attributeDataType_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_attributeDataType_AttrEClass++;\n}\nif(nr_nonGeneralized_attributeDataType_AttrEClass > attributeDataType_AttrEClass_upperBound && attributeDataType_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonGeneralized_attributeDataType_AttrEClass + \" non-generalized and non-negated attributeDataType(s). Only \" + attributeDataType_AttrEClass_upperBound + \" non-generalized and non-negated attributeDataType(s) are allowed.\",new Object[] { this }));\n\nfinal int refAttributeType_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refAttributeType_AttrEClass = 0;\nif(this.refAttributeType_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refAttributeType_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refAttributeType_AttrEClass++;\n}\nif(nr_nonGeneralized_refAttributeType_AttrEClass > refAttributeType_AttrEClass_upperBound && refAttributeType_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonGeneralized_refAttributeType_AttrEClass + \" non-generalized and non-negated refAttributeType(s). Only \" + refAttributeType_AttrEClass_upperBound + \" non-generalized and non-negated refAttributeType(s) are allowed.\",new Object[] { this }));\n\nfinal int unit_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_unit_AttrEClass = 0;\nif(this.unit_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.unit_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_unit_AttrEClass++;\n}\nif(nr_nonGeneralized_unit_AttrEClass > unit_AttrEClass_upperBound && unit_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Attribute contains \" + nr_nonGeneralized_unit_AttrEClass + \" non-generalized and non-negated unit(s). Only \" + unit_AttrEClass_upperBound + \" non-generalized and non-negated unit(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Attribute
