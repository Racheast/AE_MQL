/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>index Of Char Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.indexOfChar_FunctionalOperator#getCh <em>Ch</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getindexOfChar_FunctionalOperator()
 * @model annotation="information name='indexOfChar' literal='.indexOf' functionalOperatorType='String' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface indexOfChar_FunctionalOperator extends String_Original_FunctionalOperator, Integer_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Ch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch</em>' containment reference.
	 * @see #setCh(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getindexOfChar_FunctionalOperator_Ch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getCh();

	/**
	 * Sets the value of the '{@link qmm.indexOfChar_FunctionalOperator#getCh <em>Ch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ch</em>' containment reference.
	 * @see #getCh()
	 * @generated
	 */
	void setCh(Integer_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".indexOf\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(ch);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // indexOfChar_FunctionalOperator
