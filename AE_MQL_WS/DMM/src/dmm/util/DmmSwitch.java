/**
 */
package dmm.util;

import dmm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dmm.DmmPackage
 * @generated
 */
public class DmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmmSwitch() {
		if (modelPackage == null) {
			modelPackage = DmmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DmmPackage.ATTRIBUTE_FAMILY: {
				AttributeFamily attributeFamily = (AttributeFamily)theEObject;
				T result = caseAttributeFamily(attributeFamily);
				if (result == null) result = caseAttribute(attributeFamily);
				if (result == null) result = caseCAEXObject(attributeFamily);
				if (result == null) result = caseCAEXBasicObject(attributeFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ATTRIBUTE_NAME_MAPPING: {
				AttributeNameMapping attributeNameMapping = (AttributeNameMapping)theEObject;
				T result = caseAttributeNameMapping(attributeNameMapping);
				if (result == null) result = caseCAEXBasicObject(attributeNameMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseCAEXObject(attribute);
				if (result == null) result = caseCAEXBasicObject(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ATTRIBUTE_LIB: {
				AttributeLib attributeLib = (AttributeLib)theEObject;
				T result = caseAttributeLib(attributeLib);
				if (result == null) result = caseCAEXObject(attributeLib);
				if (result == null) result = caseCAEXBasicObject(attributeLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ATTRIBUTE_VALUE_REQUIREMENT: {
				AttributeValueRequirement attributeValueRequirement = (AttributeValueRequirement)theEObject;
				T result = caseAttributeValueRequirement(attributeValueRequirement);
				if (result == null) result = caseCAEXBasicObject(attributeValueRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.CAEX_BASIC_OBJECT: {
				CAEXBasicObject caexBasicObject = (CAEXBasicObject)theEObject;
				T result = caseCAEXBasicObject(caexBasicObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.CAEX_FILE: {
				CAEXFile caexFile = (CAEXFile)theEObject;
				T result = caseCAEXFile(caexFile);
				if (result == null) result = caseCAEXBasicObject(caexFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.CAEX_OBJECT: {
				CAEXObject caexObject = (CAEXObject)theEObject;
				T result = caseCAEXObject(caexObject);
				if (result == null) result = caseCAEXBasicObject(caexObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.EXTERNAL_INTERFACE: {
				ExternalInterface externalInterface = (ExternalInterface)theEObject;
				T result = caseExternalInterface(externalInterface);
				if (result == null) result = caseInterfaceClass(externalInterface);
				if (result == null) result = caseCAEXObject(externalInterface);
				if (result == null) result = caseCAEXBasicObject(externalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.EXTERNAL_REFERENCE_TYPE: {
				ExternalReferenceType externalReferenceType = (ExternalReferenceType)theEObject;
				T result = caseExternalReferenceType(externalReferenceType);
				if (result == null) result = caseCAEXBasicObject(externalReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INSTANCE_HIERARCHY: {
				InstanceHierarchy instanceHierarchy = (InstanceHierarchy)theEObject;
				T result = caseInstanceHierarchy(instanceHierarchy);
				if (result == null) result = caseCAEXObject(instanceHierarchy);
				if (result == null) result = caseCAEXBasicObject(instanceHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERFACE_CLASS_LIB: {
				InterfaceClassLib interfaceClassLib = (InterfaceClassLib)theEObject;
				T result = caseInterfaceClassLib(interfaceClassLib);
				if (result == null) result = caseCAEXObject(interfaceClassLib);
				if (result == null) result = caseCAEXBasicObject(interfaceClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERFACE_CLASS: {
				InterfaceClass interfaceClass = (InterfaceClass)theEObject;
				T result = caseInterfaceClass(interfaceClass);
				if (result == null) result = caseCAEXObject(interfaceClass);
				if (result == null) result = caseCAEXBasicObject(interfaceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERFACE_FAMILY: {
				InterfaceFamily interfaceFamily = (InterfaceFamily)theEObject;
				T result = caseInterfaceFamily(interfaceFamily);
				if (result == null) result = caseInterfaceClass(interfaceFamily);
				if (result == null) result = caseCAEXObject(interfaceFamily);
				if (result == null) result = caseCAEXBasicObject(interfaceFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERFACE_ID_MAPPING: {
				InterfaceIDMapping interfaceIDMapping = (InterfaceIDMapping)theEObject;
				T result = caseInterfaceIDMapping(interfaceIDMapping);
				if (result == null) result = caseCAEXBasicObject(interfaceIDMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERNAL_ELEMENT: {
				InternalElement internalElement = (InternalElement)theEObject;
				T result = caseInternalElement(internalElement);
				if (result == null) result = caseSystemUnitClass(internalElement);
				if (result == null) result = caseCAEXObject(internalElement);
				if (result == null) result = caseCAEXBasicObject(internalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.INTERNAL_LINK: {
				InternalLink internalLink = (InternalLink)theEObject;
				T result = caseInternalLink(internalLink);
				if (result == null) result = caseCAEXObject(internalLink);
				if (result == null) result = caseCAEXBasicObject(internalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseCAEXBasicObject(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.NOMINAL_SCALED_TYPE: {
				NominalScaledType nominalScaledType = (NominalScaledType)theEObject;
				T result = caseNominalScaledType(nominalScaledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ORDINAL_SCALED_TYPE: {
				OrdinalScaledType ordinalScaledType = (OrdinalScaledType)theEObject;
				T result = caseOrdinalScaledType(ordinalScaledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.REF_SEMANTIC: {
				RefSemantic refSemantic = (RefSemantic)theEObject;
				T result = caseRefSemantic(refSemantic);
				if (result == null) result = caseCAEXBasicObject(refSemantic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ROLE_CLASS_LIB: {
				RoleClassLib roleClassLib = (RoleClassLib)theEObject;
				T result = caseRoleClassLib(roleClassLib);
				if (result == null) result = caseCAEXObject(roleClassLib);
				if (result == null) result = caseCAEXBasicObject(roleClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ROLE_CLASS: {
				RoleClass roleClass = (RoleClass)theEObject;
				T result = caseRoleClass(roleClass);
				if (result == null) result = caseCAEXObject(roleClass);
				if (result == null) result = caseCAEXBasicObject(roleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ROLE_FAMILY: {
				RoleFamily roleFamily = (RoleFamily)theEObject;
				T result = caseRoleFamily(roleFamily);
				if (result == null) result = caseRoleClass(roleFamily);
				if (result == null) result = caseCAEXObject(roleFamily);
				if (result == null) result = caseCAEXBasicObject(roleFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ROLE_REQUIREMENTS: {
				RoleRequirements roleRequirements = (RoleRequirements)theEObject;
				T result = caseRoleRequirements(roleRequirements);
				if (result == null) result = caseCAEXBasicObject(roleRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.SOURCE_DOCUMENT_INFORMATION: {
				SourceDocumentInformation sourceDocumentInformation = (SourceDocumentInformation)theEObject;
				T result = caseSourceDocumentInformation(sourceDocumentInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.SUPPORTED_ROLE_CLASS: {
				SupportedRoleClass supportedRoleClass = (SupportedRoleClass)theEObject;
				T result = caseSupportedRoleClass(supportedRoleClass);
				if (result == null) result = caseCAEXBasicObject(supportedRoleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.SYSTEM_UNIT_CLASS_LIB: {
				SystemUnitClassLib systemUnitClassLib = (SystemUnitClassLib)theEObject;
				T result = caseSystemUnitClassLib(systemUnitClassLib);
				if (result == null) result = caseCAEXObject(systemUnitClassLib);
				if (result == null) result = caseCAEXBasicObject(systemUnitClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.SYSTEM_UNIT_CLASS: {
				SystemUnitClass systemUnitClass = (SystemUnitClass)theEObject;
				T result = caseSystemUnitClass(systemUnitClass);
				if (result == null) result = caseCAEXObject(systemUnitClass);
				if (result == null) result = caseCAEXBasicObject(systemUnitClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.SYSTEM_UNIT_FAMILY: {
				SystemUnitFamily systemUnitFamily = (SystemUnitFamily)theEObject;
				T result = caseSystemUnitFamily(systemUnitFamily);
				if (result == null) result = caseSystemUnitClass(systemUnitFamily);
				if (result == null) result = caseCAEXObject(systemUnitFamily);
				if (result == null) result = caseCAEXBasicObject(systemUnitFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.UNKNOWN_TYPE: {
				UnknownType unknownType = (UnknownType)theEObject;
				T result = caseUnknownType(unknownType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.COPYRIGHT: {
				Copyright copyright = (Copyright)theEObject;
				T result = caseCopyright(copyright);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = caseCAEXBasicObject(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ADDITIONAL_INFORMATION: {
				AdditionalInformation additionalInformation = (AdditionalInformation)theEObject;
				T result = caseAdditionalInformation(additionalInformation);
				if (result == null) result = caseGenericElement(additionalInformation);
				if (result == null) result = caseElement(additionalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.GENERIC_ELEMENT: {
				GenericElement genericElement = (GenericElement)theEObject;
				T result = caseGenericElement(genericElement);
				if (result == null) result = caseElement(genericElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmmPackage.GENERIC_ATTRIBUTE: {
				GenericAttribute genericAttribute = (GenericAttribute)theEObject;
				T result = caseGenericAttribute(genericAttribute);
				if (result == null) result = caseElement(genericAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeFamily(AttributeFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping(AttributeNameMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeLib(AttributeLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRequirement(AttributeValueRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Basic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXBasicObject(CAEXBasicObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile(CAEXFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXObject(CAEXObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalInterface(ExternalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType(ExternalReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceHierarchy(InstanceHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClassLib(InterfaceClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass(InterfaceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceFamily(InterfaceFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface ID Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceIDMapping(InterfaceIDMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement(InternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink(InternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominal Scaled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalScaledType(NominalScaledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType(OrdinalScaledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSemantic(RefSemantic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClassLib(RoleClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClass(RoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFamily(RoleFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequirements(RoleRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation(SourceDocumentInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedRoleClass(SupportedRoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClassLib(SystemUnitClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClass(SystemUnitClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitFamily(SystemUnitFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownType(UnknownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright(Copyright object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision(Revision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalInformation(AdditionalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement(GenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAttribute(GenericAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DmmSwitch
