package com.app.component;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component	
@ConditionalOnProperty(name = {"custom.condition.component1"}, havingValue="true")
public class ConditionalComponent1 {
	private String componentId = "compnt-01";
	private String componentName = "conditionalComponent1";
	
	public ConditionalComponent1() {
		super();
	}
	
	public ConditionalComponent1(String componentId, String componentName) {
		super();
		this.componentId = componentId;
		this.componentName = componentName;
	}

	public String getComponentId() {
		return componentId;
	}
	
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	
	public String getComponentName() {
		return componentName;
	}
	
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	@Override
	public String toString() {
		return "ConditionalComponent1 [componentId=" + componentId + ", componentName=" + componentName + "]";
	}
}
