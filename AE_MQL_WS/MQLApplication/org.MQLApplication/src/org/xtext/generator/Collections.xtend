package org.xtext.generator

import qmm.RootClass;
import java.util.HashMap
import qmm.AttributeEClass
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import qmm.ReferenceArgument
import qmm.OrGroup
import qmm.EvaluationFunctionalOperator
import qmm.FindQueryCollection

class Collections {
	public static HashMap<RootClass, String> rootClassLib;
	public static HashMap<AttributeEClass, String> attrLib;
	public static HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib;
	public static HashMap<EvaluationFunctionalOperator,String> evaluationOperatorLib;
	public static HashMap<ReferenceArgument, String> referenceArgumentLib;
	public static HashMap<OrGroup, String> orGroupLib;
	
 	static def void initLibs(FindQueryCollection queryCollection){
		referenceFromToLib = Utils.initReferenceFromToLib(queryCollection);
		rootClassLib = Utils.initRootClassLib(queryCollection);
		attrLib = Utils.initAttrLib(queryCollection);
		evaluationOperatorLib = Utils.initEvaluationOperatorLib(queryCollection);
		referenceArgumentLib = Utils.initReferenceArgumentLib(evaluationOperatorLib);
		orGroupLib = Utils.initOrGroupLib(queryCollection);
	}
}