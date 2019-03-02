package org.xtext.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.generator.Collections;
import org.xtext.generator.Utils;
import qmm.Containment_OrGroup;
import qmm.NamedElement;
import qmm.OrGroup;
import qmm.Reference_OrGroup;
import qmm.RootClass;

@SuppressWarnings("all")
public class OrGroupWriters {
  public static String writeOrGroupPatterns() {
    String code = "";
    Set<OrGroup> _keySet = Collections.orGroupLib.keySet();
    for (final OrGroup og : _keySet) {
      {
        String _code = code;
        String _get = Collections.orGroupLib.get(og);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "(");
        String _writeOrGroupParameters = Utils.writeOrGroupParameters(og);
        String _plus_2 = (_plus_1 + _writeOrGroupParameters);
        String _plus_3 = (_plus_2 + "){\n");
        code = (_code + _plus_3);
        if ((og instanceof Containment_OrGroup)) {
          ArrayList<RootClass> rootClasses = Utils.getRootClassesOfContainmentOrGroup(((Containment_OrGroup)og));
          int _size = rootClasses.size();
          boolean _lessEqualsThan = (_size <= 0);
          if (_lessEqualsThan) {
            String _code_1 = code;
            String _typeNameOfOrGroup = Utils.getTypeNameOfOrGroup(og);
            String _plus_4 = ("\t" + _typeNameOfOrGroup);
            String _plus_5 = (_plus_4 + "(");
            String _name = ((Containment_OrGroup)og).getName();
            String _plus_6 = (_plus_5 + _name);
            String _plus_7 = (_plus_6 + ");\n}\n");
            code = (_code_1 + _plus_7);
          } else {
            for (int i = 0; (i < rootClasses.size()); i++) {
              {
                boolean _isNegated = ((Containment_OrGroup)og).isNegated();
                boolean _not = (!_isNegated);
                if (_not) {
                  String _code_2 = code;
                  String _typeNameOfOrGroup_1 = Utils.getTypeNameOfOrGroup(og);
                  String _plus_8 = ("\t" + _typeNameOfOrGroup_1);
                  String _plus_9 = (_plus_8 + "(");
                  String _name_1 = ((Containment_OrGroup)og).getName();
                  String _plus_10 = (_plus_9 + _name_1);
                  String _plus_11 = (_plus_10 + ");\n");
                  code = (_code_2 + _plus_11);
                }
                final RootClass rc = rootClasses.get(i);
                HashSet<NamedElement> namedElements_of_rc = Utils.getAllContainedAndReferencedNamedElements_for_RootClass(rc);
                List<NamedElement> equalityCandidates = Utils.collectOrGroupHeaderCandidates(og);
                equalityCandidates.removeAll(namedElements_of_rc);
                equalityCandidates.remove(og);
                for (final NamedElement n : equalityCandidates) {
                  {
                    if (((n instanceof RootClass) && (!Utils.containedByNegatedOrGroup(n)))) {
                      EObject _eContainer = n.eContainer();
                      if ((_eContainer instanceof Containment_OrGroup)) {
                        String _code_3 = code;
                        EObject _eContainer_1 = n.eContainer();
                        String _typeNameOfOrGroup_2 = Utils.getTypeNameOfOrGroup(((OrGroup) _eContainer_1));
                        String _plus_12 = ("    " + _typeNameOfOrGroup_2);
                        String _plus_13 = (_plus_12 + "(");
                        String _name_2 = n.getName();
                        String _plus_14 = (_plus_13 + _name_2);
                        String _plus_15 = (_plus_14 + ");\n");
                        code = (_code_3 + _plus_15);
                      } else {
                        String _code_4 = code;
                        String _name_3 = n.eClass().getName();
                        String _plus_16 = ("    " + _name_3);
                        String _plus_17 = (_plus_16 + "(");
                        String _name_4 = n.getName();
                        String _plus_18 = (_plus_17 + _name_4);
                        String _plus_19 = (_plus_18 + ");\n");
                        code = (_code_4 + _plus_19);
                      }
                    } else {
                      if (((n instanceof OrGroup) && (!Utils.containedBy(rc, n)))) {
                        String _code_5 = code;
                        String _typeNameOfOrGroup_3 = Utils.getTypeNameOfOrGroup(((OrGroup) n));
                        String _plus_20 = ("    " + _typeNameOfOrGroup_3);
                        String _plus_21 = (_plus_20 + "(");
                        String _name_5 = n.getName();
                        String _plus_22 = (_plus_21 + _name_5);
                        String _plus_23 = (_plus_22 + ");\n");
                        code = (_code_5 + _plus_23);
                      }
                    }
                    if ((((n.eContainer() == og) || ((n.eContainer() instanceof OrGroup) && ((OrGroup) n.eContainer()).isNegated())) || (((n instanceof RootClass) && Utils.containedBy(og, n)) && (!Utils.containedBy(rc, n))))) {
                      String _code_6 = code;
                      String _name_6 = ((Containment_OrGroup)og).getName();
                      String _plus_24 = ("    " + _name_6);
                      String _plus_25 = (_plus_24 + " == ");
                      String _name_7 = n.getName();
                      String _plus_26 = (_plus_25 + _name_7);
                      String _plus_27 = (_plus_26 + ";\n");
                      code = (_code_6 + _plus_27);
                    }
                  }
                }
                String _code_3 = code;
                String _get_1 = Collections.rootClassLib.get(rc);
                String _plus_12 = ("    find " + _get_1);
                String _plus_13 = (_plus_12 + "(");
                String _writeRootClassParameters_for_patternReference_from_OrGroups = Utils.writeRootClassParameters_for_patternReference_from_OrGroups(rc);
                String _plus_14 = (_plus_13 + _writeRootClassParameters_for_patternReference_from_OrGroups);
                String _plus_15 = (_plus_14 + ");\n");
                code = (_code_3 + _plus_15);
                String _code_4 = code;
                code = (_code_4 + "}\n");
                int _size_1 = rootClasses.size();
                int _minus = (_size_1 - 1);
                boolean _lessThan = (i < _minus);
                if (_lessThan) {
                  String _code_5 = code;
                  code = (_code_5 + "or{\n");
                }
              }
            }
          }
        } else {
          if ((og instanceof Reference_OrGroup)) {
            Object _eGet = ((Reference_OrGroup)og).eGet(((Reference_OrGroup)og).eClass().getEStructuralFeature("reference"));
            EList<RootClass> references = ((EList<RootClass>) _eGet);
            int _size_1 = references.size();
            boolean _lessEqualsThan_1 = (_size_1 <= 0);
            if (_lessEqualsThan_1) {
              String _code_2 = code;
              String _typeNameOfOrGroup_1 = Utils.getTypeNameOfOrGroup(og);
              String _plus_8 = ("\t" + _typeNameOfOrGroup_1);
              String _plus_9 = (_plus_8 + "(");
              String _name_1 = ((Reference_OrGroup)og).getName();
              String _plus_10 = (_plus_9 + _name_1);
              String _plus_11 = (_plus_10 + ");\n}\n");
              code = (_code_2 + _plus_11);
            } else {
              for (int i = 0; (i < references.size()); i++) {
                {
                  boolean _isNegated = ((Reference_OrGroup)og).isNegated();
                  boolean _not = (!_isNegated);
                  if (_not) {
                    String _code_3 = code;
                    String _typeNameOfOrGroup_2 = Utils.getTypeNameOfOrGroup(og);
                    String _plus_12 = ("\t" + _typeNameOfOrGroup_2);
                    String _plus_13 = (_plus_12 + "(");
                    String _name_2 = ((Reference_OrGroup)og).getName();
                    String _plus_14 = (_plus_13 + _name_2);
                    String _plus_15 = (_plus_14 + ");\n");
                    code = (_code_3 + _plus_15);
                  }
                  final RootClass rc = references.get(i);
                  final HashSet<RootClass> referencesWithoutDuplicates = new HashSet<RootClass>(references);
                  for (final RootClass rcTemp : referencesWithoutDuplicates) {
                    String _code_4 = code;
                    String _name_3 = rcTemp.eClass().getName();
                    String _plus_16 = ("    " + _name_3);
                    String _plus_17 = (_plus_16 + "(");
                    String _name_4 = rcTemp.getName();
                    String _plus_18 = (_plus_17 + _name_4);
                    String _plus_19 = (_plus_18 + ");\n");
                    code = (_code_4 + _plus_19);
                  }
                  String _code_5 = code;
                  String _name_5 = ((Reference_OrGroup)og).getName();
                  String _plus_20 = ("    " + _name_5);
                  String _plus_21 = (_plus_20 + " == ");
                  String _name_6 = rc.getName();
                  String _plus_22 = (_plus_21 + _name_6);
                  String _plus_23 = (_plus_22 + ";\n");
                  code = (_code_5 + _plus_23);
                  String _code_6 = code;
                  code = (_code_6 + "}\n");
                  int _size_2 = references.size();
                  int _minus = (_size_2 - 1);
                  boolean _lessThan = (i < _minus);
                  if (_lessThan) {
                    String _code_7 = code;
                    code = (_code_7 + "or{\n");
                  }
                }
              }
            }
          }
        }
        String _code_3 = code;
        code = (_code_3 + "\n");
      }
    }
    return code;
  }
  
  public static String writeOrGroupReferencePatterns() {
    String code = "";
    Set<OrGroup> _keySet = Collections.orGroupLib.keySet();
    for (final OrGroup og : _keySet) {
      {
        String transitive = "";
        EObject _eContainer = og.eContainer();
        RootClass rc = ((RootClass) _eContainer);
        boolean _isTransitive = og.isTransitive();
        if (_isTransitive) {
          transitive = "+";
        }
        String _code = code;
        String _get = Collections.orGroupLib.get(og);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "_ref(");
        String _writeOrGroupReferenceParameters = Utils.writeOrGroupReferenceParameters(og);
        String _plus_2 = (_plus_1 + _writeOrGroupReferenceParameters);
        String _plus_3 = (_plus_2 + "){\n");
        code = (_code + _plus_3);
        String _code_1 = code;
        String _get_1 = Collections.orGroupLib.get(og);
        String _plus_4 = ("    find " + _get_1);
        String _plus_5 = (_plus_4 + "(");
        String _writeOrGroupParameters = Utils.writeOrGroupParameters(og);
        String _plus_6 = (_plus_5 + _writeOrGroupParameters);
        String _plus_7 = (_plus_6 + ");\n");
        code = (_code_1 + _plus_7);
        String _code_2 = code;
        String _get_2 = Collections.referenceFromToLib.get(og.eContainer().eClass()).get(og.eContainingFeature());
        String _plus_8 = ("    find " + _get_2);
        String _plus_9 = (_plus_8 + transitive);
        String _plus_10 = (_plus_9 + "(");
        String _name = rc.getName();
        String _plus_11 = (_plus_10 + _name);
        String _plus_12 = (_plus_11 + ",");
        String _name_1 = og.getName();
        String _plus_13 = (_plus_12 + _name_1);
        String _plus_14 = (_plus_13 + ");\n");
        code = (_code_2 + _plus_14);
        String _code_3 = code;
        code = (_code_3 + "}\n\n");
      }
    }
    return code;
  }
}
