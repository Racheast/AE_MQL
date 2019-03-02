package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;


public class QMMMetaModelBuilder {
	public static HashSet<EClassifier> build(EPackage ePackage){  
		
		HashSet<EClassifier> eClassifiers = new HashSet<EClassifier>();  //orig: EClass
		
		eClassifiers.addAll(initDefaultEClasses());
		
		TreeIterator<EObject> iter = ePackage.eAllContents();
				
		while (iter.hasNext()) {
			EObject eo = iter.next();
			if (eo instanceof EClass){
				EClass ec = (EClass) eo;
				ec.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass"));
				ec.setAbstract(false); 
				QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.put(ec, EClassMethodBodies.ROOTCLASS_VALIDATIONOPERATION_BODY);
				
				eClassifiers.addAll(QMMMetaModelBuilder_OrGroups.createConcreteOrGroupsForEClass(ec));
				
				ArrayList<EAttribute> eAttributes = (ArrayList<EAttribute>) EcoreUtil.copyAll(ec.getEAttributes());
				
				for(int i=0; i < eAttributes.size(); i++){
					EAttribute ea = eAttributes.get(i);
					EClassifier newType = QMMMetaModelBuilder_Types.getJavaTypeForEType(ea.getEType());
					if(newType!=null){
						ea.setEType(newType);
						eClassifiers.add(newType);
					}
					
					final String eTypeName = ea.getEType().getName();
					
					if(QMMMetaModelBuilder_Collections.eClassifiersMap.get(eTypeName)==null) QMMMetaModelBuilder_Collections.eClassifiersMap.put(eTypeName, ea.getEType());
					
					eClassifiers.addAll(QMMMetaModelBuilder_Calculateables.updateTypedCalculateables(eTypeName));  
					
					if(QMMMetaModelBuilder_Collections.typedAttributeEClasses.get(eTypeName) == null){ 
						if(EcorePackage.Literals.EENUM.isSuperTypeOf(ea.getEType().eClass())){
							eClassifiers.addAll(QMMMetaModelBuilder_Operators.updateTypedEnumerationOperators(eTypeName));
							eClassifiers.add(QMMMetaModelBuilder_Attributes.createTypedEnumerationAttributeEClass(eTypeName));
						}else{
							eClassifiers.add(QMMMetaModelBuilder_Attributes.createTypedRegularAttributeEClass(eTypeName));  
							eClassifiers.addAll(QMMMetaModelBuilder_Types.updateExpressionTypeSystem(eTypeName));
							QMMMetaModelBuilder_Attributes.assignTypedOperatorToAttributeEClass(eTypeName);
						}
					}
					EClass concreteTypedAttributeEClass = QMMMetaModelBuilder_Attributes.createConcreteTypedAttributeEClass(ec,ea);
					QMMMetaModelBuilder_Collections.concreteAttributeEClasses.put(concreteTypedAttributeEClass, ea);
					eClassifiers.add(concreteTypedAttributeEClass);
				}
				
				for(EAttribute ea: ec.getEAttributes())
					EcoreUtil.delete(ea);
				
				QMMMetaModelBuilder_Collections.rootClasses.add(ec);
			}
		}
				
		iter = ePackage.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if (eo instanceof EReference) {  
				EReference eRef = (EReference)eo;
				if(eRef.eContainer() instanceof EClass && eRef.getEType() instanceof EClass){
					EClass eContainer = (EClass) eRef.eContainer();
					EClass eType = (EClass) eRef.getEType();
					if(QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass").isSuperTypeOf(eContainer)){
						if(QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass").isSuperTypeOf(eType)){
							if(!eRef.isDerived()){
								String validationBody = QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.get(eContainer) + "\n\n" + EClassMethodBodies.write_Reference_UpperBoundCheckerValidationBody(eContainer.getName() /*eContainer.eClass().getName()*/, eRef.getName(), eRef.getUpperBound());
								QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.put(eContainer, validationBody);
							}
							eClassifiers.addAll(QMMMetaModelBuilder_OrGroups.appendConcreteOrGroupToRef(eRef));
							eRef.setContainment(true);  
						}else if(QMMMetaModelBuilder_Collections.defaultEClasses.get("RegularAttributeEClass").isSuperTypeOf(eType)){
							String validationBody = QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.get(eContainer) + "\n\n" + EClassMethodBodies.write_AttributeEClass_UpperBoundCheckerValidationBody(eContainer.getName(), eRef.getName(), eRef.getUpperBound());
							QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.put(eContainer, validationBody);
							eRef.setUpperBound(-1);
						}
					}
				}	
			}
		}
		
		for(EClass ec : QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.keySet()){
			EObjectHelper.addValidationOperationToEClass(ec,EObjectHelper.writeSuperclassValidationOperationCallIfExists(ec) + QMMMetaModelBuilder_Collections.rootClassValidationOperationBodies.get(ec) + "\n\nreturn true;");
		}
		
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.readFunctionalOperators());
		eClassifiers.addAll(QMMMetaModelBuilder_Types.initTypeInfrastructure());
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.createCountingAggregationOperators());
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.createCalculatingAggregationOperators());
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.createConcreteClassOperators()); 
		
		return eClassifiers;
	}  //end of build()

	private static ArrayList<EClassifier> initDefaultEClasses(){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();  
		eClassifiers.add(QMMMetaModelBuilder_GeneralizableElements.createDefaultGeneralizableElement());
		eClassifiers.add(QMMMetaModelBuilder_NamedElements.createDefaultNamedElementEClass());
		eClassifiers.add(QMMMetaModelBuilder_Countables.createDefaultCountableEClass());
		eClassifiers.add(QMMMetaModelBuilder_NegatableElements.createDefaultNegateableElementEClass());
		eClassifiers.addAll(QMMMetaModelBuilder_OrGroups.createDefaultOrGroupEClasses());
		eClassifiers.add(QMMMetaModelBuilder_TypedElements.createDefaultTypedElementEClass());
		eClassifiers.add(QMMMetaModelBuilder_RootClasses.createDefaultRootClasses());
		eClassifiers.addAll(QMMMetaModelBuilder_Queries.createDefaultQueryEClasses());
		eClassifiers.addAll(QMMMetaModelBuilder_Calculateables.createDefaultCalculateableEClasses());
		eClassifiers.addAll(QMMMetaModelBuilder_Attributes.createDefaultAttributeEClasses());
		eClassifiers.add(QMMMetaModelBuilder_Types.createDefaultTypeEClass());
		eClassifiers.add(QMMMetaModelBuilder_Types.createDefaultFunctionalTypeEClass());
		eClassifiers.addAll(QMMMetaModelBuilder_Arguments.createDefaultArgumentEClasses());
		eClassifiers.addAll(QMMMetaModelBuilder_Parameters.createDefaultParameterEClasses());
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.createDefaultOperatorEClasses());
		
		EReference evaluationOperatorERef = EObjectHelper.createEReference("EvaluationOperator", QMMMetaModelBuilder_Collections.defaultEClasses.get("EvaluationOperator"), 0, -1, true);  //8.12.18: changed upperB to -1, trying to reintroduce multiple eval: expressions per rootclass
		QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass").getEStructuralFeatures().add(evaluationOperatorERef);
		
		return eClassifiers;
	}

}
