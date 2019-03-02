/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>starts With Offset Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.startsWithOffset_FunctionalOperator#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qmm.startsWithOffset_FunctionalOperator#getToffset <em>Toffset</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getstartsWithOffset_FunctionalOperator()
 * @model annotation="information name='startsWithOffset' literal='.starstWith' functionalOperatorType='String' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface startsWithOffset_FunctionalOperator extends String_Original_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getstartsWithOffset_FunctionalOperator_Prefix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getPrefix();

	/**
	 * Sets the value of the '{@link qmm.startsWithOffset_FunctionalOperator#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String_FunctionalParameter value);

	/**
	 * Returns the value of the '<em><b>Toffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toffset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toffset</em>' containment reference.
	 * @see #setToffset(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getstartsWithOffset_FunctionalOperator_Toffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getToffset();

	/**
	 * Sets the value of the '{@link qmm.startsWithOffset_FunctionalOperator#getToffset <em>Toffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toffset</em>' containment reference.
	 * @see #getToffset()
	 * @generated
	 */
	void setToffset(Integer_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".starstWith\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(prefix);\nparameterList.add(toffset);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // startsWithOffset_FunctionalOperator
