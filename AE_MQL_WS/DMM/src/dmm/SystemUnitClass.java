/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.SystemUnitClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getInternalLink <em>Internal Link</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link dmm.SystemUnitClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getSystemUnitClass()
 * @model
 * @generated
 */
public interface SystemUnitClass extends CAEXObject {
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
	 * @see dmm.DmmPackage#getSystemUnitClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see dmm.DmmPackage#getSystemUnitClass_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see dmm.DmmPackage#getSystemUnitClass_InternalElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

	/**
	 * Returns the value of the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.SupportedRoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Role Class</em>' containment reference list.
	 * @see dmm.DmmPackage#getSystemUnitClass_SupportedRoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedRoleClass> getSupportedRoleClass();

	/**
	 * Returns the value of the '<em><b>Internal Link</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InternalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Link</em>' containment reference list.
	 * @see dmm.DmmPackage#getSystemUnitClass_InternalLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalLink> getInternalLink();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(SystemUnitClass)
	 * @see dmm.DmmPackage#getSystemUnitClass_BaseClass()
	 * @model
	 * @generated
	 */
	SystemUnitClass getBaseClass();

	/**
	 * Sets the value of the '{@link dmm.SystemUnitClass#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(SystemUnitClass value);

	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.SystemUnitClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see dmm.DmmPackage#getSystemUnitClass_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass> getSystemUnitClass();

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
	 * @see dmm.DmmPackage#getSystemUnitClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link dmm.SystemUnitClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

} // SystemUnitClass
