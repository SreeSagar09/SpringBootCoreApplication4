package com.app.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.component.ConditionalComponent3;
import com.app.component.ConditionalComponent4;
import com.app.component.ConditionalComponent5;

@Configuration
@ConditionalOnProperty(prefix = "custom", name = {"condition.component3", "condition.component4"}, havingValue = "true")
public class AppConfig {
	
	@Bean
	@ConditionalOnProperty(value = {"custom.condition.component3"}, havingValue = "true")
	public ConditionalComponent3 conditionalComponent3() {
		return new ConditionalComponent3();
	}
	
	@Bean
	@ConditionalOnProperty(value = {"custom.condition.component4"}, havingValue = "true")
	public ConditionalComponent4 conditionalComponent4() {
		return new ConditionalComponent4();
	}
	
	@Bean
	@ConditionalOnProperty(value = {"custom.condition.component5"}, havingValue = "true", matchIfMissing = true)
	public ConditionalComponent5 conditionalComponent5() {
		return new ConditionalComponent5();
	}
}
