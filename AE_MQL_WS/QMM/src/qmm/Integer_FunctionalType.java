/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Functional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Integer_FunctionalType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInteger_FunctionalType()
 * @model abstract="true"
 * @generated
 */
public interface Integer_FunctionalType extends Integer_Type, FunctionalType {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Integer_FunctionalOperator)
	 * @see qmm.QmmPackage#getInteger_FunctionalType_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Integer_FunctionalOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.Integer_FunctionalType#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Integer_FunctionalOperator value);

} // Integer_FunctionalType