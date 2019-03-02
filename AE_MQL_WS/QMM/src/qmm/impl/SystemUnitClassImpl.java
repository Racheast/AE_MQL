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
import qmm.InterfaceClass_Containment_OrGroup;
import qmm.InternalElement_Containment_OrGroup;
import qmm.InternalLink_Containment_OrGroup;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.SupportedRoleClass_Containment_OrGroup;
import qmm.SystemUnitClass;
import qmm.SystemUnitClass_Containment_OrGroup;
import qmm.SystemUnitClass_Reference_OrGroup;
import qmm.SystemUnitClass_refBaseClassPath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getInternalLink <em>Internal Link</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitClassImpl extends CAEXObjectImpl implements SystemUnitClass {
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
	protected EList<InterfaceClass_Containment_OrGroup> externalInterface;

	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalElement_Containment_OrGroup> internalElement;

	/**
	 * The cached value of the '{@link #getSupportedRoleClass() <em>Supported Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedRoleClass_Containment_OrGroup> supportedRoleClass;

	/**
	 * The cached value of the '{@link #getInternalLink() <em>Internal Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLink()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink_Containment_OrGroup> internalLink;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_Reference_OrGroup> baseClass;

	/**
	 * The cached value of the '{@link #getSystemUnitClass() <em>System Unit Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_Containment_OrGroup> systemUnitClass;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath_AttrEClass() <em>Ref Base Class Path Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_refBaseClassPath_AttrEClass> refBaseClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSystemUnitClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Containment_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_Containment_OrGroup>(Attribute_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass_Containment_OrGroup> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass_Containment_OrGroup>(InterfaceClass_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalElement_Containment_OrGroup> getInternalElement() {
		if (internalElement == null) {
			internalElement = new EObjectContainmentEList<InternalElement_Containment_OrGroup>(InternalElement_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
		}
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedRoleClass_Containment_OrGroup> getSupportedRoleClass() {
		if (supportedRoleClass == null) {
			supportedRoleClass = new EObjectContainmentEList<SupportedRoleClass_Containment_OrGroup>(SupportedRoleClass_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
		}
		return supportedRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink_Containment_OrGroup> getInternalLink() {
		if (internalLink == null) {
			internalLink = new EObjectContainmentEList<InternalLink_Containment_OrGroup>(InternalLink_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK);
		}
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_Reference_OrGroup> getBaseClass() {
		if (baseClass == null) {
			baseClass = new EObjectContainmentEList<SystemUnitClass_Reference_OrGroup>(SystemUnitClass_Reference_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS);
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_Containment_OrGroup> getSystemUnitClass() {
		if (systemUnitClass == null) {
			systemUnitClass = new EObjectContainmentEList<SystemUnitClass_Containment_OrGroup>(SystemUnitClass_Containment_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS);
		}
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_refBaseClassPath_AttrEClass> getRefBaseClassPath_AttrEClass() {
		if (refBaseClassPath_AttrEClass == null) {
			refBaseClassPath_AttrEClass = new EObjectContainmentEList<SystemUnitClass_refBaseClassPath_AttrEClass>(SystemUnitClass_refBaseClassPath_AttrEClass.class, this, QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS);
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
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_attribute + " non-transitive, non-negated and non-generalized attribute(s). Only " + attribute_upperBound + " non-transitive, non-negated and non-generalized attribute(s) are allowed.",new Object[] { this }));
		
		final int externalInterface_upperBound = -1;
		int nr_nonTransitive_externalInterface = 0;
		if(this.externalInterface != null){
				for(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_externalInterface++;
		}
		if(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_externalInterface + " non-transitive, non-negated and non-generalized externalInterface(s). Only " + externalInterface_upperBound + " non-transitive, non-negated and non-generalized externalInterface(s) are allowed.",new Object[] { this }));
		
		final int internalElement_upperBound = -1;
		int nr_nonTransitive_internalElement = 0;
		if(this.internalElement != null){
				for(qmm.OrGroup og : this.internalElement) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_internalElement++;
		}
		if(nr_nonTransitive_internalElement > internalElement_upperBound && internalElement_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_internalElement + " non-transitive, non-negated and non-generalized internalElement(s). Only " + internalElement_upperBound + " non-transitive, non-negated and non-generalized internalElement(s) are allowed.",new Object[] { this }));
		
		final int supportedRoleClass_upperBound = -1;
		int nr_nonTransitive_supportedRoleClass = 0;
		if(this.supportedRoleClass != null){
				for(qmm.OrGroup og : this.supportedRoleClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_supportedRoleClass++;
		}
		if(nr_nonTransitive_supportedRoleClass > supportedRoleClass_upperBound && supportedRoleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_supportedRoleClass + " non-transitive, non-negated and non-generalized supportedRoleClass(s). Only " + supportedRoleClass_upperBound + " non-transitive, non-negated and non-generalized supportedRoleClass(s) are allowed.",new Object[] { this }));
		
		final int internalLink_upperBound = -1;
		int nr_nonTransitive_internalLink = 0;
		if(this.internalLink != null){
				for(qmm.OrGroup og : this.internalLink) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_internalLink++;
		}
		if(nr_nonTransitive_internalLink > internalLink_upperBound && internalLink_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_internalLink + " non-transitive, non-negated and non-generalized internalLink(s). Only " + internalLink_upperBound + " non-transitive, non-negated and non-generalized internalLink(s) are allowed.",new Object[] { this }));
		
		final int baseClass_upperBound = 1;
		int nr_nonTransitive_baseClass = 0;
		if(this.baseClass != null){
				for(qmm.OrGroup og : this.baseClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_baseClass++;
		}
		if(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_baseClass + " non-transitive, non-negated and non-generalized baseClass(s). Only " + baseClass_upperBound + " non-transitive, non-negated and non-generalized baseClass(s) are allowed.",new Object[] { this }));
		
		final int systemUnitClass_upperBound = -1;
		int nr_nonTransitive_systemUnitClass = 0;
		if(this.systemUnitClass != null){
				for(qmm.OrGroup og : this.systemUnitClass) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_systemUnitClass++;
		}
		if(nr_nonTransitive_systemUnitClass > systemUnitClass_upperBound && systemUnitClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonTransitive_systemUnitClass + " non-transitive, non-negated and non-generalized systemUnitClass(s). Only " + systemUnitClass_upperBound + " non-transitive, non-negated and non-generalized systemUnitClass(s) are allowed.",new Object[] { this }));
		
		final int refBaseClassPath_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refBaseClassPath_AttrEClass = 0;
		if(this.refBaseClassPath_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refBaseClassPath_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refBaseClassPath_AttrEClass++;
		}
		if(nr_nonGeneralized_refBaseClassPath_AttrEClass > refBaseClassPath_AttrEClass_upperBound && refBaseClassPath_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SystemUnitClass contains " + nr_nonGeneralized_refBaseClassPath_AttrEClass + " non-generalized and non-negated refBaseClassPath(s). Only " + refBaseClassPath_AttrEClass_upperBound + " non-generalized and non-negated refBaseClassPath(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return ((InternalEList<?>)getInternalElement()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return ((InternalEList<?>)getSupportedRoleClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return ((InternalEList<?>)getInternalLink()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return ((InternalEList<?>)getBaseClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return ((InternalEList<?>)getSystemUnitClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return getInternalElement();
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return getSupportedRoleClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return getInternalLink();
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return getBaseClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return getSystemUnitClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				getInternalElement().addAll((Collection<? extends InternalElement_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				getSupportedRoleClass().addAll((Collection<? extends SupportedRoleClass_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
				getInternalLink().addAll((Collection<? extends InternalLink_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				getBaseClass().clear();
				getBaseClass().addAll((Collection<? extends SystemUnitClass_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				getSystemUnitClass().addAll((Collection<? extends SystemUnitClass_Containment_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				getRefBaseClassPath_AttrEClass().clear();
				getRefBaseClassPath_AttrEClass().addAll((Collection<? extends SystemUnitClass_refBaseClassPath_AttrEClass>)newValue);
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				getBaseClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return internalElement != null && !internalElement.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return supportedRoleClass != null && !supportedRoleClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return internalLink != null && !internalLink.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return baseClass != null && !baseClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return systemUnitClass != null && !systemUnitClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemUnitClassImpl
