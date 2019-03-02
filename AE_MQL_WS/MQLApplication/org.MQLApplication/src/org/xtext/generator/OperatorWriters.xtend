package org.xtext.generator

import qmm.AttributeEClass
import qmm.Argument
import qmm.PrimitiveArgument
import qmm.Operator
import qmm.BitOperator
import qmm.FunctionalOperator
import qmm.Parameter
import org.eclipse.emf.common.util.EList
import qmm.CalculateableElement_ReferenceArgument
import qmm.FunctionalType
import qmm.EvaluationOperator
import qmm.EvaluationOperation_Argument
import qmm.EvaluationFunctionalOperator
import org.eclipse.emf.ecore.EClass
import qmm.AggregationOperator
import qmm.CountingAggregationOperator
import qmm.Countable
import qmm.RegularAttributeEClass
import qmm.OrGroup
import qmm.NamedElement
import qmm.CalculatingAggregationOperator
import qmm.ClassOperator
import qmm.Integer_PrimitiveArgument
import qmm.String_PrimitiveArgument
import qmm.ReferenceArgument
import qmm.CalculateableElement
import qmm.TypedElement
import qmm.Calculateable_Argument

class OperatorWriters {
	static def String writeOperator(Operator o, String name){
		var code = "";
		if(o instanceof BitOperator){
			val bo = o as BitOperator;
			var negated = "";
			if(bo.negated)
				negated = "!";
			code += negated+"(";
			for(var i=0; i < Utils.getConnectsReferenceContents(bo).size(); i++){  
				val o2 = Utils.getConnectsReferenceContents(bo).get(i);
				code += writeOperator(o2, name);
				if(i < Utils.getConnectsReferenceContents(bo).size-1){
					code += Utils.getOperatorLiteral(bo)
				}
			}
			code += ")";
		}if(o instanceof EvaluationFunctionalOperator){  
			val fo = o as EvaluationFunctionalOperator;
			var nextFo = Utils.getFunctionalOperator(fo as FunctionalType);
			if(nextFo!==null)	
				code += writeFunctionalOperator(nextFo,Utils.evaluationOperatorRefNames.get(fo));
		}else if(o instanceof FunctionalOperator){
			val fo = o as FunctionalOperator;
			code += writeFunctionalOperator(fo, name);  
		}
		
		return code;
	}
	
	private static def String writeFunctionalOperator(FunctionalOperator fo, String prevCode ){
		var code = "(" + prevCode + ")";
		code = Utils.getNegatedSymbol(fo) + "(" + code + Utils.getOperatorLiteral(fo) + writeParameters(Utils.getAllParameters(fo)) + ")";
		val nextFo = Utils.getFunctionalOperator(fo as FunctionalType);
		if(nextFo !== null)
			code = writeFunctionalOperator(nextFo, code);
		return code;
	}
	
	private static def String writeParameters(EList<Parameter> parameters){
		var code = "(";
		for(var i=0; i < parameters.size; i++){
			var p = parameters.get(i);
			val argument = p.eGet(p.eClass.getEStructuralFeature("argument")) as Argument;
			var value = "";
			if(argument instanceof PrimitiveArgument){
				value = Utils.writePrimitiveArgumentValue(argument as PrimitiveArgument);
			}else if (argument instanceof CalculateableElement_ReferenceArgument){  
				val refArg = argument as CalculateableElement_ReferenceArgument;
				val attr = refArg.eGet(refArg.eClass.getEStructuralFeature("reference")) as AttributeEClass;
				value = attr.name
			}
			else if(argument instanceof EvaluationOperation_Argument){ 
				value = Utils.evaluationOperatorRefNames.get((argument as EvaluationOperator));
			}
			
			var operator = null as Object;
			if(argument.eClass.getEStructuralFeature("operator")!==null){
				operator = argument.eGet(argument.eClass.getEStructuralFeature("operator"));
				if(operator !== null){
					code += writeFunctionalOperator(operator as FunctionalOperator, value);
				}
			}
			if(operator === null){
				code += value;
			}	
			if(i < parameters.size - 1){
				code += ", ";
			}
		}
		code += ")";
		return code;
	}
	
