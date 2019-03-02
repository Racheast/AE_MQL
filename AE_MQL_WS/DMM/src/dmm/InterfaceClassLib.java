/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getInterfaceClassLib()
 * @model
 * @generated
 */
public interface InterfaceClassLib extends CAEXObject {
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
	 * @see dmm.DmmPackage#getInterfaceClassLib_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getInterfaceClass();

} // InterfaceClassLib
