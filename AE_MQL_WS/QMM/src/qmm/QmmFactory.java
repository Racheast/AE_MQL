/**
 */
package qmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public interface QmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QmmFactory eINSTANCE = qmm.impl.QmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>University Management System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University Management System</em>'.
	 * @generated
	 */
	UniversityManagementSystem createUniversityManagementSystem();

	/**
	 * Returns a new object of class '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam</em>'.
	 * @generated
	 */
	Exam createExam();

	/**
	 * Returns a new object of class '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Calculateable Parameter</em>'.
	 * @generated
	 */
	Double_CalculateableParameter createDouble_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>to Lower Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to Lower Case Functional Operator</em>'.
	 * @generated
	 */
	toLowerCase_FunctionalOperator createtoLowerCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Calculateable Parameter</em>'.
	 * @generated
	 */
	String_CalculateableParameter createString_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Integer Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Or Bit Operator</em>'.
	 * @generated
	 */
	Integer_Or_BitOperator createInteger_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>code Point Before Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>code Point Before Functional Operator</em>'.
	 * @generated
	 */
	codePointBefore_FunctionalOperator createcodePointBefore_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Exam exam ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam exam ID Attr EClass</em>'.
	 * @generated
	 */
	Exam_examID_AttrEClass createExam_examID_AttrEClass();

	/**
	 * Returns a new object of class '<em>Min Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Aggregation Operator Double</em>'.
	 * @generated
	 */
	Min_AggregationOperator_Double createMin_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>Boolean Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Or Bit Operator</em>'.
	 * @generated
	 */
	Boolean_Or_BitOperator createBoolean_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Boolean to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_toString_FunctionalOperator createObject_Boolean_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence And Bit Operator</em>'.
	 * @generated
	 */
	CharSequence_And_BitOperator createCharSequence_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_hashCode_FunctionalOperator createNumber_Integer_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>compare To String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To String Functional Operator</em>'.
	 * @generated
	 */
	compareToString_FunctionalOperator createcompareToString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>contains Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>contains Functional Operator</em>'.
	 * @generated
	 */
	contains_FunctionalOperator createcontains_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Functional Parameter</em>'.
	 * @generated
	 */
	Boolean_FunctionalParameter createBoolean_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Double And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double And Bit Operator</em>'.
	 * @generated
	 */
	Double_And_BitOperator createDouble_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Character Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Or Bit Operator</em>'.
	 * @generated
	 */
	Character_Or_BitOperator createCharacter_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equals Functional Operator</em>'.
	 * @generated
	 */
	equals_FunctionalOperator createequals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_equals_FunctionalOperator createObject_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_hashCode_FunctionalOperator createNumber_Double_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_toString_FunctionalOperator createCharSequence_String_Object_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Primitive Argument</em>'.
	 * @generated
	 */
	Integer_PrimitiveArgument createInteger_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Functional Parameter</em>'.
	 * @generated
	 */
	CharSequence_FunctionalParameter createCharSequence_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Number Integer smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer smaller Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_smallerThan_FunctionalOperator createNumber_Integer_smallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Character to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_toString_FunctionalOperator createObject_Character_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Person Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Containment Or Group</em>'.
	 * @generated
	 */
	Person_Containment_OrGroup createPerson_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	smallerEquals_FunctionalOperator createsmallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Double Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Or Bit Operator</em>'.
	 * @generated
	 */
	Double_Or_BitOperator createDouble_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_hashCode_FunctionalOperator createObject_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Primitive Argument</em>'.
	 * @generated
	 */
	Object_PrimitiveArgument createObject_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>compare To Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To Boolean Functional Operator</em>'.
	 * @generated
	 */
	compareToBoolean_FunctionalOperator createcompareToBoolean_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Countable Reference Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countable Reference Parameter</em>'.
	 * @generated
	 */
	CountableReferenceParameter createCountableReferenceParameter();

	/**
	 * Returns a new object of class '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Functional Parameter</em>'.
	 * @generated
	 */
	Integer_FunctionalParameter createInteger_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Functional Parameter</em>'.
	 * @generated
	 */
	String_FunctionalParameter createString_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Functional Parameter</em>'.
	 * @generated
	 */
	Character_FunctionalParameter createCharacter_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Calculateable Parameter</em>'.
	 * @generated
	 */
	Number_CalculateableParameter createNumber_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Number Double Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_equals_FunctionalOperator createNumber_Double_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Person name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person name Attr EClass</em>'.
	 * @generated
	 */
	Person_name_AttrEClass createPerson_name_AttrEClass();

	/**
	 * Returns a new object of class '<em>length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>length Functional Operator</em>'.
	 * @generated
	 */
	length_FunctionalOperator createlength_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>concat Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>concat Functional Operator</em>'.
	 * @generated
	 */
	concat_FunctionalOperator createconcat_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Functional Parameter</em>'.
	 * @generated
	 */
	Number_FunctionalParameter createNumber_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>index Of Char Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of Char Functional Operator</em>'.
	 * @generated
	 */
	indexOfChar_FunctionalOperator createindexOfChar_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>equals Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equals Ignore Case Functional Operator</em>'.
	 * @generated
	 */
	equalsIgnoreCase_FunctionalOperator createequalsIgnoreCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Boolean And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean And Bit Operator</em>'.
	 * @generated
	 */
	Boolean_And_BitOperator createBoolean_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Primitive Argument</em>'.
	 * @generated
	 */
	CharSequence_PrimitiveArgument createCharSequence_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_toString_FunctionalOperator createNumber_Integer_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>is Empty Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Empty Functional Operator</em>'.
	 * @generated
	 */
	isEmpty_FunctionalOperator createisEmpty_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to String Functional Operator</em>'.
	 * @generated
	 */
	toString_FunctionalOperator createtoString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_hashCode_FunctionalOperator createObject_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Student Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student Containment Or Group</em>'.
	 * @generated
	 */
	Student_Containment_OrGroup createStudent_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>hash Code Functional Operator</em>'.
	 * @generated
	 */
	hashCode_FunctionalOperator createhashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Parse Int Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Parse Int Class Operator</em>'.
	 * @generated
	 */
	IntegerParseInt_ClassOperator createIntegerParseInt_ClassOperator();

	/**
	 * Returns a new object of class '<em>Exam Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Reference Or Group</em>'.
	 * @generated
	 */
	Exam_Reference_OrGroup createExam_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Professor Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor Reference Or Group</em>'.
	 * @generated
	 */
	Professor_Reference_OrGroup createProfessor_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>smaller Than Functional Operator</em>'.
	 * @generated
	 */
	smallerThan_FunctionalOperator createsmallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Or Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Evaluation Bit Operator</em>'.
	 * @generated
	 */
	Or_EvaluationBitOperator createOr_EvaluationBitOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Calculateable Parameter</em>'.
	 * @generated
	 */
	CharSequence_CalculateableParameter createCharSequence_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Character And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character And Bit Operator</em>'.
	 * @generated
	 */
	Character_And_BitOperator createCharacter_And_BitOperator();

	/**
	 * Returns a new object of class '<em>code Point At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>code Point At Functional Operator</em>'.
	 * @generated
	 */
	codePointAt_FunctionalOperator createcodePointAt_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_toString_FunctionalOperator createObject_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Or Bit Operator</em>'.
	 * @generated
	 */
	String_Or_BitOperator createString_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Clause</em>'.
	 * @generated
	 */
	SelectClause createSelectClause();

	/**
	 * Returns a new object of class '<em>Number Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Primitive Argument</em>'.
	 * @generated
	 */
	Number_PrimitiveArgument createNumber_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Max Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Aggregation Operator Double</em>'.
	 * @generated
	 */
	Max_AggregationOperator_Double createMax_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>And Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Evaluation Bit Operator</em>'.
	 * @generated
	 */
	And_EvaluationBitOperator createAnd_EvaluationBitOperator();

	/**
	 * Returns a new object of class '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	String_CalculateableElementReferenceArgument createString_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>offset By Code Points Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>offset By Code Points Functional Operator</em>'.
	 * @generated
	 */
	offsetByCodePoints_FunctionalOperator createoffsetByCodePoints_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>index Of Char From Index Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of Char From Index Functional Operator</em>'.
	 * @generated
	 */
	indexOfCharFromIndex_FunctionalOperator createindexOfCharFromIndex_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number And Bit Operator</em>'.
	 * @generated
	 */
	Number_And_BitOperator createNumber_And_BitOperator();

	/**
	 * Returns a new object of class '<em>ends With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ends With Functional Operator</em>'.
	 * @generated
	 */
	endsWith_FunctionalOperator createendsWith_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>starts With Offset Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>starts With Offset Functional Operator</em>'.
	 * @generated
	 */
	startsWithOffset_FunctionalOperator createstartsWithOffset_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Find Query Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Query Collection</em>'.
	 * @generated
	 */
	FindQueryCollection createFindQueryCollection();

	/**
	 * Returns a new object of class '<em>Professor Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor Containment Or Group</em>'.
	 * @generated
	 */
	Professor_Containment_OrGroup createProfessor_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Course course Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course course Type Attr EClass</em>'.
	 * @generated
	 */
	Course_courseType_AttrEClass createCourse_courseType_AttrEClass();

	/**
	 * Returns a new object of class '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Calculateable Parameter</em>'.
	 * @generated
	 */
	Boolean_CalculateableParameter createBoolean_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Calculateable Parameter</em>'.
	 * @generated
	 */
	Character_CalculateableParameter createCharacter_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Person Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Reference Or Group</em>'.
	 * @generated
	 */
	Person_Reference_OrGroup createPerson_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Character Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Primitive Argument</em>'.
	 * @generated
	 */
	Character_PrimitiveArgument createCharacter_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>parse Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>parse Boolean Functional Operator</em>'.
	 * @generated
	 */
	parseBoolean_FunctionalOperator createparseBoolean_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer greater Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_greaterThan_FunctionalOperator createNumber_Integer_greaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Person email Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person email Attr EClass</em>'.
	 * @generated
	 */
	Person_email_AttrEClass createPerson_email_AttrEClass();

	/**
	 * Returns a new object of class '<em>Course Type Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Type Enumeration Operator</em>'.
	 * @generated
	 */
	CourseType_EnumerationOperator createCourseType_EnumerationOperator();

	/**
	 * Returns a new object of class '<em>Max Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Max_AggregationOperator_Integer createMax_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>Course Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Containment Or Group</em>'.
	 * @generated
	 */
	Course_Containment_OrGroup createCourse_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Boolean Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Primitive Argument</em>'.
	 * @generated
	 */
	Boolean_PrimitiveArgument createBoolean_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Sum Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Sum_AggregationOperator_Integer createSum_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>Number Double greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double greater Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_greaterEquals_FunctionalOperator createNumber_Double_greaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculateable Parameter</em>'.
	 * @generated
	 */
	Integer_CalculateableParameter createInteger_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Char Sequence String length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String length Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_length_FunctionalOperator createCharSequence_String_length_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>index Of String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of String Functional Operator</em>'.
	 * @generated
	 */
	indexOfString_FunctionalOperator createindexOfString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>trim Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>trim Functional Operator</em>'.
	 * @generated
	 */
	trim_FunctionalOperator createtrim_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>greater Equals Functional Operator</em>'.
	 * @generated
	 */
	greaterEquals_FunctionalOperator creategreaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Student Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student Reference Or Group</em>'.
	 * @generated
	 */
	Student_Reference_OrGroup createStudent_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>String And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String And Bit Operator</em>'.
	 * @generated
	 */
	String_And_BitOperator createString_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Course course Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course course Number Attr EClass</em>'.
	 * @generated
	 */
	Course_courseNumber_AttrEClass createCourse_courseNumber_AttrEClass();

	/**
	 * Returns a new object of class '<em>greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>greater Than Functional Operator</em>'.
	 * @generated
	 */
	greaterThan_FunctionalOperator creategreaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Count Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Aggregation Operator</em>'.
	 * @generated
	 */
	Count_AggregationOperator createCount_AggregationOperator();

	/**
	 * Returns a new object of class '<em>Min Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Min_AggregationOperator_Integer createMin_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>Number Integer greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer greater Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_greaterEquals_FunctionalOperator createNumber_Integer_greaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object And Bit Operator</em>'.
	 * @generated
	 */
	Object_And_BitOperator createObject_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence to String Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_toString_FunctionalOperator createObject_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_equals_FunctionalOperator createNumber_Integer_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Functional Parameter</em>'.
	 * @generated
	 */
	Object_FunctionalParameter createObject_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Char Sequence Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Or Bit Operator</em>'.
	 * @generated
	 */
	CharSequence_Or_BitOperator createCharSequence_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Character equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_equals_FunctionalOperator createObject_Character_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Or Bit Operator</em>'.
	 * @generated
	 */
	Object_Or_BitOperator createObject_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>starts With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>starts With Functional Operator</em>'.
	 * @generated
	 */
	startsWith_FunctionalOperator createstartsWith_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	Integer_CalculateableElementReferenceArgument createInteger_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>Student matriculation Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student matriculation Number Attr EClass</em>'.
	 * @generated
	 */
	Student_matriculationNumber_AttrEClass createStudent_matriculationNumber_AttrEClass();

	/**
	 * Returns a new object of class '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Functional Parameter</em>'.
	 * @generated
	 */
	Double_FunctionalParameter createDouble_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Sum Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Aggregation Operator Double</em>'.
	 * @generated
	 */
	Sum_AggregationOperator_Double createSum_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>Number Double Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_toString_FunctionalOperator createNumber_Double_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Boolean equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_equals_FunctionalOperator createObject_Boolean_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer And Bit Operator</em>'.
	 * @generated
	 */
	Integer_And_BitOperator createInteger_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countable Reference Argument</em>'.
	 * @generated
	 */
	Countable_ReferenceArgument createCountable_ReferenceArgument();

	/**
	 * Returns a new object of class '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_smallerEquals_FunctionalOperator createNumber_Integer_smallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Character hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_hashCode_FunctionalOperator createObject_Character_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>University Management System Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University Management System Containment Or Group</em>'.
	 * @generated
	 */
	UniversityManagementSystem_Containment_OrGroup createUniversityManagementSystem_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Exam Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Containment Or Group</em>'.
	 * @generated
	 */
	Exam_Containment_OrGroup createExam_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Double smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double smaller Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_smallerThan_FunctionalOperator createNumber_Double_smallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Professor employee Number Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor employee Number Attr EClass</em>'.
	 * @generated
	 */
	Professor_employeeNumber_AttrEClass createProfessor_employeeNumber_AttrEClass();

	/**
	 * Returns a new object of class '<em>double Value Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Value Functional Operator</em>'.
	 * @generated
	 */
	doubleValue_FunctionalOperator createdoubleValue_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Primitive Argument</em>'.
	 * @generated
	 */
	String_PrimitiveArgument createString_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Calculateable Parameter</em>'.
	 * @generated
	 */
	Object_CalculateableParameter createObject_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Find Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Query</em>'.
	 * @generated
	 */
	FindQuery createFindQuery();

	/**
	 * Returns a new object of class '<em>char At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char At Functional Operator</em>'.
	 * @generated
	 */
	charAt_FunctionalOperator createcharAt_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>compare To String Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To String Ignore Case Functional Operator</em>'.
	 * @generated
	 */
	compareToStringIgnoreCase_FunctionalOperator createcompareToStringIgnoreCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Or Bit Operator</em>'.
	 * @generated
	 */
	Number_Or_BitOperator createNumber_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_equals_FunctionalOperator createCharSequence_String_Object_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>to Upper Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to Upper Case Functional Operator</em>'.
	 * @generated
	 */
	toUpperCase_FunctionalOperator createtoUpperCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Boolean hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_hashCode_FunctionalOperator createObject_Boolean_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Double smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_smallerEquals_FunctionalOperator createNumber_Double_smallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Double Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Primitive Argument</em>'.
	 * @generated
	 */
	Double_PrimitiveArgument createDouble_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>substring Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>substring Functional Operator</em>'.
	 * @generated
	 */
	substring_FunctionalOperator createsubstring_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Course Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Reference Or Group</em>'.
	 * @generated
	 */
	Course_Reference_OrGroup createCourse_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Course name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course name Attr EClass</em>'.
	 * @generated
	 */
	Course_name_AttrEClass createCourse_name_AttrEClass();

	/**
	 * Returns a new object of class '<em>University Management System Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University Management System Reference Or Group</em>'.
	 * @generated
	 */
	UniversityManagementSystem_Reference_OrGroup createUniversityManagementSystem_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Double greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double greater Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_greaterThan_FunctionalOperator createNumber_Double_greaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence equals Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_equals_FunctionalOperator createObject_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QmmPackage getQmmPackage();

} //QmmFactory
