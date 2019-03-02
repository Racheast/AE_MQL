package org.xtext.generator;

import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.xtext.generator.Collections;

@SuppressWarnings("all")
public class ReferenceFromToWriters {
  public static String writeReferenceFromToPatterns() {
    String code = "";
    final Set<EClass> keys = Collections.referenceFromToLib.keySet();
    for (final EClass ec : keys) {
      {
        HashMap<EStructuralFeature, String> hashMap = Collections.referenceFromToLib.get(ec);
        final Set<EStructuralFeature> keys2 = hashMap.keySet();
        for (final EStructuralFeature ef : keys2) {
          {
            final String patternName = hashMap.get(ef);
            EClassifier _eType = ef.getEType();
            EClassifier _eType_1 = ((EClass) _eType).getEReferences().get(0).getEType();
            final EClassifier to_type = ((EClassifier) _eType_1);
            String to_type_name = "";
            boolean _endsWith = to_type.getName().endsWith("_Reference_OrGroup");
            if (_endsWith) {
              to_type_name = to_type.getName().substring(0, to_type.getName().indexOf("_Reference_OrGroup"));
            } else {
              boolean _endsWith_1 = to_type.getName().endsWith("_Containment_OrGroup");
              if (_endsWith_1) {
                to_type_name = to_type.getName().substring(0, to_type.getName().indexOf("_Containment_OrGroup"));
              } else {
                to_type_name = to_type.getName();
              }
            }
            String _code = code;
            String _name = ec.getName();
            String _plus = ((("pattern " + patternName) + "(from:") + _name);
            String _plus_1 = (_plus + ", to:");
            String _plus_2 = (_plus_1 + to_type_name);
            String _plus_3 = (_plus_2 + "){\n");
            code = (_code + _plus_3);
            String _code_1 = code;
            String _name_1 = ec.getName();
            String _plus_4 = ("    " + _name_1);
            String _plus_5 = (_plus_4 + ".");
            String _name_2 = ef.getName();
            String _plus_6 = (_plus_5 + _name_2);
            String _plus_7 = (_plus_6 + "(from, to);\n");
            code = (_code_1 + _plus_7);
            String _code_2 = code;
            code = (_code_2 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
}
