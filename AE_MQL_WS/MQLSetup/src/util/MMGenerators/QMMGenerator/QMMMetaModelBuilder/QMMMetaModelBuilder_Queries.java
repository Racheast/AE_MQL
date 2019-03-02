package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Queries {

	static ArrayList<EClass> createDefaultQueryEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		EClass findQuery = EObjectHelper.createEClass("FindQuery", false);
		EReference unionERef = EObjectHelper.createEReference("union", findQuery, 0, -1, true);
		findQuery.getEStructuralFeatures().add(unionERef);
		
		EReference rootClassERef = EObjectHelper.createEReference("rootClass", QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass"), 1, -1, true);
		findQuery.getEStructuralFeatures().add(rootClassERef);
		
		EClass selectClause = EObjectHelper.createEClass("SelectClause", false);
		EReference namedElementERef = EObjectHelper.createEReference("namedElements", QMMMetaModelBuilder_Collections.defaultEClasses.get("NamedElement"), 1, -1, false);
		selectClause.getEStructuralFeatures().add(namedElementERef);
		EObjectHelper.addValidationOperationToEClass(selectClause, EClassMethodBodies.SELECTCLAUSE_VALIDATIONOPERATION_BODY);
		
		EReference selectClauseERef = EObjectHelper.createEReference("select", selectClause, 0, 1, true);
		findQuery.getEStructuralFeatures().add(selectClauseERef);
		
		EClass findQueryCollection = EObjectHelper.createEClass("FindQueryCollection", false);
		EReference findQueryERef = EObjectHelper.createEReference("findQueries", findQuery, 1, -1, true);
		findQueryCollection.getEStructuralFeatures().add(findQueryERef);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FindQuery", findQuery);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("SelectClause", selectClause);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FindQueryCollection", findQueryCollection);
		
		eClasses.add(findQuery);
		eClasses.add(selectClause);
		eClasses.add(findQueryCollection);
		
		return eClasses;
	}

}
