/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.UniversityManagementSystem#getCourse <em>Course</em>}</li>
 *   <li>{@link dmm.UniversityManagementSystem#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getUniversityManagementSystem()
 * @model
 * @generated
 */
public interface UniversityManagementSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see dmm.DmmPackage#getUniversityManagementSystem_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see dmm.DmmPackage#getUniversityManagementSystem_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

} // UniversityManagementSystem
