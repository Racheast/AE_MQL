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

import qmm.Attribute;
import qmm.AttributeValueRequirement_Containment_OrGroup;
import qmm.Attribute_Containment_OrGroup;
import qmm.Attribute_attributeDataType_AttrEClass;
import qmm.Attribute_defaultValue_AttrEClass;
import qmm.Attribute_refAttributeType_AttrEClass;
import qmm.Attribute_unit_AttrEClass;
import qmm.Attribute_value_AttrEClass;
import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.RefSemantic_Containment_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeImpl#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getDefaultValue_AttrEClass <em>Default Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getAttributeDataType_AttrEClass <em>Attribute Data Type Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getRefAttributeType_AttrEClass <em>Ref Attribute Type Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getUnit_AttrEClass <em>Unit Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends CAEXObjectImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getRefSemantic() <em>Ref Semantic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSemantic()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSemantic_Containment_OrGroup> refSemantic;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueRequirement_Containment_OrGroup> constraint;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_Containment_OrGroup> attribute;

	/**
	 * The cached value of the '{@link #getDefaultValue_AttrEClass() <em>Default Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_defaultValue_AttrEClass> defaultValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getValue_AttrEClass() <em>Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_value_AttrEClass> value_AttrEClass;

	/**
	 * The cached value of the '{@link #getAttributeDataType_AttrEClass() <em>Attribute Data Type Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_attributeDataType_AttrEClass> attributeDataType_AttrEClass;

	/**
	 * The cached value of the '{@link #getRefAttributeType_AttrEClass() <em>Ref Attribute Type Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAttributeType_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_refAttributeType_AttrEClass> refAttributeType_AttrEClass;

	/**
	 * The cached value of the '{@link #getUnit_AttrEClass() <em>Unit Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_unit_AttrEClass> unit_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSemantic_Containment_OrGroup> getRefSemantic() {
		if (refSemantic == null) {
			refSemantic = new EObjectContainmentEList<RefSemantic_Containment_OrGroup>(RefSemantic_Containment_OrGroup.class, this, QmmPackage.ATTRIBUTE__REF_SEMANTIC);
		}
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRequirement_Containment_OrGroup> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<AttributeValueRequirement_Containment_OrGroup>(AttributeValueRequirement_Containment_OrGroup.class, this, QmmPackage.ATTRIBUTE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Containment_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_Containment_OrGroup>(Attribute_Containment_OrGroup.class, this, QmmPackage.ATTRIBUTE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_defaultValue_AttrEClass> getDefaultValue_AttrEClass() {
		if (defaultValue_AttrEClass == null) {
			defaultValue_AttrEClass = new EObjectContainmentEList<Attribute_defaultValue_AttrEClass>(Attribute_defaultValue_AttrEClass.class, this, QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS);
		}
		return defaultValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_value_AttrEClass> getValue_AttrEClass() {
		if (value_AttrEClass == null) {
			value_AttrEClass = new EObjectContainmentEList<Attribute_value_AttrEClass>(Attribute_value_AttrEClass.class, this, QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS);
		}
		return value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_attributeDataType_AttrEClass> getAttributeDataType_AttrEClass() {
		if (attributeDataType_AttrEClass == null) {
			attributeDataType_AttrEClass = new EObjectContainmentEList<Attribute_attributeDataType_AttrEClass>(Attribute_attributeDataType_AttrEClass.class, this, QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS);
		}
		return attributeDataType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_refAttributeType_AttrEClass> getRefAttributeType_AttrEClass() {
		if (refAttributeType_AttrEClass == null) {
			refAttributeType_AttrEClass = new EObjectContainmentEList<Attribute_refAttributeType_AttrEClass>(Attribute_refAttributeType_AttrEClass.class, this, QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS);
		}
		return refAttributeType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_unit_AttrEClass> getUnit_AttrEClass() {
		if (unit_AttrEClass == null) {
			unit_AttrEClass = new EObjectContainmentEList<Attribute_unit_AttrEClass>(Attribute_unit_AttrEClass.class, this, QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS);
		}
		return unit_AttrEClass;
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
		
		final int refSemantic_upperBound = -1;
		int nr_nonTransitive_refSemantic = 0;
		if(this.refSemantic != null){
				for(qmm.OrGroup og : this.refSemantic) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_refSemantic++;
		}
		if(nr_nonTransitive_refSemantic > refSemantic_upperBound && refSemantic_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonTransitive_refSemantic + " non-transitive, non-negated and non-generalized refSemantic(s). Only " + refSemantic_upperBound + " non-transitive, non-negated and non-generalized refSemantic(s) are allowed.",new Object[] { this }));
		
		final int constraint_upperBound = -1;
		int nr_nonTransitive_constraint = 0;
		if(this.constraint != null){
				for(qmm.OrGroup og : this.constraint) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_constraint++;
		}
		if(nr_nonTransitive_constraint > constraint_upperBound && constraint_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonTransitive_constraint + " non-transitive, non-negated and non-generalized constraint(s). Only " + constraint_upperBound + " non-transitive, non-negated and non-generalized constraint(s) are allowed.",new Object[] { this }));
		
		final int attribute_upperBound = -1;
		int nr_nonTransitive_attribute = 0;
		if(this.attribute != null){
				for(qmm.OrGroup og : this.attribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attribute++;
		}
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonTransitive_attribute + " non-transitive, non-negated and non-generalized attribute(s). Only " + attribute_upperBound + " non-transitive, non-negated and non-generalized attribute(s) are allowed.",new Object[] { this }));
		
		final int defaultValue_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_defaultValue_AttrEClass = 0;
		if(this.defaultValue_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.defaultValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_defaultValue_AttrEClass++;
		}
		if(nr_nonGeneralized_defaultValue_AttrEClass > defaultValue_AttrEClass_upperBound && defaultValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonGeneralized_defaultValue_AttrEClass + " non-generalized and non-negated defaultValue(s). Only " + defaultValue_AttrEClass_upperBound + " non-generalized and non-negated defaultValue(s) are allowed.",new Object[] { this }));
		
		final int value_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_value_AttrEClass = 0;
		if(this.value_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.value_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_value_AttrEClass++;
		}
		if(nr_nonGeneralized_value_AttrEClass > value_AttrEClass_upperBound && value_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonGeneralized_value_AttrEClass + " non-generalized and non-negated value(s). Only " + value_AttrEClass_upperBound + " non-generalized and non-negated value(s) are allowed.",new Object[] { this }));
		
		final int attributeDataType_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_attributeDataType_AttrEClass = 0;
		if(this.attributeDataType_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.attributeDataType_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_attributeDataType_AttrEClass++;
		}
		if(nr_nonGeneralized_attributeDataType_AttrEClass > attributeDataType_AttrEClass_upperBound && attributeDataType_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonGeneralized_attributeDataType_AttrEClass + " non-generalized and non-negated attributeDataType(s). Only " + attributeDataType_AttrEClass_upperBound + " non-generalized and non-negated attributeDataType(s) are allowed.",new Object[] { this }));
		
		final int refAttributeType_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refAttributeType_AttrEClass = 0;
		if(this.refAttributeType_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refAttributeType_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refAttributeType_AttrEClass++;
		}
		if(nr_nonGeneralized_refAttributeType_AttrEClass > refAttributeType_AttrEClass_upperBound && refAttributeType_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonGeneralized_refAttributeType_AttrEClass + " non-generalized and non-negated refAttributeType(s). Only " + refAttributeType_AttrEClass_upperBound + " non-generalized and non-negated refAttributeType(s) are allowed.",new Object[] { this }));
		
		final int unit_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_unit_AttrEClass = 0;
		if(this.unit_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.unit_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_unit_AttrEClass++;
		}
		if(nr_nonGeneralized_unit_AttrEClass > unit_AttrEClass_upperBound && unit_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Attribute contains " + nr_nonGeneralized_unit_AttrEClass + " non-generalized and non-negated unit(s). Only " + unit_AttrEClass_upperBound + " non-generalized and non-negated unit(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return ((InternalEList<?>)getRefSemantic()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getDefaultValue_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getValue_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return ((InternalEList<?>)getAttributeDataType_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return ((InternalEList<?>)getRefAttributeType_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return ((InternalEList<?>)getUnit_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return getRefSemantic();
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return getConstraint();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return getDefaultValue_AttrEClass();
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return getValue_AttrEClass();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return getAttributeDataType_AttrEClass();
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return getRefAttributeType_AttrEClass();
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return getUnit_AttrEClass();
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				getRefSemantic().addAll((Collection<? extends RefSemantic_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends AttributeValueRequirement_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				getDefaultValue_AttrEClass().clear();
				getDefaultValue_AttrEClass().addAll((Collection<? extends Attribute_defaultValue_AttrEClass>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				getValue_AttrEClass().clear();
				getValue_AttrEClass().addAll((Collection<? extends Attribute_value_AttrEClass>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				getAttributeDataType_AttrEClass().clear();
				getAttributeDataType_AttrEClass().addAll((Collection<? extends Attribute_attributeDataType_AttrEClass>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				getRefAttributeType_AttrEClass().clear();
				getRefAttributeType_AttrEClass().addAll((Collection<? extends Attribute_refAttributeType_AttrEClass>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				getUnit_AttrEClass().clear();
				getUnit_AttrEClass().addAll((Collection<? extends Attribute_unit_AttrEClass>)newValue);
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				return;
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				getDefaultValue_AttrEClass().clear();
				return;
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				getValue_AttrEClass().clear();
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				getAttributeDataType_AttrEClass().clear();
				return;
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				getRefAttributeType_AttrEClass().clear();
				return;
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				getUnit_AttrEClass().clear();
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return refSemantic != null && !refSemantic.isEmpty();
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return defaultValue_AttrEClass != null && !defaultValue_AttrEClass.isEmpty();
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return value_AttrEClass != null && !value_AttrEClass.isEmpty();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return attributeDataType_AttrEClass != null && !attributeDataType_AttrEClass.isEmpty();
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return refAttributeType_AttrEClass != null && !refAttributeType_AttrEClass.isEmpty();
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return unit_AttrEClass != null && !unit_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeImpl
