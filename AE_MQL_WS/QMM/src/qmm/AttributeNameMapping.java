/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeNameMapping#getRoleAttribute <em>Role Attribute</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getSystemUnitAttribute <em>System Unit Attribute</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getRoleAttributeName_AttrEClass <em>Role Attribute Name Attr EClass</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getSystemUnitAttributeName_AttrEClass <em>System Unit Attribute Name Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeNameMapping()
 * @model
 * @generated
 */
public interface AttributeNameMapping extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Role Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_RoleAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_Reference_OrGroup> getRoleAttribute();

	/**
	 * Returns the value of the '<em><b>System Unit Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_SystemUnitAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_Reference_OrGroup> getSystemUnitAttribute();

	/**
	 * Returns the value of the '<em><b>Role Attribute Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeNameMapping_roleAttributeName_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_RoleAttributeName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping_roleAttributeName_AttrEClass> getRoleAttributeName_AttrEClass();

	/**
	 * Returns the value of the '<em><b>System Unit Attribute Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeNameMapping_systemUnitAttributeName_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_SystemUnitAttributeName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping_systemUnitAttributeName_AttrEClass> getSystemUnitAttributeName_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int roleAttribute_upperBound = 1;\nint nr_nonTransitive_roleAttribute = 0;\nif(this.roleAttribute != null){\n\t\tfor(qmm.OrGroup og : this.roleAttribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleAttribute++;\n}\nif(nr_nonTransitive_roleAttribute > roleAttribute_upperBound && roleAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeNameMapping contains \" + nr_nonTransitive_roleAttribute + \" non-transitive, non-negated and non-generalized roleAttribute(s). Only \" + roleAttribute_upperBound + \" non-transitive, non-negated and non-generalized roleAttribute(s) are allowed.\",new Object[] { this }));\n\nfinal int systemUnitAttribute_upperBound = 1;\nint nr_nonTransitive_systemUnitAttribute = 0;\nif(this.systemUnitAttribute != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitAttribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitAttribute++;\n}\nif(nr_nonTransitive_systemUnitAttribute > systemUnitAttribute_upperBound && systemUnitAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeNameMapping contains \" + nr_nonTransitive_systemUnitAttribute + \" non-transitive, non-negated and non-generalized systemUnitAttribute(s). Only \" + systemUnitAttribute_upperBound + \" non-transitive, non-negated and non-generalized systemUnitAttribute(s) are allowed.\",new Object[] { this }));\n\nfinal int roleAttributeName_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_roleAttributeName_AttrEClass = 0;\nif(this.roleAttributeName_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.roleAttributeName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_roleAttributeName_AttrEClass++;\n}\nif(nr_nonGeneralized_roleAttributeName_AttrEClass > roleAttributeName_AttrEClass_upperBound && roleAttributeName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeNameMapping contains \" + nr_nonGeneralized_roleAttributeName_AttrEClass + \" non-generalized and non-negated roleAttributeName(s). Only \" + roleAttributeName_AttrEClass_upperBound + \" non-generalized and non-negated roleAttributeName(s) are allowed.\",new Object[] { this }));\n\nfinal int systemUnitAttributeName_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_systemUnitAttributeName_AttrEClass = 0;\nif(this.systemUnitAttributeName_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.systemUnitAttributeName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_systemUnitAttributeName_AttrEClass++;\n}\nif(nr_nonGeneralized_systemUnitAttributeName_AttrEClass > systemUnitAttributeName_AttrEClass_upperBound && systemUnitAttributeName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"AttributeNameMapping contains \" + nr_nonGeneralized_systemUnitAttributeName_AttrEClass + \" non-generalized and non-negated systemUnitAttributeName(s). Only \" + systemUnitAttributeName_AttrEClass_upperBound + \" non-generalized and non-negated systemUnitAttributeName(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // AttributeNameMapping
