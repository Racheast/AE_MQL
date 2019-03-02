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

import qmm.AdditionalInformation_Reference_OrGroup;
import qmm.CAEXBasicObject;
import qmm.CAEXBasicObject_changeMode_AttrEClass;
import qmm.Copyright_Reference_OrGroup;
import qmm.Description_Reference_OrGroup;
import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.Revision_Reference_OrGroup;
import qmm.Version_Reference_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX Basic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link qmm.impl.CAEXBasicObjectImpl#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXBasicObjectImpl extends RootClassImpl implements CAEXBasicObject {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Description_Reference_OrGroup> description;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version_Reference_OrGroup> version;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision_Reference_OrGroup> revision;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected EList<Copyright_Reference_OrGroup> copyright;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalInformation_Reference_OrGroup> additionalInformation;

	/**
	 * The cached value of the '{@link #getChangeMode_AttrEClass() <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected CAEXBasicObject_changeMode_AttrEClass changeMode_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXBasicObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCAEXBasicObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description_Reference_OrGroup> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<Description_Reference_OrGroup>(Description_Reference_OrGroup.class, this, QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version_Reference_OrGroup> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<Version_Reference_OrGroup>(Version_Reference_OrGroup.class, this, QmmPackage.CAEX_BASIC_OBJECT__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision_Reference_OrGroup> getRevision() {
		if (revision == null) {
			revision = new EObjectContainmentEList<Revision_Reference_OrGroup>(Revision_Reference_OrGroup.class, this, QmmPackage.CAEX_BASIC_OBJECT__REVISION);
		}
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copyright_Reference_OrGroup> getCopyright() {
		if (copyright == null) {
			copyright = new EObjectContainmentEList<Copyright_Reference_OrGroup>(Copyright_Reference_OrGroup.class, this, QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT);
		}
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalInformation_Reference_OrGroup> getAdditionalInformation() {
		if (additionalInformation == null) {
			additionalInformation = new EObjectContainmentEList<AdditionalInformation_Reference_OrGroup>(AdditionalInformation_Reference_OrGroup.class, this, QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION);
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXBasicObject_changeMode_AttrEClass getChangeMode_AttrEClass() {
		return changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass newChangeMode_AttrEClass, NotificationChain msgs) {
		CAEXBasicObject_changeMode_AttrEClass oldChangeMode_AttrEClass = changeMode_AttrEClass;
		changeMode_AttrEClass = newChangeMode_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS, oldChangeMode_AttrEClass, newChangeMode_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass newChangeMode_AttrEClass) {
		if (newChangeMode_AttrEClass != changeMode_AttrEClass) {
			NotificationChain msgs = null;
			if (changeMode_AttrEClass != null)
				msgs = ((InternalEObject)changeMode_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			if (newChangeMode_AttrEClass != null)
				msgs = ((InternalEObject)newChangeMode_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			msgs = basicSetChangeMode_AttrEClass(newChangeMode_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS, newChangeMode_AttrEClass, newChangeMode_AttrEClass));
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
		
		final int description_upperBound = 1;
		int nr_nonTransitive_description = 0;
		if(this.description != null){
				for(qmm.OrGroup og : this.description) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_description++;
		}
		if(nr_nonTransitive_description > description_upperBound && description_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXBasicObject contains " + nr_nonTransitive_description + " non-transitive, non-negated and non-generalized description(s). Only " + description_upperBound + " non-transitive, non-negated and non-generalized description(s) are allowed.",new Object[] { this }));
		
		final int version_upperBound = 1;
		int nr_nonTransitive_version = 0;
		if(this.version != null){
				for(qmm.OrGroup og : this.version) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_version++;
		}
		if(nr_nonTransitive_version > version_upperBound && version_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXBasicObject contains " + nr_nonTransitive_version + " non-transitive, non-negated and non-generalized version(s). Only " + version_upperBound + " non-transitive, non-negated and non-generalized version(s) are allowed.",new Object[] { this }));
		
		final int revision_upperBound = -1;
		int nr_nonTransitive_revision = 0;
		if(this.revision != null){
				for(qmm.OrGroup og : this.revision) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_revision++;
		}
		if(nr_nonTransitive_revision > revision_upperBound && revision_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXBasicObject contains " + nr_nonTransitive_revision + " non-transitive, non-negated and non-generalized revision(s). Only " + revision_upperBound + " non-transitive, non-negated and non-generalized revision(s) are allowed.",new Object[] { this }));
		
		final int copyright_upperBound = 1;
		int nr_nonTransitive_copyright = 0;
		if(this.copyright != null){
				for(qmm.OrGroup og : this.copyright) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_copyright++;
		}
		if(nr_nonTransitive_copyright > copyright_upperBound && copyright_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXBasicObject contains " + nr_nonTransitive_copyright + " non-transitive, non-negated and non-generalized copyright(s). Only " + copyright_upperBound + " non-transitive, non-negated and non-generalized copyright(s) are allowed.",new Object[] { this }));
		
		final int additionalInformation_upperBound = 1;
		int nr_nonTransitive_additionalInformation = 0;
		if(this.additionalInformation != null){
				for(qmm.OrGroup og : this.additionalInformation) if(!og.isTransitive() && !og.isNegated() && !og.isGeneralized()) nr_nonTransitive_additionalInformation++;
		}
		if(nr_nonTransitive_additionalInformation > additionalInformation_upperBound && additionalInformation_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "CAEXBasicObject contains " + nr_nonTransitive_additionalInformation + " non-transitive, non-negated and non-generalized additionalInformation(s). Only " + additionalInformation_upperBound + " non-transitive, non-negated and non-generalized additionalInformation(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_BASIC_OBJECT__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_BASIC_OBJECT__REVISION:
				return ((InternalEList<?>)getRevision()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				return ((InternalEList<?>)getCopyright()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				return ((InternalEList<?>)getAdditionalInformation()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS:
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
			case QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				return getDescription();
			case QmmPackage.CAEX_BASIC_OBJECT__VERSION:
				return getVersion();
			case QmmPackage.CAEX_BASIC_OBJECT__REVISION:
				return getRevision();
			case QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				return getCopyright();
			case QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS:
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
			case QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends Description_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends Version_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__REVISION:
				getRevision().clear();
				getRevision().addAll((Collection<? extends Revision_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				getCopyright().clear();
				getCopyright().addAll((Collection<? extends Copyright_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				getAdditionalInformation().addAll((Collection<? extends AdditionalInformation_Reference_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((CAEXBasicObject_changeMode_AttrEClass)newValue);
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
			case QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				getDescription().clear();
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__VERSION:
				getVersion().clear();
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__REVISION:
				getRevision().clear();
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				getCopyright().clear();
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				return;
			case QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((CAEXBasicObject_changeMode_AttrEClass)null);
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
			case QmmPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				return description != null && !description.isEmpty();
			case QmmPackage.CAEX_BASIC_OBJECT__VERSION:
				return version != null && !version.isEmpty();
			case QmmPackage.CAEX_BASIC_OBJECT__REVISION:
				return revision != null && !revision.isEmpty();
			case QmmPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				return copyright != null && !copyright.isEmpty();
			case QmmPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				return additionalInformation != null && !additionalInformation.isEmpty();
			case QmmPackage.CAEX_BASIC_OBJECT__CHANGE_MODE_ATTR_ECLASS:
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CAEXBasicObjectImpl
