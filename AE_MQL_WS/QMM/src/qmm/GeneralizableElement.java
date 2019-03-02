/**
 */
package qmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalizable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.GeneralizableElement#isGeneralized <em>Generalized</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getGeneralizableElement()
 * @model abstract="true"
 * @generated
 */
public interface GeneralizableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Generalized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalized</em>' attribute.
	 * @see #setGeneralized(boolean)
	 * @see qmm.QmmPackage#getGeneralizableElement_Generalized()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGeneralized();

	/**
	 * Sets the value of the '{@link qmm.GeneralizableElement#isGeneralized <em>Generalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalized</em>' attribute.
	 * @see #isGeneralized()
	 * @generated
	 */
	void setGeneralized(boolean value);

} // GeneralizableElement
