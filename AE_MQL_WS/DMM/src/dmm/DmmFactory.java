/**
 */
package dmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmm.DmmPackage
 * @generated
 */
public interface DmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmmFactory eINSTANCE = dmm.impl.DmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>University Management System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University Management System</em>'.
	 * @generated
	 */
	UniversityManagementSystem createUniversityManagementSystem();

	/**
	 * Returns a new object of class '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam</em>'.
	 * @generated
	 */
	Exam createExam();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmmPackage getDmmPackage();

} //DmmFactory
