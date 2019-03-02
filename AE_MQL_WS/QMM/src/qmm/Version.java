/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Version#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.Version#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends RootClass {
	/**
	 * Returns the value of the '<em><b>Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Version_value_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getVersion_Value_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version_value_AttrEClass> getValue_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Change Mode Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #setChangeMode_AttrEClass(Version_changeMode_AttrEClass)
	 * @see qmm.QmmPackage#getVersion_ChangeMode_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Version_changeMode_AttrEClass getChangeMode_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Version#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 */
	void setChangeMode_AttrEClass(Version_changeMode_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int value_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_value_AttrEClass = 0;\nif(this.value_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.value_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_value_AttrEClass++;\n}\nif(nr_nonGeneralized_value_AttrEClass > value_AttrEClass_upperBound && value_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Version contains \" + nr_nonGeneralized_value_AttrEClass + \" non-generalized and non-negated value(s). Only \" + value_AttrEClass_upperBound + \" non-generalized and non-negated value(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Version
