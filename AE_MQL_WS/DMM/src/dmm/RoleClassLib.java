/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.RoleClassLib#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getRoleClassLib()
 * @model
 * @generated
 */
public interface RoleClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.RoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see dmm.DmmPackage#getRoleClassLib_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClass> getRoleClass();

} // RoleClassLib
