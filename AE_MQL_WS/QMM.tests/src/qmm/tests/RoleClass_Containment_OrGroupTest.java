/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.RoleClass_Containment_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Class Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleClass_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleClass_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Role Class Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Class Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleClass_Containment_OrGroup getFixture() {
		return (RoleClass_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createRoleClass_Containment_OrGroup());
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

} //RoleClass_Containment_OrGroupTest
