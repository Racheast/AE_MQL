package org.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.xtext.generator.Collections;
import org.xtext.generator.OperatorWriters;
import org.xtext.generator.Utils;
import qmm.AttributeEClass;
import qmm.EnumerationAttributeEClass;
import qmm.EnumerationOperator;
import qmm.EvaluationFunctionalOperator;
import qmm.ExpressionOperator;
import qmm.Operator;
import qmm.OrGroup;
import qmm.RegularAttributeEClass;
import qmm.RootClass;

@SuppressWarnings("all")
public class AttributeWriters {
  public static String writeAttributePatterns() {
    String code = "";
    Set<AttributeEClass> _keySet = Collections.attrLib.keySet();
    for (final AttributeEClass attr : _keySet) {
      String _code = code;
      String _writeAttributePattern = AttributeWriters.writeAttributePattern(attr);
      String _plus = ("\n" + _writeAttributePattern);
      code = (_code + _plus);
    }
    return code;
  }
  
  private static String writeAttributePattern(final AttributeEClass attr) {
    String code = "";
    if ((attr instanceof RegularAttributeEClass)) {
      code = AttributeWriters.writeRegularAttributePattern(((RegularAttributeEClass) attr));
    } else {
      if ((attr instanceof EnumerationAttributeEClass)) {
        code = AttributeWriters.writeEnumerationAttributePattern(((EnumerationAttributeEClass) attr));
      }
    }
    return code;
  }
  
