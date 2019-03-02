/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.NominalScaledType#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getNominalScaledType()
 * @model
 * @generated
 */
public interface NominalScaledType extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute list.
	 * @see dmm.DmmPackage#getNominalScaledType_RequiredValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getRequiredValue();

} // NominalScaledType
