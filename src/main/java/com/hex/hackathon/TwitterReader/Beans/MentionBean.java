package com.hex.hackathon.TwitterReader.Beans;

import java.io.Serializable;

public class MentionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	TextBean text=new TextBean();
	String type;
	SentimentBean sentiment=new SentimentBean();
	public TextBean getText() {
		return text;
	}
	public void setText(TextBean text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public SentimentBean getSentiment() {
		return sentiment;
	}
	public void setSentiment(SentimentBean sentiment) {
		this.sentiment = sentiment;
	}
	@Override
	public String toString() {
		return "EntityMentionBean [textspan=" + text + ", type=" + type + ", sentiment=" + sentiment + "]";
	}
	public MentionBean(TextBean text, String type, SentimentBean sentiment) {
		super();
		this.text = text;
		this.type = type;
		this.sentiment = sentiment;
	}
	public MentionBean() {
		super();
	}
	
	
}
