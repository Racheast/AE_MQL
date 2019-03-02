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

import qmm.AttributeNameMapping;
import qmm.AttributeNameMapping_roleAttributeName_AttrEClass;
import qmm.AttributeNameMapping_systemUnitAttributeName_AttrEClass;
import qmm.Attribute_Reference_OrGroup;
import qmm.CAEXBasicObject;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeNameMappingImpl#getRoleAttribute <em>Role Attribute</em>}</li>
 *   <li>{@link qmm.impl.AttributeNameMappingImpl#getSystemUnitAttribute <em>System Unit Attribute</em>}</li>
 *   <li>{@link qmm.impl.AttributeNameMappingImpl#getRoleAttributeName_AttrEClass <em>Role Attribute Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeNameMappingImpl#getSystemUnitAttributeName_AttrEClass <em>System Unit Attribute Name Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeNameMappingImpl extends CAEXBasicObjectImpl implements AttributeNameMapping {
	/**
	 * The cached value of the '{@link #getRoleAttribute() <em>Role Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_Reference_OrGroup> roleAttribute;

	/**
	 * The cached value of the '{@link #getSystemUnitAttribute() <em>System Unit Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_Reference_OrGroup> systemUnitAttribute;

	/**
	 * The cached value of the '{@link #getRoleAttributeName_AttrEClass() <em>Role Attribute Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAttributeName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeNameMapping_roleAttributeName_AttrEClass> roleAttributeName_AttrEClass;

	/**
	 * The cached value of the '{@link #getSystemUnitAttributeName_AttrEClass() <em>System Unit Attribute Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitAttributeName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeNameMapping_systemUnitAttributeName_AttrEClass> systemUnitAttributeName_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeNameMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAttributeNameMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Reference_OrGroup> getRoleAttribute() {
		if (roleAttribute == null) {
			roleAttribute = new EObjectContainmentEList<Attribute_Reference_OrGroup>(Attribute_Reference_OrGroup.class, this, QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE);
		}
		return roleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Reference_OrGroup> getSystemUnitAttribute() {
		if (systemUnitAttribute == null) {
			systemUnitAttribute = new EObjectContainmentEList<Attribute_Reference_OrGroup>(Attribute_Reference_OrGroup.class, this, QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE);
		}
		return systemUnitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeNameMapping_roleAttributeName_AttrEClass> getRoleAttributeName_AttrEClass() {
		if (roleAttributeName_AttrEClass == null) {
			roleAttributeName_AttrEClass = new EObjectContainmentEList<AttributeNameMapping_roleAttributeName_AttrEClass>(AttributeNameMapping_roleAttributeName_AttrEClass.class, this, QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS);
		}
		return roleAttributeName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeNameMapping_systemUnitAttributeName_AttrEClass> getSystemUnitAttributeName_AttrEClass() {
		if (systemUnitAttributeName_AttrEClass == null) {
			systemUnitAttributeName_AttrEClass = new EObjectContainmentEList<AttributeNameMapping_systemUnitAttributeName_AttrEClass>(AttributeNameMapping_systemUnitAttributeName_AttrEClass.class, this, QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS);
		}
		return systemUnitAttributeName_AttrEClass;
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
		
		final int roleAttribute_upperBound = 1;
		int nr_nonTransitive_roleAttribute = 0;
		if(this.roleAttribute != null){
				for(qmm.OrGroup og : this.roleAttribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleAttribute++;
		}
		if(nr_nonTransitive_roleAttribute > roleAttribute_upperBound && roleAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "AttributeNameMapping contains " + nr_nonTransitive_roleAttribute + " non-transitive, non-negated and non-generalized roleAttribute(s). Only " + roleAttribute_upperBound + " non-transitive, non-negated and non-generalized roleAttribute(s) are allowed.",new Object[] { this }));
		
		final int systemUnitAttribute_upperBound = 1;
		int nr_nonTransitive_systemUnitAttribute = 0;
		if(this.systemUnitAttribute != null){
				for(qmm.OrGroup og : this.systemUnitAttribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitAttribute++;
		}
		if(nr_nonTransitive_systemUnitAttribute > systemUnitAttribute_upperBound && systemUnitAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "AttributeNameMapping contains " + nr_nonTransitive_systemUnitAttribute + " non-transitive, non-negated and non-generalized systemUnitAttribute(s). Only " + systemUnitAttribute_upperBound + " non-transitive, non-negated and non-generalized systemUnitAttribute(s) are allowed.",new Object[] { this }));
		
		final int roleAttributeName_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_roleAttributeName_AttrEClass = 0;
		if(this.roleAttributeName_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.roleAttributeName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_roleAttributeName_AttrEClass++;
		}
		if(nr_nonGeneralized_roleAttributeName_AttrEClass > roleAttributeName_AttrEClass_upperBound && roleAttributeName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "AttributeNameMapping contains " + nr_nonGeneralized_roleAttributeName_AttrEClass + " non-generalized and non-negated roleAttributeName(s). Only " + roleAttributeName_AttrEClass_upperBound + " non-generalized and non-negated roleAttributeName(s) are allowed.",new Object[] { this }));
		
		final int systemUnitAttributeName_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_systemUnitAttributeName_AttrEClass = 0;
		if(this.systemUnitAttributeName_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.systemUnitAttributeName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_systemUnitAttributeName_AttrEClass++;
		}
		if(nr_nonGeneralized_systemUnitAttributeName_AttrEClass > systemUnitAttributeName_AttrEClass_upperBound && systemUnitAttributeName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "AttributeNameMapping contains " + nr_nonGeneralized_systemUnitAttributeName_AttrEClass + " non-generalized and non-negated systemUnitAttributeName(s). Only " + systemUnitAttributeName_AttrEClass_upperBound + " non-generalized and non-negated systemUnitAttributeName(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				return ((InternalEList<?>)getRoleAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				return ((InternalEList<?>)getSystemUnitAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getRoleAttributeName_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getSystemUnitAttributeName_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				return getRoleAttribute();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				return getSystemUnitAttribute();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				return getRoleAttributeName_AttrEClass();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				return getSystemUnitAttributeName_AttrEClass();
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				getRoleAttribute().clear();
				getRoleAttribute().addAll((Collection<? extends Attribute_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				getSystemUnitAttribute().clear();
				getSystemUnitAttribute().addAll((Collection<? extends Attribute_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				getRoleAttributeName_AttrEClass().clear();
				getRoleAttributeName_AttrEClass().addAll((Collection<? extends AttributeNameMapping_roleAttributeName_AttrEClass>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				getSystemUnitAttributeName_AttrEClass().clear();
				getSystemUnitAttributeName_AttrEClass().addAll((Collection<? extends AttributeNameMapping_systemUnitAttributeName_AttrEClass>)newValue);
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				getRoleAttribute().clear();
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				getSystemUnitAttribute().clear();
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				getRoleAttributeName_AttrEClass().clear();
				return;
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				getSystemUnitAttributeName_AttrEClass().clear();
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				return roleAttribute != null && !roleAttribute.isEmpty();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				return systemUnitAttribute != null && !systemUnitAttribute.isEmpty();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				return roleAttributeName_AttrEClass != null && !roleAttributeName_AttrEClass.isEmpty();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				return systemUnitAttributeName_AttrEClass != null && !systemUnitAttributeName_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE_NAME_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE_NAME_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ATTRIBUTE_NAME_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeNameMappingImpl
