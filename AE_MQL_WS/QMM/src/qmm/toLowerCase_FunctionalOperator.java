/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>to Lower Case Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#gettoLowerCase_FunctionalOperator()
 * @model annotation="information name='toLowerCase' literal='.toLowerCase' functionalOperatorType='String' functionalType='String_FunctionalType'"
 * @generated
 */
public interface toLowerCase_FunctionalOperator extends String_Original_FunctionalOperator, String_FunctionalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".toLowerCase\";'"
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

} // toLowerCase_FunctionalOperator
