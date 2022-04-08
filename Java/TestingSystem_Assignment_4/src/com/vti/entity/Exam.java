package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.CategoryQuestion;

public class Exam {
	private int id;
	private String Code;
	private String Title;
	private CategoryQuestion CategoryID;
	private int Duration;
	private Account CreatorID;
	private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public CategoryQuestion getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(CategoryQuestion categoryID) {
		CategoryID = categoryID;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public Account getCreatorID() {
		return CreatorID;
	}

	public void setCreatorID(Account creatorID) {
		CreatorID = creatorID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}