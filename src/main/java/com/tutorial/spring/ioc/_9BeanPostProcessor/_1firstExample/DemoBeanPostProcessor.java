package com.tutorial.spring.ioc._9BeanPostProcessor._1firstExample;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object args0, String args1) {
		System.out.println("Processing bean instance after initialization (i.e. just after init life cycle event) of : "+args1);
		return args0;
	}

	public Object postProcessBeforeInitialization(Object args0, String args1) {
		System.out.println("Processing bean instance before initialization (i.e. just before init life cycle event) of : "+args1);
		return args0;
	}
}
