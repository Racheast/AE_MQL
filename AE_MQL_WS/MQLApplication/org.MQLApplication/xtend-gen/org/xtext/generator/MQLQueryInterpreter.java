package org.xtext.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.generator.AttributeWriters;
import org.xtext.generator.Collections;
import org.xtext.generator.OperatorWriters;
import org.xtext.generator.OrGroupWriters;
import org.xtext.generator.ReferenceFromToWriters;
import org.xtext.generator.RootClassWriters;
import org.xtext.generator.Utils;
import qmm.AttributeEClass;
import qmm.FindQuery;
import qmm.FindQueryCollection;
import qmm.NamedElement;
import qmm.RegularAttributeEClass;
import qmm.RootClass;
import qmm.SelectClause;

@SuppressWarnings("all")
public class MQLQueryInterpreter extends AbstractGenerator implements IGenerator {
  public static FindQueryCollection queryCollection = null;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    System.out.println("MQL Query Interpreter: Generating Query.vql ... ");
    String code = "package dmm\nimport \"/DMM/model/DMM.ecore\"\n\n";
    MQLQueryInterpreter.queryCollection = ((FindQueryCollection[])Conversions.unwrapArray(Iterables.<FindQueryCollection>filter(resource.getContents(), FindQueryCollection.class), FindQueryCollection.class))[0];
    Collections.initLibs(MQLQueryInterpreter.queryCollection);
    String _code = code;
    String _generateCode = this.generateCode();
    code = (_code + _generateCode);
    try {
      fsa.generateFile("Query.vql", code);
      System.out.println("MQL Query Interpreter: Generation of Query.vql completed.");
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println("MQL Query Interpreter: Exception caught. Stacktrace: ...");
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private String generateCode() {
    String code = "";
    String _code = code;
    String _writeStartingPatterns = this.writeStartingPatterns();
    code = (_code + _writeStartingPatterns);
    String _code_1 = code;
    String _writeOrGroupPatterns = OrGroupWriters.writeOrGroupPatterns();
    code = (_code_1 + _writeOrGroupPatterns);
    String _code_2 = code;
    String _writeRootClassPatterns = RootClassWriters.writeRootClassPatterns();
    code = (_code_2 + _writeRootClassPatterns);
    String _code_3 = code;
    String _writeAttributePatterns = AttributeWriters.writeAttributePatterns();
    code = (_code_3 + _writeAttributePatterns);
    String _code_4 = code;
    String _writeEvaluationOperatorPatterns = OperatorWriters.writeEvaluationOperatorPatterns();
    code = (_code_4 + _writeEvaluationOperatorPatterns);
    String _code_5 = code;
    String _writeArgumentPatterns = OperatorWriters.writeArgumentPatterns();
    code = (_code_5 + _writeArgumentPatterns);
    String _code_6 = code;
    String _writeReferenceFromToPatterns = ReferenceFromToWriters.writeReferenceFromToPatterns();
    code = (_code_6 + _writeReferenceFromToPatterns);
    String _code_7 = code;
    String _writeOrGroupReferencePatterns = OrGroupWriters.writeOrGroupReferencePatterns();
    code = (_code_7 + _writeOrGroupReferencePatterns);
    return code;
  }
  
  private String writeStartingPatterns() {
    String code = "";
    final EList<FindQuery> findQueries = MQLQueryInterpreter.queryCollection.getFindQueries();
    for (int i = 0; (i < findQueries.size()); i++) {
      String _code = code;
      String _writeStartingPattern = this.writeStartingPattern(findQueries.get(i), i);
      code = (_code + _writeStartingPattern);
    }
    return code;
  }
  
  private String writeStartingPattern(final FindQuery query, final int queryCounter) {
    String code = "";
    String parameters = "";
    EList<RootClass> rootClasses = query.getRootClass();
    SelectClause selectClause = query.getSelect();
    if ((selectClause != null)) {
      final EList<NamedElement> namedElements = selectClause.getNamedElements();
      final LinkedHashSet<NamedElement> noDuplicates = new LinkedHashSet<NamedElement>(namedElements);
      for (int i = 0; (i < noDuplicates.size()); i++) {
        {
          String _parameters = parameters;
          String _name = ((NamedElement[])Conversions.unwrapArray(noDuplicates, NamedElement.class))[i].getName();
          parameters = (_parameters + _name);
          int _size = noDuplicates.size();
          int _minus = (_size - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            String _parameters_1 = parameters;
            parameters = (_parameters_1 + ", ");
          }
        }
      }
    }
    for (int i = 0; (i < rootClasses.size()); i++) {
      {
        RootClass rc = rootClasses.get(i);
        if ((selectClause == null)) {
          String _parameters = parameters;
          String _name = rc.getName();
          parameters = (_parameters + _name);
          int _size = rootClasses.size();
          int _minus = (_size - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            String _parameters_1 = parameters;
            parameters = (_parameters_1 + ", ");
          }
        }
        String _name_1 = rc.getName();
        String _containedAndReferencedOrGroupsHeader_excluding_negated_elements = Utils.getContainedAndReferencedOrGroupsHeader_excluding_negated_elements(rc);
        String parametersString = (_name_1 + _containedAndReferencedOrGroupsHeader_excluding_negated_elements);
        ArrayList<RegularAttributeEClass> _collect_All_Referencable_RegularAttributeEClasses = Utils.collect_All_Referencable_RegularAttributeEClasses(rc);
        for (final AttributeEClass a : _collect_All_Referencable_RegularAttributeEClasses) {
          String _parametersString = parametersString;
          String _name_2 = a.getName();
          String _plus = ("," + _name_2);
          parametersString = (_parametersString + _plus);
        }
        String _code = code;
        String _get = Collections.rootClassLib.get(rc);
        String _plus_1 = ("\tfind " + _get);
        String _plus_2 = (_plus_1 + "(");
        String _plus_3 = (_plus_2 + parametersString);
        String _plus_4 = (_plus_3 + ");\n");
        code = (_code + _plus_4);
      }
    }
    String _code = code;
    code = (_code + "}\n");
    String _code_1 = code;
    code = (_code_1 + "\n");
    return ((((("pattern query_" + Integer.valueOf(queryCounter)) + "(") + parameters) + "){\n") + code);
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