	static def String writeEvaluationOperatorPatterns(){
		var code = "";
		for(EvaluationFunctionalOperator op:  Collections.evaluationOperatorLib.keySet){  	
			val containingRc = Utils.getContainingRootClass(op);
			val param = Utils.getAllParameters(op).get(0);
			val operatorLiteral = Utils.getOperatorLiteral(op);
			
			var typeName = (op.getType() as EClass).name   
			typeName = typeName.substring(0,typeName.indexOf('_'))
			code += "pattern " +  Collections.evaluationOperatorLib.get(op) + "(" + containingRc.name + ":" + containingRc.eClass.name + ", result : java " + typeName  + "){\n"
			
			if(op instanceof AggregationOperator){
				var arg = param.eGet(param.eClass.getEStructuralFeature("argument")) as Argument;
				if(op instanceof CountingAggregationOperator){
					val countable =  arg.eGet(arg.eClass.getEStructuralFeature("reference")) as Countable;					
					var countablePatternName = "";
					
					if(countable instanceof AttributeEClass){
						countablePatternName =  Collections.attrLib.get(countable as AttributeEClass);
						code += "    result == " + operatorLiteral + " find " + countablePatternName + "(" + containingRc.name; 
						if(countable instanceof RegularAttributeEClass) code += ", "  + (countable as NamedElement).name 
						code += ");\n" 
						
					}else if(countable instanceof OrGroup){
						countablePatternName =  Collections.orGroupLib.get(countable as OrGroup) + "_ref";
						code += "    result == " + operatorLiteral + " find " + countablePatternName + "(" + Utils.writeOrGroupReferenceParameters(countable as OrGroup) + ");\n";
					}
				
				}else if(op instanceof CalculatingAggregationOperator){ 
					code += "    result == " + operatorLiteral + " find " +  Collections.referenceArgumentLib.get(arg) + "(elem, #);\n";
				}
				
				code += "}\n\n"		
			}else if(op instanceof ClassOperator){
				code += "    " + containingRc.eClass.name + "(elem);"  //new (9.12.18)
				val arg = param.eGet(param.eClass.getEStructuralFeature("argument"))
				
				if(arg instanceof Calculateable_Argument){
					code += "    find " +  Collections.referenceArgumentLib.get(arg) + "(elem, " + Utils.referenceArgumentRefNames.get(arg as Calculateable_Argument) + ");\n";
					code += "	result == eval(" + operatorLiteral + "(" + Utils.referenceArgumentRefNames.get(arg as Calculateable_Argument) + "));\n"	
				}else if(arg instanceof String_PrimitiveArgument){
					code += "	result == eval(" + operatorLiteral + "(\"" + (arg as String_PrimitiveArgument).value + "\"));\n"	
				}else if(arg instanceof Integer_PrimitiveArgument){
					code += "	result == eval(" + operatorLiteral + "(" + (arg as Integer_PrimitiveArgument).value + "));\n"	
				}	
				
				code += "}\n\n"
			}	
			
		}
		return code;
	}
	
	static def String writeArgumentPatterns(){
		var code = "";
		for(ReferenceArgument arg :  Collections.referenceArgumentLib.keySet){
			val containingRc = Utils.getContainingRootClass(arg);
			var typeName = "Object";
			
			if (arg instanceof CalculateableElement_ReferenceArgument){  
				val calculateableElement = arg.eGet(arg.eClass.getEStructuralFeature("reference")) as CalculateableElement;  
				val attr = calculateableElement as AttributeEClass;
				val operator = arg.eGet(arg.eClass.getEStructuralFeature("operator")) as FunctionalOperator;
				
		
				if(operator === null){
					typeName = (arg.getType() as EClass).name   
					typeName = typeName.substring(0,typeName.indexOf('_'))  
					code += "pattern " +  Collections.referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"  
					code += "    find " +  Collections.attrLib.get(attr) + "(elem, result);\n"
				}else{
					typeName = ((operator.lastOperator as TypedElement).type as EClass).name;  
					typeName = typeName.substring(0,typeName.indexOf('_'));
					
					code += "pattern " +  Collections.referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"  
					
					val evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator as Operator);	
					for(EvaluationFunctionalOperator aop : evaluationOperators){  
						code += "    find " +  Collections.evaluationOperatorLib.get(aop) + "(elem, " + Utils.evaluationOperatorRefNames.get(aop) + ");\n"
					}
					
					code += "    find " +  Collections.attrLib.get(attr) + "(elem, " + attr.name + ");\n"
					code += "    result == eval(" + OperatorWriters.writeOperator(operator as Operator,attr.name) + ");\n"
				}
				code += "}\n\n"	
			}else if(arg instanceof Calculateable_Argument){
				typeName = (arg.getType() as EClass).name   
				typeName = typeName.substring(0,typeName.indexOf('_'))   
				
				code += "pattern " +  Collections.referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"
				code += "    find " +  Collections.evaluationOperatorLib.get(arg) + "(elem,result);\n"
				code += "}\n\n"
			}
		}
		return code;
	}
}