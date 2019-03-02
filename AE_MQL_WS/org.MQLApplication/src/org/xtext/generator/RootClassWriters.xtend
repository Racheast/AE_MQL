package org.xtext.generator

import qmm.RootClass;
import qmm.AttributeEClass
import org.eclipse.emf.common.util.EList
import qmm.EnumerationAttributeEClass
import qmm.impl.RegularAttributeEClassImpl
import qmm.NamedElement
import qmm.OrGroup
import java.util.HashSet
import qmm.EvaluationOperator

class RootClassWriters {
	static def String writeRootClassPatterns(){
		var code = "";
		for(RootClass rc : Collections.rootClassLib.keySet()){
			code += "pattern " + Collections.rootClassLib.get(rc) + "(" + Utils.writeRootClassParameters(rc) + "){\n";
			code += writeRootClassBody(rc);
			code += "}\n\n";
		}
		return code;
	}
	
	private static def String writeRootClassBody(RootClass rc){
		var code = writeReferencedAndContained_RootClassDeclarations(rc);
		code += writeAttributeReferences(rc);
		code += writeOrGroupReferences(rc); 
		code += Utils.writeInequalityConstraints(rc);
		code += writeEvaluationOperatorReferences(rc);
		return code;
	}
	
	private static def String writeReferencedAndContained_RootClassDeclarations(RootClass rc){
		var code = "";
		var containedAndReferencedRootClasses_and_OrGroups = new HashSet<NamedElement>(Utils.getReferencedRootClasses(rc));
		containedAndReferencedRootClasses_and_OrGroups.add(rc);
		
		containedAndReferencedRootClasses_and_OrGroups.addAll(Utils.getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(rc));
		for(NamedElement n: containedAndReferencedRootClasses_and_OrGroups){
			if(n===rc || n instanceof RootClass && !(n.eContainer instanceof OrGroup)){ 
				code += "    " + n.eClass.name + "(" + n.name + ");\n";
			}else if(n instanceof RootClass && n.eContainer!==null && n.eContainer instanceof OrGroup){
				code += "    " + Utils.getTypeNameOfOrGroup(n.eContainer as OrGroup) + "(" + n.name + ");\n";
			}else if(n instanceof OrGroup && !(n as OrGroup).isNegated){
				code += "    " + Utils.getTypeNameOfOrGroup(n as OrGroup) + "(" + n.name + ");\n";
			}
		}
		
		return code;
	}
	
	private static def String writeOrGroupReferences(RootClass rc){
		var code ="";
		
		val orGroups = Utils.getOrGroupsOfRootClass(rc);
		
		for(var i=0; i<orGroups.size; i++){
			val og = orGroups.get(i);
			var negated = "";
						
			if(og.negated) negated = "neg "; 
		
			code += "    " + negated + "find " +  Collections.orGroupLib.get(og) + "_ref(" + Utils.writeOrGroupReferenceParameters(og) + ");\n"			
		}
		return code;
	}
	
	private static def String writeAttributeReferences(RootClass rc){
		var code = "";
		for(AttributeEClass a: Utils.getDirectReferencedAttributes(rc)){
			code += writeAttributeReference(a)
		}
		return code;
	}
	
	private static def String writeEvaluationOperatorReferences(RootClass rc){
		var code = "";
	
		val evaluationOperators = rc.eGet(rc.eClass.getEStructuralFeature("EvaluationOperator")) as EList<EvaluationOperator>;
		for(EvaluationOperator evaluationOperator : evaluationOperators){					
			val firstLevelEvaluationFunctionalOperators = Utils.collectAllEvaluationFunctionalOperators(evaluationOperator)
			for(var j = 0; j < firstLevelEvaluationFunctionalOperators.size; j++){
				val o = firstLevelEvaluationFunctionalOperators.get(j);
				code += "    find " +  Collections.evaluationOperatorLib.get(o) + "(" + rc.name + ", " + Utils.evaluationOperatorRefNames.get(o) + ");\n"
			}			
			code += "    check(" + OperatorWriters.writeOperator(evaluationOperator,"") + ");\n"	
		}
		
		return code;
	}
	
		
	private static def String writeAttributeReference(AttributeEClass attr){
		var negated = "";
		var rc = attr.eContainer() as RootClass;
		if(attr.negated)
			negated = "neg ";
		if(attr instanceof EnumerationAttributeEClass){
		'''    «negated»find «Collections.attrLib.get(attr)»(«rc.name»);
		'''
		}else if(attr instanceof RegularAttributeEClassImpl){
		'''    «negated»find «Collections.attrLib.get(attr)»(«rc.name»,«attr.name»);
		'''	
		}	
	}
}