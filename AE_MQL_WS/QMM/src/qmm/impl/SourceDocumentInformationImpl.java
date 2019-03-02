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

import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.SourceDocumentInformation;
import qmm.SourceDocumentInformation_lastWritingDateTime_AttrEClass;
import qmm.SourceDocumentInformation_originID_AttrEClass;
import qmm.SourceDocumentInformation_originName_AttrEClass;
import qmm.SourceDocumentInformation_originProjectID_AttrEClass;
import qmm.SourceDocumentInformation_originProjectTitle_AttrEClass;
import qmm.SourceDocumentInformation_originRelease_AttrEClass;
import qmm.SourceDocumentInformation_originVendorURL_AttrEClass;
import qmm.SourceDocumentInformation_originVendor_AttrEClass;
import qmm.SourceDocumentInformation_originVersion_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getLastWritingDateTime_AttrEClass <em>Last Writing Date Time Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginID_AttrEClass <em>Origin ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginName_AttrEClass <em>Origin Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginProjectID_AttrEClass <em>Origin Project ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginProjectTitle_AttrEClass <em>Origin Project Title Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginRelease_AttrEClass <em>Origin Release Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVendor_AttrEClass <em>Origin Vendor Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVendorURL_AttrEClass <em>Origin Vendor URL Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVersion_AttrEClass <em>Origin Version Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceDocumentInformationImpl extends RootClassImpl implements SourceDocumentInformation {
	/**
	 * The cached value of the '{@link #getLastWritingDateTime_AttrEClass() <em>Last Writing Date Time Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWritingDateTime_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_lastWritingDateTime_AttrEClass> lastWritingDateTime_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginID_AttrEClass() <em>Origin ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originID_AttrEClass> originID_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginName_AttrEClass() <em>Origin Name Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originName_AttrEClass> originName_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginProjectID_AttrEClass() <em>Origin Project ID Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originProjectID_AttrEClass> originProjectID_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginProjectTitle_AttrEClass() <em>Origin Project Title Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectTitle_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originProjectTitle_AttrEClass> originProjectTitle_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginRelease_AttrEClass() <em>Origin Release Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRelease_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originRelease_AttrEClass> originRelease_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVendor_AttrEClass() <em>Origin Vendor Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendor_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originVendor_AttrEClass> originVendor_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVendorURL_AttrEClass() <em>Origin Vendor URL Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendorURL_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originVendorURL_AttrEClass> originVendorURL_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVersion_AttrEClass() <em>Origin Version Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_originVersion_AttrEClass> originVersion_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDocumentInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSourceDocumentInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_lastWritingDateTime_AttrEClass> getLastWritingDateTime_AttrEClass() {
		if (lastWritingDateTime_AttrEClass == null) {
			lastWritingDateTime_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_lastWritingDateTime_AttrEClass>(SourceDocumentInformation_lastWritingDateTime_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS);
		}
		return lastWritingDateTime_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originID_AttrEClass> getOriginID_AttrEClass() {
		if (originID_AttrEClass == null) {
			originID_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originID_AttrEClass>(SourceDocumentInformation_originID_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS);
		}
		return originID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originName_AttrEClass> getOriginName_AttrEClass() {
		if (originName_AttrEClass == null) {
			originName_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originName_AttrEClass>(SourceDocumentInformation_originName_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS);
		}
		return originName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originProjectID_AttrEClass> getOriginProjectID_AttrEClass() {
		if (originProjectID_AttrEClass == null) {
			originProjectID_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originProjectID_AttrEClass>(SourceDocumentInformation_originProjectID_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS);
		}
		return originProjectID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originProjectTitle_AttrEClass> getOriginProjectTitle_AttrEClass() {
		if (originProjectTitle_AttrEClass == null) {
			originProjectTitle_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originProjectTitle_AttrEClass>(SourceDocumentInformation_originProjectTitle_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS);
		}
		return originProjectTitle_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originRelease_AttrEClass> getOriginRelease_AttrEClass() {
		if (originRelease_AttrEClass == null) {
			originRelease_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originRelease_AttrEClass>(SourceDocumentInformation_originRelease_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS);
		}
		return originRelease_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originVendor_AttrEClass> getOriginVendor_AttrEClass() {
		if (originVendor_AttrEClass == null) {
			originVendor_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originVendor_AttrEClass>(SourceDocumentInformation_originVendor_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS);
		}
		return originVendor_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originVendorURL_AttrEClass> getOriginVendorURL_AttrEClass() {
		if (originVendorURL_AttrEClass == null) {
			originVendorURL_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originVendorURL_AttrEClass>(SourceDocumentInformation_originVendorURL_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS);
		}
		return originVendorURL_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_originVersion_AttrEClass> getOriginVersion_AttrEClass() {
		if (originVersion_AttrEClass == null) {
			originVersion_AttrEClass = new EObjectContainmentEList<SourceDocumentInformation_originVersion_AttrEClass>(SourceDocumentInformation_originVersion_AttrEClass.class, this, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS);
		}
		return originVersion_AttrEClass;
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
		
		final int lastWritingDateTime_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_lastWritingDateTime_AttrEClass = 0;
		if(this.lastWritingDateTime_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.lastWritingDateTime_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_lastWritingDateTime_AttrEClass++;
		}
		if(nr_nonGeneralized_lastWritingDateTime_AttrEClass > lastWritingDateTime_AttrEClass_upperBound && lastWritingDateTime_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_lastWritingDateTime_AttrEClass + " non-generalized and non-negated lastWritingDateTime(s). Only " + lastWritingDateTime_AttrEClass_upperBound + " non-generalized and non-negated lastWritingDateTime(s) are allowed.",new Object[] { this }));
		
		final int originID_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originID_AttrEClass = 0;
		if(this.originID_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originID_AttrEClass++;
		}
		if(nr_nonGeneralized_originID_AttrEClass > originID_AttrEClass_upperBound && originID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originID_AttrEClass + " non-generalized and non-negated originID(s). Only " + originID_AttrEClass_upperBound + " non-generalized and non-negated originID(s) are allowed.",new Object[] { this }));
		
		final int originName_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originName_AttrEClass = 0;
		if(this.originName_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originName_AttrEClass++;
		}
		if(nr_nonGeneralized_originName_AttrEClass > originName_AttrEClass_upperBound && originName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originName_AttrEClass + " non-generalized and non-negated originName(s). Only " + originName_AttrEClass_upperBound + " non-generalized and non-negated originName(s) are allowed.",new Object[] { this }));
		
		final int originProjectID_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originProjectID_AttrEClass = 0;
		if(this.originProjectID_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originProjectID_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originProjectID_AttrEClass++;
		}
		if(nr_nonGeneralized_originProjectID_AttrEClass > originProjectID_AttrEClass_upperBound && originProjectID_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originProjectID_AttrEClass + " non-generalized and non-negated originProjectID(s). Only " + originProjectID_AttrEClass_upperBound + " non-generalized and non-negated originProjectID(s) are allowed.",new Object[] { this }));
		
		final int originProjectTitle_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originProjectTitle_AttrEClass = 0;
		if(this.originProjectTitle_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originProjectTitle_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originProjectTitle_AttrEClass++;
		}
		if(nr_nonGeneralized_originProjectTitle_AttrEClass > originProjectTitle_AttrEClass_upperBound && originProjectTitle_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originProjectTitle_AttrEClass + " non-generalized and non-negated originProjectTitle(s). Only " + originProjectTitle_AttrEClass_upperBound + " non-generalized and non-negated originProjectTitle(s) are allowed.",new Object[] { this }));
		
		final int originRelease_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originRelease_AttrEClass = 0;
		if(this.originRelease_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originRelease_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originRelease_AttrEClass++;
		}
		if(nr_nonGeneralized_originRelease_AttrEClass > originRelease_AttrEClass_upperBound && originRelease_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originRelease_AttrEClass + " non-generalized and non-negated originRelease(s). Only " + originRelease_AttrEClass_upperBound + " non-generalized and non-negated originRelease(s) are allowed.",new Object[] { this }));
		
		final int originVendor_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originVendor_AttrEClass = 0;
		if(this.originVendor_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originVendor_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originVendor_AttrEClass++;
		}
		if(nr_nonGeneralized_originVendor_AttrEClass > originVendor_AttrEClass_upperBound && originVendor_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originVendor_AttrEClass + " non-generalized and non-negated originVendor(s). Only " + originVendor_AttrEClass_upperBound + " non-generalized and non-negated originVendor(s) are allowed.",new Object[] { this }));
		
		final int originVendorURL_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originVendorURL_AttrEClass = 0;
		if(this.originVendorURL_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originVendorURL_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originVendorURL_AttrEClass++;
		}
		if(nr_nonGeneralized_originVendorURL_AttrEClass > originVendorURL_AttrEClass_upperBound && originVendorURL_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originVendorURL_AttrEClass + " non-generalized and non-negated originVendorURL(s). Only " + originVendorURL_AttrEClass_upperBound + " non-generalized and non-negated originVendorURL(s) are allowed.",new Object[] { this }));
		
		final int originVersion_AttrEClass_upperBound = 1;
		int nr_nonGeneralized_originVersion_AttrEClass = 0;
		if(this.originVersion_AttrEClass != null){
				for(qmm.RegularAttributeEClass attr : this.originVersion_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_originVersion_AttrEClass++;
		}
		if(nr_nonGeneralized_originVersion_AttrEClass > originVersion_AttrEClass_upperBound && originVersion_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "SourceDocumentInformation contains " + nr_nonGeneralized_originVersion_AttrEClass + " non-generalized and non-negated originVersion(s). Only " + originVersion_AttrEClass_upperBound + " non-generalized and non-negated originVersion(s) are allowed.",new Object[] { this }));
		
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return ((InternalEList<?>)getLastWritingDateTime_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginID_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginName_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginProjectID_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginProjectTitle_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginRelease_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginVendor_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginVendorURL_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return ((InternalEList<?>)getOriginVersion_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return getLastWritingDateTime_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return getOriginID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return getOriginName_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return getOriginProjectID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return getOriginProjectTitle_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return getOriginRelease_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return getOriginVendor_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return getOriginVendorURL_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return getOriginVersion_AttrEClass();
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				getLastWritingDateTime_AttrEClass().clear();
				getLastWritingDateTime_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_lastWritingDateTime_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				getOriginID_AttrEClass().clear();
				getOriginID_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originID_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				getOriginName_AttrEClass().clear();
				getOriginName_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originName_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				getOriginProjectID_AttrEClass().clear();
				getOriginProjectID_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originProjectID_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				getOriginProjectTitle_AttrEClass().clear();
				getOriginProjectTitle_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originProjectTitle_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				getOriginRelease_AttrEClass().clear();
				getOriginRelease_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originRelease_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				getOriginVendor_AttrEClass().clear();
				getOriginVendor_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originVendor_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				getOriginVendorURL_AttrEClass().clear();
				getOriginVendorURL_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originVendorURL_AttrEClass>)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				getOriginVersion_AttrEClass().clear();
				getOriginVersion_AttrEClass().addAll((Collection<? extends SourceDocumentInformation_originVersion_AttrEClass>)newValue);
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				getLastWritingDateTime_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				getOriginID_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				getOriginName_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				getOriginProjectID_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				getOriginProjectTitle_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				getOriginRelease_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				getOriginVendor_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				getOriginVendorURL_AttrEClass().clear();
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				getOriginVersion_AttrEClass().clear();
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return lastWritingDateTime_AttrEClass != null && !lastWritingDateTime_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return originID_AttrEClass != null && !originID_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return originName_AttrEClass != null && !originName_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return originProjectID_AttrEClass != null && !originProjectID_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return originProjectTitle_AttrEClass != null && !originProjectTitle_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return originRelease_AttrEClass != null && !originRelease_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return originVendor_AttrEClass != null && !originVendor_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return originVendorURL_AttrEClass != null && !originVendorURL_AttrEClass.isEmpty();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return originVersion_AttrEClass != null && !originVersion_AttrEClass.isEmpty();
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
				case QmmPackage.NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SOURCE_DOCUMENT_INFORMATION___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceDocumentInformationImpl
