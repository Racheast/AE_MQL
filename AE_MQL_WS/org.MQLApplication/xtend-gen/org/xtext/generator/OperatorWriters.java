package org.xtext.generator;

import java.util.ArrayList;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.xtext.generator.Collections;
import org.xtext.generator.Utils;
import qmm.AggregationOperator;
import qmm.Argument;
import qmm.AttributeEClass;
import qmm.BitOperator;
import qmm.CalculateableElement;
import qmm.CalculateableElement_ReferenceArgument;
import qmm.Calculateable_Argument;
import qmm.CalculatingAggregationOperator;
import qmm.ClassOperator;
import qmm.Countable;
import qmm.CountingAggregationOperator;
import qmm.EvaluationFunctionalOperator;
import qmm.EvaluationOperation_Argument;
import qmm.EvaluationOperator;
import qmm.FunctionalOperator;
import qmm.FunctionalType;
import qmm.Integer_PrimitiveArgument;
import qmm.NamedElement;
import qmm.Operator;
import qmm.OrGroup;
import qmm.Parameter;
import qmm.PrimitiveArgument;
import qmm.ReferenceArgument;
import qmm.RegularAttributeEClass;
import qmm.RootClass;
import qmm.String_PrimitiveArgument;
import qmm.TypedElement;

@SuppressWarnings("all")
public class OperatorWriters {
  public static String writeOperator(final Operator o, final String name) {
    String code = "";
    if ((o instanceof BitOperator)) {
      final BitOperator bo = ((BitOperator) o);
      String negated = "";
      boolean _isNegated = bo.isNegated();
      if (_isNegated) {
        negated = "!";
      }
      String _code = code;
      code = (_code + (negated + "("));
      for (int i = 0; (i < Utils.getConnectsReferenceContents(bo).size()); i++) {
        {
          final Operator o2 = Utils.getConnectsReferenceContents(bo).get(i);
          String _code_1 = code;
          String _writeOperator = OperatorWriters.writeOperator(o2, name);
          code = (_code_1 + _writeOperator);
          int _size = Utils.getConnectsReferenceContents(bo).size();
          int _minus = (_size - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            String _code_2 = code;
            String _operatorLiteral = Utils.getOperatorLiteral(bo);
            code = (_code_2 + _operatorLiteral);
          }
        }
      }
      String _code_1 = code;
      code = (_code_1 + ")");
    }
    if ((o instanceof EvaluationFunctionalOperator)) {
      final EvaluationFunctionalOperator fo = ((EvaluationFunctionalOperator) o);
      FunctionalOperator nextFo = Utils.getFunctionalOperator(((FunctionalType) fo));
      if ((nextFo != null)) {
        String _code_2 = code;
        String _writeFunctionalOperator = OperatorWriters.writeFunctionalOperator(nextFo, Utils.evaluationOperatorRefNames.get(fo));
        code = (_code_2 + _writeFunctionalOperator);
      }
    } else {
      if ((o instanceof FunctionalOperator)) {
        final FunctionalOperator fo_1 = ((FunctionalOperator) o);
        String _code_3 = code;
        String _writeFunctionalOperator_1 = OperatorWriters.writeFunctionalOperator(fo_1, name);
        code = (_code_3 + _writeFunctionalOperator_1);
      }
    }
    return code;
  }
  
  private static String writeFunctionalOperator(final FunctionalOperator fo, final String prevCode) {
    String code = (("(" + prevCode) + ")");
    String _negatedSymbol = Utils.getNegatedSymbol(fo);
    String _plus = (_negatedSymbol + "(");
    String _plus_1 = (_plus + code);
    String _operatorLiteral = Utils.getOperatorLiteral(fo);
    String _plus_2 = (_plus_1 + _operatorLiteral);
    String _writeParameters = OperatorWriters.writeParameters(Utils.getAllParameters(fo));
    String _plus_3 = (_plus_2 + _writeParameters);
    String _plus_4 = (_plus_3 + ")");
    code = _plus_4;
    final FunctionalOperator nextFo = Utils.getFunctionalOperator(((FunctionalType) fo));
    if ((nextFo != null)) {
      code = OperatorWriters.writeFunctionalOperator(nextFo, code);
    }
    return code;
  }
  
