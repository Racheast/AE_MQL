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

import qmm.Attribute_Containment_OrGroup;
import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.ExternalInterface_Containment_OrGroup;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.RoleClass;
import qmm.RoleClass_Containment_OrGroup;
import qmm.RoleClass_Reference_OrGroup;
import qmm.RoleClass_refBaseClassPath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RoleClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.RoleClassImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.impl.RoleClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.impl.RoleClassImpl#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link qmm.impl.RoleClassImpl#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleClassImpl extends CAEXObjectImpl implements RoleClass {
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
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_Containment_OrGroup> externalInterface;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass_Reference_OrGroup> baseClass;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass_Containment_OrGroup> roleClass;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath_AttrEClass() <em>Ref Base Class Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass_refBaseClassPath_AttrEClass> refBaseClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRoleClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Containment_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_Containment_OrGroup>(Attribute_Containment_OrGroup.class, this, QmmPackage.ROLE_CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_Containment_OrGroup> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<ExternalInterface_Containment_OrGroup>(ExternalInterface_Containment_OrGroup.class, this, QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass_Reference_OrGroup> getBaseClass() {
		if (baseClass == null) {
			baseClass = new EObjectContainmentEList<RoleClass_Reference_OrGroup>(RoleClass_Reference_OrGroup.class, this, QmmPackage.ROLE_CLASS__BASE_CLASS);
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass_Containment_OrGroup> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleClass_Containment_OrGroup>(RoleClass_Containment_OrGroup.class, this, QmmPackage.ROLE_CLASS__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass_refBaseClassPath_AttrEClass> getRefBaseClassPath_AttrEClass() {
		if (refBaseClassPath_AttrEClass == null) {
			refBaseClassPath_AttrEClass = new EObjectContainmentEList<RoleClass_refBaseClassPath_AttrEClass>(RoleClass_refBaseClassPath_AttrEClass.class, this, QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS);
		}
		return refBaseClassPath_AttrEClass;
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
		
		final int attribute_upperBound = -1;
		int nr_nonTransitive_attribute = 0;
		if(this.attribute != null){
				for(qmm.OrGroup og : this.attribute) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_attribute++;
		}
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RoleClass contains " + nr_nonTransitive_attribute + " non-transitive, non-negated and non-generalized attribute(s). Only " + attribute_upperBound + " non-transitive, non-negated and non-generalized attribute(s) are allowed.",new Object[] { this }));
		
		final int externalInterface_upperBound = -1;
		int nr_nonTransitive_externalInterface = 0;
		if(this.externalInterface != null){
				for(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_externalInterface++;
		}
		if(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RoleClass contains " + nr_nonTransitive_externalInterface + " non-transitive, non-negated and non-generalized externalInterface(s). Only " + externalInterface_upperBound + " non-transitive, non-negated and non-generalized externalInterface(s) are allowed.",new Object[] { this }));
		
		final int baseClass_upperBound = 1;
		int nr_nonTransitive_baseClass = 0;
		if(this.baseClass != null){
				for(qmm.OrGroup og : this.baseClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseClass++;
		}
		if(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RoleClass contains " + nr_nonTransitive_baseClass + " non-transitive, non-negated and non-generalized baseClass(s). Only " + baseClass_upperBound + " non-transitive, non-negated and non-generalized baseClass(s) are allowed.",new Object[] { this }));
		
		final int roleClass_upperBound = -1;
		int nr_nonTransitive_roleClass = 0;
		if(this.roleClass != null){
				for(qmm.OrGroup og : this.roleClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleClass++;
		}
		if(nr_nonTransitive_roleClass > roleClass_upperBound && roleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RoleClass contains " + nr_nonTransitive_roleClass + " non-transitive, non-negated and non-generalized roleClass(s). Only " + roleClass_upperBound + " non-transitive, non-negated and non-generalized roleClass(s) are allowed.",new Object[] { this }));
		
		final int refBaseClassPath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refBaseClassPath_AttrEClass = 0;
		if(this.refBaseClassPath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refBaseClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseClassPath_AttrEClass++;
		}
		if(nr_nonGeneralized_refBaseClassPath_AttrEClass > refBaseClassPath_AttrEClass_upperBound && refBaseClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RoleClass contains " + nr_nonGeneralized_refBaseClassPath_AttrEClass + " non-generalized and non-negated refBaseClassPath(s). Only " + refBaseClassPath_AttrEClass_upperBound + " non-generalized and non-negated refBaseClassPath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
				return ((InternalEList<?>)getBaseClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return ((InternalEList<?>)getRefBaseClassPath_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
				return getBaseClass();
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
				return getRoleClass();
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return getRefBaseClassPath_AttrEClass();
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
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends ExternalInterface_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
				getBaseClass().clear();
				getBaseClass().addAll((Collection<? extends RoleClass_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleClass_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				getRefBaseClassPath_AttrEClass().clear();
				getRefBaseClassPath_AttrEClass().addAll((Collection<? extends RoleClass_refBaseClassPath_AttrEClass>)newValue);
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
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
				getBaseClass().clear();
				return;
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				return;
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				getRefBaseClassPath_AttrEClass().clear();
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
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
				return baseClass != null && !baseClass.isEmpty();
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return refBaseClassPath_AttrEClass != null && !refBaseClassPath_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleClassImpl
