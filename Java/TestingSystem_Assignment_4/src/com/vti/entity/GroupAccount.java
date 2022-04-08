package com.vti.entity;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Group;

public class GroupAccount {
	private Group GroupID;
	private Account AccountID;
	private Date JoinDate;

	public Group getGroupID() {
		return GroupID;
	}

	public void setGroupID(Group groupID) {
		GroupID = groupID;
	}

	public Account getAccountID() {
		return AccountID;
	}

	public void setAccountID(Account accountID) {
		AccountID = accountID;
	}

	public Date getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
}