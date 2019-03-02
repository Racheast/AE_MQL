/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>offset By Code Points Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.offsetByCodePoints_FunctionalOperator#getIndex <em>Index</em>}</li>
 *   <li>{@link qmm.offsetByCodePoints_FunctionalOperator#getCodePointOffset <em>Code Point Offset</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getoffsetByCodePoints_FunctionalOperator()
 * @model annotation="information name='offsetByCodePoints' literal='.offsetByCodePoints' functionalOperatorType='String' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface offsetByCodePoints_FunctionalOperator extends String_Original_FunctionalOperator, Integer_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getoffsetByCodePoints_FunctionalOperator_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getIndex();

	/**
	 * Sets the value of the '{@link qmm.offsetByCodePoints_FunctionalOperator#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer_FunctionalParameter value);

	/**
	 * Returns the value of the '<em><b>Code Point Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Point Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Point Offset</em>' containment reference.
	 * @see #setCodePointOffset(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getoffsetByCodePoints_FunctionalOperator_CodePointOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getCodePointOffset();

	/**
	 * Sets the value of the '{@link qmm.offsetByCodePoints_FunctionalOperator#getCodePointOffset <em>Code Point Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Point Offset</em>' containment reference.
	 * @see #getCodePointOffset()
	 * @generated
	 */
	void setCodePointOffset(Integer_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".offsetByCodePoints\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(index);\nparameterList.add(codePointOffset);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // offsetByCodePoints_FunctionalOperator
