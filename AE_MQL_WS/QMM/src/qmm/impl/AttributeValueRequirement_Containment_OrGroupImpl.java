/**
 */
package qmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.AttributeValueRequirement;
import qmm.AttributeValueRequirement_Containment_OrGroup;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Requirement Containment Or Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeValueRequirement_Containment_OrGroupImpl#getContainment <em>Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueRequirement_Containment_OrGroupImpl extends Containment_OrGroupImpl implements AttributeValueRequirement_Containment_OrGroup {
	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueRequirement> containment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueRequirement_Containment_OrGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAttributeValueRequirement_Containment_OrGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRequirement> getContainment() {
		if (containment == null) {
			containment = new EObjectContainmentEList<AttributeValueRequirement>(AttributeValueRequirement.class, this, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT);
		}
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT:
				return ((InternalEList<?>)getContainment()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT:
				return getContainment();
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT:
				getContainment().clear();
				getContainment().addAll((Collection<? extends AttributeValueRequirement>)newValue);
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT:
				getContainment().clear();
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP__CONTAINMENT:
				return containment != null && !containment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueRequirement_Containment_OrGroupImpl