  private static String writeRegularAttributePattern(final RegularAttributeEClass attr) {
    Object _eGet = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
    final Operator operator = ((Operator) _eGet);
    final ArrayList<EvaluationFunctionalOperator> evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator);
    final String containingFeatureName = attr.eContainingFeature().getName().substring(0, attr.eContainingFeature().getName().indexOf("_AttrEClass"));
    EObject _eContainer = attr.eContainer();
    final RootClass rc = ((RootClass) _eContainer);
    String _get = Collections.attrLib.get(attr);
    String _plus = ("pattern " + _get);
    String _plus_1 = (_plus + "(");
    String _name = rc.getName();
    String _plus_2 = (_plus_1 + _name);
    String _plus_3 = (_plus_2 + ":");
    String _name_1 = attr.eContainer().eClass().getName();
    String _plus_4 = (_plus_3 + _name_1);
    String _plus_5 = (_plus_4 + ", ");
    String _name_2 = attr.getName();
    String _plus_6 = (_plus_5 + _name_2);
    String code = (_plus_6 + "){");
    for (final EvaluationFunctionalOperator aop : evaluationOperators) {
      String _code = code;
      String _get_1 = Collections.evaluationOperatorLib.get(aop);
      String _plus_7 = ("\n    find " + _get_1);
      String _plus_8 = (_plus_7 + "(");
      String _name_3 = rc.getName();
      String _plus_9 = (_plus_8 + _name_3);
      String _plus_10 = (_plus_9 + ", ");
      String _get_2 = Utils.evaluationOperatorRefNames.get(aop);
      String _plus_11 = (_plus_10 + _get_2);
      String _plus_12 = (_plus_11 + ");");
      code = (_code + _plus_12);
    }
    String _code_1 = code;
    String _name_4 = attr.eContainer().eClass().getName();
    String _plus_13 = ("\n    " + _name_4);
    String _plus_14 = (_plus_13 + ".");
    String _plus_15 = (_plus_14 + containingFeatureName);
    String _plus_16 = (_plus_15 + "(");
    String _name_5 = rc.getName();
    String _plus_17 = (_plus_16 + _name_5);
    String _plus_18 = (_plus_17 + ", ");
    String _name_6 = attr.getName();
    String _plus_19 = (_plus_18 + _name_6);
    String _plus_20 = (_plus_19 + ");");
    code = (_code_1 + _plus_20);
    boolean _notEquals = (!Objects.equal(operator, null));
    if (_notEquals) {
      String _code_2 = code;
      String _writeReferences = AttributeWriters.writeReferences(((ExpressionOperator) operator));
      code = (_code_2 + _writeReferences);
    }
    String _code_3 = code;
    String _writeInequalityConstraints = Utils.writeInequalityConstraints(attr);
    code = (_code_3 + _writeInequalityConstraints);
    boolean _notEquals_1 = (!Objects.equal(operator, null));
    if (_notEquals_1) {
      String _code_4 = code;
      String _writeCheckClauseForAttribute = AttributeWriters.writeCheckClauseForAttribute(attr);
      String _plus_21 = ("\n" + _writeCheckClauseForAttribute);
      code = (_code_4 + _plus_21);
    }
    String _code_5 = code;
    code = (_code_5 + "\n}\n\n");
    return code;
  }
  
  private static String writeEnumerationAttributePattern(final EnumerationAttributeEClass attr) {
    Object operator = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
    String enumString = "x";
    final String containingFeatureName = attr.eContainingFeature().getName().substring(0, attr.eContainingFeature().getName().indexOf("_AttrEClass"));
    EObject _eContainer = attr.eContainer();
    final RootClass rc = ((RootClass) _eContainer);
    String _get = Collections.attrLib.get(attr);
    String _plus = ("pattern " + _get);
    String _plus_1 = (_plus + "(");
    String _name = rc.getName();
    String _plus_2 = (_plus_1 + _name);
    String _plus_3 = (_plus_2 + ":");
    String _name_1 = attr.eContainer().eClass().getName();
    String _plus_4 = (_plus_3 + _name_1);
    String code = (_plus_4 + "){\n");
    if ((operator == null)) {
      String _code = code;
      String _name_2 = attr.eContainer().eClass().getName();
      String _plus_5 = ("\t" + _name_2);
      String _plus_6 = (_plus_5 + ".");
      String _plus_7 = (_plus_6 + containingFeatureName);
      String _plus_8 = (_plus_7 + "(");
      String _name_3 = rc.getName();
      String _plus_9 = (_plus_8 + _name_3);
      String _plus_10 = (_plus_9 + ",");
      String _plus_11 = (_plus_10 + enumString);
      String _plus_12 = (_plus_11 + ");\n}");
      code = (_code + _plus_12);
    } else {
      while ((operator != null)) {
        {
          final EnumerationOperator enumOperator = ((EnumerationOperator) operator);
          Object _eGet = enumOperator.eGet(enumOperator.eClass().getEStructuralFeature("argument"));
          final Enumerator enumLiteral = ((Enumerator) _eGet);
          String _string = enumLiteral.toString();
          String _plus_13 = ("::" + _string);
          enumString = _plus_13;
          String _code_1 = code;
          String _name_4 = attr.eContainer().eClass().getName();
          String _plus_14 = ("\t" + _name_4);
          String _plus_15 = (_plus_14 + ".");
          String _plus_16 = (_plus_15 + containingFeatureName);
          String _plus_17 = (_plus_16 + "(");
          String _name_5 = rc.getName();
          String _plus_18 = (_plus_17 + _name_5);
          String _plus_19 = (_plus_18 + ",");
          String _plus_20 = (_plus_19 + enumString);
          String _plus_21 = (_plus_20 + ");\n}");
          code = (_code_1 + _plus_21);
          operator = enumOperator.eGet(enumOperator.eClass().getEStructuralFeature("or"));
          if ((operator != null)) {
            String _code_2 = code;
            code = (_code_2 + "or{\n");
          }
        }
      }
    }
    String _code_1 = code;
    code = (_code_1 + "\n\n");
    return code;
  }
  
  private static String writeReferences(final ExpressionOperator operator) {
    String code = "";
    HashSet<AttributeEClass> _collectReferenceAttributes = Utils.collectReferenceAttributes(operator);
    for (final AttributeEClass referencedAttribute : _collectReferenceAttributes) {
      {
        final int hashCode = System.identityHashCode(referencedAttribute);
        EObject _eContainer = referencedAttribute.eContainer().eContainer();
        final OrGroup orGroup = ((OrGroup) _eContainer);
        String _code = code;
        String _get = Collections.attrLib.get(referencedAttribute);
        String _plus = ("\n    find " + _get);
        String _plus_1 = (_plus + "(");
        String _name = orGroup.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ",");
        String _name_1 = referencedAttribute.getName();
        String _plus_4 = (_plus_3 + _name_1);
        String _plus_5 = (_plus_4 + ");\n");
        code = (_code + _plus_5);
      }
    }
    return code;
  }
  
  private static String writeCheckClauseForAttribute(final AttributeEClass attr) {
    String code = "    check(";
    String _code = code;
    Object _eGet = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
    String _writeOperator = OperatorWriters.writeOperator(((Operator) _eGet), attr.getName());
    code = (_code + _writeOperator);
    String _code_1 = code;
    code = (_code_1 + ");");
    return code;
  }
}
