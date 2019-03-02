/**
 */
package dmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmm.GenericElement#getNestedElements <em>Nested Elements</em>}</li>
 *   <li>{@link dmm.GenericElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dmm.GenericElement#getElementFeatureMap <em>Element Feature Map</em>}</li>
 *   <li>{@link dmm.GenericElement#getAttributeFeatureMap <em>Attribute Feature Map</em>}</li>
 * </ul>
 *
 * @see dmm.DmmPackage#getGenericElement()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface GenericElement extends Element {
	/**
	 * Returns the value of the '<em><b>Nested Elements</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.GenericElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Elements</em>' containment reference list.
	 * @see dmm.DmmPackage#getGenericElement_NestedElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericElement> getNestedElements();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dmm.GenericAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dmm.DmmPackage#getGenericElement_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Element Feature Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Feature Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Feature Map</em>' attribute list.
	 * @see dmm.DmmPackage#getGenericElement_ElementFeatureMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true"
	 *        extendedMetaData="kind='elementWildcard' name=':0' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getElementFeatureMap();

	/**
	 * Returns the value of the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Feature Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Feature Map</em>' attribute list.
	 * @see dmm.DmmPackage#getGenericElement_AttributeFeatureMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' name=':1' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getAttributeFeatureMap();

} // GenericElement
