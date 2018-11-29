package com.hex.hackathon.TwitterReader.Beans;

import java.io.Serializable;

public class CategoryBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Number confidence;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getConfidence() {
		return confidence;
	}
	public void setConfidence(Number confidence) {
		this.confidence = confidence;
	}
	@Override
	public String toString() {
		return "CategoryBean [name=" + name + ", confidence=" + confidence + "]";
	}
	public CategoryBean(String name, Number confidence) {
		super();
		this.name = name;
		this.confidence = confidence;
	}
	public CategoryBean() {
		super();
	}
	
	
}