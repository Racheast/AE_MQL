/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.InterfaceClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dmm.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 *   <li>{@link dmm.InterfaceClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link dmm.InterfaceClass#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getInterfaceClass()
 * @model
 * @generated
 */
public interface InterfaceClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see dmm.DmmPackage#getInterfaceClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see dmm.DmmPackage#getInterfaceClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link dmm.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(InterfaceClass)
	 * @see dmm.DmmPackage#getInterfaceClass_BaseClass()
	 * @model
	 * @generated
	 */
	InterfaceClass getBaseClass();

	/**
	 * Sets the value of the '{@link dmm.InterfaceClass#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(InterfaceClass value);

	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see dmm.DmmPackage#getInterfaceClass_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getInterfaceClass();

} // InterfaceClass
