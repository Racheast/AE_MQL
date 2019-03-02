/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Professor;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qmm.Professor#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProfessorTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfessorTest.class);
	}

	/**
	 * Constructs a new Professor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Professor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Professor getFixture() {
		return (Professor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createProfessor());
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

	/**
	 * Tests the '{@link qmm.Professor#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qmm.Professor#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidate__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ProfessorTest
