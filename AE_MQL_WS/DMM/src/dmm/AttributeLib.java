/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.AttributeLib#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getAttributeLib()
 * @model
 * @generated
 */
public interface AttributeLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference list.
	 * @see dmm.DmmPackage#getAttributeLib_AttributeType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributeType();

} // AttributeLib
