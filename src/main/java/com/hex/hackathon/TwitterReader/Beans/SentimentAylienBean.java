package com.hex.hackathon.TwitterReader.Beans;

public class SentimentAylienBean {

	
	private String polarity;
	private Integer count;
	public String getPolarity() {
		return polarity;
	}
	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "SentimentAylienBean [polarity=" + polarity + ", count=" + count + "]";
	}
	public SentimentAylienBean(String polarity, Integer count) {
		super();
		this.polarity = polarity;
		this.count = count;
	}
	public SentimentAylienBean() {
		super();
	}
	
	
}