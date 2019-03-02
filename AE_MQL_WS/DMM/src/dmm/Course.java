/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.Course#getName <em>Name</em>}</li>
 *   <li>{@link dmm.Course#getCourseNumber <em>Course Number</em>}</li>
 *   <li>{@link dmm.Course#getCourseType <em>Course Type</em>}</li>
 *   <li>{@link dmm.Course#getMandatoryFor <em>Mandatory For</em>}</li>
 *   <li>{@link dmm.Course#getExam <em>Exam</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dmm.DmmPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dmm.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Number</em>' attribute.
	 * @see #setCourseNumber(int)
	 * @see dmm.DmmPackage#getCourse_CourseNumber()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getCourseNumber();

	/**
	 * Sets the value of the '{@link dmm.Course#getCourseNumber <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Number</em>' attribute.
	 * @see #getCourseNumber()
	 * @generated
	 */
	void setCourseNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dmm.CourseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Type</em>' attribute.
	 * @see dmm.CourseType
	 * @see #setCourseType(CourseType)
	 * @see dmm.DmmPackage#getCourse_CourseType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	CourseType getCourseType();

	/**
	 * Sets the value of the '{@link dmm.Course#getCourseType <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Type</em>' attribute.
	 * @see dmm.CourseType
	 * @see #getCourseType()
	 * @generated
	 */
	void setCourseType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Mandatory For</b></em>' reference list.
	 * The list contents are of type {@link dmm.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory For</em>' reference list.
	 * @see dmm.DmmPackage#getCourse_MandatoryFor()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatoryFor();

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.Exam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference list.
	 * @see dmm.DmmPackage#getCourse_Exam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam> getExam();

} // Course
