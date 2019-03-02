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
import qmm.CAEXObject_iD_AttrEClass;
import qmm.CAEXObject_name_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CAEXObjectImpl#getID_AttrEClass <em>ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CAEXObjectImpl#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXObjectImpl extends CAEXBasicObjectImpl implements CAEXObject {
	/**
	 * The cached value of the '{@link #getID_AttrEClass() <em>ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<CAEXObject_iD_AttrEClass> iD_AttrEClass;

	/**
	 * The cached value of the '{@link #getName_AttrEClass() <em>Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<CAEXObject_name_AttrEClass> name_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCAEXObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CAEXObject_iD_AttrEClass> getID_AttrEClass() {
		if (iD_AttrEClass == null) {
			iD_AttrEClass = new EObjectContainmentEList<CAEXObject_iD_AttrEClass>(CAEXObject_iD_AttrEClass.class, this, QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS);
		}
		return iD_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CAEXObject_name_AttrEClass> getName_AttrEClass() {
		if (name_AttrEClass == null) {
			name_AttrEClass = new EObjectContainmentEList<CAEXObject_name_AttrEClass>(CAEXObject_name_AttrEClass.class, this, QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS);
		}
		return name_AttrEClass;
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
		
		final int iD_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_iD_AttrEClass = 0;
		if(this.iD_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.iD_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_iD_AttrEClass++;
		}
		if(nr_nonGeneralized_iD_AttrEClass > iD_AttrEClass_upperBound && iD_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXObject contains " + nr_nonGeneralized_iD_AttrEClass + " non-generalized and non-negated iD(s). Only " + iD_AttrEClass_upperBound + " non-generalized and non-negated iD(s) are allowed.",new Object[] { this }));
		
		final int name_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_name_AttrEClass = 0;
		if(this.name_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.name_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_name_AttrEClass++;
		}
		if(nr_nonGeneralized_name_AttrEClass > name_AttrEClass_upperBound && name_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXObject contains " + nr_nonGeneralized_name_AttrEClass + " non-generalized and non-negated name(s). Only " + name_AttrEClass_upperBound + " non-generalized and non-negated name(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return ((InternalEList<?>)getID_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getName_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return getID_AttrEClass();
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				return getName_AttrEClass();
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				getID_AttrEClass().clear();
				getID_AttrEClass().addAll((Collection<? extends CAEXObject_iD_AttrEClass>)newValue);
				return;
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				getName_AttrEClass().clear();
				getName_AttrEClass().addAll((Collection<? extends CAEXObject_name_AttrEClass>)newValue);
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				getID_AttrEClass().clear();
				return;
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				getName_AttrEClass().clear();
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return iD_AttrEClass != null && !iD_AttrEClass.isEmpty();
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				return name_AttrEClass != null && !name_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CAEXObjectImpl
