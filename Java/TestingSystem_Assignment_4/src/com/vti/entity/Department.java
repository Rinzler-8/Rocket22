package com.vti.entity;

public class Department {
	private int id;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department(String departmentName) {
		this.id = 0;
		this.departmentName = departmentName;
	}
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
}