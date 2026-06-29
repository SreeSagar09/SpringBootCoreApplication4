package com.app.component;

public class ConditionalComponent3 {
	private String componentId = "compnt-03";
	private String componentName = "conditionalComponent3";
	
	public ConditionalComponent3() {
		super();
	}
	
	public ConditionalComponent3(String componentId, String componentName) {
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
		return "ConditionalComponent3 [componentId=" + componentId + ", componentName=" + componentName + "]";
	}
}
