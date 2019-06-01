package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import qmm.AttributeEClass
import qmm.NamedElement
import qmm.FindQuery
import qmm.FindQueryCollection
import java.util.LinkedHashSet

class MQLGenerator extends AbstractGenerator implements IGenerator{
	 
	public static FindQueryCollection queryCollection = null;	
	 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) { 
		System.out.println("MQL Query Compiler: Generating Query.vql ... ")
		
		var code = "package dmm\nimport \"/DMM/model/DMM.ecore\"\n\n";
		queryCollection = resource.contents.filter(FindQueryCollection).get(0)		
		Collections.initLibs(queryCollection);
		code += generateCode();
		
		try{
			fsa.generateFile("Query.vql", code);
			System.out.println("MQL Query Compiler: Generation of Query.vql completed.")
		}catch(Exception e){
			System.out.println("MQL Query Compiler: Exception caught. Stacktrace: ...")
			e.printStackTrace 
		}
		
	}
	
	private def String generateCode(){
		var code = "";
		code += writeStartingPatterns()
		code += OrGroupWriters.writeOrGroupPatterns()
		code += RootClassWriters.writeRootClassPatterns()		
		code += AttributeWriters.writeAttributePatterns()
		code += OperatorWriters.writeEvaluationOperatorPatterns		
		code += OperatorWriters.writeArgumentPatterns()
		code += ReferenceFromToWriters.writeReferenceFromToPatterns()
		code += OrGroupWriters.writeOrGroupReferencePatterns()
		return code;
	}
	
	private def String writeStartingPatterns(){
		var code = "";
		val findQueries = queryCollection.findQueries;
		for(var i=0; i<findQueries.size; i++) code += writeStartingPattern(findQueries.get(i),i);
		return code;
	}
	
	private def String writeStartingPattern(FindQuery query, int queryCounter){
		var code = ""
		var parameters = "";
		var rootClasses = query.rootClass;
		var selectClause = query.select;
		
		if(selectClause !== null){
			val namedElements = selectClause.namedElements;
			val noDuplicates = new LinkedHashSet<NamedElement>(namedElements);
			for(var i=0; i < noDuplicates.size; i++){
				parameters += noDuplicates.get(i).name;
				if(i < noDuplicates.size() - 1) parameters += ", ";	
			}
		}
		
		for(var i=0; i < rootClasses.size; i++){
			var rc = rootClasses.get(i);
			if(selectClause === null){
				parameters += rc.name;
				if(i < rootClasses.size() - 1) parameters += ", ";
			}
			var parametersString = rc.name + Utils.getContainedAndReferencedOrGroupsHeader_excluding_negated_elements(rc);
			for(AttributeEClass a: Utils.collect_All_Referencable_RegularAttributeEClasses(rc)) parametersString += "," + a.getName();
			code += "	find " +  Collections.rootClassLib.get(rc) + "(" + parametersString + ");\n"
		}
		code += "}\n"
		code += "\n"
		
		return "pattern query_" + queryCounter + "(" + parameters + "){\n" + code;
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}	
}
