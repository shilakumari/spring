package com.tutorial.spring.ioc._9BeanPostProcessor._2orderedBeanPP;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered {
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println(
				"DemoBeanPostProcessor Processing bean instance after initialization (i.e. just after init life cycle event) of : "
						+ beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println(
				"DemoBeanPostProcessor Processing bean instance before initialization (i.e. just before init life cycle event) of : "
						+ beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 2;
	}
}
