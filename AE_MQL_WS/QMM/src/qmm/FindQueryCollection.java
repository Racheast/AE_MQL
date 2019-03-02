/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Query Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.FindQueryCollection#getFindQueries <em>Find Queries</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getFindQueryCollection()
 * @model
 * @generated
 */
public interface FindQueryCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Find Queries</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.FindQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Queries</em>' containment reference list.
	 * @see qmm.QmmPackage#getFindQueryCollection_FindQueries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FindQuery> getFindQueries();

} // FindQueryCollection
