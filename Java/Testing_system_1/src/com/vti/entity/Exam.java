package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.CategoryQuestion;

public class Exam {
	public int id;
	public String Code;
	public String Title;
	public CategoryQuestion CategoryID;
	public int Duration;
	public Account CreatorID;
	public Date createDate;

}