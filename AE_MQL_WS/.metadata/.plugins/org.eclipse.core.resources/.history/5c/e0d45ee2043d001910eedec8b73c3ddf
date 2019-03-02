/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.SelectClause#getNamedElements <em>Named Elements</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getSelectClause()
 * @model
 * @generated
 */
public interface SelectClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Elements</b></em>' reference list.
	 * The list contents are of type {@link qmm.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Elements</em>' reference list.
	 * @see qmm.QmmPackage#getSelectClause_NamedElements()
	 * @model required="true"
	 * @generated
	 */
	EList<NamedElement> getNamedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(qmm.NamedElement n : namedElements){\n\t\t\tif(n instanceof qmm.NegatableElement && ((qmm.NegatableElement)n).isNegated()){\n\t\t\t\tString errorMessage = n.getName() + \" is negated. It is not possible to select negated elements\";\n\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));\n\t\t\t}\n\t\t\torg.eclipse.emf.ecore.EObject eContainer = n.eContainer();\n\t\t\twhile(eContainer != null){\n\t\t\t\tif(eContainer instanceof qmm.Containment_OrGroup){\n\t\t\t\t\tEList containment = (EList)eContainer.eGet(eContainer.eClass().getEStructuralFeature(\"containment\"));\n\t\t\t\t\tif(containment.size() > 1){\n\t\t\t\t\t\tString errorMessage = n.getName() + \" is defined within an Or-branch of node \" + ((qmm.OrGroup)eContainer).getName() + \". It\'s atm not possible to reference nodes that are defined in Or-branches of other nodes.\";\n\t\t\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tif(eContainer instanceof qmm.OrGroup && ((qmm.OrGroup)eContainer).isNegated()){\n\t\t\t\t\t\tString errorMessage = n.getName() + \" is a negated pattern or is defined within a negated pattern. It\'s not possible to reference nodes that are negated or are defined within negated patterns.\";\n\t\t\t\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));\n\t\t\t\t}\n\t\t\t\teContainer = eContainer.eContainer();\n\t\t\t}\n\t\t}\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // SelectClause
