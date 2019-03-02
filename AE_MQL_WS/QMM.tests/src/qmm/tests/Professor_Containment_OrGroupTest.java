/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Professor_Containment_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Professor Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Professor_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Professor_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Professor Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Professor Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Professor_Containment_OrGroup getFixture() {
		return (Professor_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createProfessor_Containment_OrGroup());
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

} //Professor_Containment_OrGroupTest
