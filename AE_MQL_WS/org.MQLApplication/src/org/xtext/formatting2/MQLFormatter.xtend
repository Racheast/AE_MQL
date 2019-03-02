/*
 * generated by Xtext 2.14.0
 */
package org.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.services.MQLGrammarAccess
import qmm.FindQuery
import qmm.FindQueryCollection

class MQLFormatter extends AbstractFormatter2 {
	
	@Inject extension MQLGrammarAccess

	def dispatch void format(FindQueryCollection findQueryCollection, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (findQuery : findQueryCollection.findQueries) {
			findQuery.format
		}
	}

	def dispatch void format(FindQuery findQuery, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (rootClass : findQuery.rootClass) {
			rootClass.format
		}
		findQuery.select.format
	}
	
	// TODO: implement for AttributeFamily, AttributeNameMapping, Attribute, AttributeLib, AttributeValueRequirement, CAEXBasicObject, CAEXFile, CAEXObject, DocumentRoot, ExternalInterface, ExternalReferenceType, InstanceHierarchy, InterfaceClassLib, InterfaceClass, InterfaceFamily, InterfaceIDMapping, InternalElement, InternalLink, Mapping, NominalScaledType, OrdinalScaledType, RefSemantic, RoleClassLib, RoleClass, RoleFamily, RoleRequirements, SourceDocumentInformation, SupportedRoleClass, SystemUnitClassLib, SystemUnitClass, SystemUnitFamily, UnknownType, Copyright, Description, Revision, Version, AdditionalInformation, Element, GenericElement, GenericAttribute, NominalScaledType_requiredValue_AttrEClass, ExternalReferenceType_path_AttrEClass, OrdinalScaledType_requiredValue_AttrEClass, Revision_comment_AttrEClass, Copyright_value_AttrEClass, RoleClass_refBaseClassPath_AttrEClass, CAEXFile_superiorStandardVersion_AttrEClass, Version_changeMode_AttrEClass, InterfaceIDMapping_systemUnitInterfaceID_AttrEClass, SupportedRoleClass_refRoleClassPath_AttrEClass, SourceDocumentInformation_originVendorURL_AttrEClass, CAEXFile_fileName_AttrEClass, InterfaceIDMapping_roleInterfaceID_AttrEClass, Attribute_refAttributeType_AttrEClass, InternalLink_refPartnerSideB_AttrEClass, InternalElement_refBaseSystemUnitPath_AttrEClass, SourceDocumentInformation_originVersion_AttrEClass, SourceDocumentInformation_originName_AttrEClass, SystemUnitClass_refBaseClassPath_AttrEClass, SourceDocumentInformation_originVendor_AttrEClass, SourceDocumentInformation_originProjectTitle_AttrEClass, Element_name_AttrEClass, CAEXFile_schemaVersion_AttrEClass, SourceDocumentInformation_originProjectID_AttrEClass, CAEXBasicObject_changeMode_AttrEClass, Revision_oldVersion_AttrEClass, RefSemantic_correspondingAttributePath_AttrEClass, Description_changeMode_AttrEClass, Attribute_defaultValue_AttrEClass, OrdinalScaledType_requiredMaxValue_AttrEClass, CAEXObject_name_AttrEClass, AttributeNameMapping_systemUnitAttributeName_AttrEClass, Revision_newVersion_AttrEClass, Description_value_AttrEClass, InterfaceClass_refBaseClassPath_AttrEClass, AttributeValueRequirement_name_AttrEClass, Copyright_changeMode_AttrEClass, InternalLink_refPartnerSideA_AttrEClass, Element_value_AttrEClass, SourceDocumentInformation_originRelease_AttrEClass, Revision_authorName_AttrEClass, CAEXObject_iD_AttrEClass, SourceDocumentInformation_originID_AttrEClass, Attribute_value_AttrEClass, ExternalReferenceType_alias_AttrEClass, Attribute_unit_AttrEClass, OrdinalScaledType_requiredMinValue_AttrEClass, AttributeNameMapping_roleAttributeName_AttrEClass, Version_value_AttrEClass, UnknownType_requirements_AttrEClass, RefSemantic_Containment_OrGroup, Attribute_Containment_OrGroup, AttributeValueRequirement_Containment_OrGroup, UnknownType_Containment_OrGroup, NominalScaledType_Containment_OrGroup, OrdinalScaledType_Containment_OrGroup, RoleClassLib_Containment_OrGroup, SystemUnitClassLib_Containment_OrGroup, AttributeLib_Containment_OrGroup, ExternalReferenceType_Containment_OrGroup, InterfaceClassLib_Containment_OrGroup, SourceDocumentInformation_Containment_OrGroup, InstanceHierarchy_Containment_OrGroup, CAEXFile_Containment_OrGroup, InterfaceClass_Containment_OrGroup, InternalElement_Containment_OrGroup, InternalLink_Containment_OrGroup, RoleRequirements_Containment_OrGroup, SystemUnitClass_Containment_OrGroup, SupportedRoleClass_Containment_OrGroup, AttributeNameMapping_Containment_OrGroup, InterfaceIDMapping_Containment_OrGroup, RoleClass_Containment_OrGroup, ExternalInterface_Containment_OrGroup, Mapping_Containment_OrGroup, GenericElement_Containment_OrGroup, GenericAttribute_Containment_OrGroup, Integer_PrimitiveArgument, String_PrimitiveArgument, String_CalculateableElementReferenceArgument, Integer_FunctionalParameter, AttributeDataType_FunctionalParameter, EFeatureMapEntry_FunctionalParameter, Character_FunctionalParameter, Number_FunctionalParameter, CharSequence_FunctionalParameter, Object_FunctionalParameter, String_FunctionalParameter, Boolean_FunctionalParameter, Double_FunctionalParameter, DateTime_FunctionalParameter, CountableReferenceParameter, Integer_CalculateableParameter, AttributeDataType_CalculateableParameter, EFeatureMapEntry_CalculateableParameter, Character_CalculateableParameter, Number_CalculateableParameter, CharSequence_CalculateableParameter, Object_CalculateableParameter, String_CalculateableParameter, Boolean_CalculateableParameter, Double_CalculateableParameter, DateTime_CalculateableParameter, ChangeMode_EnumerationOperator, Integer_And_BitOperator, Integer_Or_BitOperator, Number_And_BitOperator, Number_Or_BitOperator, Character_And_BitOperator, Character_Or_BitOperator, CharSequence_And_BitOperator, CharSequence_Or_BitOperator, Object_And_BitOperator, Object_Or_BitOperator, String_And_BitOperator, String_Or_BitOperator, Boolean_And_BitOperator, Boolean_Or_BitOperator, Double_And_BitOperator, Double_Or_BitOperator, doubleValue_FunctionalOperator, Number_Integer_greaterThan_FunctionalOperator, Number_Integer_greaterEquals_FunctionalOperator, Number_Integer_smallerThan_FunctionalOperator, Number_Integer_smallerEquals_FunctionalOperator, Number_Integer_Object_Number_equals_FunctionalOperator, Number_Integer_Object_Number_toString_FunctionalOperator, Number_Integer_Object_Number_hashCode_FunctionalOperator, greaterThan_FunctionalOperator, greaterEquals_FunctionalOperator, smallerThan_FunctionalOperator, smallerEquals_FunctionalOperator, Object_Number_equals_FunctionalOperator, Object_Number_toString_FunctionalOperator, Object_Number_hashCode_FunctionalOperator, Object_Character_equals_FunctionalOperator, Object_Character_toString_FunctionalOperator, Object_Character_hashCode_FunctionalOperator, length_FunctionalOperator, Object_CharSequence_equals_FunctionalOperator, Object_CharSequence_toString_FunctionalOperator, Object_CharSequence_hashCode_FunctionalOperator, equals_FunctionalOperator, toString_FunctionalOperator, hashCode_FunctionalOperator, charAt_FunctionalOperator, codePointAt_FunctionalOperator, codePointBefore_FunctionalOperator, compareToString_FunctionalOperator, compareToStringIgnoreCase_FunctionalOperator, contains_FunctionalOperator, substring_FunctionalOperator, concat_FunctionalOperator, endsWith_FunctionalOperator, equalsIgnoreCase_FunctionalOperator, indexOfString_FunctionalOperator, indexOfChar_FunctionalOperator, indexOfCharFromIndex_FunctionalOperator, isEmpty_FunctionalOperator, offsetByCodePoints_FunctionalOperator, startsWith_FunctionalOperator, startsWithOffset_FunctionalOperator, toLowerCase_FunctionalOperator, toUpperCase_FunctionalOperator, trim_FunctionalOperator, CharSequence_String_length_FunctionalOperator, CharSequence_String_Object_CharSequence_equals_FunctionalOperator, CharSequence_String_Object_CharSequence_toString_FunctionalOperator, CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator, parseBoolean_FunctionalOperator, compareToBoolean_FunctionalOperator, Object_Boolean_equals_FunctionalOperator, Object_Boolean_toString_FunctionalOperator, Object_Boolean_hashCode_FunctionalOperator, Number_Double_greaterThan_FunctionalOperator, Number_Double_greaterEquals_FunctionalOperator, Number_Double_smallerThan_FunctionalOperator, Number_Double_smallerEquals_FunctionalOperator, Number_Double_Object_Number_equals_FunctionalOperator, Number_Double_Object_Number_toString_FunctionalOperator, Number_Double_Object_Number_hashCode_FunctionalOperator, And_EvaluationBitOperator, Or_EvaluationBitOperator, Count_AggregationOperator, Sum_AggregationOperator_Integer, Min_AggregationOperator_Integer, Max_AggregationOperator_Integer, IntegerParseInt_ClassOperator, Sum_AggregationOperator_Double, Min_AggregationOperator_Double, Max_AggregationOperator_Double
}
