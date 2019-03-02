/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.ExternalInterface#getExternalInterface <em>External Interface</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getExternalInterface()
 * @model
 * @generated
 */
public interface ExternalInterface extends InterfaceClass {
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
	 * @see dmm.DmmPackage#getExternalInterface_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

} // ExternalInterface
