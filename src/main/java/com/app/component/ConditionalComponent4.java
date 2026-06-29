package com.app.component;

public class ConditionalComponent4 {
	private String componentId = "compnt-04";
	private String componentName = "conditionalComponent4";
	
	public ConditionalComponent4() {
		super();
	}
	
	public ConditionalComponent4(String componentId, String componentName) {
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
		return "ConditionalComponent4 [componentId=" + componentId + ", componentName=" + componentName + "]";
	}
}
