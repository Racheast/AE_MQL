/**
 */
package qmm.util;

import java.lang.CharSequence;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QmmValidator INSTANCE = new QmmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qmm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_FAMILY__VALIDATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Name Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_NAME_MAPPING__VALIDATE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__VALIDATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_LIB__VALIDATE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Value Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_VALUE_REQUIREMENT__VALIDATE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Basic Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_BASIC_OBJECT__VALIDATE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX File'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_FILE__VALIDATE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_OBJECT__VALIDATE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Document Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOCUMENT_ROOT__VALIDATE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_INTERFACE__VALIDATE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Reference Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE_TYPE__VALIDATE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Instance Hierarchy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_HIERARCHY__VALIDATE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS_LIB__VALIDATE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS__VALIDATE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_FAMILY__VALIDATE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface ID Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_ID_MAPPING__VALIDATE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ELEMENT__VALIDATE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_LINK__VALIDATE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAPPING__VALIDATE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Nominal Scaled Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOMINAL_SCALED_TYPE__VALIDATE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ordinal Scaled Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDINAL_SCALED_TYPE__VALIDATE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ref Semantic'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REF_SEMANTIC__VALIDATE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS_LIB__VALIDATE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS__VALIDATE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_FAMILY__VALIDATE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Requirements'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_REQUIREMENTS__VALIDATE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Source Document Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOURCE_DOCUMENT_INFORMATION__VALIDATE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Supported Role Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORTED_ROLE_CLASS__VALIDATE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS_LIB__VALIDATE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS__VALIDATE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_FAMILY__VALIDATE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Unknown Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNKNOWN_TYPE__VALIDATE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Copyright'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPYRIGHT__VALIDATE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIPTION__VALIDATE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Revision'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVISION__VALIDATE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Version'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VERSION__VALIDATE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Additional Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDITIONAL_INFORMATION__VALIDATE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__VALIDATE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ELEMENT__VALIDATE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ATTRIBUTE__VALIDATE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_ATTRIBUTE_ECLASS__VALIDATE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Instance Hierarchy Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_HIERARCHY_REFERENCE_OR_GROUP__VALIDATE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CALCULATEABLE_PARAMETER__VALIDATE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Value Requirement Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_VALUE_REQUIREMENT_REFERENCE_OR_GROUP__VALIDATE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_FUNCTIONAL_PARAMETER__VALIDATE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Version Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VERSION_REFERENCE_OR_GROUP__VALIDATE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OR_GROUP__VALIDATE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Source Document Information Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOURCE_DOCUMENT_INFORMATION_REFERENCE_OR_GROUP__VALIDATE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Requirements Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_REQUIREMENTS_REFERENCE_OR_GROUP__VALIDATE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_ATTRIBUTE_ECLASS__VALIDATE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_FUNCTIONAL_PARAMETER__VALIDATE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER__VALIDATE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Name Mapping Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_NAME_MAPPING_REFERENCE_OR_GROUP__VALIDATE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class Lib Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS_LIB_REFERENCE_OR_GROUP__VALIDATE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_PARAMETER__VALIDATE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_CALCULATEABLE_PARAMETER__VALIDATE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Element Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_REFERENCE_OR_GROUP__VALIDATE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER__VALIDATE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Family Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_FAMILY_REFERENCE_OR_GROUP__VALIDATE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Reference Type Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE_TYPE_REFERENCE_OR_GROUP__VALIDATE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ref Semantic Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REF_SEMANTIC_REFERENCE_OR_GROUP__VALIDATE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Interface Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_INTERFACE_REFERENCE_OR_GROUP__VALIDATE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Supported Role Class Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORTED_ROLE_CLASS_REFERENCE_OR_GROUP__VALIDATE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Lib Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_LIB_REFERENCE_OR_GROUP__VALIDATE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER__VALIDATE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER__VALIDATE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Attribute Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ATTRIBUTE_REFERENCE_OR_GROUP__VALIDATE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Element Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ELEMENT_REFERENCE_OR_GROUP__VALIDATE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Nominal Scaled Type Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOMINAL_SCALED_TYPE_REFERENCE_OR_GROUP__VALIDATE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_REFERENCE_OR_GROUP__VALIDATE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_FUNCTIONAL_PARAMETER__VALIDATE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_FUNCTIONAL_PARAMETER__VALIDATE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class Lib Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS_LIB_REFERENCE_OR_GROUP__VALIDATE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_ATTRIBUTE_ECLASS__VALIDATE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Document Root Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOCUMENT_ROOT_REFERENCE_OR_GROUP__VALIDATE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VALIDATE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS_REFERENCE_OR_GROUP__VALIDATE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FUNCTIONAL_PARAMETER__VALIDATE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER__VALIDATE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_CALCULATEABLE_PARAMETER__VALIDATE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Family Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_FAMILY_REFERENCE_OR_GROUP__VALIDATE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_FUNCTIONAL_PARAMETER__VALIDATE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Family Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_FAMILY_REFERENCE_OR_GROUP__VALIDATE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_ATTRIBUTE_ECLASS__VALIDATE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Description Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIPTION_REFERENCE_OR_GROUP__VALIDATE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface ID Mapping Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_ID_MAPPING_REFERENCE_OR_GROUP__VALIDATE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Basic Object Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_BASIC_OBJECT_REFERENCE_OR_GROUP__VALIDATE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Element Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ELEMENT_REFERENCE_OR_GROUP__VALIDATE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_FUNCTIONAL_PARAMETER__VALIDATE = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS_REFERENCE_OR_GROUP__VALIDATE = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Additional Information Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDITIONAL_INFORMATION_REFERENCE_OR_GROUP__VALIDATE = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Countable Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTABLE_REFERENCE_ARGUMENT__VALIDATE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER__VALIDATE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_CALCULATEABLE_PARAMETER__VALIDATE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Copyright Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPYRIGHT_REFERENCE_OR_GROUP__VALIDATE = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_FUNCTIONAL_PARAMETER__VALIDATE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS_REFERENCE_OR_GROUP__VALIDATE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_CALCULATEABLE_PARAMETER__VALIDATE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_CALCULATEABLE_PARAMETER__VALIDATE = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Revision Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVISION_REFERENCE_OR_GROUP__VALIDATE = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Link Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_LINK_REFERENCE_OR_GROUP__VALIDATE = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Family Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_FAMILY_REFERENCE_OR_GROUP__VALIDATE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Object Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_OBJECT_REFERENCE_OR_GROUP__VALIDATE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX File Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_FILE_REFERENCE_OR_GROUP__VALIDATE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Mapping Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAPPING_REFERENCE_OR_GROUP__VALIDATE = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class Lib Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS_LIB_REFERENCE_OR_GROUP__VALIDATE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ordinal Scaled Type Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDINAL_SCALED_TYPE_REFERENCE_OR_GROUP__VALIDATE = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Select Clause'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SELECT_CLAUSE__VALIDATE = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_CALCULATEABLE_PARAMETER__VALIDATE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Unknown Type Reference Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNKNOWN_TYPE_REFERENCE_OR_GROUP__VALIDATE = 114;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 114;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QmmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QmmPackage.ATTRIBUTE_FAMILY:
				return validateAttributeFamily((AttributeFamily)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING:
				return validateAttributeNameMapping((AttributeNameMapping)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_LIB:
				return validateAttributeLib((AttributeLib)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT:
				return validateAttributeValueRequirement((AttributeValueRequirement)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT:
				return validateCAEXBasicObject((CAEXBasicObject)value, diagnostics, context);
			case QmmPackage.CAEX_FILE:
				return validateCAEXFile((CAEXFile)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT:
				return validateCAEXObject((CAEXObject)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case QmmPackage.EXTERNAL_INTERFACE:
				return validateExternalInterface((ExternalInterface)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE:
				return validateExternalReferenceType((ExternalReferenceType)value, diagnostics, context);
			case QmmPackage.INSTANCE_HIERARCHY:
				return validateInstanceHierarchy((InstanceHierarchy)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_LIB:
				return validateInterfaceClassLib((InterfaceClassLib)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS:
				return validateInterfaceClass((InterfaceClass)value, diagnostics, context);
			case QmmPackage.INTERFACE_FAMILY:
				return validateInterfaceFamily((InterfaceFamily)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING:
				return validateInterfaceIDMapping((InterfaceIDMapping)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT:
				return validateInternalElement((InternalElement)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK:
				return validateInternalLink((InternalLink)value, diagnostics, context);
			case QmmPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE:
				return validateNominalScaledType((NominalScaledType)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE:
				return validateOrdinalScaledType((OrdinalScaledType)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC:
				return validateRefSemantic((RefSemantic)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_LIB:
				return validateRoleClassLib((RoleClassLib)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS:
				return validateRoleClass((RoleClass)value, diagnostics, context);
			case QmmPackage.ROLE_FAMILY:
				return validateRoleFamily((RoleFamily)value, diagnostics, context);
			case QmmPackage.ROLE_REQUIREMENTS:
				return validateRoleRequirements((RoleRequirements)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION:
				return validateSourceDocumentInformation((SourceDocumentInformation)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS:
				return validateSupportedRoleClass((SupportedRoleClass)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB:
				return validateSystemUnitClassLib((SystemUnitClassLib)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS:
				return validateSystemUnitClass((SystemUnitClass)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_FAMILY:
				return validateSystemUnitFamily((SystemUnitFamily)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE:
				return validateUnknownType((UnknownType)value, diagnostics, context);
			case QmmPackage.COPYRIGHT:
				return validateCopyright((Copyright)value, diagnostics, context);
			case QmmPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case QmmPackage.REVISION:
				return validateRevision((Revision)value, diagnostics, context);
			case QmmPackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case QmmPackage.ADDITIONAL_INFORMATION:
				return validateAdditionalInformation((AdditionalInformation)value, diagnostics, context);
			case QmmPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT:
				return validateGenericElement((GenericElement)value, diagnostics, context);
			case QmmPackage.GENERIC_ATTRIBUTE:
				return validateGenericAttribute((GenericAttribute)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_AND_BIT_OPERATOR:
				return validateAttributeDataType_And_BitOperator((AttributeDataType_And_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Character_toString_FunctionalOperator((Object_Character_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_ATTRIBUTE_ECLASS:
				return validateEFeatureMapEntry_AttributeEClass((EFeatureMapEntry_AttributeEClass)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredMaxValue_AttrEClass((OrdinalScaledType_requiredMaxValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.INSTANCE_HIERARCHY_REFERENCE_OR_GROUP:
				return validateInstanceHierarchy_Reference_OrGroup((InstanceHierarchy_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_NAME_ATTR_ECLASS:
				return validateCAEXObject_name_AttrEClass((CAEXObject_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHARACTER_ARGUMENT:
				return validateCharacter_Argument((Character_Argument)value, diagnostics, context);
			case QmmPackage.BIT_OPERATOR:
				return validateBitOperator((BitOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_BIT_OPERATOR:
				return validateEvaluationBitOperator((EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				return validateGenericElement_elementFeatureMap_AttrEClass((GenericElement_elementFeatureMap_AttrEClass)value, diagnostics, context);
			case QmmPackage.EXTERNAL_INTERFACE_CONTAINMENT_OR_GROUP:
				return validateExternalInterface_Containment_OrGroup((ExternalInterface_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ELEMENT_VALUE_ATTR_ECLASS:
				return validateElement_value_AttrEClass((Element_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_ID_ATTR_ECLASS:
				return validateCAEXObject_iD_AttrEClass((CAEXObject_iD_AttrEClass)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATOR:
				return validateEvaluationOperator((EvaluationOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER:
				return validateObject_CalculateableParameter((Object_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_REFERENCE_OR_GROUP:
				return validateAttributeValueRequirement_Reference_OrGroup((AttributeValueRequirement_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Character_FunctionalOperator((InheritedFrom_Object_to_Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_OPERATOR:
				return validateObject_FunctionalOperator((Object_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INSTANCE_HIERARCHY_CONTAINMENT_OR_GROUP:
				return validateInstanceHierarchy_Containment_OrGroup((InstanceHierarchy_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.COUNTABLE:
				return validateCountable((Countable)value, diagnostics, context);
			case QmmPackage.NUMBER_BIT_OPERATOR:
				return validateNumber_BitOperator((Number_BitOperator)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC_CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return validateRefSemantic_correspondingAttributePath_AttrEClass((RefSemantic_correspondingAttributePath_AttrEClass)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Character_hashCode_FunctionalOperator((Object_Character_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_equals_FunctionalOperator((Number_Integer_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR:
				return validateIntegerParseInt_ClassOperator((IntegerParseInt_ClassOperator)value, diagnostics, context);
			case QmmPackage.ELEMENT_CONTAINMENT_OR_GROUP:
				return validateElement_Containment_OrGroup((Element_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.GENERIC_ATTRIBUTE_CONTAINMENT_OR_GROUP:
				return validateGenericAttribute_Containment_OrGroup((GenericAttribute_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_PRIMITIVE_ARGUMENT:
				return validateDateTime_PrimitiveArgument((DateTime_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE:
				return validateBoolean_FunctionalType((Boolean_FunctionalType)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT:
				return validateEFeatureMapEntry_CalculateableElement((EFeatureMapEntry_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DATE_TIME_BIT_OPERATOR:
				return validateDateTime_BitOperator((DateTime_BitOperator)value, diagnostics, context);
			case QmmPackage.CALCULATING_AGGREGATION_OPERATOR:
				return validateCalculatingAggregationOperator((CalculatingAggregationOperator)value, diagnostics, context);
			case QmmPackage.TRIM_FUNCTIONAL_OPERATOR:
				return validatetrim_FunctionalOperator((trim_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_TYPE:
				return validateEFeatureMapEntry_Type((EFeatureMapEntry_Type)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER:
				return validateDouble_FunctionalParameter((Double_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_TYPE:
				return validateCharacter_Type((Character_Type)value, diagnostics, context);
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR:
				return validatetoString_FunctionalOperator((toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_FAMILY_CONTAINMENT_OR_GROUP:
				return validateAttributeFamily_Containment_OrGroup((AttributeFamily_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateSystemUnitClass_refBaseClassPath_AttrEClass((SystemUnitClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER:
				return validateCountableReferenceParameter((CountableReferenceParameter)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				return validateGenericElement_attributeFeatureMap_AttrEClass((GenericElement_attributeFeatureMap_AttrEClass)value, diagnostics, context);
			case QmmPackage.INDEX_OF_CHAR_FROM_INDEX_FUNCTIONAL_OPERATOR:
				return validateindexOfCharFromIndex_FunctionalOperator((indexOfCharFromIndex_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_TYPE:
				return validateString_Type((String_Type)value, diagnostics, context);
			case QmmPackage.OBJECT_EVALUATION_OPERATION_ARGUMENT:
				return validateObject_EvaluationOperation_Argument((Object_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateDouble_Original_FunctionalOperator((Double_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_OPERATOR:
				return validateCharacter_Operator((Character_Operator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerEquals_FunctionalOperator((Number_Double_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR:
				return validateCharacter_And_BitOperator((Character_And_BitOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_ROLE_INTERFACE_ID_ATTR_ECLASS:
				return validateInterfaceIDMapping_roleInterfaceID_AttrEClass((InterfaceIDMapping_roleInterfaceID_AttrEClass)value, diagnostics, context);
			case QmmPackage.NUMBER_EXPRESSION_OPERATOR:
				return validateNumber_ExpressionOperator((Number_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_OPERATOR:
				return validateDateTime_FunctionalOperator((DateTime_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_CONTAINMENT_OR_GROUP:
				return validateCAEXObject_Containment_OrGroup((CAEXObject_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVendor_AttrEClass((SourceDocumentInformation_originVendor_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_ARGUMENT:
				return validateInteger_Argument((Integer_Argument)value, diagnostics, context);
			case QmmPackage.MAPPING_CONTAINMENT_OR_GROUP:
				return validateMapping_Containment_OrGroup((Mapping_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_BIT_OPERATOR:
				return validateCharacter_BitOperator((Character_BitOperator)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE_CONTAINMENT_OR_GROUP:
				return validateUnknownType_Containment_OrGroup((UnknownType_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_ALIAS_ATTR_ECLASS:
				return validateExternalReferenceType_alias_AttrEClass((ExternalReferenceType_alias_AttrEClass)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_EVALUATION_OPERATION_ARGUMENT:
				return validateEFeatureMapEntry_EvaluationOperation_Argument((EFeatureMapEntry_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT:
				return validateCalculateableElement((CalculateableElement)value, diagnostics, context);
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT:
				return validateString_PrimitiveArgument((String_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.NUMBER_TYPE:
				return validateNumber_Type((Number_Type)value, diagnostics, context);
			case QmmPackage.VERSION_REFERENCE_OR_GROUP:
				return validateVersion_Reference_OrGroup((Version_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR:
				return validateCharSequence_And_BitOperator((CharSequence_And_BitOperator)value, diagnostics, context);
			case QmmPackage.OR_GROUP:
				return validateOrGroup((OrGroup)value, diagnostics, context);
			case QmmPackage.REFERENCE_OR_GROUP:
				return validateReference_OrGroup((Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.VERSION_CONTAINMENT_OR_GROUP:
				return validateVersion_Containment_OrGroup((Version_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateCharSequence_FunctionalOperator((CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TO_LOWER_CASE_FUNCTIONAL_OPERATOR:
				return validatetoLowerCase_FunctionalOperator((toLowerCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validatesmallerEquals_FunctionalOperator((smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredValue_AttrEClass((OrdinalScaledType_requiredValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR:
				return validateCharSequence_Or_BitOperator((CharSequence_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT:
				return validateBoolean_PrimitiveArgument((Boolean_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OPERATOR:
				return validateAttributeDataType_Operator((AttributeDataType_Operator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_OPERATOR:
				return validateDateTime_Operator((DateTime_Operator)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_REFERENCE_OR_GROUP:
				return validateSourceDocumentInformation_Reference_OrGroup((SourceDocumentInformation_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_REQUIREMENTS_REFERENCE_OR_GROUP:
				return validateRoleRequirements_Reference_OrGroup((RoleRequirements_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_ATTRIBUTE_ECLASS:
				return validateDateTime_AttributeEClass((DateTime_AttributeEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE:
				return validateInteger_Calculateable((Integer_Calculateable)value, diagnostics, context);
			case QmmPackage.ADDITIONAL_INFORMATION_CONTAINMENT_OR_GROUP:
				return validateAdditionalInformation_Containment_OrGroup((AdditionalInformation_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				return validateAttributeNameMapping_roleAttributeName_AttrEClass((AttributeNameMapping_roleAttributeName_AttrEClass)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER:
				return validateNumber_FunctionalParameter((Number_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER:
				return validateAttributeDataType_FunctionalParameter((AttributeDataType_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OPERATOR:
				return validateBoolean_Operator((Boolean_Operator)value, diagnostics, context);
			case QmmPackage.OBJECT_OPERATOR:
				return validateObject_Operator((Object_Operator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Integer_FunctionalOperator((InheritedFrom_Number_to_Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_TYPE:
				return validateObject_FunctionalType((Object_FunctionalType)value, diagnostics, context);
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR:
				return validateendsWith_FunctionalOperator((endsWith_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR:
				return validateOr_EvaluationBitOperator((Or_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.FIND_QUERY:
				return validateFindQuery((FindQuery)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_TYPE:
				return validateString_FunctionalType((String_FunctionalType)value, diagnostics, context);
			case QmmPackage.HASH_CODE_FUNCTIONAL_OPERATOR:
				return validatehashCode_FunctionalOperator((hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_equals_FunctionalOperator((Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_EVALUATION_OPERATION_ARGUMENT:
				return validateNumber_EvaluationOperation_Argument((Number_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.OFFSET_BY_CODE_POINTS_FUNCTIONAL_OPERATOR:
				return validateoffsetByCodePoints_FunctionalOperator((offsetByCodePoints_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateBoolean_Original_FunctionalOperator((Boolean_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_REFERENCE_OR_GROUP:
				return validateAttributeNameMapping_Reference_OrGroup((AttributeNameMapping_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.STRING_ARGUMENT:
				return validateString_Argument((String_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_toString_FunctionalOperator((Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT:
				return validateAttributeDataType_CalculateableElement((AttributeDataType_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator((CharSequence_String_Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INDEX_OF_CHAR_FUNCTIONAL_OPERATOR:
				return validateindexOfChar_FunctionalOperator((indexOfChar_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_LIB_REFERENCE_OR_GROUP:
				return validateInterfaceClassLib_Reference_OrGroup((InterfaceClassLib_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_TYPE:
				return validateDateTime_Type((DateTime_Type)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER:
				return validateString_CalculateableParameter((String_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_SCHEMA_VERSION_ATTR_ECLASS:
				return validateCAEXFile_schemaVersion_AttrEClass((CAEXFile_schemaVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EVALUATION_OPERATION_ARGUMENT:
				return validateBoolean_EvaluationOperation_Argument((Boolean_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharSequence_Original_FunctionalOperator((CharSequence_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OPERATOR:
				return validateCharSequence_Operator((CharSequence_Operator)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER:
				return validateCharacter_CalculateableParameter((Character_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_TYPE:
				return validateDouble_FunctionalType((Double_FunctionalType)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_UNIT_ATTR_ECLASS:
				return validateAttribute_unit_AttrEClass((Attribute_unit_AttrEClass)value, diagnostics, context);
			case QmmPackage.DATE_TIME_EXPRESSION_OPERATOR:
				return validateDateTime_ExpressionOperator((DateTime_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ELEMENT_REFERENCE_OR_GROUP:
				return validateElement_Reference_OrGroup((Element_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ARGUMENT:
				return validateAttributeDataType_Argument((AttributeDataType_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_equals_FunctionalOperator((Object_Boolean_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER:
				return validateAttributeDataType_CalculateableParameter((AttributeDataType_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_CALCULATEABLE:
				return validateChangeMode_Calculateable((ChangeMode_Calculateable)value, diagnostics, context);
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR:
				return validateDouble_And_BitOperator((Double_And_BitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_EVALUATION_OPERATION_ARGUMENT:
				return validateCharacter_EvaluationOperation_Argument((Character_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.ROOT_CLASS:
				return validateRootClass((RootClass)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Boolean_FunctionalOperator((InheritedFrom_Object_to_Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_CONTAINMENT_OR_GROUP:
				return validateInterfaceClass_Containment_OrGroup((InterfaceClass_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_OPERATOR:
				return validateChangeMode_Operator((ChangeMode_Operator)value, diagnostics, context);
			case QmmPackage.INTERFACE_FAMILY_REFERENCE_OR_GROUP:
				return validateInterfaceFamily_Reference_OrGroup((InterfaceFamily_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.VERSION_VALUE_ATTR_ECLASS:
				return validateVersion_value_AttrEClass((Version_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_REFERENCE_OR_GROUP:
				return validateExternalReferenceType_Reference_OrGroup((ExternalReferenceType_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_CONTAINMENT_OR_GROUP:
				return validateGenericElement_Containment_OrGroup((GenericElement_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DOUBLE_EVALUATION_OPERATION_ARGUMENT:
				return validateDouble_EvaluationOperation_Argument((Double_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_OPERATOR:
				return validateString_FunctionalOperator((String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC_REFERENCE_OR_GROUP:
				return validateRefSemantic_Reference_OrGroup((RefSemantic_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.REVISION_NEW_VERSION_ATTR_ECLASS:
				return validateRevision_newVersion_AttrEClass((Revision_newVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_BIT_OPERATOR:
				return validateInteger_BitOperator((Integer_BitOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_ATTR_ECLASS:
				return validateAttribute_value_AttrEClass((Attribute_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_BIT_OPERATOR:
				return validateBoolean_BitOperator((Boolean_BitOperator)value, diagnostics, context);
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS:
				return validateRegularAttributeEClass((RegularAttributeEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_NAME_ATTR_ECLASS:
				return validateAttributeValueRequirement_name_AttrEClass((AttributeValueRequirement_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.EXTERNAL_INTERFACE_REFERENCE_OR_GROUP:
				return validateExternalInterface_Reference_OrGroup((ExternalInterface_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VERSION_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVersion_AttrEClass((SourceDocumentInformation_originVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT:
				return validateCharSequence_EvaluationOperation_Argument((CharSequence_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS_REFERENCE_OR_GROUP:
				return validateSupportedRoleClass_Reference_OrGroup((SupportedRoleClass_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR:
				return validatecontains_FunctionalOperator((contains_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVendorURL_AttrEClass((SourceDocumentInformation_originVendorURL_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_RELEASE_ATTR_ECLASS:
				return validateSourceDocumentInformation_originRelease_AttrEClass((SourceDocumentInformation_originRelease_AttrEClass)value, diagnostics, context);
			case QmmPackage.CONTAINMENT_OR_GROUP:
				return validateContainment_OrGroup((Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.EXPRESSION_OPERATOR:
				return validateExpressionOperator((ExpressionOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_ARGUMENT:
				return validateDateTime_Argument((DateTime_Argument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_TYPE:
				return validateAttributeDataType_Type((AttributeDataType_Type)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_OPERATOR:
				return validateInteger_FunctionalOperator((Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_NAME_ATTR_ECLASS:
				return validateSourceDocumentInformation_originName_AttrEClass((SourceDocumentInformation_originName_AttrEClass)value, diagnostics, context);
			case QmmPackage.ENUMERATION_OPERATOR:
				return validateEnumerationOperator((EnumerationOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_LIB_REFERENCE_OR_GROUP:
				return validateAttributeLib_Reference_OrGroup((AttributeLib_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateDateTime_CalculateableElementReferenceArgument((DateTime_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.VERSION_CHANGE_MODE_ATTR_ECLASS:
				return validateVersion_changeMode_AttrEClass((Version_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER:
				return validateEFeatureMapEntry_CalculateableParameter((EFeatureMapEntry_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_CONTAINMENT_OR_GROUP:
				return validateSystemUnitClass_Containment_OrGroup((SystemUnitClass_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER:
				return validateCharSequence_CalculateableParameter((CharSequence_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator((CharSequence_String_Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_AND_BIT_OPERATOR:
				return validateString_And_BitOperator((String_And_BitOperator)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE_REQUIREMENTS_ATTR_ECLASS:
				return validateUnknownType_requirements_AttrEClass((UnknownType_requirements_AttrEClass)value, diagnostics, context);
			case QmmPackage.GENERIC_ATTRIBUTE_REFERENCE_OR_GROUP:
				return validateGenericAttribute_Reference_OrGroup((GenericAttribute_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE_CONTAINMENT_OR_GROUP:
				return validateNominalScaledType_Containment_OrGroup((NominalScaledType_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Number_FunctionalOperator((InheritedFrom_Object_to_Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateInterfaceClass_refBaseClassPath_AttrEClass((InterfaceClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_REFERENCE_OR_GROUP:
				return validateGenericElement_Reference_OrGroup((GenericElement_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_ARGUMENT:
				return validateNumber_Argument((Number_Argument)value, diagnostics, context);
			case QmmPackage.STARTS_WITH_FUNCTIONAL_OPERATOR:
				return validatestartsWith_FunctionalOperator((startsWith_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_OPERATOR:
				return validateString_Operator((String_Operator)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateString_CalculateableElementReferenceArgument((String_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DEFAULT_VALUE_ATTR_ECLASS:
				return validateAttribute_defaultValue_AttrEClass((Attribute_defaultValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EXPRESSION_OPERATOR:
				return validateBoolean_ExpressionOperator((Boolean_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR:
				return validatesubstring_FunctionalOperator((substring_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE_REFERENCE_OR_GROUP:
				return validateNominalScaledType_Reference_OrGroup((NominalScaledType_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT:
				return validateCharSequence_PrimitiveArgument((CharSequence_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.COUNT_AGGREGATION_OPERATOR:
				return validateCount_AggregationOperator((Count_AggregationOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_toString_FunctionalOperator((Number_Double_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_REFERENCE_OR_GROUP:
				return validateAttribute_Reference_OrGroup((Attribute_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_PRIMITIVE_ARGUMENT:
				return validateAttributeDataType_PrimitiveArgument((AttributeDataType_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT_CONTAINMENT_OR_GROUP:
				return validateCAEXBasicObject_Containment_OrGroup((CAEXBasicObject_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CODE_POINT_AT_FUNCTIONAL_OPERATOR:
				return validatecodePointAt_FunctionalOperator((codePointAt_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NEGATABLE_ELEMENT:
				return validateNegatableElement((NegatableElement)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_ARGUMENT:
				return validateEFeatureMapEntry_Argument((EFeatureMapEntry_Argument)value, diagnostics, context);
			case QmmPackage.STRING_EVALUATION_OPERATION_ARGUMENT:
				return validateString_EvaluationOperation_Argument((String_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_OPERATOR:
				return validateNumber_FunctionalOperator((Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_VALUE_ATTR_ECLASS:
				return validateDescription_value_AttrEClass((Description_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_ID_ATTR_ECLASS:
				return validateSourceDocumentInformation_originID_AttrEClass((SourceDocumentInformation_originID_AttrEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_ARGUMENT:
				return validateDouble_Argument((Double_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_TYPE:
				return validateInteger_FunctionalType((Integer_FunctionalType)value, diagnostics, context);
			case QmmPackage.GENERALIZABLE_ELEMENT:
				return validateGeneralizableElement((GeneralizableElement)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_TYPE:
				return validateEFeatureMapEntry_FunctionalType((EFeatureMapEntry_FunctionalType)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_PARAMETER:
				return validateDateTime_FunctionalParameter((DateTime_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.DATE_TIME_EVALUATION_OPERATION_ARGUMENT:
				return validateDateTime_EvaluationOperation_Argument((DateTime_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.REVISION_CONTAINMENT_OR_GROUP:
				return validateRevision_Containment_OrGroup((Revision_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.MIN_AGGREGATION_OPERATOR_DOUBLE:
				return validateMin_AggregationOperator_Double((Min_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT_CONTAINMENT_OR_GROUP:
				return validateInternalElement_Containment_OrGroup((InternalElement_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_OPERATOR:
				return validateFunctionalOperator((FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_hashCode_FunctionalOperator((Object_CharSequence_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR:
				return validateBoolean_And_BitOperator((Boolean_And_BitOperator)value, diagnostics, context);
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR:
				return validateisEmpty_FunctionalOperator((isEmpty_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_CharSequence_FunctionalOperator((InheritedFrom_Object_to_CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER:
				return validateString_FunctionalParameter((String_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_LIB_CONTAINMENT_OR_GROUP:
				return validateInterfaceClassLib_Containment_OrGroup((InterfaceClassLib_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_VALUE_ATTR_ECLASS:
				return validateCopyright_value_AttrEClass((Copyright_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validategreaterThan_FunctionalOperator((greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB_REFERENCE_OR_GROUP:
				return validateSystemUnitClassLib_Reference_OrGroup((SystemUnitClassLib_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateBoolean_FunctionalOperator((Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EXPRESSION_OPERATOR:
				return validateAttributeDataType_ExpressionOperator((AttributeDataType_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.STRING_ATTRIBUTE_ECLASS:
				return validateString_AttributeEClass((String_AttributeEClass)value, diagnostics, context);
			case QmmPackage.STARTS_WITH_OFFSET_FUNCTIONAL_OPERATOR:
				return validatestartsWithOffset_FunctionalOperator((startsWithOffset_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR:
				return validateindexOfString_FunctionalOperator((indexOfString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterThan_FunctionalOperator((Number_Integer_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS:
				return validateNominalScaledType_requiredValue_AttrEClass((NominalScaledType_requiredValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ARGUMENT:
				return validateBoolean_Argument((Boolean_Argument)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT_REFERENCE_OR_GROUP:
				return validateDocumentRoot_Reference_OrGroup((DocumentRoot_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_ECLASS:
				return validateAttributeEClass((AttributeEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateAttributeDataType_CalculateableElementReferenceArgument((AttributeDataType_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return validateSourceDocumentInformation_lastWritingDateTime_AttrEClass((SourceDocumentInformation_lastWritingDateTime_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTEGER_AND_BIT_OPERATOR:
				return validateInteger_And_BitOperator((Integer_And_BitOperator)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT_CHANGE_MODE_ATTR_ECLASS:
				return validateCAEXBasicObject_changeMode_AttrEClass((CAEXBasicObject_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR:
				return validateDouble_Or_BitOperator((Double_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case QmmPackage.ELEMENT_NAME_ATTR_ECLASS:
				return validateElement_name_AttrEClass((Element_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.DOUBLE_TYPE:
				return validateDouble_Type((Double_Type)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_REFERENCE_OR_GROUP:
				return validateRoleClass_Reference_OrGroup((RoleClass_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return validateSourceDocumentInformation_originProjectID_AttrEClass((SourceDocumentInformation_originProjectID_AttrEClass)value, diagnostics, context);
			case QmmPackage.STRING_BIT_OPERATOR:
				return validateString_BitOperator((String_BitOperator)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_CONTAINMENT_OR_GROUP:
				return validateRoleClass_Containment_OrGroup((RoleClass_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_EXPRESSION_OPERATOR:
				return validateCharacter_ExpressionOperator((Character_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_EXPRESSION_OPERATOR:
				return validateObject_ExpressionOperator((Object_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER:
				return validateObject_FunctionalParameter((Object_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE:
				return validateCharacter_Calculateable((Character_Calculateable)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_CharSequence_to_String_FunctionalOperator((InheritedFrom_CharSequence_to_String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER:
				return validateEFeatureMapEntry_FunctionalParameter((EFeatureMapEntry_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_hashCode_FunctionalOperator((Number_Integer_Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_OR_BIT_OPERATOR:
				return validateEFeatureMapEntry_Or_BitOperator((EFeatureMapEntry_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_EVALUATION_OPERATION_ARGUMENT:
				return validateInteger_EvaluationOperation_Argument((Integer_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_length_FunctionalOperator((CharSequence_String_length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_CONTAINMENT_OR_GROUP:
				return validateInterfaceIDMapping_Containment_OrGroup((InterfaceIDMapping_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR:
				return validateequalsIgnoreCase_FunctionalOperator((equalsIgnoreCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_CONTAINMENT_OR_GROUP:
				return validateAttributeNameMapping_Containment_OrGroup((AttributeNameMapping_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.REVISION_AUTHOR_NAME_ATTR_ECLASS:
				return validateRevision_authorName_AttrEClass((Revision_authorName_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR:
				return validateChangeMode_EnumerationOperator((ChangeMode_EnumerationOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_EXPRESSION_OPERATOR:
				return validateDouble_ExpressionOperator((Double_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_LIB_CONTAINMENT_OR_GROUP:
				return validateAttributeLib_Containment_OrGroup((AttributeLib_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT_CONTAINMENT_OR_GROUP:
				return validateDocumentRoot_Containment_OrGroup((DocumentRoot_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_LIB_CONTAINMENT_OR_GROUP:
				return validateRoleClassLib_Containment_OrGroup((RoleClassLib_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_FAMILY_CONTAINMENT_OR_GROUP:
				return validateRoleFamily_Containment_OrGroup((RoleFamily_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_BIT_OPERATOR:
				return validateObject_BitOperator((Object_BitOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_BIT_OPERATOR:
				return validateCharSequence_BitOperator((CharSequence_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER:
				return validateNumber_CalculateableParameter((Number_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE:
				return validateCalculateable((Calculateable)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_CONTAINMENT_OR_GROUP:
				return validateInternalLink_Containment_OrGroup((InternalLink_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT_MIXED_ATTR_ECLASS:
				return validateDocumentRoot_mixed_AttrEClass((DocumentRoot_mixed_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR:
				return validateCharacter_FunctionalOperator((Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.MAX_AGGREGATION_OPERATOR_INTEGER:
				return validateMax_AggregationOperator_Integer((Max_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_CHANGE_MODE_ATTR_ECLASS:
				return validateDescription_changeMode_AttrEClass((Description_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT:
				return validateNumber_PrimitiveArgument((Number_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Number_toString_FunctionalOperator((Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_TYPE:
				return validateCharSequence_Type((CharSequence_Type)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE:
				return validateDouble_Calculateable((Double_Calculateable)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				return validateCAEXFile_superiorStandardVersion_AttrEClass((CAEXFile_superiorStandardVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_FAMILY_REFERENCE_OR_GROUP:
				return validateAttributeFamily_Reference_OrGroup((AttributeFamily_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_TYPE:
				return validateCharacter_FunctionalType((Character_FunctionalType)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_TYPE:
				return validateNumber_FunctionalType((Number_FunctionalType)value, diagnostics, context);
			case QmmPackage.DOUBLE_VALUE_FUNCTIONAL_OPERATOR:
				return validatedoubleValue_FunctionalOperator((doubleValue_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_ATTRIBUTE_ECLASS:
				return validateChangeMode_AttributeEClass((ChangeMode_AttributeEClass)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_AATTR_ECLASS:
				return validateInternalLink_refPartnerSideA_AttrEClass((InternalLink_refPartnerSideA_AttrEClass)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_equals_FunctionalOperator((Number_Double_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateparseBoolean_FunctionalOperator((parseBoolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TO_UPPER_CASE_FUNCTIONAL_OPERATOR:
				return validatetoUpperCase_FunctionalOperator((toUpperCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_toString_FunctionalOperator((Object_Boolean_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.REVISION_COMMENT_ATTR_ECLASS:
				return validateRevision_comment_AttrEClass((Revision_comment_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_CONTAINMENT_OR_GROUP:
				return validateCAEXFile_Containment_OrGroup((CAEXFile_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE:
				return validateDateTime_Calculateable((DateTime_Calculateable)value, diagnostics, context);
			case QmmPackage.SUM_AGGREGATION_OPERATOR_INTEGER:
				return validateSum_AggregationOperator_Integer((Sum_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validategreaterEquals_FunctionalOperator((greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_BATTR_ECLASS:
				return validateInternalLink_refPartnerSideB_AttrEClass((InternalLink_refPartnerSideB_AttrEClass)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_PARAMETER:
				return validateCalculateableParameter((CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER:
				return validateCharacter_FunctionalParameter((Character_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.STRING_EXPRESSION_OPERATOR:
				return validateString_ExpressionOperator((String_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ROLE_FAMILY_REFERENCE_OR_GROUP:
				return validateRoleFamily_Reference_OrGroup((RoleFamily_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ATTRIBUTE_ECLASS:
				return validateAttributeDataType_AttributeEClass((AttributeDataType_AttributeEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return validateAttribute_attributeDataType_AttrEClass((Attribute_attributeDataType_AttrEClass)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_REFERENCE_OR_GROUP:
				return validateDescription_Reference_OrGroup((Description_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_ELEMENT:
				return validateCharSequence_CalculateableElement((CharSequence_CalculateableElement)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Number_hashCode_FunctionalOperator((Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE:
				return validateAttributeDataType_Calculateable((AttributeDataType_Calculateable)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_REFERENCE_OR_GROUP:
				return validateInterfaceIDMapping_Reference_OrGroup((InterfaceIDMapping_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerEquals_FunctionalOperator((Number_Integer_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_ARGUMENT:
				return validateFunctionalArgument((FunctionalArgument)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT_REFERENCE_OR_GROUP:
				return validateCAEXBasicObject_Reference_OrGroup((CAEXBasicObject_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return validateAttribute_refAttributeType_AttrEClass((Attribute_refAttributeType_AttrEClass)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_OPERATOR:
				return validateEFeatureMapEntry_Operator((EFeatureMapEntry_Operator)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validatecompareToString_FunctionalOperator((compareToString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT_REFERENCE_OR_GROUP:
				return validateInternalElement_Reference_OrGroup((InternalElement_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR:
				return validateCountingAggregationOperator((CountingAggregationOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_TYPE:
				return validateInteger_Type((Integer_Type)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredMinValue_AttrEClass((OrdinalScaledType_requiredMinValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR:
				return validateBoolean_Or_BitOperator((Boolean_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_TYPE:
				return validateAttributeDataType_FunctionalType((AttributeDataType_FunctionalType)value, diagnostics, context);
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR:
				return validateCharacter_Or_BitOperator((Character_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_ARGUMENT:
				return validateObject_Argument((Object_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateInteger_Original_FunctionalOperator((Integer_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER:
				return validateBoolean_FunctionalParameter((Boolean_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_OPERATOR:
				return validateNumber_Operator((Number_Operator)value, diagnostics, context);
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT:
				return validateDouble_PrimitiveArgument((Double_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_OPERATOR:
				return validateEFeatureMapEntry_FunctionalOperator((EFeatureMapEntry_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_STRING_IGNORE_CASE_FUNCTIONAL_OPERATOR:
				return validatecompareToStringIgnoreCase_FunctionalOperator((compareToStringIgnoreCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_REFERENCE_OR_GROUP:
				return validateInterfaceClass_Reference_OrGroup((InterfaceClass_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_OR_BIT_OPERATOR:
				return validateObject_Or_BitOperator((Object_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.ADDITIONAL_INFORMATION_REFERENCE_OR_GROUP:
				return validateAdditionalInformation_Reference_OrGroup((AdditionalInformation_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_ELEMENT:
				return validateNumber_CalculateableElement((Number_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DOUBLE_BIT_OPERATOR:
				return validateDouble_BitOperator((Double_BitOperator)value, diagnostics, context);
			case QmmPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case QmmPackage.PRIMITIVE_ARGUMENT:
				return validatePrimitiveArgument((PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT:
				return validateCountable_ReferenceArgument((Countable_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE:
				return validateObject_Calculateable((Object_Calculateable)value, diagnostics, context);
			case QmmPackage.BOOLEAN_TYPE:
				return validateBoolean_Type((Boolean_Type)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER:
				return validateCharSequence_FunctionalParameter((CharSequence_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CLASS_OPERATOR:
				return validateClassOperator((ClassOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER:
				return validateBoolean_CalculateableParameter((Boolean_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return validateSourceDocumentInformation_originProjectTitle_AttrEClass((SourceDocumentInformation_originProjectTitle_AttrEClass)value, diagnostics, context);
			case QmmPackage.NUMBER_OR_BIT_OPERATOR:
				return validateNumber_Or_BitOperator((Number_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.MAX_AGGREGATION_OPERATOR_DOUBLE:
				return validateMax_AggregationOperator_Double((Max_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_FAMILY_CONTAINMENT_OR_GROUP:
				return validateSystemUnitFamily_Containment_OrGroup((SystemUnitFamily_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterThan_FunctionalOperator((Number_Double_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_REFERENCE_OR_GROUP:
				return validateCopyright_Reference_OrGroup((Copyright_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT:
				return validateCharacter_PrimitiveArgument((Character_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateRoleClass_refBaseClassPath_AttrEClass((RoleClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_CONTAINMENT_OR_GROUP:
				return validateCopyright_Containment_OrGroup((Copyright_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OR_BIT_OPERATOR:
				return validateAttributeDataType_Or_BitOperator((AttributeDataType_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Double_FunctionalOperator((InheritedFrom_Number_to_Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT:
				return validateDateTime_CalculateableElement((DateTime_CalculateableElement)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_CONTAINMENT_OR_GROUP:
				return validateOrdinalScaledType_Containment_OrGroup((OrdinalScaledType_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_CONTAINMENT_OR_GROUP:
				return validateExternalReferenceType_Containment_OrGroup((ExternalReferenceType_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER:
				return validateInteger_FunctionalParameter((Integer_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_PATH_ATTR_ECLASS:
				return validateExternalReferenceType_path_AttrEClass((ExternalReferenceType_path_AttrEClass)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_hashCode_FunctionalOperator((Object_Boolean_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR:
				return validateAnd_EvaluationBitOperator((And_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validatesmallerThan_FunctionalOperator((smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_ELEMENT:
				return validateCharacter_CalculateableElement((Character_CalculateableElement)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_CONTAINMENT_OR_GROUP:
				return validateSourceDocumentInformation_Containment_OrGroup((SourceDocumentInformation_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_REFERENCE_OR_GROUP:
				return validateSystemUnitClass_Reference_OrGroup((SystemUnitClass_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_TYPE:
				return validateCharSequence_FunctionalType((CharSequence_FunctionalType)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_EXPRESSION_OPERATOR:
				return validateEFeatureMapEntry_ExpressionOperator((EFeatureMapEntry_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_CHANGE_MODE_ATTR_ECLASS:
				return validateCopyright_changeMode_AttrEClass((Copyright_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EVALUATION_OPERATION_ARGUMENT:
				return validateAttributeDataType_EvaluationOperation_Argument((AttributeDataType_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_EXPRESSION_OPERATOR:
				return validateInteger_ExpressionOperator((Integer_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Character_equals_FunctionalOperator((Object_Character_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_toString_FunctionalOperator((Number_Integer_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATION_ARGUMENT:
				return validateEvaluationOperation_Argument((EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_PRIMITIVE_ARGUMENT:
				return validateEFeatureMapEntry_PrimitiveArgument((EFeatureMapEntry_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return validateInterfaceIDMapping_systemUnitInterfaceID_AttrEClass((InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_PARAMETER:
				return validateDateTime_CalculateableParameter((DateTime_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT_REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return validateInternalElement_refBaseSystemUnitPath_AttrEClass((InternalElement_refBaseSystemUnitPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.EVALUATION_FUNCTIONAL_OPERATOR:
				return validateEvaluationFunctionalOperator((EvaluationFunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR:
				return validatecharAt_FunctionalOperator((charAt_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SUM_AGGREGATION_OPERATOR_DOUBLE:
				return validateSum_AggregationOperator_Double((Sum_AggregationOperator_Double)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateCalculateableElement_ReferenceArgument((CalculateableElement_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validatecompareToBoolean_FunctionalOperator((compareToBoolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EXPRESSION_OPERATOR:
				return validateCharSequence_ExpressionOperator((CharSequence_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_TYPE:
				return validateObject_Type((Object_Type)value, diagnostics, context);
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR:
				return validateequals_FunctionalOperator((equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER:
				return validateInteger_CalculateableParameter((Integer_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ARGUMENT:
				return validateCharSequence_Argument((CharSequence_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_AND_BIT_OPERATOR:
				return validateNumber_And_BitOperator((Number_And_BitOperator)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE:
				return validateString_Calculateable((String_Calculateable)value, diagnostics, context);
			case QmmPackage.CODE_POINT_BEFORE_FUNCTIONAL_OPERATOR:
				return validatecodePointBefore_FunctionalOperator((codePointBefore_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.REVISION_REFERENCE_OR_GROUP:
				return validateRevision_Reference_OrGroup((Revision_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerThan_FunctionalOperator((Number_Double_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateEFeatureMapEntry_CalculateableElementReferenceArgument((EFeatureMapEntry_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterEquals_FunctionalOperator((Number_Integer_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_REFERENCE_OR_GROUP:
				return validateInternalLink_Reference_OrGroup((InternalLink_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_OPERATOR:
				return validateDouble_FunctionalOperator((Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.AGGREGATION_OPERATOR:
				return validateAggregationOperator((AggregationOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_CONTAINMENT_OR_GROUP:
				return validateAttribute_Containment_OrGroup((Attribute_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_BIT_OPERATOR:
				return validateAttributeDataType_BitOperator((AttributeDataType_BitOperator)value, diagnostics, context);
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR:
				return validateconcat_FunctionalOperator((concat_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ARGUMENT:
				return validateArgument((Argument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_AND_BIT_OPERATOR:
				return validateEFeatureMapEntry_And_BitOperator((EFeatureMapEntry_And_BitOperator)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_FAMILY_REFERENCE_OR_GROUP:
				return validateSystemUnitFamily_Reference_OrGroup((SystemUnitFamily_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_ELEMENT:
				return validateObject_CalculateableElement((Object_CalculateableElement)value, diagnostics, context);
			case QmmPackage.NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateNumber_Original_FunctionalOperator((Number_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS_CONTAINMENT_OR_GROUP:
				return validateSupportedRoleClass_Containment_OrGroup((SupportedRoleClass_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERFACE_FAMILY_CONTAINMENT_OR_GROUP:
				return validateInterfaceFamily_Containment_OrGroup((InterfaceFamily_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_OPERATOR:
				return validateAttributeDataType_FunctionalOperator((AttributeDataType_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE:
				return validateBoolean_Calculateable((Boolean_Calculateable)value, diagnostics, context);
			case QmmPackage.ROLE_REQUIREMENTS_CONTAINMENT_OR_GROUP:
				return validateRoleRequirements_Containment_OrGroup((RoleRequirements_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.REVISION_OLD_VERSION_ATTR_ECLASS:
				return validateRevision_oldVersion_AttrEClass((Revision_oldVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.REFERENCE_ARGUMENT:
				return validateReferenceArgument((ReferenceArgument)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Number_equals_FunctionalOperator((Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerThan_FunctionalOperator((Number_Integer_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterEquals_FunctionalOperator((Number_Double_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB_CONTAINMENT_OR_GROUP:
				return validateSystemUnitClassLib_Containment_OrGroup((SystemUnitClassLib_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_CONTAINMENT_OR_GROUP:
				return validateAttributeValueRequirement_Containment_OrGroup((AttributeValueRequirement_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.STRING_OR_BIT_OPERATOR:
				return validateString_Or_BitOperator((String_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_REFERENCE_OR_GROUP:
				return validateCAEXObject_Reference_OrGroup((CAEXObject_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.INTEGER_OR_BIT_OPERATOR:
				return validateInteger_Or_BitOperator((Integer_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_OPERATOR:
				return validateDouble_Operator((Double_Operator)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_REFERENCE_OR_GROUP:
				return validateCAEXFile_Reference_OrGroup((CAEXFile_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_TYPE:
				return validateDateTime_FunctionalType((DateTime_FunctionalType)value, diagnostics, context);
			case QmmPackage.MAPPING_REFERENCE_OR_GROUP:
				return validateMapping_Reference_OrGroup((Mapping_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_CALCULATEABLE_ELEMENT:
				return validateChangeMode_CalculateableElement((ChangeMode_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DATE_TIME_OR_BIT_OPERATOR:
				return validateDateTime_Or_BitOperator((DateTime_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_FILE_NAME_ATTR_ECLASS:
				return validateCAEXFile_fileName_AttrEClass((CAEXFile_fileName_AttrEClass)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_ELEMENT:
				return validateBoolean_CalculateableElement((Boolean_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator((CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ARGUMENT:
				return validateCalculateable_Argument((Calculateable_Argument)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_LIB_REFERENCE_OR_GROUP:
				return validateRoleClassLib_Reference_OrGroup((RoleClassLib_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.MIN_AGGREGATION_OPERATOR_INTEGER:
				return validateMin_AggregationOperator_Integer((Min_AggregationOperator_Integer)value, diagnostics, context);
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT:
				return validateInteger_PrimitiveArgument((Integer_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC_CONTAINMENT_OR_GROUP:
				return validateRefSemantic_Containment_OrGroup((RefSemantic_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharacter_Original_FunctionalOperator((Character_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE:
				return validateCharSequence_Calculateable((CharSequence_Calculateable)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT:
				return validateInteger_CalculateableElement((Integer_CalculateableElement)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR:
				return validateEFeatureMapEntry_BitOperator((EFeatureMapEntry_BitOperator)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REFERENCE_OR_GROUP:
				return validateOrdinalScaledType_Reference_OrGroup((OrdinalScaledType_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.FIND_QUERY_COLLECTION:
				return validateFindQueryCollection((FindQueryCollection)value, diagnostics, context);
			case QmmPackage.REVISION_REVISION_DATE_ATTR_ECLASS:
				return validateRevision_revisionDate_AttrEClass((Revision_revisionDate_AttrEClass)value, diagnostics, context);
			case QmmPackage.OBJECT_AND_BIT_OPERATOR:
				return validateObject_And_BitOperator((Object_And_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT:
				return validateObject_PrimitiveArgument((Object_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.SELECT_CLAUSE:
				return validateSelectClause((SelectClause)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_ELEMENT:
				return validateDouble_CalculateableElement((Double_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DATE_TIME_AND_BIT_OPERATOR:
				return validateDateTime_And_BitOperator((DateTime_And_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE:
				return validateNumber_Calculateable((Number_Calculateable)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER:
				return validateDouble_CalculateableParameter((Double_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE:
				return validateEFeatureMapEntry_Calculateable((EFeatureMapEntry_Calculateable)value, diagnostics, context);
			case QmmPackage.INTEGER_OPERATOR:
				return validateInteger_Operator((Integer_Operator)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_CONTAINMENT_OR_GROUP:
				return validateDescription_Containment_OrGroup((Description_Containment_OrGroup)value, diagnostics, context);
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR:
				return validatelength_FunctionalOperator((length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS_REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return validateSupportedRoleClass_refRoleClassPath_AttrEClass((SupportedRoleClass_refRoleClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE_REFERENCE_OR_GROUP:
				return validateUnknownType_Reference_OrGroup((UnknownType_Reference_OrGroup)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_HASH_CODE_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_hashCode_FunctionalOperator((Number_Double_Object_Number_hashCode_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ENUMERATION_ATTRIBUTE_ECLASS:
				return validateEnumerationAttributeEClass((EnumerationAttributeEClass)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT:
				return validateString_CalculateableElement((String_CalculateableElement)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_TYPE:
				return validateFunctionalType((FunctionalType)value, diagnostics, context);
			case QmmPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_PARAMETER:
				return validateFunctionalParameter((FunctionalParameter)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				return validateAttributeNameMapping_systemUnitAttributeName_AttrEClass((AttributeNameMapping_systemUnitAttributeName_AttrEClass)value, diagnostics, context);
			case QmmPackage.STRING_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateString_Original_FunctionalOperator((String_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE:
				return validateChangeMode((ChangeMode)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE:
				return validateAttributeDataType((String)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_OBJECT:
				return validateChangeModeObject((Enumerator)value, diagnostics, context);
			case QmmPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE:
				return validateCharSequence((CharSequence)value, diagnostics, context);
			case QmmPackage.NUMBER:
				return validateNumber((Number)value, diagnostics, context);
			case QmmPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			case QmmPackage.CHARACTER:
				return validateCharacter((Character)value, diagnostics, context);
			case QmmPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			case QmmPackage.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case QmmPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily(AttributeFamily attributeFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeFamily_validate(attributeFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily_validate(AttributeFamily attributeFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping(AttributeNameMapping attributeNameMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeNameMapping_validate(attributeNameMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_validate(AttributeNameMapping attributeNameMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeNameMapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_validate(attribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_validate(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attribute.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib(AttributeLib attributeLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeLib_validate(attributeLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_validate(AttributeLib attributeLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement(AttributeValueRequirement attributeValueRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeValueRequirement_validate(attributeValueRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_validate(AttributeValueRequirement attributeValueRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeValueRequirement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject(CAEXBasicObject caexBasicObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexBasicObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXBasicObject_validate(caexBasicObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_validate(CAEXBasicObject caexBasicObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexBasicObject.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile(CAEXFile caexFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXFile_validate(caexFile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_validate(CAEXFile caexFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexFile.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject(CAEXObject caexObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXObject_validate(caexObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_validate(CAEXObject caexObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexObject.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateDocumentRoot_validate(documentRoot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_validate(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return documentRoot.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface(ExternalInterface externalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalInterface_validate(externalInterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_validate(ExternalInterface externalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalInterface.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReferenceType_validate(externalReferenceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_validate(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReferenceType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy(InstanceHierarchy instanceHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceHierarchy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceHierarchy_validate(instanceHierarchy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_validate(InstanceHierarchy instanceHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceHierarchy.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib(InterfaceClassLib interfaceClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClassLib_validate(interfaceClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_validate(InterfaceClassLib interfaceClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass(InterfaceClass interfaceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClass_validate(interfaceClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_validate(InterfaceClass interfaceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily(InterfaceFamily interfaceFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceFamily_validate(interfaceFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily_validate(InterfaceFamily interfaceFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping(InterfaceIDMapping interfaceIDMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceIDMapping_validate(interfaceIDMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_validate(InterfaceIDMapping interfaceIDMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceIDMapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement(InternalElement internalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalElement_validate(internalElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_validate(InternalElement internalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink(InternalLink internalLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalLink_validate(internalLink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_validate(InternalLink internalLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalLink.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateMapping_validate(mapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_validate(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType(NominalScaledType nominalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNominalScaledType_validate(nominalScaledType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Nominal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_validate(NominalScaledType nominalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return nominalScaledType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType(OrdinalScaledType ordinalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrdinalScaledType_validate(ordinalScaledType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ordinal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_validate(OrdinalScaledType ordinalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ordinalScaledType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic(RefSemantic refSemantic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefSemantic_validate(refSemantic, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_validate(RefSemantic refSemantic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refSemantic.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib(RoleClassLib roleClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClassLib_validate(roleClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_validate(RoleClassLib roleClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass(RoleClass roleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClass_validate(roleClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_validate(RoleClass roleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily(RoleFamily roleFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleFamily_validate(roleFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily_validate(RoleFamily roleFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements(RoleRequirements roleRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleRequirements, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleRequirements_validate(roleRequirements, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_validate(RoleRequirements roleRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleRequirements.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation(SourceDocumentInformation sourceDocumentInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourceDocumentInformation_validate(sourceDocumentInformation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_validate(SourceDocumentInformation sourceDocumentInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sourceDocumentInformation.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass(SupportedRoleClass supportedRoleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupportedRoleClass_validate(supportedRoleClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_validate(SupportedRoleClass supportedRoleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportedRoleClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib(SystemUnitClassLib systemUnitClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClassLib_validate(systemUnitClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_validate(SystemUnitClassLib systemUnitClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass(SystemUnitClass systemUnitClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClass_validate(systemUnitClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_validate(SystemUnitClass systemUnitClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily(SystemUnitFamily systemUnitFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitFamily_validate(systemUnitFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily_validate(SystemUnitFamily systemUnitFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType(UnknownType unknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnknownType_validate(unknownType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_validate(UnknownType unknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unknownType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright(Copyright copyright, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyright_validate(copyright, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_validate(Copyright copyright, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyright.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_validate(description, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_validate(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return description.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validateRevision_validate(revision, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_validate(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return revision.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_validate(version, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_validate(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return version.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation(AdditionalInformation additionalInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(additionalInformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdditionalInformation_validate(additionalInformation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_validate(AdditionalInformation additionalInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return additionalInformation.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validate(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_validate(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement(GenericElement genericElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericElement_validate(genericElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_validate(GenericElement genericElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute(GenericAttribute genericAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericAttribute_validate(genericAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_validate(GenericAttribute genericAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericAttribute.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_And_BitOperator(AttributeDataType_And_BitOperator attributeDataType_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object_Character_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_AttributeEClass(EFeatureMapEntry_AttributeEClass eFeatureMapEntry_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_AttributeEClass_validate(EFeatureMapEntry_AttributeEClass eFeatureMapEntry_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass ordinalScaledType_requiredMaxValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_Reference_OrGroup(InstanceHierarchy_Reference_OrGroup instanceHierarchy_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceHierarchy_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceHierarchy_Reference_OrGroup_validate(instanceHierarchy_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Instance Hierarchy Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_Reference_OrGroup_validate(InstanceHierarchy_Reference_OrGroup instanceHierarchy_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceHierarchy_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_name_AttrEClass(CAEXObject_name_AttrEClass caexObject_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexObject_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Argument(Character_Argument character_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitOperator(BitOperator bitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationBitOperator(EvaluationBitOperator evaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_elementFeatureMap_AttrEClass(GenericElement_elementFeatureMap_AttrEClass genericElement_elementFeatureMap_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_elementFeatureMap_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_Containment_OrGroup(ExternalInterface_Containment_OrGroup externalInterface_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalInterface_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalInterface_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(externalInterface_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_value_AttrEClass(Element_value_AttrEClass element_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(element_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_iD_AttrEClass(CAEXObject_iD_AttrEClass caexObject_iD_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_iD_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexObject_iD_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperator(EvaluationOperator evaluationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_CalculateableParameter_validate(object_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter_validate(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_Reference_OrGroup(AttributeValueRequirement_Reference_OrGroup attributeValueRequirement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeValueRequirement_Reference_OrGroup_validate(attributeValueRequirement_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Value Requirement Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_Reference_OrGroup_validate(AttributeValueRequirement_Reference_OrGroup attributeValueRequirement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeValueRequirement_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator inheritedFrom_Object_to_Character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalOperator(Object_FunctionalOperator object_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_Containment_OrGroup(InstanceHierarchy_Containment_OrGroup instanceHierarchy_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceHierarchy_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(instanceHierarchy_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable(Countable countable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_BitOperator(Number_BitOperator number_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_correspondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass refSemantic_correspondingAttributePath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_hashCode_FunctionalOperator(Object_Character_hashCode_FunctionalOperator object_Character_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator number_Integer_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator integerParseInt_ClassOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerParseInt_ClassOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Containment_OrGroup(Element_Containment_OrGroup element_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(element_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_Containment_OrGroup(GenericAttribute_Containment_OrGroup genericAttribute_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericAttribute_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericAttribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(genericAttribute_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_PrimitiveArgument(DateTime_PrimitiveArgument dateTime_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalType(Boolean_FunctionalType boolean_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElement(EFeatureMapEntry_CalculateableElement eFeatureMapEntry_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_BitOperator(DateTime_BitOperator dateTime_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatingAggregationOperator(CalculatingAggregationOperator calculatingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetrim_FunctionalOperator(trim_FunctionalOperator trim_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trim_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Type(EFeatureMapEntry_Type eFeatureMapEntry_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_FunctionalParameter_validate(double_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter_validate(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Type(Character_Type character_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoString_FunctionalOperator(toString_FunctionalOperator toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily_Containment_OrGroup(AttributeFamily_Containment_OrGroup attributeFamily_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeFamily_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeFamily_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_refBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass systemUnitClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountableReferenceParameter(CountableReferenceParameter countableReferenceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countableReferenceParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_attributeFeatureMap_AttrEClass(GenericElement_attributeFeatureMap_AttrEClass genericElement_attributeFeatureMap_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfCharFromIndex_FunctionalOperator(indexOfCharFromIndex_FunctionalOperator indexOfCharFromIndex_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfCharFromIndex_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Type(String_Type string_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator double_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Operator(Character_Operator character_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator number_Double_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_And_BitOperator(Character_And_BitOperator character_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_roleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass interfaceIDMapping_roleInterfaceID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_ExpressionOperator(Number_ExpressionOperator number_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalOperator(DateTime_FunctionalOperator dateTime_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_Containment_OrGroup(CAEXObject_Containment_OrGroup caexObject_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(caexObject_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass sourceDocumentInformation_originVendor_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Argument(Integer_Argument integer_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_Containment_OrGroup(Mapping_Containment_OrGroup mapping_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(mapping_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_BitOperator(Character_BitOperator character_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_Containment_OrGroup(UnknownType_Containment_OrGroup unknownType_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(unknownType_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_alias_AttrEClass(ExternalReferenceType_alias_AttrEClass externalReferenceType_alias_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_alias_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(externalReferenceType_alias_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_EvaluationOperation_Argument(EFeatureMapEntry_EvaluationOperation_Argument eFeatureMapEntry_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement(CalculateableElement calculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_PrimitiveArgument(String_PrimitiveArgument string_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Type(Number_Type number_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Reference_OrGroup(Version_Reference_OrGroup version_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_Reference_OrGroup_validate(version_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Version Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Reference_OrGroup_validate(Version_Reference_OrGroup version_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return version_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_And_BitOperator(CharSequence_And_BitOperator charSequence_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(orGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup_validate(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return orGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_OrGroup(Reference_OrGroup reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Containment_OrGroup(Version_Containment_OrGroup version_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(version_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalOperator(CharSequence_FunctionalOperator charSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoLowerCase_FunctionalOperator(toLowerCase_FunctionalOperator toLowerCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toLowerCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass ordinalScaledType_requiredValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Or_BitOperator(CharSequence_Or_BitOperator charSequence_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_PrimitiveArgument(Boolean_PrimitiveArgument boolean_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Operator(AttributeDataType_Operator attributeDataType_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Operator(DateTime_Operator dateTime_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_Reference_OrGroup(SourceDocumentInformation_Reference_OrGroup sourceDocumentInformation_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourceDocumentInformation_Reference_OrGroup_validate(sourceDocumentInformation_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Source Document Information Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_Reference_OrGroup_validate(SourceDocumentInformation_Reference_OrGroup sourceDocumentInformation_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sourceDocumentInformation_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_Reference_OrGroup(RoleRequirements_Reference_OrGroup roleRequirements_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleRequirements_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleRequirements_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleRequirements_Reference_OrGroup_validate(roleRequirements_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Requirements Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_Reference_OrGroup_validate(RoleRequirements_Reference_OrGroup roleRequirements_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleRequirements_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_AttributeEClass(DateTime_AttributeEClass dateTime_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(dateTime_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_AttributeEClass_validate(DateTime_AttributeEClass dateTime_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Calculateable(Integer_Calculateable integer_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_Containment_OrGroup(AdditionalInformation_Containment_OrGroup additionalInformation_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(additionalInformation_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(additionalInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(additionalInformation_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_roleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass attributeNameMapping_roleAttributeName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_FunctionalParameter_validate(number_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter_validate(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalParameter(AttributeDataType_FunctionalParameter attributeDataType_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_FunctionalParameter_validate(attributeDataType_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalParameter_validate(AttributeDataType_FunctionalParameter attributeDataType_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Operator(Boolean_Operator boolean_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Operator(Object_Operator object_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator inheritedFrom_Number_to_Integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalType(Object_FunctionalType object_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateendsWith_FunctionalOperator(endsWith_FunctionalOperator endsWith_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endsWith_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr_EvaluationBitOperator(Or_EvaluationBitOperator or_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindQuery(FindQuery findQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalType(String_FunctionalType string_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatehashCode_FunctionalOperator(hashCode_FunctionalOperator hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument number_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateoffsetByCodePoints_FunctionalOperator(offsetByCodePoints_FunctionalOperator offsetByCodePoints_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offsetByCodePoints_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator boolean_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_Reference_OrGroup(AttributeNameMapping_Reference_OrGroup attributeNameMapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeNameMapping_Reference_OrGroup_validate(attributeNameMapping_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Name Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_Reference_OrGroup_validate(AttributeNameMapping_Reference_OrGroup attributeNameMapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeNameMapping_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Argument(String_Argument string_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElement(AttributeDataType_CalculateableElement attributeDataType_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator charSequence_String_Object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfChar_FunctionalOperator(indexOfChar_FunctionalOperator indexOfChar_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfChar_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_Reference_OrGroup(InterfaceClassLib_Reference_OrGroup interfaceClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClassLib_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClassLib_Reference_OrGroup_validate(interfaceClassLib_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_Reference_OrGroup_validate(InterfaceClassLib_Reference_OrGroup interfaceClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClassLib_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Type(DateTime_Type dateTime_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableParameter_validate(string_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter_validate(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_schemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass caexFile_schemaVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_schemaVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument boolean_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator charSequence_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Operator(CharSequence_Operator charSequence_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_CalculateableParameter_validate(character_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter_validate(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalType(Double_FunctionalType double_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_unit_AttrEClass(Attribute_unit_AttrEClass attribute_unit_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_unit_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_unit_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_ExpressionOperator(DateTime_ExpressionOperator dateTime_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Reference_OrGroup(Element_Reference_OrGroup element_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_Reference_OrGroup_validate(element_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Reference_OrGroup_validate(Element_Reference_OrGroup element_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Argument(AttributeDataType_Argument attributeDataType_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object_Boolean_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableParameter(AttributeDataType_CalculateableParameter attributeDataType_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_CalculateableParameter_validate(attributeDataType_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableParameter_validate(AttributeDataType_CalculateableParameter attributeDataType_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_Calculateable(ChangeMode_Calculateable changeMode_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_And_BitOperator(Double_And_BitOperator double_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument character_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootClass(RootClass rootClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rootClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rootClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(rootClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator inheritedFrom_Object_to_Boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_Containment_OrGroup(InterfaceClass_Containment_OrGroup interfaceClass_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceClass_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_Operator(ChangeMode_Operator changeMode_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily_Reference_OrGroup(InterfaceFamily_Reference_OrGroup interfaceFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceFamily_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceFamily_Reference_OrGroup_validate(interfaceFamily_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily_Reference_OrGroup_validate(InterfaceFamily_Reference_OrGroup interfaceFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceFamily_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_value_AttrEClass(Version_value_AttrEClass version_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(version_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_Reference_OrGroup(ExternalReferenceType_Reference_OrGroup externalReferenceType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReferenceType_Reference_OrGroup_validate(externalReferenceType_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Reference Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_Reference_OrGroup_validate(ExternalReferenceType_Reference_OrGroup externalReferenceType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReferenceType_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_Containment_OrGroup(GenericElement_Containment_OrGroup genericElement_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(genericElement_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument double_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalOperator(String_FunctionalOperator string_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_Reference_OrGroup(RefSemantic_Reference_OrGroup refSemantic_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefSemantic_Reference_OrGroup_validate(refSemantic_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ref Semantic Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_Reference_OrGroup_validate(RefSemantic_Reference_OrGroup refSemantic_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refSemantic_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_newVersion_AttrEClass(Revision_newVersion_AttrEClass revision_newVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_newVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_newVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_BitOperator(Integer_BitOperator integer_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_value_AttrEClass(Attribute_value_AttrEClass attribute_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_BitOperator(Boolean_BitOperator boolean_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularAttributeEClass(RegularAttributeEClass regularAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regularAttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regularAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(regularAttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_name_AttrEClass(AttributeValueRequirement_name_AttrEClass attributeValueRequirement_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_Reference_OrGroup(ExternalInterface_Reference_OrGroup externalInterface_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalInterface_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalInterface_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalInterface_Reference_OrGroup_validate(externalInterface_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Interface Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_Reference_OrGroup_validate(ExternalInterface_Reference_OrGroup externalInterface_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalInterface_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass sourceDocumentInformation_originVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument charSequence_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_Reference_OrGroup(SupportedRoleClass_Reference_OrGroup supportedRoleClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupportedRoleClass_Reference_OrGroup_validate(supportedRoleClass_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Supported Role Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_Reference_OrGroup_validate(SupportedRoleClass_Reference_OrGroup supportedRoleClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportedRoleClass_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecontains_FunctionalOperator(contains_FunctionalOperator contains_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contains_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass sourceDocumentInformation_originVendorURL_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass sourceDocumentInformation_originRelease_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainment_OrGroup(Containment_OrGroup containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionOperator(ExpressionOperator expressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Argument(DateTime_Argument dateTime_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Type(AttributeDataType_Type attributeDataType_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalOperator(Integer_FunctionalOperator integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originName_AttrEClass(SourceDocumentInformation_originName_AttrEClass sourceDocumentInformation_originName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationOperator(EnumerationOperator enumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_Reference_OrGroup(AttributeLib_Reference_OrGroup attributeLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeLib_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeLib_Reference_OrGroup_validate(attributeLib_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_Reference_OrGroup_validate(AttributeLib_Reference_OrGroup attributeLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeLib_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElementReferenceArgument(DateTime_CalculateableElementReferenceArgument dateTime_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_CalculateableElementReferenceArgument_validate(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElementReferenceArgument_validate(DateTime_CalculateableElementReferenceArgument dateTime_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_changeMode_AttrEClass(Version_changeMode_AttrEClass version_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_changeMode_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(version_changeMode_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableParameter(EFeatureMapEntry_CalculateableParameter eFeatureMapEntry_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_CalculateableParameter_validate(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableParameter_validate(EFeatureMapEntry_CalculateableParameter eFeatureMapEntry_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_Containment_OrGroup(SystemUnitClass_Containment_OrGroup systemUnitClass_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(systemUnitClass_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_CalculateableParameter_validate(charSequence_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter_validate(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator charSequence_String_Object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_And_BitOperator(String_And_BitOperator string_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_requirements_AttrEClass(UnknownType_requirements_AttrEClass unknownType_requirements_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType_requirements_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(unknownType_requirements_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_Reference_OrGroup(GenericAttribute_Reference_OrGroup genericAttribute_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericAttribute_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericAttribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericAttribute_Reference_OrGroup_validate(genericAttribute_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Attribute Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_Reference_OrGroup_validate(GenericAttribute_Reference_OrGroup genericAttribute_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericAttribute_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_Containment_OrGroup(NominalScaledType_Containment_OrGroup nominalScaledType_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(nominalScaledType_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator inheritedFrom_Object_to_Number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_refBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass interfaceClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_Reference_OrGroup(GenericElement_Reference_OrGroup genericElement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericElement_Reference_OrGroup_validate(genericElement_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_Reference_OrGroup_validate(GenericElement_Reference_OrGroup genericElement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericElement_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Argument(Number_Argument number_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestartsWith_FunctionalOperator(startsWith_FunctionalOperator startsWith_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startsWith_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Operator(String_Operator string_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableElementReferenceArgument_validate(string_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument_validate(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_defaultValue_AttrEClass(Attribute_defaultValue_AttrEClass attribute_defaultValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_defaultValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_defaultValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_ExpressionOperator(Boolean_ExpressionOperator boolean_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubstring_FunctionalOperator(substring_FunctionalOperator substring_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substring_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_Reference_OrGroup(NominalScaledType_Reference_OrGroup nominalScaledType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNominalScaledType_Reference_OrGroup_validate(nominalScaledType_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Nominal Scaled Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_Reference_OrGroup_validate(NominalScaledType_Reference_OrGroup nominalScaledType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return nominalScaledType_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument charSequence_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount_AggregationOperator(Count_AggregationOperator count_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator number_Double_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_Reference_OrGroup(Attribute_Reference_OrGroup attribute_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_Reference_OrGroup_validate(attribute_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_Reference_OrGroup_validate(Attribute_Reference_OrGroup attribute_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attribute_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_PrimitiveArgument(AttributeDataType_PrimitiveArgument attributeDataType_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_Containment_OrGroup(CAEXBasicObject_Containment_OrGroup caexBasicObject_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexBasicObject_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexBasicObject_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(caexBasicObject_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecodePointAt_FunctionalOperator(codePointAt_FunctionalOperator codePointAt_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePointAt_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegatableElement(NegatableElement negatableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negatableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Argument(EFeatureMapEntry_Argument eFeatureMapEntry_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_EvaluationOperation_Argument(String_EvaluationOperation_Argument string_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalOperator(Number_FunctionalOperator number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_value_AttrEClass(Description_value_AttrEClass description_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(description_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originID_AttrEClass(SourceDocumentInformation_originID_AttrEClass sourceDocumentInformation_originID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Argument(Double_Argument double_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalType(Integer_FunctionalType integer_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizableElement(GeneralizableElement generalizableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalType(EFeatureMapEntry_FunctionalType eFeatureMapEntry_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalParameter(DateTime_FunctionalParameter dateTime_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_FunctionalParameter_validate(dateTime_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalParameter_validate(DateTime_FunctionalParameter dateTime_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_EvaluationOperation_Argument(DateTime_EvaluationOperation_Argument dateTime_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_Containment_OrGroup(Revision_Containment_OrGroup revision_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(revision_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin_AggregationOperator_Double(Min_AggregationOperator_Double min_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_Containment_OrGroup(InternalElement_Containment_OrGroup internalElement_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(internalElement_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalOperator(FunctionalOperator functionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_hashCode_FunctionalOperator(Object_CharSequence_hashCode_FunctionalOperator object_CharSequence_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_And_BitOperator(Boolean_And_BitOperator boolean_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateisEmpty_FunctionalOperator(isEmpty_FunctionalOperator isEmpty_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isEmpty_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator inheritedFrom_Object_to_CharSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_CharSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_FunctionalParameter_validate(string_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter_validate(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_Containment_OrGroup(InterfaceClassLib_Containment_OrGroup interfaceClassLib_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClassLib_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceClassLib_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_value_AttrEClass(Copyright_value_AttrEClass copyright_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(copyright_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterThan_FunctionalOperator(greaterThan_FunctionalOperator greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_Reference_OrGroup(SystemUnitClassLib_Reference_OrGroup systemUnitClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClassLib_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClassLib_Reference_OrGroup_validate(systemUnitClassLib_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_Reference_OrGroup_validate(SystemUnitClassLib_Reference_OrGroup systemUnitClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClassLib_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalOperator(Boolean_FunctionalOperator boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_ExpressionOperator(AttributeDataType_ExpressionOperator attributeDataType_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(string_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass_validate(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestartsWithOffset_FunctionalOperator(startsWithOffset_FunctionalOperator startsWithOffset_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startsWithOffset_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfString_FunctionalOperator(indexOfString_FunctionalOperator indexOfString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator number_Integer_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_requiredValue_AttrEClass(NominalScaledType_requiredValue_AttrEClass nominalScaledType_requiredValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType_requiredValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Argument(Boolean_Argument boolean_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_Reference_OrGroup(DocumentRoot_Reference_OrGroup documentRoot_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateDocumentRoot_Reference_OrGroup_validate(documentRoot_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Document Root Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_Reference_OrGroup_validate(DocumentRoot_Reference_OrGroup documentRoot_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return documentRoot_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeEClass(AttributeEClass attributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(attributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElementReferenceArgument(AttributeDataType_CalculateableElementReferenceArgument attributeDataType_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_CalculateableElementReferenceArgument_validate(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElementReferenceArgument_validate(AttributeDataType_CalculateableElementReferenceArgument attributeDataType_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_lastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass sourceDocumentInformation_lastWritingDateTime_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_And_BitOperator(Integer_And_BitOperator integer_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_changeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass caexBasicObject_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexBasicObject_changeMode_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Or_BitOperator(Double_Or_BitOperator double_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validate(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_name_AttrEClass(Element_name_AttrEClass element_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(element_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Type(Double_Type double_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_Reference_OrGroup(RoleClass_Reference_OrGroup roleClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClass_Reference_OrGroup_validate(roleClass_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_Reference_OrGroup_validate(RoleClass_Reference_OrGroup roleClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClass_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass sourceDocumentInformation_originProjectID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_BitOperator(String_BitOperator string_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_Containment_OrGroup(RoleClass_Containment_OrGroup roleClass_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleClass_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_ExpressionOperator(Character_ExpressionOperator character_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_ExpressionOperator(Object_ExpressionOperator object_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_FunctionalParameter_validate(object_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter_validate(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Calculateable(Character_Calculateable character_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator inheritedFrom_CharSequence_to_String_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_CharSequence_to_String_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalParameter(EFeatureMapEntry_FunctionalParameter eFeatureMapEntry_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_FunctionalParameter_validate(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalParameter_validate(EFeatureMapEntry_FunctionalParameter eFeatureMapEntry_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_hashCode_FunctionalOperator(Number_Integer_Object_Number_hashCode_FunctionalOperator number_Integer_Object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Or_BitOperator(EFeatureMapEntry_Or_BitOperator eFeatureMapEntry_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument integer_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator charSequence_String_length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_Containment_OrGroup(InterfaceIDMapping_Containment_OrGroup interfaceIDMapping_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceIDMapping_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator equalsIgnoreCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equalsIgnoreCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_Containment_OrGroup(AttributeNameMapping_Containment_OrGroup attributeNameMapping_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeNameMapping_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_authorName_AttrEClass(Revision_authorName_AttrEClass revision_authorName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_authorName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_authorName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_EnumerationOperator(ChangeMode_EnumerationOperator changeMode_EnumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_EnumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_ExpressionOperator(Double_ExpressionOperator double_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_Containment_OrGroup(AttributeLib_Containment_OrGroup attributeLib_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeLib_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeLib_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_Containment_OrGroup(DocumentRoot_Containment_OrGroup documentRoot_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(documentRoot_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_Containment_OrGroup(RoleClassLib_Containment_OrGroup roleClassLib_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClassLib_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleClassLib_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily_Containment_OrGroup(RoleFamily_Containment_OrGroup roleFamily_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleFamily_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleFamily_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_BitOperator(Object_BitOperator object_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_BitOperator(CharSequence_BitOperator charSequence_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_CalculateableParameter_validate(number_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter_validate(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable(Calculateable calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_Containment_OrGroup(InternalLink_Containment_OrGroup internalLink_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(internalLink_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_mixed_AttrEClass(DocumentRoot_mixed_AttrEClass documentRoot_mixed_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot_mixed_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(documentRoot_mixed_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalOperator(Character_FunctionalOperator character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_AggregationOperator_Integer(Max_AggregationOperator_Integer max_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_changeMode_AttrEClass(Description_changeMode_AttrEClass description_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_changeMode_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(description_changeMode_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_PrimitiveArgument(Number_PrimitiveArgument number_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Type(CharSequence_Type charSequence_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Calculateable(Double_Calculateable double_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_superiorStandardVersion_AttrEClass(CAEXFile_superiorStandardVersion_AttrEClass caexFile_superiorStandardVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily_Reference_OrGroup(AttributeFamily_Reference_OrGroup attributeFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeFamily_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeFamily_Reference_OrGroup_validate(attributeFamily_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily_Reference_OrGroup_validate(AttributeFamily_Reference_OrGroup attributeFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeFamily_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalType(Character_FunctionalType character_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalType(Number_FunctionalType number_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedoubleValue_FunctionalOperator(doubleValue_FunctionalOperator doubleValue_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleValue_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_AttributeEClass(ChangeMode_AttributeEClass changeMode_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeMode_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeMode_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(changeMode_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_refPartnerSideA_AttrEClass(InternalLink_refPartnerSideA_AttrEClass internalLink_refPartnerSideA_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_refPartnerSideA_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator number_Double_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator parseBoolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parseBoolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoUpperCase_FunctionalOperator(toUpperCase_FunctionalOperator toUpperCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toUpperCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object_Boolean_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_comment_AttrEClass(Revision_comment_AttrEClass revision_comment_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_comment_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_comment_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_Containment_OrGroup(CAEXFile_Containment_OrGroup caexFile_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(caexFile_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Calculateable(DateTime_Calculateable dateTime_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSum_AggregationOperator_Integer(Sum_AggregationOperator_Integer sum_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_refPartnerSideB_AttrEClass(InternalLink_refPartnerSideB_AttrEClass internalLink_refPartnerSideB_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_refPartnerSideB_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableParameter(CalculateableParameter calculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_FunctionalParameter_validate(character_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter_validate(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_ExpressionOperator(String_ExpressionOperator string_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily_Reference_OrGroup(RoleFamily_Reference_OrGroup roleFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleFamily_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleFamily_Reference_OrGroup_validate(roleFamily_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily_Reference_OrGroup_validate(RoleFamily_Reference_OrGroup roleFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleFamily_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_AttributeEClass(AttributeDataType_AttributeEClass attributeDataType_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_AttributeEClass_validate(attributeDataType_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_AttributeEClass_validate(AttributeDataType_AttributeEClass attributeDataType_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_attributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass attribute_attributeDataType_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_attributeDataType_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_AttributeEClass_validate(attribute_attributeDataType_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_Reference_OrGroup(Description_Reference_OrGroup description_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_Reference_OrGroup_validate(description_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Description Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_Reference_OrGroup_validate(Description_Reference_OrGroup description_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return description_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableElement(CharSequence_CalculateableElement charSequence_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_hashCode_FunctionalOperator(Object_Number_hashCode_FunctionalOperator object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Calculateable(AttributeDataType_Calculateable attributeDataType_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_Reference_OrGroup(InterfaceIDMapping_Reference_OrGroup interfaceIDMapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceIDMapping_Reference_OrGroup_validate(interfaceIDMapping_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface ID Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_Reference_OrGroup_validate(InterfaceIDMapping_Reference_OrGroup interfaceIDMapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceIDMapping_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator number_Integer_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalArgument(FunctionalArgument functionalArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_Reference_OrGroup(CAEXBasicObject_Reference_OrGroup caexBasicObject_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexBasicObject_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexBasicObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXBasicObject_Reference_OrGroup_validate(caexBasicObject_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Basic Object Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_Reference_OrGroup_validate(CAEXBasicObject_Reference_OrGroup caexBasicObject_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexBasicObject_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_refAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass attribute_refAttributeType_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_refAttributeType_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_refAttributeType_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Operator(EFeatureMapEntry_Operator eFeatureMapEntry_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToString_FunctionalOperator(compareToString_FunctionalOperator compareToString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_Reference_OrGroup(InternalElement_Reference_OrGroup internalElement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalElement_Reference_OrGroup_validate(internalElement_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Element Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_Reference_OrGroup_validate(InternalElement_Reference_OrGroup internalElement_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalElement_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountingAggregationOperator(CountingAggregationOperator countingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Type(Integer_Type integer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass ordinalScaledType_requiredMinValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Or_BitOperator(Boolean_Or_BitOperator boolean_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalType(AttributeDataType_FunctionalType attributeDataType_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Or_BitOperator(Character_Or_BitOperator character_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Argument(Object_Argument object_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator integer_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_FunctionalParameter_validate(boolean_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter_validate(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Operator(Number_Operator number_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_PrimitiveArgument(Double_PrimitiveArgument double_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalOperator(EFeatureMapEntry_FunctionalOperator eFeatureMapEntry_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToStringIgnoreCase_FunctionalOperator(compareToStringIgnoreCase_FunctionalOperator compareToStringIgnoreCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToStringIgnoreCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_Reference_OrGroup(InterfaceClass_Reference_OrGroup interfaceClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClass_Reference_OrGroup_validate(interfaceClass_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_Reference_OrGroup_validate(InterfaceClass_Reference_OrGroup interfaceClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClass_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Or_BitOperator(Object_Or_BitOperator object_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_Reference_OrGroup(AdditionalInformation_Reference_OrGroup additionalInformation_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(additionalInformation_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(additionalInformation_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdditionalInformation_Reference_OrGroup_validate(additionalInformation_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Additional Information Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_Reference_OrGroup_validate(AdditionalInformation_Reference_OrGroup additionalInformation_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return additionalInformation_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableElement(Number_CalculateableElement number_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_BitOperator(Double_BitOperator double_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveArgument(PrimitiveArgument primitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countable_ReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountable_ReferenceArgument_validate(countable_ReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument_validate(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return countable_ReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Calculateable(Object_Calculateable object_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Type(Boolean_Type boolean_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_FunctionalParameter_validate(charSequence_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter_validate(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperator(ClassOperator classOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_CalculateableParameter_validate(boolean_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter_validate(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass sourceDocumentInformation_originProjectTitle_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Or_BitOperator(Number_Or_BitOperator number_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_AggregationOperator_Double(Max_AggregationOperator_Double max_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily_Containment_OrGroup(SystemUnitFamily_Containment_OrGroup systemUnitFamily_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitFamily_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(systemUnitFamily_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator number_Double_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_Reference_OrGroup(Copyright_Reference_OrGroup copyright_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyright_Reference_OrGroup_validate(copyright_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Copyright Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_Reference_OrGroup_validate(Copyright_Reference_OrGroup copyright_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyright_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_PrimitiveArgument(Character_PrimitiveArgument character_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_refBaseClassPath_AttrEClass(RoleClass_refBaseClassPath_AttrEClass roleClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_Containment_OrGroup(Copyright_Containment_OrGroup copyright_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(copyright_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Or_BitOperator(AttributeDataType_Or_BitOperator attributeDataType_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator inheritedFrom_Number_to_Double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElement(DateTime_CalculateableElement dateTime_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_Containment_OrGroup(OrdinalScaledType_Containment_OrGroup ordinalScaledType_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(ordinalScaledType_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_Containment_OrGroup(ExternalReferenceType_Containment_OrGroup externalReferenceType_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(externalReferenceType_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_FunctionalParameter_validate(integer_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter_validate(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_path_AttrEClass(ExternalReferenceType_path_AttrEClass externalReferenceType_path_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_path_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(externalReferenceType_path_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_hashCode_FunctionalOperator(Object_Boolean_hashCode_FunctionalOperator object_Boolean_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd_EvaluationBitOperator(And_EvaluationBitOperator and_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableElement(Character_CalculateableElement character_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_Containment_OrGroup(SourceDocumentInformation_Containment_OrGroup sourceDocumentInformation_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(sourceDocumentInformation_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_Reference_OrGroup(SystemUnitClass_Reference_OrGroup systemUnitClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClass_Reference_OrGroup_validate(systemUnitClass_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_Reference_OrGroup_validate(SystemUnitClass_Reference_OrGroup systemUnitClass_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClass_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalType(CharSequence_FunctionalType charSequence_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_ExpressionOperator(EFeatureMapEntry_ExpressionOperator eFeatureMapEntry_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_changeMode_AttrEClass(Copyright_changeMode_AttrEClass copyright_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_changeMode_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_changeMode_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(copyright_changeMode_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_EvaluationOperation_Argument(AttributeDataType_EvaluationOperation_Argument attributeDataType_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_ExpressionOperator(Integer_ExpressionOperator integer_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object_Character_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator number_Integer_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperation_Argument(EvaluationOperation_Argument evaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_PrimitiveArgument(EFeatureMapEntry_PrimitiveArgument eFeatureMapEntry_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_systemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass interfaceIDMapping_systemUnitInterfaceID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableParameter(DateTime_CalculateableParameter dateTime_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_CalculateableParameter_validate(dateTime_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableParameter_validate(DateTime_CalculateableParameter dateTime_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_refBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass internalElement_refBaseSystemUnitPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationFunctionalOperator(EvaluationFunctionalOperator evaluationFunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationFunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecharAt_FunctionalOperator(charAt_FunctionalOperator charAt_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charAt_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSum_AggregationOperator_Double(Sum_AggregationOperator_Double sum_AggregationOperator_Double, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum_AggregationOperator_Double, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument calculateableElement_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement_ReferenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareToBoolean_FunctionalOperator(compareToBoolean_FunctionalOperator compareToBoolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareToBoolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_ExpressionOperator(CharSequence_ExpressionOperator charSequence_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Type(Object_Type object_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequals_FunctionalOperator(equals_FunctionalOperator equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_CalculateableParameter_validate(integer_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter_validate(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Argument(CharSequence_Argument charSequence_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_And_BitOperator(Number_And_BitOperator number_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Calculateable(String_Calculateable string_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecodePointBefore_FunctionalOperator(codePointBefore_FunctionalOperator codePointBefore_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codePointBefore_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_Reference_OrGroup(Revision_Reference_OrGroup revision_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRevision_Reference_OrGroup_validate(revision_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Revision Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_Reference_OrGroup_validate(Revision_Reference_OrGroup revision_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return revision_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator number_Double_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElementReferenceArgument(EFeatureMapEntry_CalculateableElementReferenceArgument eFeatureMapEntry_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_CalculateableElementReferenceArgument_validate(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElementReferenceArgument_validate(EFeatureMapEntry_CalculateableElementReferenceArgument eFeatureMapEntry_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator number_Integer_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_Reference_OrGroup(InternalLink_Reference_OrGroup internalLink_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalLink_Reference_OrGroup_validate(internalLink_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Link Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_Reference_OrGroup_validate(InternalLink_Reference_OrGroup internalLink_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalLink_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalOperator(Double_FunctionalOperator double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationOperator(AggregationOperator aggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_Containment_OrGroup(Attribute_Containment_OrGroup attribute_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attribute_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_BitOperator(AttributeDataType_BitOperator attributeDataType_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconcat_FunctionalOperator(concat_FunctionalOperator concat_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concat_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_And_BitOperator(EFeatureMapEntry_And_BitOperator eFeatureMapEntry_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily_Reference_OrGroup(SystemUnitFamily_Reference_OrGroup systemUnitFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitFamily_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitFamily_Reference_OrGroup_validate(systemUnitFamily_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Family Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily_Reference_OrGroup_validate(SystemUnitFamily_Reference_OrGroup systemUnitFamily_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitFamily_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableElement(Object_CalculateableElement object_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator number_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_Containment_OrGroup(SupportedRoleClass_Containment_OrGroup supportedRoleClass_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(supportedRoleClass_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily_Containment_OrGroup(InterfaceFamily_Containment_OrGroup interfaceFamily_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceFamily_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceFamily_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceFamily_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalOperator(AttributeDataType_FunctionalOperator attributeDataType_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Calculateable(Boolean_Calculateable boolean_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_Containment_OrGroup(RoleRequirements_Containment_OrGroup roleRequirements_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleRequirements_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleRequirements_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleRequirements_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_oldVersion_AttrEClass(Revision_oldVersion_AttrEClass revision_oldVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_oldVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_oldVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceArgument(ReferenceArgument referenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator number_Integer_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator number_Double_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_Containment_OrGroup(SystemUnitClassLib_Containment_OrGroup systemUnitClassLib_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClassLib_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(systemUnitClassLib_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_Containment_OrGroup(AttributeValueRequirement_Containment_OrGroup attributeValueRequirement_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeValueRequirement_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Or_BitOperator(String_Or_BitOperator string_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_Reference_OrGroup(CAEXObject_Reference_OrGroup caexObject_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXObject_Reference_OrGroup_validate(caexObject_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Object Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_Reference_OrGroup_validate(CAEXObject_Reference_OrGroup caexObject_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexObject_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Or_BitOperator(Integer_Or_BitOperator integer_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Operator(Double_Operator double_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_Reference_OrGroup(CAEXFile_Reference_OrGroup caexFile_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXFile_Reference_OrGroup_validate(caexFile_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX File Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_Reference_OrGroup_validate(CAEXFile_Reference_OrGroup caexFile_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexFile_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalType(DateTime_FunctionalType dateTime_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_Reference_OrGroup(Mapping_Reference_OrGroup mapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateMapping_Reference_OrGroup_validate(mapping_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Mapping Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_Reference_OrGroup_validate(Mapping_Reference_OrGroup mapping_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mapping_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_CalculateableElement(ChangeMode_CalculateableElement changeMode_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Or_BitOperator(DateTime_Or_BitOperator dateTime_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_fileName_AttrEClass(CAEXFile_fileName_AttrEClass caexFile_fileName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_fileName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_fileName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableElement(Boolean_CalculateableElement boolean_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_hashCode_FunctionalOperator(CharSequence_String_Object_CharSequence_hashCode_FunctionalOperator charSequence_String_Object_CharSequence_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable_Argument(Calculateable_Argument calculateable_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_Reference_OrGroup(RoleClassLib_Reference_OrGroup roleClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClassLib_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClassLib_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClassLib_Reference_OrGroup_validate(roleClassLib_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class Lib Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_Reference_OrGroup_validate(RoleClassLib_Reference_OrGroup roleClassLib_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClassLib_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin_AggregationOperator_Integer(Min_AggregationOperator_Integer min_AggregationOperator_Integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min_AggregationOperator_Integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_PrimitiveArgument(Integer_PrimitiveArgument integer_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_Containment_OrGroup(RefSemantic_Containment_OrGroup refSemantic_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(refSemantic_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator character_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Calculateable(CharSequence_Calculateable charSequence_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableElement(Integer_CalculateableElement integer_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_BitOperator(EFeatureMapEntry_BitOperator eFeatureMapEntry_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_Reference_OrGroup(OrdinalScaledType_Reference_OrGroup ordinalScaledType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrdinalScaledType_Reference_OrGroup_validate(ordinalScaledType_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ordinal Scaled Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_Reference_OrGroup_validate(OrdinalScaledType_Reference_OrGroup ordinalScaledType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ordinalScaledType_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindQueryCollection(FindQueryCollection findQueryCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findQueryCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_revisionDate_AttrEClass(Revision_revisionDate_AttrEClass revision_revisionDate_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_revisionDate_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(revision_revisionDate_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_And_BitOperator(Object_And_BitOperator object_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_PrimitiveArgument(Object_PrimitiveArgument object_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectClause(SelectClause selectClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectClause_validate(selectClause, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectClause_validate(SelectClause selectClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return selectClause.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableElement(Double_CalculateableElement double_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_And_BitOperator(DateTime_And_BitOperator dateTime_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Calculateable(Number_Calculateable number_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_CalculateableParameter_validate(double_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter_validate(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Calculateable(EFeatureMapEntry_Calculateable eFeatureMapEntry_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Operator(Integer_Operator integer_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_Containment_OrGroup(Description_Containment_OrGroup description_Containment_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_Containment_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_Containment_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(description_Containment_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelength_FunctionalOperator(length_FunctionalOperator length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_refRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass supportedRoleClass_refRoleClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_Reference_OrGroup(UnknownType_Reference_OrGroup unknownType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType_Reference_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType_Reference_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnknownType_Reference_OrGroup_validate(unknownType_Reference_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Unknown Type Reference Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_Reference_OrGroup_validate(UnknownType_Reference_OrGroup unknownType_Reference_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unknownType_Reference_OrGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_hashCode_FunctionalOperator(Number_Double_Object_Number_hashCode_FunctionalOperator number_Double_Object_Number_hashCode_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_hashCode_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationAttributeEClass(EnumerationAttributeEClass enumerationAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationAttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationAttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(enumerationAttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElement(String_CalculateableElement string_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalType(FunctionalType functionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalParameter(FunctionalParameter functionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_systemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass attributeNameMapping_systemUnitAttributeName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Original_FunctionalOperator(String_Original_FunctionalOperator string_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode(ChangeMode changeMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType(String attributeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeModeObject(Enumerator changeModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence(CharSequence charSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(Character character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QmmValidator
