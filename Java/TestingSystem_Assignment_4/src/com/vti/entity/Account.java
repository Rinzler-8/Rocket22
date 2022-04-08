package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Account {
	public int id;
	public String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getAccDepartment() {
		return accDepartment;
	}
	public void setAccDepartment(Department accDepartment) {
		this.accDepartment = accDepartment;
	}
	public Position getAccPosition() {
		return accPosition;
	}
	public void setAccPosition(Position accPosition) {
		this.accPosition = accPosition;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return Groups;
	}
	public void setGroups(Group[] groups) {
		Groups = groups;
	}
	public String userName;
	public String fullName;
	public Department accDepartment;
	public Position accPosition;
	public LocalDate createDate;
	public Group[] Groups;
	
	public Account(int id, String email, String userName, String fullName, Department accDepartment,
			Position accPosition, LocalDate createDate, Group[] groups) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.accDepartment = accDepartment;
		this.accPosition = accPosition;
		this.createDate = createDate;
		//this.fullName = String.join(" ", firstName, lastName);
		Groups = groups;
	}
	
}