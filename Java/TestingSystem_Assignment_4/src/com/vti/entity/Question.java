package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.TypeQuestion;

public class Question {
	private int QuestionID;
	private String QuestionContent;
	private CategoryQuestion CategoryID;
	private Account CreatorID;
	private TypeQuestion TypeID;

	public int getQuestionID() {
		return QuestionID;
	}

	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}

	public String getQuestionContent() {
		return QuestionContent;
	}

	public void setQuestionContent(String questionContent) {
		QuestionContent = questionContent;
	}

	public CategoryQuestion getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(CategoryQuestion categoryID) {
		CategoryID = categoryID;
	}

	public Account getCreatorID() {
		return CreatorID;
	}

	public void setCreatorID(Account creatorID) {
		CreatorID = creatorID;
	}

	public TypeQuestion getTypeID() {
		return TypeID;
	}

	public void setTypeID(TypeQuestion typeID) {
		TypeID = typeID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	private Date createDate;

}
