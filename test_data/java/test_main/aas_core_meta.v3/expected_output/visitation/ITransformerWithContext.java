/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.visitation;

import aas_core.aas3_0.types.model.*;

/**
 * Define the interface for a transformer which recursively transforms
 * the instances into something else while the context is passed along.
 *
 * <p>When you use the transformer, please always call the main dispatching method
 * {@link ITransformerWithContext#transform}. You should most probably never call the {@code transform}
 * methods directly. They are only made public so that model classes can access them.
 *
 * @param <ContextT> structure of the context
 * @param <T> type of the transformation result
 */
public interface ITransformerWithContext<ContextT, T> {
  T transform(IClass that, ContextT context);
  T transformExtension(
    IExtension that,
    ContextT context
  );
  T transformAdministrativeInformation(
    IAdministrativeInformation that,
    ContextT context
  );
  T transformQualifier(
    IQualifier that,
    ContextT context
  );
  T transformAssetAdministrationShell(
    IAssetAdministrationShell that,
    ContextT context
  );
  T transformAssetInformation(
    IAssetInformation that,
    ContextT context
  );
  T transformResource(
    IResource that,
    ContextT context
  );
  T transformSpecificAssetId(
    ISpecificAssetId that,
    ContextT context
  );
  T transformSubmodel(
    ISubmodel that,
    ContextT context
  );
  T transformRelationshipElement(
    IRelationshipElement that,
    ContextT context
  );
  T transformSubmodelElementList(
    ISubmodelElementList that,
    ContextT context
  );
  T transformSubmodelElementCollection(
    ISubmodelElementCollection that,
    ContextT context
  );
  T transformProperty(
    IProperty that,
    ContextT context
  );
  T transformMultiLanguageProperty(
    IMultiLanguageProperty that,
    ContextT context
  );
  T transformRange(
    IRange that,
    ContextT context
  );
  T transformReferenceElement(
    IReferenceElement that,
    ContextT context
  );
  T transformBlob(
    IBlob that,
    ContextT context
  );
  T transformFile(
    IFile that,
    ContextT context
  );
  T transformAnnotatedRelationshipElement(
    IAnnotatedRelationshipElement that,
    ContextT context
  );
  T transformEntity(
    IEntity that,
    ContextT context
  );
  T transformEventPayload(
    IEventPayload that,
    ContextT context
  );
  T transformBasicEventElement(
    IBasicEventElement that,
    ContextT context
  );
  T transformOperation(
    IOperation that,
    ContextT context
  );
  T transformOperationVariable(
    IOperationVariable that,
    ContextT context
  );
  T transformCapability(
    ICapability that,
    ContextT context
  );
  T transformConceptDescription(
    IConceptDescription that,
    ContextT context
  );
  T transformReference(
    IReference that,
    ContextT context
  );
  T transformKey(
    IKey that,
    ContextT context
  );
  T transformLangStringNameType(
    ILangStringNameType that,
    ContextT context
  );
  T transformLangStringTextType(
    ILangStringTextType that,
    ContextT context
  );
  T transformEnvironment(
    IEnvironment that,
    ContextT context
  );
  T transformEmbeddedDataSpecification(
    IEmbeddedDataSpecification that,
    ContextT context
  );
  T transformLevelType(
    ILevelType that,
    ContextT context
  );
  T transformValueReferencePair(
    IValueReferencePair that,
    ContextT context
  );
  T transformValueList(
    IValueList that,
    ContextT context
  );
  T transformLangStringPreferredNameTypeIec61360(
    ILangStringPreferredNameTypeIec61360 that,
    ContextT context
  );
  T transformLangStringShortNameTypeIec61360(
    ILangStringShortNameTypeIec61360 that,
    ContextT context
  );
  T transformLangStringDefinitionTypeIec61360(
    ILangStringDefinitionTypeIec61360 that,
    ContextT context
  );
  T transformDataSpecificationIec61360(
    IDataSpecificationIec61360 that,
    ContextT context
  );
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */