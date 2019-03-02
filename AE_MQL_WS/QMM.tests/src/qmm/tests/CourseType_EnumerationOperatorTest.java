/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.CourseType_EnumerationOperator;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Type Enumeration Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseType_EnumerationOperatorTest extends EnumerationOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseType_EnumerationOperatorTest.class);
	}

	/**
	 * Constructs a new Course Type Enumeration Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType_EnumerationOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Course Type Enumeration Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CourseType_EnumerationOperator getFixture() {
		return (CourseType_EnumerationOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createCourseType_EnumerationOperator());
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

} //CourseType_EnumerationOperatorTest
