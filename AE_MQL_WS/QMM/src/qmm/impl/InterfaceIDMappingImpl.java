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
import qmm.ExternalInterface_Reference_OrGroup;
import qmm.InterfaceIDMapping;
import qmm.InterfaceIDMapping_roleInterfaceID_AttrEClass;
import qmm.InterfaceIDMapping_systemUnitInterfaceID_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getRoleInterfaceID_AttrEClass <em>Role Interface ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getSystemUnitInterfaceID_AttrEClass <em>System Unit Interface ID Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceIDMappingImpl extends CAEXBasicObjectImpl implements InterfaceIDMapping {
	/**
	 * The cached value of the '{@link #getRoleInterface() <em>Role Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_Reference_OrGroup> roleInterface;

	/**
	 * The cached value of the '{@link #getSystemUnitInterface() <em>System Unit Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_Reference_OrGroup> systemUnitInterface;

	/**
	 * The cached value of the '{@link #getRoleInterfaceID_AttrEClass() <em>Role Interface ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceIDMapping_roleInterfaceID_AttrEClass> roleInterfaceID_AttrEClass;

	/**
	 * The cached value of the '{@link #getSystemUnitInterfaceID_AttrEClass() <em>System Unit Interface ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceIDMapping_systemUnitInterfaceID_AttrEClass> systemUnitInterfaceID_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceIDMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInterfaceIDMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_Reference_OrGroup> getRoleInterface() {
		if (roleInterface == null) {
			roleInterface = new EObjectContainmentEList<ExternalInterface_Reference_OrGroup>(ExternalInterface_Reference_OrGroup.class, this, QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE);
		}
		return roleInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_Reference_OrGroup> getSystemUnitInterface() {
		if (systemUnitInterface == null) {
			systemUnitInterface = new EObjectContainmentEList<ExternalInterface_Reference_OrGroup>(ExternalInterface_Reference_OrGroup.class, this, QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE);
		}
		return systemUnitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceIDMapping_roleInterfaceID_AttrEClass> getRoleInterfaceID_AttrEClass() {
		if (roleInterfaceID_AttrEClass == null) {
			roleInterfaceID_AttrEClass = new EObjectContainmentEList<InterfaceIDMapping_roleInterfaceID_AttrEClass>(InterfaceIDMapping_roleInterfaceID_AttrEClass.class, this, QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS);
		}
		return roleInterfaceID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceIDMapping_systemUnitInterfaceID_AttrEClass> getSystemUnitInterfaceID_AttrEClass() {
		if (systemUnitInterfaceID_AttrEClass == null) {
			systemUnitInterfaceID_AttrEClass = new EObjectContainmentEList<InterfaceIDMapping_systemUnitInterfaceID_AttrEClass>(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass.class, this, QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS);
		}
		return systemUnitInterfaceID_AttrEClass;
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
		
		final int roleInterface_upperBound = 1;
		int nr_nonTransitive_roleInterface = 0;
		if(this.roleInterface != null){
				for(qmm.OrGroup og : this.roleInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleInterface++;
		}
		if(nr_nonTransitive_roleInterface > roleInterface_upperBound && roleInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceIDMapping contains " + nr_nonTransitive_roleInterface + " non-transitive, non-negated and non-generalized roleInterface(s). Only " + roleInterface_upperBound + " non-transitive, non-negated and non-generalized roleInterface(s) are allowed.",new Object[] { this }));
		
		final int systemUnitInterface_upperBound = 1;
		int nr_nonTransitive_systemUnitInterface = 0;
		if(this.systemUnitInterface != null){
				for(qmm.OrGroup og : this.systemUnitInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitInterface++;
		}
		if(nr_nonTransitive_systemUnitInterface > systemUnitInterface_upperBound && systemUnitInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceIDMapping contains " + nr_nonTransitive_systemUnitInterface + " non-transitive, non-negated and non-generalized systemUnitInterface(s). Only " + systemUnitInterface_upperBound + " non-transitive, non-negated and non-generalized systemUnitInterface(s) are allowed.",new Object[] { this }));
		
		final int roleInterfaceID_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_roleInterfaceID_AttrEClass = 0;
		if(this.roleInterfaceID_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.roleInterfaceID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_roleInterfaceID_AttrEClass++;
		}
		if(nr_nonGeneralized_roleInterfaceID_AttrEClass > roleInterfaceID_AttrEClass_upperBound && roleInterfaceID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceIDMapping contains " + nr_nonGeneralized_roleInterfaceID_AttrEClass + " non-generalized and non-negated roleInterfaceID(s). Only " + roleInterfaceID_AttrEClass_upperBound + " non-generalized and non-negated roleInterfaceID(s) are allowed.",new Object[] { this }));
		
		final int systemUnitInterfaceID_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_systemUnitInterfaceID_AttrEClass = 0;
		if(this.systemUnitInterfaceID_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.systemUnitInterfaceID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_systemUnitInterfaceID_AttrEClass++;
		}
		if(nr_nonGeneralized_systemUnitInterfaceID_AttrEClass > systemUnitInterfaceID_AttrEClass_upperBound && systemUnitInterfaceID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceIDMapping contains " + nr_nonGeneralized_systemUnitInterfaceID_AttrEClass + " non-generalized and non-negated systemUnitInterfaceID(s). Only " + systemUnitInterfaceID_AttrEClass_upperBound + " non-generalized and non-negated systemUnitInterfaceID(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return ((InternalEList<?>)getRoleInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return ((InternalEList<?>)getSystemUnitInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return ((InternalEList<?>)getRoleInterfaceID_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return ((InternalEList<?>)getSystemUnitInterfaceID_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return getRoleInterface();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return getSystemUnitInterface();
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return getRoleInterfaceID_AttrEClass();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return getSystemUnitInterfaceID_AttrEClass();
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				getRoleInterface().clear();
				getRoleInterface().addAll((Collection<? extends ExternalInterface_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				getSystemUnitInterface().clear();
				getSystemUnitInterface().addAll((Collection<? extends ExternalInterface_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				getRoleInterfaceID_AttrEClass().clear();
				getRoleInterfaceID_AttrEClass().addAll((Collection<? extends InterfaceIDMapping_roleInterfaceID_AttrEClass>)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				getSystemUnitInterfaceID_AttrEClass().clear();
				getSystemUnitInterfaceID_AttrEClass().addAll((Collection<? extends InterfaceIDMapping_systemUnitInterfaceID_AttrEClass>)newValue);
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				getRoleInterface().clear();
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				getSystemUnitInterface().clear();
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				getRoleInterfaceID_AttrEClass().clear();
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				getSystemUnitInterfaceID_AttrEClass().clear();
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return roleInterface != null && !roleInterface.isEmpty();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return systemUnitInterface != null && !systemUnitInterface.isEmpty();
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return roleInterfaceID_AttrEClass != null && !roleInterfaceID_AttrEClass.isEmpty();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return systemUnitInterfaceID_AttrEClass != null && !systemUnitInterfaceID_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_ID_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_ID_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERFACE_ID_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceIDMappingImpl
