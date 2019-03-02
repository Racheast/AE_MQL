/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.CAEXBasicObject;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.Revision;
import qmm.Revision_authorName_AttrEClass;
import qmm.Revision_comment_AttrEClass;
import qmm.Revision_newVersion_AttrEClass;
import qmm.Revision_oldVersion_AttrEClass;
import qmm.Revision_revisionDate_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RevisionImpl#getRevisionDate_AttrEClass <em>Revision Date Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getOldVersion_AttrEClass <em>Old Version Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getNewVersion_AttrEClass <em>New Version Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getAuthorName_AttrEClass <em>Author Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getComment_AttrEClass <em>Comment Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends CAEXBasicObjectImpl implements Revision {
	/**
	 * The cached value of the '{@link #getRevisionDate_AttrEClass() <em>Revision Date Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_revisionDate_AttrEClass> revisionDate_AttrEClass;

	/**
	 * The cached value of the '{@link #getOldVersion_AttrEClass() <em>Old Version Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_oldVersion_AttrEClass> oldVersion_AttrEClass;

	/**
	 * The cached value of the '{@link #getNewVersion_AttrEClass() <em>New Version Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_newVersion_AttrEClass> newVersion_AttrEClass;

	/**
	 * The cached value of the '{@link #getAuthorName_AttrEClass() <em>Author Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_authorName_AttrEClass> authorName_AttrEClass;

	/**
	 * The cached value of the '{@link #getComment_AttrEClass() <em>Comment Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_comment_AttrEClass> comment_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRevision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_revisionDate_AttrEClass> getRevisionDate_AttrEClass() {
		if (revisionDate_AttrEClass == null) {
			revisionDate_AttrEClass = new EObjectContainmentEList<Revision_revisionDate_AttrEClass>(Revision_revisionDate_AttrEClass.class, this, QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS);
		}
		return revisionDate_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_oldVersion_AttrEClass> getOldVersion_AttrEClass() {
		if (oldVersion_AttrEClass == null) {
			oldVersion_AttrEClass = new EObjectContainmentEList<Revision_oldVersion_AttrEClass>(Revision_oldVersion_AttrEClass.class, this, QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS);
		}
		return oldVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_newVersion_AttrEClass> getNewVersion_AttrEClass() {
		if (newVersion_AttrEClass == null) {
			newVersion_AttrEClass = new EObjectContainmentEList<Revision_newVersion_AttrEClass>(Revision_newVersion_AttrEClass.class, this, QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS);
		}
		return newVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_authorName_AttrEClass> getAuthorName_AttrEClass() {
		if (authorName_AttrEClass == null) {
			authorName_AttrEClass = new EObjectContainmentEList<Revision_authorName_AttrEClass>(Revision_authorName_AttrEClass.class, this, QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS);
		}
		return authorName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_comment_AttrEClass> getComment_AttrEClass() {
		if (comment_AttrEClass == null) {
			comment_AttrEClass = new EObjectContainmentEList<Revision_comment_AttrEClass>(Revision_comment_AttrEClass.class, this, QmmPackage.REVISION__COMMENT_ATTR_ECLASS);
		}
		return comment_AttrEClass;
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
		
		final int revisionDate_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_revisionDate_AttrEClass = 0;
		if(this.revisionDate_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.revisionDate_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_revisionDate_AttrEClass++;
		}
		if(nr_nonGeneralized_revisionDate_AttrEClass > revisionDate_AttrEClass_upperBound && revisionDate_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Revision contains " + nr_nonGeneralized_revisionDate_AttrEClass + " non-generalized and non-negated revisionDate(s). Only " + revisionDate_AttrEClass_upperBound + " non-generalized and non-negated revisionDate(s) are allowed.",new Object[] { this }));
		
		final int oldVersion_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_oldVersion_AttrEClass = 0;
		if(this.oldVersion_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.oldVersion_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_oldVersion_AttrEClass++;
		}
		if(nr_nonGeneralized_oldVersion_AttrEClass > oldVersion_AttrEClass_upperBound && oldVersion_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Revision contains " + nr_nonGeneralized_oldVersion_AttrEClass + " non-generalized and non-negated oldVersion(s). Only " + oldVersion_AttrEClass_upperBound + " non-generalized and non-negated oldVersion(s) are allowed.",new Object[] { this }));
		
		final int newVersion_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_newVersion_AttrEClass = 0;
		if(this.newVersion_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.newVersion_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_newVersion_AttrEClass++;
		}
		if(nr_nonGeneralized_newVersion_AttrEClass > newVersion_AttrEClass_upperBound && newVersion_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Revision contains " + nr_nonGeneralized_newVersion_AttrEClass + " non-generalized and non-negated newVersion(s). Only " + newVersion_AttrEClass_upperBound + " non-generalized and non-negated newVersion(s) are allowed.",new Object[] { this }));
		
		final int authorName_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_authorName_AttrEClass = 0;
		if(this.authorName_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.authorName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_authorName_AttrEClass++;
		}
		if(nr_nonGeneralized_authorName_AttrEClass > authorName_AttrEClass_upperBound && authorName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Revision contains " + nr_nonGeneralized_authorName_AttrEClass + " non-generalized and non-negated authorName(s). Only " + authorName_AttrEClass_upperBound + " non-generalized and non-negated authorName(s) are allowed.",new Object[] { this }));
		
		final int comment_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_comment_AttrEClass = 0;
		if(this.comment_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.comment_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_comment_AttrEClass++;
		}
		if(nr_nonGeneralized_comment_AttrEClass > comment_AttrEClass_upperBound && comment_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Revision contains " + nr_nonGeneralized_comment_AttrEClass + " non-generalized and non-negated comment(s). Only " + comment_AttrEClass_upperBound + " non-generalized and non-negated comment(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return ((InternalEList<?>)getRevisionDate_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return ((InternalEList<?>)getOldVersion_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return ((InternalEList<?>)getNewVersion_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getAuthorName_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return ((InternalEList<?>)getComment_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return getRevisionDate_AttrEClass();
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return getOldVersion_AttrEClass();
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return getNewVersion_AttrEClass();
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return getAuthorName_AttrEClass();
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return getComment_AttrEClass();
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				getRevisionDate_AttrEClass().clear();
				getRevisionDate_AttrEClass().addAll((Collection<? extends Revision_revisionDate_AttrEClass>)newValue);
				return;
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				getOldVersion_AttrEClass().clear();
				getOldVersion_AttrEClass().addAll((Collection<? extends Revision_oldVersion_AttrEClass>)newValue);
				return;
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				getNewVersion_AttrEClass().clear();
				getNewVersion_AttrEClass().addAll((Collection<? extends Revision_newVersion_AttrEClass>)newValue);
				return;
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				getAuthorName_AttrEClass().clear();
				getAuthorName_AttrEClass().addAll((Collection<? extends Revision_authorName_AttrEClass>)newValue);
				return;
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				getComment_AttrEClass().clear();
				getComment_AttrEClass().addAll((Collection<? extends Revision_comment_AttrEClass>)newValue);
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				getRevisionDate_AttrEClass().clear();
				return;
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				getOldVersion_AttrEClass().clear();
				return;
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				getNewVersion_AttrEClass().clear();
				return;
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				getAuthorName_AttrEClass().clear();
				return;
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				getComment_AttrEClass().clear();
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return revisionDate_AttrEClass != null && !revisionDate_AttrEClass.isEmpty();
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return oldVersion_AttrEClass != null && !oldVersion_AttrEClass.isEmpty();
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return newVersion_AttrEClass != null && !newVersion_AttrEClass.isEmpty();
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return authorName_AttrEClass != null && !authorName_AttrEClass.isEmpty();
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return comment_AttrEClass != null && !comment_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REVISION___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REVISION___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.REVISION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RevisionImpl
