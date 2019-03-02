/**
 */
package dmm.impl;

import dmm.DmmPackage;
import dmm.OrdinalScaledType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmm.impl.OrdinalScaledTypeImpl#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link dmm.impl.OrdinalScaledTypeImpl#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link dmm.impl.OrdinalScaledTypeImpl#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrdinalScaledTypeImpl extends MinimalEObjectImpl.Container implements OrdinalScaledType {
	/**
	 * The default value of the '{@link #getRequiredMaxValue() <em>Required Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredMaxValue() <em>Required Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMaxValue()
	 * @generated
	 * @ordered
	 */
	protected String requiredMaxValue = REQUIRED_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected String requiredValue = REQUIRED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredMinValue() <em>Required Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredMinValue() <em>Required Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMinValue()
	 * @generated
	 * @ordered
	 */
	protected String requiredMinValue = REQUIRED_MIN_VALUE_EDEFAULT;

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
		return DmmPackage.Literals.ORDINAL_SCALED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredMaxValue() {
		return requiredMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMaxValue(String newRequiredMaxValue) {
		String oldRequiredMaxValue = requiredMaxValue;
		requiredMaxValue = newRequiredMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE, oldRequiredMaxValue, requiredMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredValue() {
		return requiredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredValue(String newRequiredValue) {
		String oldRequiredValue = requiredValue;
		requiredValue = newRequiredValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE, oldRequiredValue, requiredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredMinValue() {
		return requiredMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMinValue(String newRequiredMinValue) {
		String oldRequiredMinValue = requiredMinValue;
		requiredMinValue = newRequiredMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE, oldRequiredMinValue, requiredMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE:
				return getRequiredMaxValue();
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE:
				return getRequiredValue();
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE:
				return getRequiredMinValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE:
				setRequiredMaxValue((String)newValue);
				return;
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE:
				setRequiredValue((String)newValue);
				return;
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE:
				setRequiredMinValue((String)newValue);
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
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE:
				setRequiredMaxValue(REQUIRED_MAX_VALUE_EDEFAULT);
				return;
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE:
				setRequiredValue(REQUIRED_VALUE_EDEFAULT);
				return;
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE:
				setRequiredMinValue(REQUIRED_MIN_VALUE_EDEFAULT);
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
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE:
				return REQUIRED_MAX_VALUE_EDEFAULT == null ? requiredMaxValue != null : !REQUIRED_MAX_VALUE_EDEFAULT.equals(requiredMaxValue);
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE:
				return REQUIRED_VALUE_EDEFAULT == null ? requiredValue != null : !REQUIRED_VALUE_EDEFAULT.equals(requiredValue);
			case DmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE:
				return REQUIRED_MIN_VALUE_EDEFAULT == null ? requiredMinValue != null : !REQUIRED_MIN_VALUE_EDEFAULT.equals(requiredMinValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (requiredMaxValue: ");
		result.append(requiredMaxValue);
		result.append(", requiredValue: ");
		result.append(requiredValue);
		result.append(", requiredMinValue: ");
		result.append(requiredMinValue);
		result.append(')');
		return result.toString();
	}

} //OrdinalScaledTypeImpl
