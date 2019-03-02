/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InterfaceIDMapping#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getRoleInterfaceID_AttrEClass <em>Role Interface ID Attr EClass</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getSystemUnitInterfaceID_AttrEClass <em>System Unit Interface ID Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInterfaceIDMapping()
 * @model
 * @generated
 */
public interface InterfaceIDMapping extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Role Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_RoleInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_Reference_OrGroup> getRoleInterface();

	/**
	 * Returns the value of the '<em><b>System Unit Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_SystemUnitInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_Reference_OrGroup> getSystemUnitInterface();

	/**
	 * Returns the value of the '<em><b>Role Interface ID Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceIDMapping_roleInterfaceID_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface ID Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface ID Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_RoleInterfaceID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceIDMapping_roleInterfaceID_AttrEClass> getRoleInterfaceID_AttrEClass();

	/**
	 * Returns the value of the '<em><b>System Unit Interface ID Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceIDMapping_systemUnitInterfaceID_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface ID Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface ID Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_SystemUnitInterfaceID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceIDMapping_systemUnitInterfaceID_AttrEClass> getSystemUnitInterfaceID_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int roleInterface_upperBound = 1;\nint nr_nonTransitive_roleInterface = 0;\nif(this.roleInterface != null){\n\t\tfor(qmm.OrGroup og : this.roleInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleInterface++;\n}\nif(nr_nonTransitive_roleInterface > roleInterface_upperBound && roleInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InterfaceIDMapping contains \" + nr_nonTransitive_roleInterface + \" non-transitive, non-negated and non-generalized roleInterface(s). Only \" + roleInterface_upperBound + \" non-transitive, non-negated and non-generalized roleInterface(s) are allowed.\",new Object[] { this }));\n\nfinal int systemUnitInterface_upperBound = 1;\nint nr_nonTransitive_systemUnitInterface = 0;\nif(this.systemUnitInterface != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitInterface++;\n}\nif(nr_nonTransitive_systemUnitInterface > systemUnitInterface_upperBound && systemUnitInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InterfaceIDMapping contains \" + nr_nonTransitive_systemUnitInterface + \" non-transitive, non-negated and non-generalized systemUnitInterface(s). Only \" + systemUnitInterface_upperBound + \" non-transitive, non-negated and non-generalized systemUnitInterface(s) are allowed.\",new Object[] { this }));\n\nfinal int roleInterfaceID_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_roleInterfaceID_AttrEClass = 0;\nif(this.roleInterfaceID_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.roleInterfaceID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_roleInterfaceID_AttrEClass++;\n}\nif(nr_nonGeneralized_roleInterfaceID_AttrEClass > roleInterfaceID_AttrEClass_upperBound && roleInterfaceID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InterfaceIDMapping contains \" + nr_nonGeneralized_roleInterfaceID_AttrEClass + \" non-generalized and non-negated roleInterfaceID(s). Only \" + roleInterfaceID_AttrEClass_upperBound + \" non-generalized and non-negated roleInterfaceID(s) are allowed.\",new Object[] { this }));\n\nfinal int systemUnitInterfaceID_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_systemUnitInterfaceID_AttrEClass = 0;\nif(this.systemUnitInterfaceID_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.systemUnitInterfaceID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_systemUnitInterfaceID_AttrEClass++;\n}\nif(nr_nonGeneralized_systemUnitInterfaceID_AttrEClass > systemUnitInterfaceID_AttrEClass_upperBound && systemUnitInterfaceID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InterfaceIDMapping contains \" + nr_nonGeneralized_systemUnitInterfaceID_AttrEClass + \" non-generalized and non-negated systemUnitInterfaceID(s). Only \" + systemUnitInterfaceID_AttrEClass_upperBound + \" non-generalized and non-negated systemUnitInterfaceID(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InterfaceIDMapping
