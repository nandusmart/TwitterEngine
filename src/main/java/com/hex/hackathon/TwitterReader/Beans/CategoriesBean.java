package com.hex.hackathon.TwitterReader.Beans;

import java.util.List;

public class CategoriesBean {
private List<CategoryBean> categories;

public List<CategoryBean> getCategories() {
	return categories;
}

public void setCategories(List<CategoryBean> categories) {
	this.categories = categories;
}

@Override
public String toString() {
	return "CategoriesBean [categories=" + categories + "]";
}

public CategoriesBean(List<CategoryBean> categories) {
	super();
	this.categories = categories;
}

public CategoriesBean() {
	super();
}


	
}