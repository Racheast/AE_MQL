package org.xtext.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.generator.Collections;
import org.xtext.generator.OperatorWriters;
import org.xtext.generator.Utils;
import qmm.AttributeEClass;
import qmm.EnumerationAttributeEClass;
import qmm.EvaluationFunctionalOperator;
import qmm.EvaluationOperator;
import qmm.NamedElement;
import qmm.OrGroup;
import qmm.RootClass;
import qmm.impl.RegularAttributeEClassImpl;

@SuppressWarnings("all")
public class RootClassWriters {
  public static String writeRootClassPatterns() {
    String code = "";
    Set<RootClass> _keySet = Collections.rootClassLib.keySet();
    for (final RootClass rc : _keySet) {
      {
        String _code = code;
        String _get = Collections.rootClassLib.get(rc);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "(");
        String _writeRootClassParameters = Utils.writeRootClassParameters(rc);
        String _plus_2 = (_plus_1 + _writeRootClassParameters);
        String _plus_3 = (_plus_2 + "){\n");
        code = (_code + _plus_3);
        String _code_1 = code;
        String _writeRootClassBody = RootClassWriters.writeRootClassBody(rc);
        code = (_code_1 + _writeRootClassBody);
        String _code_2 = code;
        code = (_code_2 + "}\n\n");
      }
    }
    return code;
  }
  
  private static String writeRootClassBody(final RootClass rc) {
    String code = RootClassWriters.writeReferencedAndContained_RootClassDeclarations(rc);
    String _code = code;
    String _writeAttributeReferences = RootClassWriters.writeAttributeReferences(rc);
    code = (_code + _writeAttributeReferences);
    String _code_1 = code;
    String _writeOrGroupReferences = RootClassWriters.writeOrGroupReferences(rc);
    code = (_code_1 + _writeOrGroupReferences);
    String _code_2 = code;
    String _writeInequalityConstraints = Utils.writeInequalityConstraints(rc);
    code = (_code_2 + _writeInequalityConstraints);
    String _code_3 = code;
    String _writeEvaluationOperatorReferences = RootClassWriters.writeEvaluationOperatorReferences(rc);
    code = (_code_3 + _writeEvaluationOperatorReferences);
    return code;
  }
  
  private static String writeReferencedAndContained_RootClassDeclarations(final RootClass rc) {
    String code = "";
    List<RootClass> _referencedRootClasses = Utils.getReferencedRootClasses(rc);
    HashSet<NamedElement> containedAndReferencedRootClasses_and_OrGroups = new HashSet<NamedElement>(_referencedRootClasses);
    containedAndReferencedRootClasses_and_OrGroups.add(rc);
    containedAndReferencedRootClasses_and_OrGroups.addAll(Utils.getContainedAndReferencedRootClasses_and_OrGroups_excluding_negated_elements(rc));
    for (final NamedElement n : containedAndReferencedRootClasses_and_OrGroups) {
      if (((n == rc) || ((n instanceof RootClass) && (!(n.eContainer() instanceof OrGroup))))) {
        String _code = code;
        String _name = n.eClass().getName();
        String _plus = ("    " + _name);
        String _plus_1 = (_plus + "(");
        String _name_1 = n.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ");\n");
        code = (_code + _plus_3);
      } else {
        if ((((n instanceof RootClass) && (n.eContainer() != null)) && (n.eContainer() instanceof OrGroup))) {
          String _code_1 = code;
          EObject _eContainer = n.eContainer();
          String _typeNameOfOrGroup = Utils.getTypeNameOfOrGroup(((OrGroup) _eContainer));
          String _plus_4 = ("    " + _typeNameOfOrGroup);
          String _plus_5 = (_plus_4 + "(");
          String _name_2 = n.getName();
          String _plus_6 = (_plus_5 + _name_2);
          String _plus_7 = (_plus_6 + ");\n");
          code = (_code_1 + _plus_7);
        } else {
          if (((n instanceof OrGroup) && (!((OrGroup) n).isNegated()))) {
            String _code_2 = code;
            String _typeNameOfOrGroup_1 = Utils.getTypeNameOfOrGroup(((OrGroup) n));
            String _plus_8 = ("    " + _typeNameOfOrGroup_1);
            String _plus_9 = (_plus_8 + "(");
            String _name_3 = n.getName();
            String _plus_10 = (_plus_9 + _name_3);
            String _plus_11 = (_plus_10 + ");\n");
            code = (_code_2 + _plus_11);
          }
        }
      }
    }
    return code;
  }
  
  private static String writeOrGroupReferences(final RootClass rc) {
    String code = "";
    final ArrayList<OrGroup> orGroups = Utils.getOrGroupsOfRootClass(rc);
    for (int i = 0; (i < orGroups.size()); i++) {
      {
        final OrGroup og = orGroups.get(i);
        String negated = "";
        boolean _isNegated = og.isNegated();
        if (_isNegated) {
          negated = "neg ";
        }
        String _code = code;
        String _get = Collections.orGroupLib.get(og);
        String _plus = ((("    " + negated) + "find ") + _get);
        String _plus_1 = (_plus + "_ref(");
        String _writeOrGroupReferenceParameters = Utils.writeOrGroupReferenceParameters(og);
        String _plus_2 = (_plus_1 + _writeOrGroupReferenceParameters);
        String _plus_3 = (_plus_2 + ");\n");
        code = (_code + _plus_3);
      }
    }
    return code;
  }
  
  private static String writeAttributeReferences(final RootClass rc) {
    String code = "";
    List<AttributeEClass> _directReferencedAttributes = Utils.getDirectReferencedAttributes(rc);
    for (final AttributeEClass a : _directReferencedAttributes) {
      String _code = code;
      String _writeAttributeReference = RootClassWriters.writeAttributeReference(a);
      code = (_code + _writeAttributeReference);
    }
    return code;
  }
  
  private static String writeEvaluationOperatorReferences(final RootClass rc) {
    String code = "";
    Object _eGet = rc.eGet(rc.eClass().getEStructuralFeature("EvaluationOperator"));
    final EList<EvaluationOperator> evaluationOperators = ((EList<EvaluationOperator>) _eGet);
    for (final EvaluationOperator evaluationOperator : evaluationOperators) {
      {
        final ArrayList<EvaluationFunctionalOperator> firstLevelEvaluationFunctionalOperators = Utils.collectAllEvaluationFunctionalOperators(evaluationOperator);
        for (int j = 0; (j < firstLevelEvaluationFunctionalOperators.size()); j++) {
          {
            final EvaluationFunctionalOperator o = firstLevelEvaluationFunctionalOperators.get(j);
            String _code = code;
            String _get = Collections.evaluationOperatorLib.get(o);
            String _plus = ("    find " + _get);
            String _plus_1 = (_plus + "(");
            String _name = rc.getName();
            String _plus_2 = (_plus_1 + _name);
            String _plus_3 = (_plus_2 + ", ");
            String _get_1 = Utils.evaluationOperatorRefNames.get(o);
            String _plus_4 = (_plus_3 + _get_1);
            String _plus_5 = (_plus_4 + ");\n");
            code = (_code + _plus_5);
          }
        }
        String _code = code;
        String _writeOperator = OperatorWriters.writeOperator(evaluationOperator, "");
        String _plus = ("    check(" + _writeOperator);
        String _plus_1 = (_plus + ");\n");
        code = (_code + _plus_1);
      }
    }
    return code;
  }
  
  private static String writeAttributeReference(final AttributeEClass attr) {
    String _xblockexpression = null;
    {
      String negated = "";
      EObject _eContainer = attr.eContainer();
      RootClass rc = ((RootClass) _eContainer);
      boolean _isNegated = attr.isNegated();
      if (_isNegated) {
        negated = "neg ";
      }
      String _xifexpression = null;
      if ((attr instanceof EnumerationAttributeEClass)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("    ");
        _builder.append(negated, "    ");
        _builder.append("find ");
        String _get = Collections.attrLib.get(attr);
        _builder.append(_get, "    ");
        _builder.append("(");
        String _name = rc.getName();
        _builder.append(_name, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        if ((attr instanceof RegularAttributeEClassImpl)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("    ");
          _builder_1.append(negated, "    ");
          _builder_1.append("find ");
          String _get_1 = Collections.attrLib.get(attr);
          _builder_1.append(_get_1, "    ");
          _builder_1.append("(");
          String _name_1 = rc.getName();
          _builder_1.append(_name_1, "    ");
          _builder_1.append(",");
          String _name_2 = ((RegularAttributeEClassImpl)attr).getName();
          _builder_1.append(_name_2, "    ");
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _xifexpression_1 = _builder_1.toString();
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
