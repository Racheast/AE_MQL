/**
 */
package dmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmm.DmmFactory
 * @model kind="package"
 * @generated
 */
public interface DmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/DMM/model/DMM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmmPackage eINSTANCE = dmm.impl.DmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmm.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.PersonImpl
	 * @see dmm.impl.DmmPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.StudentImpl
	 * @see dmm.impl.DmmPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Matriculation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRICULATION_NUMBER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ATTENDS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.ProfessorImpl
	 * @see dmm.impl.DmmPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Employee Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMPLOYEE_NUMBER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lectures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__LECTURES = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.CourseImpl
	 * @see dmm.impl.DmmPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Course Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mandatory For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MANDATORY_FOR = 3;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EXAM = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.UniversityManagementSystemImpl <em>University Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.UniversityManagementSystemImpl
	 * @see dmm.impl.DmmPackageImpl#getUniversityManagementSystem()
	 * @generated
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM__PERSON = 1;

	/**
	 * The number of structural features of the '<em>University Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>University Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.ExamImpl
	 * @see dmm.impl.DmmPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 5;

	/**
	 * The feature id for the '<em><b>Exam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__EXAM_ID = 0;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.CourseType <em>Course Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.CourseType
	 * @see dmm.impl.DmmPackageImpl#getCourseType()
	 * @generated
	 */
	int COURSE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link dmm.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see dmm.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmm.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see dmm.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link dmm.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see dmm.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Student#getMatriculationNumber <em>Matriculation Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matriculation Number</em>'.
	 * @see dmm.Student#getMatriculationNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_MatriculationNumber();

	/**
	 * Returns the meta object for the reference list '{@link dmm.Student#getAttends <em>Attends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attends</em>'.
	 * @see dmm.Student#getAttends()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Attends();

	/**
	 * Returns the meta object for class '{@link dmm.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see dmm.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Professor#getEmployeeNumber <em>Employee Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Number</em>'.
	 * @see dmm.Professor#getEmployeeNumber()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_EmployeeNumber();

	/**
	 * Returns the meta object for the reference list '{@link dmm.Professor#getLectures <em>Lectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lectures</em>'.
	 * @see dmm.Professor#getLectures()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Lectures();

	/**
	 * Returns the meta object for class '{@link dmm.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see dmm.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmm.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Course#getCourseNumber <em>Course Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Number</em>'.
	 * @see dmm.Course#getCourseNumber()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseNumber();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Course#getCourseType <em>Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Type</em>'.
	 * @see dmm.Course#getCourseType()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseType();

	/**
	 * Returns the meta object for the reference list '{@link dmm.Course#getMandatoryFor <em>Mandatory For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory For</em>'.
	 * @see dmm.Course#getMandatoryFor()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_MandatoryFor();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Course#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam</em>'.
	 * @see dmm.Course#getExam()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Exam();

	/**
	 * Returns the meta object for class '{@link dmm.UniversityManagementSystem <em>University Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University Management System</em>'.
	 * @see dmm.UniversityManagementSystem
	 * @generated
	 */
	EClass getUniversityManagementSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.UniversityManagementSystem#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see dmm.UniversityManagementSystem#getCourse()
	 * @see #getUniversityManagementSystem()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.UniversityManagementSystem#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see dmm.UniversityManagementSystem#getPerson()
	 * @see #getUniversityManagementSystem()
	 * @generated
	 */
	EReference getUniversityManagementSystem_Person();

	/**
	 * Returns the meta object for class '{@link dmm.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see dmm.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Exam#getExamID <em>Exam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam ID</em>'.
	 * @see dmm.Exam#getExamID()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_ExamID();

	/**
	 * Returns the meta object for enum '{@link dmm.CourseType <em>Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Type</em>'.
	 * @see dmm.CourseType
	 * @generated
	 */
	EEnum getCourseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmmFactory getDmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmm.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.PersonImpl
		 * @see dmm.impl.DmmPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '{@link dmm.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.StudentImpl
		 * @see dmm.impl.DmmPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matriculation Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRICULATION_NUMBER = eINSTANCE.getStudent_MatriculationNumber();

		/**
		 * The meta object literal for the '<em><b>Attends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ATTENDS = eINSTANCE.getStudent_Attends();

		/**
		 * The meta object literal for the '{@link dmm.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.ProfessorImpl
		 * @see dmm.impl.DmmPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Employee Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__EMPLOYEE_NUMBER = eINSTANCE.getProfessor_EmployeeNumber();

		/**
		 * The meta object literal for the '<em><b>Lectures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__LECTURES = eINSTANCE.getProfessor_Lectures();

		/**
		 * The meta object literal for the '{@link dmm.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.CourseImpl
		 * @see dmm.impl.DmmPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Course Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NUMBER = eINSTANCE.getCourse_CourseNumber();

		/**
		 * The meta object literal for the '<em><b>Course Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_TYPE = eINSTANCE.getCourse_CourseType();

		/**
		 * The meta object literal for the '<em><b>Mandatory For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__MANDATORY_FOR = eINSTANCE.getCourse_MandatoryFor();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__EXAM = eINSTANCE.getCourse_Exam();

		/**
		 * The meta object literal for the '{@link dmm.impl.UniversityManagementSystemImpl <em>University Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.UniversityManagementSystemImpl
		 * @see dmm.impl.DmmPackageImpl#getUniversityManagementSystem()
		 * @generated
		 */
		EClass UNIVERSITY_MANAGEMENT_SYSTEM = eINSTANCE.getUniversityManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY_MANAGEMENT_SYSTEM__COURSE = eINSTANCE.getUniversityManagementSystem_Course();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY_MANAGEMENT_SYSTEM__PERSON = eINSTANCE.getUniversityManagementSystem_Person();

		/**
		 * The meta object literal for the '{@link dmm.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.ExamImpl
		 * @see dmm.impl.DmmPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Exam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__EXAM_ID = eINSTANCE.getExam_ExamID();

		/**
		 * The meta object literal for the '{@link dmm.CourseType <em>Course Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.CourseType
		 * @see dmm.impl.DmmPackageImpl#getCourseType()
		 * @generated
		 */
		EEnum COURSE_TYPE = eINSTANCE.getCourseType();

	}

} //DmmPackage
