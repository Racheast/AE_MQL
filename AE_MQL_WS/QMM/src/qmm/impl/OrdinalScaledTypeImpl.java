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
import qmm.OrdinalScaledType;
import qmm.OrdinalScaledType_requiredMaxValue_AttrEClass;
import qmm.OrdinalScaledType_requiredMinValue_AttrEClass;
import qmm.OrdinalScaledType_requiredValue_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredMaxValue_AttrEClass <em>Required Max Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredMinValue_AttrEClass <em>Required Min Value Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrdinalScaledTypeImpl extends RootClassImpl implements OrdinalScaledType {
	/**
	 * The cached value of the '{@link #getRequiredMaxValue_AttrEClass() <em>Required Max Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMaxValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OrdinalScaledType_requiredMaxValue_AttrEClass> requiredMaxValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getRequiredValue_AttrEClass() <em>Required Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OrdinalScaledType_requiredValue_AttrEClass> requiredValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getRequiredMinValue_AttrEClass() <em>Required Min Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMinValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OrdinalScaledType_requiredMinValue_AttrEClass> requiredMinValue_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinalScaledTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getOrdinalScaledType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrdinalScaledType_requiredMaxValue_AttrEClass> getRequiredMaxValue_AttrEClass() {
		if (requiredMaxValue_AttrEClass == null) {
			requiredMaxValue_AttrEClass = new EObjectContainmentEList<OrdinalScaledType_requiredMaxValue_AttrEClass>(OrdinalScaledType_requiredMaxValue_AttrEClass.class, this, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS);
		}
		return requiredMaxValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrdinalScaledType_requiredValue_AttrEClass> getRequiredValue_AttrEClass() {
		if (requiredValue_AttrEClass == null) {
			requiredValue_AttrEClass = new EObjectContainmentEList<OrdinalScaledType_requiredValue_AttrEClass>(OrdinalScaledType_requiredValue_AttrEClass.class, this, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS);
		}
		return requiredValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrdinalScaledType_requiredMinValue_AttrEClass> getRequiredMinValue_AttrEClass() {
		if (requiredMinValue_AttrEClass == null) {
			requiredMinValue_AttrEClass = new EObjectContainmentEList<OrdinalScaledType_requiredMinValue_AttrEClass>(OrdinalScaledType_requiredMinValue_AttrEClass.class, this, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS);
		}
		return requiredMinValue_AttrEClass;
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
		
		final int requiredMaxValue_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_requiredMaxValue_AttrEClass = 0;
		if(this.requiredMaxValue_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.requiredMaxValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredMaxValue_AttrEClass++;
		}
		if(nr_nonGeneralized_requiredMaxValue_AttrEClass > requiredMaxValue_AttrEClass_upperBound && requiredMaxValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "OrdinalScaledType contains " + nr_nonGeneralized_requiredMaxValue_AttrEClass + " non-generalized and non-negated requiredMaxValue(s). Only " + requiredMaxValue_AttrEClass_upperBound + " non-generalized and non-negated requiredMaxValue(s) are allowed.",new Object[] { this }));
		
		final int requiredValue_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_requiredValue_AttrEClass = 0;
		if(this.requiredValue_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.requiredValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredValue_AttrEClass++;
		}
		if(nr_nonGeneralized_requiredValue_AttrEClass > requiredValue_AttrEClass_upperBound && requiredValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "OrdinalScaledType contains " + nr_nonGeneralized_requiredValue_AttrEClass + " non-generalized and non-negated requiredValue(s). Only " + requiredValue_AttrEClass_upperBound + " non-generalized and non-negated requiredValue(s) are allowed.",new Object[] { this }));
		
		final int requiredMinValue_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_requiredMinValue_AttrEClass = 0;
		if(this.requiredMinValue_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.requiredMinValue_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_requiredMinValue_AttrEClass++;
		}
		if(nr_nonGeneralized_requiredMinValue_AttrEClass > requiredMinValue_AttrEClass_upperBound && requiredMinValue_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "OrdinalScaledType contains " + nr_nonGeneralized_requiredMinValue_AttrEClass + " non-generalized and non-negated requiredMinValue(s). Only " + requiredMinValue_AttrEClass_upperBound + " non-generalized and non-negated requiredMinValue(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getRequiredMaxValue_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getRequiredValue_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getRequiredMinValue_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return getRequiredMaxValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return getRequiredValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return getRequiredMinValue_AttrEClass();
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				getRequiredMaxValue_AttrEClass().clear();
				getRequiredMaxValue_AttrEClass().addAll((Collection<? extends OrdinalScaledType_requiredMaxValue_AttrEClass>)newValue);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				getRequiredValue_AttrEClass().clear();
				getRequiredValue_AttrEClass().addAll((Collection<? extends OrdinalScaledType_requiredValue_AttrEClass>)newValue);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				getRequiredMinValue_AttrEClass().clear();
				getRequiredMinValue_AttrEClass().addAll((Collection<? extends OrdinalScaledType_requiredMinValue_AttrEClass>)newValue);
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				getRequiredMaxValue_AttrEClass().clear();
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				getRequiredValue_AttrEClass().clear();
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				getRequiredMinValue_AttrEClass().clear();
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return requiredMaxValue_AttrEClass != null && !requiredMaxValue_AttrEClass.isEmpty();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return requiredValue_AttrEClass != null && !requiredValue_AttrEClass.isEmpty();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return requiredMinValue_AttrEClass != null && !requiredMinValue_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ORDINAL_SCALED_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ORDINAL_SCALED_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrdinalScaledTypeImpl
