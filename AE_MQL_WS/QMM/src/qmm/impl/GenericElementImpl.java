/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.Element;
import qmm.GenericAttribute_Containment_OrGroup;
import qmm.GenericElement;
import qmm.GenericElement_Containment_OrGroup;
import qmm.GenericElement_attributeFeatureMap_AttrEClass;
import qmm.GenericElement_elementFeatureMap_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.GenericElementImpl#getNestedElements <em>Nested Elements</em>}</li>
 *   <li>{@link qmm.impl.GenericElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link qmm.impl.GenericElementImpl#getElementFeatureMap_AttrEClass <em>Element Feature Map Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.GenericElementImpl#getAttributeFeatureMap_AttrEClass <em>Attribute Feature Map Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericElementImpl extends ElementImpl implements GenericElement {
	/**
	 * The cached value of the '{@link #getNestedElements() <em>Nested Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericElement_Containment_OrGroup> nestedElements;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericAttribute_Containment_OrGroup> attributes;

	/**
	 * The cached value of the '{@link #getElementFeatureMap_AttrEClass() <em>Element Feature Map Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFeatureMap_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericElement_elementFeatureMap_AttrEClass> elementFeatureMap_AttrEClass;

	/**
	 * The cached value of the '{@link #getAttributeFeatureMap_AttrEClass() <em>Attribute Feature Map Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFeatureMap_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericElement_attributeFeatureMap_AttrEClass> attributeFeatureMap_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getGenericElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericElement_Containment_OrGroup> getNestedElements() {
		if (nestedElements == null) {
			nestedElements = new EObjectContainmentEList<GenericElement_Containment_OrGroup>(GenericElement_Containment_OrGroup.class, this, QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS);
		}
		return nestedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericAttribute_Containment_OrGroup> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<GenericAttribute_Containment_OrGroup>(GenericAttribute_Containment_OrGroup.class, this, QmmPackage.GENERIC_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericElement_elementFeatureMap_AttrEClass> getElementFeatureMap_AttrEClass() {
		if (elementFeatureMap_AttrEClass == null) {
			elementFeatureMap_AttrEClass = new EObjectContainmentEList<GenericElement_elementFeatureMap_AttrEClass>(GenericElement_elementFeatureMap_AttrEClass.class, this, QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS);
		}
		return elementFeatureMap_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericElement_attributeFeatureMap_AttrEClass> getAttributeFeatureMap_AttrEClass() {
		if (attributeFeatureMap_AttrEClass == null) {
			attributeFeatureMap_AttrEClass = new EObjectContainmentEList<GenericElement_attributeFeatureMap_AttrEClass>(GenericElement_attributeFeatureMap_AttrEClass.class, this, QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS);
		}
		return attributeFeatureMap_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		super.validate(diagnostic, context);
		if(diagnostic!=null){
		    if(this.evaluationOperator != null){
		    	EList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);
		    	for(int i=0; i<diagnosticList.size(); i++){
		    		diagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));
		    	}
		    }
		}
		
		final int nestedElements_upperBound = -1;
		int nr_nonTransitive_nestedElements = 0;
		if(this.nestedElements != null){
				for(qmm.OrGroup og : this.nestedElements) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_nestedElements++;
		}
		if(nr_nonTransitive_nestedElements > nestedElements_upperBound && nestedElements_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "GenericElement contains " + nr_nonTransitive_nestedElements + " non-transitive, non-negated and non-generalized nestedElements(s). Only " + nestedElements_upperBound + " non-transitive, non-negated and non-generalized nestedElements(s) are allowed.",new Object[] { this }));
		
		final int attributes_upperBound = -1;
		int nr_nonTransitive_attributes = 0;
		if(this.attributes != null){
				for(qmm.OrGroup og : this.attributes) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attributes++;
		}
		if(nr_nonTransitive_attributes > attributes_upperBound && attributes_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "GenericElement contains " + nr_nonTransitive_attributes + " non-transitive, non-negated and non-generalized attributes(s). Only " + attributes_upperBound + " non-transitive, non-negated and non-generalized attributes(s) are allowed.",new Object[] { this }));
		
		final int elementFeatureMap_AttrEClass_upperBound = -1;
		int nr_nonGeneralized_elementFeatureMap_AttrEClass = 0;
		if(this.elementFeatureMap_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.elementFeatureMap_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_elementFeatureMap_AttrEClass++;
		}
		if(nr_nonGeneralized_elementFeatureMap_AttrEClass > elementFeatureMap_AttrEClass_upperBound && elementFeatureMap_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "GenericElement contains " + nr_nonGeneralized_elementFeatureMap_AttrEClass + " non-generalized and non-negated elementFeatureMap(s). Only " + elementFeatureMap_AttrEClass_upperBound + " non-generalized and non-negated elementFeatureMap(s) are allowed.",new Object[] { this }));
		
		final int attributeFeatureMap_AttrEClass_upperBound = -1;
		int nr_nonGeneralized_attributeFeatureMap_AttrEClass = 0;
		if(this.attributeFeatureMap_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.attributeFeatureMap_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_attributeFeatureMap_AttrEClass++;
		}
		if(nr_nonGeneralized_attributeFeatureMap_AttrEClass > attributeFeatureMap_AttrEClass_upperBound && attributeFeatureMap_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "GenericElement contains " + nr_nonGeneralized_attributeFeatureMap_AttrEClass + " non-generalized and non-negated attributeFeatureMap(s). Only " + attributeFeatureMap_AttrEClass_upperBound + " non-generalized and non-negated attributeFeatureMap(s) are allowed.",new Object[] { this }));
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
				return ((InternalEList<?>)getNestedElements()).basicRemove(otherEnd, msgs);
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				return ((InternalEList<?>)getElementFeatureMap_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				return ((InternalEList<?>)getAttributeFeatureMap_AttrEClass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
				return getNestedElements();
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				return getElementFeatureMap_AttrEClass();
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				return getAttributeFeatureMap_AttrEClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
				getNestedElements().clear();
				getNestedElements().addAll((Collection<? extends GenericElement_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends GenericAttribute_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				getElementFeatureMap_AttrEClass().clear();
				getElementFeatureMap_AttrEClass().addAll((Collection<? extends GenericElement_elementFeatureMap_AttrEClass>)newValue);
				return;
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				getAttributeFeatureMap_AttrEClass().clear();
				getAttributeFeatureMap_AttrEClass().addAll((Collection<? extends GenericElement_attributeFeatureMap_AttrEClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
				getNestedElements().clear();
				return;
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				getElementFeatureMap_AttrEClass().clear();
				return;
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				getAttributeFeatureMap_AttrEClass().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QmmPackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
				return nestedElements != null && !nestedElements.isEmpty();
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case QmmPackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				return elementFeatureMap_AttrEClass != null && !elementFeatureMap_AttrEClass.isEmpty();
			case QmmPackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				return attributeFeatureMap_AttrEClass != null && !attributeFeatureMap_AttrEClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.GENERIC_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Element.class) {
			switch (baseOperationID) {
				case QmmPackage.ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.GENERIC_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.GENERIC_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenericElementImpl
