/**
 */
package dmm.util;

import dmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dmm.DmmPackage
 * @generated
 */
public class DmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DmmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmmSwitch<Adapter> modelSwitch =
		new DmmSwitch<Adapter>() {
			@Override
			public Adapter caseAttributeFamily(AttributeFamily object) {
				return createAttributeFamilyAdapter();
			}
			@Override
			public Adapter caseAttributeNameMapping(AttributeNameMapping object) {
				return createAttributeNameMappingAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeLib(AttributeLib object) {
				return createAttributeLibAdapter();
			}
			@Override
			public Adapter caseAttributeValueRequirement(AttributeValueRequirement object) {
				return createAttributeValueRequirementAdapter();
			}
			@Override
			public Adapter caseCAEXBasicObject(CAEXBasicObject object) {
				return createCAEXBasicObjectAdapter();
			}
			@Override
			public Adapter caseCAEXFile(CAEXFile object) {
				return createCAEXFileAdapter();
			}
			@Override
			public Adapter caseCAEXObject(CAEXObject object) {
				return createCAEXObjectAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExternalInterface(ExternalInterface object) {
				return createExternalInterfaceAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType(ExternalReferenceType object) {
				return createExternalReferenceTypeAdapter();
			}
			@Override
			public Adapter caseInstanceHierarchy(InstanceHierarchy object) {
				return createInstanceHierarchyAdapter();
			}
			@Override
			public Adapter caseInterfaceClassLib(InterfaceClassLib object) {
				return createInterfaceClassLibAdapter();
			}
			@Override
			public Adapter caseInterfaceClass(InterfaceClass object) {
				return createInterfaceClassAdapter();
			}
			@Override
			public Adapter caseInterfaceFamily(InterfaceFamily object) {
				return createInterfaceFamilyAdapter();
			}
			@Override
			public Adapter caseInterfaceIDMapping(InterfaceIDMapping object) {
				return createInterfaceIDMappingAdapter();
			}
			@Override
			public Adapter caseInternalElement(InternalElement object) {
				return createInternalElementAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseNominalScaledType(NominalScaledType object) {
				return createNominalScaledTypeAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType(OrdinalScaledType object) {
				return createOrdinalScaledTypeAdapter();
			}
			@Override
			public Adapter caseRefSemantic(RefSemantic object) {
				return createRefSemanticAdapter();
			}
			@Override
			public Adapter caseRoleClassLib(RoleClassLib object) {
				return createRoleClassLibAdapter();
			}
			@Override
			public Adapter caseRoleClass(RoleClass object) {
				return createRoleClassAdapter();
			}
			@Override
			public Adapter caseRoleFamily(RoleFamily object) {
				return createRoleFamilyAdapter();
			}
			@Override
			public Adapter caseRoleRequirements(RoleRequirements object) {
				return createRoleRequirementsAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation(SourceDocumentInformation object) {
				return createSourceDocumentInformationAdapter();
			}
			@Override
			public Adapter caseSupportedRoleClass(SupportedRoleClass object) {
				return createSupportedRoleClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitClassLib(SystemUnitClassLib object) {
				return createSystemUnitClassLibAdapter();
			}
			@Override
			public Adapter caseSystemUnitClass(SystemUnitClass object) {
				return createSystemUnitClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitFamily(SystemUnitFamily object) {
				return createSystemUnitFamilyAdapter();
			}
			@Override
			public Adapter caseUnknownType(UnknownType object) {
				return createUnknownTypeAdapter();
			}
			@Override
			public Adapter caseCopyright(Copyright object) {
				return createCopyrightAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseAdditionalInformation(AdditionalInformation object) {
				return createAdditionalInformationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseGenericElement(GenericElement object) {
				return createGenericElementAdapter();
			}
			@Override
			public Adapter caseGenericAttribute(GenericAttribute object) {
				return createGenericAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dmm.AttributeFamily <em>Attribute Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.AttributeFamily
	 * @generated
	 */
	public Adapter createAttributeFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.AttributeNameMapping
	 * @generated
	 */
	public Adapter createAttributeNameMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.AttributeLib <em>Attribute Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.AttributeLib
	 * @generated
	 */
	public Adapter createAttributeLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.AttributeValueRequirement
	 * @generated
	 */
	public Adapter createAttributeValueRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.CAEXBasicObject <em>CAEX Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.CAEXBasicObject
	 * @generated
	 */
	public Adapter createCAEXBasicObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.CAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.CAEXFile
	 * @generated
	 */
	public Adapter createCAEXFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.CAEXObject <em>CAEX Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.CAEXObject
	 * @generated
	 */
	public Adapter createCAEXObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.ExternalInterface
	 * @generated
	 */
	public Adapter createExternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.ExternalReferenceType
	 * @generated
	 */
	public Adapter createExternalReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InstanceHierarchy
	 * @generated
	 */
	public Adapter createInstanceHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InterfaceClassLib
	 * @generated
	 */
	public Adapter createInterfaceClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InterfaceClass
	 * @generated
	 */
	public Adapter createInterfaceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InterfaceFamily
	 * @generated
	 */
	public Adapter createInterfaceFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InterfaceIDMapping <em>Interface ID Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InterfaceIDMapping
	 * @generated
	 */
	public Adapter createInterfaceIDMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InternalElement
	 * @generated
	 */
	public Adapter createInternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.NominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.NominalScaledType
	 * @generated
	 */
	public Adapter createNominalScaledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.OrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.OrdinalScaledType
	 * @generated
	 */
	public Adapter createOrdinalScaledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.RefSemantic
	 * @generated
	 */
	public Adapter createRefSemanticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.RoleClassLib
	 * @generated
	 */
	public Adapter createRoleClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.RoleClass
	 * @generated
	 */
	public Adapter createRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.RoleFamily
	 * @generated
	 */
	public Adapter createRoleFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.RoleRequirements
	 * @generated
	 */
	public Adapter createRoleRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.SourceDocumentInformation <em>Source Document Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.SourceDocumentInformation
	 * @generated
	 */
	public Adapter createSourceDocumentInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.SupportedRoleClass
	 * @generated
	 */
	public Adapter createSupportedRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.SystemUnitClassLib
	 * @generated
	 */
	public Adapter createSystemUnitClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.SystemUnitClass
	 * @generated
	 */
	public Adapter createSystemUnitClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.SystemUnitFamily
	 * @generated
	 */
	public Adapter createSystemUnitFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.UnknownType
	 * @generated
	 */
	public Adapter createUnknownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Copyright
	 * @generated
	 */
	public Adapter createCopyrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.AdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.AdditionalInformation
	 * @generated
	 */
	public Adapter createAdditionalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.GenericElement
	 * @generated
	 */
	public Adapter createGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmm.GenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmm.GenericAttribute
	 * @generated
	 */
	public Adapter createGenericAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DmmAdapterFactory
