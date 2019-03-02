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
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.RefSemantic;
import qmm.RefSemantic_correspondingAttributePath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Semantic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RefSemanticImpl#getCorrespondingAttributePath_AttrEClass <em>Corresponding Attribute Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefSemanticImpl extends CAEXBasicObjectImpl implements RefSemantic {
	/**
	 * The cached value of the '{@link #getCorrespondingAttributePath_AttrEClass() <em>Corresponding Attribute Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingAttributePath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSemantic_correspondingAttributePath_AttrEClass> correspondingAttributePath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefSemanticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRefSemantic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSemantic_correspondingAttributePath_AttrEClass> getCorrespondingAttributePath_AttrEClass() {
		if (correspondingAttributePath_AttrEClass == null) {
			correspondingAttributePath_AttrEClass = new EObjectContainmentEList<RefSemantic_correspondingAttributePath_AttrEClass>(RefSemantic_correspondingAttributePath_AttrEClass.class, this, QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS);
		}
		return correspondingAttributePath_AttrEClass;
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
		
		final int correspondingAttributePath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_correspondingAttributePath_AttrEClass = 0;
		if(this.correspondingAttributePath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.correspondingAttributePath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_correspondingAttributePath_AttrEClass++;
		}
		if(nr_nonGeneralized_correspondingAttributePath_AttrEClass > correspondingAttributePath_AttrEClass_upperBound && correspondingAttributePath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "RefSemantic contains " + nr_nonGeneralized_correspondingAttributePath_AttrEClass + " non-generalized and non-negated correspondingAttributePath(s). Only " + correspondingAttributePath_AttrEClass_upperBound + " non-generalized and non-negated correspondingAttributePath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return ((InternalEList<?>)getCorrespondingAttributePath_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return getCorrespondingAttributePath_AttrEClass();
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				getCorrespondingAttributePath_AttrEClass().clear();
				getCorrespondingAttributePath_AttrEClass().addAll((Collection<? extends RefSemantic_correspondingAttributePath_AttrEClass>)newValue);
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				getCorrespondingAttributePath_AttrEClass().clear();
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return correspondingAttributePath_AttrEClass != null && !correspondingAttributePath_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REF_SEMANTIC___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REF_SEMANTIC___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.REF_SEMANTIC___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RefSemanticImpl
