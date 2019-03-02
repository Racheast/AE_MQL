package org.xtext.generator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import qmm.AggregationOperator;
import qmm.Argument;
import qmm.AttributeEClass;
import qmm.BitOperator;
import qmm.Boolean_FunctionalType;
import qmm.CalculateableElement_ReferenceArgument;
import qmm.Containment_OrGroup;
import qmm.EvaluationFunctionalOperator;
import qmm.ExpressionOperator;
import qmm.FunctionalOperator;
import qmm.FunctionalType;
import qmm.NamedElement;
import qmm.NegatableElement;
import qmm.Operator;
import qmm.OrGroup;
import qmm.Parameter;
import qmm.PrimitiveArgument;
import qmm.FindQuery;
import qmm.FindQueryCollection;
import qmm.ReferenceArgument;
import qmm.Reference_OrGroup;
import qmm.RegularAttributeEClass;
import qmm.RootClass;

public class Utils {
	public static HashMap<EvaluationFunctionalOperator,String> evaluationOperatorRefNames = new HashMap<EvaluationFunctionalOperator,String>();
	public static HashMap<ReferenceArgument,String> referenceArgumentRefNames = new HashMap<ReferenceArgument,String>();
	
	public static HashMap<RootClass, String> initRootClassLib(FindQueryCollection queryCollection){
		HashMap<RootClass, String> dictionary = new HashMap<RootClass, String>();
		for(FindQuery query: queryCollection.getFindQueries()){
			TreeIterator<EObject> iter = query.eAllContents();
			while(iter.hasNext()){
				EObject eo = iter.next();
				if(eo instanceof RootClass){
					RootClass rc = (RootClass)eo;
					dictionary.put(rc, rc.getName() + "_" + rc.eClass().getName());
				}
			}
		}
		return dictionary;
	}
	
	public static HashMap<AttributeEClass, String> initAttrLib(FindQueryCollection queryCollection){
		HashMap<AttributeEClass, String> attrLib = new HashMap<AttributeEClass, String>();
		for(FindQuery query: queryCollection.getFindQueries()){
			for(AttributeEClass a: getAllReferencedAttributes(query)){
				String patternName = a.getName() + "_" + a.eClass().getName();
				attrLib.put(a, patternName);
			}
		}
		return attrLib;
	}
	
