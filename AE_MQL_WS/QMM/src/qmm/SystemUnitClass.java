/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.SystemUnitClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getInternalLink <em>Internal Link</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link qmm.SystemUnitClass#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getSystemUnitClass()
 * @model
 * @generated
 */
public interface SystemUnitClass extends CAEXObject, RootClass {
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
	 * @see qmm.QmmPackage#getSystemUnitClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_Containment_OrGroup> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_Containment_OrGroup> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InternalElement_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_InternalElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement_Containment_OrGroup> getInternalElement();

	/**
	 * Returns the value of the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SupportedRoleClass_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Role Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_SupportedRoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedRoleClass_Containment_OrGroup> getSupportedRoleClass();

	/**
	 * Returns the value of the '<em><b>Internal Link</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InternalLink_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Link</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_InternalLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalLink_Containment_OrGroup> getInternalLink();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SystemUnitClass_Reference_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_BaseClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass_Reference_OrGroup> getBaseClass();

	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SystemUnitClass_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass_Containment_OrGroup> getSystemUnitClass();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SystemUnitClass_refBaseClassPath_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Class Path Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Class Path Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getSystemUnitClass_RefBaseClassPath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass_refBaseClassPath_AttrEClass> getRefBaseClassPath_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attribute_upperBound = -1;\nint nr_nonTransitive_attribute = 0;\nif(this.attribute != null){\n\t\tfor(qmm.OrGroup og : this.attribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attribute++;\n}\nif(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_attribute + \" non-transitive, non-negated and non-generalized attribute(s). Only \" + attribute_upperBound + \" non-transitive, non-negated and non-generalized attribute(s) are allowed.\",new Object[] { this }));\n\nfinal int externalInterface_upperBound = -1;\nint nr_nonTransitive_externalInterface = 0;\nif(this.externalInterface != null){\n\t\tfor(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_externalInterface++;\n}\nif(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_externalInterface + \" non-transitive, non-negated and non-generalized externalInterface(s). Only \" + externalInterface_upperBound + \" non-transitive, non-negated and non-generalized externalInterface(s) are allowed.\",new Object[] { this }));\n\nfinal int internalElement_upperBound = -1;\nint nr_nonTransitive_internalElement = 0;\nif(this.internalElement != null){\n\t\tfor(qmm.OrGroup og : this.internalElement) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_internalElement++;\n}\nif(nr_nonTransitive_internalElement > internalElement_upperBound && internalElement_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_internalElement + \" non-transitive, non-negated and non-generalized internalElement(s). Only \" + internalElement_upperBound + \" non-transitive, non-negated and non-generalized internalElement(s) are allowed.\",new Object[] { this }));\n\nfinal int supportedRoleClass_upperBound = -1;\nint nr_nonTransitive_supportedRoleClass = 0;\nif(this.supportedRoleClass != null){\n\t\tfor(qmm.OrGroup og : this.supportedRoleClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_supportedRoleClass++;\n}\nif(nr_nonTransitive_supportedRoleClass > supportedRoleClass_upperBound && supportedRoleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_supportedRoleClass + \" non-transitive, non-negated and non-generalized supportedRoleClass(s). Only \" + supportedRoleClass_upperBound + \" non-transitive, non-negated and non-generalized supportedRoleClass(s) are allowed.\",new Object[] { this }));\n\nfinal int internalLink_upperBound = -1;\nint nr_nonTransitive_internalLink = 0;\nif(this.internalLink != null){\n\t\tfor(qmm.OrGroup og : this.internalLink) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_internalLink++;\n}\nif(nr_nonTransitive_internalLink > internalLink_upperBound && internalLink_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_internalLink + \" non-transitive, non-negated and non-generalized internalLink(s). Only \" + internalLink_upperBound + \" non-transitive, non-negated and non-generalized internalLink(s) are allowed.\",new Object[] { this }));\n\nfinal int baseClass_upperBound = 1;\nint nr_nonTransitive_baseClass = 0;\nif(this.baseClass != null){\n\t\tfor(qmm.OrGroup og : this.baseClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseClass++;\n}\nif(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_baseClass + \" non-transitive, non-negated and non-generalized baseClass(s). Only \" + baseClass_upperBound + \" non-transitive, non-negated and non-generalized baseClass(s) are allowed.\",new Object[] { this }));\n\nfinal int systemUnitClass_upperBound = -1;\nint nr_nonTransitive_systemUnitClass = 0;\nif(this.systemUnitClass != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitClass++;\n}\nif(nr_nonTransitive_systemUnitClass > systemUnitClass_upperBound && systemUnitClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonTransitive_systemUnitClass + \" non-transitive, non-negated and non-generalized systemUnitClass(s). Only \" + systemUnitClass_upperBound + \" non-transitive, non-negated and non-generalized systemUnitClass(s) are allowed.\",new Object[] { this }));\n\nfinal int refBaseClassPath_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_refBaseClassPath_AttrEClass = 0;\nif(this.refBaseClassPath_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.refBaseClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseClassPath_AttrEClass++;\n}\nif(nr_nonGeneralized_refBaseClassPath_AttrEClass > refBaseClassPath_AttrEClass_upperBound && refBaseClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"SystemUnitClass contains \" + nr_nonGeneralized_refBaseClassPath_AttrEClass + \" non-generalized and non-negated refBaseClassPath(s). Only \" + refBaseClassPath_AttrEClass_upperBound + \" non-generalized and non-negated refBaseClassPath(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // SystemUnitClass
