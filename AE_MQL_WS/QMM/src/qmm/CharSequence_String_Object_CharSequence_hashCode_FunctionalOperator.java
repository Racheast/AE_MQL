/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Sequence String Object Char Sequence hash Code Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator()
 * @model annotation="information name='hashCode' literal='.hashCode' functionalOperatorType='Object' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator extends InheritedFrom_CharSequence_to_String_FunctionalOperator, Integer_FunctionalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".hashCode\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator
