package org.xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import qmm.RootClass
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScopeProvider
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.ECollections
import org.eclipse.emf.ecore.EClassifier
import qmm.QmmPackage
import qmm.CalculateableElement_ReferenceArgument
import qmm.Count_AggregationOperator
import qmm.SelectClause
import qmm.NegatableElement
import qmm.FindQuery
import qmm.Reference_OrGroup

class MQLScopeProvider extends AbstractMQLScopeProvider implements IScopeProvider {
	override getScope(EObject context, EReference reference) {
		if (context instanceof CalculateableElement_ReferenceArgument) {
			val containingRootClass = EcoreUtil2.getContainerOfType(context, RootClass);
			val candidates = getDirectContentsOfType(containingRootClass,context.eClass.getEStructuralFeature("reference").EType)
			return Scopes.scopeFor(candidates)
		} else if (context instanceof Count_AggregationOperator) {
			val containingRootClass = EcoreUtil2.getContainerOfType(context, RootClass);
			val candidates = getDirectContentsOfType(containingRootClass, QmmPackage.eINSTANCE.countable)
			return Scopes.scopeFor(candidates)
		} else if (context instanceof SelectClause || context instanceof FindQuery) {
			return Scopes.scopeFor(getAllNamedElementsForSelectClause(context));
		} else if (context instanceof Reference_OrGroup){
			return Scopes.scopeFor(getAllRootClasses(context as Reference_OrGroup));
		}
		return super.getScope(context, reference);
	}
	
	private def EList<EObject> getDirectContentsOfType(EObject eo, EClassifier type){
		var contents = new ArrayList<EObject>();
		for(EObject eo2 : eo.eContents){
			if(type.isInstance(eo2)){
				contents.add(eo2);
			}else if(eo2 instanceof qmm.OrGroup){
				contents.add(eo2);
			} 
		}
		return ECollections.asEList(contents);
	}
	
	private def EList<EObject> getAllNamedElementsForSelectClause(EObject context){
		val findQuery = EcoreUtil2.getContainerOfType(context, qmm.FindQuery) as FindQuery;
		var candidates = new ArrayList<EObject>();
		var treeIter = findQuery.eAllContents;
		while(treeIter.hasNext()){
			val eo = treeIter.next();
			if(eo instanceof qmm.NamedElement && !(eo instanceof qmm.EnumerationAttributeEClass)){  //EnumerationAttributeEClasses can't be selected via Viatra Pattern Algorithm at the moment
				var isReferencable = true;
				if(eo instanceof NegatableElement && (eo as NegatableElement).isNegated){ 
					isReferencable = false;
				}else if(eo.eContainer instanceof qmm.OrGroup && (eo.eContainer as qmm.OrGroup).isNegated){
					isReferencable = false;
				}
				var container = eo.eContainer;
				while(container !== null){
					if(container instanceof NegatableElement && (container as NegatableElement).isNegated) isReferencable = false;
					container = container.eContainer();
				}
				if(isReferencable) candidates.add(eo);
			}
		}
		return ECollections.asEList(candidates);
	}
	
	private def EList<EObject> getAllRootClasses(Reference_OrGroup context){
		val findQuery = EcoreUtil2.getContainerOfType(context, qmm.FindQuery) as FindQuery;
		var candidates = new ArrayList<EObject>();
		var treeIter = findQuery.eAllContents;
		var referenceType = context.eClass.getEStructuralFeature("reference").EType;
		while(treeIter.hasNext()){
			val eo = treeIter.next();
			if(eo instanceof RootClass && referenceType.isInstance(eo)) candidates.add(eo);
		}
		return ECollections.asEList(candidates);
	}
}
