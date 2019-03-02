/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInterfaceClassLib()
 * @model
 * @generated
 */
public interface InterfaceClassLib extends CAEXObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_Containment_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceClassLib_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_Containment_OrGroup> getInterfaceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int interfaceClass_upperBound = -1;\nint nr_nonTransitive_interfaceClass = 0;\nif(this.interfaceClass != null){\n\t\tfor(qmm.OrGroup og : this.interfaceClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_interfaceClass++;\n}\nif(nr_nonTransitive_interfaceClass > interfaceClass_upperBound && interfaceClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"InterfaceClassLib contains \" + nr_nonTransitive_interfaceClass + \" non-transitive, non-negated and non-generalized interfaceClass(s). Only \" + interfaceClass_upperBound + \" non-transitive, non-negated and non-generalized interfaceClass(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InterfaceClassLib
