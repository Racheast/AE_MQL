/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Course_name_AttrEClass;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course name Attr EClass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Course_name_AttrEClassTest extends String_AttributeEClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Course_name_AttrEClassTest.class);
	}

	/**
	 * Constructs a new Course name Attr EClass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_name_AttrEClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Course name Attr EClass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Course_name_AttrEClass getFixture() {
		return (Course_name_AttrEClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createCourse_name_AttrEClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Course_name_AttrEClassTest
