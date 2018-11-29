package com.hex.hackathon.TwitterReader.Beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class EntityBean implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	String type;
	HashMap<String, String> metadata = new HashMap<String, String>();
	Number salience;
	ArrayList<MentionBean> mentions = new ArrayList<MentionBean>();
	SentimentBean sentiment= new SentimentBean();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HashMap<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(HashMap<String, String> metadata) {
		this.metadata = metadata;
	}
	public Number getSalience() {
		return salience;
	}
	public void setSalience(Number salience) {
		this.salience = salience;
	}
	
	
	public SentimentBean getsentiment() {
		return sentiment;
	}
	public void setsentiment(SentimentBean sentiment) {
		this.sentiment = sentiment;
	}
	
	public EntityBean() {
		super();
	}

	public ArrayList<MentionBean> getMentions() {
		return mentions;
	}
	public void setMentions(ArrayList<MentionBean> mentions) {
		this.mentions = mentions;
	}
	@Override
	public String toString() {
		return "EntityBean [name=" + name + ", type=" + type + ", metadata=" + metadata + ", salience=" + salience
				+ ", mentions=" + mentions + ", sentiment=" + sentiment + "]";
	}
	public EntityBean(String name, String type, HashMap<String, String> metadata, Number salience,
			ArrayList<MentionBean> mentions, SentimentBean sentiment) {
		super();
		this.name = name;
		this.type = type;
		this.metadata = metadata;
		this.salience = salience;
		this.mentions = mentions;
		this.sentiment = sentiment;
	}
	
	
	
	
}
