package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._1custom._2withOrder;

import org.springframework.beans.BeansException;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class DemoBeanFactoryPostProcessor2 implements BeanFactoryPostProcessor, Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(" Inside DemoFactoryBeanPostProcessor2 ");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("restaurantBean");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.addPropertyValue("welcomeNote",
				"This is the modified welcomeNote values using BeanFactoryPostProcessor2");
	}

	@Override
	public int getOrder() {
		return -1;
		
	}

}
