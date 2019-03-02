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
import qmm.Integer_FunctionalParameter;
import qmm.Integer_FunctionalType;
import qmm.Integer_Type;
import qmm.Number_Type;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.Type;
import qmm.indexOfCharFromIndex_FunctionalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>index Of Char From Index Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.indexOfCharFromIndex_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.indexOfCharFromIndex_FunctionalOperatorImpl#getCh <em>Ch</em>}</li>
 *   <li>{@link qmm.impl.indexOfCharFromIndex_FunctionalOperatorImpl#getFromIndex <em>From Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class indexOfCharFromIndex_FunctionalOperatorImpl extends String_Original_FunctionalOperatorImpl implements indexOfCharFromIndex_FunctionalOperator {
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
	 * The cached value of the '{@link #getCh() <em>Ch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCh()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalParameter ch;

	/**
	 * The cached value of the '{@link #getFromIndex() <em>From Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalParameter fromIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected indexOfCharFromIndex_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getindexOfCharFromIndex_FunctionalOperator();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
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
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter getCh() {
		return ch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCh(Integer_FunctionalParameter newCh, NotificationChain msgs) {
		Integer_FunctionalParameter oldCh = ch;
		ch = newCh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH, oldCh, newCh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCh(Integer_FunctionalParameter newCh) {
		if (newCh != ch) {
			NotificationChain msgs = null;
			if (ch != null)
				msgs = ((InternalEObject)ch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH, null, msgs);
			if (newCh != null)
				msgs = ((InternalEObject)newCh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH, null, msgs);
			msgs = basicSetCh(newCh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH, newCh, newCh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter getFromIndex() {
		return fromIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromIndex(Integer_FunctionalParameter newFromIndex, NotificationChain msgs) {
		Integer_FunctionalParameter oldFromIndex = fromIndex;
		fromIndex = newFromIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX, oldFromIndex, newFromIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIndex(Integer_FunctionalParameter newFromIndex) {
		if (newFromIndex != fromIndex) {
			NotificationChain msgs = null;
			if (fromIndex != null)
				msgs = ((InternalEObject)fromIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX, null, msgs);
			if (newFromIndex != null)
				msgs = ((InternalEObject)newFromIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX, null, msgs);
			msgs = basicSetFromIndex(newFromIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX, newFromIndex, newFromIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".indexOf";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(ch);
		parameterList.add(fromIndex);
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH:
				return basicSetCh(null, msgs);
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX:
				return basicSetFromIndex(null, msgs);
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH:
				return getCh();
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX:
				return getFromIndex();
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)newValue);
				return;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH:
				setCh((Integer_FunctionalParameter)newValue);
				return;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX:
				setFromIndex((Integer_FunctionalParameter)newValue);
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)null);
				return;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH:
				setCh((Integer_FunctionalParameter)null);
				return;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX:
				setFromIndex((Integer_FunctionalParameter)null);
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__CH:
				return ch != null;
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__FROM_INDEX:
				return fromIndex != null;
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
				case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR;
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
				case QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR__OPERATOR;
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
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //indexOfCharFromIndex_FunctionalOperatorImpl
