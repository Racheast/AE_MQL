/**
 */
package dmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.Version#getValue <em>Value</em>}</li>
 *   <li>{@link dmm.Version#getChangeMode <em>Change Mode</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dmm.DmmPackage#getVersion_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dmm.Version#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Change Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link dmm.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode</em>' attribute.
	 * @see dmm.ChangeMode
	 * @see #setChangeMode(ChangeMode)
	 * @see dmm.DmmPackage#getVersion_ChangeMode()
	 * @model
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link dmm.Version#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see dmm.ChangeMode
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

} // Version
