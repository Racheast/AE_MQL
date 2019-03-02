/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InternalElement#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link qmm.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}</li>
 *   <li>{@link qmm.InternalElement#getRefBaseSystemUnitPath_AttrEClass <em>Ref Base System Unit Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInternalElement()
 * @model
 * @generated
 */
public interface InternalElement extends SystemUnitClass, RootClass {
	/**
	 * Returns the value of the '<em><b>Role Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RoleRequirements_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Requirements</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalElement_RoleRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleRequirements_Containment_OrGroup> getRoleRequirements();

	/**
	 * Returns the value of the '<em><b>Base System Unit</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SystemUnitClass_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base System Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base System Unit</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalElement_BaseSystemUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass_Reference_OrGroup> getBaseSystemUnit();

	/**
	 * Returns the value of the '<em><b>Ref Base System Unit Path Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InternalElement_refBaseSystemUnitPath_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base System Unit Path Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base System Unit Path Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getInternalElement_RefBaseSystemUnitPath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement_refBaseSystemUnitPath_AttrEClass> getRefBaseSystemUnitPath_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int roleRequirements_upperBound = -1;\nint nr_nonTransitive_roleRequirements = 0;\nif(this.roleRequirements != null){\n\t\tfor(qmm.OrGroup og : this.roleRequirements) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleRequirements++;\n}\nif(nr_nonTransitive_roleRequirements > roleRequirements_upperBound && roleRequirements_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalElement contains \" + nr_nonTransitive_roleRequirements + \" non-transitive, non-negated and non-generalized roleRequirements(s). Only \" + roleRequirements_upperBound + \" non-transitive, non-negated and non-generalized roleRequirements(s) are allowed.\",new Object[] { this }));\n\nfinal int baseSystemUnit_upperBound = 1;\nint nr_nonTransitive_baseSystemUnit = 0;\nif(this.baseSystemUnit != null){\n\t\tfor(qmm.OrGroup og : this.baseSystemUnit) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseSystemUnit++;\n}\nif(nr_nonTransitive_baseSystemUnit > baseSystemUnit_upperBound && baseSystemUnit_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalElement contains \" + nr_nonTransitive_baseSystemUnit + \" non-transitive, non-negated and non-generalized baseSystemUnit(s). Only \" + baseSystemUnit_upperBound + \" non-transitive, non-negated and non-generalized baseSystemUnit(s) are allowed.\",new Object[] { this }));\n\nfinal int refBaseSystemUnitPath_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass = 0;\nif(this.refBaseSystemUnitPath_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refBaseSystemUnitPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass++;\n}\nif(nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass > refBaseSystemUnitPath_AttrEClass_upperBound && refBaseSystemUnitPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InternalElement contains \" + nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass + \" non-generalized and non-negated refBaseSystemUnitPath(s). Only \" + refBaseSystemUnitPath_AttrEClass_upperBound + \" non-generalized and non-negated refBaseSystemUnitPath(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InternalElement
