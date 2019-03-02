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
	 * Returns a new object of class '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Family</em>'.
	 * @generated
	 */
	AttributeFamily createAttributeFamily();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping</em>'.
	 * @generated
	 */
	AttributeNameMapping createAttributeNameMapping();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lib</em>'.
	 * @generated
	 */
	AttributeLib createAttributeLib();

	/**
	 * Returns a new object of class '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Requirement</em>'.
	 * @generated
	 */
	AttributeValueRequirement createAttributeValueRequirement();

	/**
	 * Returns a new object of class '<em>CAEX Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Basic Object</em>'.
	 * @generated
	 */
	CAEXBasicObject createCAEXBasicObject();

	/**
	 * Returns a new object of class '<em>CAEX File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File</em>'.
	 * @generated
	 */
	CAEXFile createCAEXFile();

	/**
	 * Returns a new object of class '<em>CAEX Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Object</em>'.
	 * @generated
	 */
	CAEXObject createCAEXObject();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Interface</em>'.
	 * @generated
	 */
	ExternalInterface createExternalInterface();

	/**
	 * Returns a new object of class '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type</em>'.
	 * @generated
	 */
	ExternalReferenceType createExternalReferenceType();

	/**
	 * Returns a new object of class '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Hierarchy</em>'.
	 * @generated
	 */
	InstanceHierarchy createInstanceHierarchy();

	/**
	 * Returns a new object of class '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Lib</em>'.
	 * @generated
	 */
	InterfaceClassLib createInterfaceClassLib();

	/**
	 * Returns a new object of class '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class</em>'.
	 * @generated
	 */
	InterfaceClass createInterfaceClass();

	/**
	 * Returns a new object of class '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Family</em>'.
	 * @generated
	 */
	InterfaceFamily createInterfaceFamily();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping</em>'.
	 * @generated
	 */
	InterfaceIDMapping createInterfaceIDMapping();

	/**
	 * Returns a new object of class '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Element</em>'.
	 * @generated
	 */
	InternalElement createInternalElement();

	/**
	 * Returns a new object of class '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link</em>'.
	 * @generated
	 */
	InternalLink createInternalLink();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Nominal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nominal Scaled Type</em>'.
	 * @generated
	 */
	NominalScaledType createNominalScaledType();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type</em>'.
	 * @generated
	 */
	OrdinalScaledType createOrdinalScaledType();

	/**
	 * Returns a new object of class '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Semantic</em>'.
	 * @generated
	 */
	RefSemantic createRefSemantic();

	/**
	 * Returns a new object of class '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Lib</em>'.
	 * @generated
	 */
	RoleClassLib createRoleClassLib();

	/**
	 * Returns a new object of class '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class</em>'.
	 * @generated
	 */
	RoleClass createRoleClass();

	/**
	 * Returns a new object of class '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Family</em>'.
	 * @generated
	 */
	RoleFamily createRoleFamily();

	/**
	 * Returns a new object of class '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requirements</em>'.
	 * @generated
	 */
	RoleRequirements createRoleRequirements();

	/**
	 * Returns a new object of class '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information</em>'.
	 * @generated
	 */
	SourceDocumentInformation createSourceDocumentInformation();

	/**
	 * Returns a new object of class '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Role Class</em>'.
	 * @generated
	 */
	SupportedRoleClass createSupportedRoleClass();

	/**
	 * Returns a new object of class '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Lib</em>'.
	 * @generated
	 */
	SystemUnitClassLib createSystemUnitClassLib();

	/**
	 * Returns a new object of class '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class</em>'.
	 * @generated
	 */
	SystemUnitClass createSystemUnitClass();

	/**
	 * Returns a new object of class '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Family</em>'.
	 * @generated
	 */
	SystemUnitFamily createSystemUnitFamily();

	/**
	 * Returns a new object of class '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type</em>'.
	 * @generated
	 */
	UnknownType createUnknownType();

	/**
	 * Returns a new object of class '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright</em>'.
	 * @generated
	 */
	Copyright createCopyright();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Information</em>'.
	 * @generated
	 */
	AdditionalInformation createAdditionalInformation();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element</em>'.
	 * @generated
	 */
	GenericElement createGenericElement();

	/**
	 * Returns a new object of class '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Attribute</em>'.
	 * @generated
	 */
	GenericAttribute createGenericAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Data Type And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type And Bit Operator</em>'.
	 * @generated
	 */
	AttributeDataType_And_BitOperator createAttributeDataType_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Character to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_toString_FunctionalOperator createObject_Character_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type required Max Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type required Max Value Attr EClass</em>'.
	 * @generated
	 */
	OrdinalScaledType_requiredMaxValue_AttrEClass createOrdinalScaledType_requiredMaxValue_AttrEClass();

	/**
	 * Returns a new object of class '<em>Instance Hierarchy Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Hierarchy Reference Or Group</em>'.
	 * @generated
	 */
	InstanceHierarchy_Reference_OrGroup createInstanceHierarchy_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>CAEX Object name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Object name Attr EClass</em>'.
	 * @generated
	 */
	CAEXObject_name_AttrEClass createCAEXObject_name_AttrEClass();

	/**
	 * Returns a new object of class '<em>Generic Element element Feature Map Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element element Feature Map Attr EClass</em>'.
	 * @generated
	 */
	GenericElement_elementFeatureMap_AttrEClass createGenericElement_elementFeatureMap_AttrEClass();

	/**
	 * Returns a new object of class '<em>External Interface Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Interface Containment Or Group</em>'.
	 * @generated
	 */
	ExternalInterface_Containment_OrGroup createExternalInterface_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Element value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element value Attr EClass</em>'.
	 * @generated
	 */
	Element_value_AttrEClass createElement_value_AttrEClass();

	/**
	 * Returns a new object of class '<em>CAEX Object iD Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Object iD Attr EClass</em>'.
	 * @generated
	 */
	CAEXObject_iD_AttrEClass createCAEXObject_iD_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Calculateable Parameter</em>'.
	 * @generated
	 */
	Object_CalculateableParameter createObject_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Attribute Value Requirement Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Requirement Reference Or Group</em>'.
	 * @generated
	 */
	AttributeValueRequirement_Reference_OrGroup createAttributeValueRequirement_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Instance Hierarchy Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Hierarchy Containment Or Group</em>'.
	 * @generated
	 */
	InstanceHierarchy_Containment_OrGroup createInstanceHierarchy_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Ref Semantic corresponding Attribute Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Semantic corresponding Attribute Path Attr EClass</em>'.
	 * @generated
	 */
	RefSemantic_correspondingAttributePath_AttrEClass createRefSemantic_correspondingAttributePath_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object Character hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_hashCode_FunctionalOperator createObject_Character_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_equals_FunctionalOperator createNumber_Integer_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Parse Int Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Parse Int Class Operator</em>'.
	 * @generated
	 */
	IntegerParseInt_ClassOperator createIntegerParseInt_ClassOperator();

	/**
	 * Returns a new object of class '<em>Element Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Containment Or Group</em>'.
	 * @generated
	 */
	Element_Containment_OrGroup createElement_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Generic Attribute Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Attribute Containment Or Group</em>'.
	 * @generated
	 */
	GenericAttribute_Containment_OrGroup createGenericAttribute_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Date Time Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Primitive Argument</em>'.
	 * @generated
	 */
	DateTime_PrimitiveArgument createDateTime_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>trim Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>trim Functional Operator</em>'.
	 * @generated
	 */
	trim_FunctionalOperator createtrim_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Functional Parameter</em>'.
	 * @generated
	 */
	Double_FunctionalParameter createDouble_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to String Functional Operator</em>'.
	 * @generated
	 */
	toString_FunctionalOperator createtoString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Family Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Family Containment Or Group</em>'.
	 * @generated
	 */
	AttributeFamily_Containment_OrGroup createAttributeFamily_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>System Unit Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class ref Base Class Path Attr EClass</em>'.
	 * @generated
	 */
	SystemUnitClass_refBaseClassPath_AttrEClass createSystemUnitClass_refBaseClassPath_AttrEClass();

	/**
	 * Returns a new object of class '<em>Countable Reference Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countable Reference Parameter</em>'.
	 * @generated
	 */
	CountableReferenceParameter createCountableReferenceParameter();

	/**
	 * Returns a new object of class '<em>Generic Element attribute Feature Map Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element attribute Feature Map Attr EClass</em>'.
	 * @generated
	 */
	GenericElement_attributeFeatureMap_AttrEClass createGenericElement_attributeFeatureMap_AttrEClass();

	/**
	 * Returns a new object of class '<em>index Of Char From Index Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of Char From Index Functional Operator</em>'.
	 * @generated
	 */
	indexOfCharFromIndex_FunctionalOperator createindexOfCharFromIndex_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Double smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_smallerEquals_FunctionalOperator createNumber_Double_smallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Character And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character And Bit Operator</em>'.
	 * @generated
	 */
	Character_And_BitOperator createCharacter_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping role Interface ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping role Interface ID Attr EClass</em>'.
	 * @generated
	 */
	InterfaceIDMapping_roleInterfaceID_AttrEClass createInterfaceIDMapping_roleInterfaceID_AttrEClass();

	/**
	 * Returns a new object of class '<em>CAEX Object Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Object Containment Or Group</em>'.
	 * @generated
	 */
	CAEXObject_Containment_OrGroup createCAEXObject_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Vendor Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Vendor Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originVendor_AttrEClass createSourceDocumentInformation_originVendor_AttrEClass();

	/**
	 * Returns a new object of class '<em>Mapping Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Containment Or Group</em>'.
	 * @generated
	 */
	Mapping_Containment_OrGroup createMapping_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Unknown Type Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type Containment Or Group</em>'.
	 * @generated
	 */
	UnknownType_Containment_OrGroup createUnknownType_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>External Reference Type alias Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type alias Attr EClass</em>'.
	 * @generated
	 */
	ExternalReferenceType_alias_AttrEClass createExternalReferenceType_alias_AttrEClass();

	/**
	 * Returns a new object of class '<em>String Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Primitive Argument</em>'.
	 * @generated
	 */
	String_PrimitiveArgument createString_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Version Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Reference Or Group</em>'.
	 * @generated
	 */
	Version_Reference_OrGroup createVersion_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Char Sequence And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence And Bit Operator</em>'.
	 * @generated
	 */
	CharSequence_And_BitOperator createCharSequence_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Version Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Containment Or Group</em>'.
	 * @generated
	 */
	Version_Containment_OrGroup createVersion_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>to Lower Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to Lower Case Functional Operator</em>'.
	 * @generated
	 */
	toLowerCase_FunctionalOperator createtoLowerCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	smallerEquals_FunctionalOperator createsmallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type required Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type required Value Attr EClass</em>'.
	 * @generated
	 */
	OrdinalScaledType_requiredValue_AttrEClass createOrdinalScaledType_requiredValue_AttrEClass();

	/**
	 * Returns a new object of class '<em>Char Sequence Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Or Bit Operator</em>'.
	 * @generated
	 */
	CharSequence_Or_BitOperator createCharSequence_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Boolean Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Primitive Argument</em>'.
	 * @generated
	 */
	Boolean_PrimitiveArgument createBoolean_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Source Document Information Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information Reference Or Group</em>'.
	 * @generated
	 */
	SourceDocumentInformation_Reference_OrGroup createSourceDocumentInformation_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Role Requirements Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requirements Reference Or Group</em>'.
	 * @generated
	 */
	RoleRequirements_Reference_OrGroup createRoleRequirements_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Additional Information Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Information Containment Or Group</em>'.
	 * @generated
	 */
	AdditionalInformation_Containment_OrGroup createAdditionalInformation_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping role Attribute Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping role Attribute Name Attr EClass</em>'.
	 * @generated
	 */
	AttributeNameMapping_roleAttributeName_AttrEClass createAttributeNameMapping_roleAttributeName_AttrEClass();

	/**
	 * Returns a new object of class '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Functional Parameter</em>'.
	 * @generated
	 */
	Number_FunctionalParameter createNumber_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Attribute Data Type Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type Functional Parameter</em>'.
	 * @generated
	 */
	AttributeDataType_FunctionalParameter createAttributeDataType_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>ends With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ends With Functional Operator</em>'.
	 * @generated
	 */
	endsWith_FunctionalOperator createendsWith_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Or Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Evaluation Bit Operator</em>'.
	 * @generated
	 */
	Or_EvaluationBitOperator createOr_EvaluationBitOperator();

	/**
	 * Returns a new object of class '<em>Find Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Query</em>'.
	 * @generated
	 */
	FindQuery createFindQuery();

	/**
	 * Returns a new object of class '<em>hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>hash Code Functional Operator</em>'.
	 * @generated
	 */
	hashCode_FunctionalOperator createhashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence equals Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_equals_FunctionalOperator createObject_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>offset By Code Points Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>offset By Code Points Functional Operator</em>'.
	 * @generated
	 */
	offsetByCodePoints_FunctionalOperator createoffsetByCodePoints_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping Reference Or Group</em>'.
	 * @generated
	 */
	AttributeNameMapping_Reference_OrGroup createAttributeNameMapping_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence to String Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_toString_FunctionalOperator createObject_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_toString_FunctionalOperator createCharSequence_String_Object_CharSequence_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>index Of Char Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of Char Functional Operator</em>'.
	 * @generated
	 */
	indexOfChar_FunctionalOperator createindexOfChar_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Interface Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Lib Reference Or Group</em>'.
	 * @generated
	 */
	InterfaceClassLib_Reference_OrGroup createInterfaceClassLib_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Calculateable Parameter</em>'.
	 * @generated
	 */
	String_CalculateableParameter createString_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>CAEX File schema Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File schema Version Attr EClass</em>'.
	 * @generated
	 */
	CAEXFile_schemaVersion_AttrEClass createCAEXFile_schemaVersion_AttrEClass();

	/**
	 * Returns a new object of class '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Calculateable Parameter</em>'.
	 * @generated
	 */
	Character_CalculateableParameter createCharacter_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Attribute unit Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute unit Attr EClass</em>'.
	 * @generated
	 */
	Attribute_unit_AttrEClass createAttribute_unit_AttrEClass();

	/**
	 * Returns a new object of class '<em>Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Reference Or Group</em>'.
	 * @generated
	 */
	Element_Reference_OrGroup createElement_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Boolean equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_equals_FunctionalOperator createObject_Boolean_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * @generated
	 */
	AttributeDataType_CalculateableParameter createAttributeDataType_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Double And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double And Bit Operator</em>'.
	 * @generated
	 */
	Double_And_BitOperator createDouble_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Interface Class Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Containment Or Group</em>'.
	 * @generated
	 */
	InterfaceClass_Containment_OrGroup createInterfaceClass_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Interface Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Family Reference Or Group</em>'.
	 * @generated
	 */
	InterfaceFamily_Reference_OrGroup createInterfaceFamily_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Version value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version value Attr EClass</em>'.
	 * @generated
	 */
	Version_value_AttrEClass createVersion_value_AttrEClass();

	/**
	 * Returns a new object of class '<em>External Reference Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type Reference Or Group</em>'.
	 * @generated
	 */
	ExternalReferenceType_Reference_OrGroup createExternalReferenceType_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Generic Element Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element Containment Or Group</em>'.
	 * @generated
	 */
	GenericElement_Containment_OrGroup createGenericElement_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Ref Semantic Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Semantic Reference Or Group</em>'.
	 * @generated
	 */
	RefSemantic_Reference_OrGroup createRefSemantic_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Revision new Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision new Version Attr EClass</em>'.
	 * @generated
	 */
	Revision_newVersion_AttrEClass createRevision_newVersion_AttrEClass();

	/**
	 * Returns a new object of class '<em>Attribute value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute value Attr EClass</em>'.
	 * @generated
	 */
	Attribute_value_AttrEClass createAttribute_value_AttrEClass();

	/**
	 * Returns a new object of class '<em>Attribute Value Requirement name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Requirement name Attr EClass</em>'.
	 * @generated
	 */
	AttributeValueRequirement_name_AttrEClass createAttributeValueRequirement_name_AttrEClass();

	/**
	 * Returns a new object of class '<em>External Interface Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Interface Reference Or Group</em>'.
	 * @generated
	 */
	ExternalInterface_Reference_OrGroup createExternalInterface_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Version Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originVersion_AttrEClass createSourceDocumentInformation_originVersion_AttrEClass();

	/**
	 * Returns a new object of class '<em>Supported Role Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Role Class Reference Or Group</em>'.
	 * @generated
	 */
	SupportedRoleClass_Reference_OrGroup createSupportedRoleClass_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>contains Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>contains Functional Operator</em>'.
	 * @generated
	 */
	contains_FunctionalOperator createcontains_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Vendor URL Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Vendor URL Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originVendorURL_AttrEClass createSourceDocumentInformation_originVendorURL_AttrEClass();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Release Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Release Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originRelease_AttrEClass createSourceDocumentInformation_originRelease_AttrEClass();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Name Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originName_AttrEClass createSourceDocumentInformation_originName_AttrEClass();

	/**
	 * Returns a new object of class '<em>Attribute Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lib Reference Or Group</em>'.
	 * @generated
	 */
	AttributeLib_Reference_OrGroup createAttributeLib_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	DateTime_CalculateableElementReferenceArgument createDateTime_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>Version change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version change Mode Attr EClass</em>'.
	 * @generated
	 */
	Version_changeMode_AttrEClass createVersion_changeMode_AttrEClass();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * @generated
	 */
	EFeatureMapEntry_CalculateableParameter createEFeatureMapEntry_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>System Unit Class Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Containment Or Group</em>'.
	 * @generated
	 */
	SystemUnitClass_Containment_OrGroup createSystemUnitClass_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Calculateable Parameter</em>'.
	 * @generated
	 */
	CharSequence_CalculateableParameter createCharSequence_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_equals_FunctionalOperator createCharSequence_String_Object_CharSequence_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String And Bit Operator</em>'.
	 * @generated
	 */
	String_And_BitOperator createString_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Unknown Type requirements Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type requirements Attr EClass</em>'.
	 * @generated
	 */
	UnknownType_requirements_AttrEClass createUnknownType_requirements_AttrEClass();

	/**
	 * Returns a new object of class '<em>Generic Attribute Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Attribute Reference Or Group</em>'.
	 * @generated
	 */
	GenericAttribute_Reference_OrGroup createGenericAttribute_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Nominal Scaled Type Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nominal Scaled Type Containment Or Group</em>'.
	 * @generated
	 */
	NominalScaledType_Containment_OrGroup createNominalScaledType_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Interface Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class ref Base Class Path Attr EClass</em>'.
	 * @generated
	 */
	InterfaceClass_refBaseClassPath_AttrEClass createInterfaceClass_refBaseClassPath_AttrEClass();

	/**
	 * Returns a new object of class '<em>Generic Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Element Reference Or Group</em>'.
	 * @generated
	 */
	GenericElement_Reference_OrGroup createGenericElement_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>starts With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>starts With Functional Operator</em>'.
	 * @generated
	 */
	startsWith_FunctionalOperator createstartsWith_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	String_CalculateableElementReferenceArgument createString_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>Attribute default Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute default Value Attr EClass</em>'.
	 * @generated
	 */
	Attribute_defaultValue_AttrEClass createAttribute_defaultValue_AttrEClass();

	/**
	 * Returns a new object of class '<em>substring Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>substring Functional Operator</em>'.
	 * @generated
	 */
	substring_FunctionalOperator createsubstring_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Nominal Scaled Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nominal Scaled Type Reference Or Group</em>'.
	 * @generated
	 */
	NominalScaledType_Reference_OrGroup createNominalScaledType_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Char Sequence Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Primitive Argument</em>'.
	 * @generated
	 */
	CharSequence_PrimitiveArgument createCharSequence_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Count Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Aggregation Operator</em>'.
	 * @generated
	 */
	Count_AggregationOperator createCount_AggregationOperator();

	/**
	 * Returns a new object of class '<em>Number Double Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_toString_FunctionalOperator createNumber_Double_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Reference Or Group</em>'.
	 * @generated
	 */
	Attribute_Reference_OrGroup createAttribute_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Data Type Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type Primitive Argument</em>'.
	 * @generated
	 */
	AttributeDataType_PrimitiveArgument createAttributeDataType_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>CAEX Basic Object Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Basic Object Containment Or Group</em>'.
	 * @generated
	 */
	CAEXBasicObject_Containment_OrGroup createCAEXBasicObject_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>code Point At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>code Point At Functional Operator</em>'.
	 * @generated
	 */
	codePointAt_FunctionalOperator createcodePointAt_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Description value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description value Attr EClass</em>'.
	 * @generated
	 */
	Description_value_AttrEClass createDescription_value_AttrEClass();

	/**
	 * Returns a new object of class '<em>Source Document Information origin ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin ID Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originID_AttrEClass createSourceDocumentInformation_originID_AttrEClass();

	/**
	 * Returns a new object of class '<em>Date Time Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Functional Parameter</em>'.
	 * @generated
	 */
	DateTime_FunctionalParameter createDateTime_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Revision Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Containment Or Group</em>'.
	 * @generated
	 */
	Revision_Containment_OrGroup createRevision_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Min Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Aggregation Operator Double</em>'.
	 * @generated
	 */
	Min_AggregationOperator_Double createMin_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>Internal Element Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Element Containment Or Group</em>'.
	 * @generated
	 */
	InternalElement_Containment_OrGroup createInternalElement_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Char Sequence hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_CharSequence_hashCode_FunctionalOperator createObject_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Boolean And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean And Bit Operator</em>'.
	 * @generated
	 */
	Boolean_And_BitOperator createBoolean_And_BitOperator();

	/**
	 * Returns a new object of class '<em>is Empty Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Empty Functional Operator</em>'.
	 * @generated
	 */
	isEmpty_FunctionalOperator createisEmpty_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Functional Parameter</em>'.
	 * @generated
	 */
	String_FunctionalParameter createString_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Interface Class Lib Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Lib Containment Or Group</em>'.
	 * @generated
	 */
	InterfaceClassLib_Containment_OrGroup createInterfaceClassLib_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Copyright value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright value Attr EClass</em>'.
	 * @generated
	 */
	Copyright_value_AttrEClass createCopyright_value_AttrEClass();

	/**
	 * Returns a new object of class '<em>greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>greater Than Functional Operator</em>'.
	 * @generated
	 */
	greaterThan_FunctionalOperator creategreaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>System Unit Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Lib Reference Or Group</em>'.
	 * @generated
	 */
	SystemUnitClassLib_Reference_OrGroup createSystemUnitClassLib_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>starts With Offset Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>starts With Offset Functional Operator</em>'.
	 * @generated
	 */
	startsWithOffset_FunctionalOperator createstartsWithOffset_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>index Of String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index Of String Functional Operator</em>'.
	 * @generated
	 */
	indexOfString_FunctionalOperator createindexOfString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer greater Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_greaterThan_FunctionalOperator createNumber_Integer_greaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Nominal Scaled Type required Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nominal Scaled Type required Value Attr EClass</em>'.
	 * @generated
	 */
	NominalScaledType_requiredValue_AttrEClass createNominalScaledType_requiredValue_AttrEClass();

	/**
	 * Returns a new object of class '<em>Document Root Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root Reference Or Group</em>'.
	 * @generated
	 */
	DocumentRoot_Reference_OrGroup createDocumentRoot_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	AttributeDataType_CalculateableElementReferenceArgument createAttributeDataType_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>Source Document Information last Writing Date Time Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information last Writing Date Time Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_lastWritingDateTime_AttrEClass createSourceDocumentInformation_lastWritingDateTime_AttrEClass();

	/**
	 * Returns a new object of class '<em>Integer And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer And Bit Operator</em>'.
	 * @generated
	 */
	Integer_And_BitOperator createInteger_And_BitOperator();

	/**
	 * Returns a new object of class '<em>CAEX Basic Object change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Basic Object change Mode Attr EClass</em>'.
	 * @generated
	 */
	CAEXBasicObject_changeMode_AttrEClass createCAEXBasicObject_changeMode_AttrEClass();

	/**
	 * Returns a new object of class '<em>Double Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Or Bit Operator</em>'.
	 * @generated
	 */
	Double_Or_BitOperator createDouble_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Element name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element name Attr EClass</em>'.
	 * @generated
	 */
	Element_name_AttrEClass createElement_name_AttrEClass();

	/**
	 * Returns a new object of class '<em>Role Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Reference Or Group</em>'.
	 * @generated
	 */
	RoleClass_Reference_OrGroup createRoleClass_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Project ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Project ID Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originProjectID_AttrEClass createSourceDocumentInformation_originProjectID_AttrEClass();

	/**
	 * Returns a new object of class '<em>Role Class Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Containment Or Group</em>'.
	 * @generated
	 */
	RoleClass_Containment_OrGroup createRoleClass_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Functional Parameter</em>'.
	 * @generated
	 */
	Object_FunctionalParameter createObject_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry Functional Parameter</em>'.
	 * @generated
	 */
	EFeatureMapEntry_FunctionalParameter createEFeatureMapEntry_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_hashCode_FunctionalOperator createNumber_Integer_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry Or Bit Operator</em>'.
	 * @generated
	 */
	EFeatureMapEntry_Or_BitOperator createEFeatureMapEntry_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Char Sequence String length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String length Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_length_FunctionalOperator createCharSequence_String_length_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping Containment Or Group</em>'.
	 * @generated
	 */
	InterfaceIDMapping_Containment_OrGroup createInterfaceIDMapping_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>equals Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equals Ignore Case Functional Operator</em>'.
	 * @generated
	 */
	equalsIgnoreCase_FunctionalOperator createequalsIgnoreCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping Containment Or Group</em>'.
	 * @generated
	 */
	AttributeNameMapping_Containment_OrGroup createAttributeNameMapping_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Revision author Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision author Name Attr EClass</em>'.
	 * @generated
	 */
	Revision_authorName_AttrEClass createRevision_authorName_AttrEClass();

	/**
	 * Returns a new object of class '<em>Change Mode Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Mode Enumeration Operator</em>'.
	 * @generated
	 */
	ChangeMode_EnumerationOperator createChangeMode_EnumerationOperator();

	/**
	 * Returns a new object of class '<em>Attribute Lib Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lib Containment Or Group</em>'.
	 * @generated
	 */
	AttributeLib_Containment_OrGroup createAttributeLib_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Document Root Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root Containment Or Group</em>'.
	 * @generated
	 */
	DocumentRoot_Containment_OrGroup createDocumentRoot_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Role Class Lib Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Lib Containment Or Group</em>'.
	 * @generated
	 */
	RoleClassLib_Containment_OrGroup createRoleClassLib_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Role Family Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Family Containment Or Group</em>'.
	 * @generated
	 */
	RoleFamily_Containment_OrGroup createRoleFamily_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Calculateable Parameter</em>'.
	 * @generated
	 */
	Number_CalculateableParameter createNumber_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Internal Link Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link Containment Or Group</em>'.
	 * @generated
	 */
	InternalLink_Containment_OrGroup createInternalLink_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Document Root mixed Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root mixed Attr EClass</em>'.
	 * @generated
	 */
	DocumentRoot_mixed_AttrEClass createDocumentRoot_mixed_AttrEClass();

	/**
	 * Returns a new object of class '<em>Max Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Max_AggregationOperator_Integer createMax_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>Description change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description change Mode Attr EClass</em>'.
	 * @generated
	 */
	Description_changeMode_AttrEClass createDescription_changeMode_AttrEClass();

	/**
	 * Returns a new object of class '<em>Number Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Primitive Argument</em>'.
	 * @generated
	 */
	Number_PrimitiveArgument createNumber_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_toString_FunctionalOperator createObject_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>CAEX File superior Standard Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File superior Standard Version Attr EClass</em>'.
	 * @generated
	 */
	CAEXFile_superiorStandardVersion_AttrEClass createCAEXFile_superiorStandardVersion_AttrEClass();

	/**
	 * Returns a new object of class '<em>Attribute Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Family Reference Or Group</em>'.
	 * @generated
	 */
	AttributeFamily_Reference_OrGroup createAttributeFamily_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>double Value Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Value Functional Operator</em>'.
	 * @generated
	 */
	doubleValue_FunctionalOperator createdoubleValue_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Internal Link ref Partner Side AAttr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link ref Partner Side AAttr EClass</em>'.
	 * @generated
	 */
	InternalLink_refPartnerSideA_AttrEClass createInternalLink_refPartnerSideA_AttrEClass();

	/**
	 * Returns a new object of class '<em>Number Double Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_equals_FunctionalOperator createNumber_Double_Object_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>parse Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>parse Boolean Functional Operator</em>'.
	 * @generated
	 */
	parseBoolean_FunctionalOperator createparseBoolean_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>to Upper Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>to Upper Case Functional Operator</em>'.
	 * @generated
	 */
	toUpperCase_FunctionalOperator createtoUpperCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Object Boolean to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean to String Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_toString_FunctionalOperator createObject_Boolean_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Revision comment Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision comment Attr EClass</em>'.
	 * @generated
	 */
	Revision_comment_AttrEClass createRevision_comment_AttrEClass();

	/**
	 * Returns a new object of class '<em>CAEX File Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File Containment Or Group</em>'.
	 * @generated
	 */
	CAEXFile_Containment_OrGroup createCAEXFile_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Sum Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Sum_AggregationOperator_Integer createSum_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>greater Equals Functional Operator</em>'.
	 * @generated
	 */
	greaterEquals_FunctionalOperator creategreaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Internal Link ref Partner Side BAttr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link ref Partner Side BAttr EClass</em>'.
	 * @generated
	 */
	InternalLink_refPartnerSideB_AttrEClass createInternalLink_refPartnerSideB_AttrEClass();

	/**
	 * Returns a new object of class '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Functional Parameter</em>'.
	 * @generated
	 */
	Character_FunctionalParameter createCharacter_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Role Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Family Reference Or Group</em>'.
	 * @generated
	 */
	RoleFamily_Reference_OrGroup createRoleFamily_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute attribute Data Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute attribute Data Type Attr EClass</em>'.
	 * @generated
	 */
	Attribute_attributeDataType_AttrEClass createAttribute_attributeDataType_AttrEClass();

	/**
	 * Returns a new object of class '<em>Description Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Reference Or Group</em>'.
	 * @generated
	 */
	Description_Reference_OrGroup createDescription_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_hashCode_FunctionalOperator createObject_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping Reference Or Group</em>'.
	 * @generated
	 */
	InterfaceIDMapping_Reference_OrGroup createInterfaceIDMapping_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_smallerEquals_FunctionalOperator createNumber_Integer_smallerEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>CAEX Basic Object Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Basic Object Reference Or Group</em>'.
	 * @generated
	 */
	CAEXBasicObject_Reference_OrGroup createCAEXBasicObject_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute ref Attribute Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute ref Attribute Type Attr EClass</em>'.
	 * @generated
	 */
	Attribute_refAttributeType_AttrEClass createAttribute_refAttributeType_AttrEClass();

	/**
	 * Returns a new object of class '<em>compare To String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To String Functional Operator</em>'.
	 * @generated
	 */
	compareToString_FunctionalOperator createcompareToString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Internal Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Element Reference Or Group</em>'.
	 * @generated
	 */
	InternalElement_Reference_OrGroup createInternalElement_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type required Min Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type required Min Value Attr EClass</em>'.
	 * @generated
	 */
	OrdinalScaledType_requiredMinValue_AttrEClass createOrdinalScaledType_requiredMinValue_AttrEClass();

	/**
	 * Returns a new object of class '<em>Boolean Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Or Bit Operator</em>'.
	 * @generated
	 */
	Boolean_Or_BitOperator createBoolean_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Character Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Or Bit Operator</em>'.
	 * @generated
	 */
	Character_Or_BitOperator createCharacter_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Functional Parameter</em>'.
	 * @generated
	 */
	Boolean_FunctionalParameter createBoolean_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Double Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Primitive Argument</em>'.
	 * @generated
	 */
	Double_PrimitiveArgument createDouble_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>compare To String Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To String Ignore Case Functional Operator</em>'.
	 * @generated
	 */
	compareToStringIgnoreCase_FunctionalOperator createcompareToStringIgnoreCase_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Interface Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Reference Or Group</em>'.
	 * @generated
	 */
	InterfaceClass_Reference_OrGroup createInterfaceClass_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Object Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Or Bit Operator</em>'.
	 * @generated
	 */
	Object_Or_BitOperator createObject_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Additional Information Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Information Reference Or Group</em>'.
	 * @generated
	 */
	AdditionalInformation_Reference_OrGroup createAdditionalInformation_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countable Reference Argument</em>'.
	 * @generated
	 */
	Countable_ReferenceArgument createCountable_ReferenceArgument();

	/**
	 * Returns a new object of class '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence Functional Parameter</em>'.
	 * @generated
	 */
	CharSequence_FunctionalParameter createCharSequence_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Calculateable Parameter</em>'.
	 * @generated
	 */
	Boolean_CalculateableParameter createBoolean_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Source Document Information origin Project Title Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information origin Project Title Attr EClass</em>'.
	 * @generated
	 */
	SourceDocumentInformation_originProjectTitle_AttrEClass createSourceDocumentInformation_originProjectTitle_AttrEClass();

	/**
	 * Returns a new object of class '<em>Number Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Or Bit Operator</em>'.
	 * @generated
	 */
	Number_Or_BitOperator createNumber_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Max Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Aggregation Operator Double</em>'.
	 * @generated
	 */
	Max_AggregationOperator_Double createMax_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>System Unit Family Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Family Containment Or Group</em>'.
	 * @generated
	 */
	SystemUnitFamily_Containment_OrGroup createSystemUnitFamily_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Double greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double greater Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_greaterThan_FunctionalOperator createNumber_Double_greaterThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Copyright Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright Reference Or Group</em>'.
	 * @generated
	 */
	Copyright_Reference_OrGroup createCopyright_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Character Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Primitive Argument</em>'.
	 * @generated
	 */
	Character_PrimitiveArgument createCharacter_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Role Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class ref Base Class Path Attr EClass</em>'.
	 * @generated
	 */
	RoleClass_refBaseClassPath_AttrEClass createRoleClass_refBaseClassPath_AttrEClass();

	/**
	 * Returns a new object of class '<em>Copyright Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright Containment Or Group</em>'.
	 * @generated
	 */
	Copyright_Containment_OrGroup createCopyright_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Data Type Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Data Type Or Bit Operator</em>'.
	 * @generated
	 */
	AttributeDataType_Or_BitOperator createAttributeDataType_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type Containment Or Group</em>'.
	 * @generated
	 */
	OrdinalScaledType_Containment_OrGroup createOrdinalScaledType_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>External Reference Type Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type Containment Or Group</em>'.
	 * @generated
	 */
	ExternalReferenceType_Containment_OrGroup createExternalReferenceType_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Functional Parameter</em>'.
	 * @generated
	 */
	Integer_FunctionalParameter createInteger_FunctionalParameter();

	/**
	 * Returns a new object of class '<em>External Reference Type path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type path Attr EClass</em>'.
	 * @generated
	 */
	ExternalReferenceType_path_AttrEClass createExternalReferenceType_path_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object Boolean hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Boolean hash Code Functional Operator</em>'.
	 * @generated
	 */
	Object_Boolean_hashCode_FunctionalOperator createObject_Boolean_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>And Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Evaluation Bit Operator</em>'.
	 * @generated
	 */
	And_EvaluationBitOperator createAnd_EvaluationBitOperator();

	/**
	 * Returns a new object of class '<em>smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>smaller Than Functional Operator</em>'.
	 * @generated
	 */
	smallerThan_FunctionalOperator createsmallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Source Document Information Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information Containment Or Group</em>'.
	 * @generated
	 */
	SourceDocumentInformation_Containment_OrGroup createSourceDocumentInformation_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>System Unit Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Reference Or Group</em>'.
	 * @generated
	 */
	SystemUnitClass_Reference_OrGroup createSystemUnitClass_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Copyright change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright change Mode Attr EClass</em>'.
	 * @generated
	 */
	Copyright_changeMode_AttrEClass createCopyright_changeMode_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object Character equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Character equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Character_equals_FunctionalOperator createObject_Character_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_Object_Number_toString_FunctionalOperator createNumber_Integer_Object_Number_toString_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry Primitive Argument</em>'.
	 * @generated
	 */
	EFeatureMapEntry_PrimitiveArgument createEFeatureMapEntry_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping system Unit Interface ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping system Unit Interface ID Attr EClass</em>'.
	 * @generated
	 */
	InterfaceIDMapping_systemUnitInterfaceID_AttrEClass createInterfaceIDMapping_systemUnitInterfaceID_AttrEClass();

	/**
	 * Returns a new object of class '<em>Date Time Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Calculateable Parameter</em>'.
	 * @generated
	 */
	DateTime_CalculateableParameter createDateTime_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Internal Element ref Base System Unit Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Element ref Base System Unit Path Attr EClass</em>'.
	 * @generated
	 */
	InternalElement_refBaseSystemUnitPath_AttrEClass createInternalElement_refBaseSystemUnitPath_AttrEClass();

	/**
	 * Returns a new object of class '<em>char At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char At Functional Operator</em>'.
	 * @generated
	 */
	charAt_FunctionalOperator createcharAt_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Sum Aggregation Operator Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Aggregation Operator Double</em>'.
	 * @generated
	 */
	Sum_AggregationOperator_Double createSum_AggregationOperator_Double();

	/**
	 * Returns a new object of class '<em>compare To Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compare To Boolean Functional Operator</em>'.
	 * @generated
	 */
	compareToBoolean_FunctionalOperator createcompareToBoolean_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equals Functional Operator</em>'.
	 * @generated
	 */
	equals_FunctionalOperator createequals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculateable Parameter</em>'.
	 * @generated
	 */
	Integer_CalculateableParameter createInteger_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Number And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number And Bit Operator</em>'.
	 * @generated
	 */
	Number_And_BitOperator createNumber_And_BitOperator();

	/**
	 * Returns a new object of class '<em>code Point Before Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>code Point Before Functional Operator</em>'.
	 * @generated
	 */
	codePointBefore_FunctionalOperator createcodePointBefore_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Revision Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Reference Or Group</em>'.
	 * @generated
	 */
	Revision_Reference_OrGroup createRevision_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Double smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double smaller Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_smallerThan_FunctionalOperator createNumber_Double_smallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * @generated
	 */
	EFeatureMapEntry_CalculateableElementReferenceArgument createEFeatureMapEntry_CalculateableElementReferenceArgument();

	/**
	 * Returns a new object of class '<em>Number Integer greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer greater Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_greaterEquals_FunctionalOperator createNumber_Integer_greaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Internal Link Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link Reference Or Group</em>'.
	 * @generated
	 */
	InternalLink_Reference_OrGroup createInternalLink_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Containment Or Group</em>'.
	 * @generated
	 */
	Attribute_Containment_OrGroup createAttribute_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>concat Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>concat Functional Operator</em>'.
	 * @generated
	 */
	concat_FunctionalOperator createconcat_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry And Bit Operator</em>'.
	 * @generated
	 */
	EFeatureMapEntry_And_BitOperator createEFeatureMapEntry_And_BitOperator();

	/**
	 * Returns a new object of class '<em>System Unit Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Family Reference Or Group</em>'.
	 * @generated
	 */
	SystemUnitFamily_Reference_OrGroup createSystemUnitFamily_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Supported Role Class Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Role Class Containment Or Group</em>'.
	 * @generated
	 */
	SupportedRoleClass_Containment_OrGroup createSupportedRoleClass_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Interface Family Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Family Containment Or Group</em>'.
	 * @generated
	 */
	InterfaceFamily_Containment_OrGroup createInterfaceFamily_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Role Requirements Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requirements Containment Or Group</em>'.
	 * @generated
	 */
	RoleRequirements_Containment_OrGroup createRoleRequirements_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Revision old Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision old Version Attr EClass</em>'.
	 * @generated
	 */
	Revision_oldVersion_AttrEClass createRevision_oldVersion_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Number equals Functional Operator</em>'.
	 * @generated
	 */
	Object_Number_equals_FunctionalOperator createObject_Number_equals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Integer smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Integer smaller Than Functional Operator</em>'.
	 * @generated
	 */
	Number_Integer_smallerThan_FunctionalOperator createNumber_Integer_smallerThan_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Number Double greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double greater Equals Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_greaterEquals_FunctionalOperator createNumber_Double_greaterEquals_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>System Unit Class Lib Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Lib Containment Or Group</em>'.
	 * @generated
	 */
	SystemUnitClassLib_Containment_OrGroup createSystemUnitClassLib_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Attribute Value Requirement Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Requirement Containment Or Group</em>'.
	 * @generated
	 */
	AttributeValueRequirement_Containment_OrGroup createAttributeValueRequirement_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>String Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Or Bit Operator</em>'.
	 * @generated
	 */
	String_Or_BitOperator createString_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>CAEX Object Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Object Reference Or Group</em>'.
	 * @generated
	 */
	CAEXObject_Reference_OrGroup createCAEXObject_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Integer Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Or Bit Operator</em>'.
	 * @generated
	 */
	Integer_Or_BitOperator createInteger_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>CAEX File Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File Reference Or Group</em>'.
	 * @generated
	 */
	CAEXFile_Reference_OrGroup createCAEXFile_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Reference Or Group</em>'.
	 * @generated
	 */
	Mapping_Reference_OrGroup createMapping_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Date Time Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Or Bit Operator</em>'.
	 * @generated
	 */
	DateTime_Or_BitOperator createDateTime_Or_BitOperator();

	/**
	 * Returns a new object of class '<em>CAEX File file Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX File file Name Attr EClass</em>'.
	 * @generated
	 */
	CAEXFile_fileName_AttrEClass createCAEXFile_fileName_AttrEClass();

	/**
	 * Returns a new object of class '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Sequence String Object Char Sequence hash Code Functional Operator</em>'.
	 * @generated
	 */
	CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator createCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Role Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Lib Reference Or Group</em>'.
	 * @generated
	 */
	RoleClassLib_Reference_OrGroup createRoleClassLib_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Min Aggregation Operator Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Aggregation Operator Integer</em>'.
	 * @generated
	 */
	Min_AggregationOperator_Integer createMin_AggregationOperator_Integer();

	/**
	 * Returns a new object of class '<em>Integer Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Primitive Argument</em>'.
	 * @generated
	 */
	Integer_PrimitiveArgument createInteger_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Ref Semantic Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Semantic Containment Or Group</em>'.
	 * @generated
	 */
	RefSemantic_Containment_OrGroup createRefSemantic_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled Type Reference Or Group</em>'.
	 * @generated
	 */
	OrdinalScaledType_Reference_OrGroup createOrdinalScaledType_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Find Query Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Query Collection</em>'.
	 * @generated
	 */
	FindQueryCollection createFindQueryCollection();

	/**
	 * Returns a new object of class '<em>Revision revision Date Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision revision Date Attr EClass</em>'.
	 * @generated
	 */
	Revision_revisionDate_AttrEClass createRevision_revisionDate_AttrEClass();

	/**
	 * Returns a new object of class '<em>Object And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object And Bit Operator</em>'.
	 * @generated
	 */
	Object_And_BitOperator createObject_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Object Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Primitive Argument</em>'.
	 * @generated
	 */
	Object_PrimitiveArgument createObject_PrimitiveArgument();

	/**
	 * Returns a new object of class '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Clause</em>'.
	 * @generated
	 */
	SelectClause createSelectClause();

	/**
	 * Returns a new object of class '<em>Date Time And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time And Bit Operator</em>'.
	 * @generated
	 */
	DateTime_And_BitOperator createDateTime_And_BitOperator();

	/**
	 * Returns a new object of class '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Calculateable Parameter</em>'.
	 * @generated
	 */
	Double_CalculateableParameter createDouble_CalculateableParameter();

	/**
	 * Returns a new object of class '<em>Description Containment Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Containment Or Group</em>'.
	 * @generated
	 */
	Description_Containment_OrGroup createDescription_Containment_OrGroup();

	/**
	 * Returns a new object of class '<em>length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>length Functional Operator</em>'.
	 * @generated
	 */
	length_FunctionalOperator createlength_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Supported Role Class ref Role Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Role Class ref Role Class Path Attr EClass</em>'.
	 * @generated
	 */
	SupportedRoleClass_refRoleClassPath_AttrEClass createSupportedRoleClass_refRoleClassPath_AttrEClass();

	/**
	 * Returns a new object of class '<em>Unknown Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type Reference Or Group</em>'.
	 * @generated
	 */
	UnknownType_Reference_OrGroup createUnknownType_Reference_OrGroup();

	/**
	 * Returns a new object of class '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Double Object Number hash Code Functional Operator</em>'.
	 * @generated
	 */
	Number_Double_Object_Number_hashCode_FunctionalOperator createNumber_Double_Object_Number_hashCode_FunctionalOperator();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping system Unit Attribute Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping system Unit Attribute Name Attr EClass</em>'.
	 * @generated
	 */
	AttributeNameMapping_systemUnitAttributeName_AttrEClass createAttributeNameMapping_systemUnitAttributeName_AttrEClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QmmPackage getQmmPackage();

} //QmmFactory
