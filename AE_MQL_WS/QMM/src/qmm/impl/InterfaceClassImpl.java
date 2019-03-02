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
import qmm.InterfaceClass;
import qmm.InterfaceClass_Containment_OrGroup;
import qmm.InterfaceClass_Reference_OrGroup;
import qmm.InterfaceClass_refBaseClassPath_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InterfaceClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.InterfaceClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.impl.InterfaceClassImpl#getInterfaceClass <em>Interface Class</em>}</li>
 *   <li>{@link qmm.impl.InterfaceClassImpl#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceClassImpl extends CAEXObjectImpl implements InterfaceClass {
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
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass_Reference_OrGroup> baseClass;

	/**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass_Containment_OrGroup> interfaceClass;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath_AttrEClass() <em>Ref Base Class Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass_refBaseClassPath_AttrEClass> refBaseClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInterfaceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Containment_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_Containment_OrGroup>(Attribute_Containment_OrGroup.class, this, QmmPackage.INTERFACE_CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass_Reference_OrGroup> getBaseClass() {
		if (baseClass == null) {
			baseClass = new EObjectContainmentEList<InterfaceClass_Reference_OrGroup>(InterfaceClass_Reference_OrGroup.class, this, QmmPackage.INTERFACE_CLASS__BASE_CLASS);
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass_Containment_OrGroup> getInterfaceClass() {
		if (interfaceClass == null) {
			interfaceClass = new EObjectContainmentEList<InterfaceClass_Containment_OrGroup>(InterfaceClass_Containment_OrGroup.class, this, QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS);
		}
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass_refBaseClassPath_AttrEClass> getRefBaseClassPath_AttrEClass() {
		if (refBaseClassPath_AttrEClass == null) {
			refBaseClassPath_AttrEClass = new EObjectContainmentEList<InterfaceClass_refBaseClassPath_AttrEClass>(InterfaceClass_refBaseClassPath_AttrEClass.class, this, QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS);
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
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceClass contains " + nr_nonTransitive_attribute + " non-transitive, non-negated and non-generalized attribute(s). Only " + attribute_upperBound + " non-transitive, non-negated and non-generalized attribute(s) are allowed.",new Object[] { this }));
		
		final int baseClass_upperBound = 1;
		int nr_nonTransitive_baseClass = 0;
		if(this.baseClass != null){
				for(qmm.OrGroup og : this.baseClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseClass++;
		}
		if(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceClass contains " + nr_nonTransitive_baseClass + " non-transitive, non-negated and non-generalized baseClass(s). Only " + baseClass_upperBound + " non-transitive, non-negated and non-generalized baseClass(s) are allowed.",new Object[] { this }));
		
		final int interfaceClass_upperBound = -1;
		int nr_nonTransitive_interfaceClass = 0;
		if(this.interfaceClass != null){
				for(qmm.OrGroup og : this.interfaceClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_interfaceClass++;
		}
		if(nr_nonTransitive_interfaceClass > interfaceClass_upperBound && interfaceClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceClass contains " + nr_nonTransitive_interfaceClass + " non-transitive, non-negated and non-generalized interfaceClass(s). Only " + interfaceClass_upperBound + " non-transitive, non-negated and non-generalized interfaceClass(s) are allowed.",new Object[] { this }));
		
		final int refBaseClassPath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refBaseClassPath_AttrEClass = 0;
		if(this.refBaseClassPath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refBaseClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseClassPath_AttrEClass++;
		}
		if(nr_nonGeneralized_refBaseClassPath_AttrEClass > refBaseClassPath_AttrEClass_upperBound && refBaseClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InterfaceClass contains " + nr_nonGeneralized_refBaseClassPath_AttrEClass + " non-generalized and non-negated refBaseClassPath(s). Only " + refBaseClassPath_AttrEClass_upperBound + " non-generalized and non-negated refBaseClassPath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERFACE_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_CLASS__BASE_CLASS:
				return ((InternalEList<?>)getBaseClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return ((InternalEList<?>)getInterfaceClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.INTERFACE_CLASS__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.INTERFACE_CLASS__BASE_CLASS:
				return getBaseClass();
			case QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return getInterfaceClass();
			case QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.INTERFACE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_CLASS__BASE_CLASS:
				getBaseClass().clear();
				getBaseClass().addAll((Collection<? extends InterfaceClass_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				getInterfaceClass().clear();
				getInterfaceClass().addAll((Collection<? extends InterfaceClass_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				getRefBaseClassPath_AttrEClass().clear();
				getRefBaseClassPath_AttrEClass().addAll((Collection<? extends InterfaceClass_refBaseClassPath_AttrEClass>)newValue);
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
			case QmmPackage.INTERFACE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.INTERFACE_CLASS__BASE_CLASS:
				getBaseClass().clear();
				return;
			case QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				getInterfaceClass().clear();
				return;
			case QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.INTERFACE_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.INTERFACE_CLASS__BASE_CLASS:
				return baseClass != null && !baseClass.isEmpty();
			case QmmPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return interfaceClass != null && !interfaceClass.isEmpty();
			case QmmPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERFACE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceClassImpl
