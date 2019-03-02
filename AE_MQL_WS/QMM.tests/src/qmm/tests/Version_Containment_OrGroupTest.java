/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.Version_Containment_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Version_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Version_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Version Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Version Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Version_Containment_OrGroup getFixture() {
		return (Version_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createVersion_Containment_OrGroup());
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

} //Version_Containment_OrGroupTest
