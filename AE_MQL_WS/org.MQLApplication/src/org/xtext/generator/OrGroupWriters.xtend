package org.xtext.generator

import qmm.RootClass;
import org.eclipse.emf.common.util.EList
import qmm.NamedElement
import qmm.OrGroup
import java.util.HashSet
import qmm.Containment_OrGroup
import qmm.Reference_OrGroup

class OrGroupWriters {
	static def String writeOrGroupPatterns(){
		var code = "";
		for(OrGroup og:  Collections.orGroupLib.keySet){
			
			code += "pattern " +  Collections.orGroupLib.get(og) + "(" + Utils.writeOrGroupParameters(og) + "){\n"						
			
			if(og instanceof Containment_OrGroup){
				var rootClasses = Utils.getRootClassesOfContainmentOrGroup(og);
				if(rootClasses.size <= 0){
					code += "	" + Utils.getTypeNameOfOrGroup(og) + "(" + og.name + ");\n}\n";
				}else{
					for(var i=0; i<rootClasses.size; i++){
						
						if(!og.isNegated)
							code += "	" + Utils.getTypeNameOfOrGroup(og) + "(" + og.name + ");\n";
						
						val rc = rootClasses.get(i);
						
						//WRITE EQUALITY CONSTRAINTS HERE
						var namedElements_of_rc = Utils.getAllContainedAndReferencedNamedElements_for_RootClass(rc);
						var equalityCandidates = Utils.collectOrGroupHeaderCandidates(og);
						
						equalityCandidates.removeAll(namedElements_of_rc);
						equalityCandidates.remove(og);
						
						for(NamedElement n: equalityCandidates){
							 if(n instanceof RootClass && !Utils.containedByNegatedOrGroup(n)){
							 	if(n.eContainer instanceof Containment_OrGroup){
							 		code += "    " + Utils.getTypeNameOfOrGroup(n.eContainer as OrGroup) + "(" + n.name + ");\n";
							 	}
							 	else{
							 		code += "    " + n.eClass.name + "(" + n.name + ");\n";
							 	}
							 }else if(n instanceof OrGroup && !Utils.containedBy(rc,n)){
							 	code += "    " + Utils.getTypeNameOfOrGroup(n as OrGroup) + "(" + n.name + ");\n";
							 }
							 if(n.eContainer === og || (n.eContainer instanceof OrGroup && (n.eContainer as OrGroup).isNegated) || (n instanceof RootClass && Utils.containedBy(og,n) && !Utils.containedBy(rc,n)))
							 	code +=	"    " + og.name + " == " + n.name + ";\n"; 
						}
						
						code += "    find " +  Collections.rootClassLib.get(rc) + "(" + Utils.writeRootClassParameters_for_patternReference_from_OrGroups(rc) + ");\n"						
						code += "}\n"
						
						if(i < rootClasses.size - 1){
							code += "or{\n"
						}
					}
				}
			}else if(og instanceof Reference_OrGroup){
				var references = og.eGet(og.eClass().getEStructuralFeature("reference")) as EList<RootClass>;
				if(references.size <= 0){
					code += "	" + Utils.getTypeNameOfOrGroup(og) + "(" + og.name + ");\n}\n";
				}else { 
					for(var i=0; i<references.size(); i++){
						if(!og.isNegated)
							code += "	" + Utils.getTypeNameOfOrGroup(og) + "(" + og.name + ");\n";
						
						val rc = references.get(i);
						
						//write declarations here
						val referencesWithoutDuplicates = new HashSet<RootClass>(references);
						for(RootClass rcTemp: referencesWithoutDuplicates){
							code += "    " + rcTemp.eClass.name + "(" + rcTemp.name + ");\n";
						}
						
						code += "    " + og.name + " == " + rc.name + ";\n"
						code += "}\n";
						if(i < references.size -1){
							code += "or{\n";
						}
					}
				}
			}
				
			code += "\n"	
		}
		return code;
	}
	
	static def String writeOrGroupReferencePatterns(){
		var code = "";
		
		for(OrGroup og:  Collections.orGroupLib.keySet){
			var transitive = "";	
			var rc = og.eContainer as RootClass;
			
			if(og.transitive) transitive = "+";
				
			code += "pattern " +  Collections.orGroupLib.get(og) + "_ref(" + Utils.writeOrGroupReferenceParameters(og) + "){\n";
			code += "    find " +  Collections.orGroupLib.get(og) + "(" + Utils.writeOrGroupParameters(og) + ");\n";
			code += "    find " +  Collections.referenceFromToLib.get(og.eContainer.eClass).get(og.eContainingFeature) + transitive + "(" + rc.name + "," + og.name + ");\n";
			code += "}\n\n";
		}
			
		return code;
	}
}