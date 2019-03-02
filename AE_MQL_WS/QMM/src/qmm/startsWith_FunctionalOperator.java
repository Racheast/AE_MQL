/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>starts With Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.startsWith_FunctionalOperator#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getstartsWith_FunctionalOperator()
 * @model annotation="information name='startsWith' literal='.startsWith' functionalOperatorType='String' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface startsWith_FunctionalOperator extends String_Original_FunctionalOperator, Boolean_FunctionalType {
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
	 * @see qmm.QmmPackage#getstartsWith_FunctionalOperator_Prefix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getPrefix();

	/**
	 * Sets the value of the '{@link qmm.startsWith_FunctionalOperator#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".startsWith\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(prefix);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // startsWith_FunctionalOperator
