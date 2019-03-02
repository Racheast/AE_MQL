/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compare To String Ignore Case Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.compareToStringIgnoreCase_FunctionalOperator#getStr <em>Str</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getcompareToStringIgnoreCase_FunctionalOperator()
 * @model annotation="information name='compareToStringIgnoreCase' literal='compareToIgnoreCase' functionalOperatorType='String' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface compareToStringIgnoreCase_FunctionalOperator extends String_Original_FunctionalOperator, Integer_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' containment reference.
	 * @see #setStr(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getcompareToStringIgnoreCase_FunctionalOperator_Str()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getStr();

	/**
	 * Sets the value of the '{@link qmm.compareToStringIgnoreCase_FunctionalOperator#getStr <em>Str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' containment reference.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"compareToIgnoreCase\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(str);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // compareToStringIgnoreCase_FunctionalOperator
