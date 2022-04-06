package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.TypeQuestion;

public class Question {
	public int QuestionID;
	public String QuestionContent;
	public CategoryQuestion CategoryID;
	public Account CreatorID;
	public TypeQuestion TypeID;
	public Date createDate;

}
