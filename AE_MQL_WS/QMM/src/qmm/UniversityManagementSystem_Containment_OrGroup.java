/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University Management System Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.UniversityManagementSystem_Containment_OrGroup#getContainment <em>Containment</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getUniversityManagementSystem_Containment_OrGroup()
 * @model
 * @generated
 */
public interface UniversityManagementSystem_Containment_OrGroup extends Containment_OrGroup {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.UniversityManagementSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' containment reference list.
	 * @see qmm.QmmPackage#getUniversityManagementSystem_Containment_OrGroup_Containment()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniversityManagementSystem> getContainment();

} // UniversityManagementSystem_Containment_OrGroup
