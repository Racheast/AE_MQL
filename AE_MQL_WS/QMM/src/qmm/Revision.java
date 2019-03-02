/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Revision#getRevisionDate_AttrEClass <em>Revision Date Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getOldVersion_AttrEClass <em>Old Version Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getNewVersion_AttrEClass <em>New Version Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getAuthorName_AttrEClass <em>Author Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getComment_AttrEClass <em>Comment Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Revision Date Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_revisionDate_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Date Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Date Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRevision_RevisionDate_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_revisionDate_AttrEClass> getRevisionDate_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Old Version Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_oldVersion_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRevision_OldVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_oldVersion_AttrEClass> getOldVersion_AttrEClass();

	/**
	 * Returns the value of the '<em><b>New Version Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_newVersion_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRevision_NewVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_newVersion_AttrEClass> getNewVersion_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Author Name Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_authorName_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRevision_AuthorName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_authorName_AttrEClass> getAuthorName_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Comment Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_comment_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getRevision_Comment_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_comment_AttrEClass> getComment_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\nif(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int revisionDate_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_revisionDate_AttrEClass = 0;\nif(this.revisionDate_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.revisionDate_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_revisionDate_AttrEClass++;\n}\nif(nr_nonGeneralized_revisionDate_AttrEClass > revisionDate_AttrEClass_upperBound && revisionDate_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Revision contains \" + nr_nonGeneralized_revisionDate_AttrEClass + \" non-generalized and non-negated revisionDate(s). Only \" + revisionDate_AttrEClass_upperBound + \" non-generalized and non-negated revisionDate(s) are allowed.\",new Object[] { this }));\n\nfinal int oldVersion_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_oldVersion_AttrEClass = 0;\nif(this.oldVersion_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.oldVersion_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_oldVersion_AttrEClass++;\n}\nif(nr_nonGeneralized_oldVersion_AttrEClass > oldVersion_AttrEClass_upperBound && oldVersion_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Revision contains \" + nr_nonGeneralized_oldVersion_AttrEClass + \" non-generalized and non-negated oldVersion(s). Only \" + oldVersion_AttrEClass_upperBound + \" non-generalized and non-negated oldVersion(s) are allowed.\",new Object[] { this }));\n\nfinal int newVersion_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_newVersion_AttrEClass = 0;\nif(this.newVersion_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.newVersion_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_newVersion_AttrEClass++;\n}\nif(nr_nonGeneralized_newVersion_AttrEClass > newVersion_AttrEClass_upperBound && newVersion_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Revision contains \" + nr_nonGeneralized_newVersion_AttrEClass + \" non-generalized and non-negated newVersion(s). Only \" + newVersion_AttrEClass_upperBound + \" non-generalized and non-negated newVersion(s) are allowed.\",new Object[] { this }));\n\nfinal int authorName_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_authorName_AttrEClass = 0;\nif(this.authorName_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.authorName_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_authorName_AttrEClass++;\n}\nif(nr_nonGeneralized_authorName_AttrEClass > authorName_AttrEClass_upperBound && authorName_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Revision contains \" + nr_nonGeneralized_authorName_AttrEClass + \" non-generalized and non-negated authorName(s). Only \" + authorName_AttrEClass_upperBound + \" non-generalized and non-negated authorName(s) are allowed.\",new Object[] { this }));\n\nfinal int comment_AttrEClass_upperBound = 1;\nint nr_nonGeneralized_comment_AttrEClass = 0;\nif(this.comment_AttrEClass != null){\n\t\tfor(qmm.RegularAttributeEClass attr : this.comment_AttrEClass) if(!attr.isGeneralized() && !attr.isNegated()) nr_nonGeneralized_comment_AttrEClass++;\n}\nif(nr_nonGeneralized_comment_AttrEClass > comment_AttrEClass_upperBound && comment_AttrEClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Revision contains \" + nr_nonGeneralized_comment_AttrEClass + \" non-generalized and non-negated comment(s). Only \" + comment_AttrEClass_upperBound + \" non-generalized and non-negated comment(s) are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Revision
