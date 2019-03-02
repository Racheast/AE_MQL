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

import qmm.CAEXBasicObject;
import qmm.Mapping_Containment_OrGroup;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.RoleClass_Reference_OrGroup;
import qmm.SupportedRoleClass;
import qmm.SupportedRoleClass_refRoleClassPath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getRefRoleClassPath_AttrEClass <em>Ref Role Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedRoleClassImpl extends CAEXBasicObjectImpl implements SupportedRoleClass {
	/**
	 * The cached value of the '{@link #getMappingObject() <em>Mapping Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping_Containment_OrGroup> mappingObject;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass_Reference_OrGroup> roleClass;

	/**
	 * The cached value of the '{@link #getRefRoleClassPath_AttrEClass() <em>Ref Role Class Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoleClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedRoleClass_refRoleClassPath_AttrEClass> refRoleClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedRoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSupportedRoleClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping_Containment_OrGroup> getMappingObject() {
		if (mappingObject == null) {
			mappingObject = new EObjectContainmentEList<Mapping_Containment_OrGroup>(Mapping_Containment_OrGroup.class, this, QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT);
		}
		return mappingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass_Reference_OrGroup> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleClass_Reference_OrGroup>(RoleClass_Reference_OrGroup.class, this, QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedRoleClass_refRoleClassPath_AttrEClass> getRefRoleClassPath_AttrEClass() {
		if (refRoleClassPath_AttrEClass == null) {
			refRoleClassPath_AttrEClass = new EObjectContainmentEList<SupportedRoleClass_refRoleClassPath_AttrEClass>(SupportedRoleClass_refRoleClassPath_AttrEClass.class, this, QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS);
		}
		return refRoleClassPath_AttrEClass;
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
		
		final int mappingObject_upperBound = 1;
		int nr_nonTransitive_mappingObject = 0;
		if(this.mappingObject != null){
				for(qmm.OrGroup og : this.mappingObject) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_mappingObject++;
		}
		if(nr_nonTransitive_mappingObject > mappingObject_upperBound && mappingObject_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SupportedRoleClass contains " + nr_nonTransitive_mappingObject + " non-transitive, non-negated and non-generalized mappingObject(s). Only " + mappingObject_upperBound + " non-transitive, non-negated and non-generalized mappingObject(s) are allowed.",new Object[] { this }));
		
		final int roleClass_upperBound = 1;
		int nr_nonTransitive_roleClass = 0;
		if(this.roleClass != null){
				for(qmm.OrGroup og : this.roleClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleClass++;
		}
		if(nr_nonTransitive_roleClass > roleClass_upperBound && roleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SupportedRoleClass contains " + nr_nonTransitive_roleClass + " non-transitive, non-negated and non-generalized roleClass(s). Only " + roleClass_upperBound + " non-transitive, non-negated and non-generalized roleClass(s) are allowed.",new Object[] { this }));
		
		final int refRoleClassPath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refRoleClassPath_AttrEClass = 0;
		if(this.refRoleClassPath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refRoleClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refRoleClassPath_AttrEClass++;
		}
		if(nr_nonGeneralized_refRoleClassPath_AttrEClass > refRoleClassPath_AttrEClass_upperBound && refRoleClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SupportedRoleClass contains " + nr_nonGeneralized_refRoleClassPath_AttrEClass + " non-generalized and non-negated refRoleClassPath(s). Only " + refRoleClassPath_AttrEClass_upperBound + " non-generalized and non-negated refRoleClassPath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return ((InternalEList<?>)getMappingObject()).basicRemove(otherEnd, msgs);
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return ((InternalEList<?>)getRefRoleClassPath_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return getMappingObject();
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return getRoleClass();
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return getRefRoleClassPath_AttrEClass();
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				getMappingObject().clear();
				getMappingObject().addAll((Collection<? extends Mapping_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleClass_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				getRefRoleClassPath_AttrEClass().clear();
				getRefRoleClassPath_AttrEClass().addAll((Collection<? extends SupportedRoleClass_refRoleClassPath_AttrEClass>)newValue);
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				getMappingObject().clear();
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				getRefRoleClassPath_AttrEClass().clear();
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return mappingObject != null && !mappingObject.isEmpty();
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return refRoleClassPath_AttrEClass != null && !refRoleClassPath_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SUPPORTED_ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SUPPORTED_ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.SUPPORTED_ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SupportedRoleClassImpl
