package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_OrGroups {

	static ArrayList<EClass> createDefaultOrGroupEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		EClass orGroup = EObjectHelper.createEClass("OrGroup", true);
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NamedElement"));
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("GeneralizableElement"));
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Countable"));
		EAttribute transitive = EObjectHelper.createEAttribute("transitive", EcorePackage.Literals.EBOOLEAN, 1, 1, false);
		transitive.setDefaultValue(new Boolean(false));
		orGroup.getEStructuralFeatures().add(transitive);
		EObjectHelper.addValidationOperationToEClass(orGroup, EClassMethodBodies.ORGROUP_VALIDATIONOPERATION_BODY);
		
		EClass containmentOrGroup = EObjectHelper.createEClass("Containment_OrGroup", true);
		containmentOrGroup.getESuperTypes().add(orGroup);
		
		EClass referenceOrGroup = EObjectHelper.createEClass("Reference_OrGroup", true);
		referenceOrGroup.getESuperTypes().add(orGroup);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("OrGroup", orGroup);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Containment_OrGroup", containmentOrGroup);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Reference_OrGroup", referenceOrGroup);
		eClasses.add(orGroup);
		eClasses.add(containmentOrGroup);
		eClasses.add(referenceOrGroup);
		
		return eClasses;
	}
	
	static ArrayList<EClass> createConcreteOrGroupsForEClass(EClass ec){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		eClasses.add(createConcreteContainmentOrGroupForEClass(ec));
		eClasses.add(createConcreteReferenceOrGroupForEClass(ec));
		return eClasses;
	}
	
	static ArrayList<EClass> appendConcreteOrGroupToRef(EReference eRef){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		if(eRef.isContainment()) eRef.setEType(QMMMetaModelBuilder_Collections.concreteContainmentOrGroups.get(eRef.getEType()));
		else eRef.setEType(QMMMetaModelBuilder_Collections.concreteReferenceOrGroups.get(eRef.getEType()));
		
		eRef.setLowerBound(0);
		eRef.setUpperBound(-1);
		
		return eClasses;
	}
	
	static EClass createConcreteContainmentOrGroupForEClass(EClass ec){
		EClass concreteContainmentOrGroup = EObjectHelper.createEClass(ec.getName() + "_Containment_OrGroup", false);
		concreteContainmentOrGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Containment_OrGroup"));
		EReference rootClassERef = EObjectHelper.createEReference("containment", ec, 0, -1, true);
		concreteContainmentOrGroup.getEStructuralFeatures().add(rootClassERef);
		QMMMetaModelBuilder_Collections.concreteContainmentOrGroups.put(ec, concreteContainmentOrGroup);
		return concreteContainmentOrGroup;
	}
	
	static EClass createConcreteReferenceOrGroupForEClass(EClass ec){
		EClass concreteReferenceOrGroup = EObjectHelper.createEClass(ec.getName() + "_Reference_OrGroup", false);
		concreteReferenceOrGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Reference_OrGroup"));
		EReference rootClassERef = EObjectHelper.createEReference("reference", ec, 0, -1, false);
		concreteReferenceOrGroup.getEStructuralFeatures().add(rootClassERef);
		EObjectHelper.addValidationOperationToEClass(concreteReferenceOrGroup, EClassMethodBodies.CONCRETE_REFERENCEORGROUP_VALIDATIONOPERATION_BODY);
		QMMMetaModelBuilder_Collections.concreteReferenceOrGroups.put(ec, concreteReferenceOrGroup);
		return concreteReferenceOrGroup;
	}

}
