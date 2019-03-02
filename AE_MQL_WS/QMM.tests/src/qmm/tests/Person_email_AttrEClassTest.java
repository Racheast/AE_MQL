/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Person_email_AttrEClass;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person email Attr EClass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Person_email_AttrEClassTest extends String_AttributeEClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Person_email_AttrEClassTest.class);
	}

	/**
	 * Constructs a new Person email Attr EClass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person_email_AttrEClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Person email Attr EClass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Person_email_AttrEClass getFixture() {
		return (Person_email_AttrEClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createPerson_email_AttrEClass());
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

} //Person_email_AttrEClassTest
