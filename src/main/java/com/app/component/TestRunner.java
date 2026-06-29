package com.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
	
	@Autowired(required = false)
	private ConditionalComponent1 conditionalComponent1;
	
	@Autowired(required = false)
	private ConditionalComponent2 conditionalComponent2;
	
	@Autowired(required = false)
	private ConditionalComponent3 conditionalComponent3;
	
	@Autowired(required = false)
	private ConditionalComponent4 conditionalComponent4;
	
	@Autowired(required = false)
	private ConditionalComponent5 conditionalComponent5;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(conditionalComponent1);
		System.out.println(conditionalComponent2);
		System.out.println(conditionalComponent3);
		System.out.println(conditionalComponent4);
		System.out.println(conditionalComponent5);
	}

}
