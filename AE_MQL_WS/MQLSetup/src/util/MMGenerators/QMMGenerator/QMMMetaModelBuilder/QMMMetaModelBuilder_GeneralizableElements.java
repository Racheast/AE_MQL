package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_GeneralizableElements {
	static EClass createDefaultGeneralizableElement(){
		EClass generalizableElementEClass = EObjectHelper.createEClass("GeneralizableElement", true);
		EAttribute generalized = EObjectHelper.createEAttribute("generalized", EcorePackage.Literals.EBOOLEAN, 1, 1, false);
		generalized.setLowerBound(1);
		generalized.setUpperBound(1);
		generalized.setDefaultValue(false);
		generalizableElementEClass.getEStructuralFeatures().add(generalized);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("GeneralizableElement", generalizableElementEClass);
		return generalizableElementEClass;
	}
}
