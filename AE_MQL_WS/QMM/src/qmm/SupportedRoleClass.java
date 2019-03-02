/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qmm.SupportedRoleClass#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link qmm.SupportedRoleClass#getRefRoleClassPath_AttrEClass <em>Ref Role Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getSupportedRoleClass()
 * @model
 * @generated
 */
public interface SupportedRoleClass extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Mapping_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference list.
	 * @see qmm.QmmPackage#getSupportedRoleClass_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping_Containment_OrGroup> getMappingObject();

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RoleClass_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getSupportedRoleClass_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClass_Reference_OrGroup> getRoleClass();

	/**
	 * Returns the value of the '<em><b>Ref Role Class Path Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SupportedRoleClass_refRoleClassPath_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Role Class Path Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Role Class Path Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getSupportedRoleClass_RefRoleClassPath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedRoleClass_refRoleClassPath_AttrEClass> getRefRoleClassPath_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int mappingObject_upperBound = 1;\nint nr_nonTransitive_mappingObject = 0;\nif(this.mappingObject != null){\n\t\tfor(qmm.OrGroup og : this.mappingObject) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_mappingObject++;\n}\nif(nr_nonTransitive_mappingObject > mappingObject_upperBound && mappingObject_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SupportedRoleClass contains \" + nr_nonTransitive_mappingObject + \" non-transitive, non-negated and non-generalized mappingObject(s). Only \" + mappingObject_upperBound + \" non-transitive, non-negated and non-generalized mappingObject(s) are allowed.\",new Object[] { this }));\n\nfinal int roleClass_upperBound = 1;\nint nr_nonTransitive_roleClass = 0;\nif(this.roleClass != null){\n\t\tfor(qmm.OrGroup og : this.roleClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleClass++;\n}\nif(nr_nonTransitive_roleClass > roleClass_upperBound && roleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SupportedRoleClass contains \" + nr_nonTransitive_roleClass + \" non-transitive, non-negated and non-generalized roleClass(s). Only \" + roleClass_upperBound + \" non-transitive, non-negated and non-generalized roleClass(s) are allowed.\",new Object[] { this }));\n\nfinal int refRoleClassPath_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refRoleClassPath_AttrEClass = 0;\nif(this.refRoleClassPath_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refRoleClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refRoleClassPath_AttrEClass++;\n}\nif(nr_nonGeneralized_refRoleClassPath_AttrEClass > refRoleClassPath_AttrEClass_upperBound && refRoleClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SupportedRoleClass contains \" + nr_nonGeneralized_refRoleClassPath_AttrEClass + \" non-generalized and non-negated refRoleClassPath(s). Only \" + refRoleClassPath_AttrEClass_upperBound + \" non-generalized and non-negated refRoleClassPath(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // SupportedRoleClass
