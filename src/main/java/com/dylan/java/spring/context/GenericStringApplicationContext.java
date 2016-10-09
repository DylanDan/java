package com.dylan.java.spring.context;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class GenericStringApplicationContext extends GenericApplicationContext {
	
	private final XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(this);


	/**
	 * Create a new GenericXmlApplicationContext that needs to be
	 * {@link #load loaded} and then manually {@link #refresh refreshed}.
	 */
	public GenericStringApplicationContext() {
	}

	/**
	 * Create a new GenericXmlApplicationContext, loading bean definitions
	 * from the given resources and automatically refreshing the context.
	 * @param resources the resources to load from
	 */
	public GenericStringApplicationContext(Resource... resources) {
		load(resources);
		refresh();
	}

	/**
	 * Create a new GenericXmlApplicationContext, loading bean definitions
	 * from the given resource locations and automatically refreshing the context.
	 * @param resourceLocations the resources to load from
	 */
	public GenericStringApplicationContext(String... resourceLocations) {
		load(resourceLocations);
		refresh();
	}

	/**
	 * Create a new GenericXmlApplicationContext, loading bean definitions
	 * from the given resource locations and automatically refreshing the context.
	 * @param relativeClass class whose package will be used as a prefix when
	 * loading each specified resource name
	 * @param resourceNames relatively-qualified names of resources to load
	 */
	public GenericStringApplicationContext(Class<?> relativeClass, String... resourceNames) {
		load(relativeClass, resourceNames);
		refresh();
	}


	/**
	 * Exposes the underlying {@link XmlBeanDefinitionReader} for additional
	 * configuration facilities and {@code loadBeanDefinition} variations.
	 */
	public final XmlBeanDefinitionReader getReader() {
		return this.reader;
	}

	/**
	 * Set whether to use XML validation. Default is {@code true}.
	 */
	public void setValidating(boolean validating) {
		this.reader.setValidating(validating);
	}

	/**
	 * Delegates the given environment to underlying {@link XmlBeanDefinitionReader}.
	 * Should be called before any call to {@code #load}.
	 */
	@Override
	public void setEnvironment(ConfigurableEnvironment environment) {
		super.setEnvironment(environment);
		this.reader.setEnvironment(getEnvironment());
	}

	/**
	 * Load bean definitions from the given XML resources.
	 * @param resources one or more resources to load from
	 */
	public void load(Resource... resources) {
		this.reader.loadBeanDefinitions(resources);
	}

	/**
	 * Load bean definitions from the given XML resources.
	 * @param resourceLocations one or more resource locations to load from
	 */
	public void load(String... resourceLocations) {
		this.reader.loadBeanDefinitions(resourceLocations);
	}

	/**
	 * Load bean definitions from the given XML resources.
	 * @param relativeClass class whose package will be used as a prefix when
	 * loading each specified resource name
	 * @param resourceNames relatively-qualified names of resources to load
	 */
	public void load(Class<?> relativeClass, String... resourceNames) {
		Resource[] resources = new Resource[resourceNames.length];
		for (int i = 0; i < resourceNames.length; i++) {
			resources[i] = new ClassPathResource(resourceNames[i], relativeClass);
		}
		this.load(resources);
	}
	
	public void setParent(ApplicationContext parent){
		super.setParent(parent);
	}

}
