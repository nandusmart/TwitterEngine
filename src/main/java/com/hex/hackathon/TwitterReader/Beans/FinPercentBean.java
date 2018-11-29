package com.hex.hackathon.TwitterReader.Beans;

public class FinPercentBean {

	private Integer mergedTweetCounts=0;
	private Integer mergedFinTweetCounts=0;
	private Float finPercent=(float) 0.0;
	public Integer getMergedTweetCounts() {
		return mergedTweetCounts;
	}
	public void setMergedTweetCounts(Integer mergedTweetCounts) {
		this.mergedTweetCounts = mergedTweetCounts;
	}
	public Integer getMergedFinTweetCounts() {
		return mergedFinTweetCounts;
	}
	public void setMergedFinTweetCounts(Integer mergedFinTweetCounts) {
		this.mergedFinTweetCounts = mergedFinTweetCounts;
	}
	public Float getFinPercent() {
		return finPercent;
	}
	public void setFinPercent(Float finPercent) {
		this.finPercent = finPercent;
	}
	public FinPercentBean(Integer mergedTweetCounts, Integer mergedFinTweetCounts, Float finPercent) {
		super();
		this.mergedTweetCounts = mergedTweetCounts;
		this.mergedFinTweetCounts = mergedFinTweetCounts;
		this.finPercent = finPercent;
	}
	public FinPercentBean() {
		super();
	}
	@Override
	public String toString() {
		return "FinPercentBean [mergedTweetCounts=" + mergedTweetCounts + ", mergedFinTweetCounts="
				+ mergedFinTweetCounts + ", finPercent=" + finPercent + "]";
	}
	
	public void calcPercent()
	{
		finPercent=(float)((mergedFinTweetCounts*100)/mergedTweetCounts);
		System.out.println(finPercent);
	}
}