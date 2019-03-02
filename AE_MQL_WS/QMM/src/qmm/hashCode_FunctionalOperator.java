/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>hash Code Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#gethashCode_FunctionalOperator()
 * @model annotation="information name='hashCode' literal='.hashCode' functionalOperatorType='Object' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface hashCode_FunctionalOperator extends Object_FunctionalOperator, Integer_FunctionalType {
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

} // hashCode_FunctionalOperator
