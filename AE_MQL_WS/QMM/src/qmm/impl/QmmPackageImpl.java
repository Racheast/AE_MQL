/**
 */
package qmm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import qmm.QmmFactory;
import qmm.QmmPackage;

import qmm.util.QmmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmmPackageImpl extends EPackageImpl implements QmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "qmm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityManagementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toLowerCase_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codePointBefore_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_examID_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass min_AggregationOperator_DoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Boolean_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_Object_Number_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareToString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contains_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateable_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatingAggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_Object_Number_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Character_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass person_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CharSequence_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareToBoolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countableReferenceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass person_name_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass length_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concat_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseType_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_Object_CharSequence_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOfChar_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsIgnoreCase_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Number_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationFunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEmpty_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Number_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass student_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerParseInt_ClassOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseType_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countingAggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professor_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass or_EvaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codePointAt_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_AggregationOperator_DoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass and_EvaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Character_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetByCodePoints_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOfCharFromIndex_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableElement_ReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endsWith_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startsWithOffset_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findQueryCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professor_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass course_courseType_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularAttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass person_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseBoolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Double_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass person_email_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseType_EnumerationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_AggregationOperator_IntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass course_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sum_AggregationOperator_IntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Integer_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_length_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOfString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trim_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass student_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass course_courseNumber_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass count_AggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass min_AggregationOperator_IntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CharSequence_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseType_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Character_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startsWith_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass student_matriculationNumber_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sum_AggregationOperator_DoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Boolean_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseType_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countable_ReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Character_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityManagementSystem_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_Containment_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professor_employeeNumber_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleValue_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charAt_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareToStringIgnoreCase_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUpperCase_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Boolean_hashCode_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationAttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substring_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass course_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass course_name_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityManagementSystem_Reference_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CharSequence_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charSequenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qmm.QmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QmmPackageImpl() {
		super(eNS_URI, QmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static QmmPackage init() {
		if (isInited) return (QmmPackage)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI);

		// Obtain or create and register package
		QmmPackageImpl theQmmPackage = (QmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QmmPackageImpl());

		isInited = true;

		// Load packages
		theQmmPackage.loadPackage();

		// Fix loaded packages
		theQmmPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQmmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QmmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QmmPackage.eNS_URI, theQmmPackage);
		return theQmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		if (personEClass == null) {
			personEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name_AttrEClass() {
        return (EReference)getPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Email_AttrEClass() {
        return (EReference)getPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__Validate__DiagnosticChain_Map() {
        return getPerson().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		if (studentEClass == null) {
			studentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Attends() {
        return (EReference)getStudent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_MatriculationNumber_AttrEClass() {
        return (EReference)getStudent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStudent__Validate__DiagnosticChain_Map() {
        return getStudent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		if (professorEClass == null) {
			professorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Lectures() {
        return (EReference)getProfessor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_EmployeeNumber_AttrEClass() {
        return (EReference)getProfessor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__Validate__DiagnosticChain_Map() {
        return getProfessor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		if (courseEClass == null) {
			courseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_MandatoryFor() {
        return (EReference)getCourse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Exam() {
        return (EReference)getCourse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Name_AttrEClass() {
        return (EReference)getCourse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_CourseNumber_AttrEClass() {
        return (EReference)getCourse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_CourseType_AttrEClass() {
        return (EReference)getCourse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCourse__Validate__DiagnosticChain_Map() {
        return getCourse().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversityManagementSystem() {
		if (universityManagementSystemEClass == null) {
			universityManagementSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return universityManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Course() {
        return (EReference)getUniversityManagementSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Person() {
        return (EReference)getUniversityManagementSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversityManagementSystem__Validate__DiagnosticChain_Map() {
        return getUniversityManagementSystem().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		if (examEClass == null) {
			examEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_ExamID_AttrEClass() {
        return (EReference)getExam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam__Validate__DiagnosticChain_Map() {
        return getExam().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Operator() {
		if (number_OperatorEClass == null) {
			number_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return number_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_BitOperator() {
		if (boolean_BitOperatorEClass == null) {
			boolean_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return boolean_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolean_BitOperator_Connects() {
        return (EReference)getBoolean_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_EvaluationOperation_Argument() {
		if (number_EvaluationOperation_ArgumentEClass == null) {
			number_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return number_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_CalculateableParameter() {
		if (double_CalculateableParameterEClass == null) {
			double_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return double_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getDouble_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoLowerCase_FunctionalOperator() {
		if (toLowerCase_FunctionalOperatorEClass == null) {
			toLowerCase_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return toLowerCase_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoLowerCase_FunctionalOperator__GetLiteral() {
        return gettoLowerCase_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoLowerCase_FunctionalOperator__GetAllParameters() {
        return gettoLowerCase_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableParameter() {
		if (string_CalculateableParameterEClass == null) {
			string_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return string_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getString_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Original_FunctionalOperator() {
		if (double_Original_FunctionalOperatorEClass == null) {
			double_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return double_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_ExpressionOperator() {
		if (number_ExpressionOperatorEClass == null) {
			number_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return number_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Or_BitOperator() {
		if (integer_Or_BitOperatorEClass == null) {
			integer_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return integer_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_Or_BitOperator__GetLiteral() {
        return getInteger_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Operator() {
		if (boolean_OperatorEClass == null) {
			boolean_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return boolean_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalOperator() {
		if (integer_FunctionalOperatorEClass == null) {
			integer_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return integer_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Calculateable() {
		if (boolean_CalculateableEClass == null) {
			boolean_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return boolean_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcodePointBefore_FunctionalOperator() {
		if (codePointBefore_FunctionalOperatorEClass == null) {
			codePointBefore_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return codePointBefore_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcodePointBefore_FunctionalOperator_Index() {
        return (EReference)getcodePointBefore_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcodePointBefore_FunctionalOperator__GetLiteral() {
        return getcodePointBefore_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcodePointBefore_FunctionalOperator__GetAllParameters() {
        return getcodePointBefore_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_examID_AttrEClass() {
		if (exam_examID_AttrEClassEClass == null) {
			exam_examID_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return exam_examID_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin_AggregationOperator_Double() {
		if (min_AggregationOperator_DoubleEClass == null) {
			min_AggregationOperator_DoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return min_AggregationOperator_DoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMin_AggregationOperator_Double_Calculateable() {
        return (EReference)getMin_AggregationOperator_Double().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator_Double__GetLiteral() {
        return getMin_AggregationOperator_Double().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator_Double__GetAllParameters() {
        return getMin_AggregationOperator_Double().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Or_BitOperator() {
		if (boolean_Or_BitOperatorEClass == null) {
			boolean_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return boolean_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_Or_BitOperator__GetLiteral() {
        return getBoolean_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Type() {
		if (double_TypeEClass == null) {
			double_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return double_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Original_FunctionalOperator() {
		if (integer_Original_FunctionalOperatorEClass == null) {
			integer_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return integer_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Boolean_toString_FunctionalOperator() {
		if (object_Boolean_toString_FunctionalOperatorEClass == null) {
			object_Boolean_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return object_Boolean_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_toString_FunctionalOperator__GetLiteral() {
        return getObject_Boolean_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Boolean_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Original_FunctionalOperator() {
		if (string_Original_FunctionalOperatorEClass == null) {
			string_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return string_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		if (typedElementEClass == null) {
			typedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypedElement__GetType() {
        return getTypedElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_And_BitOperator() {
		if (charSequence_And_BitOperatorEClass == null) {
			charSequence_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return charSequence_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_And_BitOperator__GetLiteral() {
        return getCharSequence_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_Object_Number_hashCode_FunctionalOperator() {
		if (number_Integer_Object_Number_hashCode_FunctionalOperatorEClass == null) {
			number_Integer_Object_Number_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return number_Integer_Object_Number_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_hashCode_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_Object_Number_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_hashCode_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_Object_Number_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompareToString_FunctionalOperator() {
		if (compareToString_FunctionalOperatorEClass == null) {
			compareToString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return compareToString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompareToString_FunctionalOperator_AnotherString() {
        return (EReference)getcompareToString_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToString_FunctionalOperator__GetLiteral() {
        return getcompareToString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToString_FunctionalOperator__GetAllParameters() {
        return getcompareToString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcontains_FunctionalOperator() {
		if (contains_FunctionalOperatorEClass == null) {
			contains_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return contains_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcontains_FunctionalOperator_CharSequence() {
        return (EReference)getcontains_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcontains_FunctionalOperator__GetLiteral() {
        return getcontains_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcontains_FunctionalOperator__GetAllParameters() {
        return getcontains_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalParameter() {
		if (boolean_FunctionalParameterEClass == null) {
			boolean_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return boolean_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getBoolean_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateable_Argument() {
		if (calculateable_ArgumentEClass == null) {
			calculateable_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return calculateable_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateable() {
		if (calculateableEClass == null) {
			calculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return calculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatingAggregationOperator() {
		if (calculatingAggregationOperatorEClass == null) {
			calculatingAggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return calculatingAggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_EvaluationOperation_Argument() {
		if (integer_EvaluationOperation_ArgumentEClass == null) {
			integer_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return integer_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_And_BitOperator() {
		if (double_And_BitOperatorEClass == null) {
			double_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return double_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_And_BitOperator__GetLiteral() {
        return getDouble_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Original_FunctionalOperator() {
		if (number_Original_FunctionalOperatorEClass == null) {
			number_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return number_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		if (operatorEClass == null) {
			operatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Original_FunctionalOperator() {
		if (boolean_Original_FunctionalOperatorEClass == null) {
			boolean_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(41);
		}
		return boolean_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalOperator() {
		if (string_FunctionalOperatorEClass == null) {
			string_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(42);
		}
		return string_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Or_BitOperator() {
		if (character_Or_BitOperatorEClass == null) {
			character_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(44);
		}
		return character_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_Or_BitOperator__GetLiteral() {
        return getCharacter_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequals_FunctionalOperator() {
		if (equals_FunctionalOperatorEClass == null) {
			equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(45);
		}
		return equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequals_FunctionalOperator_Obj() {
        return (EReference)getequals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequals_FunctionalOperator__GetLiteral() {
        return getequals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequals_FunctionalOperator__GetAllParameters() {
        return getequals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Number_equals_FunctionalOperator() {
		if (object_Number_equals_FunctionalOperatorEClass == null) {
			object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(46);
		}
		return object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_equals_FunctionalOperator__GetLiteral() {
        return getObject_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_CalculateableElement() {
		if (double_CalculateableElementEClass == null) {
			double_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(47);
		}
		return double_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_Object_Number_hashCode_FunctionalOperator() {
		if (number_Double_Object_Number_hashCode_FunctionalOperatorEClass == null) {
			number_Double_Object_Number_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(48);
		}
		return number_Double_Object_Number_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_hashCode_FunctionalOperator__GetLiteral() {
        return getNumber_Double_Object_Number_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_hashCode_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_Object_Number_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Boolean_FunctionalOperator() {
		if (inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(49);
		}
		return inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_Object_CharSequence_toString_FunctionalOperator() {
		if (charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass == null) {
			charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(50);
		}
		return charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_Object_CharSequence_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_Object_CharSequence_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationOperator() {
		if (aggregationOperatorEClass == null) {
			aggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(51);
		}
		return aggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_PrimitiveArgument() {
		if (integer_PrimitiveArgumentEClass == null) {
			integer_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(52);
		}
		return integer_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_PrimitiveArgument_Value() {
        return (EAttribute)getInteger_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalParameter() {
		if (charSequence_FunctionalParameterEClass == null) {
			charSequence_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(53);
		}
		return charSequence_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getCharSequence_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_smallerThan_FunctionalOperator() {
		if (number_Integer_smallerThan_FunctionalOperatorEClass == null) {
			number_Integer_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(55);
		}
		return number_Integer_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Character_toString_FunctionalOperator() {
		if (object_Character_toString_FunctionalOperatorEClass == null) {
			object_Character_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(56);
		}
		return object_Character_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_toString_FunctionalOperator__GetLiteral() {
        return getObject_Character_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Character_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson_Containment_OrGroup() {
		if (person_Containment_OrGroupEClass == null) {
			person_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(57);
		}
		return person_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Containment_OrGroup_Containment() {
        return (EReference)getPerson_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsmallerEquals_FunctionalOperator() {
		if (smallerEquals_FunctionalOperatorEClass == null) {
			smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(58);
		}
		return smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsmallerEquals_FunctionalOperator_I() {
        return (EReference)getsmallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerEquals_FunctionalOperator__GetLiteral() {
        return getsmallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerEquals_FunctionalOperator__GetAllParameters() {
        return getsmallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveArgument() {
		if (primitiveArgumentEClass == null) {
			primitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(59);
		}
		return primitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalOperator() {
		if (boolean_FunctionalOperatorEClass == null) {
			boolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(60);
		}
		return boolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Or_BitOperator() {
		if (double_Or_BitOperatorEClass == null) {
			double_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(61);
		}
		return double_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_Or_BitOperator__GetLiteral() {
        return getDouble_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CharSequence_hashCode_FunctionalOperator() {
		if (object_CharSequence_hashCode_FunctionalOperatorEClass == null) {
			object_CharSequence_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(62);
		}
		return object_CharSequence_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_hashCode_FunctionalOperator__GetLiteral() {
        return getObject_CharSequence_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_hashCode_FunctionalOperator__GetAllParameters() {
        return getObject_CharSequence_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_PrimitiveArgument() {
		if (object_PrimitiveArgumentEClass == null) {
			object_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(63);
		}
		return object_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_PrimitiveArgument_Value() {
        return (EAttribute)getObject_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_ExpressionOperator() {
		if (boolean_ExpressionOperatorEClass == null) {
			boolean_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(64);
		}
		return boolean_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeEClass() {
		if (attributeEClassEClass == null) {
			attributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(65);
		}
		return attributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(66);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Validate__DiagnosticChain_Map() {
        return getNamedElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationBitOperator() {
		if (evaluationBitOperatorEClass == null) {
			evaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(67);
		}
		return evaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationBitOperator_Connects() {
        return (EReference)getEvaluationBitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalType() {
		if (string_FunctionalTypeEClass == null) {
			string_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(68);
		}
		return string_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_FunctionalType_Operator() {
        return (EReference)getString_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Calculateable() {
		if (object_CalculateableEClass == null) {
			object_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(69);
		}
		return object_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Operator() {
		if (string_OperatorEClass == null) {
			string_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(70);
		}
		return string_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Argument() {
		if (object_ArgumentEClass == null) {
			object_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(71);
		}
		return object_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Type() {
		if (string_TypeEClass == null) {
			string_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(72);
		}
		return string_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompareToBoolean_FunctionalOperator() {
		if (compareToBoolean_FunctionalOperatorEClass == null) {
			compareToBoolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(73);
		}
		return compareToBoolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompareToBoolean_FunctionalOperator_B() {
        return (EReference)getcompareToBoolean_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToBoolean_FunctionalOperator__GetLiteral() {
        return getcompareToBoolean_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToBoolean_FunctionalOperator__GetAllParameters() {
        return getcompareToBoolean_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountableReferenceParameter() {
		if (countableReferenceParameterEClass == null) {
			countableReferenceParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(74);
		}
		return countableReferenceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountableReferenceParameter_Argument() {
        return (EReference)getCountableReferenceParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalParameter() {
		if (integer_FunctionalParameterEClass == null) {
			integer_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(75);
		}
		return integer_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getInteger_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalParameter() {
		if (string_FunctionalParameterEClass == null) {
			string_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(76);
		}
		return string_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getString_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalParameter() {
		if (character_FunctionalParameterEClass == null) {
			character_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(77);
		}
		return character_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getCharacter_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_CalculateableParameter() {
		if (number_CalculateableParameterEClass == null) {
			number_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(78);
		}
		return number_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getNumber_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_Object_Number_equals_FunctionalOperator() {
		if (number_Double_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Double_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(79);
		}
		return number_Double_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Double_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson_name_AttrEClass() {
		if (person_name_AttrEClassEClass == null) {
			person_name_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(80);
		}
		return person_name_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlength_FunctionalOperator() {
		if (length_FunctionalOperatorEClass == null) {
			length_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(81);
		}
		return length_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getlength_FunctionalOperator__GetLiteral() {
        return getlength_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getlength_FunctionalOperator__GetAllParameters() {
        return getlength_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconcat_FunctionalOperator() {
		if (concat_FunctionalOperatorEClass == null) {
			concat_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(82);
		}
		return concat_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconcat_FunctionalOperator_Str() {
        return (EReference)getconcat_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getconcat_FunctionalOperator__GetLiteral() {
        return getconcat_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getconcat_FunctionalOperator__GetAllParameters() {
        return getconcat_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseType_AttributeEClass() {
		if (courseType_AttributeEClassEClass == null) {
			courseType_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(83);
		}
		return courseType_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseType_AttributeEClass_Operator() {
        return (EReference)getCourseType_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Argument() {
		if (double_ArgumentEClass == null) {
			double_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(84);
		}
		return double_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Argument() {
		if (boolean_ArgumentEClass == null) {
			boolean_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(85);
		}
		return boolean_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalParameter() {
		if (number_FunctionalParameterEClass == null) {
			number_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(86);
		}
		return number_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getNumber_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference_OrGroup() {
		if (reference_OrGroupEClass == null) {
			reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(87);
		}
		return reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Operator() {
		if (integer_OperatorEClass == null) {
			integer_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(88);
		}
		return integer_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator() {
		if (charSequence_String_Object_CharSequence_hashCode_FunctionalOperatorEClass == null) {
			charSequence_String_Object_CharSequence_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(90);
		}
		return charSequence_String_Object_CharSequence_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_BitOperator() {
		if (character_BitOperatorEClass == null) {
			character_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(91);
		}
		return character_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_BitOperator_Connects() {
        return (EReference)getCharacter_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getindexOfChar_FunctionalOperator() {
		if (indexOfChar_FunctionalOperatorEClass == null) {
			indexOfChar_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(92);
		}
		return indexOfChar_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getindexOfChar_FunctionalOperator_Ch() {
        return (EReference)getindexOfChar_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfChar_FunctionalOperator__GetLiteral() {
        return getindexOfChar_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfChar_FunctionalOperator__GetAllParameters() {
        return getindexOfChar_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequalsIgnoreCase_FunctionalOperator() {
		if (equalsIgnoreCase_FunctionalOperatorEClass == null) {
			equalsIgnoreCase_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(93);
		}
		return equalsIgnoreCase_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequalsIgnoreCase_FunctionalOperator_AnotherString() {
        return (EReference)getequalsIgnoreCase_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequalsIgnoreCase_FunctionalOperator__GetLiteral() {
        return getequalsIgnoreCase_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequalsIgnoreCase_FunctionalOperator__GetAllParameters() {
        return getequalsIgnoreCase_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionOperator() {
		if (expressionOperatorEClass == null) {
			expressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(94);
		}
		return expressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_And_BitOperator() {
		if (boolean_And_BitOperatorEClass == null) {
			boolean_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(95);
		}
		return boolean_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_And_BitOperator__GetLiteral() {
        return getBoolean_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Number_FunctionalOperator() {
		if (inheritedFrom_Object_to_Number_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Number_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(96);
		}
		return inheritedFrom_Object_to_Number_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_PrimitiveArgument() {
		if (charSequence_PrimitiveArgumentEClass == null) {
			charSequence_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(97);
		}
		return charSequence_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharSequence_PrimitiveArgument_Value() {
        return (EAttribute)getCharSequence_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationFunctionalOperator() {
		if (evaluationFunctionalOperatorEClass == null) {
			evaluationFunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(98);
		}
		return evaluationFunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_Object_Number_toString_FunctionalOperator() {
		if (number_Integer_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Integer_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(99);
		}
		return number_Integer_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisEmpty_FunctionalOperator() {
		if (isEmpty_FunctionalOperatorEClass == null) {
			isEmpty_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(100);
		}
		return isEmpty_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getisEmpty_FunctionalOperator__GetLiteral() {
        return getisEmpty_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getisEmpty_FunctionalOperator__GetAllParameters() {
        return getisEmpty_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Type() {
		if (integer_TypeEClass == null) {
			integer_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(101);
		}
		return integer_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoString_FunctionalOperator() {
		if (toString_FunctionalOperatorEClass == null) {
			toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(102);
		}
		return toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoString_FunctionalOperator__GetLiteral() {
        return gettoString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoString_FunctionalOperator__GetAllParameters() {
        return gettoString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Number_hashCode_FunctionalOperator() {
		if (object_Number_hashCode_FunctionalOperatorEClass == null) {
			object_Number_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(103);
		}
		return object_Number_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_hashCode_FunctionalOperator__GetLiteral() {
        return getObject_Number_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_hashCode_FunctionalOperator__GetAllParameters() {
        return getObject_Number_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Type() {
		if (object_TypeEClass == null) {
			object_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(104);
		}
		return object_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_EvaluationOperation_Argument() {
		if (charSequence_EvaluationOperation_ArgumentEClass == null) {
			charSequence_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(105);
		}
		return charSequence_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent_Containment_OrGroup() {
		if (student_Containment_OrGroupEClass == null) {
			student_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(106);
		}
		return student_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Containment_OrGroup_Containment() {
        return (EReference)getStudent_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_ExpressionOperator() {
		if (character_ExpressionOperatorEClass == null) {
			character_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(107);
		}
		return character_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethashCode_FunctionalOperator() {
		if (hashCode_FunctionalOperatorEClass == null) {
			hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(108);
		}
		return hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gethashCode_FunctionalOperator__GetLiteral() {
        return gethashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gethashCode_FunctionalOperator__GetAllParameters() {
        return gethashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerParseInt_ClassOperator() {
		if (integerParseInt_ClassOperatorEClass == null) {
			integerParseInt_ClassOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(109);
		}
		return integerParseInt_ClassOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerParseInt_ClassOperator_Calculateable() {
        return (EReference)getIntegerParseInt_ClassOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerParseInt_ClassOperator__GetLiteral() {
        return getIntegerParseInt_ClassOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerParseInt_ClassOperator__GetAllParameters() {
        return getIntegerParseInt_ClassOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseType_CalculateableElement() {
		if (courseType_CalculateableElementEClass == null) {
			courseType_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(110);
		}
		return courseType_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountingAggregationOperator() {
		if (countingAggregationOperatorEClass == null) {
			countingAggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(111);
		}
		return countingAggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountingAggregationOperator_Countable() {
        return (EReference)getCountingAggregationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountingAggregationOperator__GetAllParameters() {
        return getCountingAggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_Reference_OrGroup() {
		if (exam_Reference_OrGroupEClass == null) {
			exam_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(112);
		}
		return exam_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Reference_OrGroup_Reference() {
        return (EReference)getExam_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExam_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getExam_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrGroup() {
		if (orGroupEClass == null) {
			orGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(113);
		}
		return orGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrGroup_Transitive() {
        return (EAttribute)getOrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrGroup__Validate__DiagnosticChain_Map() {
        return getOrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor_Reference_OrGroup() {
		if (professor_Reference_OrGroupEClass == null) {
			professor_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(114);
		}
		return professor_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Reference_OrGroup_Reference() {
        return (EReference)getProfessor_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getProfessor_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsmallerThan_FunctionalOperator() {
		if (smallerThan_FunctionalOperatorEClass == null) {
			smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(115);
		}
		return smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsmallerThan_FunctionalOperator_I() {
        return (EReference)getsmallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerThan_FunctionalOperator__GetLiteral() {
        return getsmallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerThan_FunctionalOperator__GetAllParameters() {
        return getsmallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Type() {
		if (charSequence_TypeEClass == null) {
			charSequence_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(116);
		}
		return charSequence_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_ExpressionOperator() {
		if (string_ExpressionOperatorEClass == null) {
			string_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(117);
		}
		return string_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr_EvaluationBitOperator() {
		if (or_EvaluationBitOperatorEClass == null) {
			or_EvaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(118);
		}
		return or_EvaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOr_EvaluationBitOperator__GetLiteral() {
        return getOr_EvaluationBitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Type() {
		if (character_TypeEClass == null) {
			character_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(119);
		}
		return character_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_CalculateableParameter() {
		if (charSequence_CalculateableParameterEClass == null) {
			charSequence_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(120);
		}
		return charSequence_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getCharSequence_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_And_BitOperator() {
		if (character_And_BitOperatorEClass == null) {
			character_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(121);
		}
		return character_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_And_BitOperator__GetLiteral() {
        return getCharacter_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Calculateable() {
		if (string_CalculateableEClass == null) {
			string_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(122);
		}
		return string_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Operator() {
		if (character_OperatorEClass == null) {
			character_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(123);
		}
		return character_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Type() {
		if (number_TypeEClass == null) {
			number_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(124);
		}
		return number_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcodePointAt_FunctionalOperator() {
		if (codePointAt_FunctionalOperatorEClass == null) {
			codePointAt_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(125);
		}
		return codePointAt_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcodePointAt_FunctionalOperator_Index() {
        return (EReference)getcodePointAt_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcodePointAt_FunctionalOperator__GetLiteral() {
        return getcodePointAt_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcodePointAt_FunctionalOperator__GetAllParameters() {
        return getcodePointAt_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_BitOperator() {
		if (integer_BitOperatorEClass == null) {
			integer_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(126);
		}
		return integer_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_BitOperator_Connects() {
        return (EReference)getInteger_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Number_toString_FunctionalOperator() {
		if (object_Number_toString_FunctionalOperatorEClass == null) {
			object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(127);
		}
		return object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_toString_FunctionalOperator__GetLiteral() {
        return getObject_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Or_BitOperator() {
		if (string_Or_BitOperatorEClass == null) {
			string_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(128);
		}
		return string_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_Or_BitOperator__GetLiteral() {
        return getString_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_BitOperator() {
		if (number_BitOperatorEClass == null) {
			number_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(129);
		}
		return number_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_BitOperator_Connects() {
        return (EReference)getNumber_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectClause() {
		if (selectClauseEClass == null) {
			selectClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(130);
		}
		return selectClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectClause_NamedElements() {
        return (EReference)getSelectClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelectClause__Validate__DiagnosticChain_Map() {
        return getSelectClause().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_PrimitiveArgument() {
		if (number_PrimitiveArgumentEClass == null) {
			number_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(131);
		}
		return number_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_PrimitiveArgument_Value() {
        return (EAttribute)getNumber_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax_AggregationOperator_Double() {
		if (max_AggregationOperator_DoubleEClass == null) {
			max_AggregationOperator_DoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(132);
		}
		return max_AggregationOperator_DoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMax_AggregationOperator_Double_Calculateable() {
        return (EReference)getMax_AggregationOperator_Double().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator_Double__GetLiteral() {
        return getMax_AggregationOperator_Double().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator_Double__GetAllParameters() {
        return getMax_AggregationOperator_Double().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd_EvaluationBitOperator() {
		if (and_EvaluationBitOperatorEClass == null) {
			and_EvaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(133);
		}
		return and_EvaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnd_EvaluationBitOperator__GetLiteral() {
        return getAnd_EvaluationBitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Character_FunctionalOperator() {
		if (inheritedFrom_Object_to_Character_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Character_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(134);
		}
		return inheritedFrom_Object_to_Character_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Calculateable() {
		if (number_CalculateableEClass == null) {
			number_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(135);
		}
		return number_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableElementReferenceArgument() {
		if (string_CalculateableElementReferenceArgumentEClass == null) {
			string_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(136);
		}
		return string_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getString_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getString_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoffsetByCodePoints_FunctionalOperator() {
		if (offsetByCodePoints_FunctionalOperatorEClass == null) {
			offsetByCodePoints_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(137);
		}
		return offsetByCodePoints_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoffsetByCodePoints_FunctionalOperator_Index() {
        return (EReference)getoffsetByCodePoints_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoffsetByCodePoints_FunctionalOperator_CodePointOffset() {
        return (EReference)getoffsetByCodePoints_FunctionalOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getoffsetByCodePoints_FunctionalOperator__GetLiteral() {
        return getoffsetByCodePoints_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getoffsetByCodePoints_FunctionalOperator__GetAllParameters() {
        return getoffsetByCodePoints_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Argument() {
		if (number_ArgumentEClass == null) {
			number_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(138);
		}
		return number_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalOperator() {
		if (object_FunctionalOperatorEClass == null) {
			object_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(139);
		}
		return object_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Argument() {
		if (string_ArgumentEClass == null) {
			string_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(140);
		}
		return string_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getindexOfCharFromIndex_FunctionalOperator() {
		if (indexOfCharFromIndex_FunctionalOperatorEClass == null) {
			indexOfCharFromIndex_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(141);
		}
		return indexOfCharFromIndex_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getindexOfCharFromIndex_FunctionalOperator_Ch() {
        return (EReference)getindexOfCharFromIndex_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getindexOfCharFromIndex_FunctionalOperator_FromIndex() {
        return (EReference)getindexOfCharFromIndex_FunctionalOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfCharFromIndex_FunctionalOperator__GetLiteral() {
        return getindexOfCharFromIndex_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfCharFromIndex_FunctionalOperator__GetAllParameters() {
        return getindexOfCharFromIndex_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_EvaluationOperation_Argument() {
		if (double_EvaluationOperation_ArgumentEClass == null) {
			double_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(142);
		}
		return double_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_And_BitOperator() {
		if (number_And_BitOperatorEClass == null) {
			number_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(143);
		}
		return number_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_And_BitOperator__GetLiteral() {
        return getNumber_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountable() {
		if (countableEClass == null) {
			countableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(144);
		}
		return countableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalType() {
		if (boolean_FunctionalTypeEClass == null) {
			boolean_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(145);
		}
		return boolean_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolean_FunctionalType_Operator() {
        return (EReference)getBoolean_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableElement_ReferenceArgument() {
		if (calculateableElement_ReferenceArgumentEClass == null) {
			calculateableElement_ReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(146);
		}
		return calculateableElement_ReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getendsWith_FunctionalOperator() {
		if (endsWith_FunctionalOperatorEClass == null) {
			endsWith_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(147);
		}
		return endsWith_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getendsWith_FunctionalOperator_Suffix() {
        return (EReference)getendsWith_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getendsWith_FunctionalOperator__GetLiteral() {
        return getendsWith_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getendsWith_FunctionalOperator__GetAllParameters() {
        return getendsWith_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstartsWithOffset_FunctionalOperator() {
		if (startsWithOffset_FunctionalOperatorEClass == null) {
			startsWithOffset_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(148);
		}
		return startsWithOffset_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstartsWithOffset_FunctionalOperator_Prefix() {
        return (EReference)getstartsWithOffset_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstartsWithOffset_FunctionalOperator_Toffset() {
        return (EReference)getstartsWithOffset_FunctionalOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstartsWithOffset_FunctionalOperator__GetLiteral() {
        return getstartsWithOffset_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstartsWithOffset_FunctionalOperator__GetAllParameters() {
        return getstartsWithOffset_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalOperator() {
		if (number_FunctionalOperatorEClass == null) {
			number_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(149);
		}
		return number_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindQueryCollection() {
		if (findQueryCollectionEClass == null) {
			findQueryCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(150);
		}
		return findQueryCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindQueryCollection_FindQueries() {
        return (EReference)getFindQueryCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor_Containment_OrGroup() {
		if (professor_Containment_OrGroupEClass == null) {
			professor_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(151);
		}
		return professor_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Containment_OrGroup_Containment() {
        return (EReference)getProfessor_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_CalculateableElement() {
		if (number_CalculateableElementEClass == null) {
			number_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(152);
		}
		return number_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_BitOperator() {
		if (double_BitOperatorEClass == null) {
			double_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(153);
		}
		return double_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDouble_BitOperator_Connects() {
        return (EReference)getDouble_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse_courseType_AttrEClass() {
		if (course_courseType_AttrEClassEClass == null) {
			course_courseType_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(154);
		}
		return course_courseType_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_CalculateableElement() {
		if (character_CalculateableElementEClass == null) {
			character_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(155);
		}
		return character_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_CalculateableParameter() {
		if (boolean_CalculateableParameterEClass == null) {
			boolean_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(156);
		}
		return boolean_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getBoolean_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalOperator() {
		if (character_FunctionalOperatorEClass == null) {
			character_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(157);
		}
		return character_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_CalculateableParameter() {
		if (character_CalculateableParameterEClass == null) {
			character_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(158);
		}
		return character_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getCharacter_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularAttributeEClass() {
		if (regularAttributeEClassEClass == null) {
			regularAttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(159);
		}
		return regularAttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegularAttributeEClass__ValidateCheckExpression__Object() {
        return getRegularAttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_BitOperator() {
		if (string_BitOperatorEClass == null) {
			string_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(160);
		}
		return string_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_BitOperator_Connects() {
        return (EReference)getString_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Argument() {
		if (character_ArgumentEClass == null) {
			character_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(161);
		}
		return character_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson_Reference_OrGroup() {
		if (person_Reference_OrGroupEClass == null) {
			person_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(162);
		}
		return person_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Reference_OrGroup_Reference() {
        return (EReference)getPerson_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getPerson_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_CalculateableElement() {
		if (charSequence_CalculateableElementEClass == null) {
			charSequence_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(163);
		}
		return charSequence_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalOperator() {
		if (charSequence_FunctionalOperatorEClass == null) {
			charSequence_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(164);
		}
		return charSequence_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_PrimitiveArgument() {
		if (character_PrimitiveArgumentEClass == null) {
			character_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(165);
		}
		return character_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_PrimitiveArgument_Value() {
        return (EAttribute)getCharacter_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_ExpressionOperator() {
		if (integer_ExpressionOperatorEClass == null) {
			integer_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(166);
		}
		return integer_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Type() {
		if (boolean_TypeEClass == null) {
			boolean_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(167);
		}
		return boolean_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparseBoolean_FunctionalOperator() {
		if (parseBoolean_FunctionalOperatorEClass == null) {
			parseBoolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(168);
		}
		return parseBoolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparseBoolean_FunctionalOperator_S() {
        return (EReference)getparseBoolean_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getparseBoolean_FunctionalOperator__GetLiteral() {
        return getparseBoolean_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getparseBoolean_FunctionalOperator__GetAllParameters() {
        return getparseBoolean_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_greaterThan_FunctionalOperator() {
		if (number_Integer_greaterThan_FunctionalOperatorEClass == null) {
			number_Integer_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(169);
		}
		return number_Integer_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Double_FunctionalOperator() {
		if (inheritedFrom_Number_to_Double_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Double_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(170);
		}
		return inheritedFrom_Number_to_Double_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationOperator() {
		if (evaluationOperatorEClass == null) {
			evaluationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(171);
		}
		return evaluationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson_email_AttrEClass() {
		if (person_email_AttrEClassEClass == null) {
			person_email_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(172);
		}
		return person_email_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_AttributeEClass() {
		if (integer_AttributeEClassEClass == null) {
			integer_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(173);
		}
		return integer_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_AttributeEClass_Operator() {
        return (EReference)getInteger_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getInteger_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseType_EnumerationOperator() {
		if (courseType_EnumerationOperatorEClass == null) {
			courseType_EnumerationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(174);
		}
		return courseType_EnumerationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseType_EnumerationOperator_Argument() {
        return (EAttribute)getCourseType_EnumerationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseType_EnumerationOperator_Or() {
        return (EReference)getCourseType_EnumerationOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax_AggregationOperator_Integer() {
		if (max_AggregationOperator_IntegerEClass == null) {
			max_AggregationOperator_IntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(175);
		}
		return max_AggregationOperator_IntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMax_AggregationOperator_Integer_Calculateable() {
        return (EReference)getMax_AggregationOperator_Integer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator_Integer__GetLiteral() {
        return getMax_AggregationOperator_Integer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator_Integer__GetAllParameters() {
        return getMax_AggregationOperator_Integer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Original_FunctionalOperator() {
		if (charSequence_Original_FunctionalOperatorEClass == null) {
			charSequence_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(176);
		}
		return charSequence_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizableElement() {
		if (generalizableElementEClass == null) {
			generalizableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(177);
		}
		return generalizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizableElement_Generalized() {
        return (EAttribute)getGeneralizableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse_Containment_OrGroup() {
		if (course_Containment_OrGroupEClass == null) {
			course_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(178);
		}
		return course_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Containment_OrGroup_Containment() {
        return (EReference)getCourse_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalType() {
		if (double_FunctionalTypeEClass == null) {
			double_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(179);
		}
		return double_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDouble_FunctionalType_Operator() {
        return (EReference)getDouble_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalType() {
		if (object_FunctionalTypeEClass == null) {
			object_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(180);
		}
		return object_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_FunctionalType_Operator() {
        return (EReference)getObject_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperator() {
		if (classOperatorEClass == null) {
			classOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(181);
		}
		return classOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalType() {
		if (integer_FunctionalTypeEClass == null) {
			integer_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(182);
		}
		return integer_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_FunctionalType_Operator() {
        return (EReference)getInteger_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_AttributeEClass() {
		if (string_AttributeEClassEClass == null) {
			string_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(183);
		}
		return string_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_AttributeEClass_Operator() {
        return (EReference)getString_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getString_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_PrimitiveArgument() {
		if (boolean_PrimitiveArgumentEClass == null) {
			boolean_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(184);
		}
		return boolean_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_PrimitiveArgument_Value() {
        return (EAttribute)getBoolean_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_EvaluationOperation_Argument() {
		if (string_EvaluationOperation_ArgumentEClass == null) {
			string_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(185);
		}
		return string_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_CalculateableElement() {
		if (integer_CalculateableElementEClass == null) {
			integer_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(186);
		}
		return integer_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum_AggregationOperator_Integer() {
		if (sum_AggregationOperator_IntegerEClass == null) {
			sum_AggregationOperator_IntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(187);
		}
		return sum_AggregationOperator_IntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSum_AggregationOperator_Integer_Calculateable() {
        return (EReference)getSum_AggregationOperator_Integer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator_Integer__GetLiteral() {
        return getSum_AggregationOperator_Integer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator_Integer__GetAllParameters() {
        return getSum_AggregationOperator_Integer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(188);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalParameter() {
		if (functionalParameterEClass == null) {
			functionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(189);
		}
		return functionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalParameter_Argument() {
        return (EReference)getFunctionalParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationOperator() {
		if (enumerationOperatorEClass == null) {
			enumerationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(190);
		}
		return enumerationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_greaterEquals_FunctionalOperator() {
		if (number_Double_greaterEquals_FunctionalOperatorEClass == null) {
			number_Double_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(191);
		}
		return number_Double_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Double_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_CalculateableParameter() {
		if (integer_CalculateableParameterEClass == null) {
			integer_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(192);
		}
		return integer_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getInteger_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalType() {
		if (charSequence_FunctionalTypeEClass == null) {
			charSequence_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(193);
		}
		return charSequence_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_FunctionalType_Operator() {
        return (EReference)getCharSequence_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableElement() {
		if (string_CalculateableElementEClass == null) {
			string_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(194);
		}
		return string_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Integer_FunctionalOperator() {
		if (inheritedFrom_Number_to_Integer_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Integer_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(195);
		}
		return inheritedFrom_Number_to_Integer_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_length_FunctionalOperator() {
		if (charSequence_String_length_FunctionalOperatorEClass == null) {
			charSequence_String_length_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(196);
		}
		return charSequence_String_length_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_length_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_length_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_length_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_length_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Calculateable() {
		if (charSequence_CalculateableEClass == null) {
			charSequence_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(197);
		}
		return charSequence_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_ExpressionOperator() {
		if (charSequence_ExpressionOperatorEClass == null) {
			charSequence_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(198);
		}
		return charSequence_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getindexOfString_FunctionalOperator() {
		if (indexOfString_FunctionalOperatorEClass == null) {
			indexOfString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(199);
		}
		return indexOfString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getindexOfString_FunctionalOperator_Str() {
        return (EReference)getindexOfString_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfString_FunctionalOperator__GetLiteral() {
        return getindexOfString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfString_FunctionalOperator__GetAllParameters() {
        return getindexOfString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettrim_FunctionalOperator() {
		if (trim_FunctionalOperatorEClass == null) {
			trim_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(200);
		}
		return trim_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettrim_FunctionalOperator__GetLiteral() {
        return gettrim_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettrim_FunctionalOperator__GetAllParameters() {
        return gettrim_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgreaterEquals_FunctionalOperator() {
		if (greaterEquals_FunctionalOperatorEClass == null) {
			greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(201);
		}
		return greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgreaterEquals_FunctionalOperator_I() {
        return (EReference)getgreaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterEquals_FunctionalOperator__GetLiteral() {
        return getgreaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterEquals_FunctionalOperator__GetAllParameters() {
        return getgreaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent_Reference_OrGroup() {
		if (student_Reference_OrGroupEClass == null) {
			student_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(202);
		}
		return student_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Reference_OrGroup_Reference() {
        return (EReference)getStudent_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStudent_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getStudent_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_And_BitOperator() {
		if (string_And_BitOperatorEClass == null) {
			string_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(203);
		}
		return string_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_And_BitOperator__GetLiteral() {
        return getString_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableElement() {
		if (calculateableElementEClass == null) {
			calculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(204);
		}
		return calculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse_courseNumber_AttrEClass() {
		if (course_courseNumber_AttrEClassEClass == null) {
			course_courseNumber_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(205);
		}
		return course_courseNumber_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_EvaluationOperation_Argument() {
		if (boolean_EvaluationOperation_ArgumentEClass == null) {
			boolean_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(206);
		}
		return boolean_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgreaterThan_FunctionalOperator() {
		if (greaterThan_FunctionalOperatorEClass == null) {
			greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(207);
		}
		return greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgreaterThan_FunctionalOperator_I() {
        return (EReference)getgreaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterThan_FunctionalOperator__GetLiteral() {
        return getgreaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterThan_FunctionalOperator__GetAllParameters() {
        return getgreaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount_AggregationOperator() {
		if (count_AggregationOperatorEClass == null) {
			count_AggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(208);
		}
		return count_AggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCount_AggregationOperator__GetLiteral() {
        return getCount_AggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CalculateableElement() {
		if (object_CalculateableElementEClass == null) {
			object_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(209);
		}
		return object_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin_AggregationOperator_Integer() {
		if (min_AggregationOperator_IntegerEClass == null) {
			min_AggregationOperator_IntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(210);
		}
		return min_AggregationOperator_IntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMin_AggregationOperator_Integer_Calculateable() {
        return (EReference)getMin_AggregationOperator_Integer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator_Integer__GetLiteral() {
        return getMin_AggregationOperator_Integer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator_Integer__GetAllParameters() {
        return getMin_AggregationOperator_Integer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitOperator() {
		if (bitOperatorEClass == null) {
			bitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(211);
		}
		return bitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_greaterEquals_FunctionalOperator() {
		if (number_Integer_greaterEquals_FunctionalOperatorEClass == null) {
			number_Integer_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(212);
		}
		return number_Integer_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_And_BitOperator() {
		if (object_And_BitOperatorEClass == null) {
			object_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(213);
		}
		return object_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_And_BitOperator__GetLiteral() {
        return getObject_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootClass() {
		if (rootClassEClass == null) {
			rootClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(214);
		}
		return rootClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootClass_EvaluationOperator() {
        return (EReference)getRootClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootClass__ValidateCheckExpression__Object() {
        return getRootClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootClass__ValidateAllCheckExpressions__Object() {
        return getRootClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainment_OrGroup() {
		if (containment_OrGroupEClass == null) {
			containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(215);
		}
		return containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CharSequence_toString_FunctionalOperator() {
		if (object_CharSequence_toString_FunctionalOperatorEClass == null) {
			object_CharSequence_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(216);
		}
		return object_CharSequence_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_toString_FunctionalOperator__GetLiteral() {
        return getObject_CharSequence_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_toString_FunctionalOperator__GetAllParameters() {
        return getObject_CharSequence_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_Object_Number_equals_FunctionalOperator() {
		if (number_Integer_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Integer_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(217);
		}
		return number_Integer_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Integer_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatableElement() {
		if (negatableElementEClass == null) {
			negatableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(218);
		}
		return negatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegatableElement_Negated() {
        return (EAttribute)getNegatableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_EvaluationOperation_Argument() {
		if (character_EvaluationOperation_ArgumentEClass == null) {
			character_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(219);
		}
		return character_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalParameter() {
		if (object_FunctionalParameterEClass == null) {
			object_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(220);
		}
		return object_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getObject_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalType() {
		if (number_FunctionalTypeEClass == null) {
			number_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(221);
		}
		return number_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_FunctionalType_Operator() {
        return (EReference)getNumber_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseType_Calculateable() {
		if (courseType_CalculateableEClass == null) {
			courseType_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(222);
		}
		return courseType_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Or_BitOperator() {
		if (charSequence_Or_BitOperatorEClass == null) {
			charSequence_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(224);
		}
		return charSequence_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_Or_BitOperator__GetLiteral() {
        return getCharSequence_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Operator() {
		if (double_OperatorEClass == null) {
			double_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(225);
		}
		return double_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Character_equals_FunctionalOperator() {
		if (object_Character_equals_FunctionalOperatorEClass == null) {
			object_Character_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(226);
		}
		return object_Character_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Character_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Character_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_equals_FunctionalOperator__GetLiteral() {
        return getObject_Character_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Character_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		if (parameterEClass == null) {
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(227);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Or_BitOperator() {
		if (object_Or_BitOperatorEClass == null) {
			object_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(228);
		}
		return object_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Or_BitOperator__GetLiteral() {
        return getObject_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_BitOperator() {
		if (charSequence_BitOperatorEClass == null) {
			charSequence_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(229);
		}
		return charSequence_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_BitOperator_Connects() {
        return (EReference)getCharSequence_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstartsWith_FunctionalOperator() {
		if (startsWith_FunctionalOperatorEClass == null) {
			startsWith_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(230);
		}
		return startsWith_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstartsWith_FunctionalOperator_Prefix() {
        return (EReference)getstartsWith_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstartsWith_FunctionalOperator__GetLiteral() {
        return getstartsWith_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getstartsWith_FunctionalOperator__GetAllParameters() {
        return getstartsWith_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_CalculateableElementReferenceArgument() {
		if (integer_CalculateableElementReferenceArgumentEClass == null) {
			integer_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(231);
		}
		return integer_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getInteger_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getInteger_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalType() {
		if (character_FunctionalTypeEClass == null) {
			character_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(234);
		}
		return character_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_FunctionalType_Operator() {
        return (EReference)getCharacter_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent_matriculationNumber_AttrEClass() {
		if (student_matriculationNumber_AttrEClassEClass == null) {
			student_matriculationNumber_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(235);
		}
		return student_matriculationNumber_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		if (argumentEClass == null) {
			argumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(236);
		}
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_ExpressionOperator() {
		if (double_ExpressionOperatorEClass == null) {
			double_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(237);
		}
		return double_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalType() {
		if (functionalTypeEClass == null) {
			functionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(238);
		}
		return functionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalParameter() {
		if (double_FunctionalParameterEClass == null) {
			double_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(239);
		}
		return double_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getDouble_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Original_FunctionalOperator() {
		if (character_Original_FunctionalOperatorEClass == null) {
			character_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(240);
		}
		return character_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalOperator() {
		if (double_FunctionalOperatorEClass == null) {
			double_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(241);
		}
		return double_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum_AggregationOperator_Double() {
		if (sum_AggregationOperator_DoubleEClass == null) {
			sum_AggregationOperator_DoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(242);
		}
		return sum_AggregationOperator_DoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSum_AggregationOperator_Double_Calculateable() {
        return (EReference)getSum_AggregationOperator_Double().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator_Double__GetLiteral() {
        return getSum_AggregationOperator_Double().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator_Double__GetAllParameters() {
        return getSum_AggregationOperator_Double().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableParameter() {
		if (calculateableParameterEClass == null) {
			calculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(243);
		}
		return calculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculateableParameter_Argument() {
        return (EReference)getCalculateableParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_Object_Number_toString_FunctionalOperator() {
		if (number_Double_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Double_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(244);
		}
		return number_Double_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Double_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Boolean_equals_FunctionalOperator() {
		if (object_Boolean_equals_FunctionalOperatorEClass == null) {
			object_Boolean_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(245);
		}
		return object_Boolean_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Boolean_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Boolean_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_equals_FunctionalOperator__GetLiteral() {
        return getObject_Boolean_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Boolean_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseType_Operator() {
		if (courseType_OperatorEClass == null) {
			courseType_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(246);
		}
		return courseType_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_And_BitOperator() {
		if (integer_And_BitOperatorEClass == null) {
			integer_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(247);
		}
		return integer_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_And_BitOperator__GetLiteral() {
        return getInteger_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_CharSequence_FunctionalOperator() {
		if (inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(248);
		}
		return inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountable_ReferenceArgument() {
		if (countable_ReferenceArgumentEClass == null) {
			countable_ReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(249);
		}
		return countable_ReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountable_ReferenceArgument_Reference() {
        return (EReference)getCountable_ReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountable_ReferenceArgument__Validate__DiagnosticChain_Map() {
        return getCountable_ReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_CalculateableElement() {
		if (boolean_CalculateableElementEClass == null) {
			boolean_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(250);
		}
		return boolean_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_smallerEquals_FunctionalOperator() {
		if (number_Integer_smallerEquals_FunctionalOperatorEClass == null) {
			number_Integer_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(251);
		}
		return number_Integer_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Character_hashCode_FunctionalOperator() {
		if (object_Character_hashCode_FunctionalOperatorEClass == null) {
			object_Character_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(252);
		}
		return object_Character_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_hashCode_FunctionalOperator__GetLiteral() {
        return getObject_Character_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_hashCode_FunctionalOperator__GetAllParameters() {
        return getObject_Character_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversityManagementSystem_Containment_OrGroup() {
		if (universityManagementSystem_Containment_OrGroupEClass == null) {
			universityManagementSystem_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(253);
		}
		return universityManagementSystem_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Containment_OrGroup_Containment() {
        return (EReference)getUniversityManagementSystem_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_ExpressionOperator() {
		if (object_ExpressionOperatorEClass == null) {
			object_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(254);
		}
		return object_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_Containment_OrGroup() {
		if (exam_Containment_OrGroupEClass == null) {
			exam_Containment_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(255);
		}
		return exam_Containment_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Containment_OrGroup_Containment() {
        return (EReference)getExam_Containment_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Operator() {
		if (charSequence_OperatorEClass == null) {
			charSequence_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(256);
		}
		return charSequence_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_smallerThan_FunctionalOperator() {
		if (number_Double_smallerThan_FunctionalOperatorEClass == null) {
			number_Double_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(257);
		}
		return number_Double_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Double_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Double_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceArgument() {
		if (referenceArgumentEClass == null) {
			referenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(258);
		}
		return referenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor_employeeNumber_AttrEClass() {
		if (professor_employeeNumber_AttrEClassEClass == null) {
			professor_employeeNumber_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(259);
		}
		return professor_employeeNumber_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdoubleValue_FunctionalOperator() {
		if (doubleValue_FunctionalOperatorEClass == null) {
			doubleValue_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(260);
		}
		return doubleValue_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdoubleValue_FunctionalOperator__GetLiteral() {
        return getdoubleValue_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getdoubleValue_FunctionalOperator__GetAllParameters() {
        return getdoubleValue_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalArgument() {
		if (functionalArgumentEClass == null) {
			functionalArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(261);
		}
		return functionalArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Argument() {
		if (charSequence_ArgumentEClass == null) {
			charSequence_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(262);
		}
		return charSequence_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_PrimitiveArgument() {
		if (string_PrimitiveArgumentEClass == null) {
			string_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(263);
		}
		return string_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_PrimitiveArgument_Value() {
        return (EAttribute)getString_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CalculateableParameter() {
		if (object_CalculateableParameterEClass == null) {
			object_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(264);
		}
		return object_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getObject_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindQuery() {
		if (findQueryEClass == null) {
			findQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(265);
		}
		return findQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindQuery_Union() {
        return (EReference)getFindQuery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindQuery_RootClass() {
        return (EReference)getFindQuery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindQuery_Select() {
        return (EReference)getFindQuery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharAt_FunctionalOperator() {
		if (charAt_FunctionalOperatorEClass == null) {
			charAt_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(266);
		}
		return charAt_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcharAt_FunctionalOperator_I() {
        return (EReference)getcharAt_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcharAt_FunctionalOperator__GetLiteral() {
        return getcharAt_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcharAt_FunctionalOperator__GetAllParameters() {
        return getcharAt_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Calculateable() {
		if (integer_CalculateableEClass == null) {
			integer_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(267);
		}
		return integer_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompareToStringIgnoreCase_FunctionalOperator() {
		if (compareToStringIgnoreCase_FunctionalOperatorEClass == null) {
			compareToStringIgnoreCase_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(268);
		}
		return compareToStringIgnoreCase_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompareToStringIgnoreCase_FunctionalOperator_Str() {
        return (EReference)getcompareToStringIgnoreCase_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToStringIgnoreCase_FunctionalOperator__GetLiteral() {
        return getcompareToStringIgnoreCase_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareToStringIgnoreCase_FunctionalOperator__GetAllParameters() {
        return getcompareToStringIgnoreCase_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Or_BitOperator() {
		if (number_Or_BitOperatorEClass == null) {
			number_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(269);
		}
		return number_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Or_BitOperator__GetLiteral() {
        return getNumber_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Operator() {
		if (object_OperatorEClass == null) {
			object_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(270);
		}
		return object_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_Object_CharSequence_equals_FunctionalOperator() {
		if (charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass == null) {
			charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(271);
		}
		return charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_String_Object_CharSequence_equals_FunctionalOperator_Obj() {
        return (EReference)getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoUpperCase_FunctionalOperator() {
		if (toUpperCase_FunctionalOperatorEClass == null) {
			toUpperCase_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(273);
		}
		return toUpperCase_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoUpperCase_FunctionalOperator__GetLiteral() {
        return gettoUpperCase_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoUpperCase_FunctionalOperator__GetAllParameters() {
        return gettoUpperCase_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Boolean_hashCode_FunctionalOperator() {
		if (object_Boolean_hashCode_FunctionalOperatorEClass == null) {
			object_Boolean_hashCode_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(274);
		}
		return object_Boolean_hashCode_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_hashCode_FunctionalOperator__GetLiteral() {
        return getObject_Boolean_hashCode_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_hashCode_FunctionalOperator__GetAllParameters() {
        return getObject_Boolean_hashCode_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalOperator() {
		if (functionalOperatorEClass == null) {
			functionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(275);
		}
		return functionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionalOperator__GetLastOperator() {
        return getFunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_smallerEquals_FunctionalOperator() {
		if (number_Double_smallerEquals_FunctionalOperatorEClass == null) {
			number_Double_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(276);
		}
		return number_Double_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Double_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Calculateable() {
		if (double_CalculateableEClass == null) {
			double_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(277);
		}
		return double_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationAttributeEClass() {
		if (enumerationAttributeEClassEClass == null) {
			enumerationAttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(278);
		}
		return enumerationAttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_PrimitiveArgument() {
		if (double_PrimitiveArgumentEClass == null) {
			double_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(279);
		}
		return double_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_PrimitiveArgument_Value() {
        return (EAttribute)getDouble_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubstring_FunctionalOperator() {
		if (substring_FunctionalOperatorEClass == null) {
			substring_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(280);
		}
		return substring_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubstring_FunctionalOperator_StartIndex() {
        return (EReference)getsubstring_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubstring_FunctionalOperator_EndIndex() {
        return (EReference)getsubstring_FunctionalOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubstring_FunctionalOperator__GetLiteral() {
        return getsubstring_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubstring_FunctionalOperator__GetAllParameters() {
        return getsubstring_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationOperation_Argument() {
		if (evaluationOperation_ArgumentEClass == null) {
			evaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(281);
		}
		return evaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse_Reference_OrGroup() {
		if (course_Reference_OrGroupEClass == null) {
			course_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(282);
		}
		return course_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Reference_OrGroup_Reference() {
        return (EReference)getCourse_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCourse_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getCourse_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse_name_AttrEClass() {
		if (course_name_AttrEClassEClass == null) {
			course_name_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(283);
		}
		return course_name_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Argument() {
		if (integer_ArgumentEClass == null) {
			integer_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(284);
		}
		return integer_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Calculateable() {
		if (character_CalculateableEClass == null) {
			character_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(285);
		}
		return character_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_BitOperator() {
		if (object_BitOperatorEClass == null) {
			object_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(286);
		}
		return object_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_BitOperator_Connects() {
        return (EReference)getObject_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_CharSequence_to_String_FunctionalOperator() {
		if (inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass == null) {
			inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(287);
		}
		return inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversityManagementSystem_Reference_OrGroup() {
		if (universityManagementSystem_Reference_OrGroupEClass == null) {
			universityManagementSystem_Reference_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(288);
		}
		return universityManagementSystem_Reference_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityManagementSystem_Reference_OrGroup_Reference() {
        return (EReference)getUniversityManagementSystem_Reference_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversityManagementSystem_Reference_OrGroup__Validate__DiagnosticChain_Map() {
        return getUniversityManagementSystem_Reference_OrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_EvaluationOperation_Argument() {
		if (object_EvaluationOperation_ArgumentEClass == null) {
			object_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(289);
		}
		return object_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_greaterThan_FunctionalOperator() {
		if (number_Double_greaterThan_FunctionalOperatorEClass == null) {
			number_Double_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(290);
		}
		return number_Double_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Double_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Double_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CharSequence_equals_FunctionalOperator() {
		if (object_CharSequence_equals_FunctionalOperatorEClass == null) {
			object_CharSequence_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(291);
		}
		return object_CharSequence_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_CharSequence_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_CharSequence_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_equals_FunctionalOperator__GetLiteral() {
        return getObject_CharSequence_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_equals_FunctionalOperator__GetAllParameters() {
        return getObject_CharSequence_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseType() {
		if (courseTypeEEnum == null) {
			courseTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return courseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		if (stringEDataType == null) {
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharSequence() {
		if (charSequenceEDataType == null) {
			charSequenceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(43);
		}
		return charSequenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		if (integerEDataType == null) {
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(54);
		}
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		if (objectEDataType == null) {
			objectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(89);
		}
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		if (booleanEDataType == null) {
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(223);
		}
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		if (doubleEDataType == null) {
			doubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(232);
		}
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacter() {
		if (characterEDataType == null) {
			characterEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(233);
		}
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		if (numberEDataType == null) {
			numberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(272);
		}
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmFactory getQmmFactory() {
		return (QmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("qmm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //QmmPackageImpl
