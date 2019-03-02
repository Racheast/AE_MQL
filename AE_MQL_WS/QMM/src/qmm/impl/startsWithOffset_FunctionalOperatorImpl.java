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

import qmm.Boolean_FunctionalOperator;
import qmm.Boolean_FunctionalType;
import qmm.Boolean_Type;
import qmm.FunctionalType;
import qmm.Integer_FunctionalParameter;
import qmm.NegatableElement;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.String_FunctionalParameter;
import qmm.Type;
import qmm.startsWithOffset_FunctionalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>starts With Offset Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.startsWithOffset_FunctionalOperatorImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link qmm.impl.startsWithOffset_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.startsWithOffset_FunctionalOperatorImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qmm.impl.startsWithOffset_FunctionalOperatorImpl#getToffset <em>Toffset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class startsWithOffset_FunctionalOperatorImpl extends String_Original_FunctionalOperatorImpl implements startsWithOffset_FunctionalOperator {
	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Boolean_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String_FunctionalParameter prefix;

	/**
	 * The cached value of the '{@link #getToffset() <em>Toffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToffset()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalParameter toffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected startsWithOffset_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getstartsWithOffset_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Boolean_FunctionalOperator newOperator, NotificationChain msgs) {
		Boolean_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Boolean_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalParameter getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(String_FunctionalParameter newPrefix, NotificationChain msgs) {
		String_FunctionalParameter oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String_FunctionalParameter newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter getToffset() {
		return toffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToffset(Integer_FunctionalParameter newToffset, NotificationChain msgs) {
		Integer_FunctionalParameter oldToffset = toffset;
		toffset = newToffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET, oldToffset, newToffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToffset(Integer_FunctionalParameter newToffset) {
		if (newToffset != toffset) {
			NotificationChain msgs = null;
			if (toffset != null)
				msgs = ((InternalEObject)toffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET, null, msgs);
			if (newToffset != null)
				msgs = ((InternalEObject)newToffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET, null, msgs);
			msgs = basicSetToffset(newToffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET, newToffset, newToffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".starstWith";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(prefix);
		parameterList.add(toffset);
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX:
				return basicSetPrefix(null, msgs);
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET:
				return basicSetToffset(null, msgs);
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED:
				return isNegated();
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX:
				return getPrefix();
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET:
				return getToffset();
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Boolean_FunctionalOperator)newValue);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX:
				setPrefix((String_FunctionalParameter)newValue);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET:
				setToffset((Integer_FunctionalParameter)newValue);
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Boolean_FunctionalOperator)null);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX:
				setPrefix((String_FunctionalParameter)null);
				return;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET:
				setToffset((Integer_FunctionalParameter)null);
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__PREFIX:
				return prefix != null;
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__TOFFSET:
				return toffset != null;
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
		if (baseClass == Boolean_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatableElement.class) {
			switch (derivedFeatureID) {
				case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED: return QmmPackage.NEGATABLE_ELEMENT__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == Boolean_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.BOOLEAN_FUNCTIONAL_TYPE__OPERATOR;
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
		if (baseClass == Boolean_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatableElement.class) {
			switch (baseFeatureID) {
				case QmmPackage.NEGATABLE_ELEMENT__NEGATED: return QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == Boolean_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR__OPERATOR;
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
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //startsWithOffset_FunctionalOperatorImpl
