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
import qmm.ExternalInterface_Reference_OrGroup;
import qmm.InternalLink;
import qmm.InternalLink_refPartnerSideA_AttrEClass;
import qmm.InternalLink_refPartnerSideB_AttrEClass;
import qmm.NamedElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InternalLinkImpl#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link qmm.impl.InternalLinkImpl#getPartnerSideB <em>Partner Side B</em>}</li>
 *   <li>{@link qmm.impl.InternalLinkImpl#getRefPartnerSideA_AttrEClass <em>Ref Partner Side AAttr EClass</em>}</li>
 *   <li>{@link qmm.impl.InternalLinkImpl#getRefPartnerSideB_AttrEClass <em>Ref Partner Side BAttr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLinkImpl extends CAEXObjectImpl implements InternalLink {
	/**
	 * The cached value of the '{@link #getPartnerSideA() <em>Partner Side A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_Reference_OrGroup> partnerSideA;

	/**
	 * The cached value of the '{@link #getPartnerSideB() <em>Partner Side B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_Reference_OrGroup> partnerSideB;

	/**
	 * The cached value of the '{@link #getRefPartnerSideA_AttrEClass() <em>Ref Partner Side AAttr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideA_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink_refPartnerSideA_AttrEClass> refPartnerSideA_AttrEClass;

	/**
	 * The cached value of the '{@link #getRefPartnerSideB_AttrEClass() <em>Ref Partner Side BAttr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideB_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink_refPartnerSideB_AttrEClass> refPartnerSideB_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInternalLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_Reference_OrGroup> getPartnerSideA() {
		if (partnerSideA == null) {
			partnerSideA = new EObjectContainmentEList<ExternalInterface_Reference_OrGroup>(ExternalInterface_Reference_OrGroup.class, this, QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A);
		}
		return partnerSideA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_Reference_OrGroup> getPartnerSideB() {
		if (partnerSideB == null) {
			partnerSideB = new EObjectContainmentEList<ExternalInterface_Reference_OrGroup>(ExternalInterface_Reference_OrGroup.class, this, QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B);
		}
		return partnerSideB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink_refPartnerSideA_AttrEClass> getRefPartnerSideA_AttrEClass() {
		if (refPartnerSideA_AttrEClass == null) {
			refPartnerSideA_AttrEClass = new EObjectContainmentEList<InternalLink_refPartnerSideA_AttrEClass>(InternalLink_refPartnerSideA_AttrEClass.class, this, QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS);
		}
		return refPartnerSideA_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink_refPartnerSideB_AttrEClass> getRefPartnerSideB_AttrEClass() {
		if (refPartnerSideB_AttrEClass == null) {
			refPartnerSideB_AttrEClass = new EObjectContainmentEList<InternalLink_refPartnerSideB_AttrEClass>(InternalLink_refPartnerSideB_AttrEClass.class, this, QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS);
		}
		return refPartnerSideB_AttrEClass;
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
		
		final int partnerSideA_upperBound = 1;
		int nr_nonTransitive_partnerSideA = 0;
		if(this.partnerSideA != null){
				for(qmm.OrGroup og : this.partnerSideA) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_partnerSideA++;
		}
		if(nr_nonTransitive_partnerSideA > partnerSideA_upperBound && partnerSideA_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalLink contains " + nr_nonTransitive_partnerSideA + " non-transitive, non-negated and non-generalized partnerSideA(s). Only " + partnerSideA_upperBound + " non-transitive, non-negated and non-generalized partnerSideA(s) are allowed.",new Object[] { this }));
		
		final int partnerSideB_upperBound = 1;
		int nr_nonTransitive_partnerSideB = 0;
		if(this.partnerSideB != null){
				for(qmm.OrGroup og : this.partnerSideB) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_partnerSideB++;
		}
		if(nr_nonTransitive_partnerSideB > partnerSideB_upperBound && partnerSideB_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalLink contains " + nr_nonTransitive_partnerSideB + " non-transitive, non-negated and non-generalized partnerSideB(s). Only " + partnerSideB_upperBound + " non-transitive, non-negated and non-generalized partnerSideB(s) are allowed.",new Object[] { this }));
		
		final int refPartnerSideA_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refPartnerSideA_AttrEClass = 0;
		if(this.refPartnerSideA_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refPartnerSideA_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refPartnerSideA_AttrEClass++;
		}
		if(nr_nonGeneralized_refPartnerSideA_AttrEClass > refPartnerSideA_AttrEClass_upperBound && refPartnerSideA_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalLink contains " + nr_nonGeneralized_refPartnerSideA_AttrEClass + " non-generalized and non-negated refPartnerSideA(s). Only " + refPartnerSideA_AttrEClass_upperBound + " non-generalized and non-negated refPartnerSideA(s) are allowed.",new Object[] { this }));
		
		final int refPartnerSideB_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_refPartnerSideB_AttrEClass = 0;
		if(this.refPartnerSideB_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.refPartnerSideB_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_refPartnerSideB_AttrEClass++;
		}
		if(nr_nonGeneralized_refPartnerSideB_AttrEClass > refPartnerSideB_AttrEClass_upperBound && refPartnerSideB_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "InternalLink contains " + nr_nonGeneralized_refPartnerSideB_AttrEClass + " non-generalized and non-negated refPartnerSideB(s). Only " + refPartnerSideB_AttrEClass_upperBound + " non-generalized and non-negated refPartnerSideB(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				return ((InternalEList<?>)getPartnerSideA()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				return ((InternalEList<?>)getPartnerSideB()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS:
				return ((InternalEList<?>)getRefPartnerSideA_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS:
				return ((InternalEList<?>)getRefPartnerSideB_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				return getPartnerSideA();
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				return getPartnerSideB();
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS:
				return getRefPartnerSideA_AttrEClass();
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS:
				return getRefPartnerSideB_AttrEClass();
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
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				getPartnerSideA().clear();
				getPartnerSideA().addAll((Collection<? extends ExternalInterface_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				getPartnerSideB().clear();
				getPartnerSideB().addAll((Collection<? extends ExternalInterface_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS:
				getRefPartnerSideA_AttrEClass().clear();
				getRefPartnerSideA_AttrEClass().addAll((Collection<? extends InternalLink_refPartnerSideA_AttrEClass>)newValue);
				return;
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS:
				getRefPartnerSideB_AttrEClass().clear();
				getRefPartnerSideB_AttrEClass().addAll((Collection<? extends InternalLink_refPartnerSideB_AttrEClass>)newValue);
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
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				getPartnerSideA().clear();
				return;
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				getPartnerSideB().clear();
				return;
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS:
				getRefPartnerSideA_AttrEClass().clear();
				return;
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS:
				getRefPartnerSideB_AttrEClass().clear();
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
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				return partnerSideA != null && !partnerSideA.isEmpty();
			case QmmPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				return partnerSideB != null && !partnerSideB.isEmpty();
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_AATTR_ECLASS:
				return refPartnerSideA_AttrEClass != null && !refPartnerSideA_AttrEClass.isEmpty();
			case QmmPackage.INTERNAL_LINK__REF_PARTNER_SIDE_BATTR_ECLASS:
				return refPartnerSideB_AttrEClass != null && !refPartnerSideB_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERNAL_LINK___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalLinkImpl
