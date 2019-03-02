package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_TypedElements {

	static EClass createDefaultTypedElementEClass(){
		EClass typedElement = EObjectHelper.createEClass("TypedElement", true);
		EAnnotation genModelAnnotation = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.TYPED_ELEMENT_GETTYPE_BODY);
		EOperation getType = EObjectHelper.createEOperation("getType", EcorePackage.Literals.EJAVA_OBJECT, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		typedElement.getEOperations().add(getType);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("TypedElement", typedElement);
		return typedElement;
	}

}
