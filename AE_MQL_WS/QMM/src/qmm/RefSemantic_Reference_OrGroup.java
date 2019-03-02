/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Semantic Reference Or Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.RefSemantic_Reference_OrGroup#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRefSemantic_Reference_OrGroup()
 * @model
 * @generated
 */
public interface RefSemantic_Reference_OrGroup extends Reference_OrGroup {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link qmm.RefSemantic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see qmm.QmmPackage#getRefSemantic_Reference_OrGroup_Reference()
	 * @model
	 * @generated
	 */
	EList<RefSemantic> getReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.validate(diagnostic, context);\n\t\tjava.util.ArrayList<org.eclipse.emf.ecore.EObject> thisContainers = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();\n\t\torg.eclipse.emf.ecore.EObject thisContainer = this.eContainer();\n\n\t\twhile(thisContainer != null){\n\t\t\tthisContainers.add(thisContainer);\n\t\t\tthisContainer = thisContainer.eContainer();\n\t\t}\n\n\t\tfor(qmm.RootClass ogt: this.reference){\n\t\t\torg.eclipse.emf.ecore.EObject eContainer = ogt.eContainer();\n\t\t\twhile(eContainer != null && !thisContainers.contains(ogt)){\n\t\t\t\tif(eContainer instanceof qmm.Containment_OrGroup){\n\t\t\t\t\tEList containment = (EList)eContainer.eGet(eContainer.eClass().getEStructuralFeature(\"containment\"));\n\n\t\t\t\t\tif(eContainer == this.eContainer().eContainer()) break;\n\n\t\t\t\t\tif(containment.size() > 1){\n\t\t\t\t\t\tString errorMessage = ogt.getName() + \" is defined within an alternative Or-branch of node \" + ((qmm.OrGroup)eContainer).getName() + \". It\'s not possible to reference nodes that are defined in alternative Or-branches.\";\n\t\t\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OR_GROUP__VALIDATE, errorMessage,new Object[] { this }));\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tif(eContainer instanceof qmm.OrGroup && ((qmm.OrGroup)eContainer).isNegated()){\n\t\t\t\t\t\tif(!thisContainers.contains(eContainer)){\n\t\t\t\t\t\t\tString errorMessage = ((qmm.OrGroup)ogt).getName() + \" is a negated pattern or is defined within a negated pattern. It\'s not possible to reference nodes that are negated or are defined within negated patterns.\";\n\t\t\t\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OR_GROUP__VALIDATE, errorMessage,new Object[] { this }));\n\t\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\teContainer = eContainer.eContainer();\n\t\t\t}\n\t\t}\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // RefSemantic_Reference_OrGroup
