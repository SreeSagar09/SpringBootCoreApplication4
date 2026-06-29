package com.app.component;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = {"custom.condition.component2"}, havingValue="true")
public class ConditionalComponent2 {
	private String componentId = "compnt-02";
	private String componentName = "conditionalComponent2";
	
	public ConditionalComponent2() {
		super();
	}
	
	public ConditionalComponent2(String componentId, String componentName) {
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
		return "ConditionalComponent2 [componentId=" + componentId + ", componentName=" + componentName + "]";
	}
}
