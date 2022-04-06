package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;

public class Group {
	public int groupID;
	public String groupName;
	public int creatorID;
	public Date createDate;
	public Account accountID;
	public Account[] accounts;
}