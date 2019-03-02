/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Element#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Element#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends RootClass {
	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Element_name_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getElement_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element_name_AttrEClass> getName_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Element_value_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getElement_Value_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element_value_AttrEClass> getValue_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int name_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_name_AttrEClass = 0;\nif(this.name_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;\n}\nif(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Element contains \" + nr_nonGeneralized_name_AttrEClass + \" non-generalized and non-negated name(s). Only \" + name_AttrEClass_upperBound + \" non-generalized and non-negated name(s) are allowed.\",new Object[] { this }));\n\nfinal int value_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_value_AttrEClass = 0;\nif(this.value_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.value_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_value_AttrEClass++;\n}\nif(nr_nonGeneralized_value_AttrEClass > value_AttrEClass_upperBound && value_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Element contains \" + nr_nonGeneralized_value_AttrEClass + \" non-generalized and non-negated value(s). Only \" + value_AttrEClass_upperBound + \" non-generalized and non-negated value(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Element
