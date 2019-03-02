/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.GeneralizableElement;
import qmm.QmmPackage;
import qmm.RegularAttributeEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RegularAttributeEClassImpl#isGeneralized <em>Generalized</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegularAttributeEClassImpl extends AttributeEClassImpl implements RegularAttributeEClass {
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
	protected RegularAttributeEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRegularAttributeEClass();
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
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED, oldGeneralized, generalized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList validateCheckExpression(final Object o) {
		EClass booleanType = QmmPackage.eINSTANCE.getBoolean_Type();
		EClass functionalOperatorType = QmmPackage.eINSTANCE.getFunctionalOperator();
		EClass bitOperatorType = QmmPackage.eINSTANCE.getBitOperator();
		qmm.Operator operator = (qmm.Operator)o;
		EList diagnosticList = new org.eclipse.emf.common.util.BasicEList();
		
		if(functionalOperatorType.isSuperTypeOf(operator.eClass())){
			qmm.FunctionalOperator lastOperator = (qmm.FunctionalOperator)((qmm.FunctionalOperator)operator).getLastOperator();
		    	EClass lastOperatorType = (EClass)lastOperator.getType();
		    	if(!booleanType.isSuperTypeOf(lastOperatorType)){
					String errorMessage = "Operator " + lastOperator.eClass().getName() + " of attribute " + this.eClass().getName() + " is of type " + lastOperatorType.getName() + ", but must be (a subtype) of type " + booleanType.getName() + ".";
		    		diagnosticList.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));
		    	}
		}else if(bitOperatorType.isSuperTypeOf(operator.eClass())){
		    for(qmm.Operator op : (EList<qmm.Operator>)operator.eGet(operator.eClass().getEStructuralFeature("connects"))){
		    	diagnosticList.addAll(validateCheckExpression(op));
		    }
		}
		return diagnosticList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED:
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
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED:
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
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED:
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
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED: return QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED;
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
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case QmmPackage.GENERALIZABLE_ELEMENT__GENERALIZED: return QmmPackage.REGULAR_ATTRIBUTE_ECLASS__GENERALIZED;
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
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT:
				return validateCheckExpression(arguments.get(0));
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
		result.append(" (generalized: ");
		result.append(generalized);
		result.append(')');
		return result.toString();
	}

} //RegularAttributeEClassImpl
