package com.hex.hackathon.TwitterReader.TwitterService;


public class Tweet {
 
	private String userId;
	private String userMessages;
	
	
	
	public Tweet(String userId, String userMessages) {
		super();
		this.userId = userId;
		this.userMessages = userMessages;
	}
	public Tweet() {
		super();
	}
	@Override
	public String toString() {
		return "{userId=" + userId + ", userMessages=" + userMessages + "}";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserMessages() {
		return userMessages;
	}
	public void setUserMessages(String userMessages) {
		this.userMessages = userMessages;
	}
	
	
}
