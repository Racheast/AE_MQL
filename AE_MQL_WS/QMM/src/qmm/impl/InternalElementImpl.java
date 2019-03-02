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
import qmm.CAEXObject;
import qmm.InternalElement;
import qmm.InternalElement_refBaseSystemUnitPath_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.RoleRequirements_Containment_OrGroup;
import qmm.SystemUnitClass;
import qmm.SystemUnitClass_Reference_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InternalElementImpl#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link qmm.impl.InternalElementImpl#getBaseSystemUnit <em>Base System Unit</em>}</li>
 *   <li>{@link qmm.impl.InternalElementImpl#getRefBaseSystemUnitPath_AttrEClass <em>Ref Base System Unit Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalElementImpl extends SystemUnitClassImpl implements InternalElement {
	/**
	 * The cached value of the '{@link #getRoleRequirements() <em>Role Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleRequirements_Containment_OrGroup> roleRequirements;

	/**
	 * The cached value of the '{@link #getBaseSystemUnit() <em>Base System Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSystemUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_Reference_OrGroup> baseSystemUnit;

	/**
	 * The cached value of the '{@link #getRefBaseSystemUnitPath_AttrEClass() <em>Ref Base System Unit Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalElement_refBaseSystemUnitPath_AttrEClass> refBaseSystemUnitPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleRequirements_Containment_OrGroup> getRoleRequirements() {
		if (roleRequirements == null) {
			roleRequirements = new EObjectContainmentEList<RoleRequirements_Containment_OrGroup>(RoleRequirements_Containment_OrGroup.class, this, QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS);
		}
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_Reference_OrGroup> getBaseSystemUnit() {
		if (baseSystemUnit == null) {
			baseSystemUnit = new EObjectContainmentEList<SystemUnitClass_Reference_OrGroup>(SystemUnitClass_Reference_OrGroup.class, this, QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT);
		}
		return baseSystemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalElement_refBaseSystemUnitPath_AttrEClass> getRefBaseSystemUnitPath_AttrEClass() {
		if (refBaseSystemUnitPath_AttrEClass == null) {
			refBaseSystemUnitPath_AttrEClass = new EObjectContainmentEList<InternalElement_refBaseSystemUnitPath_AttrEClass>(InternalElement_refBaseSystemUnitPath_AttrEClass.class, this, QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS);
		}
		return refBaseSystemUnitPath_AttrEClass;
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
		
		final int roleRequirements_upperBound = -1;
		int nr_nonTransitive_roleRequirements = 0;
		if(this.roleRequirements != null){
				for(qmm.OrGroup og : this.roleRequirements) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_roleRequirements++;
		}
		if(nr_nonTransitive_roleRequirements > roleRequirements_upperBound && roleRequirements_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalElement contains " + nr_nonTransitive_roleRequirements + " non-transitive, non-negated and non-generalized roleRequirements(s). Only " + roleRequirements_upperBound + " non-transitive, non-negated and non-generalized roleRequirements(s) are allowed.",new Object[] { this }));
		
		final int baseSystemUnit_upperBound = 1;
		int nr_nonTransitive_baseSystemUnit = 0;
		if(this.baseSystemUnit != null){
				for(qmm.OrGroup og : this.baseSystemUnit) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseSystemUnit++;
		}
		if(nr_nonTransitive_baseSystemUnit > baseSystemUnit_upperBound && baseSystemUnit_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalElement contains " + nr_nonTransitive_baseSystemUnit + " non-transitive, non-negated and non-generalized baseSystemUnit(s). Only " + baseSystemUnit_upperBound + " non-transitive, non-negated and non-generalized baseSystemUnit(s) are allowed.",new Object[] { this }));
		
		final int refBaseSystemUnitPath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass = 0;
		if(this.refBaseSystemUnitPath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refBaseSystemUnitPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass++;
		}
		if(nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass > refBaseSystemUnitPath_AttrEClass_upperBound && refBaseSystemUnitPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalElement contains " + nr_nonGeneralized_refBaseSystemUnitPath_AttrEClass + " non-generalized and non-negated refBaseSystemUnitPath(s). Only " + refBaseSystemUnitPath_AttrEClass_upperBound + " non-generalized and non-negated refBaseSystemUnitPath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return ((InternalEList<?>)getRoleRequirements()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return ((InternalEList<?>)getBaseSystemUnit()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return ((InternalEList<?>)getRefBaseSystemUnitPath_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return getRoleRequirements();
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return getBaseSystemUnit();
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return getRefBaseSystemUnitPath_AttrEClass();
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				getRoleRequirements().addAll((Collection<? extends RoleRequirements_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				getBaseSystemUnit().clear();
				getBaseSystemUnit().addAll((Collection<? extends SystemUnitClass_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				getRefBaseSystemUnitPath_AttrEClass().clear();
				getRefBaseSystemUnitPath_AttrEClass().addAll((Collection<? extends InternalElement_refBaseSystemUnitPath_AttrEClass>)newValue);
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				return;
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				getBaseSystemUnit().clear();
				return;
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				getRefBaseSystemUnitPath_AttrEClass().clear();
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return roleRequirements != null && !roleRequirements.isEmpty();
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return baseSystemUnit != null && !baseSystemUnit.isEmpty();
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return refBaseSystemUnitPath_AttrEClass != null && !refBaseSystemUnitPath_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SystemUnitClass.class) {
			switch (baseOperationID) {
				case QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalElementImpl
