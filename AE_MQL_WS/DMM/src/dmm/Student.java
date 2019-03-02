/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.Student#getMatriculationNumber <em>Matriculation Number</em>}</li>
 *   <li>{@link dmm.Student#getAttends <em>Attends</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Matriculation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matriculation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculation Number</em>' attribute.
	 * @see #setMatriculationNumber(int)
	 * @see dmm.DmmPackage#getStudent_MatriculationNumber()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getMatriculationNumber();

	/**
	 * Sets the value of the '{@link dmm.Student#getMatriculationNumber <em>Matriculation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculation Number</em>' attribute.
	 * @see #getMatriculationNumber()
	 * @generated
	 */
	void setMatriculationNumber(int value);

	/**
	 * Returns the value of the '<em><b>Attends</b></em>' reference list.
	 * The list contents are of type {@link dmm.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attends</em>' reference list.
	 * @see dmm.DmmPackage#getStudent_Attends()
	 * @model
	 * @generated
	 */
	EList<Course> getAttends();

} // Student
