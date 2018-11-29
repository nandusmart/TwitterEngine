package com.hex.hackathon.TwitterReader.Beans;

public class EntityReturnBean {

	String EntityName;
	Number salience;
	public String getEntityName() {
		return EntityName;
	}
	public void setEntityName(String entityName) {
		EntityName = entityName;
	}
	public Number getSalience() {
		return salience;
	}
	public void setSalience(Number salience) {
		this.salience = salience;
	}
	public EntityReturnBean(String entityName, Number salience) {
		super();
		EntityName = entityName;
		this.salience = salience;
	}
	public EntityReturnBean() {
		super();
	}
	@Override
	public String toString() {
		return "EntityReturnBean [EntityName=" + EntityName + ", salience=" + salience + "]";
	}
	
}