  private static String writeParameters(final EList<Parameter> parameters) {
    String code = "(";
    for (int i = 0; (i < parameters.size()); i++) {
      {
        Parameter p = parameters.get(i);
        Object _eGet = p.eGet(p.eClass().getEStructuralFeature("argument"));
        final Argument argument = ((Argument) _eGet);
        String value = "";
        if ((argument instanceof PrimitiveArgument)) {
          value = Utils.writePrimitiveArgumentValue(((PrimitiveArgument) argument));
        } else {
          if ((argument instanceof CalculateableElement_ReferenceArgument)) {
            final CalculateableElement_ReferenceArgument refArg = ((CalculateableElement_ReferenceArgument) argument);
            Object _eGet_1 = refArg.eGet(refArg.eClass().getEStructuralFeature("reference"));
            final AttributeEClass attr = ((AttributeEClass) _eGet_1);
            value = attr.getName();
          } else {
            if ((argument instanceof EvaluationOperation_Argument)) {
              value = Utils.evaluationOperatorRefNames.get(((EvaluationOperator) argument));
            }
          }
        }
        Object operator = ((Object) null);
        EStructuralFeature _eStructuralFeature = argument.eClass().getEStructuralFeature("operator");
        boolean _tripleNotEquals = (_eStructuralFeature != null);
        if (_tripleNotEquals) {
          operator = argument.eGet(argument.eClass().getEStructuralFeature("operator"));
          if ((operator != null)) {
            String _code = code;
            String _writeFunctionalOperator = OperatorWriters.writeFunctionalOperator(((FunctionalOperator) operator), value);
            code = (_code + _writeFunctionalOperator);
          }
        }
        if ((operator == null)) {
          String _code_1 = code;
          code = (_code_1 + value);
        }
        int _size = parameters.size();
        int _minus = (_size - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          String _code_2 = code;
          code = (_code_2 + ", ");
        }
      }
    }
    String _code = code;
    code = (_code + ")");
    return code;
  }
  
