/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.CAEXFile#getSuperiorStandardVersion <em>Superior Standard Version</em>}</li>
 *   <li>{@link dmm.CAEXFile#getSourceDocumentInformation <em>Source Document Information</em>}</li>
 *   <li>{@link dmm.CAEXFile#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link dmm.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}</li>
 *   <li>{@link dmm.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}</li>
 *   <li>{@link dmm.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}</li>
 *   <li>{@link dmm.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}</li>
 *   <li>{@link dmm.CAEXFile#getAttributeTypeLib <em>Attribute Type Lib</em>}</li>
 *   <li>{@link dmm.CAEXFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link dmm.CAEXFile#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getCAEXFile()
 * @model
 * @generated
 */
public interface CAEXFile extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Superior Standard Version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior Standard Version</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior Standard Version</em>' attribute list.
	 * @see dmm.DmmPackage#getCAEXFile_SuperiorStandardVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getSuperiorStandardVersion();

	/**
	 * Returns the value of the '<em><b>Source Document Information</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.SourceDocumentInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Document Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Document Information</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_SourceDocumentInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceDocumentInformation> getSourceDocumentInformation();

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.ExternalReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_ExternalReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReferenceType> getExternalReference();

	/**
	 * Returns the value of the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InstanceHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Hierarchy</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_InstanceHierarchy()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceHierarchy> getInstanceHierarchy();

	/**
	 * Returns the value of the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.InterfaceClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class Lib</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_InterfaceClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClassLib> getInterfaceClassLib();

	/**
	 * Returns the value of the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.RoleClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class Lib</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_RoleClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClassLib> getRoleClassLib();

	/**
	 * Returns the value of the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.SystemUnitClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class Lib</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_SystemUnitClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClassLib> getSystemUnitClassLib();

	/**
	 * Returns the value of the '<em><b>Attribute Type Lib</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.AttributeLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type Lib</em>' containment reference list.
	 * @see dmm.DmmPackage#getCAEXFile_AttributeTypeLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeLib> getAttributeTypeLib();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see dmm.DmmPackage#getCAEXFile_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link dmm.CAEXFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"3.00"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @see dmm.DmmPackage#getCAEXFile_SchemaVersion()
	 * @model default="3.00" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link dmm.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Unsets the value of the '{@link dmm.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link dmm.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Version</em>' attribute is set.
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	boolean isSetSchemaVersion();

} // CAEXFile
