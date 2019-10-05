package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._1custom._1firstExample;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(" Inside DemoFactoryBeanPostProcessor ");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("restaurantBean");

		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.addPropertyValue("welcomeNote",
				"This is the modified welcomeNote values using BeanFactoryPostProcessor");
	}
}