	public static HashMap<OrGroup, String> initOrGroupLib(FindQueryCollection queryCollection){
		HashMap<OrGroup, String> orGroupLib = new HashMap<OrGroup, String>();
		for(FindQuery query: queryCollection.getFindQueries()){
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof OrGroup){
				OrGroup og = (OrGroup)eo;
				if(!orGroupLib.containsKey(og)){
					orGroupLib.put(og, og.getName() + "_OrGroup");
				}
			}
		}
		}
		return orGroupLib;
	}
	
	public static ArrayList<OrGroup> getOrGroupsOfRootClass(RootClass rc){
		ArrayList<OrGroup> referenceObjects = new ArrayList<OrGroup>();
		EList<EObject> contents = rc.eContents();
		for(EObject eo: contents){
			if(eo instanceof OrGroup){
				referenceObjects.add((OrGroup)eo);
			}
		}
		return referenceObjects;
	}
	
	public static ArrayList<RootClass> getRootClassesOfContainmentOrGroup(Containment_OrGroup og){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		EList<EObject> contents = og.eContents();
		for(EObject eo: contents){
			if(eo instanceof RootClass){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}
	
	public static void initReferenceFromToLib(HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib,RootClass rc){
		HashMap<EStructuralFeature, String> hashmap = new HashMap<EStructuralFeature, String>();
		
		if(referenceFromToLib.get(rc.eClass())!=null)
			hashmap=referenceFromToLib.get(rc.eClass());
		
		for(OrGroup og : getOrGroupsOfRootClass(rc)){
			EStructuralFeature esf=og.eContainingFeature();
			String patternName = rc.eClass().getName() + "_" + esf.getName()/* + System.identityHashCode(esf)*/;
			hashmap.put(esf, patternName);
			referenceFromToLib.put(rc.eClass(),hashmap);
			
			if(og instanceof Containment_OrGroup){
				for(RootClass rc2: getRootClassesOfContainmentOrGroup((Containment_OrGroup)og)){
					initReferenceFromToLib(referenceFromToLib, rc2);
				}
			}
		}
	}

	public static HashMap<EClass, HashMap<EStructuralFeature, String>> initReferenceFromToLib(FindQueryCollection queryCollection){
		HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib = new HashMap<EClass, HashMap<EStructuralFeature, String>>();
		for(FindQuery query: queryCollection.getFindQueries())
			for(RootClass rc : query.getRootClass())initReferenceFromToLib(referenceFromToLib, rc);
		return referenceFromToLib;
	}
	
	public static List<RootClass> getAllReferencedRootClassesInclSuccessors(FindQuery query){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof RootClass ){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}
	
	public static List<AttributeEClass> getDirectReferencedAttributes(RootClass rc){
		ArrayList<AttributeEClass> attributes = new ArrayList<AttributeEClass>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof AttributeEClass){
				attributes.add((AttributeEClass)eo);
			}
		}
		return attributes;
	}
	
	public static List<AttributeEClass> getAllReferencedAttributes(FindQuery query){
		ArrayList<AttributeEClass> attributes = new ArrayList<AttributeEClass>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof AttributeEClass){
				attributes.add((AttributeEClass)eo);
			}
		}
		
		return attributes;
	}
	
	public static List<RootClass> getDirectReferencedRootClasses(RootClass rc){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof RootClass && (eo.eContainer() == null || !eo.eContainingFeature().getName().equals("successor"))){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}
	
	public static EList<Operator> getConnectsReferenceContents(BitOperator bo){
		return (EList<Operator>) bo.eGet(bo.eClass().getEStructuralFeature("connects"));  
	}	
	
	public static String getNegatedSymbol(FunctionalOperator fo){
		String negatedSymbol = "";
		if(fo instanceof Boolean_FunctionalType){
			Boolean_FunctionalType bfo = (Boolean_FunctionalType)fo;
			if(bfo.isNegated())
				negatedSymbol = "!";
		}
		return negatedSymbol;
	}
	
	public static EList<Parameter> getAllParameters(FunctionalOperator fo){		
		EList<Parameter> parameters = new BasicEList();
		EOperation getAllParametersOperation = findEOperationByName(fo, "getAllParameters");
		if(getAllParametersOperation!=null){
			try {
				parameters =  (EList<Parameter>)fo.eInvoke(getAllParametersOperation, null);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return parameters;
	}
	
	public static String getOperatorLiteral(Operator o){
		String literal = null;
		try {
			literal = (String)o.eInvoke(findEOperationByName(o, "getLiteral"), null);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return literal;
	}
	
	private static EOperation findEOperationByName(EObject eo, String eOperationName){
		EOperation eOperation = null;
		for(EOperation op: eo.eClass().getEAllOperations()){
			if(op.getName().equals(eOperationName))
				eOperation = op;
		}
		return eOperation;
	}
	
	public static FunctionalOperator getFunctionalOperator(FunctionalType ft){
		Object nextFo = ft.eGet(ft.eClass().getEStructuralFeature("operator"));
		if(nextFo != null){
			return (FunctionalOperator)nextFo;
		}
		return null;
	}
	
	public static String writePrimitiveArgumentValue(PrimitiveArgument pa){
		Object value = pa.eGet(pa.eClass().getEStructuralFeature("value"));
		String strValue = value.toString();
		if(value instanceof String)
			strValue = "\"" + strValue + "\"";
		else if(value instanceof Character)
			strValue = "'" + strValue + "'";
		return strValue;
	}
	
	public static HashSet<AttributeEClass> collectReferenceAttributes(ExpressionOperator operator){
		HashSet<AttributeEClass> referencedAttributes = new HashSet<AttributeEClass>();
		
		if(operator instanceof BitOperator){
			Collection<ExpressionOperator> connectedOperators = (Collection<ExpressionOperator>)operator.eGet(operator.eClass().getEStructuralFeature("connects"));
			for(ExpressionOperator connectedOperator: connectedOperators){
				referencedAttributes.addAll(collectReferenceAttributes(connectedOperator));
			}
		}else if(operator instanceof FunctionalOperator){
			FunctionalOperator functionalOperator = (FunctionalOperator)operator;
			for(Parameter p:getAllParameters(functionalOperator)){
				Argument argument = (Argument)p.eGet(p.eClass().getEStructuralFeature("argument"));
				if(argument instanceof CalculateableElement_ReferenceArgument){
					AttributeEClass referencedAttribute = (AttributeEClass)argument.eGet(argument.eClass().getEStructuralFeature("reference"));
					referencedAttributes.add(referencedAttribute);
				}
			}
			FunctionalOperator nextFo = getFunctionalOperator((FunctionalType)functionalOperator);
			if(nextFo != null)
				referencedAttributes.addAll(collectReferenceAttributes(nextFo));
		}
		return referencedAttributes;
	}
	
	public static HashMap<EvaluationFunctionalOperator,String> initEvaluationOperatorLib(FindQueryCollection queryCollection){
		HashMap<EvaluationFunctionalOperator,String> map = new HashMap<EvaluationFunctionalOperator,String>();
		for(FindQuery query: queryCollection.getFindQueries()){
			TreeIterator<EObject> iter = query.eAllContents();
			while(iter.hasNext()){
				EObject eo = iter.next();
				if(eo instanceof EvaluationFunctionalOperator){
					EvaluationFunctionalOperator ao = (EvaluationFunctionalOperator)eo;	
					String patternName = getOperatorLiteral(ao) +  System.identityHashCode(ao);
					patternName = patternName.replace('.', '_');
					map.put(ao, patternName);
					evaluationOperatorRefNames.put(ao, "ref" + System.identityHashCode(ao));
				}
			}
		}
		return map;
	}
	
	public static RootClass getContainingRootClass(EObject eo){
		EObject container = eo.eContainer();
		while(container != null){
			if(container instanceof RootClass)
				return (RootClass)container;
			container = container.eContainer();
		}
		return null;
	}
	
	public static HashMap<ReferenceArgument, String> initReferenceArgumentLib(HashMap<EvaluationFunctionalOperator, String> aggregationOperatorLib){
		HashMap<ReferenceArgument, String> map = new HashMap<ReferenceArgument, String>();
		
		for(EvaluationFunctionalOperator op: aggregationOperatorLib.keySet()){
			EList<Parameter> parameters = getAllParameters(op);
			for(Parameter p: parameters){
				Object arg = p.eGet(p.eClass().getEStructuralFeature("argument"));
				if(arg instanceof ReferenceArgument){	
					ReferenceArgument refArg = (ReferenceArgument) arg;
					String patternName = "argument_" + System.identityHashCode(refArg);
					referenceArgumentRefNames.put(refArg, "ref" + System.identityHashCode(refArg));
					map.put(refArg, patternName);
				}
			}
		}
		
		return map;
	}
	
	public static ArrayList<EvaluationFunctionalOperator> collectAllEvaluationFunctionalOperators(EObject eo){  //16.11.18 changed to EvaluationFunctionalOperator
		ArrayList<EvaluationFunctionalOperator> evaluationFunctionalOperators = new ArrayList<EvaluationFunctionalOperator>();
		if(eo instanceof BitOperator){
			for(Operator op:getConnectsReferenceContents((BitOperator)eo)){
				evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(op));
			}	
		}else{
			if (eo instanceof FunctionalType){
				FunctionalType ft = (FunctionalType)eo;
				if(ft instanceof FunctionalOperator){
					FunctionalOperator fo = (FunctionalOperator)ft;
					if(fo instanceof EvaluationFunctionalOperator){
						evaluationFunctionalOperators.add((EvaluationFunctionalOperator)fo);	
					}else{
						EList<Parameter> parameters = getAllParameters(fo);
						for(Parameter p: parameters){
							evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(p));
						}
					}
				}
				FunctionalOperator nextFo = getFunctionalOperator(ft);
				if(nextFo!=null){
					evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(nextFo));
				}
			}else if(eo instanceof Parameter){
				Argument arg = (Argument)eo.eGet(eo.eClass().getEStructuralFeature("argument"));
				evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(arg));
			}
		}
		
		return evaluationFunctionalOperators;
	}
	
	public static HashSet<HashSet<NamedElement>> getInequalitySetsForRootClass(RootClass rc){
		HashSet<HashSet<NamedElement>> inequalitySets = new HashSet<HashSet<NamedElement>>();
		ArrayList<NamedElement> namedElements = new ArrayList<NamedElement>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof RegularAttributeEClass){
				RegularAttributeEClass attr = (RegularAttributeEClass)eo;
				if(!attr.isNegated() && !attr.isGeneralized()) namedElements.add(attr);
			}
			else if(eo instanceof OrGroup){
				OrGroup og = (OrGroup)eo;
				if(!og.isNegated() && !og.isGeneralized()) namedElements.add(og);
			}
		}
		return collectUniqueCombinations(namedElements);
	}
	
	public static HashSet<HashSet<NamedElement>> getInequalitySetsForAttribute(AttributeEClass attr){		
		ArrayList<NamedElement> namedElements = new ArrayList<NamedElement>();
		namedElements.add(attr);
		TreeIterator<EObject> iter = attr.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof CalculateableElement_ReferenceArgument && !(eo.eContainer().eContainer() instanceof AggregationOperator)){
				AttributeEClass attr2 = (AttributeEClass) eo.eGet(eo.eClass().getEStructuralFeature("reference"));
				if(!attr2.isNegated()){
					namedElements.add(attr2);
				}
			}
		}
		return collectUniqueCombinations(namedElements);
	}
		
	public static HashSet<HashSet<NamedElement>> collectUniqueCombinations(List<NamedElement> namedElements){
		 HashSet<HashSet<NamedElement>> uniqueCombinations = new  HashSet<HashSet<NamedElement>>();
		 for(NamedElement n1: namedElements){
			for(NamedElement n2: namedElements){
				if(n1 != n2){
					HashSet<NamedElement> pair = new HashSet<NamedElement>();
					pair.add(n1);
					pair.add(n2);
					uniqueCombinations.add(pair);
				}
			}	
		 }
		 return uniqueCombinations;
	}
	
	public static HashSet<NamedElement> initSelectedNamedElements(FindQuery query){
		HashSet<NamedElement> selectedNamedElements = new HashSet<NamedElement>();
		if(query.getSelect()!=null) selectedNamedElements.addAll(query.getSelect().getNamedElements());
		return selectedNamedElements;
	}
	
	private static HashSet<NamedElement> getContainedSelectedNamedElements(HashSet<NamedElement> allSelectedNamedElements, EObject eo){
		HashSet<NamedElement> containedSelectedNamedElements = new HashSet<NamedElement>();
		TreeIterator<EObject> treeIter = eo.eAllContents();
		while(treeIter.hasNext()){
			EObject eoTemp = treeIter.next();
			if(eoTemp instanceof NamedElement && allSelectedNamedElements.contains(eoTemp)){
				containedSelectedNamedElements.add((NamedElement)eoTemp);
			}
		}
		return containedSelectedNamedElements;
	}
	
	public static String getContainedSelectedNamedElementsString(HashSet<NamedElement> allSelectedNamedElements, EObject eo){
		String code = "";
		HashSet<NamedElement> containedSelectedNamedElements = getContainedSelectedNamedElements(allSelectedNamedElements, eo);
		for(NamedElement n : containedSelectedNamedElements) code += ", " + n.getName();
		return code;
	}

	public static ArrayList<NamedElement> getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(EObject rootEo){
		ArrayList<NamedElement> rootClasses_and_orGroups = new ArrayList<NamedElement>();
		if(rootEo instanceof OrGroup && !((OrGroup)rootEo).isNegated()) rootClasses_and_orGroups.add((OrGroup)rootEo);
		
		if(rootEo instanceof Reference_OrGroup){
			Collection<NamedElement> referencedRCs = (EList<NamedElement>)rootEo.eGet(rootEo.eClass().getEStructuralFeature("reference"));
			addAllNonExistent(rootEo, rootClasses_and_orGroups, referencedRCs);
		}
		
		if(rootEo instanceof Containment_OrGroup){
			Collection<NamedElement> containedRCs = (EList<NamedElement>)rootEo.eGet(rootEo.eClass().getEStructuralFeature("containment"));
			addAllNonExistent(rootEo, rootClasses_and_orGroups, containedRCs);
		}
		
		TreeIterator<EObject> iter = rootEo.eAllContents();
		while(iter.hasNext()){
			EObject eo2 = iter.next();
			
			if(eo2 instanceof Containment_OrGroup && !((Containment_OrGroup)eo2).isNegated()){
				Containment_OrGroup og = (Containment_OrGroup)eo2;
				rootClasses_and_orGroups.add(og);
				EList<RootClass> containedRootClasses = (EList<RootClass>)og.eGet(og.eClass().getEStructuralFeature("containment"));
				for(RootClass rc: containedRootClasses){
					addIfNotExists(rootEo, rootClasses_and_orGroups, rc);
				}
			}
			else if (eo2 instanceof Reference_OrGroup){ 
				Reference_OrGroup og = (Reference_OrGroup)eo2;
				if(!og.isNegated()) rootClasses_and_orGroups.add(og);
				EList<RootClass> referencedRootClasses = (EList<RootClass>)og.eGet(og.eClass().getEStructuralFeature("reference"));
				for(RootClass rc: referencedRootClasses){
					addIfNotExists(rootEo, rootClasses_and_orGroups,rc);
				}
			}					
			
		}
		return rootClasses_and_orGroups;
	}
	
	public static String getContainedAndReferencedOrGroupsHeader_excluding_negated_elements(EObject eo){
		String header = ""; 
		ArrayList<NamedElement> rootClasses_and_orGroups = getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(eo);
		
		for(NamedElement n : rootClasses_and_orGroups) header += ", " + n.getName();
		
		return header;
	}
	
	
	public static ArrayList<NamedElement> getContainedAndReferencedRootClasses_including_negated_elements(RootClass rootRC){
		ArrayList<NamedElement> rootClasses = new ArrayList<NamedElement>();
		
		TreeIterator<EObject> iter = rootRC.eAllContents();
		while(iter.hasNext()){
			EObject eo2 = iter.next();
			if(eo2 instanceof Containment_OrGroup) {
				EList<NamedElement> containedRootClasses = (EList<NamedElement>)eo2.eGet(eo2.eClass().getEStructuralFeature("containment"));
				for(NamedElement rc: containedRootClasses) addIfNotExists(rootRC, rootClasses,rc);
			}else if (eo2 instanceof Reference_OrGroup){
				EList<RootClass> referencedRootClasses = (EList<RootClass>)eo2.eGet(eo2.eClass().getEStructuralFeature("reference"));
				for(RootClass rc: referencedRootClasses) addIfNotExists(rootRC, rootClasses,rc);
			}
		}
		
		return rootClasses;
	}
	
	public static List<RootClass> getReferencedRootClasses(RootClass rootRC){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		TreeIterator<EObject> iter = rootRC.eAllContents();
		while(iter.hasNext()){
			EObject eo2 = iter.next();
			if (eo2 instanceof Reference_OrGroup){
				EList<RootClass> referencedRootClasses = (EList<RootClass>)eo2.eGet(eo2.eClass().getEStructuralFeature("reference"));
				for(RootClass rc: referencedRootClasses) addIfNotExists(rootRC, rootClasses,rc);
			}
		}
		return rootClasses;
	}

	private static Boolean addIfNotExists(EObject callingObject, Collection col, Object objectToAdd){
		if(!col.contains(objectToAdd) && objectToAdd != callingObject){
			col.add(objectToAdd);
			return true;
		}
		return false;
	}
	
	private static void addAllNonExistent(EObject callingObject, Collection col1, Collection col2){
		for(Object o: col2) addIfNotExists(callingObject,col1,o);
	}
	
	public static String writeOrGroupParameters(OrGroup rootOg){
		String parametersString = "";
		List<NamedElement> headerCandidates = collectOrGroupHeaderCandidates(rootOg);
		for(int i=0; i < headerCandidates.size(); i++){
			NamedElement n = headerCandidates.get(i);
			parametersString += n.getName();
			if(i < headerCandidates.size() - 1) parametersString += ",";
		}
		return parametersString;
	}
	
	public static List<NamedElement> collectOrGroupHeaderCandidates(OrGroup rootOg){
		ArrayList<NamedElement> headerCandidates = new ArrayList<NamedElement>();
		
		headerCandidates.add(rootOg);
		
		if(rootOg instanceof Reference_OrGroup){
			Collection<RootClass> refRCs = (EList<RootClass>)rootOg.eGet(rootOg.eClass().getEStructuralFeature("reference"));
			for(RootClass rc:refRCs){
				if(!headerCandidates.contains(rc)) headerCandidates.add(rc);
			}
		}
		
		TreeIterator<EObject> iter = rootOg.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if (eo instanceof RootClass){
				RootClass rc = (RootClass)eo;
				if(!headerCandidates.contains(rc)) headerCandidates.add(rc);
			}
			if(eo instanceof OrGroup){
				if (!((OrGroup)eo).isNegated()) headerCandidates.add((OrGroup)eo);
				if (eo instanceof Reference_OrGroup){ 
					Reference_OrGroup og = (Reference_OrGroup)eo;
					Collection<RootClass> refRCs = (EList<RootClass>)og.eGet(og.eClass().getEStructuralFeature("reference"));
					for(RootClass rc:refRCs){
						if(!headerCandidates.contains(rc))  headerCandidates.add(rc);
					}
				}
			}
		}
		
		if(rootOg instanceof Containment_OrGroup){
			ArrayList<RootClass> rootOgs_rootClasses = getRootClassesOfContainmentOrGroup((Containment_OrGroup)rootOg);
			for(RootClass rc: rootOgs_rootClasses) headerCandidates.addAll(collect_All_Referencable_RegularAttributeEClasses(rc));
		}
		
		return headerCandidates;
	}
	
	public static List<NamedElement> getOrGroupReferenceParameters(OrGroup og){		
		ArrayList<NamedElement> parameters = new ArrayList<NamedElement>();
		parameters.addAll(Utils.getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(og));

		Utils.removeAllFromList(parameters,og.eContainer());
		Utils.removeAllFromList(parameters,og);
		parameters.add(0,(RootClass)og.eContainer());
		parameters.add(1,og);
		parameters.addAll(collect_All_Referencable_RegularAttributeEClasses(og));
		return parameters;
	}
	
	public static String writeOrGroupReferenceParameters(OrGroup og){
		String parametersString = "";
		List<NamedElement> parameters = getOrGroupReferenceParameters(og);
		for(int i=0; i < parameters.size(); i++){
			NamedElement n = parameters.get(i);
			parametersString += n.getName();
			if(i < parameters.size() - 1) parametersString += ",";
		}
		return parametersString;
	}
	
	public static String writeRootClassParameters(RootClass rc){
		String parametersString = rc.getName() + ":" + rc.eClass().getName();
		ArrayList<NamedElement> parameters = new ArrayList<NamedElement>();
		parameters.addAll(Utils.getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(rc));
		Utils.removeAllFromList(parameters,rc);
		
		for(int i=0; i<parameters.size(); i++){
			NamedElement param = parameters.get(i);
			parametersString += "," + param.getName();
		}
				
		for(AttributeEClass a : collect_All_Referencable_RegularAttributeEClasses(rc)) parametersString += "," + a.getName();
		
		return parametersString;
	}
	
	public static String writeRootClassParameters_for_patternReference_from_OrGroups(RootClass rc){
		String parametersString = "";
		ArrayList<NamedElement> parameters = getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(rc);
		Utils.removeAllFromList(parameters,rc);
		parameters.add(0,rc);
		
		for(int i=0; i<parameters.size();i++){
			NamedElement param = parameters.get(i);
			parametersString += param.getName();
			if(i < parameters.size() - 1) parametersString += ",";
		}
		
		for(AttributeEClass a : collect_All_Referencable_RegularAttributeEClasses(rc)) parametersString += "," + a.getName();
		
		return parametersString;
	}
	
	public static void removeAllFromList(List list, Object o){
		while(list.contains(o)){
			list.remove(o);
		}
	}
	
	public static ArrayList<RegularAttributeEClass> collect_All_Referencable_RegularAttributeEClasses(EObject rootEO){
		ArrayList<RegularAttributeEClass> attrEClasses = new ArrayList<RegularAttributeEClass>();
		TreeIterator<EObject> iter = rootEO.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof RegularAttributeEClass && !((RegularAttributeEClass)eo).isNegated()){
				boolean isReferencable=true;
				EObject container = eo.eContainer();
				while(container != null){
					if(container instanceof NegatableElement && ((NegatableElement)container).isNegated()) isReferencable=false;
					if(container instanceof Containment_OrGroup){
						EList<RootClass> containment = (EList<RootClass>)container.eGet(container.eClass().getEStructuralFeature("containment"));
						if(containment.size()>1) isReferencable=false;
					}
					container = container.eContainer();
				}
				if(isReferencable) attrEClasses.add((RegularAttributeEClass)eo);
			}
		}
		return attrEClasses;
	}
	
	public static Boolean isContainedBy(EObject child, EObject parent){
		EObject container = child.eContainer();
		while(container != null){
			if(container == parent) return true;
			container = container.eContainer();
		}
		return false;
	}
	
	public static HashSet<NamedElement> getAllContainedAndReferencedNamedElements_for_RootClass(RootClass rc){
		HashSet<NamedElement> namedElements = new HashSet<NamedElement>();
		
		namedElements.addAll(collect_All_Referencable_RegularAttributeEClasses(rc));
		
		TreeIterator<EObject> iter = rc.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof RootClass){
				RootClass rc2 = (RootClass)eo;
				if(rc2.eContainer() != null && rc2.eContainer() instanceof OrGroup && !((OrGroup)rc2.eContainer()).isNegated()) namedElements.add(rc2);
				if (rc2 instanceof Reference_OrGroup){ 
					Collection<RootClass> refRCs = (EList<RootClass>)rc2.eGet(rc2.eClass().getEStructuralFeature("reference"));
					namedElements.addAll(refRCs);
				}
			}
		}
		
		return namedElements;
	}
	
	public static String getTypeNameOfOrGroup(OrGroup og){
		String typeName = null;
		if(og instanceof Containment_OrGroup) typeName = og.eClass().getEStructuralFeature("containment").getEType().getName();
		else if(og instanceof Reference_OrGroup) typeName = og.eClass().getEStructuralFeature("reference").getEType().getName();
		return typeName;
	}
	
	public static boolean containedByNegatedOrGroup(NamedElement n){
		EObject container = n.eContainer();
		while(container!=null){
			if(container instanceof Containment_OrGroup && ((Containment_OrGroup)container).isNegated())
				return true;
			container = container.eContainer();
		}
		return false;
	}
	
	public static boolean containedBy(EObject container, EObject content){
		TreeIterator<EObject> iter = container.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo == content) return true;
		}
		return false;
	}
	
	public static String writeInequalityConstraints(EObject eo){
		String code = "";
		HashSet<HashSet<NamedElement>> inequalitySets = new HashSet<HashSet<NamedElement>>();
		
		if(eo instanceof RootClass){
			inequalitySets = getInequalitySetsForRootClass((RootClass)eo);
		}else if(eo instanceof AttributeEClass){ 
			inequalitySets = getInequalitySetsForAttribute((AttributeEClass)eo);
		}	
		
		for(HashSet<NamedElement> pair: inequalitySets){
			NamedElement[] pairArr = pair.toArray(new NamedElement[pair.size()]);
			code += "    " + pairArr[0].getName() + " != " + pairArr[1].getName() + ";\n";
		}
		return code;
	}
	
}


