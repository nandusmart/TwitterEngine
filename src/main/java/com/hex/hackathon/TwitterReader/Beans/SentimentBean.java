package com.hex.hackathon.TwitterReader.Beans;

import java.io.Serializable;

public class SentimentBean  implements Serializable  {

	private static final long serialVersionUID = 1L;
	Number magnitude;
	Number score;
	public Number getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(Number magnitude) {
		this.magnitude = magnitude;
	}
	public Number getScore() {
		return score;
	}
	public void setScore(Number score) {
		this.score = score;
	}
	public SentimentBean(Number magnitude, Number score) {
		super();
		this.magnitude = magnitude;
		this.score = score;
	}
	public SentimentBean() {
		super();
	}
	@Override
	public String toString() {
		return "SentimentBean [magnitude=" + magnitude + ", score=" + score + "]";
	}
	
	
}
