package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;

public class Group {
	private int groupID;
	private String groupName;
	private int creatorID;
	private Date createDate;
	private Account accountID;
	private Account[] accounts;

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Account getAccountID() {
		return accountID;
	}

	public void setAccountID(Account accountID) {
		this.accountID = accountID;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
}