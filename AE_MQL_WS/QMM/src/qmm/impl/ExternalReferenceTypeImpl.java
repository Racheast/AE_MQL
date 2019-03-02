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
import qmm.ExternalReferenceType;
import qmm.ExternalReferenceType_alias_AttrEClass;
import qmm.ExternalReferenceType_path_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ExternalReferenceTypeImpl#getAlias_AttrEClass <em>Alias Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.ExternalReferenceTypeImpl#getPath_AttrEClass <em>Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalReferenceTypeImpl extends CAEXBasicObjectImpl implements ExternalReferenceType {
	/**
	 * The cached value of the '{@link #getAlias_AttrEClass() <em>Alias Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType_alias_AttrEClass> alias_AttrEClass;

	/**
	 * The cached value of the '{@link #getPath_AttrEClass() <em>Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType_path_AttrEClass> path_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getExternalReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType_alias_AttrEClass> getAlias_AttrEClass() {
		if (alias_AttrEClass == null) {
			alias_AttrEClass = new EObjectContainmentEList<ExternalReferenceType_alias_AttrEClass>(ExternalReferenceType_alias_AttrEClass.class, this, QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS);
		}
		return alias_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType_path_AttrEClass> getPath_AttrEClass() {
		if (path_AttrEClass == null) {
			path_AttrEClass = new EObjectContainmentEList<ExternalReferenceType_path_AttrEClass>(ExternalReferenceType_path_AttrEClass.class, this, QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS);
		}
		return path_AttrEClass;
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
		
		final int alias_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_alias_AttrEClass = 0;
		if(this.alias_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.alias_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_alias_AttrEClass++;
		}
		if(nr_nonGeneralized_alias_AttrEClass > alias_AttrEClass_upperBound && alias_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "ExternalReferenceType contains " + nr_nonGeneralized_alias_AttrEClass + " non-generalized and non-negated alias(s). Only " + alias_AttrEClass_upperBound + " non-generalized and non-negated alias(s) are allowed.",new Object[] { this }));
		
		final int path_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_path_AttrEClass = 0;
		if(this.path_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.path_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_path_AttrEClass++;
		}
		if(nr_nonGeneralized_path_AttrEClass > path_AttrEClass_upperBound && path_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "ExternalReferenceType contains " + nr_nonGeneralized_path_AttrEClass + " non-generalized and non-negated path(s). Only " + path_AttrEClass_upperBound + " non-generalized and non-negated path(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return ((InternalEList<?>)getAlias_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return ((InternalEList<?>)getPath_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return getAlias_AttrEClass();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return getPath_AttrEClass();
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				getAlias_AttrEClass().clear();
				getAlias_AttrEClass().addAll((Collection<? extends ExternalReferenceType_alias_AttrEClass>)newValue);
				return;
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				getPath_AttrEClass().clear();
				getPath_AttrEClass().addAll((Collection<? extends ExternalReferenceType_path_AttrEClass>)newValue);
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				getAlias_AttrEClass().clear();
				return;
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				getPath_AttrEClass().clear();
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return alias_AttrEClass != null && !alias_AttrEClass.isEmpty();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return path_AttrEClass != null && !path_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXTERNAL_REFERENCE_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXTERNAL_REFERENCE_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalReferenceTypeImpl
