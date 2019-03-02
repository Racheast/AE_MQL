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

import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.UnknownType;
import qmm.UnknownType_requirements_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.UnknownTypeImpl#getRequirements_AttrEClass <em>Requirements Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownTypeImpl extends RootClassImpl implements UnknownType {
	/**
	 * The cached value of the '{@link #getRequirements_AttrEClass() <em>Requirements Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<UnknownType_requirements_AttrEClass> requirements_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getUnknownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnknownType_requirements_AttrEClass> getRequirements_AttrEClass() {
		if (requirements_AttrEClass == null) {
			requirements_AttrEClass = new EObjectContainmentEList<UnknownType_requirements_AttrEClass>(UnknownType_requirements_AttrEClass.class, this, QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS);
		}
		return requirements_AttrEClass;
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
		
		final int requirements_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_requirements_AttrEClass = 0;
		if(this.requirements_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.requirements_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requirements_AttrEClass++;
		}
		if(nr_nonGeneralized_requirements_AttrEClass > requirements_AttrEClass_upperBound && requirements_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "UnknownType contains " + nr_nonGeneralized_requirements_AttrEClass + " non-generalized and non-negated requirements(s). Only " + requirements_AttrEClass_upperBound + " non-generalized and non-negated requirements(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return ((InternalEList<?>)getRequirements_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return getRequirements_AttrEClass();
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				getRequirements_AttrEClass().clear();
				getRequirements_AttrEClass().addAll((Collection<? extends UnknownType_requirements_AttrEClass>)newValue);
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				getRequirements_AttrEClass().clear();
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return requirements_AttrEClass != null && !requirements_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.UNKNOWN_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.UNKNOWN_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UnknownTypeImpl
