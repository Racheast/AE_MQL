/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.Version;
import qmm.Version_changeMode_AttrEClass;
import qmm.Version_value_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.VersionImpl#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.VersionImpl#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends RootClassImpl implements Version {
	/**
	 * The cached value of the '{@link #getValue_AttrEClass() <em>Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Version_value_AttrEClass> value_AttrEClass;

	/**
	 * The cached value of the '{@link #getChangeMode_AttrEClass() <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Version_changeMode_AttrEClass changeMode_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version_value_AttrEClass> getValue_AttrEClass() {
		if (value_AttrEClass == null) {
			value_AttrEClass = new EObjectContainmentEList<Version_value_AttrEClass>(Version_value_AttrEClass.class, this, QmmPackage.VERSION__VALUE_ATTR_ECLASS);
		}
		return value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_changeMode_AttrEClass getChangeMode_AttrEClass() {
		return changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeMode_AttrEClass(Version_changeMode_AttrEClass newChangeMode_AttrEClass, NotificationChain msgs) {
		Version_changeMode_AttrEClass oldChangeMode_AttrEClass = changeMode_AttrEClass;
		changeMode_AttrEClass = newChangeMode_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS, oldChangeMode_AttrEClass, newChangeMode_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeMode_AttrEClass(Version_changeMode_AttrEClass newChangeMode_AttrEClass) {
		if (newChangeMode_AttrEClass != changeMode_AttrEClass) {
			NotificationChain msgs = null;
			if (changeMode_AttrEClass != null)
				msgs = ((InternalEObject)changeMode_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			if (newChangeMode_AttrEClass != null)
				msgs = ((InternalEObject)newChangeMode_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			msgs = basicSetChangeMode_AttrEClass(newChangeMode_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS, newChangeMode_AttrEClass, newChangeMode_AttrEClass));
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
		
		final int value_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_value_AttrEClass = 0;
		if(this.value_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.value_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_value_AttrEClass++;
		}
		if(nr_nonGeneralized_value_AttrEClass > value_AttrEClass_upperBound && value_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Version contains " + nr_nonGeneralized_value_AttrEClass + " non-generalized and non-negated value(s). Only " + value_AttrEClass_upperBound + " non-generalized and non-negated value(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.VERSION__VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getValue_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS:
				return basicSetChangeMode_AttrEClass(null, msgs);
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
			case QmmPackage.VERSION__VALUE_ATTR_ECLASS:
				return getValue_AttrEClass();
			case QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS:
				return getChangeMode_AttrEClass();
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
			case QmmPackage.VERSION__VALUE_ATTR_ECLASS:
				getValue_AttrEClass().clear();
				getValue_AttrEClass().addAll((Collection<? extends Version_value_AttrEClass>)newValue);
				return;
			case QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((Version_changeMode_AttrEClass)newValue);
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
			case QmmPackage.VERSION__VALUE_ATTR_ECLASS:
				getValue_AttrEClass().clear();
				return;
			case QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((Version_changeMode_AttrEClass)null);
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
			case QmmPackage.VERSION__VALUE_ATTR_ECLASS:
				return value_AttrEClass != null && !value_AttrEClass.isEmpty();
			case QmmPackage.VERSION__CHANGE_MODE_ATTR_ECLASS:
				return changeMode_AttrEClass != null;
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.VERSION___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.VERSION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VersionImpl
