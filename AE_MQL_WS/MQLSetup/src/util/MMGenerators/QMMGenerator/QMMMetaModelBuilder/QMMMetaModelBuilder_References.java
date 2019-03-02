package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_References {
	public static EClass createDefaultReference(){
		EClass referenceEClass = EObjectHelper.createEClass("ReferenceObject", true);
		referenceEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));
		referenceEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("GeneralizableElement"));
		EAttribute transitive = EObjectHelper.createEAttribute("transitive", EcorePackage.Literals.EBOOLEAN, 1, 1, false);
		transitive.setDefaultValue(new Boolean(false));
		referenceEClass.getEStructuralFeatures().add(transitive);
		EObjectHelper.addValidationOperationToEClass(referenceEClass,EClassMethodBodies.REFERENCE_VALIDATIONOPERATION_BODY);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("ReferenceObject", referenceEClass);
		return referenceEClass;
	}
}
