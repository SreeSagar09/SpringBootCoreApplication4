package com.app.component;

public class ConditionalComponent5 {
	private String componentId = "compnt-05";
	private String componentName = "conditionalComponent5";
	
	public ConditionalComponent5() {
		super();
	}
	
	public ConditionalComponent5(String componentId, String componentName) {
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
		return "ConditionalComponent5 [componentId=" + componentId + ", componentName=" + componentName + "]";
	}
}
