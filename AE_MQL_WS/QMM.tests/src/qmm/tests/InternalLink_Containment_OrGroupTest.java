/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.InternalLink_Containment_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Link Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalLink_Containment_OrGroupTest extends Containment_OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalLink_Containment_OrGroupTest.class);
	}

	/**
	 * Constructs a new Internal Link Containment Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink_Containment_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Link Containment Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalLink_Containment_OrGroup getFixture() {
		return (InternalLink_Containment_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createInternalLink_Containment_OrGroup());
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

} //InternalLink_Containment_OrGroupTest
