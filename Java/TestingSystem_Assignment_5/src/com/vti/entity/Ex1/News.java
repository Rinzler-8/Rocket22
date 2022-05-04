package com.vti.entity.Ex1;

public class News implements INews {
	private int ID;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	int[] rate = new int[3];

	public News() {
		// do nothing
	}

	public News(String title, String publishDate, String author, String content, int[] rate) {
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rate = rate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

	@Override
	public void display() {
		System.out.println("News [title=" + title + ", publishDate=" + publishDate + ", author=" + author + ", content="
				+ content + ", averageRate=" + calAvgRate + "]");
	}

	float calAvgRate;

	@Override
	public float calculate() {
		calAvgRate = (rate[0] + rate[1] + rate[2]) / 3;
		return calAvgRate;
	}

}
