/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Exam_Containment_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exam Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Exam_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Exam_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Exam Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exam Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Exam_Containment_OrGroup getFixture() {
		return (Exam_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createExam_Containment_OrGroup());
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

} //Exam_Containment_OrGroupTest
