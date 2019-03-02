package org.xtext.ui.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import dmm.impl.DmmPackageImpl;

public class VQLLauncher {
	private static ResourceSet domainModelResourceSet = new ResourceSetImpl();
	private static ResourceSet patternResourceSet = new ResourceSetImpl();
	private static Resource patternResource;
	private static EMFScope emfScope;
	
	public static Collection<IPatternMatch> executeQueries() throws IOException {
		System.out.println("VQLLauncher: executeQueryPattern() called... ");
		ArrayList<Pattern> queryPatterns = new ArrayList<Pattern>();
		final String queryPatternPrefix = "dmm.query_";
		ArrayList<IPatternMatch> queryResults = new ArrayList<IPatternMatch>();
		final StringBuilder results = new StringBuilder();
		Collection<? extends IPatternMatch> matches = null;
				
		if(domainModelResourceSet.getResources().size() == 0) loadTransformedDomainModelResourceSet();
		
		if(domainModelResourceSet.getResources().size() > 0){
			try {
				if(emfScope == null) emfScope = initializeModelScope();
				
				//get all matches of the pattern
				AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(emfScope);
				EMFPatternLanguageStandaloneSetup e = new EMFPatternLanguageStandaloneSetup();
				e.createInjectorAndDoEMFRegistration();
				
				loadPatternResourceSet();
			
				if (patternResource != null){
					if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
						EObject topElement = patternResource.getContents().get(0);
						if (topElement instanceof PatternModel) {
							for (Pattern p : ((PatternModel) topElement).getPatterns()) {
								if (CorePatternLanguageHelper.getFullyQualifiedName(p).startsWith(queryPatternPrefix)) {
									queryPatterns.add(p);
								}
							}
						}
					}
				}
				
				if(queryPatterns.isEmpty()) throw new RuntimeException(String.format("Pattern(s) with the prefix %s not found", queryPatternPrefix));
				
				long query_execution_startTime = System.nanoTime();
				
				for(int i=0; i<queryPatterns.size();i++){
					Pattern p = queryPatterns.get(i);
					//Translate patterns to query specifications
					SpecificationBuilder builder = new SpecificationBuilder();
	
					// attempt to retrieve a registered query specification
					ViatraQueryMatcher<? extends IPatternMatch> matcher = engine.getMatcher(builder.getOrCreateSpecification(p));
					if (matcher != null) {
						System.out.println("VQLLauncher: Retrieving all matches for query pattern " + p.getName() + "... ");
						matches = matcher.getAllMatches();
						System.out.println("VQLLauncher: " + matches.size() + " match(es) found.");
						queryResults.addAll(matches);
					}
				}
				
				long query_execution_endTime = System.nanoTime();
				long query_execution_duration = query_execution_endTime - query_execution_startTime;
				System.out.println("VQLLauncher: Query execution (init + process) took " + (query_execution_duration/1000000) + " ms.");
				
				patternResource.unload();  
				
				// Wipe the engine. After a wipe, new patterns can be rebuilt with much less overhead than complete traversal (as the base indexes will be kept).
				engine.wipe();

				// completely dispose of the engine once's it is not needed
				engine.dispose();
				domainModelResourceSet.getResources().get(0).unload();
			} catch (ViatraQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		
		}else{
			System.out.println("VQLLauncher: Transformed Domainmodel not loaded.");
		}
		
		return queryResults;
	}
		
	public static void loadTransformedDomainModelResourceSet(){
		System.out.println("VQLLauncher: Loading Transformed Domain Model from " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
		EPackage ePackage = DmmPackageImpl.init();
		domainModelResourceSet.getPackageRegistry().put(Constants.DMM_NsURI, ePackage);
		domainModelResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource domainModelResource = domainModelResourceSet.createResource(URI.createFileURI(Constants.TRANSFORMED_DOMAINMODEL_PATH));
		try {
			domainModelResource.load(new HashMap<>());
			if(domainModelResource.isLoaded()){
				System.out.println("VQLLauncher: Transformed Domain Model successfully loaded from " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
			}else{
				System.out.println("VQLLauncher: Transformed Domain Model could not be loaded from " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
			}
			domainModelResourceSet.getResources().add(domainModelResource);
			emfScope = initializeModelScope();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void loadPatternResourceSet(){
		System.out.println("VQLLauncher: Query Resource loading from " + Constants.VQL_QUERY_PATH);
		patternResourceSet = new ResourceSetImpl();
		patternResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(Constants.VQL_QUERY_PATH);
		patternResource = patternResourceSet.getResource(fileURI, true);
		if(patternResource != null){
			System.out.println("VQLLauncher: Query Resource successfully loaded from " + Constants.VQL_QUERY_PATH);
		}else{
			System.out.println("VQLLauncher: Query Resource could not be loaded from " + Constants.VQL_QUERY_PATH);
		}
	}
	
	private static EMFScope initializeModelScope() throws IOException, ViatraQueryException {
		System.out.println("VQLLauncher: Initializing EMFScope for " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
		ResourceSet domainModelResourceSet = new ResourceSetImpl();
		EPackage ePackage = DmmPackageImpl.init();
		domainModelResourceSet.getPackageRegistry().put(Constants.DMM_NsURI, ePackage);
		domainModelResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource domainModelResource = domainModelResourceSet.createResource(URI.createFileURI(Constants.TRANSFORMED_DOMAINMODEL_PATH));
		domainModelResource.load(new HashMap<>());
		domainModelResourceSet.getResources().add(domainModelResource);
		if(domainModelResource.isLoaded()){
			System.out.println("VQLLauncher: EMFScope successfully initialized for " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
		}else{
			System.out.println("VQLLauncher: EMFScope could not be initialized for " + Constants.TRANSFORMED_DOMAINMODEL_PATH);
		}
		return new EMFScope(domainModelResourceSet);
	}
	
	private static boolean subtractFrom(ArrayList<IPatternMatch> queryResults, IPatternMatch mSub){
		for(IPatternMatch m: queryResults) 
			if(equals(m,mSub)){ 
				queryResults.remove(m);
				return true;
			}
		return false;
	}
	
	private static boolean equals(IPatternMatch m1, IPatternMatch m2){
		if(m1.parameterNames().size() == m2.parameterNames().size()){
			ArrayList<Object> m1objects = new ArrayList<Object>();
			for(String n: m1.parameterNames()) m1objects.add(m1.get(n));
			for(String n: m2.parameterNames()) 
				if(!m1objects.contains(m2.get(n))) return false;
			return true;
		}
		return false;
	}
}
