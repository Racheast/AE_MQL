package org.xtext.generator

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EClassifier

class ReferenceFromToWriters {
	static def String writeReferenceFromToPatterns(){
		var code = "";
		val keys =  Collections.referenceFromToLib.keySet;
		for(EClass ec: keys){
			var hashMap =  Collections.referenceFromToLib.get(ec);
			val keys2 = hashMap.keySet;
			for(EStructuralFeature ef: keys2){
				val patternName = hashMap.get(ef);
				val to_type = (ef.EType as EClass).EReferences.get(0).EType as EClassifier;
				var to_type_name = "";
				
				if(to_type.name.endsWith("_Reference_OrGroup")){
					to_type_name = to_type.name.substring(0, to_type.name.indexOf("_Reference_OrGroup"));
				}else if (to_type.name.endsWith("_Containment_OrGroup")){
					to_type_name = to_type.name.substring(0, to_type.name.indexOf("_Containment_OrGroup"));
				}else{
					to_type_name = to_type.name;
				}
				
				code += "pattern " + patternName + "(from:" + ec.name + ", to:" + to_type_name + "){\n";
				code += "    " + ec.name + "." + ef.name + "(from, to);\n"
				code += "}\n\n";
			}
		}
		return code;
	}
	
}