  public static String writeEvaluationOperatorPatterns() {
    String code = "";
    Set<EvaluationFunctionalOperator> _keySet = Collections.evaluationOperatorLib.keySet();
    for (final EvaluationFunctionalOperator op : _keySet) {
      {
        final RootClass containingRc = Utils.getContainingRootClass(op);
        final Parameter param = Utils.getAllParameters(op).get(0);
        final String operatorLiteral = Utils.getOperatorLiteral(op);
        Object _type = op.getType();
        String typeName = ((EClass) _type).getName();
        typeName = typeName.substring(0, typeName.indexOf("_"));
        String _code = code;
        String _get = Collections.evaluationOperatorLib.get(op);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "(");
        String _name = containingRc.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ":");
        String _name_1 = containingRc.eClass().getName();
        String _plus_4 = (_plus_3 + _name_1);
        String _plus_5 = (_plus_4 + ", result : java ");
        String _plus_6 = (_plus_5 + typeName);
        String _plus_7 = (_plus_6 + "){\n");
        code = (_code + _plus_7);
        if ((op instanceof AggregationOperator)) {
          Object _eGet = param.eGet(param.eClass().getEStructuralFeature("argument"));
          Argument arg = ((Argument) _eGet);
          if ((op instanceof CountingAggregationOperator)) {
            Object _eGet_1 = arg.eGet(arg.eClass().getEStructuralFeature("reference"));
            final Countable countable = ((Countable) _eGet_1);
            String countablePatternName = "";
            if ((countable instanceof AttributeEClass)) {
              countablePatternName = Collections.attrLib.get(((AttributeEClass) countable));
              String _code_1 = code;
              String _name_2 = containingRc.getName();
              String _plus_8 = ((((("    result == " + operatorLiteral) + " find ") + countablePatternName) + "(") + _name_2);
              code = (_code_1 + _plus_8);
              if ((countable instanceof RegularAttributeEClass)) {
                String _code_2 = code;
                String _name_3 = ((NamedElement) countable).getName();
                String _plus_9 = (", " + _name_3);
                code = (_code_2 + _plus_9);
              }
              String _code_3 = code;
              code = (_code_3 + ");\n");
            } else {
              if ((countable instanceof OrGroup)) {
                String _get_1 = Collections.orGroupLib.get(((OrGroup) countable));
                String _plus_10 = (_get_1 + "_ref");
                countablePatternName = _plus_10;
                String _code_4 = code;
                String _writeOrGroupReferenceParameters = Utils.writeOrGroupReferenceParameters(((OrGroup) countable));
                String _plus_11 = ((((("    result == " + operatorLiteral) + " find ") + countablePatternName) + "(") + _writeOrGroupReferenceParameters);
                String _plus_12 = (_plus_11 + ");\n");
                code = (_code_4 + _plus_12);
              }
            }
          } else {
            if ((op instanceof CalculatingAggregationOperator)) {
              String _code_5 = code;
              String _get_2 = Collections.referenceArgumentLib.get(arg);
              String _plus_13 = ((("    result == " + operatorLiteral) + " find ") + _get_2);
              String _plus_14 = (_plus_13 + "(elem, #);\n");
              code = (_code_5 + _plus_14);
            }
          }
          String _code_6 = code;
          code = (_code_6 + "}\n\n");
        } else {
          if ((op instanceof ClassOperator)) {
            String _code_7 = code;
            String _name_4 = containingRc.eClass().getName();
            String _plus_15 = ("    " + _name_4);
            String _plus_16 = (_plus_15 + "(elem);");
            code = (_code_7 + _plus_16);
            final Object arg_1 = param.eGet(param.eClass().getEStructuralFeature("argument"));
            if ((arg_1 instanceof Calculateable_Argument)) {
              String _code_8 = code;
              String _get_3 = Collections.referenceArgumentLib.get(arg_1);
              String _plus_17 = ("    find " + _get_3);
              String _plus_18 = (_plus_17 + "(elem, ");
              String _get_4 = Utils.referenceArgumentRefNames.get(((Calculateable_Argument) arg_1));
              String _plus_19 = (_plus_18 + _get_4);
              String _plus_20 = (_plus_19 + ");\n");
              code = (_code_8 + _plus_20);
              String _code_9 = code;
              String _get_5 = Utils.referenceArgumentRefNames.get(((Calculateable_Argument) arg_1));
              String _plus_21 = ((("\tresult == eval(" + operatorLiteral) + "(") + _get_5);
              String _plus_22 = (_plus_21 + "));\n");
              code = (_code_9 + _plus_22);
            } else {
              if ((arg_1 instanceof String_PrimitiveArgument)) {
                String _code_10 = code;
                String _value = ((String_PrimitiveArgument) arg_1).getValue();
                String _plus_23 = ((("\tresult == eval(" + operatorLiteral) + "(\"") + _value);
                String _plus_24 = (_plus_23 + "\"));\n");
                code = (_code_10 + _plus_24);
              } else {
                if ((arg_1 instanceof Integer_PrimitiveArgument)) {
                  String _code_11 = code;
                  Integer _value_1 = ((Integer_PrimitiveArgument) arg_1).getValue();
                  String _plus_25 = ((("\tresult == eval(" + operatorLiteral) + "(") + _value_1);
                  String _plus_26 = (_plus_25 + "));\n");
                  code = (_code_11 + _plus_26);
                }
              }
            }
            String _code_12 = code;
            code = (_code_12 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
  
  public static String writeArgumentPatterns() {
    String code = "";
    Set<ReferenceArgument> _keySet = Collections.referenceArgumentLib.keySet();
    for (final ReferenceArgument arg : _keySet) {
      {
        final RootClass containingRc = Utils.getContainingRootClass(arg);
        String typeName = "Object";
        if ((arg instanceof CalculateableElement_ReferenceArgument)) {
          Object _eGet = ((CalculateableElement_ReferenceArgument)arg).eGet(((CalculateableElement_ReferenceArgument)arg).eClass().getEStructuralFeature("reference"));
          final CalculateableElement calculateableElement = ((CalculateableElement) _eGet);
          final AttributeEClass attr = ((AttributeEClass) calculateableElement);
          Object _eGet_1 = ((CalculateableElement_ReferenceArgument)arg).eGet(((CalculateableElement_ReferenceArgument)arg).eClass().getEStructuralFeature("operator"));
          final FunctionalOperator operator = ((FunctionalOperator) _eGet_1);
          if ((operator == null)) {
            Object _type = ((CalculateableElement_ReferenceArgument)arg).getType();
            typeName = ((EClass) _type).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code = code;
            String _get = Collections.referenceArgumentLib.get(arg);
            String _plus = ("pattern " + _get);
            String _plus_1 = (_plus + "(elem:");
            String _name = containingRc.eClass().getName();
            String _plus_2 = (_plus_1 + _name);
            String _plus_3 = (_plus_2 + ", result: java ");
            String _plus_4 = (_plus_3 + typeName);
            String _plus_5 = (_plus_4 + "){\n");
            code = (_code + _plus_5);
            String _code_1 = code;
            String _get_1 = Collections.attrLib.get(attr);
            String _plus_6 = ("    find " + _get_1);
            String _plus_7 = (_plus_6 + "(elem, result);\n");
            code = (_code_1 + _plus_7);
          } else {
            Object _lastOperator = operator.getLastOperator();
            Object _type_1 = ((TypedElement) _lastOperator).getType();
            typeName = ((EClass) _type_1).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code_2 = code;
            String _get_2 = Collections.referenceArgumentLib.get(arg);
            String _plus_8 = ("pattern " + _get_2);
            String _plus_9 = (_plus_8 + "(elem:");
            String _name_1 = containingRc.eClass().getName();
            String _plus_10 = (_plus_9 + _name_1);
            String _plus_11 = (_plus_10 + ", result: java ");
            String _plus_12 = (_plus_11 + typeName);
            String _plus_13 = (_plus_12 + "){\n");
            code = (_code_2 + _plus_13);
            final ArrayList<EvaluationFunctionalOperator> evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(((Operator) operator));
            for (final EvaluationFunctionalOperator aop : evaluationOperators) {
              String _code_3 = code;
              String _get_3 = Collections.evaluationOperatorLib.get(aop);
              String _plus_14 = ("    find " + _get_3);
              String _plus_15 = (_plus_14 + "(elem, ");
              String _get_4 = Utils.evaluationOperatorRefNames.get(aop);
              String _plus_16 = (_plus_15 + _get_4);
              String _plus_17 = (_plus_16 + ");\n");
              code = (_code_3 + _plus_17);
            }
            String _code_4 = code;
            String _get_5 = Collections.attrLib.get(attr);
            String _plus_18 = ("    find " + _get_5);
            String _plus_19 = (_plus_18 + "(elem, ");
            String _name_2 = attr.getName();
            String _plus_20 = (_plus_19 + _name_2);
            String _plus_21 = (_plus_20 + ");\n");
            code = (_code_4 + _plus_21);
            String _code_5 = code;
            String _writeOperator = OperatorWriters.writeOperator(((Operator) operator), attr.getName());
            String _plus_22 = ("    result == eval(" + _writeOperator);
            String _plus_23 = (_plus_22 + ");\n");
            code = (_code_5 + _plus_23);
          }
          String _code_6 = code;
          code = (_code_6 + "}\n\n");
        } else {
          if ((arg instanceof Calculateable_Argument)) {
            Object _type_2 = ((Calculateable_Argument)arg).getType();
            typeName = ((EClass) _type_2).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code_7 = code;
            String _get_6 = Collections.referenceArgumentLib.get(arg);
            String _plus_24 = ("pattern " + _get_6);
            String _plus_25 = (_plus_24 + "(elem:");
            String _name_3 = containingRc.eClass().getName();
            String _plus_26 = (_plus_25 + _name_3);
            String _plus_27 = (_plus_26 + ", result: java ");
            String _plus_28 = (_plus_27 + typeName);
            String _plus_29 = (_plus_28 + "){\n");
            code = (_code_7 + _plus_29);
            String _code_8 = code;
            String _get_7 = Collections.evaluationOperatorLib.get(arg);
            String _plus_30 = ("    find " + _get_7);
            String _plus_31 = (_plus_30 + "(elem,result);\n");
            code = (_code_8 + _plus_31);
            String _code_9 = code;
            code = (_code_9 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
}
