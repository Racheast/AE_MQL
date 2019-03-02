/**
 */
package qmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qmm.GeneralizableElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalizable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.GeneralizableElementImpl#isGeneralized <em>Generalized</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralizableElementImpl extends MinimalEObjectImpl.Container implements GeneralizableElement {
	/**
	 * The default value of the '{@link #isGeneralized() <em>Generalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneralized() <em>Generalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralized()
	 * @generated
	 * @ordered
	 */
	protected boolean generalized = GENERALIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getGeneralizableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneralized() {
		return generalized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralized(boolean newGeneralized) {
		boolean oldGeneralized = generalized;
		generalized = newGeneralized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED, oldGeneralized, generalized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED:
				return isGeneralized();
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
			case QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED:
				setGeneralized((Boolean)newValue);
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
			case QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED:
				setGeneralized(GENERALIZED_EDEFAULT);
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
			case QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED:
				return generalized != GENERALIZED_EDEFAULT;
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
		result.append(" (generalized: ");
		result.append(generalized);
		result.append(')');
		return result.toString();
	}

} //GeneralizableElementImpl
