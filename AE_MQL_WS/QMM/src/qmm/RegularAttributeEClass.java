/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getRegularAttributeEClass()
 * @model abstract="true"
 * @generated
 */
public interface RegularAttributeEClass extends AttributeEClass, GeneralizableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EClass booleanType = QmmPackage.eINSTANCE.getBoolean_Type();\nEClass functionalOperatorType = QmmPackage.eINSTANCE.getFunctionalOperator();\nEClass bitOperatorType = QmmPackage.eINSTANCE.getBitOperator();\nqmm.Operator operator = (qmm.Operator)o;\nEList diagnosticList = new org.eclipse.emf.common.util.BasicEList();\n\nif(functionalOperatorType.isSuperTypeOf(operator.eClass())){\n\tqmm.FunctionalOperator lastOperator = (qmm.FunctionalOperator)((qmm.FunctionalOperator)operator).getLastOperator();\n    \tEClass lastOperatorType = (EClass)lastOperator.getType();\n    \tif(!booleanType.isSuperTypeOf(lastOperatorType)){\n\t\t\tString errorMessage = \"Operator \" + lastOperator.eClass().getName() + \" of attribute \" + this.eClass().getName() + \" is of type \" + lastOperatorType.getName() + \", but must be (a subtype) of type \" + booleanType.getName() + \".\";\n    \t\tdiagnosticList.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n    \t}\n}else if(bitOperatorType.isSuperTypeOf(operator.eClass())){\n    for(qmm.Operator op : (EList<qmm.Operator>)operator.eGet(operator.eClass().getEStructuralFeature(\"connects\"))){\n    \tdiagnosticList.addAll(validateCheckExpression(op));\n    }\n}\nreturn diagnosticList;'"
	 * @generated
	 */
	EList validateCheckExpression(Object o);

} // RegularAttributeEClass
