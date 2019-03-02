/**
 */
package qmm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qmm.FindQueryCollection;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Find Query Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FindQueryCollectionTest extends TestCase {

	/**
	 * The fixture for this Find Query Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindQueryCollection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FindQueryCollectionTest.class);
	}

	/**
	 * Constructs a new Find Query Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindQueryCollectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Find Query Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FindQueryCollection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Find Query Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindQueryCollection getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createFindQueryCollection());
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

} //FindQueryCollectionTest
