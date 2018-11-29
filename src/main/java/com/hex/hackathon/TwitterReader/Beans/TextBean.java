package com.hex.hackathon.TwitterReader.Beans;

public class TextBean {

	String content;
	Number beginOffset;
	public TextBean() {
		super();
	}
	public TextBean(String content, Number beginOffset) {
		super();
		this.content = content;
		this.beginOffset = beginOffset;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Number getBeginOffset() {
		return beginOffset;
	}
	public void setBeginOffset(Number beginOffset) {
		this.beginOffset = beginOffset;
	}
	@Override
	public String toString() {
		return "TextSpanBean [content=" + content + ", beginOffset=" + beginOffset + "]";
	}
	
}
