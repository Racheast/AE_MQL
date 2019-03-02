/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qmm.NamedElement;
import qmm.QmmPackage;
import qmm.SelectClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SelectClauseImpl#getNamedElements <em>Named Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectClauseImpl extends MinimalEObjectImpl.Container implements SelectClause {
	/**
	 * The cached value of the '{@link #getNamedElements() <em>Named Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> namedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSelectClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedElements() {
		if (namedElements == null) {
			namedElements = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, QmmPackage.SELECT_CLAUSE__NAMED_ELEMENTS);
		}
		return namedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		for(qmm.NamedElement n : namedElements){
					if(n instanceof qmm.NegatableElement && ((qmm.NegatableElement)n).isNegated()){
						String errorMessage = n.getName() + " is negated. It is not possible to select negated elements";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));
					}
					org.eclipse.emf.ecore.EObject eContainer = n.eContainer();
					while(eContainer != null){
						if(eContainer instanceof qmm.Containment_OrGroup){
							EList containment = (EList)eContainer.eGet(eContainer.eClass().getEStructuralFeature("containment"));
							if(containment.size() > 1){
								String errorMessage = n.getName() + " is defined within an Or-branch of node " + ((qmm.OrGroup)eContainer).getName() + ". It's atm not possible to reference nodes that are defined in Or-branches of other nodes.";
								diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));
							}
						}
						if(eContainer instanceof qmm.OrGroup && ((qmm.OrGroup)eContainer).isNegated()){
								String errorMessage = n.getName() + " is a negated pattern or is defined within a negated pattern. It's not possible to reference nodes that are negated or are defined within negated patterns.";
								diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.SELECT_CLAUSE__VALIDATE, errorMessage,new Object[] { this }));
						}
						eContainer = eContainer.eContainer();
					}
				}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.SELECT_CLAUSE__NAMED_ELEMENTS:
				return getNamedElements();
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
			case QmmPackage.SELECT_CLAUSE__NAMED_ELEMENTS:
				getNamedElements().clear();
				getNamedElements().addAll((Collection<? extends NamedElement>)newValue);
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
			case QmmPackage.SELECT_CLAUSE__NAMED_ELEMENTS:
				getNamedElements().clear();
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
			case QmmPackage.SELECT_CLAUSE__NAMED_ELEMENTS:
				return namedElements != null && !namedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.SELECT_CLAUSE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectClauseImpl
