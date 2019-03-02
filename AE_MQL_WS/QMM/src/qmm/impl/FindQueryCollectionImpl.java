/**
 */
package qmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.FindQuery;
import qmm.FindQueryCollection;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Query Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.FindQueryCollectionImpl#getFindQueries <em>Find Queries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindQueryCollectionImpl extends MinimalEObjectImpl.Container implements FindQueryCollection {
	/**
	 * The cached value of the '{@link #getFindQueries() <em>Find Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<FindQuery> findQueries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindQueryCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getFindQueryCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FindQuery> getFindQueries() {
		if (findQueries == null) {
			findQueries = new EObjectContainmentEList<FindQuery>(FindQuery.class, this, QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES);
		}
		return findQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES:
				return ((InternalEList<?>)getFindQueries()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES:
				return getFindQueries();
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
			case QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES:
				getFindQueries().clear();
				getFindQueries().addAll((Collection<? extends FindQuery>)newValue);
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
			case QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES:
				getFindQueries().clear();
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
			case QmmPackage.FIND_QUERY_COLLECTION__FIND_QUERIES:
				return findQueries != null && !findQueries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FindQueryCollectionImpl
