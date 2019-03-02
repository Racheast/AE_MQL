/**
 */
package dmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmm.DmmFactory
 * @model kind="package"
 * @generated
 */
public interface DmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/DMM/model/DMM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmmPackage eINSTANCE = dmm.impl.DmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmm.impl.CAEXBasicObjectImpl <em>CAEX Basic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.CAEXBasicObjectImpl
	 * @see dmm.impl.DmmPackageImpl#getCAEXBasicObject()
	 * @generated
	 */
	int CAEX_BASIC_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__CHANGE_MODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__COPYRIGHT = 4;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>CAEX Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CAEX Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.CAEXObjectImpl <em>CAEX Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.CAEXObjectImpl
	 * @see dmm.impl.DmmPackageImpl#getCAEXObject()
	 * @generated
	 */
	int CAEX_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ID = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CAEX Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CAEX Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AttributeImpl
	 * @see dmm.impl.DmmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF_SEMANTIC = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINT = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_DATA_TYPE = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ref Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF_ATTRIBUTE_TYPE = CAEX_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIT = CAEX_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AttributeFamilyImpl <em>Attribute Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AttributeFamilyImpl
	 * @see dmm.impl.DmmPackageImpl#getAttributeFamily()
	 * @generated
	 */
	int ATTRIBUTE_FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__CHANGE_MODE = ATTRIBUTE__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__DESCRIPTION = ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__VERSION = ATTRIBUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__REVISION = ATTRIBUTE__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__COPYRIGHT = ATTRIBUTE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__ADDITIONAL_INFORMATION = ATTRIBUTE__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__VALUE = ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__REF_SEMANTIC = ATTRIBUTE__REF_SEMANTIC;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__CONSTRAINT = ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__ATTRIBUTE = ATTRIBUTE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__ATTRIBUTE_DATA_TYPE = ATTRIBUTE__ATTRIBUTE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Ref Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__REF_ATTRIBUTE_TYPE = ATTRIBUTE__REF_ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY__UNIT = ATTRIBUTE__UNIT;

	/**
	 * The number of structural features of the '<em>Attribute Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FAMILY_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AttributeNameMappingImpl
	 * @see dmm.impl.DmmPackageImpl#getAttributeNameMapping()
	 * @generated
	 */
	int ATTRIBUTE_NAME_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Unit Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AttributeLibImpl <em>Attribute Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AttributeLibImpl
	 * @see dmm.impl.DmmPackageImpl#getAttributeLib()
	 * @generated
	 */
	int ATTRIBUTE_LIB = 3;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB__ATTRIBUTE_TYPE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AttributeValueRequirementImpl
	 * @see dmm.impl.DmmPackageImpl#getAttributeValueRequirement()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.CAEXFileImpl <em>CAEX File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.CAEXFileImpl
	 * @see dmm.impl.DmmPackageImpl#getCAEXFile()
	 * @generated
	 */
	int CAEX_FILE = 6;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Superior Standard Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SUPERIOR_STANDARD_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Document Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SOURCE_DOCUMENT_INFORMATION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__EXTERNAL_REFERENCE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INSTANCE_HIERARCHY = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INTERFACE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ROLE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attribute Type Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ATTRIBUTE_TYPE_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__FILE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SCHEMA_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>CAEX File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>CAEX File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.DocumentRootImpl
	 * @see dmm.impl.DmmPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>CAEX File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAEX_FILE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InterfaceClassImpl
	 * @see dmm.impl.DmmPackageImpl#getInterfaceClass()
	 * @generated
	 */
	int INTERFACE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__INTERFACE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.ExternalInterfaceImpl
	 * @see dmm.impl.DmmPackageImpl#getExternalInterface()
	 * @generated
	 */
	int EXTERNAL_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__BASE_CLASS = INTERFACE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__INTERFACE_CLASS = INTERFACE_CLASS__INTERFACE_CLASS;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__EXTERNAL_INTERFACE = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.ExternalReferenceTypeImpl
	 * @see dmm.impl.DmmPackageImpl#getExternalReferenceType()
	 * @generated
	 */
	int EXTERNAL_REFERENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__ALIAS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InstanceHierarchyImpl
	 * @see dmm.impl.DmmPackageImpl#getInstanceHierarchy()
	 * @generated
	 */
	int INSTANCE_HIERARCHY = 11;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InterfaceClassLibImpl
	 * @see dmm.impl.DmmPackageImpl#getInterfaceClassLib()
	 * @generated
	 */
	int INTERFACE_CLASS_LIB = 12;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__INTERFACE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InterfaceFamilyImpl
	 * @see dmm.impl.DmmPackageImpl#getInterfaceFamily()
	 * @generated
	 */
	int INTERFACE_FAMILY = 14;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__BASE_CLASS = INTERFACE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__INTERFACE_CLASS = INTERFACE_CLASS__INTERFACE_CLASS;

	/**
	 * The number of structural features of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InterfaceIDMappingImpl <em>Interface ID Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InterfaceIDMappingImpl
	 * @see dmm.impl.DmmPackageImpl#getInterfaceIDMapping()
	 * @generated
	 */
	int INTERFACE_ID_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Role Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__ROLE_INTERFACE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Unit Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface ID Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface ID Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ID_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.SystemUnitClassImpl
	 * @see dmm.impl.DmmPackageImpl#getSystemUnitClass()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS = 29;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_LINK = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS = CAEX_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InternalElementImpl <em>Internal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InternalElementImpl
	 * @see dmm.impl.DmmPackageImpl#getInternalElement()
	 * @generated
	 */
	int INTERNAL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__BASE_CLASS = SYSTEM_UNIT_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__SYSTEM_UNIT_CLASS = SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REF_BASE_CLASS_PATH = SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Role Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ROLE_REQUIREMENTS = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base System Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__BASE_SYSTEM_UNIT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.InternalLinkImpl
	 * @see dmm.impl.DmmPackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 17;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_A = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_B = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Side A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__PARTNER_SIDE_A = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Side B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__PARTNER_SIDE_B = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.MappingImpl
	 * @see dmm.impl.DmmPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 18;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATTRIBUTE_NAME_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface ID Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INTERFACE_ID_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.NominalScaledTypeImpl <em>Nominal Scaled Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.NominalScaledTypeImpl
	 * @see dmm.impl.DmmPackageImpl#getNominalScaledType()
	 * @generated
	 */
	int NOMINAL_SCALED_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_TYPE__REQUIRED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nominal Scaled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nominal Scaled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.OrdinalScaledTypeImpl <em>Ordinal Scaled Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.OrdinalScaledTypeImpl
	 * @see dmm.impl.DmmPackageImpl#getOrdinalScaledType()
	 * @generated
	 */
	int ORDINAL_SCALED_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_TYPE__REQUIRED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Ordinal Scaled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ordinal Scaled Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RefSemanticImpl
	 * @see dmm.impl.DmmPackageImpl#getRefSemantic()
	 * @generated
	 */
	int REF_SEMANTIC = 21;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Corresponding Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RoleClassLibImpl
	 * @see dmm.impl.DmmPackageImpl#getRoleClassLib()
	 * @generated
	 */
	int ROLE_CLASS_LIB = 22;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RoleClassImpl <em>Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RoleClassImpl
	 * @see dmm.impl.DmmPackageImpl#getRoleClass()
	 * @generated
	 */
	int ROLE_CLASS = 23;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RoleFamilyImpl <em>Role Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RoleFamilyImpl
	 * @see dmm.impl.DmmPackageImpl#getRoleFamily()
	 * @generated
	 */
	int ROLE_FAMILY = 24;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__CHANGE_MODE = ROLE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__DESCRIPTION = ROLE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__VERSION = ROLE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REVISION = ROLE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__COPYRIGHT = ROLE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ADDITIONAL_INFORMATION = ROLE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ID = ROLE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__NAME = ROLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ATTRIBUTE = ROLE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__EXTERNAL_INTERFACE = ROLE_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REF_BASE_CLASS_PATH = ROLE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__BASE_CLASS = ROLE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ROLE_CLASS = ROLE_CLASS__ROLE_CLASS;

	/**
	 * The number of structural features of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_FEATURE_COUNT = ROLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_OPERATION_COUNT = ROLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RoleRequirementsImpl
	 * @see dmm.impl.DmmPackageImpl#getRoleRequirements()
	 * @generated
	 */
	int ROLE_REQUIREMENTS = 25;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ATTRIBUTE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__MAPPING_OBJECT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ROLE_CLASS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.SourceDocumentInformationImpl <em>Source Document Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.SourceDocumentInformationImpl
	 * @see dmm.impl.DmmPackageImpl#getSourceDocumentInformation()
	 * @generated
	 */
	int SOURCE_DOCUMENT_INFORMATION = 26;

	/**
	 * The feature id for the '<em><b>Last Writing Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Origin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID = 1;

	/**
	 * The feature id for the '<em><b>Origin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Origin Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID = 3;

	/**
	 * The feature id for the '<em><b>Origin Project Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE = 4;

	/**
	 * The feature id for the '<em><b>Origin Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE = 5;

	/**
	 * The feature id for the '<em><b>Origin Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR = 6;

	/**
	 * The feature id for the '<em><b>Origin Vendor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL = 7;

	/**
	 * The feature id for the '<em><b>Origin Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION = 8;

	/**
	 * The number of structural features of the '<em>Source Document Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Source Document Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.SupportedRoleClassImpl
	 * @see dmm.impl.DmmPackageImpl#getSupportedRoleClass()
	 * @generated
	 */
	int SUPPORTED_ROLE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__ROLE_CLASS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.SystemUnitClassLibImpl
	 * @see dmm.impl.DmmPackageImpl#getSystemUnitClassLib()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS_LIB = 28;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.SystemUnitFamilyImpl
	 * @see dmm.impl.DmmPackageImpl#getSystemUnitFamily()
	 * @generated
	 */
	int SYSTEM_UNIT_FAMILY = 30;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__BASE_CLASS = SYSTEM_UNIT_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS = SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH = SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The number of structural features of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.UnknownTypeImpl
	 * @see dmm.impl.DmmPackageImpl#getUnknownType()
	 * @generated
	 */
	int UNKNOWN_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE__REQUIREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.CopyrightImpl <em>Copyright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.CopyrightImpl
	 * @see dmm.impl.DmmPackageImpl#getCopyright()
	 * @generated
	 */
	int COPYRIGHT = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.DescriptionImpl
	 * @see dmm.impl.DmmPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.RevisionImpl
	 * @see dmm.impl.DmmPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 34;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_DATE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OLD_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__NEW_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__AUTHOR_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMENT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.VersionImpl
	 * @see dmm.impl.DmmPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.ElementImpl
	 * @see dmm.impl.DmmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmm.impl.GenericElementImpl <em>Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.GenericElementImpl
	 * @see dmm.impl.DmmPackageImpl#getGenericElement()
	 * @generated
	 */
	int GENERIC_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Nested Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NESTED_ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ELEMENT_FEATURE_MAP = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.AdditionalInformationImpl <em>Additional Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.AdditionalInformationImpl
	 * @see dmm.impl.DmmPackageImpl#getAdditionalInformation()
	 * @generated
	 */
	int ADDITIONAL_INFORMATION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__NAME = GENERIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__VALUE = GENERIC_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Nested Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__NESTED_ELEMENTS = GENERIC_ELEMENT__NESTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ATTRIBUTES = GENERIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ELEMENT_FEATURE_MAP = GENERIC_ELEMENT__ELEMENT_FEATURE_MAP;

	/**
	 * The feature id for the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ATTRIBUTE_FEATURE_MAP = GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP;

	/**
	 * The number of structural features of the '<em>Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION_FEATURE_COUNT = GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION_OPERATION_COUNT = GENERIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.impl.GenericAttributeImpl <em>Generic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.impl.GenericAttributeImpl
	 * @see dmm.impl.DmmPackageImpl#getGenericAttribute()
	 * @generated
	 */
	int GENERIC_ATTRIBUTE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE__VALUE = ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmm.ChangeMode <em>Change Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmm.ChangeMode
	 * @see dmm.impl.DmmPackageImpl#getChangeMode()
	 * @generated
	 */
	int CHANGE_MODE = 40;

	/**
	 * The meta object id for the '<em>Attribute Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see dmm.impl.DmmPackageImpl#getAttributeDataType()
	 * @generated
	 */
	int ATTRIBUTE_DATA_TYPE = 41;

	/**
	 * The meta object id for the '<em>Change Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see dmm.impl.DmmPackageImpl#getChangeModeObject()
	 * @generated
	 */
	int CHANGE_MODE_OBJECT = 42;


	/**
	 * Returns the meta object for class '{@link dmm.AttributeFamily <em>Attribute Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Family</em>'.
	 * @see dmm.AttributeFamily
	 * @generated
	 */
	EClass getAttributeFamily();

	/**
	 * Returns the meta object for class '{@link dmm.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Name Mapping</em>'.
	 * @see dmm.AttributeNameMapping
	 * @generated
	 */
	EClass getAttributeNameMapping();

	/**
	 * Returns the meta object for the attribute '{@link dmm.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Attribute Name</em>'.
	 * @see dmm.AttributeNameMapping#getRoleAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_RoleAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link dmm.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Attribute Name</em>'.
	 * @see dmm.AttributeNameMapping#getSystemUnitAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_SystemUnitAttributeName();

	/**
	 * Returns the meta object for the reference '{@link dmm.AttributeNameMapping#getRoleAttribute <em>Role Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Attribute</em>'.
	 * @see dmm.AttributeNameMapping#getRoleAttribute()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EReference getAttributeNameMapping_RoleAttribute();

	/**
	 * Returns the meta object for the reference '{@link dmm.AttributeNameMapping#getSystemUnitAttribute <em>System Unit Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Unit Attribute</em>'.
	 * @see dmm.AttributeNameMapping#getSystemUnitAttribute()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EReference getAttributeNameMapping_SystemUnitAttribute();

	/**
	 * Returns the meta object for class '{@link dmm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dmm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see dmm.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Attribute#getRefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Semantic</em>'.
	 * @see dmm.Attribute#getRefSemantic()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_RefSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Attribute#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see dmm.Attribute#getConstraint()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Attribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dmm.Attribute#getAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Attribute#getAttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Data Type</em>'.
	 * @see dmm.Attribute#getAttributeDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeDataType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Attribute#getRefAttributeType <em>Ref Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Attribute Type</em>'.
	 * @see dmm.Attribute#getRefAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_RefAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Attribute#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see dmm.Attribute#getUnit()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Unit();

	/**
	 * Returns the meta object for class '{@link dmm.AttributeLib <em>Attribute Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Lib</em>'.
	 * @see dmm.AttributeLib
	 * @generated
	 */
	EClass getAttributeLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.AttributeLib#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Type</em>'.
	 * @see dmm.AttributeLib#getAttributeType()
	 * @see #getAttributeLib()
	 * @generated
	 */
	EReference getAttributeLib_AttributeType();

	/**
	 * Returns the meta object for class '{@link dmm.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Requirement</em>'.
	 * @see dmm.AttributeValueRequirement
	 * @generated
	 */
	EClass getAttributeValueRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordinal Scaled Type</em>'.
	 * @see dmm.AttributeValueRequirement#getOrdinalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_OrdinalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Scaled Type</em>'.
	 * @see dmm.AttributeValueRequirement#getNominalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_NominalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Type</em>'.
	 * @see dmm.AttributeValueRequirement#getUnknownType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_UnknownType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.AttributeValueRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmm.AttributeValueRequirement#getName()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EAttribute getAttributeValueRequirement_Name();

	/**
	 * Returns the meta object for class '{@link dmm.CAEXBasicObject <em>CAEX Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Basic Object</em>'.
	 * @see dmm.CAEXBasicObject
	 * @generated
	 */
	EClass getCAEXBasicObject();

	/**
	 * Returns the meta object for the attribute '{@link dmm.CAEXBasicObject#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see dmm.CAEXBasicObject#getChangeMode()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EAttribute getCAEXBasicObject_ChangeMode();

	/**
	 * Returns the meta object for the reference '{@link dmm.CAEXBasicObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see dmm.CAEXBasicObject#getDescription()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Description();

	/**
	 * Returns the meta object for the reference '{@link dmm.CAEXBasicObject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see dmm.CAEXBasicObject#getVersion()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Version();

	/**
	 * Returns the meta object for the reference list '{@link dmm.CAEXBasicObject#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Revision</em>'.
	 * @see dmm.CAEXBasicObject#getRevision()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Revision();

	/**
	 * Returns the meta object for the reference '{@link dmm.CAEXBasicObject#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copyright</em>'.
	 * @see dmm.CAEXBasicObject#getCopyright()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Copyright();

	/**
	 * Returns the meta object for the reference '{@link dmm.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additional Information</em>'.
	 * @see dmm.CAEXBasicObject#getAdditionalInformation()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_AdditionalInformation();

	/**
	 * Returns the meta object for class '{@link dmm.CAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX File</em>'.
	 * @see dmm.CAEXFile
	 * @generated
	 */
	EClass getCAEXFile();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.CAEXFile#getSuperiorStandardVersion <em>Superior Standard Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Superior Standard Version</em>'.
	 * @see dmm.CAEXFile#getSuperiorStandardVersion()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_SuperiorStandardVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getSourceDocumentInformation <em>Source Document Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Document Information</em>'.
	 * @see dmm.CAEXFile#getSourceDocumentInformation()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_SourceDocumentInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Reference</em>'.
	 * @see dmm.CAEXFile#getExternalReference()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_ExternalReference();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Hierarchy</em>'.
	 * @see dmm.CAEXFile#getInstanceHierarchy()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class Lib</em>'.
	 * @see dmm.CAEXFile#getInterfaceClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class Lib</em>'.
	 * @see dmm.CAEXFile#getRoleClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_RoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class Lib</em>'.
	 * @see dmm.CAEXFile#getSystemUnitClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_SystemUnitClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.CAEXFile#getAttributeTypeLib <em>Attribute Type Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Type Lib</em>'.
	 * @see dmm.CAEXFile#getAttributeTypeLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_AttributeTypeLib();

	/**
	 * Returns the meta object for the attribute '{@link dmm.CAEXFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see dmm.CAEXFile#getFileName()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link dmm.CAEXFile#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see dmm.CAEXFile#getSchemaVersion()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_SchemaVersion();

	/**
	 * Returns the meta object for class '{@link dmm.CAEXObject <em>CAEX Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Object</em>'.
	 * @see dmm.CAEXObject
	 * @generated
	 */
	EClass getCAEXObject();

	/**
	 * Returns the meta object for the attribute '{@link dmm.CAEXObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dmm.CAEXObject#getID()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_ID();

	/**
	 * Returns the meta object for the attribute '{@link dmm.CAEXObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmm.CAEXObject#getName()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_Name();

	/**
	 * Returns the meta object for class '{@link dmm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see dmm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see dmm.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link dmm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see dmm.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link dmm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see dmm.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.DocumentRoot#getCAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CAEX File</em>'.
	 * @see dmm.DocumentRoot#getCAEXFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CAEXFile();

	/**
	 * Returns the meta object for class '{@link dmm.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Interface</em>'.
	 * @see dmm.ExternalInterface
	 * @generated
	 */
	EClass getExternalInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.ExternalInterface#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see dmm.ExternalInterface#getExternalInterface()
	 * @see #getExternalInterface()
	 * @generated
	 */
	EReference getExternalInterface_ExternalInterface();

	/**
	 * Returns the meta object for class '{@link dmm.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference Type</em>'.
	 * @see dmm.ExternalReferenceType
	 * @generated
	 */
	EClass getExternalReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.ExternalReferenceType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dmm.ExternalReferenceType#getAlias()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EAttribute getExternalReferenceType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dmm.ExternalReferenceType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see dmm.ExternalReferenceType#getPath()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EAttribute getExternalReferenceType_Path();

	/**
	 * Returns the meta object for class '{@link dmm.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Hierarchy</em>'.
	 * @see dmm.InstanceHierarchy
	 * @generated
	 */
	EClass getInstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.InstanceHierarchy#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see dmm.InstanceHierarchy#getInternalElement()
	 * @see #getInstanceHierarchy()
	 * @generated
	 */
	EReference getInstanceHierarchy_InternalElement();

	/**
	 * Returns the meta object for class '{@link dmm.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class Lib</em>'.
	 * @see dmm.InterfaceClassLib
	 * @generated
	 */
	EClass getInterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see dmm.InterfaceClassLib#getInterfaceClass()
	 * @see #getInterfaceClassLib()
	 * @generated
	 */
	EReference getInterfaceClassLib_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link dmm.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class</em>'.
	 * @see dmm.InterfaceClass
	 * @generated
	 */
	EClass getInterfaceClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.InterfaceClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dmm.InterfaceClass#getAttribute()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see dmm.InterfaceClass#getRefBaseClassPath()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EAttribute getInterfaceClass_RefBaseClassPath();

	/**
	 * Returns the meta object for the reference '{@link dmm.InterfaceClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see dmm.InterfaceClass#getBaseClass()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.InterfaceClass#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see dmm.InterfaceClass#getInterfaceClass()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link dmm.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Family</em>'.
	 * @see dmm.InterfaceFamily
	 * @generated
	 */
	EClass getInterfaceFamily();

	/**
	 * Returns the meta object for class '{@link dmm.InterfaceIDMapping <em>Interface ID Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface ID Mapping</em>'.
	 * @see dmm.InterfaceIDMapping
	 * @generated
	 */
	EClass getInterfaceIDMapping();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InterfaceIDMapping#getRoleInterfaceID <em>Role Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Interface ID</em>'.
	 * @see dmm.InterfaceIDMapping#getRoleInterfaceID()
	 * @see #getInterfaceIDMapping()
	 * @generated
	 */
	EAttribute getInterfaceIDMapping_RoleInterfaceID();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InterfaceIDMapping#getSystemUnitInterfaceID <em>System Unit Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Interface ID</em>'.
	 * @see dmm.InterfaceIDMapping#getSystemUnitInterfaceID()
	 * @see #getInterfaceIDMapping()
	 * @generated
	 */
	EAttribute getInterfaceIDMapping_SystemUnitInterfaceID();

	/**
	 * Returns the meta object for the reference '{@link dmm.InterfaceIDMapping#getRoleInterface <em>Role Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Interface</em>'.
	 * @see dmm.InterfaceIDMapping#getRoleInterface()
	 * @see #getInterfaceIDMapping()
	 * @generated
	 */
	EReference getInterfaceIDMapping_RoleInterface();

	/**
	 * Returns the meta object for the reference '{@link dmm.InterfaceIDMapping#getSystemUnitInterface <em>System Unit Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Unit Interface</em>'.
	 * @see dmm.InterfaceIDMapping#getSystemUnitInterface()
	 * @see #getInterfaceIDMapping()
	 * @generated
	 */
	EReference getInterfaceIDMapping_SystemUnitInterface();

	/**
	 * Returns the meta object for class '{@link dmm.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Element</em>'.
	 * @see dmm.InternalElement
	 * @generated
	 */
	EClass getInternalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.InternalElement#getRoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Requirements</em>'.
	 * @see dmm.InternalElement#getRoleRequirements()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_RoleRequirements();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base System Unit Path</em>'.
	 * @see dmm.InternalElement#getRefBaseSystemUnitPath()
	 * @see #getInternalElement()
	 * @generated
	 */
	EAttribute getInternalElement_RefBaseSystemUnitPath();

	/**
	 * Returns the meta object for the reference '{@link dmm.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base System Unit</em>'.
	 * @see dmm.InternalElement#getBaseSystemUnit()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_BaseSystemUnit();

	/**
	 * Returns the meta object for class '{@link dmm.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see dmm.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side A</em>'.
	 * @see dmm.InternalLink#getRefPartnerSideA()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideA();

	/**
	 * Returns the meta object for the attribute '{@link dmm.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side B</em>'.
	 * @see dmm.InternalLink#getRefPartnerSideB()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideB();

	/**
	 * Returns the meta object for the reference '{@link dmm.InternalLink#getPartnerSideA <em>Partner Side A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Side A</em>'.
	 * @see dmm.InternalLink#getPartnerSideA()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_PartnerSideA();

	/**
	 * Returns the meta object for the reference '{@link dmm.InternalLink#getPartnerSideB <em>Partner Side B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Side B</em>'.
	 * @see dmm.InternalLink#getPartnerSideB()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_PartnerSideB();

	/**
	 * Returns the meta object for class '{@link dmm.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see dmm.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Name Mapping</em>'.
	 * @see dmm.Mapping#getAttributeNameMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_AttributeNameMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.Mapping#getInterfaceIDMapping <em>Interface ID Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface ID Mapping</em>'.
	 * @see dmm.Mapping#getInterfaceIDMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_InterfaceIDMapping();

	/**
	 * Returns the meta object for class '{@link dmm.NominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominal Scaled Type</em>'.
	 * @see dmm.NominalScaledType
	 * @generated
	 */
	EClass getNominalScaledType();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.NominalScaledType#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Value</em>'.
	 * @see dmm.NominalScaledType#getRequiredValue()
	 * @see #getNominalScaledType()
	 * @generated
	 */
	EAttribute getNominalScaledType_RequiredValue();

	/**
	 * Returns the meta object for class '{@link dmm.OrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Scaled Type</em>'.
	 * @see dmm.OrdinalScaledType
	 * @generated
	 */
	EClass getOrdinalScaledType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.OrdinalScaledType#getRequiredMaxValue <em>Required Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Max Value</em>'.
	 * @see dmm.OrdinalScaledType#getRequiredMaxValue()
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	EAttribute getOrdinalScaledType_RequiredMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link dmm.OrdinalScaledType#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Value</em>'.
	 * @see dmm.OrdinalScaledType#getRequiredValue()
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	EAttribute getOrdinalScaledType_RequiredValue();

	/**
	 * Returns the meta object for the attribute '{@link dmm.OrdinalScaledType#getRequiredMinValue <em>Required Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Min Value</em>'.
	 * @see dmm.OrdinalScaledType#getRequiredMinValue()
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	EAttribute getOrdinalScaledType_RequiredMinValue();

	/**
	 * Returns the meta object for class '{@link dmm.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Semantic</em>'.
	 * @see dmm.RefSemantic
	 * @generated
	 */
	EClass getRefSemantic();

	/**
	 * Returns the meta object for the attribute '{@link dmm.RefSemantic#getCorrespondingAttributePath <em>Corresponding Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Attribute Path</em>'.
	 * @see dmm.RefSemantic#getCorrespondingAttributePath()
	 * @see #getRefSemantic()
	 * @generated
	 */
	EAttribute getRefSemantic_CorrespondingAttributePath();

	/**
	 * Returns the meta object for class '{@link dmm.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class Lib</em>'.
	 * @see dmm.RoleClassLib
	 * @generated
	 */
	EClass getRoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleClassLib#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see dmm.RoleClassLib#getRoleClass()
	 * @see #getRoleClassLib()
	 * @generated
	 */
	EReference getRoleClassLib_RoleClass();

	/**
	 * Returns the meta object for class '{@link dmm.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class</em>'.
	 * @see dmm.RoleClass
	 * @generated
	 */
	EClass getRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dmm.RoleClass#getAttribute()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see dmm.RoleClass#getExternalInterface()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_ExternalInterface();

	/**
	 * Returns the meta object for the attribute '{@link dmm.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see dmm.RoleClass#getRefBaseClassPath()
	 * @see #getRoleClass()
	 * @generated
	 */
	EAttribute getRoleClass_RefBaseClassPath();

	/**
	 * Returns the meta object for the reference '{@link dmm.RoleClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see dmm.RoleClass#getBaseClass()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleClass#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see dmm.RoleClass#getRoleClass()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_RoleClass();

	/**
	 * Returns the meta object for class '{@link dmm.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Family</em>'.
	 * @see dmm.RoleFamily
	 * @generated
	 */
	EClass getRoleFamily();

	/**
	 * Returns the meta object for class '{@link dmm.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requirements</em>'.
	 * @see dmm.RoleRequirements
	 * @generated
	 */
	EClass getRoleRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleRequirements#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dmm.RoleRequirements#getAttribute()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.RoleRequirements#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see dmm.RoleRequirements#getExternalInterface()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_ExternalInterface();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.RoleRequirements#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see dmm.RoleRequirements#getMappingObject()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_MappingObject();

	/**
	 * Returns the meta object for the reference '{@link dmm.RoleRequirements#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Class</em>'.
	 * @see dmm.RoleRequirements#getRoleClass()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_RoleClass();

	/**
	 * Returns the meta object for class '{@link dmm.SourceDocumentInformation <em>Source Document Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Document Information</em>'.
	 * @see dmm.SourceDocumentInformation
	 * @generated
	 */
	EClass getSourceDocumentInformation();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getLastWritingDateTime <em>Last Writing Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Writing Date Time</em>'.
	 * @see dmm.SourceDocumentInformation#getLastWritingDateTime()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_LastWritingDateTime();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginID <em>Origin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin ID</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginID()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginID();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginName <em>Origin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Name</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginName()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginName();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginProjectID <em>Origin Project ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Project ID</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginProjectID()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginProjectID();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginProjectTitle <em>Origin Project Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Project Title</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginProjectTitle()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginProjectTitle();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginRelease <em>Origin Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Release</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginRelease()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginRelease();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginVendor <em>Origin Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Vendor</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginVendor()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginVendor();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginVendorURL <em>Origin Vendor URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Vendor URL</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginVendorURL()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginVendorURL();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SourceDocumentInformation#getOriginVersion <em>Origin Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Version</em>'.
	 * @see dmm.SourceDocumentInformation#getOriginVersion()
	 * @see #getSourceDocumentInformation()
	 * @generated
	 */
	EAttribute getSourceDocumentInformation_OriginVersion();

	/**
	 * Returns the meta object for class '{@link dmm.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Role Class</em>'.
	 * @see dmm.SupportedRoleClass
	 * @generated
	 */
	EClass getSupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference '{@link dmm.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see dmm.SupportedRoleClass#getMappingObject()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EReference getSupportedRoleClass_MappingObject();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Role Class Path</em>'.
	 * @see dmm.SupportedRoleClass#getRefRoleClassPath()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EAttribute getSupportedRoleClass_RefRoleClassPath();

	/**
	 * Returns the meta object for the reference '{@link dmm.SupportedRoleClass#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Class</em>'.
	 * @see dmm.SupportedRoleClass#getRoleClass()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EReference getSupportedRoleClass_RoleClass();

	/**
	 * Returns the meta object for class '{@link dmm.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class Lib</em>'.
	 * @see dmm.SystemUnitClassLib
	 * @generated
	 */
	EClass getSystemUnitClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see dmm.SystemUnitClassLib#getSystemUnitClass()
	 * @see #getSystemUnitClassLib()
	 * @generated
	 */
	EReference getSystemUnitClassLib_SystemUnitClass();

	/**
	 * Returns the meta object for class '{@link dmm.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class</em>'.
	 * @see dmm.SystemUnitClass
	 * @generated
	 */
	EClass getSystemUnitClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dmm.SystemUnitClass#getAttribute()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see dmm.SystemUnitClass#getExternalInterface()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_ExternalInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see dmm.SystemUnitClass#getInternalElement()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Role Class</em>'.
	 * @see dmm.SystemUnitClass#getSupportedRoleClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_SupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getInternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Link</em>'.
	 * @see dmm.SystemUnitClass#getInternalLink()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalLink();

	/**
	 * Returns the meta object for the reference '{@link dmm.SystemUnitClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see dmm.SystemUnitClass#getBaseClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.SystemUnitClass#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see dmm.SystemUnitClass#getSystemUnitClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_SystemUnitClass();

	/**
	 * Returns the meta object for the attribute '{@link dmm.SystemUnitClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see dmm.SystemUnitClass#getRefBaseClassPath()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EAttribute getSystemUnitClass_RefBaseClassPath();

	/**
	 * Returns the meta object for class '{@link dmm.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Family</em>'.
	 * @see dmm.SystemUnitFamily
	 * @generated
	 */
	EClass getSystemUnitFamily();

	/**
	 * Returns the meta object for class '{@link dmm.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Type</em>'.
	 * @see dmm.UnknownType
	 * @generated
	 */
	EClass getUnknownType();

	/**
	 * Returns the meta object for the attribute '{@link dmm.UnknownType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirements</em>'.
	 * @see dmm.UnknownType#getRequirements()
	 * @see #getUnknownType()
	 * @generated
	 */
	EAttribute getUnknownType_Requirements();

	/**
	 * Returns the meta object for class '{@link dmm.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright</em>'.
	 * @see dmm.Copyright
	 * @generated
	 */
	EClass getCopyright();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Copyright#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmm.Copyright#getValue()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_Value();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Copyright#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see dmm.Copyright#getChangeMode()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_ChangeMode();

	/**
	 * Returns the meta object for class '{@link dmm.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see dmm.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmm.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Description#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see dmm.Description#getChangeMode()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_ChangeMode();

	/**
	 * Returns the meta object for class '{@link dmm.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see dmm.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Revision#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see dmm.Revision#getRevisionDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_RevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Revision#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see dmm.Revision#getOldVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OldVersion();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Revision#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see dmm.Revision#getNewVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Revision#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see dmm.Revision#getAuthorName()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Revision#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see dmm.Revision#getComment()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Comment();

	/**
	 * Returns the meta object for class '{@link dmm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see dmm.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Version#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmm.Version#getValue()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Value();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Version#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see dmm.Version#getChangeMode()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_ChangeMode();

	/**
	 * Returns the meta object for class '{@link dmm.AdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Information</em>'.
	 * @see dmm.AdditionalInformation
	 * @generated
	 */
	EClass getAdditionalInformation();

	/**
	 * Returns the meta object for class '{@link dmm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see dmm.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dmm.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link dmm.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dmm.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for class '{@link dmm.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Element</em>'.
	 * @see dmm.GenericElement
	 * @generated
	 */
	EClass getGenericElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.GenericElement#getNestedElements <em>Nested Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Elements</em>'.
	 * @see dmm.GenericElement#getNestedElements()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_NestedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link dmm.GenericElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dmm.GenericElement#getAttributes()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.GenericElement#getElementFeatureMap <em>Element Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Element Feature Map</em>'.
	 * @see dmm.GenericElement#getElementFeatureMap()
	 * @see #getGenericElement()
	 * @generated
	 */
	EAttribute getGenericElement_ElementFeatureMap();

	/**
	 * Returns the meta object for the attribute list '{@link dmm.GenericElement#getAttributeFeatureMap <em>Attribute Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute Feature Map</em>'.
	 * @see dmm.GenericElement#getAttributeFeatureMap()
	 * @see #getGenericElement()
	 * @generated
	 */
	EAttribute getGenericElement_AttributeFeatureMap();

	/**
	 * Returns the meta object for class '{@link dmm.GenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Attribute</em>'.
	 * @see dmm.GenericAttribute
	 * @generated
	 */
	EClass getGenericAttribute();

	/**
	 * Returns the meta object for enum '{@link dmm.ChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Mode</em>'.
	 * @see dmm.ChangeMode
	 * @generated
	 */
	EEnum getChangeMode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Data Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAttributeDataType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Change Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Change Mode Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getChangeModeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmmFactory getDmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmm.impl.AttributeFamilyImpl <em>Attribute Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AttributeFamilyImpl
		 * @see dmm.impl.DmmPackageImpl#getAttributeFamily()
		 * @generated
		 */
		EClass ATTRIBUTE_FAMILY = eINSTANCE.getAttributeFamily();

		/**
		 * The meta object literal for the '{@link dmm.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AttributeNameMappingImpl
		 * @see dmm.impl.DmmPackageImpl#getAttributeNameMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_NAME_MAPPING = eINSTANCE.getAttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Role Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_RoleAttributeName();

		/**
		 * The meta object literal for the '<em><b>System Unit Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_SystemUnitAttributeName();

		/**
		 * The meta object literal for the '<em><b>Role Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE = eINSTANCE.getAttributeNameMapping_RoleAttribute();

		/**
		 * The meta object literal for the '<em><b>System Unit Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE = eINSTANCE.getAttributeNameMapping_SystemUnitAttribute();

		/**
		 * The meta object literal for the '{@link dmm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AttributeImpl
		 * @see dmm.impl.DmmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Ref Semantic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__REF_SEMANTIC = eINSTANCE.getAttribute_RefSemantic();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONSTRAINT = eINSTANCE.getAttribute_Constraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE = eINSTANCE.getAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttribute_AttributeDataType();

		/**
		 * The meta object literal for the '<em><b>Ref Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REF_ATTRIBUTE_TYPE = eINSTANCE.getAttribute_RefAttributeType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UNIT = eINSTANCE.getAttribute_Unit();

		/**
		 * The meta object literal for the '{@link dmm.impl.AttributeLibImpl <em>Attribute Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AttributeLibImpl
		 * @see dmm.impl.DmmPackageImpl#getAttributeLib()
		 * @generated
		 */
		EClass ATTRIBUTE_LIB = eINSTANCE.getAttributeLib();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LIB__ATTRIBUTE_TYPE = eINSTANCE.getAttributeLib_AttributeType();

		/**
		 * The meta object literal for the '{@link dmm.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AttributeValueRequirementImpl
		 * @see dmm.impl.DmmPackageImpl#getAttributeValueRequirement()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_REQUIREMENT = eINSTANCE.getAttributeValueRequirement();

		/**
		 * The meta object literal for the '<em><b>Ordinal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_OrdinalScaledType();

		/**
		 * The meta object literal for the '<em><b>Nominal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_NominalScaledType();

		/**
		 * The meta object literal for the '<em><b>Unknown Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = eINSTANCE.getAttributeValueRequirement_UnknownType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_REQUIREMENT__NAME = eINSTANCE.getAttributeValueRequirement_Name();

		/**
		 * The meta object literal for the '{@link dmm.impl.CAEXBasicObjectImpl <em>CAEX Basic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.CAEXBasicObjectImpl
		 * @see dmm.impl.DmmPackageImpl#getCAEXBasicObject()
		 * @generated
		 */
		EClass CAEX_BASIC_OBJECT = eINSTANCE.getCAEXBasicObject();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_BASIC_OBJECT__CHANGE_MODE = eINSTANCE.getCAEXBasicObject_ChangeMode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__DESCRIPTION = eINSTANCE.getCAEXBasicObject_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__VERSION = eINSTANCE.getCAEXBasicObject_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__REVISION = eINSTANCE.getCAEXBasicObject_Revision();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__COPYRIGHT = eINSTANCE.getCAEXBasicObject_Copyright();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = eINSTANCE.getCAEXBasicObject_AdditionalInformation();

		/**
		 * The meta object literal for the '{@link dmm.impl.CAEXFileImpl <em>CAEX File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.CAEXFileImpl
		 * @see dmm.impl.DmmPackageImpl#getCAEXFile()
		 * @generated
		 */
		EClass CAEX_FILE = eINSTANCE.getCAEXFile();

		/**
		 * The meta object literal for the '<em><b>Superior Standard Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__SUPERIOR_STANDARD_VERSION = eINSTANCE.getCAEXFile_SuperiorStandardVersion();

		/**
		 * The meta object literal for the '<em><b>Source Document Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__SOURCE_DOCUMENT_INFORMATION = eINSTANCE.getCAEXFile_SourceDocumentInformation();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__EXTERNAL_REFERENCE = eINSTANCE.getCAEXFile_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Instance Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INSTANCE_HIERARCHY = eINSTANCE.getCAEXFile_InstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Interface Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INTERFACE_CLASS_LIB = eINSTANCE.getCAEXFile_InterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__ROLE_CLASS_LIB = eINSTANCE.getCAEXFile_RoleClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getCAEXFile_SystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__ATTRIBUTE_TYPE_LIB = eINSTANCE.getCAEXFile_AttributeTypeLib();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__FILE_NAME = eINSTANCE.getCAEXFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__SCHEMA_VERSION = eINSTANCE.getCAEXFile_SchemaVersion();

		/**
		 * The meta object literal for the '{@link dmm.impl.CAEXObjectImpl <em>CAEX Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.CAEXObjectImpl
		 * @see dmm.impl.DmmPackageImpl#getCAEXObject()
		 * @generated
		 */
		EClass CAEX_OBJECT = eINSTANCE.getCAEXObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__ID = eINSTANCE.getCAEXObject_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__NAME = eINSTANCE.getCAEXObject_Name();

		/**
		 * The meta object literal for the '{@link dmm.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.DocumentRootImpl
		 * @see dmm.impl.DmmPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>CAEX File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAEX_FILE = eINSTANCE.getDocumentRoot_CAEXFile();

		/**
		 * The meta object literal for the '{@link dmm.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.ExternalInterfaceImpl
		 * @see dmm.impl.DmmPackageImpl#getExternalInterface()
		 * @generated
		 */
		EClass EXTERNAL_INTERFACE = eINSTANCE.getExternalInterface();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_INTERFACE__EXTERNAL_INTERFACE = eINSTANCE.getExternalInterface_ExternalInterface();

		/**
		 * The meta object literal for the '{@link dmm.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.ExternalReferenceTypeImpl
		 * @see dmm.impl.DmmPackageImpl#getExternalReferenceType()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE_TYPE = eINSTANCE.getExternalReferenceType();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE_TYPE__ALIAS = eINSTANCE.getExternalReferenceType_Alias();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE_TYPE__PATH = eINSTANCE.getExternalReferenceType_Path();

		/**
		 * The meta object literal for the '{@link dmm.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InstanceHierarchyImpl
		 * @see dmm.impl.DmmPackageImpl#getInstanceHierarchy()
		 * @generated
		 */
		EClass INSTANCE_HIERARCHY = eINSTANCE.getInstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_HIERARCHY__INTERNAL_ELEMENT = eINSTANCE.getInstanceHierarchy_InternalElement();

		/**
		 * The meta object literal for the '{@link dmm.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InterfaceClassLibImpl
		 * @see dmm.impl.DmmPackageImpl#getInterfaceClassLib()
		 * @generated
		 */
		EClass INTERFACE_CLASS_LIB = eINSTANCE.getInterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS_LIB__INTERFACE_CLASS = eINSTANCE.getInterfaceClassLib_InterfaceClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InterfaceClassImpl
		 * @see dmm.impl.DmmPackageImpl#getInterfaceClass()
		 * @generated
		 */
		EClass INTERFACE_CLASS = eINSTANCE.getInterfaceClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__ATTRIBUTE = eINSTANCE.getInterfaceClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getInterfaceClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__BASE_CLASS = eINSTANCE.getInterfaceClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__INTERFACE_CLASS = eINSTANCE.getInterfaceClass_InterfaceClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InterfaceFamilyImpl
		 * @see dmm.impl.DmmPackageImpl#getInterfaceFamily()
		 * @generated
		 */
		EClass INTERFACE_FAMILY = eINSTANCE.getInterfaceFamily();

		/**
		 * The meta object literal for the '{@link dmm.impl.InterfaceIDMappingImpl <em>Interface ID Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InterfaceIDMappingImpl
		 * @see dmm.impl.DmmPackageImpl#getInterfaceIDMapping()
		 * @generated
		 */
		EClass INTERFACE_ID_MAPPING = eINSTANCE.getInterfaceIDMapping();

		/**
		 * The meta object literal for the '<em><b>Role Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID = eINSTANCE.getInterfaceIDMapping_RoleInterfaceID();

		/**
		 * The meta object literal for the '<em><b>System Unit Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID = eINSTANCE.getInterfaceIDMapping_SystemUnitInterfaceID();

		/**
		 * The meta object literal for the '<em><b>Role Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ID_MAPPING__ROLE_INTERFACE = eINSTANCE.getInterfaceIDMapping_RoleInterface();

		/**
		 * The meta object literal for the '<em><b>System Unit Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE = eINSTANCE.getInterfaceIDMapping_SystemUnitInterface();

		/**
		 * The meta object literal for the '{@link dmm.impl.InternalElementImpl <em>Internal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InternalElementImpl
		 * @see dmm.impl.DmmPackageImpl#getInternalElement()
		 * @generated
		 */
		EClass INTERNAL_ELEMENT = eINSTANCE.getInternalElement();

		/**
		 * The meta object literal for the '<em><b>Role Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__ROLE_REQUIREMENTS = eINSTANCE.getInternalElement_RoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Ref Base System Unit Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = eINSTANCE.getInternalElement_RefBaseSystemUnitPath();

		/**
		 * The meta object literal for the '<em><b>Base System Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__BASE_SYSTEM_UNIT = eINSTANCE.getInternalElement_BaseSystemUnit();

		/**
		 * The meta object literal for the '{@link dmm.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.InternalLinkImpl
		 * @see dmm.impl.DmmPackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_A = eINSTANCE.getInternalLink_RefPartnerSideA();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_B = eINSTANCE.getInternalLink_RefPartnerSideB();

		/**
		 * The meta object literal for the '<em><b>Partner Side A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__PARTNER_SIDE_A = eINSTANCE.getInternalLink_PartnerSideA();

		/**
		 * The meta object literal for the '<em><b>Partner Side B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__PARTNER_SIDE_B = eINSTANCE.getInternalLink_PartnerSideB();

		/**
		 * The meta object literal for the '{@link dmm.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.MappingImpl
		 * @see dmm.impl.DmmPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Attribute Name Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ATTRIBUTE_NAME_MAPPING = eINSTANCE.getMapping_AttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Interface ID Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__INTERFACE_ID_MAPPING = eINSTANCE.getMapping_InterfaceIDMapping();

		/**
		 * The meta object literal for the '{@link dmm.impl.NominalScaledTypeImpl <em>Nominal Scaled Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.NominalScaledTypeImpl
		 * @see dmm.impl.DmmPackageImpl#getNominalScaledType()
		 * @generated
		 */
		EClass NOMINAL_SCALED_TYPE = eINSTANCE.getNominalScaledType();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMINAL_SCALED_TYPE__REQUIRED_VALUE = eINSTANCE.getNominalScaledType_RequiredValue();

		/**
		 * The meta object literal for the '{@link dmm.impl.OrdinalScaledTypeImpl <em>Ordinal Scaled Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.OrdinalScaledTypeImpl
		 * @see dmm.impl.DmmPackageImpl#getOrdinalScaledType()
		 * @generated
		 */
		EClass ORDINAL_SCALED_TYPE = eINSTANCE.getOrdinalScaledType();

		/**
		 * The meta object literal for the '<em><b>Required Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE = eINSTANCE.getOrdinalScaledType_RequiredMaxValue();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED_TYPE__REQUIRED_VALUE = eINSTANCE.getOrdinalScaledType_RequiredValue();

		/**
		 * The meta object literal for the '<em><b>Required Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE = eINSTANCE.getOrdinalScaledType_RequiredMinValue();

		/**
		 * The meta object literal for the '{@link dmm.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RefSemanticImpl
		 * @see dmm.impl.DmmPackageImpl#getRefSemantic()
		 * @generated
		 */
		EClass REF_SEMANTIC = eINSTANCE.getRefSemantic();

		/**
		 * The meta object literal for the '<em><b>Corresponding Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = eINSTANCE.getRefSemantic_CorrespondingAttributePath();

		/**
		 * The meta object literal for the '{@link dmm.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RoleClassLibImpl
		 * @see dmm.impl.DmmPackageImpl#getRoleClassLib()
		 * @generated
		 */
		EClass ROLE_CLASS_LIB = eINSTANCE.getRoleClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS_LIB__ROLE_CLASS = eINSTANCE.getRoleClassLib_RoleClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.RoleClassImpl <em>Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RoleClassImpl
		 * @see dmm.impl.DmmPackageImpl#getRoleClass()
		 * @generated
		 */
		EClass ROLE_CLASS = eINSTANCE.getRoleClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__ATTRIBUTE = eINSTANCE.getRoleClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getRoleClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getRoleClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__BASE_CLASS = eINSTANCE.getRoleClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__ROLE_CLASS = eINSTANCE.getRoleClass_RoleClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.RoleFamilyImpl <em>Role Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RoleFamilyImpl
		 * @see dmm.impl.DmmPackageImpl#getRoleFamily()
		 * @generated
		 */
		EClass ROLE_FAMILY = eINSTANCE.getRoleFamily();

		/**
		 * The meta object literal for the '{@link dmm.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RoleRequirementsImpl
		 * @see dmm.impl.DmmPackageImpl#getRoleRequirements()
		 * @generated
		 */
		EClass ROLE_REQUIREMENTS = eINSTANCE.getRoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__ATTRIBUTE = eINSTANCE.getRoleRequirements_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = eINSTANCE.getRoleRequirements_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__MAPPING_OBJECT = eINSTANCE.getRoleRequirements_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__ROLE_CLASS = eINSTANCE.getRoleRequirements_RoleClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.SourceDocumentInformationImpl <em>Source Document Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.SourceDocumentInformationImpl
		 * @see dmm.impl.DmmPackageImpl#getSourceDocumentInformation()
		 * @generated
		 */
		EClass SOURCE_DOCUMENT_INFORMATION = eINSTANCE.getSourceDocumentInformation();

		/**
		 * The meta object literal for the '<em><b>Last Writing Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME = eINSTANCE.getSourceDocumentInformation_LastWritingDateTime();

		/**
		 * The meta object literal for the '<em><b>Origin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID = eINSTANCE.getSourceDocumentInformation_OriginID();

		/**
		 * The meta object literal for the '<em><b>Origin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME = eINSTANCE.getSourceDocumentInformation_OriginName();

		/**
		 * The meta object literal for the '<em><b>Origin Project ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID = eINSTANCE.getSourceDocumentInformation_OriginProjectID();

		/**
		 * The meta object literal for the '<em><b>Origin Project Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE = eINSTANCE.getSourceDocumentInformation_OriginProjectTitle();

		/**
		 * The meta object literal for the '<em><b>Origin Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE = eINSTANCE.getSourceDocumentInformation_OriginRelease();

		/**
		 * The meta object literal for the '<em><b>Origin Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR = eINSTANCE.getSourceDocumentInformation_OriginVendor();

		/**
		 * The meta object literal for the '<em><b>Origin Vendor URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL = eINSTANCE.getSourceDocumentInformation_OriginVendorURL();

		/**
		 * The meta object literal for the '<em><b>Origin Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION = eINSTANCE.getSourceDocumentInformation_OriginVersion();

		/**
		 * The meta object literal for the '{@link dmm.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.SupportedRoleClassImpl
		 * @see dmm.impl.DmmPackageImpl#getSupportedRoleClass()
		 * @generated
		 */
		EClass SUPPORTED_ROLE_CLASS = eINSTANCE.getSupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = eINSTANCE.getSupportedRoleClass_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Ref Role Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = eINSTANCE.getSupportedRoleClass_RefRoleClassPath();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_ROLE_CLASS__ROLE_CLASS = eINSTANCE.getSupportedRoleClass_RoleClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.SystemUnitClassLibImpl
		 * @see dmm.impl.DmmPackageImpl#getSystemUnitClassLib()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getSystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClassLib_SystemUnitClass();

		/**
		 * The meta object literal for the '{@link dmm.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.SystemUnitClassImpl
		 * @see dmm.impl.DmmPackageImpl#getSystemUnitClass()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__ATTRIBUTE = eINSTANCE.getSystemUnitClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getSystemUnitClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = eINSTANCE.getSystemUnitClass_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Supported Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = eINSTANCE.getSystemUnitClass_SupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Internal Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_LINK = eINSTANCE.getSystemUnitClass_InternalLink();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__BASE_CLASS = eINSTANCE.getSystemUnitClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClass_SystemUnitClass();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getSystemUnitClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '{@link dmm.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.SystemUnitFamilyImpl
		 * @see dmm.impl.DmmPackageImpl#getSystemUnitFamily()
		 * @generated
		 */
		EClass SYSTEM_UNIT_FAMILY = eINSTANCE.getSystemUnitFamily();

		/**
		 * The meta object literal for the '{@link dmm.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.UnknownTypeImpl
		 * @see dmm.impl.DmmPackageImpl#getUnknownType()
		 * @generated
		 */
		EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_TYPE__REQUIREMENTS = eINSTANCE.getUnknownType_Requirements();

		/**
		 * The meta object literal for the '{@link dmm.impl.CopyrightImpl <em>Copyright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.CopyrightImpl
		 * @see dmm.impl.DmmPackageImpl#getCopyright()
		 * @generated
		 */
		EClass COPYRIGHT = eINSTANCE.getCopyright();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__VALUE = eINSTANCE.getCopyright_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__CHANGE_MODE = eINSTANCE.getCopyright_ChangeMode();

		/**
		 * The meta object literal for the '{@link dmm.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.DescriptionImpl
		 * @see dmm.impl.DmmPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CHANGE_MODE = eINSTANCE.getDescription_ChangeMode();

		/**
		 * The meta object literal for the '{@link dmm.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.RevisionImpl
		 * @see dmm.impl.DmmPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_DATE = eINSTANCE.getRevision_RevisionDate();

		/**
		 * The meta object literal for the '<em><b>Old Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__OLD_VERSION = eINSTANCE.getRevision_OldVersion();

		/**
		 * The meta object literal for the '<em><b>New Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__NEW_VERSION = eINSTANCE.getRevision_NewVersion();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__AUTHOR_NAME = eINSTANCE.getRevision_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMENT = eINSTANCE.getRevision_Comment();

		/**
		 * The meta object literal for the '{@link dmm.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.VersionImpl
		 * @see dmm.impl.DmmPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VALUE = eINSTANCE.getVersion_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CHANGE_MODE = eINSTANCE.getVersion_ChangeMode();

		/**
		 * The meta object literal for the '{@link dmm.impl.AdditionalInformationImpl <em>Additional Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.AdditionalInformationImpl
		 * @see dmm.impl.DmmPackageImpl#getAdditionalInformation()
		 * @generated
		 */
		EClass ADDITIONAL_INFORMATION = eINSTANCE.getAdditionalInformation();

		/**
		 * The meta object literal for the '{@link dmm.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.ElementImpl
		 * @see dmm.impl.DmmPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '{@link dmm.impl.GenericElementImpl <em>Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.GenericElementImpl
		 * @see dmm.impl.DmmPackageImpl#getGenericElement()
		 * @generated
		 */
		EClass GENERIC_ELEMENT = eINSTANCE.getGenericElement();

		/**
		 * The meta object literal for the '<em><b>Nested Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__NESTED_ELEMENTS = eINSTANCE.getGenericElement_NestedElements();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__ATTRIBUTES = eINSTANCE.getGenericElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Element Feature Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ELEMENT__ELEMENT_FEATURE_MAP = eINSTANCE.getGenericElement_ElementFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Attribute Feature Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP = eINSTANCE.getGenericElement_AttributeFeatureMap();

		/**
		 * The meta object literal for the '{@link dmm.impl.GenericAttributeImpl <em>Generic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.impl.GenericAttributeImpl
		 * @see dmm.impl.DmmPackageImpl#getGenericAttribute()
		 * @generated
		 */
		EClass GENERIC_ATTRIBUTE = eINSTANCE.getGenericAttribute();

		/**
		 * The meta object literal for the '{@link dmm.ChangeMode <em>Change Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmm.ChangeMode
		 * @see dmm.impl.DmmPackageImpl#getChangeMode()
		 * @generated
		 */
		EEnum CHANGE_MODE = eINSTANCE.getChangeMode();

		/**
		 * The meta object literal for the '<em>Attribute Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see dmm.impl.DmmPackageImpl#getAttributeDataType()
		 * @generated
		 */
		EDataType ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttributeDataType();

		/**
		 * The meta object literal for the '<em>Change Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see dmm.impl.DmmPackageImpl#getChangeModeObject()
		 * @generated
		 */
		EDataType CHANGE_MODE_OBJECT = eINSTANCE.getChangeModeObject();

	}

} //DmmPackage
