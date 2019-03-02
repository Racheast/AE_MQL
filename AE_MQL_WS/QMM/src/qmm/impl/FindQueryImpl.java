/**
 */
package qmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.FindQuery;
import qmm.QmmPackage;
import qmm.RootClass;
import qmm.SelectClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.FindQueryImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link qmm.impl.FindQueryImpl#getRootClass <em>Root Class</em>}</li>
 *   <li>{@link qmm.impl.FindQueryImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindQueryImpl extends MinimalEObjectImpl.Container implements FindQuery {
	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<FindQuery> union;

	/**
	 * The cached value of the '{@link #getRootClass() <em>Root Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RootClass> rootClass;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected SelectClause select;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getFindQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FindQuery> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<FindQuery>(FindQuery.class, this, QmmPackage.FIND_QUERY__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootClass> getRootClass() {
		if (rootClass == null) {
			rootClass = new EObjectContainmentEList<RootClass>(RootClass.class, this, QmmPackage.FIND_QUERY__ROOT_CLASS);
		}
		return rootClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectClause getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(SelectClause newSelect, NotificationChain msgs) {
		SelectClause oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.FIND_QUERY__SELECT, oldSelect, newSelect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(SelectClause newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.FIND_QUERY__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.FIND_QUERY__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.FIND_QUERY__SELECT, newSelect, newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.FIND_QUERY__UNION:
				return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
				return ((InternalEList<?>)getRootClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.FIND_QUERY__SELECT:
				return basicSetSelect(null, msgs);
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
			case QmmPackage.FIND_QUERY__UNION:
				return getUnion();
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
				return getRootClass();
			case QmmPackage.FIND_QUERY__SELECT:
				return getSelect();
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
			case QmmPackage.FIND_QUERY__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends FindQuery>)newValue);
				return;
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
				getRootClass().clear();
				getRootClass().addAll((Collection<? extends RootClass>)newValue);
				return;
			case QmmPackage.FIND_QUERY__SELECT:
				setSelect((SelectClause)newValue);
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
			case QmmPackage.FIND_QUERY__UNION:
				getUnion().clear();
				return;
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
				getRootClass().clear();
				return;
			case QmmPackage.FIND_QUERY__SELECT:
				setSelect((SelectClause)null);
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
			case QmmPackage.FIND_QUERY__UNION:
				return union != null && !union.isEmpty();
			case QmmPackage.FIND_QUERY__ROOT_CLASS:
				return rootClass != null && !rootClass.isEmpty();
			case QmmPackage.FIND_QUERY__SELECT:
				return select != null;
		}
		return super.eIsSet(featureID);
	}

} //FindQueryImpl
