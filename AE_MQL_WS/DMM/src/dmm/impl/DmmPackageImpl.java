/**
 */
package dmm.impl;

import dmm.Course;
import dmm.CourseType;
import dmm.DmmFactory;
import dmm.DmmPackage;
import dmm.Exam;
import dmm.Person;
import dmm.Professor;
import dmm.Student;
import dmm.UniversityManagementSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmmPackageImpl extends EPackageImpl implements DmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityManagementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dmm.DmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmmPackageImpl() {
		super(eNS_URI, DmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmmPackage init() {
		if (isInited) return (DmmPackage)EPackage.Registry.INSTANCE.getEPackage(DmmPackage.eNS_URI);

		// Obtain or create and register package
		DmmPackageImpl theDmmPackage = (DmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDmmPackage.createPackageContents();

		// Initialize created meta-data
		theDmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmmPackage.eNS_URI, theDmmPackage);
		return theDmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_MatriculationNumber() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Attends() {
		return (EReference)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessor_EmployeeNumber() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Lectures() {
		return (EReference)professorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseNumber() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseType() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_MandatoryFor() {
		return (EReference)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Exam() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversityManagementSystem() {
		return universityManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Course() {
		return (EReference)universityManagementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Person() {
		return (EReference)universityManagementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_ExamID() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseType() {
		return courseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmmFactory getDmmFactory() {
		return (DmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__EMAIL);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__MATRICULATION_NUMBER);
		createEReference(studentEClass, STUDENT__ATTENDS);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__EMPLOYEE_NUMBER);
		createEReference(professorEClass, PROFESSOR__LECTURES);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__COURSE_NUMBER);
		createEAttribute(courseEClass, COURSE__COURSE_TYPE);
		createEReference(courseEClass, COURSE__MANDATORY_FOR);
		createEReference(courseEClass, COURSE__EXAM);

		universityManagementSystemEClass = createEClass(UNIVERSITY_MANAGEMENT_SYSTEM);
		createEReference(universityManagementSystemEClass, UNIVERSITY_MANAGEMENT_SYSTEM__COURSE);
		createEReference(universityManagementSystemEClass, UNIVERSITY_MANAGEMENT_SYSTEM__PERSON);

		examEClass = createEClass(EXAM);
		createEAttribute(examEClass, EXAM__EXAM_ID);

		// Create enums
		courseTypeEEnum = createEEnum(COURSE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studentEClass.getESuperTypes().add(this.getPerson());
		professorEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 1, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_MatriculationNumber(), ecorePackage.getEInt(), "matriculationNumber", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Attends(), this.getCourse(), null, "attends", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_EmployeeNumber(), ecorePackage.getEInt(), "employeeNumber", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Lectures(), this.getCourse(), null, "lectures", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseNumber(), ecorePackage.getEInt(), "courseNumber", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseType(), this.getCourseType(), "courseType", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_MandatoryFor(), this.getCourse(), null, "mandatoryFor", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Exam(), this.getExam(), null, "exam", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universityManagementSystemEClass, UniversityManagementSystem.class, "UniversityManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversityManagementSystem_Course(), this.getCourse(), null, "course", null, 0, -1, UniversityManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversityManagementSystem_Person(), this.getPerson(), null, "person", null, 0, -1, UniversityManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_ExamID(), ecorePackage.getEString(), "examID", null, 1, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(courseTypeEEnum, CourseType.class, "CourseType");
		addEEnumLiteral(courseTypeEEnum, CourseType.VO);
		addEEnumLiteral(courseTypeEEnum, CourseType.UE);
		addEEnumLiteral(courseTypeEEnum, CourseType.SEM);
		addEEnumLiteral(courseTypeEEnum, CourseType.PR);

		// Create resource
		createResource(eNS_URI);
	}

} //DmmPackageImpl
