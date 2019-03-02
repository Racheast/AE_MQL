/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.FunctionalType;
import qmm.Integer_FunctionalOperator;
import qmm.Integer_FunctionalType;
import qmm.Integer_Type;
import qmm.Number_Type;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.String_FunctionalParameter;
import qmm.Type;
import qmm.compareToString_FunctionalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compare To String Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.compareToString_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.compareToString_FunctionalOperatorImpl#getAnotherString <em>Another String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class compareToString_FunctionalOperatorImpl extends String_Original_FunctionalOperatorImpl implements compareToString_FunctionalOperator {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getAnotherString() <em>Another String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotherString()
	 * @generated
	 * @ordered
	 */
	protected String_FunctionalParameter anotherString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected compareToString_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getcompareToString_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Integer_FunctionalOperator newOperator, NotificationChain msgs) {
		Integer_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Integer_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalParameter getAnotherString() {
		return anotherString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnotherString(String_FunctionalParameter newAnotherString, NotificationChain msgs) {
		String_FunctionalParameter oldAnotherString = anotherString;
		anotherString = newAnotherString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING, oldAnotherString, newAnotherString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotherString(String_FunctionalParameter newAnotherString) {
		if (newAnotherString != anotherString) {
			NotificationChain msgs = null;
			if (anotherString != null)
				msgs = ((InternalEObject)anotherString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING, null, msgs);
			if (newAnotherString != null)
				msgs = ((InternalEObject)newAnotherString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING, null, msgs);
			msgs = basicSetAnotherString(newAnotherString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING, newAnotherString, newAnotherString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".compareTo";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(anotherString);
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING:
				return basicSetAnotherString(null, msgs);
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
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING:
				return getAnotherString();
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
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)newValue);
				return;
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING:
				setAnotherString((String_FunctionalParameter)newValue);
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
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)null);
				return;
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING:
				setAnotherString((String_FunctionalParameter)null);
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
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__ANOTHER_STRING:
				return anotherString != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Object_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Number_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Object_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Number_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //compareToString_FunctionalOperatorImpl
