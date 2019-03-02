package org.xtext.generator

import qmm.RootClass;import qmm.AttributeEClass
import qmm.Operator
import qmm.ExpressionOperator
import qmm.RegularAttributeEClass
import qmm.EnumerationAttributeEClass
import qmm.EnumerationOperator
import org.eclipse.emf.common.util.Enumerator
import qmm.OrGroup
import qmm.EvaluationFunctionalOperator

class AttributeWriters {
 	static def String writeAttributePatterns(){
		var code = "";
		for(AttributeEClass attr: Collections.attrLib.keySet) code += "\n" + writeAttributePattern(attr);
		return code;
	}
	
	private static def String writeAttributePattern(AttributeEClass attr){
		var code = "";
		if(attr instanceof RegularAttributeEClass){
			code = writeRegularAttributePattern(attr as RegularAttributeEClass);
		}else if(attr instanceof EnumerationAttributeEClass){
			code = writeEnumerationAttributePattern(attr as EnumerationAttributeEClass);
		}
		return code;
	}
	
	private static def String writeRegularAttributePattern(RegularAttributeEClass attr){
		val operator = attr.eGet(attr.eClass.getEStructuralFeature("operator")) as Operator;
		val evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator);
		val containingFeatureName = attr.eContainingFeature.name.substring(0,attr.eContainingFeature.name.indexOf("_AttrEClass"))
		val rc = attr.eContainer as RootClass;
		
		var code = "pattern " +  Collections.attrLib.get(attr) + "(" + rc.name + ":" + attr.eContainer.eClass.name + ", " + attr.name + "){";
		
		for(EvaluationFunctionalOperator aop: evaluationOperators){
			code += "\n    find " +  Collections.evaluationOperatorLib.get(aop) + "(" + rc.name + ", " + Utils.evaluationOperatorRefNames.get(aop) + ");";
		}
		
		code += "\n    " + attr.eContainer.eClass.name + "." + containingFeatureName + "(" + rc.name + ", " + attr.name + ");";
		
		if(operator != null) code += writeReferences(operator as ExpressionOperator);
		
		code += Utils.writeInequalityConstraints(attr);
		
		if(operator != null) code += "\n" + writeCheckClauseForAttribute(attr);
		
		code += "\n}\n\n";
		
		return code;
	}
	
	private static def String writeEnumerationAttributePattern(EnumerationAttributeEClass attr){
		var operator = attr.eGet(attr.eClass.getEStructuralFeature("operator"));
		var enumString = "x";
		val containingFeatureName = attr.eContainingFeature.name.substring(0,attr.eContainingFeature.name.indexOf("_AttrEClass"))
		val rc = attr.eContainer as RootClass;
		
		var code = "pattern " +  Collections.attrLib.get(attr) + "(" + rc.name + ":" + attr.eContainer.eClass.name + "){\n";
		if(operator === null){
			code += "	" + attr.eContainer.eClass.name + "." + containingFeatureName + "(" + rc.name + "," + enumString + ");\n}";
		}else{		
			while(operator !== null){
				val enumOperator = operator as EnumerationOperator;
				val enumLiteral = enumOperator.eGet(enumOperator.eClass.getEStructuralFeature("argument")) as Enumerator;
				enumString = "::" + enumLiteral.toString;
				code += "	" + attr.eContainer.eClass.name + "." + containingFeatureName + "(" + rc.name + "," + enumString + ");\n}";
				operator = enumOperator.eGet(enumOperator.eClass.getEStructuralFeature("or"));
				if(operator !== null) code += "or{\n";
			}
		}
		code += "\n\n";
		
		return code;
	}
	
	private static def String writeReferences(ExpressionOperator operator){
		var code = "";
		for(AttributeEClass referencedAttribute: Utils.collectReferenceAttributes(operator)){
			val hashCode = System.identityHashCode(referencedAttribute)
			val orGroup = referencedAttribute.eContainer.eContainer as OrGroup;
			code += "\n    find " +  Collections.attrLib.get(referencedAttribute) + "(" + orGroup.name + "," + referencedAttribute.name + ");\n" 
		}
		return code;
	}
	
	private static def String writeCheckClauseForAttribute(AttributeEClass attr){
		var code = "    check(";				
		code += OperatorWriters.writeOperator(attr.eGet(attr.eClass.getEStructuralFeature("operator")) as Operator, attr.name);
		code += ");";
		return code;
	}
}