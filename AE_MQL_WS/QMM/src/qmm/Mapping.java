/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link qmm.Mapping#getInterfaceIDMapping <em>Interface ID Mapping</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeNameMapping_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name Mapping</em>' containment reference list.
	 * @see qmm.QmmPackage#getMapping_AttributeNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping_Containment_OrGroup> getAttributeNameMapping();

	/**
	 * Returns the value of the '<em><b>Interface ID Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceIDMapping_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface ID Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface ID Mapping</em>' containment reference list.
	 * @see qmm.QmmPackage#getMapping_InterfaceIDMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceIDMapping_Containment_OrGroup> getInterfaceIDMapping();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attributeNameMapping_upperBound = -1;\nint nr_nonTransitive_attributeNameMapping = 0;\nif(this.attributeNameMapping != null){\n\t\tfor(qmm.OrGroup og : this.attributeNameMapping) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attributeNameMapping++;\n}\nif(nr_nonTransitive_attributeNameMapping > attributeNameMapping_upperBound && attributeNameMapping_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Mapping contains \" + nr_nonTransitive_attributeNameMapping + \" non-transitive, non-negated and non-generalized attributeNameMapping(s). Only \" + attributeNameMapping_upperBound + \" non-transitive, non-negated and non-generalized attributeNameMapping(s) are allowed.\",new Object[] { this }));\n\nfinal int interfaceIDMapping_upperBound = -1;\nint nr_nonTransitive_interfaceIDMapping = 0;\nif(this.interfaceIDMapping != null){\n\t\tfor(qmm.OrGroup og : this.interfaceIDMapping) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_interfaceIDMapping++;\n}\nif(nr_nonTransitive_interfaceIDMapping > interfaceIDMapping_upperBound && interfaceIDMapping_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Mapping contains \" + nr_nonTransitive_interfaceIDMapping + \" non-transitive, non-negated and non-generalized interfaceIDMapping(s). Only \" + interfaceIDMapping_upperBound + \" non-transitive, non-negated and non-generalized interfaceIDMapping(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Mapping
