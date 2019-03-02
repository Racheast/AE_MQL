/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Person_Containment_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Person_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Person_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Person Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Person Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Person_Containment_OrGroup getFixture() {
		return (Person_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createPerson_Containment_OrGroup());
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

} //Person_Containment_OrGroupTest
