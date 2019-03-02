package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_RootClasses {

	static EClass createDefaultRootClasses(){
		EAnnotation genModelAnnotation = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.ROOTCLASS_VALIDATECHECKEXPRESSION_BODY);
		EOperation validateCheckExpression = EObjectHelper.createEOperation("validateCheckExpression", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		validateCheckExpression.getEParameters().add(EObjectHelper.createEParameter("o", EcorePackage.Literals.EJAVA_OBJECT));
		
		EAnnotation genModelAnnotation2 = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.ROOTCLASS_VALIDATEALLCHECKEXPRESSIONS_BODY);
		EOperation validateAllCheckExpressions = EObjectHelper.createEOperation("validateAllCheckExpressions", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation2)));
		validateAllCheckExpressions.getEParameters().add(EObjectHelper.createEParameter("o", EcorePackage.Literals.EJAVA_OBJECT));
		
		EClass rootClassEClass = EObjectHelper.createEClass("RootClass", true);
		rootClassEClass.getEOperations().add(validateCheckExpression);
		rootClassEClass.getEOperations().add(validateAllCheckExpressions);
		rootClassEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NamedElement"));
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("RootClass", rootClassEClass);
	
		return rootClassEClass;
	}

}
