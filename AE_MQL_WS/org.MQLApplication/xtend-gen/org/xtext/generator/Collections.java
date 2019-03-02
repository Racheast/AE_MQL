package org.xtext.generator;

import java.util.HashMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.xtext.generator.Utils;
import qmm.AttributeEClass;
import qmm.EvaluationFunctionalOperator;
import qmm.FindQueryCollection;
import qmm.OrGroup;
import qmm.ReferenceArgument;
import qmm.RootClass;

@SuppressWarnings("all")
public class Collections {
  public static HashMap<RootClass, String> rootClassLib;
  
  public static HashMap<AttributeEClass, String> attrLib;
  
  public static HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib;
  
  public static HashMap<EvaluationFunctionalOperator, String> evaluationOperatorLib;
  
  public static HashMap<ReferenceArgument, String> referenceArgumentLib;
  
  public static HashMap<OrGroup, String> orGroupLib;
  
  public static void initLibs(final FindQueryCollection queryCollection) {
    Collections.referenceFromToLib = Utils.initReferenceFromToLib(queryCollection);
    Collections.rootClassLib = Utils.initRootClassLib(queryCollection);
    Collections.attrLib = Utils.initAttrLib(queryCollection);
    Collections.evaluationOperatorLib = Utils.initEvaluationOperatorLib(queryCollection);
    Collections.referenceArgumentLib = Utils.initReferenceArgumentLib(Collections.evaluationOperatorLib);
    Collections.orGroupLib = Utils.initOrGroupLib(queryCollection);
  }
}
