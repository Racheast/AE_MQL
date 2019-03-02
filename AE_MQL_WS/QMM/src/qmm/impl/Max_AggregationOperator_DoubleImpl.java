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

import qmm.Argument;
import qmm.Calculateable_Argument;
import qmm.Double_Argument;
import qmm.Double_CalculateableParameter;
import qmm.Double_EvaluationOperation_Argument;
import qmm.Double_FunctionalOperator;
import qmm.Double_FunctionalType;
import qmm.Double_Type;
import qmm.EvaluationOperation_Argument;
import qmm.FunctionalArgument;
import qmm.FunctionalType;
import qmm.Max_AggregationOperator_Double;
import qmm.Number_Type;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.ReferenceArgument;
import qmm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Aggregation Operator Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.Max_AggregationOperator_DoubleImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.Max_AggregationOperator_DoubleImpl#getCalculateable <em>Calculateable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Max_AggregationOperator_DoubleImpl extends CalculatingAggregationOperatorImpl implements Max_AggregationOperator_Double {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Double_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getCalculateable() <em>Calculateable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculateable()
	 * @generated
	 * @ordered
	 */
	protected Double_CalculateableParameter calculateable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Max_AggregationOperator_DoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getMax_AggregationOperator_Double();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Double_FunctionalOperator newOperator, NotificationChain msgs) {
		Double_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Double_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_CalculateableParameter getCalculateable() {
		return calculateable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculateable(Double_CalculateableParameter newCalculateable, NotificationChain msgs) {
		Double_CalculateableParameter oldCalculateable = calculateable;
		calculateable = newCalculateable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE, oldCalculateable, newCalculateable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculateable(Double_CalculateableParameter newCalculateable) {
		if (newCalculateable != calculateable) {
			NotificationChain msgs = null;
			if (calculateable != null)
				msgs = ((InternalEObject)calculateable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE, null, msgs);
			if (newCalculateable != null)
				msgs = ((InternalEObject)newCalculateable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE, null, msgs);
			msgs = basicSetCalculateable(newCalculateable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE, newCalculateable, newCalculateable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return "max";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(calculateable);
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
				return basicSetCalculateable(null, msgs);
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
				return getOperator();
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
				return getCalculateable();
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
				setOperator((Double_FunctionalOperator)newValue);
				return;
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
				setCalculateable((Double_CalculateableParameter)newValue);
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
				setOperator((Double_FunctionalOperator)null);
				return;
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
				setCalculateable((Double_CalculateableParameter)null);
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR:
				return operator != null;
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__CALCULATEABLE:
				return calculateable != null;
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
		if (baseClass == Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceArgument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalArgument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Calculateable_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvaluationOperation_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
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
		if (baseClass == Double_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Double_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR: return QmmPackage.DOUBLE_FUNCTIONAL_TYPE__OPERATOR;
				default: return -1;
			}
		}
		if (baseClass == Double_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Double_EvaluationOperation_Argument.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceArgument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalArgument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Calculateable_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvaluationOperation_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
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
		if (baseClass == Double_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Double_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.DOUBLE_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE__OPERATOR;
				default: return -1;
			}
		}
		if (baseClass == Double_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Double_EvaluationOperation_Argument.class) {
			switch (baseFeatureID) {
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
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE___GET_LITERAL:
				return getLiteral();
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Max_AggregationOperator_DoubleImpl
