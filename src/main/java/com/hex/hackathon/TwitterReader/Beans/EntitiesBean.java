package com.hex.hackathon.TwitterReader.Beans;

import java.util.List;

public class EntitiesBean {

	private List<EntityBean> entities;

	public List<EntityBean> getEntities() {
		return entities;
	}

	public void setEntities(List<EntityBean> entities) {
		this.entities = entities;
	}

	public EntitiesBean(List<EntityBean> entities) {
		super();
		this.entities = entities;
	}

	public EntitiesBean() {
		super();
	}

	@Override
	public String toString() {
		return "EntityBeans [entities=" + entities + "]";
	}
	
}
